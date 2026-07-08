package X;

import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19395810uS implements InterfaceC1069860dwm {
    public boolean LLILLJJLI;
    public InterfaceC19396010uU LLILLL;
    public InterfaceC19395910uT LLILZ;
    public int LLILZLL;
    public int LL = 1;
    public WeakReference<TuxSheet> LLILZIL = new WeakReference<>(null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(474));

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.InterfaceC1069860dwm
    public final TuxSheet tz() {
        return this.LLILZIL.get();
    }

    @Override // X.InterfaceC1069860dwm
    public final void G2(int i) {
        if (i == 4 && this.LL == 0 && !this.LLILLJJLI) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(((Number) this.LLIZ.getValue()).longValue());
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 74));
            valueAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 33));
            valueAnimatorOfFloat.start();
        }
        InterfaceC19396010uU interfaceC19396010uU = this.LLILLL;
        if (interfaceC19396010uU != null) {
            interfaceC19396010uU.LIZ(this.LL, i);
        }
        this.LL = i;
    }

    @Override // X.InterfaceC1069860dwm
    public final void QH(View view) {
        C786410Ut5.x3(view.getViewTreeObserver(), new C12YX(this, view, 3));
    }

    @Override // X.InterfaceC1069860dwm
    public final void w2(TuxSheet tuxSheet) {
        this.LLILZIL = new WeakReference<>(tuxSheet);
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
            InterfaceC19395910uT interfaceC19395910uT = this.LLILZ;
            if (interfaceC19395910uT != null) {
                interfaceC19395910uT.LLJLL(iLIZIZ, this.LLILZLL);
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
            InterfaceC19396010uU interfaceC19396010uU = this.LLILLL;
            if (interfaceC19396010uU != null) {
                interfaceC19396010uU.LIZ(this.LL, iIntValue);
            }
            this.LL = iIntValue;
        }
    }

    @Override // X.InterfaceC1069860dwm
    public final void WO(InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        this.LLILLL = interfaceC19396010uU;
        this.LLILZ = interfaceC19395910uT;
    }
}
