package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360990EDh {
    public final Float LIZ;
    public final Boolean LIZIZ;
    public final Long LIZJ;
    public final Long LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final int LJFF;
    public final Integer LJI;
    public final Boolean LJII;
    public final Boolean LJIIIIZZ;
    public final String LJIIIZ;

    public C360990EDh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C360990EDh)) {
            return false;
        }
        C360990EDh c360990EDh = (C360990EDh) obj;
        return Intrinsics.LJFF(this.LIZ, c360990EDh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c360990EDh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c360990EDh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c360990EDh.LIZLLL) && Intrinsics.LJFF(this.LJ, c360990EDh.LJ) && this.LJFF == c360990EDh.LJFF && Intrinsics.LJFF(this.LJI, c360990EDh.LJI) && Intrinsics.LJFF(this.LJII, c360990EDh.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c360990EDh.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c360990EDh.LJIIIZ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Pair<Integer, Integer> pair = this.LJ;
        int iHashCode5 = (((iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.LJII;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.LJIIIZ;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoTransitionPanelSceneState(nullBtmAlpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showSlideGroup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", slideProgressRange=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", slideProgress=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", slideProgressDot=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", slideIsVibrate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", showSlide=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", selectedCategory=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C360990EDh(int i) {
        this(null, null, null, null, null, 0, null, null, null, null);
    }

    public C360990EDh(Float f, Boolean bool, Long l, Long l2, Pair<Integer, Integer> pair, int i, Integer num, Boolean bool2, Boolean bool3, String str) {
        this.LIZ = f;
        this.LIZIZ = bool;
        this.LIZJ = l;
        this.LIZLLL = l2;
        this.LJ = pair;
        this.LJFF = i;
        this.LJI = num;
        this.LJII = bool2;
        this.LJIIIIZZ = bool3;
        this.LJIIIZ = str;
    }

    public static C360990EDh LIZ(C360990EDh c360990EDh, Float f, Boolean bool, Long l, Long l2, Pair pair, int i, Integer num, Boolean bool2, Boolean bool3, String str, int i2) {
        String str2 = str;
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        Integer num2 = num;
        int i3 = i;
        Pair pair2 = pair;
        Long l3 = l2;
        Long l4 = l;
        Boolean bool6 = bool;
        Float f2 = f;
        if ((i2 & 1) != 0) {
            f2 = c360990EDh.LIZ;
        }
        if ((i2 & 2) != 0) {
            bool6 = c360990EDh.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            l4 = c360990EDh.LIZJ;
        }
        if ((i2 & 8) != 0) {
            l3 = c360990EDh.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            pair2 = c360990EDh.LJ;
        }
        if ((i2 & 32) != 0) {
            i3 = c360990EDh.LJFF;
        }
        if ((i2 & 64) != 0) {
            num2 = c360990EDh.LJI;
        }
        if ((i2 & 128) != 0) {
            bool5 = c360990EDh.LJII;
        }
        if ((i2 & 256) != 0) {
            bool4 = c360990EDh.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            str2 = c360990EDh.LJIIIZ;
        }
        c360990EDh.getClass();
        return new C360990EDh(f2, bool6, l4, l3, pair2, i3, num2, bool5, bool4, str2);
    }
}
