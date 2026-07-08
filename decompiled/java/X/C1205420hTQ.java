package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0hTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205420hTQ {
    public long LIZ = SystemClock.elapsedRealtime();
    public boolean LIZIZ;

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJIJL("homepage_nearby");
        c1386470mBR.LJL = "click_nearby_card";
        c1386470mBR.LJJLIIIJ = String.valueOf(SystemClock.elapsedRealtime() - this.LIZ);
        c1386470mBR.LJIILJJIL();
    }
}
