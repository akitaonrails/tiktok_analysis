package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551710LkP {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551710LkP)) {
            return false;
        }
        C551710LkP c551710LkP = (C551710LkP) obj;
        return Intrinsics.LJFF(this.LIZ, c551710LkP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551710LkP.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VOfflineProcessingTemplateDownloadInput(templateType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateResourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551710LkP(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
