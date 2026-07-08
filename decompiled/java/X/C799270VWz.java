package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0VWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799270VWz {
    public final long LIZ = 2000;
    public int LIZIZ = 2;
    public float LIZJ = 0.2f;
    public long LIZLLL = Mp4ScreenVideoLoadTimeout.CONTROL;
    public float LJ = 0.5f;
    public int LJFF = 100;
    public long LJI = 2000;
    public int LJII = 3;

    public final C799190VWr LIZ() {
        long j = this.LIZ;
        int i = this.LIZIZ;
        float f = this.LIZJ;
        long j2 = this.LIZLLL;
        float f2 = this.LJ;
        int i2 = this.LJFF;
        long j3 = this.LJI;
        return new C799190VWr(j, i, f, j2, (long) (j2 * f), f2, i2, j3, (long) (j3 * f * f2), this.LJII);
    }

    public C799270VWz(int i) {
    }
}
