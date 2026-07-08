package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671950tbt {
    public final Function0<Unit> LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final C1668880tWw LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final Drawable LJII;

    public C1671950tbt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1671950tbt)) {
            return false;
        }
        C1671950tbt c1671950tbt = (C1671950tbt) obj;
        return Intrinsics.LJFF(this.LIZ, c1671950tbt.LIZ) && this.LIZIZ == c1671950tbt.LIZIZ && C1685910tyP.LJ(this.LIZJ, c1671950tbt.LIZJ) && C1685910tyP.LJ(this.LIZLLL, c1671950tbt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1671950tbt.LJ) && Intrinsics.LJFF(this.LJFF, c1671950tbt.LJFF) && Intrinsics.LJFF(this.LJI, c1671950tbt.LJI) && Intrinsics.LJFF(this.LJII, c1671950tbt.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C1685910tyP.LJIIJ(this.LIZJ)) * 31) + C1685910tyP.LJIIJ(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        Integer num = this.LJFF;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Drawable drawable = this.LJII;
        return iHashCode3 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomCreateEffectBtnViewProperties(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buttonTextColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZJ));
        sbLIZ.append(", buttonVariantBgColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZLLL));
        sbLIZ.append(", startIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startIconColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", buttonTextColorRes=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", backgroundDrawable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1671950tbt(Function0 function0, int i, long j, long j2, C1668880tWw c1668880tWw, Integer num, Integer num2, Drawable drawable) {
        this.LIZ = function0;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = c1668880tWw;
        this.LJFF = num;
        this.LJI = num2;
        this.LJII = drawable;
    }
}
