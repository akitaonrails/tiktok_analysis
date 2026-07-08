package X;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286230jZl {
    public static String LJJII;
    public static String LJJIII;
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
    public final Object LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public HandlerThread LJIIZILJ;
    public HandlerThread LJIJ;
    public ImageReader LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;

    public static void LJ() {
        if (LJJII == null || LJJIII == null) {
            String lowerCase = C1286290jZr.LIZ().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                LJJII = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    LJJIII = "sdm660";
                    return;
                }
                if (lowerCase.contains("msm8994")) {
                    LJJIII = "msm8994";
                    return;
                }
                if (lowerCase.contains("sdm845")) {
                    LJJIII = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    LJJIII = "sm8150";
                } else {
                    LJJIII = "";
                }
            }
        }
    }

    public final void LIZ() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.LJ * this.LJFF * 4);
        byteBufferAllocateDirect.clear();
        this.LJIIIIZZ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect, this.LJ, this.LJFF, 0, 0L, EnumC2185621AgK.TEPixFmt_ARGB8);
    }

    public final void LIZJ() {
        if (this.LJIJJLI) {
            return;
        }
        while (this.LJIJJ < this.LIZLLL.length * this.LJI) {
            String str = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processFrameLast processing hasProcxessCount:");
            sbLIZ.append(this.LJIJJ);
            sbLIZ.append(" ptsMsLength: ");
            sbLIZ.append(this.LIZLLL.length);
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            if (!this.LJII.processFrame(null, this.LJ, this.LJFF, 0)) {
                String str2 = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("processFrameLast stop hasProcxessCount:");
                sbLIZ2.append(this.LJIJJ);
                sbLIZ2.append(" ptsMsLength: ");
                sbLIZ2.append(this.LIZLLL.length);
                C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            this.LJIJJ++;
        }
    }

    public final void LIZLLL() {
        try {
            C2484209oO.LJI(this.LIZIZ, "stop begin");
            if (this.LJIJJLI) {
                return;
            }
            this.LJIJJLI = true;
            if (this.LJIJI != null) {
                this.LJIIL.reset();
                this.LJIIL.release();
            }
            ImageReader imageReader = this.LJIJI;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.LJIJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C2484209oO.LJI(this.LIZIZ, "stop end");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI(this.LIZIZ, "stop crash");
            LIZJ();
        }
    }

    public final void LIZIZ(int i, int i2, int i3, ByteBuffer byteBuffer) {
        if (this.LJIJJ < this.LIZLLL.length * this.LJI && !this.LJIJJLI) {
            if (!this.LJII.processFrame(byteBuffer, i, i2, i3)) {
                String str = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processFrame right stop hasProcxessCount:");
                sbLIZ.append(this.LJIJJ);
                sbLIZ.append(" ptsMsLength: ");
                sbLIZ.append(this.LIZLLL.length);
                C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
                LIZLLL();
            }
            this.LJIJJ++;
        }
    }

    public C1286230jZl(String str, int[] iArr, int i, int i2, int i3, int i4, C1286270jZp c1286270jZp) {
        long id = C786410Ut5.u3().getId();
        this.LIZ = id;
        this.LIZIZ = "HwFrameExtractor2_";
        this.LJIIL = null;
        this.LJIILJJIL = new Object();
        this.LJIJJ = 0;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HwFrameExtractor2_");
        sbLIZ.append(i4);
        sbLIZ.append("_");
        sbLIZ.append(id);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = str;
        this.LIZLLL = iArr;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = c1286270jZp;
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
