package X;

import Y.ARunnableS132S0100000_32;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19EA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EA implements C19CP {
    public final C680740Qn2 LIZ;
    public final C671260QUq LIZIZ;
    public final InterfaceC214902198i LIZJ;
    public C19EB LIZLLL;
    public View LJ;
    public ARunnableS132S0100000_32 LJFF;
    public View LJI;

    @Override // X.C19CP
    public final void LIZIZ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJ(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJFF(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJIIJ(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJIJI(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJIL(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJII(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJIIJZLJL(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJIJ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJJIJIL(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJIJL(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJIJLIJ(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJJIL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJJJJI(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJJJJ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJJJJJL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJJJJLI(InterfaceC214902198i interfaceC214902198i) {
    }

    @Override // X.C19CP
    public final void LJJJJLL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
    }

    @Override // X.C19CP
    public final void LJJJJZI(InterfaceC214902198i interfaceC214902198i) {
    }

    public final void LIZJ() {
        C19EB c19eb = this.LIZLLL;
        if (c19eb == null) {
            return;
        }
        this.LIZLLL = null;
        View view = this.LJ;
        this.LJ = null;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            C786410Ut5.B3(view.getViewTreeObserver(), c19eb);
        }
    }

    public final void LIZ(boolean z) {
        Fragment fragment;
        View view;
        if (z) {
            LIZJ();
            ARunnableS132S0100000_32 aRunnableS132S0100000_32 = this.LJFF;
            if (aRunnableS132S0100000_32 != null) {
                View view2 = this.LJI;
                if (view2 != null) {
                    HandlerHook.viewRemoveCallbacks(view2, aRunnableS132S0100000_32);
                }
                this.LJFF = null;
                this.LJI = null;
            }
        } else if (this.LIZIZ.LJ > 0) {
            Object obj = this.LIZJ;
            if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && (view = fragment.getView()) != null) {
                ARunnableS132S0100000_32 aRunnableS132S0100000_322 = new ARunnableS132S0100000_32(this, 36);
                this.LJFF = aRunnableS132S0100000_322;
                this.LJI = view;
                HandlerHook.viewPostDelay(view, aRunnableS132S0100000_322, this.LIZIZ.LJ);
                return;
            }
        }
        this.LIZ.LIZ();
        this.LIZJ.rm(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.19EB, android.view.ViewTreeObserver$OnDrawListener] */
    @Override // X.C19CP
    public final void LJI(InterfaceC214902198i interfaceC214902198i) {
        Fragment fragment;
        final View view;
        if (this.LIZIZ.LIZLLL == EnumC671270QUr.ON_TO_FRAGMENT_FIRST_DRAW) {
            if ((interfaceC214902198i instanceof Fragment) && (fragment = (Fragment) interfaceC214902198i) != null && (view = fragment.getView()) != null) {
                ?? r1 = new ViewTreeObserver.OnDrawListener() { // from class: X.19EB
                    public boolean LL;

                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public final void onDraw() {
                        if (this.LL) {
                            return;
                        }
                        this.LL = true;
                        HandlerHook.viewPost(view, new ARunnableS132S0100000_32(this, 37));
                    }
                };
                this.LIZLLL = r1;
                this.LJ = view;
                C786410Ut5.w3(view.getViewTreeObserver(), r1);
                return;
            }
            LIZ(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19CP
    public final void LJIILL(InterfaceC214902198i interfaceC214902198i) {
        Fragment fragment;
        View view;
        if (this.LIZIZ.LIZLLL == EnumC671270QUr.ON_TO_FRAGMENT_RESUMED) {
            if ((interfaceC214902198i instanceof Fragment) && (fragment = (Fragment) interfaceC214902198i) != null && (view = fragment.getView()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[lifecycle] onResume → schedule dismiss, delayMs=");
                sbLIZ.append(this.LIZIZ.LJ);
                C2188811AlT.LIZIZ(sbLIZ);
                HandlerHook.viewPost(view, new ARunnableS132S0100000_32(this, 38));
                return;
            }
            LIZ(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19CP
    public final void LJIJ(InterfaceC214902198i interfaceC214902198i) {
        Fragment fragment;
        View view;
        if (this.LIZIZ.LIZLLL == EnumC671270QUr.ON_TO_FRAGMENT_STARTED) {
            if ((interfaceC214902198i instanceof Fragment) && (fragment = (Fragment) interfaceC214902198i) != null && (view = fragment.getView()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[lifecycle] onStart → schedule dismiss, delayMs=");
                sbLIZ.append(this.LIZIZ.LJ);
                C2188811AlT.LIZIZ(sbLIZ);
                HandlerHook.viewPost(view, new ARunnableS132S0100000_32(this, 39));
                return;
            }
            LIZ(false);
        }
    }

    @Override // X.C19CP
    public final void LJJIL(InterfaceC214902198i interfaceC214902198i) {
        LIZ(true);
    }

    public C19EA(C680740Qn2 c680740Qn2, C671260QUq c671260QUq, InterfaceC214902198i interfaceC214902198i) {
        this.LIZ = c680740Qn2;
        this.LIZIZ = c671260QUq;
        this.LIZJ = interfaceC214902198i;
    }
}
