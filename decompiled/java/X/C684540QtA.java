package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684540QtA implements InterfaceC0148002o {
    public final Map<String, String> LL;
    public final Map<Integer, Boolean> LLILLJJLI;
    public final Set<String> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final long LLILZIL;
    public final Set<String> LLILZLL;
    public final C291001Au<String> LLIZ;
    public final String LLIZLLLIL;
    public final C291001Au<String> LLJ;
    public final Integer LLJI;

    public C684540QtA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684540QtA)) {
            return false;
        }
        C684540QtA c684540QtA = (C684540QtA) obj;
        return Intrinsics.LJFF(this.LL, c684540QtA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c684540QtA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684540QtA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c684540QtA.LLILZ) && this.LLILZIL == c684540QtA.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c684540QtA.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c684540QtA.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c684540QtA.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c684540QtA.LLJ) && Intrinsics.LJFF(this.LLJI, c684540QtA.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode2 = (((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<String> c291001Au2 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<String> c291001Au3 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        Integer num = this.LLJI;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPovCardVMState(commonMobParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isDefaultShowMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showedHighlightTextItemSet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", markdownTextClickableEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cardVersion=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", asyncRenderMarkdownTasks=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", asyncRenderMarkdownSuccessEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", currentTab=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", currentTabEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", currentSubIndex=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C684540QtA(int i) {
        Map mapLJ = C2097608Jq.LJ();
        Map mapLJ2 = C2097608Jq.LJ();
        C08CX c08cx = C08CX.INSTANCE;
        this(mapLJ, mapLJ2, c08cx, null, 0L, c08cx, null, null, null, null);
    }

    public C684540QtA(Map<String, String> map, Map<Integer, Boolean> map2, Set<String> set, C291001Au<Boolean> c291001Au, long j, Set<String> set2, C291001Au<String> c291001Au2, String str, C291001Au<String> c291001Au3, Integer num) {
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = set;
        this.LLILZ = c291001Au;
        this.LLILZIL = j;
        this.LLILZLL = set2;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = str;
        this.LLJ = c291001Au3;
        this.LLJI = num;
    }

    public static C684540QtA LIZ(C684540QtA c684540QtA, Map map, Map map2, Set set, C291001Au c291001Au, long j, Set set2, C291001Au c291001Au2, String str, C291001Au c291001Au3, Integer num, int i) {
        Integer num2 = num;
        C291001Au c291001Au4 = c291001Au3;
        String str2 = str;
        C291001Au c291001Au5 = c291001Au2;
        Set set3 = set2;
        long j2 = j;
        C291001Au c291001Au6 = c291001Au;
        Set set4 = set;
        Map map3 = map2;
        Map map4 = map;
        if ((i & 1) != 0) {
            map4 = c684540QtA.LL;
        }
        if ((i & 2) != 0) {
            map3 = c684540QtA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            set4 = c684540QtA.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c684540QtA.LLILZ;
        }
        if ((i & 16) != 0) {
            j2 = c684540QtA.LLILZIL;
        }
        if ((i & 32) != 0) {
            set3 = c684540QtA.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au5 = c684540QtA.LLIZ;
        }
        if ((i & 128) != 0) {
            str2 = c684540QtA.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au4 = c684540QtA.LLJ;
        }
        if ((i & 512) != 0) {
            num2 = c684540QtA.LLJI;
        }
        c684540QtA.getClass();
        return new C684540QtA(map4, map3, set4, c291001Au6, j2, set3, c291001Au5, str2, c291001Au4, num2);
    }
}
