package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454900Hse {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C454900Hse() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454900Hse)) {
            return false;
        }
        C454900Hse c454900Hse = (C454900Hse) obj;
        return Intrinsics.LJFF(this.LIZ, c454900Hse.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454900Hse.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c454900Hse.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c454900Hse.LIZLLL) && Intrinsics.LJFF(this.LJ, c454900Hse.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedStickerRef(stickerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stickerUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", provider=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454900Hse(String str, String str2, Integer num, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        num = (i & 4) != 0 ? null : num;
        str3 = (i & 8) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = str3;
        this.LJ = null;
    }
}
