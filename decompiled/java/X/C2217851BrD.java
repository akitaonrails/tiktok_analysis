package X;

import android.media.AudioTrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.1BrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217851BrD {
    public final long[] LIZ;
    public AudioTrack LIZIZ;
    public C2217861BrE LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public Method LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ() {
        /*
            r12 = this;
            android.media.AudioTrack r4 = r12.LIZIZ
            long r1 = r12.LJIIZILJ
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = 0
            if (r0 == 0) goto L2c
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r0 = r12.LJIIZILJ
            long r2 = r2 - r0
            int r0 = r12.LIZLLL
            long r0 = (long) r0
            long r2 = r2 * r0
            long r2 = r2 / r10
            long r2 = r2 + r8
            long r8 = java.lang.Math.min(r8, r2)
        L26:
            long r8 = r8 * r10
            int r0 = r12.LIZLLL
            long r0 = (long) r0
            long r8 = r8 / r0
            return r8
        L2c:
            if (r4 == 0) goto L26
            int r3 = r4.getPlayState()
            r0 = 1
            if (r3 == r0) goto L26
            int r0 = r4.getPlaybackHeadPosition()
            long r4 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            boolean r0 = r12.LJ
            if (r0 == 0) goto L52
            r0 = 2
            if (r3 != r0) goto L4f
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L4f
            long r0 = r12.LJIIL
            r12.LJIILJJIL = r0
        L4f:
            long r0 = r12.LJIILJJIL
            long r4 = r4 + r0
        L52:
            int r1 = X.C1285020jXo.LIZ
            r0 = 28
            if (r1 > r0) goto L76
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L74
            long r1 = r12.LJIIL
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = 3
            if (r3 != r0) goto L74
            long r1 = r12.LJIJ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L71
            long r0 = android.os.SystemClock.elapsedRealtime()
            r12.LJIJ = r0
        L71:
            long r8 = r12.LJIIL
            goto L26
        L74:
            r12.LJIJ = r6
        L76:
            long r1 = r12.LJIIL
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L83
            long r2 = r12.LJIILIIL
            r0 = 1
            long r2 = r2 + r0
            r12.LJIILIIL = r2
        L83:
            r12.LJIIL = r4
            long r1 = r12.LJIILIIL
            r0 = 32
            long r1 = r1 << r0
            long r8 = r4 + r1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2217851BrD.LIZ():long");
    }

    public C2217851BrD() {
        if (C1285020jXo.LIZ >= 18) {
            try {
                this.LJIIIIZZ = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZ = new long[10];
    }

    public final void LIZIZ(AudioTrack audioTrack, int i, int i2, int i3) {
        boolean z;
        long j;
        this.LIZIZ = audioTrack;
        this.LIZJ = new C2217861BrE(audioTrack);
        int sampleRate = audioTrack.getSampleRate();
        this.LIZLLL = sampleRate;
        boolean z2 = true;
        if (C1285020jXo.LIZ < 23 && (i == 5 || i == 6)) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        if (i != 3 && i != 2 && i != Integer.MIN_VALUE && i != 1073741824 && i != 4) {
            z2 = false;
        }
        this.LJIIJ = z2;
        if (z2) {
            j = (((long) (i3 / i2)) * 1000000) / ((long) sampleRate);
        } else {
            j = -9223372036854775807L;
        }
        this.LJFF = j;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIIZILJ = -9223372036854775807L;
        this.LJIJ = -9223372036854775807L;
        this.LJIIIZ = 0L;
    }
}
