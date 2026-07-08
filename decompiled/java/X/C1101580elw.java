package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0elw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101580elw {
    public final C1101590elx[] LIZ;
    public volatile int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final /* synthetic */ C1101570elv LJ;

    public C1101580elw(C1101570elv c1101570elv) {
        this.LJ = c1101570elv;
        C1101590elx[] c1101590elxArr = new C1101590elx[60];
        int i = 0;
        do {
            c1101590elxArr[i] = new C1101590elx();
            i++;
        } while (i < 60);
        this.LIZ = c1101590elxArr;
    }

    public final float LIZ(int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = (jElapsedRealtime / j) - 1;
        long j3 = 60 < i ? 60 : i;
        long j4 = j2 - (this.LJ.LJFF / j);
        if (j3 > j4) {
            j3 = j4;
        }
        float f = 0.0f;
        for (C1101590elx c1101590elx : this.LIZ) {
            if (c1101590elx.LIZ >= j2 - j3 && c1101590elx.LIZ <= j2) {
                f += c1101590elx.LIZIZ;
            }
        }
        return f / j3;
    }

    public final void LIZIZ(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = this.LIZJ;
        if (j3 == j2) {
            this.LIZ[this.LIZIZ].LIZIZ++;
            this.LIZ[this.LIZIZ].LIZ = j2;
        } else if (j2 > j3) {
            this.LIZIZ = (this.LIZIZ + 1) % 60;
            this.LIZ[this.LIZIZ].LIZ = j2;
            this.LIZ[this.LIZIZ].LIZIZ = 1;
        }
        this.LIZJ = j2;
    }

    public final void LIZJ(int i, long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = this.LIZJ;
        if (j3 == j2) {
            this.LIZ[this.LIZIZ].LIZIZ += i;
            this.LIZ[this.LIZIZ].LIZ = j2;
        } else if (j2 > j3) {
            if (this.LIZLLL < this.LIZ[this.LIZIZ].LIZIZ) {
                this.LIZLLL = this.LIZ[this.LIZIZ].LIZIZ;
            }
            this.LIZIZ = (this.LIZIZ + 1) % 60;
            this.LIZ[this.LIZIZ].LIZ = j2;
            this.LIZ[this.LIZIZ].LIZIZ = i;
        }
        this.LIZJ = j2;
    }
}
