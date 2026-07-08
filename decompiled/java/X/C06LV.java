package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06LV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LV extends C06OO {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06LV)) {
            return false;
        }
        C06LV c06lv = (C06LV) obj;
        return Intrinsics.LJFF(this.LIZJ, c06lv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c06lv.LIZLLL) && Intrinsics.LJFF(this.LJ, c06lv.LJ) && Intrinsics.LJFF(this.LJFF, c06lv.LJFF) && Intrinsics.LJFF(this.LJI, c06lv.LJI) && Intrinsics.LJFF(this.LJII, c06lv.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c06lv.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakWheeDriveTrafficCardTask(imageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ctaText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ctaAction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onGetBtnClick=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onCardActuallyShow=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", onCardActuallyDismiss=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06LV(String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(EnumC1596306Mv.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = function0;
        this.LJII = function02;
        this.LJIIIIZZ = function03;
    }
}
