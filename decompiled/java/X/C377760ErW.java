package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ErW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377760ErW {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;

    public C377760ErW() {
        this(0, null, 0, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377760ErW)) {
            return false;
        }
        C377760ErW c377760ErW = (C377760ErW) obj;
        return Intrinsics.LJFF(this.LIZ, c377760ErW.LIZ) && this.LIZIZ == c377760ErW.LIZIZ && Intrinsics.LJFF(this.LIZJ, c377760ErW.LIZJ) && this.LIZLLL == c377760ErW.LIZLLL && Intrinsics.LJFF(this.LJ, c377760ErW.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerateResultError(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorQuota=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377760ErW(int i, String str, int i2, String str2, Map map, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? 0 : i;
        str2 = (i3 & 4) != 0 ? "" : str2;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        map = (i3 & 16) != 0 ? new LinkedHashMap() : map;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = map;
    }
}
