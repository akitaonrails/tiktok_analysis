package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422800n82 implements InterfaceC1425040nBe {
    public final /* synthetic */ C1423960n9u LIZ;

    public C1422800n82(C1423960n9u c1423960n9u) {
        this.LIZ = c1423960n9u;
    }

    @Override // X.InterfaceC1425260nC0
    public final void F1(C1422540n7c c1422540n7c) {
        this.LIZ.LLLLIL().LJII.invoke(c1422540n7c);
    }

    @Override // X.InterfaceC1425040nBe
    public final void LIZ(boolean z) {
        this.LIZ.LLLLIL().LJFF.invoke(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1425260nC0
    public final void LIZIZ(C1419590n2r c1419590n2r) {
        this.LIZ.LLLLIL().LIZLLL.invoke(c1419590n2r);
    }

    @Override // X.InterfaceC1425260nC0
    public final void LIZJ(C1419590n2r c1419590n2r) {
        Function2<C1419590n2r, Integer, Unit> function2 = this.LIZ.LLLLIL().LJ;
        C21597919fl c21597919fl = this.LIZ.LLJJJJLIIL;
        if (c21597919fl != null) {
            function2.invoke(c1419590n2r, Integer.valueOf(c21597919fl.getCurrentItem()));
        }
    }

    @Override // X.InterfaceC1425260nC0
    public final void LIZLLL(int i, C1419590n2r c1419590n2r, long j) {
        this.LIZ.LLLLIL().LJI.invoke(Integer.valueOf(i), c1419590n2r, Long.valueOf(j));
    }
}
