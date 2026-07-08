package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TBF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBF implements C0TBE {
    public final String LIZ;
    public final boolean LIZIZ;

    public C0TBF() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TBF)) {
            return false;
        }
        C0TBF c0tbf = (C0TBF) obj;
        return Intrinsics.LJFF(this.LIZ, c0tbf.LIZ) && this.LIZIZ == c0tbf.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Countdown(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPhotoMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TBF(boolean z, int i) {
        String str;
        if ((i & 1) != 0) {
            str = "countdown";
        } else {
            str = null;
        }
        z = (i & 2) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
