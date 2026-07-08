package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406850miJ extends AbstractC1406870miL {
    public final String LIZ = "product_detail";
    public final String LIZIZ;
    public final List<InterfaceC1338570kwB> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406850miJ)) {
            return false;
        }
        C1406850miJ c1406850miJ = (C1406850miJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1406850miJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406850miJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1406850miJ.LIZJ) && this.LIZLLL == c1406850miJ.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselDataReady(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedElementId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", carouselImages=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSkc=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406850miJ(String str, List list, boolean z) {
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = z;
    }
}
