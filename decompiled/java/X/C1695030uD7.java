package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695030uD7 {
    public static final C1695030uD7 LJI = new C1695030uD7(null, 0, 0, 127);
    public final int LIZ;
    public final Boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Boolean LJ;
    public final C1694560uCM LJFF;

    static {
        new C1695030uD7(Boolean.FALSE, 7, 0, 121);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode = (((((i + (bool != null ? bool.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31 * 31;
        Boolean bool2 = this.LJ;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C1694560uCM c1694560uCM = this.LJFF;
        return iHashCode2 + (c1694560uCM != null ? c1694560uCM.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyboardOptions(capitalization=");
        sbLIZ.append((Object) C1695050uD9.LIZ(this.LIZ));
        sbLIZ.append(", autoCorrectEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", keyboardType=");
        sbLIZ.append((Object) C1695060uDA.LIZ(this.LIZJ));
        sbLIZ.append(", imeAction=");
        sbLIZ.append((Object) C1695040uD8.LIZ(this.LIZLLL));
        sbLIZ.append(", platformImeOptions=");
        sbLIZ.append((Object) null);
        sbLIZ.append("showKeyboardOnFocus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hintLocales=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1695020uD6 LIZIZ(boolean z) {
        boolean z2;
        int i;
        boolean zBooleanValue;
        int i2;
        int i3;
        int i4 = this.LIZ;
        C1695050uD9 c1695050uD9 = new C1695050uD9(i4);
        if (i4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i = c1695050uD9.LIZ;
        } else {
            i = 0;
        }
        Boolean bool = this.LIZIZ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        int i5 = this.LIZJ;
        C1695060uDA c1695060uDA = new C1695060uDA(i5);
        if (i5 == 0) {
            i2 = 1;
        } else {
            i2 = c1695060uDA.LIZ;
        }
        int i6 = this.LIZLLL;
        C1695040uD8 c1695040uD8 = new C1695040uD8(i6);
        if (i6 == -1) {
            i3 = 1;
        } else {
            i3 = c1695040uD8.LIZ;
        }
        C1694560uCM c1694560uCM = this.LJFF;
        if (c1694560uCM == null) {
            c1694560uCM = C1694560uCM.LLILLL;
        }
        return new C1695020uD6(z, i, zBooleanValue, i2, i3, c1694560uCM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695030uD7)) {
            return false;
        }
        C1695030uD7 c1695030uD7 = (C1695030uD7) obj;
        if (this.LIZ != c1695030uD7.LIZ || !Intrinsics.LJFF(this.LIZIZ, c1695030uD7.LIZIZ) || this.LIZJ != c1695030uD7.LIZJ || this.LIZLLL != c1695030uD7.LIZLLL) {
            return false;
        }
        c1695030uD7.getClass();
        if (Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJ, c1695030uD7.LJ) && Intrinsics.LJFF(this.LJFF, c1695030uD7.LJFF)) {
            return true;
        }
        return false;
    }

    public static C1695030uD7 LIZ(C1695030uD7 c1695030uD7, int i) {
        int i2 = c1695030uD7.LIZ;
        Boolean bool = c1695030uD7.LIZIZ;
        int i3 = c1695030uD7.LIZJ;
        c1695030uD7.getClass();
        c1695030uD7.getClass();
        return new C1695030uD7(i2, bool, i3, i, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1695030uD7(Boolean bool, int i, int i2, int i3) {
        int i4;
        int i5 = i2;
        int i6 = i;
        Boolean bool2 = bool;
        if ((i3 & 1) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        this(i4, (i3 & 2) != 0 ? null : bool2, (i3 & 4) != 0 ? 0 : i6, (i3 & 8) != 0 ? -1 : i5, null, null);
    }

    public C1695030uD7(int i, Boolean bool, int i2, int i3, Boolean bool2, C1694560uCM c1694560uCM) {
        this.LIZ = i;
        this.LIZIZ = bool;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = bool2;
        this.LJFF = c1694560uCM;
    }
}
