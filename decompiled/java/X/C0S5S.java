package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5S implements C164G {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5S)) {
            return false;
        }
        C0S5S c0s5s = (C0S5S) obj;
        return Intrinsics.LJFF(this.LIZ, c0s5s.LIZ) && this.LIZIZ == c0s5s.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0s5s.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTitleData(photoTitleTranslation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5S(String str, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
    }
}
