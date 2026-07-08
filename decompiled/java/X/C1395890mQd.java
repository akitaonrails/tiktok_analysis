package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395890mQd {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395890mQd)) {
            return false;
        }
        C1395890mQd c1395890mQd = (C1395890mQd) obj;
        return Intrinsics.LJFF(this.LIZ, c1395890mQd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1395890mQd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1395890mQd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1395890mQd.LIZLLL) && Intrinsics.LJFF(this.LJ, c1395890mQd.LJ) && this.LJFF == c1395890mQd.LJFF && this.LJI == c1395890mQd.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CharSequence charSequence = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.LJ;
        return ((((iHashCode4 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabletBottomControlBarControl(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconSizeDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", text=");
        sbLIZ.append((Object) this.LIZLLL);
        sbLIZ.append(", displayText=");
        sbLIZ.append((Object) this.LJ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1395890mQd(String str, Integer num, Integer num2, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i) {
        boolean z3;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        charSequence = (i & 8) != 0 ? null : charSequence;
        charSequence2 = (i & 16) != 0 ? null : charSequence2;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? true : z2;
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = charSequence;
        this.LJ = charSequence2;
        this.LJFF = z;
        this.LJI = z2;
        if (num == null && charSequence2 == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (num2 != null && num2.intValue() <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TabletBottomControlBarControl(");
                sbLIZ.append(str);
                sbLIZ.append(") iconSizeDp must be positive when set (was ");
                sbLIZ.append(num2);
                sbLIZ.append(')');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TabletBottomControlBarControl(");
        sbLIZ2.append(str);
        sbLIZ2.append(") must have either iconRes or displayText");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
