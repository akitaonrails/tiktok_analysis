package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ugZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713290ugZ implements InterfaceC0148002o {
    public final C1263870izh LL;
    public final HashSet<EnumC19228810Ko> LLILLJJLI;
    public final AbstractC1623806Xk<List<C1261860iwS>> LLILLL;
    public final List<C1261860iwS> LLILZ;
    public final int LLILZIL;

    public C1713290ugZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1713290ugZ)) {
            return false;
        }
        C1713290ugZ c1713290ugZ = (C1713290ugZ) obj;
        return Intrinsics.LJFF(this.LL, c1713290ugZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1713290ugZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1713290ugZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1713290ugZ.LLILZ) && this.LLILZIL == c1713290ugZ.LLILZIL;
    }

    public final int hashCode() {
        C1263870izh c1263870izh = this.LL;
        return ((((((((c1263870izh == null ? 0 : c1263870izh.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceUserCardVMState(cursor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actionSet=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayUsers=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", consumptionCnt=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1713290ugZ(int i) {
        this(null, new HashSet(), C491101vh.LIZ, C13BV.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1713290ugZ(C1263870izh c1263870izh, HashSet<EnumC19228810Ko> hashSet, AbstractC1623806Xk<? extends List<C1261860iwS>> abstractC1623806Xk, List<C1261860iwS> list, int i) {
        this.LL = c1263870izh;
        this.LLILLJJLI = hashSet;
        this.LLILLL = abstractC1623806Xk;
        this.LLILZ = list;
        this.LLILZIL = i;
    }

    public static C1713290ugZ LIZ(C1713290ugZ c1713290ugZ, C1263870izh c1263870izh, HashSet hashSet, AbstractC1623806Xk abstractC1623806Xk, List list, int i, int i2) {
        int i3 = i;
        List list2 = list;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        HashSet hashSet2 = hashSet;
        C1263870izh c1263870izh2 = c1263870izh;
        if ((i2 & 1) != 0) {
            c1263870izh2 = c1713290ugZ.LL;
        }
        if ((i2 & 2) != 0) {
            hashSet2 = c1713290ugZ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            abstractC1623806Xk2 = c1713290ugZ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list2 = c1713290ugZ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1713290ugZ.LLILZIL;
        }
        c1713290ugZ.getClass();
        return new C1713290ugZ(c1263870izh2, hashSet2, abstractC1623806Xk2, list2, i3);
    }
}
