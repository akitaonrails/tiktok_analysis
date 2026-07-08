package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0YIK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIK {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final C0YIV LJFF;

    public C0YIK(int i, long j, int i2, long j2, C0YIV c0yiv, int i3) {
        i = (i3 & 1) != 0 ? 3 : i;
        j = (i3 & 2) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        j2 = (i3 & 8) != 0 ? 2000L : j2;
        c0yiv = (i3 & 32) != 0 ? new C0YIV(C13BV.INSTANCE, 1, 1500L) : c0yiv;
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = i2;
        this.LIZLLL = j2;
        this.LJ = 0L;
        this.LJFF = c0yiv;
    }
}
