package X;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341190l0P extends AbstractC1341300l0a {
    public final String LIZ;
    public final Size LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341190l0P)) {
            return false;
        }
        C1341190l0P c1341190l0P = (C1341190l0P) obj;
        return Intrinsics.LJFF(this.LIZ, c1341190l0P.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1341190l0P.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1341190l0P.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Size size = this.LIZIZ;
        int iHashCode2 = (iHashCode + (size == null ? 0 : size.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sticker(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rawSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341190l0P(String str, Size size, Integer num) {
        this.LIZ = str;
        this.LIZIZ = size;
        this.LIZJ = num;
    }
}
