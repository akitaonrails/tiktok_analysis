package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0fQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1126540fQC extends C1324720kZq {
    public String LLJILJIL;
    public InterfaceC1331000kjy LLJILJILJ;
    public InterfaceC1320850kTb LLJILLL;
    public boolean LLJJ;
    public AnimatedDrawable2 LLJJI;
    public boolean LLJJIII;

    public final void LIZLLL() {
        this.LLJJ = false;
        AnimatedDrawable2 animatedDrawable2 = this.LLJJI;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
    }

    public final void LJII() {
        this.LLJJ = true;
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LLJILLL == null) {
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJII(this.LLJILJIL);
            c1320810kTXLIZJ.LJIIJJI = false;
            c1320810kTXLIZJ.LJIIIIZZ = new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0fQD
                @Override // X.InterfaceC1320650kTH
                public final void LIZ(String str, Throwable th) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZIZ(String str) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZLLL(String str, Throwable th) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJFF(Object obj, String str) {
                }

                @Override // X.InterfaceC1320650kTH
                public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                    InterfaceC1330440kj4 interfaceC1330440kj42 = interfaceC1330440kj4;
                    if (this.LIZ.getUseWrapContent() && interfaceC1330440kj42 != null) {
                        C1126540fQC c1126540fQC = this.LIZ;
                        int width = interfaceC1330440kj42.getWidth();
                        int height = interfaceC1330440kj42.getHeight();
                        int measuredWidth = c1126540fQC.getMeasuredWidth();
                        int measuredHeight = c1126540fQC.getMeasuredHeight();
                        if (measuredHeight > measuredWidth) {
                            measuredWidth = (width / height) * measuredHeight;
                        } else {
                            measuredHeight = (height / width) * measuredWidth;
                        }
                        c1126540fQC.getLayoutParams().height = measuredHeight;
                        c1126540fQC.getLayoutParams().width = measuredWidth;
                        C786410Ut5.t6(c1126540fQC, c1126540fQC.getLayoutParams());
                    }
                    if (animatable instanceof AnimatedDrawable2) {
                        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                        animatedDrawable2.LJII(this.LIZ.LLJILJILJ);
                        if (this.LIZ.LLJJ) {
                            animatedDrawable2.start();
                        }
                        this.LIZ.setAnimatedDrawable2(animatedDrawable2);
                    }
                }
            };
            this.LLJILLL = c1320810kTXLIZJ.LIZ();
        }
        setController(this.LLJILLL);
    }

    public final boolean LJI() {
        AnimatedDrawable2 animatedDrawable2 = this.LLJJI;
        if (animatedDrawable2 != null) {
            return animatedDrawable2.isRunning();
        }
        return false;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final AnimatedDrawable2 getAnimatedDrawable2() {
        return this.LLJJI;
    }

    public final InterfaceC1320850kTb getDraweeController() {
        return this.LLJILLL;
    }

    public final boolean getUseWrapContent() {
        return this.LLJJIII;
    }

    public C1126540fQC(Context context) {
        super(context);
        this.LLJILJIL = "";
        this.LLJJ = true;
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setAnimatedDrawable2(AnimatedDrawable2 animatedDrawable2) {
        this.LLJJI = animatedDrawable2;
    }

    public final void setAutoPlay(boolean z) {
        this.LLJJ = z;
    }

    public final void setDraweeController(InterfaceC1320850kTb interfaceC1320850kTb) {
        this.LLJILLL = interfaceC1320850kTb;
    }

    public final void setUseWrapContent(boolean z) {
        this.LLJJIII = z;
    }

    public C1126540fQC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJIL = "";
        this.LLJJ = true;
    }
}
