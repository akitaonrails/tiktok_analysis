package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575720r6g implements InterfaceC0148002o {
    public final C291001Au<C1575750r6j> LL;
    public final C1595550rcf LLILLJJLI;
    public final List<String> LLILLL;
    public final List<String> LLILZ;
    public final Pair<List<String>, List<String>> LLILZIL;

    public C1575720r6g() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1575720r6g)) {
            return false;
        }
        C1575720r6g c1575720r6g = (C1575720r6g) obj;
        return Intrinsics.LJFF(this.LL, c1575720r6g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1575720r6g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1575720r6g.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1575720r6g.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1575720r6g.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<String> list = this.LLILLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Pair<List<String>, List<String>> pair = this.LLILZIL;
        return iHashCode3 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSkylightToolbarIconBridgeState(prevListShowingState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayBean=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", prevStoryStatusObserveUids=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", curStoryStatusObserveUids=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", observeStoryStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1575720r6g(int i) {
        this(new C291001Au(new C1575750r6j(false, false, false, 7)), new C1595550rcf(0, 1023), null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1575720r6g(C291001Au<C1575750r6j> c291001Au, C1595550rcf c1595550rcf, List<String> list, List<String> list2, Pair<? extends List<String>, ? extends List<String>> pair) {
        this.LL = c291001Au;
        this.LLILLJJLI = c1595550rcf;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = pair;
    }

    public static C1575720r6g LIZ(C1575720r6g c1575720r6g, C291001Au c291001Au, C1595550rcf c1595550rcf, List list, List list2, Pair pair, int i) {
        Pair pair2 = pair;
        List list3 = list2;
        List list4 = list;
        C1595550rcf c1595550rcf2 = c1595550rcf;
        C291001Au c291001Au2 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au2 = c1575720r6g.LL;
        }
        if ((i & 2) != 0) {
            c1595550rcf2 = c1575720r6g.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list4 = c1575720r6g.LLILLL;
        }
        if ((i & 8) != 0) {
            list3 = c1575720r6g.LLILZ;
        }
        if ((i & 16) != 0) {
            pair2 = c1575720r6g.LLILZIL;
        }
        c1575720r6g.getClass();
        return new C1575720r6g(c291001Au2, c1595550rcf2, list4, list3, pair2);
    }
}
