package X;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877607Xa implements InterfaceC20186313yf {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1877607Xa)) {
            return false;
        }
        C1877607Xa c1877607Xa = (C1877607Xa) obj;
        return Intrinsics.LJFF(this.LIZ, c1877607Xa.LIZ) && this.LIZIZ == c1877607Xa.LIZIZ && this.LIZJ == c1877607Xa.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Completed(realPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expectedSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", at=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877607Xa(String str, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = jElapsedRealtime;
    }
}
