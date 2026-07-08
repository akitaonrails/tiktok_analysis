package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512250K7b {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;

    public C512250K7b() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512250K7b)) {
            return false;
        }
        C512250K7b c512250K7b = (C512250K7b) obj;
        return Intrinsics.LJFF(this.LIZ, c512250K7b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c512250K7b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c512250K7b.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c512250K7b.LIZLLL) && Intrinsics.LJFF(this.LJ, c512250K7b.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationConfig(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFromMerge=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512250K7b(String str, String str2, String str3, int i) {
        Map<String, String> mapLJ;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = mapLJ;
    }
}
