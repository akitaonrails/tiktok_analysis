package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2255408sa {
    public final Bitmap LIZ;
    public final int LIZIZ;
    public final C2255508sb LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2255408sa)) {
            return false;
        }
        C2255408sa c2255408sa = (C2255408sa) obj;
        return Intrinsics.LJFF(this.LIZ, c2255408sa.LIZ) && this.LIZIZ == c2255408sa.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2255408sa.LIZJ) && this.LIZLLL == c2255408sa.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameResult(bitmap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", frameIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pts=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2255408sa(Bitmap bitmap, int i, C2255508sb c2255508sb, long j) {
        this.LIZ = bitmap;
        this.LIZIZ = i;
        this.LIZJ = c2255508sb;
        this.LIZLLL = j;
    }
}
