package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017870cav extends AbstractC1017850cat {
    public final float LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017870cav)) {
            return false;
        }
        C1017870cav c1017870cav = (C1017870cav) obj;
        return Float.compare(this.LIZ, c1017870cav.LIZ) == 0 && this.LIZIZ == c1017870cav.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1017870cav.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressChange(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C1017870cav(long j, String str, float f) {
        this.LIZ = f;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
