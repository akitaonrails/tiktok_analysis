package X;

import Y.ARunnableS31S0101000_20;
import android.graphics.Matrix;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1271930jCh implements Runnable {
    public final /* synthetic */ int[] LL;
    public final /* synthetic */ float[] LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1268620j7M LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ C1270350jA9 LLJILJILJ;

    public final void LIZIZ() {
        Matrix matrix;
        C1270350jA9 c1270350jA9 = this.LLJILJILJ;
        if (c1270350jA9.LLJ != 1) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mStatus ");
                sbLIZ.append(this.LLJILJILJ.LLJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ExternalVideoCapturer drop frame: ");
                sbLIZ2.append(strLIZIZ);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2), null, 9, 10000);
            }
            this.LL[0] = -1;
            return;
        }
        if (c1270350jA9.LLJILJILJ == null && !c1270350jA9.LLJJ && this.LLJILJILJ.LLJI) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("!mBufferAlreadyReturn ");
                sbLIZ3.append(!this.LLJILJILJ.LLJJ);
                sbLIZ3.append(", mSigBufferMode ");
                sbLIZ3.append(this.LLJILJILJ.LLJI);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ExternalVideoCapturer drop frame: ");
                sbLIZ4.append(strLIZIZ2);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ4), null, 0, 10000);
            }
            this.LL[0] = -2;
            return;
        }
        float[] fArr = this.LLILLJJLI;
        RoiInfo roiInfo = null;
        Matrix matrixLIZJ = fArr != null ? C1273010jER.LIZJ(0, fArr) : null;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        if (i % 180 != 0) {
            i3 = i2;
            i2 = i3;
        }
        if (C1273520jFG.LIZJ) {
            C1270350jA9 c1270350jA92 = this.LLJILJILJ;
            C1271960jCk c1271960jCk = c1270350jA92.LLJJIJI;
            boolean z = c1270350jA92.LLJJI;
            boolean z2 = c1270350jA92.LLJJIII;
            if (!c1271960jCk.LJFF || c1271960jCk.LIZIZ != i || c1271960jCk.LIZJ != z || c1271960jCk.LIZLLL != z2 || ((matrixLIZJ != null || c1271960jCk.LJ != null) && !Intrinsics.LJFF(matrixLIZJ, c1271960jCk.LJ))) {
                c1271960jCk.LJFF = true;
                c1271960jCk.LIZIZ = i;
                c1271960jCk.LIZJ = z;
                c1271960jCk.LIZLLL = z2;
                c1271960jCk.LJ = matrixLIZJ == null ? null : new Matrix(matrixLIZJ);
                Matrix matrix2 = c1271960jCk.LIZ;
                matrix2.reset();
                matrix2.preTranslate(0.5f, 0.5f);
                matrix2.preRotate(-i);
                matrix2.preScale(z ? -1.0f : 1.0f, z2 ? -1.0f : 1.0f);
                matrix2.preTranslate(-0.5f, -0.5f);
                if (matrixLIZJ != null) {
                    matrix2.preConcat(matrixLIZJ);
                }
            }
            matrix = this.LLJILJILJ.LLJJIJI.LIZ;
        } else {
            matrix = new Matrix();
            matrix.reset();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(-i);
            C1270350jA9 c1270350jA93 = this.LLJILJILJ;
            matrix.preScale(c1270350jA93.LLJJI ? -1.0f : 1.0f, c1270350jA93.LLJJIII ? -1.0f : 1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            if (matrixLIZJ != null) {
                matrix.preConcat(matrixLIZJ);
            }
        }
        Bundle bundle = this.LLILZLL;
        if (bundle != null && !bundle.containsKey("isAvaterPush")) {
            roiInfo = new RoiInfo(((Integer) LIZ(this.LLILZLL, "roi_center_pos_x")).intValue(), ((Integer) LIZ(this.LLILZLL, "roi_center_pos_y")).intValue(), ((Integer) LIZ(this.LLILZLL, "roi_width")).intValue(), ((Integer) LIZ(this.LLILZLL, "roi_height")).intValue(), ((Float) LIZ(this.LLILZLL, "roi_yaw")).floatValue(), ((Float) LIZ(this.LLILZLL, "roi_pitch")).floatValue(), ((Float) LIZ(this.LLILZLL, "roi_roll")).floatValue());
        }
        EnumC1273550jFJ enumC1273550jFJ = this.LLIZ ? EnumC1273550jFJ.OES : EnumC1273550jFJ.RGB;
        int i4 = this.LLIZLLLIL;
        ARunnableS31S0101000_20 aRunnableS31S0101000_20 = new ARunnableS31S0101000_20(i4, this, 20);
        C1271780jCS c1271780jCS = this.LLJILJILJ.LLILZ;
        k kVarLJ = c1271780jCS != null ? c1271780jCS.LJ(i2, i3, enumC1273550jFJ, i4, matrix, this.LLJ, aRunnableS31S0101000_20) : C1271950jCj.LIZ(i2, i3, enumC1273550jFJ, i4, matrix, this.LLJ, aRunnableS31S0101000_20, null);
        this.LLJILJILJ.LLJJ = false;
        if (kVarLJ == null) {
            aRunnableS31S0101000_20.run();
            return;
        }
        kVarLJ.setROIInfo(roiInfo);
        kVarLJ.updateCaptureMs(this.LLJI);
        kVarLJ.updateCaptureServerNtpMs(this.LLJIJIL);
        this.LL[0] = this.LLJILJILJ.LLJ(kVarLJ, i2, i3, 0, this.LLJILJIL);
        kVarLJ.release();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$5");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$5");
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

    public RunnableC1271930jCh(C1270350jA9 c1270350jA9, int[] iArr, float[] fArr, int i, int i2, int i3, Bundle bundle, boolean z, int i4, InterfaceC1268620j7M interfaceC1268620j7M, long j, long j2, long j3) {
        this.LLJILJILJ = c1270350jA9;
        this.LL = iArr;
        this.LLILLJJLI = fArr;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = bundle;
        this.LLIZ = z;
        this.LLIZLLLIL = i4;
        this.LLJ = interfaceC1268620j7M;
        this.LLJI = j;
        this.LLJIJIL = j2;
        this.LLJILJIL = j3;
    }
}
