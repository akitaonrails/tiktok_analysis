package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887820YsG implements InterfaceC0148002o {
    public final Integer LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C876610YaB LLILLL;
    public final EnumC880850Yh1 LLILZ;
    public final List<EnumC871430YGn> LLILZIL;
    public final Map<EnumC871430YGn, Boolean> LLILZLL;
    public final EnumC880520YgU LLIZ;
    public final Map<EnumC880520YgU, Integer> LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final C291001Au<Boolean> LLJI;
    public final C291001Au<String> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;

    public C887820YsG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887820YsG)) {
            return false;
        }
        C887820YsG c887820YsG = (C887820YsG) obj;
        return Intrinsics.LJFF(this.LL, c887820YsG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c887820YsG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c887820YsG.LLILLL) && this.LLILZ == c887820YsG.LLILZ && Intrinsics.LJFF(this.LLILZIL, c887820YsG.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c887820YsG.LLILZLL) && this.LLIZ == c887820YsG.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c887820YsG.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c887820YsG.LLJ) && Intrinsics.LJFF(this.LLJI, c887820YsG.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c887820YsG.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c887820YsG.LLJILJIL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C876610YaB c876610YaB = this.LLILLL;
        int iHashCode3 = (((((((iHashCode2 + (c876610YaB == null ? 0 : c876610YaB.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        EnumC880520YgU enumC880520YgU = this.LLIZ;
        return ((((((((((iHashCode3 + (enumC880520YgU != null ? enumC880520YgU.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "MessageRequestRootPageState(currentActivePagePosition=" + this.LL + ", onClickBackPage=" + this.LLILLJJLI + ", messageRequestData=" + this.LLILLL + ", listMode=" + this.LLILZ + ", pageList=" + this.LLILZIL + ", pageEmptyState=" + this.LLILZLL + ", curSecondaryPage=" + this.LLIZ + ", secondaryPageUnreadMap=" + this.LLIZLLLIL + ", enablePriority=" + this.LLJ + ", showLoading=" + this.LLJI + ", toast=" + this.LLJIJIL + ", closePage=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C887820YsG(int i) {
        EnumC880850Yh1 enumC880850Yh1 = EnumC880850Yh1.NORMAL;
        C13BV c13bv = C13BV.INSTANCE;
        Map mapLJ = C2097608Jq.LJ();
        Map mapLJ2 = C2097608Jq.LJ();
        Boolean bool = Boolean.FALSE;
        this(null, null, null, enumC880850Yh1, c13bv, mapLJ, null, mapLJ2, new C291001Au(bool), new C291001Au(bool), new C291001Au(""), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C887820YsG(Integer num, C291001Au<Boolean> c291001Au, C876610YaB c876610YaB, EnumC880850Yh1 enumC880850Yh1, List<? extends EnumC871430YGn> list, Map<EnumC871430YGn, Boolean> map, EnumC880520YgU enumC880520YgU, Map<EnumC880520YgU, Integer> map2, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<String> c291001Au4, C291001Au<Boolean> c291001Au5) {
        this.LL = num;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c876610YaB;
        this.LLILZ = enumC880850Yh1;
        this.LLILZIL = list;
        this.LLILZLL = map;
        this.LLIZ = enumC880520YgU;
        this.LLIZLLLIL = map2;
        this.LLJ = c291001Au2;
        this.LLJI = c291001Au3;
        this.LLJIJIL = c291001Au4;
        this.LLJILJIL = c291001Au5;
    }

    public static C887820YsG LIZ(C887820YsG c887820YsG, Integer num, C291001Au c291001Au, C876610YaB c876610YaB, EnumC880850Yh1 enumC880850Yh1, List list, Map map, EnumC880520YgU enumC880520YgU, Map map2, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, int i) {
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        Map map3 = map2;
        EnumC880520YgU enumC880520YgU2 = enumC880520YgU;
        Map map4 = map;
        List list2 = list;
        EnumC880850Yh1 enumC880850Yh12 = enumC880850Yh1;
        C876610YaB c876610YaB2 = c876610YaB;
        C291001Au c291001Au10 = c291001Au;
        Integer num2 = num;
        if ((i & 1) != 0) {
            num2 = c887820YsG.LL;
        }
        if ((i & 2) != 0) {
            c291001Au10 = c887820YsG.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c876610YaB2 = c887820YsG.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC880850Yh12 = c887820YsG.LLILZ;
        }
        if ((i & 16) != 0) {
            list2 = c887820YsG.LLILZIL;
        }
        if ((i & 32) != 0) {
            map4 = c887820YsG.LLILZLL;
        }
        if ((i & 64) != 0) {
            enumC880520YgU2 = c887820YsG.LLIZ;
        }
        if ((i & 128) != 0) {
            map3 = c887820YsG.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au9 = c887820YsG.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au8 = c887820YsG.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au7 = c887820YsG.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au6 = c887820YsG.LLJILJIL;
        }
        c887820YsG.getClass();
        return new C887820YsG(num2, c291001Au10, c876610YaB2, enumC880850Yh12, list2, map4, enumC880520YgU2, map3, c291001Au9, c291001Au8, c291001Au7, c291001Au6);
    }
}
