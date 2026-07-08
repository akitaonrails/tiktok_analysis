package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337920DMo implements InterfaceC0148002o {
    public final EnumC337830DMf LL;
    public final List<EnumC337870DMj> LLILLJJLI;
    public final boolean LLILLL;
    public final C1245860iWe LLILZ;
    public final boolean LLILZIL;
    public final C0DHZ LLILZLL;
    public final Integer LLIZ;
    public final Boolean LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<EnumC337930DMp> LLJI;
    public final C291001Au<Unit> LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C337920DMo)) {
            return false;
        }
        C337920DMo c337920DMo = (C337920DMo) obj;
        return this.LL == c337920DMo.LL && Intrinsics.LJFF(this.LLILLJJLI, c337920DMo.LLILLJJLI) && this.LLILLL == c337920DMo.LLILLL && Intrinsics.LJFF(this.LLILZ, c337920DMo.LLILZ) && this.LLILZIL == c337920DMo.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c337920DMo.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c337920DMo.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c337920DMo.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c337920DMo.LLJ) && Intrinsics.LJFF(this.LLJI, c337920DMo.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c337920DMo.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C0DHZ c0dhz = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c0dhz == null ? 0 : c0dhz.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLJ;
        int iHashCode5 = (iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<EnumC337930DMp> c291001Au2 = this.LLJI;
        int iHashCode6 = (iHashCode5 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLJIJIL;
        return iHashCode6 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        return "CampusFlowState(currentFlow=" + this.LL + ", pageStack=" + this.LLILLJJLI + ", skippablePage=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", skipFindSchoolFriendsPage=" + this.LLILZIL + ", chosenSchool=" + this.LLILZLL + ", chosenGraduationYear=" + this.LLIZ + ", enableSchoolGroup=" + this.LLIZLLLIL + ", closeEvent=" + this.LLJ + ", saveCampusResult=" + this.LLJI + ", showRevisitPopupEvent=" + this.LLJIJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C337920DMo(EnumC337830DMf enumC337830DMf, List<? extends EnumC337870DMj> list, boolean z, C1245860iWe c1245860iWe, boolean z2, C0DHZ c0dhz, Integer num, Boolean bool, C291001Au<Unit> c291001Au, C291001Au<? extends EnumC337930DMp> c291001Au2, C291001Au<Unit> c291001Au3) {
        this.LL = enumC337830DMf;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = c1245860iWe;
        this.LLILZIL = z2;
        this.LLILZLL = c0dhz;
        this.LLIZ = num;
        this.LLIZLLLIL = bool;
        this.LLJ = c291001Au;
        this.LLJI = c291001Au2;
        this.LLJIJIL = c291001Au3;
    }

    public static C337920DMo LIZ(C337920DMo c337920DMo, EnumC337830DMf enumC337830DMf, List list, boolean z, C0DHZ c0dhz, Integer num, Boolean bool, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C1245860iWe c1245860iWe;
        boolean z2;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        Boolean bool2 = bool;
        boolean z3 = z;
        Integer num2 = num;
        List list2 = list;
        C0DHZ c0dhz2 = c0dhz;
        EnumC337830DMf enumC337830DMf2 = enumC337830DMf;
        if ((i & 1) != 0) {
            enumC337830DMf2 = c337920DMo.LL;
        }
        if ((i & 2) != 0) {
            list2 = c337920DMo.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c337920DMo.LLILLL;
        }
        if ((i & 8) != 0) {
            c1245860iWe = c337920DMo.LLILZ;
        } else {
            c1245860iWe = null;
        }
        if ((i & 16) != 0) {
            z2 = c337920DMo.LLILZIL;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            c0dhz2 = c337920DMo.LLILZLL;
        }
        if ((i & 64) != 0) {
            num2 = c337920DMo.LLIZ;
        }
        if ((i & 128) != 0) {
            bool2 = c337920DMo.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au6 = c337920DMo.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au5 = c337920DMo.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au4 = c337920DMo.LLJIJIL;
        }
        c337920DMo.getClass();
        return new C337920DMo(enumC337830DMf2, list2, z3, c1245860iWe, z2, c0dhz2, num2, bool2, c291001Au6, c291001Au5, c291001Au4);
    }
}
