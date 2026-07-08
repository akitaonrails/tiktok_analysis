package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TBD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBD implements C0TBE {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C0TBD() {
        this(null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TBD)) {
            return false;
        }
        C0TBD c0tbd = (C0TBD) obj;
        return Intrinsics.LJFF(this.LIZ, c0tbd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0tbd.LIZIZ) && this.LIZJ == c0tbd.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preview(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previousCanceledFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clearPreviousState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TBD(String str, boolean z, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "preview";
        } else {
            str2 = null;
        }
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = str2;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
