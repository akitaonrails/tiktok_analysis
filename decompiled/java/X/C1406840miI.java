package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406840miI extends AbstractC1406870miL {
    public final String LIZ = "product_detail";
    public final List<InterfaceC1338570kwB> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406840miI)) {
            return false;
        }
        C1406840miI c1406840miI = (C1406840miI) obj;
        return Intrinsics.LJFF(this.LIZ, c1406840miI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406840miI.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselMainSkcData(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", images=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406840miI(List list) {
        this.LIZIZ = list;
    }
}
