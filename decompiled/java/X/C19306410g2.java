package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10g2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19306410g2 {
    public final C19306710g5 LIZ;
    public final int LIZIZ;
    public final EnumC1158040gF0 LIZJ;
    public final String LIZLLL;
    public final AbstractC1776430wKP LJ;
    public final float LJFF;
    public final Float LJI;
    public final Float LJII;
    public final Float LJIIIIZZ;
    public final C19306910g7 LJIIIZ;
    public final EnumC19307010g8 LJIIJ;
    public final EnumC1782620wUO LJIIJJI;
    public final Float LJIIL;

    public C19306410g2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19306410g2)) {
            return false;
        }
        C19306410g2 c19306410g2 = (C19306410g2) obj;
        return Intrinsics.LJFF(this.LIZ, c19306410g2.LIZ) && this.LIZIZ == c19306410g2.LIZIZ && this.LIZJ == c19306410g2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c19306410g2.LIZLLL) && Intrinsics.LJFF(this.LJ, c19306410g2.LJ) && Float.compare(this.LJFF, c19306410g2.LJFF) == 0 && Intrinsics.LJFF(this.LJI, c19306410g2.LJI) && Intrinsics.LJFF(this.LJII, c19306410g2.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c19306410g2.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c19306410g2.LJIIIZ) && this.LJIIJ == c19306410g2.LJIIJ && this.LJIIJJI == c19306410g2.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c19306410g2.LJIIL);
    }

    public final String toString() {
        return "SOTLPanelConfig(backgroundConfig=" + this.LIZ + ", logoDrawableRes=" + this.LIZIZ + ", logoType=" + this.LIZJ + ", title=" + this.LIZLLL + ", loginButtonColor=" + this.LJ + ", appNameMinTextSizeDp=" + this.LJFF + ", titleTextSizeDp=" + this.LJI + ", textLogoHeightDp=" + this.LJII + ", logoTitleGapDp=" + this.LJIIIIZZ + ", bottomSheetPositionRatios=" + this.LJIIIZ + ", spacingEdge=" + this.LJIIJ + ", spacingMode=" + this.LJIIJJI + ", spacingValue=" + this.LJIIL + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31;
        Float f = this.LJI;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.LJIIIIZZ;
        int iHashCode4 = (((((((iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        Float f4 = this.LJIIL;
        return iHashCode4 + (f4 != null ? f4.hashCode() : 0);
    }

    public /* synthetic */ C19306410g2(int i) {
        this(new C19306710g5(0), 0, EnumC1158040gF0.SQUARE, "", C1776420wKO.INSTANCE, 22.0f, null, null, null, new C19306910g7(0.2f, 0.1f, 0.2f), EnumC19307010g8.TOP, EnumC1782620wUO.FIXED, null);
    }

    public C19306410g2(C19306710g5 c19306710g5, int i, EnumC1158040gF0 enumC1158040gF0, String str, AbstractC1776430wKP abstractC1776430wKP, float f, Float f2, Float f3, Float f4, C19306910g7 c19306910g7, EnumC19307010g8 enumC19307010g8, EnumC1782620wUO enumC1782620wUO, Float f5) {
        this.LIZ = c19306710g5;
        this.LIZIZ = i;
        this.LIZJ = enumC1158040gF0;
        this.LIZLLL = str;
        this.LJ = abstractC1776430wKP;
        this.LJFF = f;
        this.LJI = f2;
        this.LJII = f3;
        this.LJIIIIZZ = f4;
        this.LJIIIZ = c19306910g7;
        this.LJIIJ = enumC19307010g8;
        this.LJIIJJI = enumC1782620wUO;
        this.LJIIL = f5;
    }
}
