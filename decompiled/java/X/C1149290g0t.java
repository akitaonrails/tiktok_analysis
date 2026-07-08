package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.gift.LiveComboLongPressTimeGap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149290g0t {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public long LJ;
    public InterfaceC420801kM LJFF;
    public boolean LJI = true;
    public boolean LJII;

    public final void LIZ() {
        this.LJII = false;
        InterfaceC420801kM interfaceC420801kM = this.LJFF;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C20441214yg.LIZIZ("GiftPanelTouchController", "cancel ");
    }

    public final boolean LIZIZ(MotionEvent motionEvent, final View view) {
        if (view == null) {
            LIZ();
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LJ = 0L;
            this.LJI = false;
            final int value = LiveComboLongPressTimeGap.INSTANCE.getValue();
            long j = value;
            C11NZ.LJJJJJL(j, j, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0g0u
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    this.LL.LIZ();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    this.LL.LIZ();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(Long l) {
                    long jLongValue = l.longValue();
                    this.LL.LJ += (long) value;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("time = ");
                    sbLIZ.append(this.LL.LJ);
                    sbLIZ.append(".along = ");
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(", view = ");
                    sbLIZ.append(view);
                    C20441214yg.LJ("MusicPress", C2188811AlT.LIZIZ(sbLIZ));
                    C1149290g0t c1149290g0t = this.LL;
                    if (c1149290g0t.LJ >= 500) {
                        if (!c1149290g0t.LJII) {
                            c1149290g0t.LJII = true;
                            c1149290g0t.LIZIZ.invoke();
                            C20441214yg.LIZIZ("GiftPanelTouchController", "longClickAction: ");
                        } else {
                            c1149290g0t.LIZJ.invoke();
                            C20441214yg.LIZIZ("GiftPanelTouchController", "longClickContinue: ");
                        }
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    this.LL.LJFF = interfaceC420801kM;
                }
            });
            return true;
        }
        if (this.LJI) {
            return false;
        }
        if (motionEvent.getAction() == 2 && this.LJ >= 500) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x < 0.0f || x > view.getWidth() || y < 0.0f || y > view.getHeight()) {
                this.LJI = true;
                this.LIZLLL.invoke();
                LIZ();
                C20441214yg.LIZIZ("GiftPanelTouchController", "longClickFinishAction: ");
                return true;
            }
        }
        if (motionEvent.getAction() == 1) {
            if (this.LJ < 500) {
                this.LJI = true;
                this.LIZ.invoke();
                LIZ();
                C20441214yg.LIZIZ("GiftPanelTouchController", "singleClick: ");
                return true;
            }
            this.LJI = true;
            this.LIZLLL.invoke();
            LIZ();
            C20441214yg.LIZIZ("GiftPanelTouchController", "longClickFinishAction: ");
            return true;
        }
        if (motionEvent.getAction() == 3) {
            LIZ();
        }
        return false;
    }

    public C1149290g0t(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
    }
}
