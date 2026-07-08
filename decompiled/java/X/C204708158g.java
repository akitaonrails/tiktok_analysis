package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204708158g implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<C204702158a> LLILLJJLI;
    public final C291001Au<C158Z> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<Integer> LLIZ;
    public final C291001Au<C1144770ftb> LLIZLLLIL;
    public final C291001Au<C1555970qap> LLJ;
    public final C291001Au<Boolean> LLJI;

    public C204708158g() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204708158g)) {
            return false;
        }
        C204708158g c204708158g = (C204708158g) obj;
        return Intrinsics.LJFF(this.LL, c204708158g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c204708158g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c204708158g.LLILLL) && Intrinsics.LJFF(this.LLILZ, c204708158g.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c204708158g.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c204708158g.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c204708158g.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c204708158g.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c204708158g.LLJ) && Intrinsics.LJFF(this.LLJI, c204708158g.LLJI);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C204702158a> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C158Z> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Integer> c291001Au7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<C1144770ftb> c291001Au8 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        C291001Au<C1555970qap> c291001Au9 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (c291001Au9 == null ? 0 : c291001Au9.hashCode())) * 31;
        C291001Au<Boolean> c291001Au10 = this.LLJI;
        return iHashCode9 + (c291001Au10 != null ? c291001Au10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchHammerState(playHammerAnimEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playHammerAnimEventForAnchorPair=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playFanHammerEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", prepareFanHammerContainer=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", destroyFanHammerContainer=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", dismissHammerAnimEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", downgradeHammerEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", dizzinessEffectShown=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", settlementPauseEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", finishFanHammerEvent=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C204708158g(int i) {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public C204708158g(C291001Au<Boolean> c291001Au, C291001Au<C204702158a> c291001Au2, C291001Au<C158Z> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Unit> c291001Au5, C291001Au<Unit> c291001Au6, C291001Au<Integer> c291001Au7, C291001Au<C1144770ftb> c291001Au8, C291001Au<C1555970qap> c291001Au9, C291001Au<Boolean> c291001Au10) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
        this.LLJ = c291001Au9;
        this.LLJI = c291001Au10;
    }

    public static C204708158g LIZ(C204708158g c204708158g, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, int i) {
        C291001Au c291001Au11 = c291001Au10;
        C291001Au c291001Au12 = c291001Au9;
        C291001Au c291001Au13 = c291001Au8;
        C291001Au c291001Au14 = c291001Au7;
        C291001Au c291001Au15 = c291001Au6;
        C291001Au c291001Au16 = c291001Au5;
        C291001Au c291001Au17 = c291001Au4;
        C291001Au c291001Au18 = c291001Au3;
        C291001Au c291001Au19 = c291001Au2;
        C291001Au c291001Au20 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au20 = c204708158g.LL;
        }
        if ((i & 2) != 0) {
            c291001Au19 = c204708158g.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au18 = c204708158g.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au17 = c204708158g.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au16 = c204708158g.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au15 = c204708158g.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au14 = c204708158g.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au13 = c204708158g.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au12 = c204708158g.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au11 = c204708158g.LLJI;
        }
        c204708158g.getClass();
        return new C204708158g(c291001Au20, c291001Au19, c291001Au18, c291001Au17, c291001Au16, c291001Au15, c291001Au14, c291001Au13, c291001Au12, c291001Au11);
    }
}
