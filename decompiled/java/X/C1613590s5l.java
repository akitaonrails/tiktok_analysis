package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0s5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613590s5l {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C1613590s5l() {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }

    public C1613590s5l(long j) {
        this();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j3 = j / j2;
        if ((j ^ j2) < 0 && j2 * j3 != j) {
            j3--;
        }
        long j4 = 60;
        int i = (int) (j3 % j4);
        this.LIZLLL = i;
        long j5 = j3 - ((long) i);
        long j6 = j5 / j4;
        if ((j5 ^ j4) < 0 && j6 * j4 != j5) {
            j6--;
        }
        int i2 = (int) (j6 % j4);
        this.LIZJ = i2;
        long j7 = j6 - ((long) i2);
        long j8 = j7 / j4;
        if ((j7 ^ j4) < 0 && j4 * j8 != j7) {
            j8--;
        }
        long j9 = 24;
        int i3 = (int) (j8 % j9);
        this.LIZIZ = i3;
        long j10 = j8 - ((long) i3);
        long j11 = j10 / j9;
        if ((j10 ^ j9) < 0 && j9 * j11 != j10) {
            j11--;
        }
        this.LIZ = (int) j11;
    }
}
