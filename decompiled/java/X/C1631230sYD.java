package X;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import lnn.q;

/* JADX INFO: renamed from: X.0sYD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631230sYD implements InterfaceC1631220sYC, InterfaceC379610EuV {
    public final C1DRG LL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1631230sYD(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1631220sYC
    public final C1631240sYE LIZ(C19GS c19gs, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        q qVar = (q) this.LL.LJII(q.class, null);
        C1635820sfc c1635820sfc = (C1635820sfc) this.LL.LJII(C1635820sfc.class, null);
        C1631210sYB c1631210sYBLIZIZ = C1437860nWK.LIZIZ(c1635820sfc, qVar.C0(), qVar.w4(), (InterfaceC1635390sev) this.LL.LJII(InterfaceC1635390sev.class, null), (InterfaceC1625220sOW) this.LL.LJII(InterfaceC1625220sOW.class, null), this.LL);
        if (c1635820sfc.LJIIJ.LJII) {
            c1631210sYBLIZIZ.LLJILJILJ = new C1635650sfL(this.LL);
        }
        return c1631210sYBLIZIZ.LIZ(c19gs, frameLayout, lifecycleOwner, fragmentManager);
    }
}
