package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kAC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308820kAC {
    public final byte[] LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1308820kAC)) {
            return false;
        }
        C1308820kAC c1308820kAC = (C1308820kAC) obj;
        return Intrinsics.LJFF(this.LIZ, c1308820kAC.LIZ) && this.LIZIZ == c1308820kAC.LIZIZ && this.LIZJ == c1308820kAC.LIZJ && C19990113Jj.LJII(this.LIZLLL, c1308820kAC.LIZLLL) && C19990113Jj.LJII(this.LJ, c1308820kAC.LJ) && C19990113Jj.LJII(this.LJFF, c1308820kAC.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkEvent(data=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", isLast=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", headerElapsed=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZLLL));
        sbLIZ.append(", bodyElapsed=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LJ));
        sbLIZ.append(", networkElapsed=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LJFF));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Arrays.hashCode(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public C1308820kAC(byte[] bArr, boolean z, long j, long j2, long j3, long j4) {
        this.LIZ = bArr;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
    }
}
