package X;

import Y.ALAdapterS12S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: X.0deS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058500deS implements InterfaceC1058150ddt {
    public boolean LLILLJJLI;
    public InterfaceC1350190lEv LLILLL;
    public InterfaceC679410Qkt LLILZ;
    public TuxSheet LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public int LLJI;
    public float LLJIJIL;
    public int LL = 1;
    public float LLJ = 1.0f;

    public final C16BC<?> LIZ() {
        Object c098200Yq;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI;
        try {
            TuxSheet tuxSheet = this.LLILZIL;
            if (tuxSheet == null || (childFragmentManager = tuxSheet.getChildFragmentManager()) == null || (fragmentLJJJJZI = childFragmentManager.LJJJJZI("sheet_content_fragment")) == null) {
                c098200Yq = null;
            } else {
                String str = TuxSheet._pnsPageId;
                c098200Yq = C1391190mJ3.LJIIIZ(fragmentLJJJJZI);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C16BC) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public final void G2(int i) {
        int i2;
        if (i == 4 && ((i2 = this.LL) == 3 || i2 == 0)) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 38));
            valueAnimatorOfFloat.addListener(new ALAdapterS12S0100000_16(this, 14));
            valueAnimatorOfFloat.start();
        }
        InterfaceC1350190lEv interfaceC1350190lEv = this.LLILLL;
        if (interfaceC1350190lEv != null) {
            interfaceC1350190lEv.LIZ(this.LL, i);
        }
        this.LL = i;
    }

    public final void sy(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC1077400e8w viewTreeObserverOnGlobalLayoutListenerC1077400e8w = new ViewTreeObserverOnGlobalLayoutListenerC1077400e8w(this, view, 1);
        C786410Ut5.x3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077400e8w);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1077300e8m(view, viewTreeObserverOnGlobalLayoutListenerC1077400e8w, 2));
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        float f2;
        int iLIZIZ;
        int i;
        InterfaceC679410Qkt interfaceC679410Qkt;
        float f3;
        BottomSheetBehavior bottomSheetBehavior;
        Integer numValueOf;
        TuxSheetBehavior tuxSheetBehavior;
        if (this.LLILLJJLI && f < 0.0f && f < this.LLIZLLLIL && this.LL != 4) {
            G2(4);
        }
        this.LLIZLLLIL = f;
        if (this.LLILZLL == 0) {
            View view = tuxSheet.getView();
            if (view != null) {
                this.LLILZLL = view.getMeasuredHeight();
            } else {
                return;
            }
        }
        C16BC<?> c16bcLIZ = LIZ();
        if (this.LLIZ == 0) {
            if (C299110Bnx.LIZ()) {
                if ((c16bcLIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLIZ) != null) {
                    numValueOf = Integer.valueOf(tuxSheetBehavior.getPeekHeight());
                } else {
                    return;
                }
            } else if ((c16bcLIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLIZ) != null) {
                numValueOf = Integer.valueOf(bottomSheetBehavior.getPeekHeight());
            } else {
                return;
            }
            if (numValueOf != null) {
                this.LLIZ = numValueOf.intValue();
            } else {
                return;
            }
        }
        if (this.LLJI == 0) {
            this.LLJI = C814420VxA.LIZIZ(this.LLILZLL * this.LLJ);
        }
        if (this.LLJIJIL < 0.001f) {
            int i2 = this.LLILZLL;
            int i3 = this.LLIZ;
            if (C294480BgU.LIZ() >= 3) {
                f3 = i3;
            } else {
                f3 = i2 * 0.73f;
            }
            this.LLJIJIL = f3;
        }
        if (f >= 0.0f) {
            f2 = this.LLIZ + ((this.LLILZLL - r2) * f);
        } else {
            f2 = (1 + f) * this.LLIZ;
        }
        if (Math.abs(f2) <= Float.MAX_VALUE && (iLIZIZ = C814420VxA.LIZIZ(f2)) <= (i = this.LLJI) && (interfaceC679410Qkt = this.LLILZ) != null) {
            if (iLIZIZ > i) {
                iLIZIZ = i;
            }
            interfaceC679410Qkt.LLJLL(iLIZIZ, this.LLJIJIL);
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
