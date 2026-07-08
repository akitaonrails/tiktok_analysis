package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C230300uj implements InterfaceC0148002o {
    public final List<Aweme> LL;
    public final List<Aweme> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final Map<Integer, Set<String>> LLILZIL;
    public final Map<Integer, Set<String>> LLILZLL;

    public C230300uj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C230300uj)) {
            return false;
        }
        C230300uj c230300uj = (C230300uj) obj;
        return Intrinsics.LJFF(this.LL, c230300uj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c230300uj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c230300uj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c230300uj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c230300uj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c230300uj.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILZ;
        return ((((iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanSpotlightSharedState(fanSpotlightedVideo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectingFanSpotlightVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showToastEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", exitActivityEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectingVideo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", playedVideo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C230300uj(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, null, null, C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C230300uj(List<? extends Aweme> list, List<? extends Aweme> list2, C291001Au<Boolean> c291001Au, C291001Au<Unit> c291001Au2, Map<Integer, ? extends Set<String>> map, Map<Integer, ? extends Set<String>> map2) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = map;
        this.LLILZLL = map2;
    }

    public static C230300uj LIZ(C230300uj c230300uj, List list, List list2, C291001Au c291001Au, C291001Au c291001Au2, Map map, Map map2, int i) {
        Map map3 = map2;
        Map map4 = map;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c230300uj.LL;
        }
        if ((i & 2) != 0) {
            list3 = c230300uj.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c230300uj.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c230300uj.LLILZ;
        }
        if ((i & 16) != 0) {
            map4 = c230300uj.LLILZIL;
        }
        if ((i & 32) != 0) {
            map3 = c230300uj.LLILZLL;
        }
        c230300uj.getClass();
        return new C230300uj(list4, list3, c291001Au4, c291001Au3, map4, map3);
    }
}
