package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0bRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973750bRl {
    public long LIZ;
    public long LIZIZ;

    public final long LIZ() {
        return this.LIZIZ > 0 ? SystemClock.elapsedRealtime() - this.LIZIZ : this.LIZ;
    }

    public final void LIZIZ() {
        if (this.LIZIZ == 0) {
            this.LIZIZ = SystemClock.elapsedRealtime();
        }
    }

    public final void LIZJ() {
        if (this.LIZIZ > 0) {
            this.LIZ = SystemClock.elapsedRealtime() - this.LIZIZ;
            this.LIZIZ = 0L;
        }
    }
}
