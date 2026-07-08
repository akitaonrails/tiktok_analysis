package X;

import com.bytedance.otis.resource.psi.proc.MainSchedNative;

/* JADX INFO: renamed from: X.1Dz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273661Dz2 {
    public final int LIZ;
    public final C08NV LIZIZ;
    public final long[] LIZJ = new long[7];
    public volatile boolean LIZLLL;

    public C2273661Dz2(int i) {
        this.LIZ = i;
        this.LIZIZ = new C08NV(i);
    }

    public final synchronized boolean LIZ(C2273671Dz3 c2273671Dz3) {
        c2273671Dz3.LIZ = -1L;
        c2273671Dz3.LIZIZ = -1L;
        c2273671Dz3.LIZJ = -1L;
        c2273671Dz3.LIZLLL = -1L;
        c2273671Dz3.LJ = -1L;
        c2273671Dz3.LJFF = -1L;
        c2273671Dz3.LJI = -1L;
        if (this.LIZLLL && MainSchedNative.LIZJ(this.LIZ, this.LIZJ)) {
            long[] jArr = this.LIZJ;
            long j = jArr[0];
            c2273671Dz3.LIZ = j;
            c2273671Dz3.LIZIZ = jArr[1];
            c2273671Dz3.LIZJ = jArr[2];
            c2273671Dz3.LJFF = jArr[3];
            c2273671Dz3.LJI = jArr[4];
            c2273671Dz3.LIZLLL = jArr[5];
            c2273671Dz3.LJ = jArr[6];
            if (j >= 0) {
                return true;
            }
        }
        C2097208Jm c2097208JmLIZ = this.LIZIZ.LIZ();
        if (c2097208JmLIZ == null) {
            return false;
        }
        c2273671Dz3.LIZ = c2097208JmLIZ.LIZ;
        c2273671Dz3.LJ = c2097208JmLIZ.LIZIZ;
        return true;
    }
}
