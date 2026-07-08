package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636340sgS implements InterfaceC1637250shv, InterfaceC379610EuV {
    public final C1DRG LL;
    public final LifecycleOwner LLILLJJLI;
    public final Function1<C1635820sfc, Unit> LLILLL = null;

    @Override // X.InterfaceC1637250shv
    public final C1641930spT create() {
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) this.LL.LJII(InterfaceC1625000sOA.class, null);
        C1DRG c1drg = this.LL;
        C1631210sYB c1631210sYB = new C1631210sYB(interfaceC1625000sOA.C0(), interfaceC1625000sOA.w4(), this.LL, C1449080noQ.LIZ, C1636460sge.LIZ, C1635710sfR.LIZ);
        Function1<C1635820sfc, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            c1631210sYB.LLJJI = function1;
        }
        return new C1641930spT(c1drg, c1631210sYB, new C1636370sgV(this.LLILLJJLI), new InterfaceC1622330sJr() { // from class: X.0sgb
            @Override // X.InterfaceC1622330sJr
            public final void onShow(boolean z) {
            }
        }, new C1636420sga());
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1636340sgS(C1DRG c1drg, LifecycleOwner lifecycleOwner) {
        this.LL = c1drg;
        this.LLILLJJLI = lifecycleOwner;
    }
}
