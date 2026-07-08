package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1Adk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184021Adk {
    public final float LIZ;
    public final int LIZIZ;
    public final C2184041Adm[] LIZJ;
    public final C01GW LIZLLL;
    public volatile int LJ;
    public long LJFF;

    public C2184021Adk(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
        C2184041Adm[] c2184041AdmArr = new C2184041Adm[60];
        int i2 = 0;
        do {
            c2184041AdmArr[i2] = new C2184041Adm(0);
            i2++;
        } while (i2 < 60);
        this.LIZJ = c2184041AdmArr;
        this.LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 7));
    }

    public final float LIZ(C2184041Adm[] c2184041AdmArr, int i) {
        int i2 = i;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - 1;
        int i3 = this.LIZIZ * i2;
        if (60 < i2) {
            i2 = 60;
        }
        int i4 = 0;
        for (C2184041Adm c2184041Adm : c2184041AdmArr) {
            long j = c2184041Adm.LIZ;
            if (j >= jElapsedRealtime - ((long) i2) && j <= jElapsedRealtime) {
                i4 += c2184041Adm.LIZLLL;
            }
        }
        return i4 / i3;
    }

    public final float LIZIZ(C2184041Adm[] c2184041AdmArr, int i) {
        float f;
        int i2 = i;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - 1;
        int i3 = this.LIZIZ * i2;
        if (60 < i2) {
            i2 = 60;
        }
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        for (C2184041Adm c2184041Adm : c2184041AdmArr) {
            long j = c2184041Adm.LIZ;
            if (j >= jElapsedRealtime - ((long) i2) && j <= jElapsedRealtime) {
                int i6 = c2184041Adm.LIZIZ;
                f2 += (i6 * this.LIZIZ) / (i6 + r1);
                i4++;
                i5 += c2184041Adm.LIZJ + i6;
            }
        }
        if (f2 != 0.0f && i4 != 0) {
            f = f2 / i4;
        } else {
            f = this.LIZIZ;
        }
        float fMin = Math.min(i5 / i3, 1.0f);
        int i7 = this.LIZIZ;
        return ((f - i7) * fMin) + i7;
    }

    public final void LIZJ(C2184041Adm[] c2184041AdmArr, long j, int i) {
        long j2 = this.LJFF;
        if (j2 == j) {
            c2184041AdmArr[this.LJ].LIZIZ++;
            c2184041AdmArr[this.LJ].LIZJ += i;
            c2184041AdmArr[this.LJ].LIZ = j;
        } else if (j > j2) {
            c2184041AdmArr[this.LJ].LIZJ = i;
            c2184041AdmArr[this.LJ].LIZIZ = 1;
            c2184041AdmArr[this.LJ].LIZLLL = 0;
            c2184041AdmArr[this.LJ].LIZ = j;
        }
        if (i >= 3) {
            c2184041AdmArr[this.LJ].LIZLLL += i;
        }
    }
}
