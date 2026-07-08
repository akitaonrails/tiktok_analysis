package X;

import com.ss.ttlivestreamer.core.opengl.VideoColorRange;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274780jHI {
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LIZ = -1;
    public int LJ = -1;

    public final synchronized void LIZ(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = this.LIZ;
        if (i3 != 0 && this.LIZJ < 10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LIZIZ < 10000) {
                return;
            }
            this.LIZIZ = jCurrentTimeMillis;
            int iCheckYuvFrameColorRange = VideoColorRange.checkYuvFrameColorRange(byteBuffer, i, i2);
            if (iCheckYuvFrameColorRange == 0 || iCheckYuvFrameColorRange == 1) {
                this.LIZ = iCheckYuvFrameColorRange;
            }
            this.LIZJ++;
            this.LIZLLL += System.currentTimeMillis() - jCurrentTimeMillis;
            return;
        }
        if (this.LJ != i3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remote yuv color range ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(" maybe error, change to ");
            sbLIZ.append(this.LIZ);
            AVLog.logKibana(5, "RemoteYuvColorRangeReporter", C2188811AlT.LIZIZ(sbLIZ), null);
            this.LJ = this.LIZ;
        }
    }
}
