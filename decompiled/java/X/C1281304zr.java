package X;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281304zr {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281304zr)) {
            return false;
        }
        C1281304zr c1281304zr = (C1281304zr) obj;
        return Intrinsics.LJFF(this.LIZ, c1281304zr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1281304zr.LIZIZ) && this.LIZJ == c1281304zr.LIZJ && this.LIZLLL == c1281304zr.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingJump(storedId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetEpisodeVideoId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", offsetMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", createdElapsedMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281304zr(String str, String str2, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = jElapsedRealtime;
    }
}
