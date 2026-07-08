package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0V9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793250V9v {
    public final C0V9Z LIZ;
    public boolean LIZIZ;
    public long LIZJ;

    public final boolean LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LIZJ;
        if (j == 0 || jElapsedRealtime - j >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            this.LIZJ = jElapsedRealtime;
            C0VA1 c0va1 = (C0VA1) this.LIZ;
            float f = c0va1.LIZIZ.LJFF;
            int iLIZIZ = c0va1.LIZIZ();
            int iLJFF = ((C0VA1) this.LIZ).LJFF();
            ((C0VA1) this.LIZ).LJFF.getClass();
            boolean z = f <= ((float) 37);
            ((C0VA1) this.LIZ).LJFF.getClass();
            if (iLIZIZ < 30) {
                z = false;
            }
            boolean z2 = iLJFF != 1 ? z : false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCpuSampleEnvironment:");
            sbLIZ.append(z2);
            sbLIZ.append(", temp:");
            sbLIZ.append(f);
            sbLIZ.append(", level:");
            sbLIZ.append(iLIZIZ);
            sbLIZ.append(", powerSave:");
            sbLIZ.append(iLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z3 = C2040807z4.LIZ;
            this.LIZIZ = z2;
        }
        return this.LIZIZ;
    }

    public C793250V9v(C0V9Z c0v9z) {
        this.LIZ = c0v9z;
    }
}
