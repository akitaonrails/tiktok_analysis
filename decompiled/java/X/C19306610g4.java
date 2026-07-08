package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19306610g4 implements Serializable {
    public final String dimensionRatio;
    public final Integer drawableRes;
    public final Boolean showInFiveScreen;
    public final Boolean showInNineScreen;
    public final Boolean showInSevenScreen;
    public final Boolean showMaskInFiveScreen;
    public final Boolean showMaskInFullScreen;
    public final Boolean showMaskInNineScreen;
    public final Boolean showMaskInSevenScreen;

    public C19306610g4() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19306610g4)) {
            return false;
        }
        C19306610g4 c19306610g4 = (C19306610g4) obj;
        return Intrinsics.LJFF(this.drawableRes, c19306610g4.drawableRes) && Intrinsics.LJFF(this.showInNineScreen, c19306610g4.showInNineScreen) && Intrinsics.LJFF(this.showInSevenScreen, c19306610g4.showInSevenScreen) && Intrinsics.LJFF(this.showInFiveScreen, c19306610g4.showInFiveScreen) && Intrinsics.LJFF(this.showMaskInFullScreen, c19306610g4.showMaskInFullScreen) && Intrinsics.LJFF(this.showMaskInNineScreen, c19306610g4.showMaskInNineScreen) && Intrinsics.LJFF(this.showMaskInSevenScreen, c19306610g4.showMaskInSevenScreen) && Intrinsics.LJFF(this.showMaskInFiveScreen, c19306610g4.showMaskInFiveScreen) && Intrinsics.LJFF(this.dimensionRatio, c19306610g4.dimensionRatio);
    }

    public int hashCode() {
        Integer num = this.drawableRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.showInNineScreen;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showInSevenScreen;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showInFiveScreen;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showMaskInFullScreen;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showMaskInNineScreen;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.showMaskInSevenScreen;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.showMaskInFiveScreen;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str = this.dimensionRatio;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SOTLBackgroundOverride(drawableRes=");
        sbLIZ.append(this.drawableRes);
        sbLIZ.append(", showInNineScreen=");
        sbLIZ.append(this.showInNineScreen);
        sbLIZ.append(", showInSevenScreen=");
        sbLIZ.append(this.showInSevenScreen);
        sbLIZ.append(", showInFiveScreen=");
        sbLIZ.append(this.showInFiveScreen);
        sbLIZ.append(", showMaskInFullScreen=");
        sbLIZ.append(this.showMaskInFullScreen);
        sbLIZ.append(", showMaskInNineScreen=");
        sbLIZ.append(this.showMaskInNineScreen);
        sbLIZ.append(", showMaskInSevenScreen=");
        sbLIZ.append(this.showMaskInSevenScreen);
        sbLIZ.append(", showMaskInFiveScreen=");
        sbLIZ.append(this.showMaskInFiveScreen);
        sbLIZ.append(", dimensionRatio=");
        sbLIZ.append(this.dimensionRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C19306710g5 mergeInto(C19306710g5 c19306710g5) {
        int iIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        Integer num = this.drawableRes;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c19306710g5.LIZ;
        }
        Boolean bool = this.showInNineScreen;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c19306710g5.LIZIZ;
        }
        Boolean bool2 = this.showInSevenScreen;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = c19306710g5.LIZJ;
        }
        Boolean bool3 = this.showInFiveScreen;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = c19306710g5.LIZLLL;
        }
        Boolean bool4 = this.showMaskInFullScreen;
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = c19306710g5.LJ;
        }
        Boolean bool5 = this.showMaskInNineScreen;
        if (bool5 != null) {
            zBooleanValue5 = bool5.booleanValue();
        } else {
            zBooleanValue5 = c19306710g5.LJFF;
        }
        Boolean bool6 = this.showMaskInSevenScreen;
        if (bool6 != null) {
            zBooleanValue6 = bool6.booleanValue();
        } else {
            zBooleanValue6 = c19306710g5.LJI;
        }
        Boolean bool7 = this.showMaskInFiveScreen;
        if (bool7 != null) {
            zBooleanValue7 = bool7.booleanValue();
        } else {
            zBooleanValue7 = c19306710g5.LJII;
        }
        String str = this.dimensionRatio;
        if (str == null) {
            str = c19306710g5.LJIIIIZZ;
        }
        return new C19306710g5(iIntValue, str, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7);
    }

    public C19306610g4(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str) {
        this.drawableRes = num;
        this.showInNineScreen = bool;
        this.showInSevenScreen = bool2;
        this.showInFiveScreen = bool3;
        this.showMaskInFullScreen = bool4;
        this.showMaskInNineScreen = bool5;
        this.showMaskInSevenScreen = bool6;
        this.showMaskInFiveScreen = bool7;
        this.dimensionRatio = str;
    }
}
