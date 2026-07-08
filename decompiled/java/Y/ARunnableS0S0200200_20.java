package Y;

import X.C1269940j9U;
import X.C1270430jAH;
import X.C1270610jAZ;
import X.C1270630jAb;
import X.C1270810jAt;
import X.C1271390jBp;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1273620jFQ;
import X.C1273630jFR;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1C7U;
import X.C2188811AlT;
import X.C238400w2;
import X.C786410Ut5;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0200200_20 implements Runnable {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float[] fArrLIZIZ;
        C1269940j9U c1269940j9U = ((C1270610jAZ) this.l1).LLLZIIL;
        if (c1269940j9U != null) {
            c1269940j9U.LIZ(3, this.j2);
        }
        C1270610jAZ c1270610jAZ = (C1270610jAZ) this.l1;
        if (c1270610jAZ.LLLIIIIL == null) {
            c1270610jAZ.LLLIIIIL = new GlRenderDrawer();
        }
        C1270610jAZ c1270610jAZ2 = (C1270610jAZ) this.l1;
        if (c1270610jAZ2.LLLII == null) {
            c1270610jAZ2.LLLII = new C1271390jBp(null);
            C1270610jAZ c1270610jAZ3 = (C1270610jAZ) this.l1;
            c1270610jAZ3.LLLII.LIZLLL(c1270610jAZ3.LLILZLL, c1270610jAZ3.LLIZ);
        }
        C1270610jAZ c1270610jAZ4 = (C1270610jAZ) this.l1;
        if (c1270610jAZ4.LLLIIII == null) {
            c1270610jAZ4.LLLIIII = new C1271390jBp(null);
            C1270610jAZ c1270610jAZ5 = (C1270610jAZ) this.l1;
            c1270610jAZ5.LLLIIII.LIZLLL(c1270610jAZ5.LLILZLL, c1270610jAZ5.LLIZ);
        }
        try {
            SurfaceTexture surfaceTexture = ((C1270610jAZ) this.l1).LLJJL;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            ((C1270610jAZ) this.l1).LLJLL((TECameraFrame) this.l0);
            C1269940j9U c1269940j9U2 = ((C1270610jAZ) this.l1).LLLZIIL;
            if (c1269940j9U2 != null) {
                c1269940j9U2.LIZ(4, this.j2);
            }
            C1270610jAZ c1270610jAZ6 = (C1270610jAZ) this.l1;
            SurfaceTexture surfaceTexture2 = c1270610jAZ6.LLJJL;
            if (surfaceTexture2 != null) {
                surfaceTexture2.getTransformMatrix(c1270610jAZ6.LLLF);
            }
            long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
            try {
                if ((((C1270610jAZ) this.l1).LLLIIIL && !((C1270610jAZ) this.l1).LLJJ) || (!((C1270610jAZ) this.l1).LLLIIIL && ((C1270610jAZ) this.l1).LLJJ)) {
                    C1270610jAZ c1270610jAZ7 = (C1270610jAZ) this.l1;
                    c1270610jAZ7.LLLII.LIZLLL(c1270610jAZ7.LLILZLL, c1270610jAZ7.LLIZ);
                    GLES20.glBindFramebuffer(36160, ((C1270610jAZ) this.l1).LLLII.LIZ);
                    ((C1270610jAZ) this.l1).LLLIIIL = false;
                } else if ((((C1270610jAZ) this.l1).LLLIIIL && ((C1270610jAZ) this.l1).LLJJ) || (!((C1270610jAZ) this.l1).LLLIIIL && !((C1270610jAZ) this.l1).LLJJ)) {
                    C1270610jAZ c1270610jAZ8 = (C1270610jAZ) this.l1;
                    c1270610jAZ8.LLLIIII.LIZLLL(c1270610jAZ8.LLILZLL, c1270610jAZ8.LLIZ);
                    GLES20.glBindFramebuffer(36160, ((C1270610jAZ) this.l1).LLLIIII.LIZ);
                    ((C1270610jAZ) this.l1).LLLIIIL = true;
                }
                if (C1273520jFG.LIZJ) {
                    C1270610jAZ c1270610jAZ9 = (C1270610jAZ) this.l1;
                    C1270430jAH c1270430jAH = c1270610jAZ9.LLLLZLLLI;
                    float[] fArr = c1270610jAZ9.LLLF;
                    if (c1270430jAH.LIZ == null || !Arrays.equals(fArr, c1270430jAH.LIZIZ)) {
                        c1270430jAH.LIZIZ = Arrays.copyOf(fArr, fArr.length);
                        Matrix matrixLIZJ = C1273010jER.LIZJ(0, fArr);
                        matrixLIZJ.preTranslate(0.5f, 0.5f);
                        matrixLIZJ.preScale(1.0f, -1.0f);
                        matrixLIZJ.preTranslate(-0.5f, -0.5f);
                        c1270430jAH.LIZ = C1273010jER.LIZIZ(matrixLIZJ);
                    }
                    fArrLIZIZ = ((C1270610jAZ) this.l1).LLLLZLLLI.LIZ;
                } else {
                    Matrix matrixLIZJ2 = C1273010jER.LIZJ(0, ((C1270610jAZ) this.l1).LLLF);
                    matrixLIZJ2.preTranslate(0.5f, 0.5f);
                    matrixLIZJ2.preScale(1.0f, -1.0f);
                    matrixLIZJ2.preTranslate(-0.5f, -0.5f);
                    fArrLIZIZ = C1273010jER.LIZIZ(matrixLIZJ2);
                }
                C1270610jAZ c1270610jAZ10 = (C1270610jAZ) this.l1;
                c1270610jAZ10.LLLIIIIL.drawOes(c1270610jAZ10.LLJJJ, null, fArrLIZIZ, 0, 0, c1270610jAZ10.LLILZLL, c1270610jAZ10.LLIZ);
                if (GLThreadManager.isNeedFinish()) {
                    GLES20.glFinish();
                } else {
                    GLES20.glFlush();
                }
                GLES20.glGetError();
                GLES20.glBindFramebuffer(36160, 0);
                C1269940j9U c1269940j9U3 = ((C1270610jAZ) this.l1).LLLZIIL;
                if (c1269940j9U3 != null) {
                    c1269940j9U3.LIZ(5, this.j2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GlError drawOes: ");
                sbLIZ.append(e.toString());
                AVLog.ioe("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
            }
            C786410Ut5.LJJZZIII(((C1270610jAZ) this.l1).LLJL, new ARunnableS21S0100100_20(jNativeNanoTime, this, 14));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1274080jGA.LIZ.LIZ("CameraVideoCapturer.onTextureFrame", th);
            String message = th.getMessage();
            if (!C1274040jG6.LIZ()) {
                if (AVLog.enableLogToIODevice2()) {
                    AVLog.logToIODevice2(6, "CameraVideoCapturer", message, null, 17, 10000);
                    return;
                }
                return;
            }
            if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(message);
                sbLIZ2.append(";;;Error egl dpy env, code:");
                sbLIZ2.append(EGL14.eglGetError());
                message = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(message);
                sbLIZ3.append(";;;");
                sbLIZ3.append("Error egl ctx env, code:");
                sbLIZ3.append(EGL14.eglGetError());
                message = C2188811AlT.LIZIZ(sbLIZ3);
            }
            throw new AndroidRuntimeException(message);
        }
    }

    public static final void run$0(ARunnableS0S0200200_20 aRunnableS0S0200200_20) throws JSONException {
        C1273620jFQ c1273620jFQ = (C1273620jFQ) aRunnableS0S0200200_20.l0;
        long j = aRunnableS0S0200200_20.j2;
        C238400w2 c238400w2 = (C238400w2) aRunnableS0S0200200_20.l1;
        long j2 = aRunnableS0S0200200_20.j3;
        C1C7U.LIZ("RenderCostManager@5343.onPipelineEncodeSend$1L");
        Long l = c1273620jFQ.LJIIIIZZ.get(Long.valueOf(j));
        if (l != null) {
            long jLongValue = j2 - l.longValue();
            c1273620jFQ.LJIILIIL += jLongValue;
            c1273620jFQ.LJIILJJIL++;
            if (jLongValue > 100 || c238400w2.element > 100) {
                JSONObject jSONObject = new JSONObject();
                for (C1273630jFR c1273630jFR : c1273620jFQ.LJJI) {
                    if (c1273630jFR.LIZ()) {
                        jSONObject.put(c1273630jFR.LIZ, c1273630jFR.LIZJ);
                    }
                }
                c1273620jFQ.LIZLLL.put(jSONObject);
            }
        }
        if (c238400w2.element > 100) {
            c1273620jFQ.LJIILLIIL.put(Long.valueOf(j), Long.valueOf(c238400w2.element));
        }
        C1C7U.LIZIZ("RenderCostManager@5343.onPipelineEncodeSend$1L");
    }

    public static final void run$1(ARunnableS0S0200200_20 aRunnableS0S0200200_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.onTextureFrame$1");
        try {
            aRunnableS0S0200200_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.onTextureFrame$1");
    }

    public static final void run$2(ARunnableS0S0200200_20 aRunnableS0S0200200_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.tryDeliverFrameWithTimeStamp$1");
        try {
            C1270610jAZ c1270610jAZ = (C1270610jAZ) aRunnableS0S0200200_20.l1;
            c1270610jAZ.LLJLL = true;
            c1270610jAZ.LLZZJLIL = (TECameraFrame) aRunnableS0S0200200_20.l0;
            c1270610jAZ.LLJLILLLLZIIL(aRunnableS0S0200200_20.j2, c1270610jAZ.LLLLLJLJLL, aRunnableS0S0200200_20.j3, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.tryDeliverFrameWithTimeStamp$1");
    }

    public static final void run$3(ARunnableS0S0200200_20 aRunnableS0S0200200_20) {
        ScopeMonitor scopeMonitor;
        C1270630jAb c1270630jAb = (C1270630jAb) aRunnableS0S0200200_20.l0;
        long j = aRunnableS0S0200200_20.j2;
        TECameraFrame tECameraFrame = (TECameraFrame) aRunnableS0S0200200_20.l1;
        long j2 = aRunnableS0S0200200_20.j3;
        C1C7U.LIZ("CameraVideoNode@3d4a.onFrameAvailable$1L");
        C1273620jFQ c1273620jFQ = c1270630jAb.LLJILLL;
        if (c1273620jFQ != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1273620jFQ.LJIJ = jCurrentTimeMillis;
            c1273620jFQ.LJIIIIZZ.put(Long.valueOf(j), Long.valueOf(jCurrentTimeMillis));
        }
        C1269940j9U c1269940j9U = c1270630jAb.LLJILJILJ;
        if (c1269940j9U != null && (scopeMonitor = c1269940j9U.LL) != null) {
            scopeMonitor.CalcElapse(1, j, j);
        }
        C1270810jAt c1270810jAt = c1270630jAb.LLJ;
        c1270810jAt.LIZ = tECameraFrame;
        c1270810jAt.LIZIZ = j2;
        c1270810jAt.LIZJ = j;
        c1270810jAt.LIZLLL = false;
        c1270630jAb.LJIIJJI("capture");
        C1C7U.LIZIZ("CameraVideoNode@3d4a.onFrameAvailable$1L");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S0200200_20(long r2, long r4, com.ss.android.ttvecamera.TECameraFrame r6, X.C1270610jAZ r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L13
            r0 = r1
            r0.l1 = r7
            r0.l0 = r6
            r0.j2 = r2
            r0.j3 = r4
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l1 = r7
            r0.j2 = r2
            r0.l0 = r6
            r0.j3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S0200200_20.<init>(long, long, com.ss.android.ttvecamera.TECameraFrame, X.0jAZ, int):void");
    }

    public ARunnableS0S0200200_20(Object obj, long j, Object obj2, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
        this.j3 = j2;
    }
}
