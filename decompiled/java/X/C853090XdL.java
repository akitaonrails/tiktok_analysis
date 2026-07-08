package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853090XdL implements InterfaceC853100XdM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final EnumC1237100iIW LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C853090XdL)) {
            return false;
        }
        C853090XdL c853090XdL = (C853090XdL) obj;
        return Intrinsics.LJFF(this.LIZ, c853090XdL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c853090XdL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c853090XdL.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c853090XdL.LIZLLL) && this.LJ == c853090XdL.LJ && this.LJFF == c853090XdL.LJFF && this.LJI == c853090XdL.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyEmailCodeActionParams(email=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inputMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPastedUsingToolTip=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentInputType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", oclCheckboxChecked=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C853090XdL(String str, String str2, String str3, String str4, boolean z, EnumC1237100iIW enumC1237100iIW) {
        this(str, str2, str3, str4, z, enumC1237100iIW, false);
    }

    public C853090XdL(String str, String str2, String str3, String str4, boolean z, EnumC1237100iIW enumC1237100iIW, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = enumC1237100iIW;
        this.LJI = z2;
    }
}
