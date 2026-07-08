package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZX6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZX6 implements C0ZX0 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZX6)) {
            return false;
        }
        C0ZX6 c0zx6 = (C0ZX6) obj;
        return Intrinsics.LJFF(this.LIZ, c0zx6.LIZ) && this.LIZIZ == c0zx6.LIZIZ && this.LIZJ == c0zx6.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paused(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentPlaybackTimeMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZX6(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
