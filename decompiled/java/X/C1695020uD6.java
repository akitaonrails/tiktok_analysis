package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695020uD6 {
    public static final C1695020uD6 LJI = new C1695020uD6(false, 0, true, 1, 1, C1694560uCM.LLILLL);
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C1694560uCM LJFF;

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31 * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImeOptions(singleLine=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", capitalization=");
        sbLIZ.append((Object) C1695050uD9.LIZ(this.LIZIZ));
        sbLIZ.append(", autoCorrect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keyboardType=");
        sbLIZ.append((Object) C1695060uDA.LIZ(this.LIZLLL));
        sbLIZ.append(", imeAction=");
        sbLIZ.append((Object) C1695040uD8.LIZ(this.LJ));
        sbLIZ.append(", platformImeOptions=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", hintLocales=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695020uD6)) {
            return false;
        }
        C1695020uD6 c1695020uD6 = (C1695020uD6) obj;
        if (this.LIZ != c1695020uD6.LIZ || this.LIZIZ != c1695020uD6.LIZIZ || this.LIZJ != c1695020uD6.LIZJ || this.LIZLLL != c1695020uD6.LIZLLL || this.LJ != c1695020uD6.LJ) {
            return false;
        }
        c1695020uD6.getClass();
        if (Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJFF, c1695020uD6.LJFF)) {
            return true;
        }
        return false;
    }

    public C1695020uD6(boolean z, int i, boolean z2, int i2, int i3, C1694560uCM c1694560uCM) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = c1694560uCM;
    }
}
