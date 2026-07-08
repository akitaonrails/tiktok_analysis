package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842790X4j {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C842790X4j)) {
            return false;
        }
        C842790X4j c842790X4j = (C842790X4j) obj;
        return Intrinsics.LJFF(this.LIZ, c842790X4j.LIZ) && this.LIZIZ == c842790X4j.LIZIZ && this.LIZJ == c842790X4j.LIZJ && this.LIZLLL == c842790X4j.LIZLLL && this.LJ == c842790X4j.LJ && this.LJFF == c842790X4j.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KidsDfInstallParams(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showRelaunchPopupBeforeInstall=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryOnFailureWithBackoff=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showLogoutDialogOnHardFailure=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", maxInstallAttempts=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", silentPluginInstall=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C842790X4j(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = i;
        this.LJFF = z4;
    }
}
