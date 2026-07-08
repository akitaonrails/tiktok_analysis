package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122390fJV {
    public final boolean LIZ;
    public final List<EnumC1122660fJw> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122390fJV)) {
            return false;
        }
        C1122390fJV c1122390fJV = (C1122390fJV) obj;
        return this.LIZ == c1122390fJV.LIZ && Intrinsics.LJFF(this.LIZIZ, c1122390fJV.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewSkuOrder(hasPreviewData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1122390fJV(boolean z, List<? extends EnumC1122660fJw> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
