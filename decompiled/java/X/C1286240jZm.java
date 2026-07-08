package X;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286240jZm {
    public static String LJIL;
    public static String LJJ;
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int[] LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final InterfaceC1286300jZs LJII;
    public VEFrame LJIIIIZZ;
    public VEFrame LJIIIZ;
    public VEFrame LJIIJ;
    public VEFrame LJIIJJI;
    public MediaCodec LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public HandlerThread LJIILLIIL;
    public HandlerThread LJIIZILJ;
    public ImageReader LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;

    public final void LIZJ() {
        this.LJIJJ = true;
        String str = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processFrameLast begin hasProcessCount:");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(" ptsMsLength: ");
        sbLIZ.append(this.LIZLLL.length);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        while (this.LJIJI < this.LIZLLL.length * this.LJI) {
            String str2 = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processFrameLast processing hasProcxessCount:");
            sbLIZ2.append(this.LJIJI);
            sbLIZ2.append(" ptsMsLength: ");
            sbLIZ2.append(this.LIZLLL.length);
            C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LJII.processFrame(null, this.LJ, this.LJFF, 0)) {
                String str3 = this.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("processFrameLast stop hasProcxessCount:");
                sbLIZ3.append(this.LJIJI);
                sbLIZ3.append(" ptsMsLength: ");
                sbLIZ3.append(this.LIZLLL.length);
                C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            this.LJIJI += this.LJI;
        }
    }

    public static void LJ() {
        if (LJIL == null || LJJ == null) {
            String lowerCase = C1286290jZr.LIZ().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                LJIL = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    LJJ = "sdm660";
                    return;
                }
                if (lowerCase.contains("msm8994")) {
                    LJJ = "msm8994";
                    return;
                }
                if (lowerCase.contains("sdm845")) {
                    LJJ = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    LJJ = "sm8150";
                } else {
                    LJJ = "";
                }
            }
        }
    }

    public final void LIZ() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.LJ * this.LJFF * 4);
        byteBufferAllocateDirect.clear();
        this.LJIIIIZZ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect, this.LJ, this.LJFF, 0, 0L, EnumC2185621AgK.TEPixFmt_ARGB8);
    }

    public final void LIZLLL() {
        try {
            C2484209oO.LJI(this.LIZIZ, "stop begin");
            if (this.LJIJ != null) {
                this.LJIIL.reset();
                this.LJIIL.release();
            }
            ImageReader imageReader = this.LJIJ;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.LJIIZILJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            HandlerThread handlerThread2 = this.LJIILLIIL;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI(this.LIZIZ, "stop crash");
            LIZJ();
        }
    }

    public final void LIZIZ(int i, int i2, int i3, ByteBuffer byteBuffer) {
        String str = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processFrame right begin hasProcxessCount:");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(" ptsMsLength: ");
        sbLIZ.append(this.LIZLLL.length);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIJI < this.LIZLLL.length * this.LJI && !this.LJIJJ) {
            String str2 = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processFrame right process hasProcxessCount:");
            sbLIZ2.append(this.LJIJI);
            sbLIZ2.append(" ptsMsLength: ");
            sbLIZ2.append(this.LIZLLL.length);
            sbLIZ2.append(" width ");
            sbLIZ2.append(i);
            sbLIZ2.append(" height ");
            sbLIZ2.append(i2);
            sbLIZ2.append("ptsMs:");
            sbLIZ2.append(i3);
            C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LJII.processFrame(byteBuffer, i, i2, i3)) {
                String str3 = this.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("processFrame right stop hasProcxessCount:");
                sbLIZ3.append(this.LJIJI);
                sbLIZ3.append(" ptsMsLength: ");
                sbLIZ3.append(this.LIZLLL.length);
                C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ3));
                this.LJIJJ = true;
                LIZLLL();
            }
            this.LJIJI++;
        }
    }

    public C1286240jZm(String str, int[] iArr, int i, int i2, int i3, int i4, C1286260jZo c1286260jZo) {
        long id = C786410Ut5.u3().getId();
        this.LIZ = id;
        this.LIZIZ = "HwFrameExtractor_";
        this.LJIIL = null;
        this.LJIJI = 0;
        this.LJIJJ = false;
        this.LJIJJLI = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HwFrameExtractor_");
        sbLIZ.append(i4);
        sbLIZ.append("_");
        sbLIZ.append(id);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = str;
        this.LIZLLL = iArr;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = c1286260jZo;
        try {
            LIZ();
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJIIIIZZ(this.LIZIZ, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                LIZ();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LIZJ();
                return;
            }
        }
        this.LIZLLL = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.LIZLLL[i5] = iArr[i5] * LSPassThroughRecordSizeConfig.DEFAULT;
            String str2 = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ptsMS: ");
            sbLIZ2.append(this.LIZLLL[i5]);
            C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
