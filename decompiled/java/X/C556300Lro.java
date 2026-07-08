package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0Lro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556300Lro {
    public final long LIZ;
    public final long LIZIZ;

    public C556300Lro() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HappenTime(absoluteTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", systemTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C556300Lro(int i) {
        this(System.currentTimeMillis(), SystemClock.uptimeMillis());
    }

    public C556300Lro(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
