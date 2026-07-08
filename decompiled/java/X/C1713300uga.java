package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713300uga implements InterfaceC0148002o {
    public final C1263870izh LL;
    public final HashSet<EnumC19228810Ko> LLILLJJLI;
    public final C1261860iwS LLILLL;
    public final AbstractC1623806Xk<List<C1261860iwS>> LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final Integer LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final C291001Au<String> LLJ;

    public C1713300uga() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1713300uga)) {
            return false;
        }
        C1713300uga c1713300uga = (C1713300uga) obj;
        return Intrinsics.LJFF(this.LL, c1713300uga.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1713300uga.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1713300uga.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1713300uga.LLILZ) && this.LLILZIL == c1713300uga.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1713300uga.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1713300uga.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1713300uga.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1713300uga.LLJ);
    }

    public final int hashCode() {
        C1263870izh c1263870izh = this.LL;
        int iHashCode = (((c1263870izh == null ? 0 : c1263870izh.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1261860iwS c1261860iwS = this.LLILLL;
        int iHashCode2 = (((((((iHashCode + (c1261860iwS == null ? 0 : c1261860iwS.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31;
        Integer num = this.LLIZ;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecSwipeVMState(cursor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actionSet=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currRecUser=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", relationButtonsDisabled=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", deleteCardAtPosEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", curPos=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", followOrRequestEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", refreshListEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1713300uga(int i) {
        this(null, new HashSet(), null, C491101vh.LIZ, false, new C291001Au(null), null, new C291001Au(null), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1713300uga(C1263870izh c1263870izh, HashSet<EnumC19228810Ko> hashSet, C1261860iwS c1261860iwS, AbstractC1623806Xk<? extends List<C1261860iwS>> abstractC1623806Xk, boolean z, C291001Au<Integer> c291001Au, Integer num, C291001Au<Boolean> c291001Au2, C291001Au<String> c291001Au3) {
        this.LL = c1263870izh;
        this.LLILLJJLI = hashSet;
        this.LLILLL = c1261860iwS;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = z;
        this.LLILZLL = c291001Au;
        this.LLIZ = num;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = c291001Au3;
    }

    public static C1713300uga LIZ(C1713300uga c1713300uga, C1263870izh c1263870izh, HashSet hashSet, C1261860iwS c1261860iwS, AbstractC1623806Xk abstractC1623806Xk, boolean z, C291001Au c291001Au, Integer num, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        Integer num2 = num;
        C291001Au c291001Au6 = c291001Au;
        boolean z2 = z;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C1261860iwS c1261860iwS2 = c1261860iwS;
        HashSet hashSet2 = hashSet;
        C1263870izh c1263870izh2 = c1263870izh;
        if ((i & 1) != 0) {
            c1263870izh2 = c1713300uga.LL;
        }
        if ((i & 2) != 0) {
            hashSet2 = c1713300uga.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1261860iwS2 = c1713300uga.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk2 = c1713300uga.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c1713300uga.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c1713300uga.LLILZLL;
        }
        if ((i & 64) != 0) {
            num2 = c1713300uga.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au5 = c1713300uga.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au4 = c1713300uga.LLJ;
        }
        c1713300uga.getClass();
        return new C1713300uga(c1263870izh2, hashSet2, c1261860iwS2, abstractC1623806Xk2, z2, c291001Au6, num2, c291001Au5, c291001Au4);
    }
}
