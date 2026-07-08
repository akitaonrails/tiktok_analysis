package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461930I9n implements InterfaceC0148002o {
    public final C0IA3 LL;
    public final List<C0IA3> LLILLJJLI;
    public final EnumC429240GsM LLILLL;
    public final C291001Au<C0IA2> LLILZ;
    public final Pair<Integer, Integer> LLILZIL;
    public final int LLILZLL;
    public final Map<Integer, Integer> LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final List<C462030I9x> LLJI;

    public C461930I9n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461930I9n)) {
            return false;
        }
        C461930I9n c461930I9n = (C461930I9n) obj;
        return Intrinsics.LJFF(this.LL, c461930I9n.LL) && Intrinsics.LJFF(this.LLILLJJLI, c461930I9n.LLILLJJLI) && this.LLILLL == c461930I9n.LLILLL && Intrinsics.LJFF(this.LLILZ, c461930I9n.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c461930I9n.LLILZIL) && this.LLILZLL == c461930I9n.LLILZLL && Intrinsics.LJFF(this.LLIZ, c461930I9n.LLIZ) && this.LLIZLLLIL == c461930I9n.LLIZLLLIL && this.LLJ == c461930I9n.LLJ && Intrinsics.LJFF(this.LLJI, c461930I9n.LLJI);
    }

    public final int hashCode() {
        C0IA3 c0ia3 = this.LL;
        int iHashCode = (((((c0ia3 == null ? 0 : c0ia3.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<C0IA2> c291001Au = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Pair<Integer, Integer> pair = this.LLILZIL;
        int iHashCode3 = (((((((((iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31;
        List<C462030I9x> list = this.LLJI;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3PublishState(curPublishingTask=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishTaskList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", publishStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", coverStackOpt=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", publishIndicator=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentDisplayIndex=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", taskProgressMap=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", displayProgress=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", publishProgress=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", retryPublishTask=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C461930I9n(int i) {
        this(null, C13BV.INSTANCE, EnumC429240GsM.NONE, null, null, 0, C2097608Jq.LJ(), 0, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C461930I9n(C0IA3 c0ia3, List<? extends C0IA3> list, EnumC429240GsM enumC429240GsM, C291001Au<? extends C0IA2> c291001Au, Pair<Integer, Integer> pair, int i, Map<Integer, Integer> map, int i2, int i3, List<C462030I9x> list2) {
        this.LL = c0ia3;
        this.LLILLJJLI = list;
        this.LLILLL = enumC429240GsM;
        this.LLILZ = c291001Au;
        this.LLILZIL = pair;
        this.LLILZLL = i;
        this.LLIZ = map;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
        this.LLJI = list2;
    }

    public static C461930I9n LIZ(C461930I9n c461930I9n, C0IA3 c0ia3, List list, EnumC429240GsM enumC429240GsM, C291001Au c291001Au, Pair pair, int i, Map map, int i2, int i3, List list2, int i4) {
        List list3 = list2;
        int i5 = i3;
        int i6 = i2;
        Map map2 = map;
        int i7 = i;
        Pair pair2 = pair;
        C291001Au c291001Au2 = c291001Au;
        EnumC429240GsM enumC429240GsM2 = enumC429240GsM;
        List list4 = list;
        C0IA3 c0ia32 = c0ia3;
        if ((i4 & 1) != 0) {
            c0ia32 = c461930I9n.LL;
        }
        if ((i4 & 2) != 0) {
            list4 = c461930I9n.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            enumC429240GsM2 = c461930I9n.LLILLL;
        }
        if ((i4 & 8) != 0) {
            c291001Au2 = c461930I9n.LLILZ;
        }
        if ((i4 & 16) != 0) {
            pair2 = c461930I9n.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            i7 = c461930I9n.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            map2 = c461930I9n.LLIZ;
        }
        if ((i4 & 128) != 0) {
            i6 = c461930I9n.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            i5 = c461930I9n.LLJ;
        }
        if ((i4 & 512) != 0) {
            list3 = c461930I9n.LLJI;
        }
        c461930I9n.getClass();
        return new C461930I9n(c0ia32, list4, enumC429240GsM2, c291001Au2, pair2, i7, map2, i6, i5, list3);
    }
}
