package X;

import Y.ARunnableS31S0101000_20;
import android.graphics.Matrix;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1271940jCi implements Runnable {
    public final /* synthetic */ int[] LL;
    public final /* synthetic */ Bundle LLILLJJLI = null;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Matrix LLIZ;
    public final /* synthetic */ InterfaceC1268620j7M LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ C1270350jA9 LLJILJIL;

    public final void LIZIZ() {
        C1270350jA9 c1270350jA9 = this.LLJILJIL;
        if (c1270350jA9.LLJ != 1) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mStatus ");
                sbLIZ.append(this.LLJILJIL.LLJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ExternalVideoCapturer drop frame: ");
                sbLIZ2.append(strLIZIZ);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2), null, 7, 10000);
            }
            this.LL[0] = -1;
            return;
        }
        if (c1270350jA9.LLJILJILJ == null && !c1270350jA9.LLJJ && this.LLJILJIL.LLJI) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("!mBufferAlreadyReturn ");
                sbLIZ3.append(!this.LLJILJIL.LLJJ);
                sbLIZ3.append(", mSigBufferMode ");
                sbLIZ3.append(this.LLJILJIL.LLJI);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ExternalVideoCapturer drop frame: ");
                sbLIZ4.append(strLIZIZ2);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ4), null, 8, 10000);
            }
            this.LL[0] = -2;
            return;
        }
        Bundle bundle = this.LLILLJJLI;
        RoiInfo roiInfo = (bundle == null || bundle.containsKey("isAvaterPush")) ? null : new RoiInfo(((Integer) LIZ(this.LLILLJJLI, "roi_center_pos_x")).intValue(), ((Integer) LIZ(this.LLILLJJLI, "roi_center_pos_y")).intValue(), ((Integer) LIZ(this.LLILLJJLI, "roi_width")).intValue(), ((Integer) LIZ(this.LLILLJJLI, "roi_height")).intValue(), ((Float) LIZ(this.LLILLJJLI, "roi_yaw")).floatValue(), ((Float) LIZ(this.LLILLJJLI, "roi_pitch")).floatValue(), ((Float) LIZ(this.LLILLJJLI, "roi_roll")).floatValue());
        EnumC1273550jFJ enumC1273550jFJ = this.LLILLL ? EnumC1273550jFJ.OES : EnumC1273550jFJ.RGB;
        int i = this.LLILZ;
        ARunnableS31S0101000_20 aRunnableS31S0101000_20 = new ARunnableS31S0101000_20(i, this, 18);
        C1271780jCS c1271780jCS = this.LLJILJIL.LLILZ;
        k kVarLJ = c1271780jCS != null ? c1271780jCS.LJ(this.LLILZIL, this.LLILZLL, enumC1273550jFJ, i, this.LLIZ, this.LLIZLLLIL, aRunnableS31S0101000_20) : C1271950jCj.LIZ(this.LLILZIL, this.LLILZLL, enumC1273550jFJ, i, this.LLIZ, this.LLIZLLLIL, aRunnableS31S0101000_20, null);
        this.LLJILJIL.LLJJ = false;
        if (kVarLJ == null) {
            aRunnableS31S0101000_20.run();
            return;
        }
        kVarLJ.updateCaptureMs(this.LLJ);
        kVarLJ.updateCaptureServerNtpMs(this.LLJI);
        kVarLJ.setROIInfo(roiInfo);
        this.LL[0] = this.LLJILJIL.LLJ(kVarLJ, this.LLILZIL, this.LLILZLL, 0, this.LLJIJIL);
        kVarLJ.release();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$4");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$4");
    }

    public static Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public RunnableC1271940jCi(C1270350jA9 c1270350jA9, int[] iArr, boolean z, int i, int i2, int i3, Matrix matrix, InterfaceC1268620j7M interfaceC1268620j7M, long j, long j2, long j3) {
        this.LLJILJIL = c1270350jA9;
        this.LL = iArr;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = matrix;
        this.LLIZLLLIL = interfaceC1268620j7M;
        this.LLJ = j;
        this.LLJI = j2;
        this.LLJIJIL = j3;
    }
}
