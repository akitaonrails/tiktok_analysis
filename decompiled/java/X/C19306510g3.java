package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19306510g3 implements Serializable {
    public final Float appNameMinTextSizeDp;
    public final C19306610g4 backgroundConfig;
    public final Float bottomSheetRatioFive;
    public final Float bottomSheetRatioNine;
    public final Float bottomSheetRatioSeven;
    public final AbstractC1776430wKP loginButtonColor;
    public final Integer logoDrawableRes;
    public final Float logoTitleGapDp;
    public final EnumC1158040gF0 logoType;
    public final EnumC19307010g8 spacingEdge;
    public final EnumC1782620wUO spacingMode;
    public final Float spacingValue;
    public final Float textLogoHeightDp;
    public final String title;
    public final Float titleTextSizeDp;

    public C19306510g3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19306510g3)) {
            return false;
        }
        C19306510g3 c19306510g3 = (C19306510g3) obj;
        return Intrinsics.LJFF(this.backgroundConfig, c19306510g3.backgroundConfig) && Intrinsics.LJFF(this.logoDrawableRes, c19306510g3.logoDrawableRes) && this.logoType == c19306510g3.logoType && Intrinsics.LJFF(this.title, c19306510g3.title) && Intrinsics.LJFF(this.loginButtonColor, c19306510g3.loginButtonColor) && Intrinsics.LJFF(this.appNameMinTextSizeDp, c19306510g3.appNameMinTextSizeDp) && Intrinsics.LJFF(this.titleTextSizeDp, c19306510g3.titleTextSizeDp) && Intrinsics.LJFF(this.textLogoHeightDp, c19306510g3.textLogoHeightDp) && Intrinsics.LJFF(this.logoTitleGapDp, c19306510g3.logoTitleGapDp) && Intrinsics.LJFF(this.bottomSheetRatioNine, c19306510g3.bottomSheetRatioNine) && Intrinsics.LJFF(this.bottomSheetRatioSeven, c19306510g3.bottomSheetRatioSeven) && Intrinsics.LJFF(this.bottomSheetRatioFive, c19306510g3.bottomSheetRatioFive) && this.spacingEdge == c19306510g3.spacingEdge && this.spacingMode == c19306510g3.spacingMode && Intrinsics.LJFF(this.spacingValue, c19306510g3.spacingValue);
    }

    public int hashCode() {
        C19306610g4 c19306610g4 = this.backgroundConfig;
        int iHashCode = (c19306610g4 == null ? 0 : c19306610g4.hashCode()) * 31;
        Integer num = this.logoDrawableRes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        EnumC1158040gF0 enumC1158040gF0 = this.logoType;
        int iHashCode3 = (iHashCode2 + (enumC1158040gF0 == null ? 0 : enumC1158040gF0.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC1776430wKP abstractC1776430wKP = this.loginButtonColor;
        int iHashCode5 = (iHashCode4 + (abstractC1776430wKP == null ? 0 : abstractC1776430wKP.hashCode())) * 31;
        Float f = this.appNameMinTextSizeDp;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.titleTextSizeDp;
        int iHashCode7 = (iHashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.textLogoHeightDp;
        int iHashCode8 = (iHashCode7 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.logoTitleGapDp;
        int iHashCode9 = (iHashCode8 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.bottomSheetRatioNine;
        int iHashCode10 = (iHashCode9 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.bottomSheetRatioSeven;
        int iHashCode11 = (iHashCode10 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.bottomSheetRatioFive;
        int iHashCode12 = (iHashCode11 + (f7 == null ? 0 : f7.hashCode())) * 31;
        EnumC19307010g8 enumC19307010g8 = this.spacingEdge;
        int iHashCode13 = (iHashCode12 + (enumC19307010g8 == null ? 0 : enumC19307010g8.hashCode())) * 31;
        EnumC1782620wUO enumC1782620wUO = this.spacingMode;
        int iHashCode14 = (iHashCode13 + (enumC1782620wUO == null ? 0 : enumC1782620wUO.hashCode())) * 31;
        Float f8 = this.spacingValue;
        return iHashCode14 + (f8 != null ? f8.hashCode() : 0);
    }

    public String toString() {
        return "SOTLPanelConfigOverride(backgroundConfig=" + this.backgroundConfig + ", logoDrawableRes=" + this.logoDrawableRes + ", logoType=" + this.logoType + ", title=" + this.title + ", loginButtonColor=" + this.loginButtonColor + ", appNameMinTextSizeDp=" + this.appNameMinTextSizeDp + ", titleTextSizeDp=" + this.titleTextSizeDp + ", textLogoHeightDp=" + this.textLogoHeightDp + ", logoTitleGapDp=" + this.logoTitleGapDp + ", bottomSheetRatioNine=" + this.bottomSheetRatioNine + ", bottomSheetRatioSeven=" + this.bottomSheetRatioSeven + ", bottomSheetRatioFive=" + this.bottomSheetRatioFive + ", spacingEdge=" + this.spacingEdge + ", spacingMode=" + this.spacingMode + ", spacingValue=" + this.spacingValue + ')';
    }

    public final C19306410g2 mergeInto(C19306410g2 c19306410g2) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        C19306710g5 c19306710g5MergeInto;
        int iIntValue;
        float fFloatValue4;
        C19306910g7 c19306910g7 = c19306410g2.LJIIIZ;
        Float f = this.bottomSheetRatioNine;
        if (f != null || this.bottomSheetRatioSeven != null || this.bottomSheetRatioFive != null) {
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = c19306910g7.nineScreen;
            }
            Float f2 = this.bottomSheetRatioSeven;
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = c19306910g7.sevenScreen;
            }
            Float f3 = this.bottomSheetRatioFive;
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            } else {
                fFloatValue3 = c19306910g7.fiveScreen;
            }
            c19306910g7 = new C19306910g7(fFloatValue, fFloatValue2, fFloatValue3);
        }
        C19306610g4 c19306610g4 = this.backgroundConfig;
        if (c19306610g4 == null || (c19306710g5MergeInto = c19306610g4.mergeInto(c19306410g2.LIZ)) == null) {
            c19306710g5MergeInto = c19306410g2.LIZ;
        }
        Integer num = this.logoDrawableRes;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c19306410g2.LIZIZ;
        }
        EnumC1158040gF0 enumC1158040gF0 = this.logoType;
        if (enumC1158040gF0 == null) {
            enumC1158040gF0 = c19306410g2.LIZJ;
        }
        String str = this.title;
        if (str == null) {
            str = c19306410g2.LIZLLL;
        }
        AbstractC1776430wKP abstractC1776430wKP = this.loginButtonColor;
        if (abstractC1776430wKP == null) {
            abstractC1776430wKP = c19306410g2.LJ;
        }
        Float f4 = this.appNameMinTextSizeDp;
        if (f4 != null) {
            fFloatValue4 = f4.floatValue();
        } else {
            fFloatValue4 = c19306410g2.LJFF;
        }
        Float f5 = this.titleTextSizeDp;
        if (f5 == null) {
            f5 = c19306410g2.LJI;
        }
        Float f6 = this.textLogoHeightDp;
        if (f6 == null) {
            f6 = c19306410g2.LJII;
        }
        Float f7 = this.logoTitleGapDp;
        if (f7 == null) {
            f7 = c19306410g2.LJIIIIZZ;
        }
        C19306910g7 c19306910g7Normalized = c19306910g7.normalized();
        EnumC19307010g8 enumC19307010g8 = this.spacingEdge;
        if (enumC19307010g8 == null) {
            enumC19307010g8 = c19306410g2.LJIIJ;
        }
        EnumC1782620wUO enumC1782620wUO = this.spacingMode;
        if (enumC1782620wUO == null) {
            enumC1782620wUO = c19306410g2.LJIIJJI;
        }
        Float f8 = this.spacingValue;
        if (f8 == null) {
            f8 = c19306410g2.LJIIL;
        }
        return new C19306410g2(c19306710g5MergeInto, iIntValue, enumC1158040gF0, str, abstractC1776430wKP, fFloatValue4, f5, f6, f7, c19306910g7Normalized, enumC19307010g8, enumC1782620wUO, f8);
    }

    public C19306510g3(C19306610g4 c19306610g4, Integer num, EnumC1158040gF0 enumC1158040gF0, String str, AbstractC1776430wKP abstractC1776430wKP, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, EnumC19307010g8 enumC19307010g8, EnumC1782620wUO enumC1782620wUO, Float f8) {
        this.backgroundConfig = c19306610g4;
        this.logoDrawableRes = num;
        this.logoType = enumC1158040gF0;
        this.title = str;
        this.loginButtonColor = abstractC1776430wKP;
        this.appNameMinTextSizeDp = f;
        this.titleTextSizeDp = f2;
        this.textLogoHeightDp = f3;
        this.logoTitleGapDp = f4;
        this.bottomSheetRatioNine = f5;
        this.bottomSheetRatioSeven = f6;
        this.bottomSheetRatioFive = f7;
        this.spacingEdge = enumC19307010g8;
        this.spacingMode = enumC1782620wUO;
        this.spacingValue = f8;
    }
}
