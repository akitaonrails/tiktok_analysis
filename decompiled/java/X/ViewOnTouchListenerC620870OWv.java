package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnTouchListenerC620870OWv implements View.OnTouchListener {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function1<Float, Unit> LLILZLL;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public float LLJIJIL = 1.0f;
    public float LLJILLL = -1.0f;
    public final ARunnableS109S0100000_9 LLJJIJIL = new ARunnableS109S0100000_9(this, 190);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        this.LLJIJIL = view.getResources().getDisplayMetrics().density;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    this.LLJJ = motionEvent.getRawX();
                    this.LLJJI = motionEvent.getRawY();
                    this.LLJJIJIIJIL++;
                    if (this.LLJJIII || this.LLJJIJI || !this.LLJILJIL) {
                        return true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("move#");
                    sbLIZ.append(this.LLJJIJIIJIL);
                    LIZ(motionEvent.getRawX(), motionEvent.getRawY(), view, C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            }
            this.LLIZ.removeCallbacks(this.LLJJIJIL);
            view.setPressed(false);
            if (!this.LLJJIII && !this.LLJJIJI) {
                if (motionEvent.getActionMasked() == 3) {
                    if (this.LLJILJIL && this.LLIZLLLIL) {
                        this.LLIZLLLIL = false;
                        this.LLILLL.invoke();
                    }
                    return true;
                }
                if (!this.LLJILJIL) {
                    this.LL.invoke();
                    return true;
                }
                if (this.LLIZLLLIL) {
                    this.LLIZLLLIL = false;
                    if (this.LLJILLL * (motionEvent.getRawX() - this.LLJ) >= this.LLJILJILJ) {
                        this.LLJJIJI = true;
                        this.LLILZIL.invoke();
                        return true;
                    }
                    this.LLILLL.invoke();
                }
            }
            return true;
        }
        this.LLJ = motionEvent.getRawX();
        this.LLJI = motionEvent.getRawY();
        this.LLJJ = motionEvent.getRawX();
        this.LLJJI = motionEvent.getRawY();
        this.LLJILJIL = false;
        this.LLIZLLLIL = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = 0;
        this.LLJILJILJ = view.getResources().getDisplayMetrics().widthPixels / 2.0f;
        if (view.getLayoutDirection() == 1) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        this.LLJILLL = f;
        C786410Ut5.LJLIIL(300L, this.LLIZ, this.LLJJIJIL);
        view.setPressed(true);
        return true;
    }

    public final void LIZ(float f, float f2, View view, String str) {
        float f3 = (-(f2 - this.LLJI)) / this.LLJIJIL;
        if (f3 > 80.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MicGesture] ");
            sbLIZ.append(str);
            sbLIZ.append(" TRIGGER LOCK slideUpDp=");
            sbLIZ.append(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1)));
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            this.LLIZ.removeCallbacks(this.LLJJIJIL);
            this.LLIZLLLIL = false;
            this.LLJJIII = true;
            if (view != null) {
                view.setPressed(false);
            }
            this.LLILZ.invoke();
            return;
        }
        float f4 = this.LLJILLL * (f - this.LLJ);
        float f5 = this.LLJILJILJ;
        float fLIZLLL = 0.0f;
        if (f5 > 0.0f) {
            fLIZLLL = C13LZ.LIZLLL(f4 / f5, 0.0f, 1.0f);
        }
        this.LLILZLL.invoke(Float.valueOf(fLIZLLL));
    }

    public ViewOnTouchListenerC620870OWv(AwS553S0100000_9 awS553S0100000_9, AwS553S0100000_9 awS553S0100000_92, AwS553S0100000_9 awS553S0100000_93, AwS553S0100000_9 awS553S0100000_94, AwS553S0100000_9 awS553S0100000_95, AwS588S0100000_9 awS588S0100000_9) {
        this.LL = awS553S0100000_9;
        this.LLILLJJLI = awS553S0100000_92;
        this.LLILLL = awS553S0100000_93;
        this.LLILZ = awS553S0100000_94;
        this.LLILZIL = awS553S0100000_95;
        this.LLILZLL = awS588S0100000_9;
    }
}
