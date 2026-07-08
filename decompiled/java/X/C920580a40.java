package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920580a40 extends C920650a47 {
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final Map<String, Object> LJI;
    public final String LJII;
    public final List<String> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920580a40)) {
            return false;
        }
        C920580a40 c920580a40 = (C920580a40) obj;
        return this.LIZIZ == c920580a40.LIZIZ && this.LIZJ == c920580a40.LIZJ && this.LIZLLL == c920580a40.LIZLLL && this.LJ == c920580a40.LJ && this.LJFF == c920580a40.LJFF && Intrinsics.LJFF(this.LJI, c920580a40.LJI) && Intrinsics.LJFF(this.LJII, c920580a40.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c920580a40.LJIIIIZZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
        Map<String, Object> map = this.LJI;
        return ((((iY2 + (map == null ? 0 : map.hashCode())) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinCancelParam(joinType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", timeOutInterval=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920580a40(int i, long j, long j2, long j3, Map map, String str, List list, int i2) {
        long j4;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            j4 = -1;
        } else {
            j4 = 0;
        }
        map = (i2 & 32) != 0 ? null : map;
        str = (i2 & 64) != 0 ? "" : str;
        list = (i2 & 128) != 0 ? C13BV.INSTANCE : list;
        super(list);
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = map;
        this.LJII = str;
        this.LJIIIIZZ = list;
    }
}
