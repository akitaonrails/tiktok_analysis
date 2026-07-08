package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207047160f implements C164G {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207047160f)) {
            return false;
        }
        C207047160f c207047160f = (C207047160f) obj;
        return this.LIZ == c207047160f.LIZ && this.LIZIZ == c207047160f.LIZIZ && Intrinsics.LJFF(this.LIZJ, c207047160f.LIZJ) && this.LIZLLL == c207047160f.LIZLLL && Intrinsics.LJFF(this.LJ, c207047160f.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str2 = this.LJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionData(subID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", languageCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", realtimeTranslation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", realtimeFilePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C207047160f(String str, int i, String str2, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = z2;
        this.LJ = str2;
    }
}
