package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0otk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1490820otk {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int[] LJI;
    public final AtomicInteger LJII;
    public final AtomicInteger LJIIIIZZ;
    public boolean LJIIIZ;
    public final AtomicLong LJIIJ;
    public boolean LJIIJJI;

    public final boolean LIZ(int i, int i2, long j, boolean z) {
        if (!this.LJIIJJI) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(this.LIZ, "RetryScheduler", "canRetry", "IsWaitingRetry is false, return false");
            }
            return false;
        }
        if (this.LIZIZ < i || this.LJIIIIZZ.get() >= this.LIZJ) {
            return false;
        }
        if (this.LJIIIZ && i2 != 2) {
            return false;
        }
        if (!z && j - this.LJIIJ.get() < this.LIZLLL) {
            return false;
        }
        return true;
    }

    public C1490820otk(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        i4 = i4 < 3000 ? LivePreCreateNextRoomPlayer.ENABLE : i4;
        i5 = i5 < 5000 ? 5000 : i5;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = false;
        this.LJI = iArr;
        this.LJII = new AtomicInteger(i4);
        this.LJIIJ = new AtomicLong(0L);
        this.LJIIIIZZ = new AtomicInteger(0);
    }
}
