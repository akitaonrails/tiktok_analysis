package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270180j9s extends C1269960j9W implements SurfaceTexture.OnFrameAvailableListener {
    public final C1267500j5Y LLILLL;
    public Handler LLILZ;
    public final InterfaceC1267470j5V LLILZIL;
    public final C1269730j99 LLILZLL;
    public SurfaceTexture LLIZ;
    public int LLIZLLLIL;
    public k LLJ;
    public final int LLJI;
    public ARunnableS120S0100000_20 LLJIJIL;
    public final ARunnableS120S0100000_20 LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ = 720;
    public int LLJJI = 1280;
    public int LLJJIII = 30;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public VirtualDisplay LLJJJIL;
    public MediaProjection LLJJJJ;
    public C1269250j8N LLJJJJJIL;
    public C1271450jBv LLJJJJLIIL;
    public C777170UeB LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;

    @Override // X.C1271610jCB
    public final synchronized void release() {
        AVLog.logKibana(4, "ScreenVideoNode", "release", null);
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = false;
        this.LLJJJ = false;
        this.LLJIJIL = null;
        this.LLILZ = null;
        this.LLJJJJJIL = null;
    }

    public final void LJIIL() {
        Handler handler;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLJIJIL;
        if (aRunnableS120S0100000_20 == null || (handler = this.LLILZ) == null || !this.LLJJIJIL) {
            return;
        }
        handler.removeCallbacks(aRunnableS120S0100000_20);
        int i = this.LLJI;
        if (i == 0) {
            C786410Ut5.LJLIIL(this.LLJILJILJ, handler, aRunnableS120S0100000_20);
        } else if (i > 0) {
            C786410Ut5.LJLIIL(i, handler, aRunnableS120S0100000_20);
        }
    }

    public final void LJIILIIL() {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        if (!this.LLJJIJIIJIL && this.LLJJIJIL && this.LLJJJ) {
            k kVar = this.LLJ;
            if (kVar == null || kVar.getRefCount() > 0) {
                if (this.LLILLL.LIZ.LJIIIIZZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryConsumePendingSystemFrame return buffer.refCount ");
                    sbLIZ.append(kVar != null ? Integer.valueOf(kVar.getRefCount()) : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                return;
            }
            try {
                SurfaceTexture surfaceTexture = this.LLIZ;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
            } finally {
                if (zLIZ) {
                }
            }
            this.LLJJJ = false;
            float[] fArr = new float[16];
            SurfaceTexture surfaceTexture2 = this.LLIZ;
            if (surfaceTexture2 != null) {
                surfaceTexture2.getTransformMatrix(fArr);
            }
            Matrix matrixLIZJ = C1273010jER.LIZJ(0, fArr);
            if (this.LLJILLL % 180 != 0) {
                matrixLIZJ.preTranslate(0.5f, 0.5f);
                matrixLIZJ.preRotate(this.LLJILLL);
                matrixLIZJ.preTranslate(-0.5f, -0.5f);
            }
            kVar.setTransformMatrix(matrixLIZJ);
            kVar.setTransformMatrixArray(C1273010jER.LIZIZ(matrixLIZJ));
            LJIIL();
            LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            r15 = this;
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0
            long r2 = r2 * r5
            long r2 = r2 * r5
            long r7 = r2 / r5
            long r7 = r7 / r5
            long r9 = r15.LLJJIJI
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r14 = 1
            if (r0 <= 0) goto L32
            long r9 = r9 - r7
            double r0 = (double) r9
            double r12 = java.lang.Math.abs(r0)
            int r4 = r15.LLJILJILJ
            int r0 = r4 * 2
            double r0 = (double) r0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L32
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L3b
            X.0j5Y r0 = r15.LLILLL
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            r0.LJIIIIZZ()
            return
        L32:
            int r0 = r15.LLJILJILJ
            int r0 = r0 / 2
            long r0 = (long) r0
            long r7 = r7 + r0
            r15.LLJJIJI = r7
            goto L41
        L3b:
            long r7 = r15.LLJJIJI
            long r0 = (long) r4
            long r7 = r7 + r0
            r15.LLJJIJI = r7
        L41:
            com.ss.ttlivestreamer.core.buffer.k r7 = r15.LLJ
            if (r7 != 0) goto L46
            return
        L46:
            X.0UeB r4 = r15.LLJJL
            if (r4 == 0) goto L70
            int r1 = r4.LIZ
            int r0 = r1 + (-1)
            r4.LIZ = r0
            if (r1 <= 0) goto L70
            int r9 = r7.getWidth()
            int r8 = r7.getHeight()
            int r4 = r15.LLJLIL
            int r1 = r15.LLJLILLLLZIIL
            int r0 = r15.LLJJLIIIJLLLLLLLZ
            int[] r8 = LJIIJ(r9, r8, r4, r1, r0)
            X.0jBv r4 = r15.LLJJJJLIIL
            if (r4 == 0) goto L70
            r0 = 0
            r1 = r8[r0]
            r0 = r8[r14]
            r4.LJFF(r7, r1, r0)
        L70:
            X.0j99 r1 = r15.LLILZLL
            if (r1 == 0) goto L9a
            r0 = 0
            android.os.Bundle r4 = r1.LIZ(r0)
        L79:
            long r0 = com.ss.ttlivestreamer.core.utils.TimeUtils.nativeTimeUTCMicros()
            long r0 = r0 / r5
            r7.updateCaptureServerNtpMs(r0)
            long r0 = r7.getCaptureServerNtpMs()
            r7.updateEffectServerNtpMs(r0)
            com.ss.ttlivestreamer.core.buffer.VideoFrame r1 = new com.ss.ttlivestreamer.core.buffer.VideoFrame
            r0 = 0
            r1.<init>(r7, r0, r2)
            r15.LJIIIZ(r1, r4)
            X.0j5Y r0 = r15.LLILLL
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            r0.LJIIIIZZ()
            return
        L9a:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270180j9s.LJIIJJI():void");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            handler.removeCallbacks(this.LLJIJIL);
        }
        this.LLJJJ = true;
        LJIILIIL();
    }

    public C1270180j9s(C1267500j5Y c1267500j5Y, Handler handler, InterfaceC1267470j5V interfaceC1267470j5V, C1269730j99 c1269730j99) {
        this.LLILLL = c1267500j5Y;
        this.LLILZ = handler;
        this.LLILZIL = interfaceC1267470j5V;
        this.LLILZLL = c1269730j99;
        int i = c1267500j5Y.LIZ.mPushBase.LJIILL;
        this.LLJI = i;
        this.LLJIJIL = new ARunnableS120S0100000_20(this, 418);
        this.LLJILJIL = new ARunnableS120S0100000_20(this, 426);
        this.LLJJJJJIL = C1269260j8O.LIZ(c1267500j5Y);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenVideoNode init dupInterval:");
        sbLIZ.append(i);
        sbLIZ.append(" frameInterval:");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(' ');
        AVLog.logKibana(4, "ScreenVideoNode", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static final int[] LJIIJ(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[2];
        if (i3 > 0 && i4 > 0) {
            iArr[0] = i3;
            iArr[1] = i4;
            return iArr;
        }
        if (i5 > 0) {
            if (i2 < i) {
                iArr[0] = i5;
                iArr[1] = (i2 * i5) / i;
                return iArr;
            }
            iArr[1] = i5;
            iArr[0] = (i * i5) / i2;
            return iArr;
        }
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}
