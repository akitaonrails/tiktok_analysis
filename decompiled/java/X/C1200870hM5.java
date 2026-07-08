package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200870hM5 extends AbstractC1200800hLy {
    public final String LIZLLL;
    public final String LJ;

    public C1200870hM5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200870hM5)) {
            return false;
        }
        C1200870hM5 c1200870hM5 = (C1200870hM5) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1200870hM5.LIZLLL) && Intrinsics.LJFF(this.LJ, c1200870hM5.LJ);
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StorePage(schema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pageKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1200800hLy
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1200800hLy
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    public C1200870hM5(int i) {
        super("aweme://roma_redirect/?spark_page=poi_claim_store_page", "store_page");
        this.LIZLLL = "aweme://roma_redirect/?spark_page=poi_claim_store_page";
        this.LJ = "store_page";
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZJ(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        c1200750hLt.LIZJ(new C1200830hM1(0), false);
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZLLL(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        c1200750hLt.LIZJ(new C1200850hM3(0), false);
    }
}
