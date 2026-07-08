package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0meo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404680meo {
    public final long LIZ;
    public final long LIZIZ;

    public C1404680meo() {
        this(0);
    }

    public C1404680meo(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LIZ = jCurrentTimeMillis;
        this.LIZIZ = jUptimeMillis;
    }
}
