package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845560XFa extends C0XFZ {
    public final C0XFN LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;

    public C845560XFa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C845560XFa)) {
            return false;
        }
        C845560XFa c845560XFa = (C845560XFa) obj;
        return this.LIZ == c845560XFa.LIZ && this.LIZIZ == c845560XFa.LIZIZ && Intrinsics.LJFF(this.LIZJ, c845560XFa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c845560XFa.LIZLLL) && Intrinsics.LJFF(this.LJ, c845560XFa.LJ) && Intrinsics.LJFF(this.LJFF, c845560XFa.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Map<String, Object> map = this.LJFF;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authAppId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authAppVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C845560XFa(C0XFN c0xfn, int i, String str, String str2, String str3, Map map, int i2) {
        i = (i2 & 2) != 0 ? -1 : i;
        str = (i2 & 4) != 0 ? "" : str;
        str2 = (i2 & 8) != 0 ? "" : str2;
        str3 = (i2 & 16) != 0 ? "" : str3;
        map = (i2 & 32) != 0 ? null : map;
        this.LIZ = c0xfn;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = map;
    }
}
