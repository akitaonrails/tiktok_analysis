package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544530LXf {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final C544540LXg LJ;

    public C544530LXf() {
        this(null, 0, null, false, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C544530LXf)) {
            return false;
        }
        C544530LXf c544530LXf = (C544530LXf) obj;
        return Intrinsics.LJFF(this.LIZ, c544530LXf.LIZ) && this.LIZIZ == c544530LXf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c544530LXf.LIZJ) && this.LIZLLL == c544530LXf.LIZLLL && Intrinsics.LJFF(this.LJ, c544530LXf.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C544540LXg c544540LXg = this.LJ;
        return iHashCode2 + (c544540LXg != null ? c544540LXg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowInputItem(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRemoteResource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", legacyImageInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C544530LXf(String str, int i, String str2, boolean z, C544540LXg c544540LXg, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? 2 : i;
        str2 = (i2 & 4) != 0 ? null : str2;
        z = (i2 & 8) != 0 ? false : z;
        c544540LXg = (i2 & 16) != 0 ? null : c544540LXg;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = c544540LXg;
    }
}
