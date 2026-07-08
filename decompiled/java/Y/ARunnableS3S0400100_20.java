package Y;

import X.C013C;
import X.C1272590jDl;
import X.C1273620jFQ;
import X.C1273630jFR;
import X.C1C7U;
import X.C1DJ6;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C238400w2;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.lyrax.video.RenderReportSetting;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS3S0400100_20 implements Runnable {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Push open task cost: ");
        sbLIZ.append(System.currentTimeMillis() - this.j4);
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        ((b0) this.l3).open((TECameraCapture) this.l0, (C1DJ6) this.l1, (Cert) this.l2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Camera open cost: ");
        sbLIZ2.append(System.currentTimeMillis() - this.j4);
        sbLIZ2.append("ms");
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void run$0(ARunnableS3S0400100_20 aRunnableS3S0400100_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.open$1");
        try {
            aRunnableS3S0400100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.open$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS3S0400100_20 r19) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS3S0400100_20.run$1(Y.ARunnableS3S0400100_20):void");
    }

    public static final void run$2(ARunnableS3S0400100_20 aRunnableS3S0400100_20) {
        C1273630jFR c1273630jFR = (C1273630jFR) aRunnableS3S0400100_20.l0;
        C238400w2 c238400w2 = (C238400w2) aRunnableS3S0400100_20.l1;
        C1273620jFQ c1273620jFQ = (C1273620jFQ) aRunnableS3S0400100_20.l2;
        C1272590jDl c1272590jDl = (C1272590jDl) aRunnableS3S0400100_20.l3;
        long j = aRunnableS3S0400100_20.j4;
        C1C7U.LIZ("RenderCostManager@5343.updatePipeline$1L");
        long j2 = c238400w2.element;
        c1273630jFR.LIZJ = j2;
        c1273630jFR.LIZLLL += j2;
        c1273620jFQ.getClass();
        if (c1273630jFR.LIZJ > c1273620jFQ.LIZ.normalJankThreshold) {
            C013C c013c = new C013C();
            long j3 = c1273630jFR.LIZJ;
            RenderReportSetting renderReportSetting = c1273620jFQ.LIZ;
            if (j3 > renderReportSetting.seriousJankThreshold) {
                c1273630jFR.LJFF++;
                c013c.element = true;
            } else if (j3 > renderReportSetting.normalJankThreshold) {
                c1273630jFR.LJ++;
            }
            if (renderReportSetting.enableFrameJankReport) {
                c1273620jFQ.LJII.post(new ARunnableS28S0400000_20(c1273620jFQ, c1273630jFR, c1272590jDl, true, c013c, 17));
            }
        }
        long j4 = c1273630jFR.LIZIZ;
        long j5 = 0;
        if (j4 > 0) {
            j5 = j - j4;
        }
        c1273630jFR.LJI = j5;
        c1273630jFR.LJII += j5;
        c1273630jFR.LJIIIIZZ++;
        c1273630jFR.LIZIZ = j;
        C1C7U.LIZIZ("RenderCostManager@5343.updatePipeline$1L");
    }

    public ARunnableS3S0400100_20(Object obj, long j, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.j4 = j;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
