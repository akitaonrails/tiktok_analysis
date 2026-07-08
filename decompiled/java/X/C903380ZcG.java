package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903380ZcG implements C164G {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903380ZcG)) {
            return false;
        }
        C903380ZcG c903380ZcG = (C903380ZcG) obj;
        return Intrinsics.LJFF(this.LIZ, c903380ZcG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c903380ZcG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c903380ZcG.LIZJ) && this.LIZLLL == c903380ZcG.LIZLLL && this.LJ == c903380ZcG.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizCompData(bizCompText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textLanguage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", detectedSrcLang=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", manualTranslate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903380ZcG(String str, String str2, String str3, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
