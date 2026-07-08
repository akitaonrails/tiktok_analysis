package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853080XdK implements InterfaceC853100XdM {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final EnumC1237100iIW LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C853080XdK)) {
            return false;
        }
        C853080XdK c853080XdK = (C853080XdK) obj;
        return Intrinsics.LJFF(this.LIZ, c853080XdK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c853080XdK.LIZIZ) && this.LIZJ == c853080XdK.LIZJ && this.LIZLLL == c853080XdK.LIZLLL && this.LJ == c853080XdK.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyPhoneCodeActionParams(phone=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPastedUsingToolTip=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentInputType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", oclCheckboxChecked=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C853080XdK(String str, String str2, boolean z, EnumC1237100iIW enumC1237100iIW, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = enumC1237100iIW;
        this.LJ = z2;
    }
}
