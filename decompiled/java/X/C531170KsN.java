package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531170KsN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C531170KsN() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531170KsN)) {
            return false;
        }
        C531170KsN c531170KsN = (C531170KsN) obj;
        return Intrinsics.LJFF(this.LIZ, c531170KsN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c531170KsN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c531170KsN.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewMobContext(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531170KsN(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
