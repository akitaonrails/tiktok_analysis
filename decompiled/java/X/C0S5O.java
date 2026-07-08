package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5O, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5O implements C164G {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5O)) {
            return false;
        }
        C0S5O c0s5o = (C0S5O) obj;
        return Intrinsics.LJFF(this.LIZ, c0s5o.LIZ) && this.LIZIZ == c0s5o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0s5o.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0s5o.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DubbingData(languageCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", voiceType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5O(String str, boolean z, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
