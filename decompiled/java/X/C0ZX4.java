package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZX4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZX4 implements C0ZX0 {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZX4)) {
            return false;
        }
        C0ZX4 c0zx4 = (C0ZX4) obj;
        return Intrinsics.LJFF(this.LIZ, c0zx4.LIZ) && this.LIZIZ == c0zx4.LIZIZ && this.LIZJ == c0zx4.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Playing(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZX4(String str, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
