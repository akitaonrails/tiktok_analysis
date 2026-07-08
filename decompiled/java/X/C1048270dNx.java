package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048270dNx {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1048270dNx)) {
            return false;
        }
        C1048270dNx c1048270dNx = (C1048270dNx) obj;
        return Intrinsics.LJFF(this.LIZ, c1048270dNx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1048270dNx.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisDramaInfo(albumId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", episodeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1048270dNx(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
