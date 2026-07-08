package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263210iyd {
    public final boolean LIZ;
    public final C1263190iyb LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final List<C1261860iwS> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1263210iyd() {
        this(null, false, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263210iyd)) {
            return false;
        }
        C1263210iyd c1263210iyd = (C1263210iyd) obj;
        return this.LIZ == c1263210iyd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1263210iyd.LIZIZ) && this.LIZJ == c1263210iyd.LIZJ && this.LIZLLL == c1263210iyd.LIZLLL && Intrinsics.LJFF(this.LJ, c1263210iyd.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MafSourceState(isLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", data=");
        List<C1261860iwS> list = this.LJ;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1263210iyd(C1263190iyb c1263190iyb, boolean z, List list, int i) {
        this(false, (i & 2) != 0 ? null : c1263190iyb, (i & 4) != 0 ? true : z, 0, (i & 16) == 0 ? list : null);
    }

    public C1263210iyd(boolean z, C1263190iyb c1263190iyb, boolean z2, int i, List<C1261860iwS> list) {
        this.LIZ = z;
        this.LIZIZ = c1263190iyb;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = list;
    }

    public static C1263210iyd LIZ(C1263210iyd c1263210iyd, boolean z, C1263190iyb c1263190iyb, List list, int i) {
        boolean z2;
        int i2;
        List list2 = list;
        C1263190iyb c1263190iyb2 = c1263190iyb;
        boolean z3 = z;
        if ((i & 1) != 0) {
            z3 = c1263210iyd.LIZ;
        }
        if ((i & 2) != 0) {
            c1263190iyb2 = c1263210iyd.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c1263210iyd.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            i2 = c1263210iyd.LIZLLL;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            list2 = c1263210iyd.LJ;
        }
        c1263210iyd.getClass();
        return new C1263210iyd(z3, c1263190iyb2, z2, i2, list2);
    }
}
