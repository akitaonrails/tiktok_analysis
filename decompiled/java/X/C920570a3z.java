package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920570a3z extends C920650a47 {
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final Map<String, Object> LJ;
    public final String LJFF;
    public final List<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920570a3z)) {
            return false;
        }
        C920570a3z c920570a3z = (C920570a3z) obj;
        return Intrinsics.LJFF(this.LIZIZ, c920570a3z.LIZIZ) && this.LIZJ == c920570a3z.LIZJ && this.LIZLLL == c920570a3z.LIZLLL && Intrinsics.LJFF(this.LJ, c920570a3z.LJ) && Intrinsics.LJFF(this.LJFF, c920570a3z.LJFF) && Intrinsics.LJFF(this.LJI, c920570a3z.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31;
        Map<String, Object> map = this.LJ;
        return ((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHLeaveParam(leaveSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", notSuggestToUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920570a3z(String str, long j, int i, int i2) {
        String str2;
        C13BV c13bv;
        int i3 = i;
        long j2 = (i2 & 2) != 0 ? 0L : j;
        i3 = (i2 & 4) != 0 ? 0 : i3;
        if ((i2 & 16) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(i3, j2, str, str2, c13bv, null);
    }

    public C920570a3z(int i, long j, String str, String str2, List list, Map map) {
        super(list);
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJFF = str2;
        this.LJI = list;
    }
}
