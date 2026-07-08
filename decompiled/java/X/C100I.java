package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.100I, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100I {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final String LIZ;
    public final C100L LIZIZ;
    public final C100M LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C100K LJFF;
    public final Map<String, Object> LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100I)) {
            return false;
        }
        C100I c100i = (C100I) obj;
        return Intrinsics.LJFF(this.LIZ, c100i.LIZ) && this.LIZIZ == c100i.LIZIZ && this.LIZJ == c100i.LIZJ && Intrinsics.LJFF(this.LIZLLL, c100i.LIZLLL) && this.LJ == c100i.LJ && this.LJFF == c100i.LJFF && Intrinsics.LJFF(this.LJI, c100i.LJI) && this.LJII == c100i.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        Map<String, Object> map = this.LJI;
        return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationToolItem(signal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paramsType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", persistent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scope=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", triggerSpec=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", dryRun=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C100I(String str, C100L c100l, C100M c100m, String str2, boolean z, C100K c100k, Map<String, ? extends Object> map, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = c100l;
        this.LIZJ = c100m;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = c100k;
        this.LJI = map;
        this.LJII = z2;
    }
}
