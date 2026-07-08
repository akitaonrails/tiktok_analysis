package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149010g0R implements InterfaceC0148002o {
    public final List<C1148910g0H> LL;
    public final List<C1148910g0H> LLILLJJLI;
    public final C1149120g0c LLILLL;

    public C1149010g0R() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149010g0R)) {
            return false;
        }
        C1149010g0R c1149010g0R = (C1149010g0R) obj;
        return Intrinsics.LJFF(this.LL, c1149010g0R.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1149010g0R.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1149010g0R.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftFavoritePanelState(favoriteList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", otherList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", favoriteMaxed=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1149010g0R(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, new C1149120g0c(false));
    }

    public C1149010g0R(List<C1148910g0H> list, List<C1148910g0H> list2, C1149120g0c c1149120g0c) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = c1149120g0c;
    }

    public static C1149010g0R LIZ(C1149010g0R c1149010g0R, List list, List list2, C1149120g0c c1149120g0c, int i) {
        if ((i & 1) != 0) {
            list = c1149010g0R.LL;
        }
        if ((i & 2) != 0) {
            list2 = c1149010g0R.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1149120g0c = c1149010g0R.LLILLL;
        }
        c1149010g0R.getClass();
        return new C1149010g0R(list, list2, c1149120g0c);
    }
}
