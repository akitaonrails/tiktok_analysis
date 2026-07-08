package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406860miK extends AbstractC1406870miL {
    public final String LIZ = "product_detail";
    public final String LIZIZ;
    public final List<InterfaceC1338570kwB> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406860miK)) {
            return false;
        }
        C1406860miK c1406860miK = (C1406860miK) obj;
        return Intrinsics.LJFF(this.LIZ, c1406860miK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406860miK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1406860miK.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselScroll(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedElementId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", carouselImages=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406860miK(String str, List list) {
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
