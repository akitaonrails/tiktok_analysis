package X;

import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19396110uV implements InterfaceC20636815p8 {
    public boolean LLILLJJLI;
    public InterfaceC1350190lEv LLILLL;
    public InterfaceC679410Qkt LLILZ;
    public int LLILZLL;
    public int LL = 1;
    public WeakReference<TuxSheet> LLILZIL = new WeakReference<>(null);

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.InterfaceC20636815p8
    public final void G2(int i) {
        if (i == 4 && this.LL == 0 && !this.LLILLJJLI) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 67));
            valueAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 30));
            valueAnimatorOfFloat.start();
        }
        InterfaceC1350190lEv interfaceC1350190lEv = this.LLILLL;
        if (interfaceC1350190lEv != null) {
            interfaceC1350190lEv.LIZ(this.LL, i);
        }
        this.LL = i;
    }

    @Override // X.InterfaceC20636815p8
    public final void sy(View view) {
        C12YX c12yx = new C12YX(this, view, 0);
        C786410Ut5.x3(view.getViewTreeObserver(), c12yx);
        view.addOnAttachStateChangeListener(new C12YN(view, c12yx, 4));
    }

    @Override // X.InterfaceC20636815p8
    public final void w2(TuxSheet tuxSheet) {
        this.LLILZIL = new WeakReference<>(tuxSheet);
    }

    @Override // X.InterfaceC20636815p8
    public final void Bq(InterfaceC1350190lEv interfaceC1350190lEv, InterfaceC679410Qkt interfaceC679410Qkt) {
        this.LLILLL = interfaceC1350190lEv;
        this.LLILZ = interfaceC679410Qkt;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        if (this.LLILZLL == 0) {
            View view = tuxSheet.getView();
            if (view != null) {
                this.LLILZLL = view.getMeasuredHeight();
            } else {
                return;
            }
        }
        float f2 = this.LLILZLL * f;
        if (Math.abs(f2) <= Float.MAX_VALUE) {
            int iLIZIZ = this.LLILZLL + C814420VxA.LIZIZ(f2);
            InterfaceC679410Qkt interfaceC679410Qkt = this.LLILZ;
            if (interfaceC679410Qkt != null) {
                interfaceC679410Qkt.LLJLL(iLIZIZ, this.LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        boolean z = false;
        Integer num = 0;
        if (i == 2) {
            z = true;
        }
        this.LLILLJJLI = z;
        if (i != 1) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    num = 1;
                } else {
                    return;
                }
            }
        } else {
            num = 2;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            InterfaceC1350190lEv interfaceC1350190lEv = this.LLILLL;
            if (interfaceC1350190lEv != null) {
                interfaceC1350190lEv.LIZ(this.LL, iIntValue);
            }
            this.LL = iIntValue;
        }
    }
}
