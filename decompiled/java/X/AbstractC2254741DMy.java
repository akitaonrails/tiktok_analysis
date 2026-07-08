package X;

import Y.ARunnableS135S0100000_35;
import Y.ARunnableS46S0101000_35;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.TECamera;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1DMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2254741DMy implements C1DO4, C1DO2, C1DO5 {
    public CameraCharacteristics LIZ;
    public final C2244641CtK LIZIZ;
    public CaptureRequest.Builder LIZJ;
    public volatile CameraCaptureSession LIZLLL;
    public CameraManager LJ;
    public final InterfaceC2254691DMt LJFF;
    public final C2254731DMx LJI;
    public final C1DJ6 LJII;
    public C1DNO LJIIIIZZ;
    public CameraDevice LJIIIZ;
    public final Handler LJIIJ;
    public StreamConfigurationMap LJIIJJI;
    public CaptureRequest LJIIL;
    public boolean LJIILJJIL;
    public InterfaceC2186371AhX LJIJJ;
    public C1DJW LJIL;
    public int[] LJJ;
    public C1DJG LJJIFFI;
    public int LJJIIJ;
    public Rect LJJIJIIJI;
    public boolean LJJJ;
    public OutputConfiguration LJJJJ;
    public CameraCaptureSession.CaptureCallback LJJJLZIJ;
    public final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public float LJIILL = 0.0f;
    public float LJIILLIIL = 1.0f;
    public Range<Float> LJIIZILJ = null;
    public int LJIJ = 0;
    public Rect LJIJI = null;
    public InterfaceC1305790k5J LJIJJLI = null;
    public int LJJI = 0;
    public TEFrameRateRange LJJII = new TEFrameRateRange(7, 30);
    public Range<Integer> LJJIII = new Range<>(-1, -1);
    public float[] LJJIIJZLJL = {-1.0f, -1.0f};
    public int LJJIIZ = -1;
    public BPEAHandler LJJIIZI = null;
    public HandlerThread LJJIJ = null;
    public volatile boolean LJJIJIIJIL = false;
    public long LJJIJIL = 0;
    public long LJJIJL = 0;
    public long LJJIJLIJ = 0;
    public long LJJIL = 0;
    public int LJJIZ = 0;
    public volatile boolean LJJJI = false;
    public boolean LJJJIL = false;
    public boolean LJJJJI = false;
    public volatile boolean LJJJJIZL = false;
    public final C1699530uKN LJJJJJ = new HashMap<String, Integer>() { // from class: X.0uKN
        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };
    public final HashMap<Integer, String> LJJJJJL = new HashMap<>();
    public boolean LJJJJL = false;
    public boolean LJJJJLI = false;
    public boolean LJJJJLL = false;
    public final List<OutputConfiguration> LJJJJZ = new ArrayList();
    public final ARunnableS135S0100000_35 LJJJJZI = new ARunnableS135S0100000_35(this, 40);
    public final C1DNP LJJJLIIL = new InterfaceC2218771Bsh() { // from class: X.1DNP
        @Override // X.InterfaceC2218771Bsh
        public final void LIZIZ() {
            C2254731DMx c2254731DMx;
            AbstractC2254741DMy abstractC2254741DMy = this.LIZ;
            if (abstractC2254741DMy.LJII.LLJILLL && (c2254731DMx = abstractC2254741DMy.LJI) != null && c2254731DMx.LJJJJZ == 3) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECameraModeBase", "gyro onChange set focus mode to continuous focus.");
                this.LIZ.LIZIZ();
                this.LIZ.LJJIJIIJI();
                C2218751Bsf c2218751BsfLLII = this.LIZ.LJI.LLII(false);
                if (c2218751BsfLLII != null) {
                    AbstractC2254741DMy abstractC2254741DMy2 = this.LIZ;
                    c2218751BsfLLII.LIZJ(abstractC2254741DMy2.LJJJLIIL, abstractC2254741DMy2.LJI.LJJJLL(EnumC1270990jBB.UNREGISTER_SENSOR));
                }
            }
        }
    };
    public final C1DNG LJJJLL = new CameraCaptureSession.StateCallback() { // from class: X.1DNG
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "onConfigureFailed...");
            this.LIZ.LJJIIZI();
            C1305710k5B.LIZ(0L, "te_record_camera2_create_session_ret");
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onConfigured(android.hardware.camera2.CameraCaptureSession r8) {
            /*
                r7 = this;
                java.lang.String r0 = "TECameraModeBase-onConfigured"
                X.C1321640kUs.LIZ(r0)
                long r5 = java.lang.System.currentTimeMillis()
                X.1DMy r0 = r7.LIZ
                long r3 = r0.LJJIJL
                long r1 = r5 - r3
                r0.LJJIJLIJ = r1
                r0.LJJIL = r5
                r3 = 0
                r0.LJJIJIIJIL = r3
                X.1DMy r0 = r7.LIZ
                r0.LJJJIL = r3
                r0.LIZLLL = r8
                X.1DMy r3 = r7.LIZ
                X.1DJ6 r0 = r3.LJII
                boolean r0 = r0.LLLLLJLJLL
                if (r0 == 0) goto L61
                r3.LJIIIIZZ()
                X.1DMy r0 = r7.LIZ
                boolean r0 = r0.LJJJJLI
                if (r0 != 0) goto L61
                X.1DMy r0 = r7.LIZ
                r0.LJJIIZI()
            L32:
                X.1DMy r0 = r7.LIZ
                X.1DMx r0 = r0.LJI
                X.1DNM r0 = r0.LJI
                if (r0 == 0) goto L4f
                X.1DN3 r0 = r0.LIZIZ()
                if (r0 == 0) goto L4f
                X.1AhD r3 = r0.LJFF()
                X.1AhD r0 = X.EnumC2186171AhD.ADD_SURFACE
                if (r3 != r0) goto L4f
                X.1DMy r0 = r7.LIZ
                X.1DMx r0 = r0.LJI
                r0.LJJJIL()
            L4f:
                java.lang.String r0 = "te_record_camera2_create_session_ret"
                r3 = 1
                X.C1305710k5B.LIZ(r3, r0)
                java.lang.String r0 = "te_record_camera2_create_session_cost"
                X.C1305710k5B.LIZ(r1, r0)
                X.C1321640kUs.LIZIZ()
                return
            L61:
                X.1DMy r0 = r7.LIZ
                r0.LJJJJ()
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1DNG.onConfigured(android.hardware.camera2.CameraCaptureSession):void");
        }
    };

    public void LJII() {
    }

    public int[] LJIIZILJ() {
        return null;
    }

    public abstract int LJIJI();

    public abstract int LJJ();

    public int[] LJJIFFI() {
        return null;
    }

    public void LJJIJIL(int i, int i2) {
    }

    public void LJJIJL(int i) {
    }

    public abstract int LJJIL();

    public void LJJIZ() {
        this.LJJJJIZL = true;
        C2254941DNs c2254941DNs = this.LJI.LJJIJLIJ.LIZJ;
        c2254941DNs.LIZJ = 0;
        c2254941DNs.LIZLLL = 0;
        c2254941DNs.LIZ = 0.0f;
        c2254941DNs.LIZIZ = 0.0f;
        c2254941DNs.LJI = false;
        c2254941DNs.LJ = 0L;
        c2254941DNs.LJFF = 0L;
    }

    public void LJJJ() {
        this.LJJJJIZL = false;
        C2254941DNs c2254941DNs = this.LJI.LJJIJLIJ.LIZIZ;
        c2254941DNs.LIZJ = 0;
        c2254941DNs.LIZLLL = 0;
        c2254941DNs.LIZ = 0.0f;
        c2254941DNs.LIZIZ = 0.0f;
        c2254941DNs.LJI = false;
        c2254941DNs.LJ = 0L;
        c2254941DNs.LJFF = 0L;
    }

    public void LJJJI() {
    }

    @Override // X.C1DO2
    public int LIZIZ() {
        if (this.LIZJ == null) {
            this.LJFF.LIZJ(this.LJIIIZ, this.LJII.LLILLJJLI, -100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        LJJJJLI(this.LJJI);
        this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.LJII.LLJILLL) {
            this.LIZJ.set(CaptureRequest.CONTROL_AE_REGIONS, InterfaceC2254801DNe.LIZ);
        }
        LJJJJJ(this.LIZJ);
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "rollbackMeteringSessionRequest");
        return 0;
    }

    public final void LIZLLL() {
        if (this.LIZLLL == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        C1321640kUs.LIZ("TECameraModeBase-abortSession");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.LIZLLL.abortCaptures();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abort session failed, e: ");
            sbLIZ.append(e.getMessage());
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJJJIL = true;
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        C1321640kUs.LIZIZ();
    }

    public final Rect LJFF() {
        Rect rect = this.LJJIJIIJI;
        if (rect == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C2183341Ace.LIZIZ("TECameraModeBase", "ActiveArraySize == null.");
            this.LJFF.LJ(-420, -420, "ActiveArraySize == null.");
            return null;
        }
        float f = this.LJIILLIIL;
        if (f < 1.0f || f > this.LJIILL) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C2183341Ace.LIZIZ("TECameraModeBase", "factor invalid.");
            this.LJFF.LJ(-420, -420, "factor invalid.");
            return null;
        }
        int iWidth = rect.width() / 2;
        int iHeight = this.LJJIJIIJI.height() / 2;
        int iWidth2 = (int) ((this.LJJIJIIJI.width() * 0.5f) / this.LJIILLIIL);
        int iHeight2 = (int) ((this.LJJIJIIJI.height() * 0.5f) / this.LJIILLIIL);
        return new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
    }

    public void LJIIIIZZ() {
        C1DNM c1dnm;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (!this.LJJJJLL && (c1dnm = this.LJI.LJI) != null && c1dnm.LIZ() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.LJI.LJI.LIZ());
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((OutputConfiguration) ((ArrayList) this.LJJJJZ).get(i)).addSurface((Surface) arrayList.get(i));
                        this.LJJJJLL = true;
                    }
                }
                if (this.LJJJJLI || !this.LJJJJLL) {
                    return;
                }
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJZ);
                this.LJJJJLI = true;
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TECameraModeBase", "finalizeOutputConfigurations in session onConfigured");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void LJIIIZ() {
        C1DJ6 c1dj6;
        if (this.LJI != null && (c1dj6 = this.LJII) != null && c1dj6.LLJIJIL) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("close session process...state = ");
            sbLIZ.append(this.LJI.LJJJJZ);
            C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJI.LJJJJZ == 2) {
                this.LJI.LLIIJI();
            }
        }
        this.LJJJI = false;
        if (this.LJIIIZ == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "close session process...device is null");
            return;
        }
        if (this.LIZLLL == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "close session process...session is null");
            return;
        }
        if (!this.LJJJIL && this.LJII.LLLLLL) {
            LIZLLL();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.LIZLLL.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZLLL = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1305710k5B.LIZ(jCurrentTimeMillis2, "te_record_camera2_close_session_cost");
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "close session...consume = " + jCurrentTimeMillis2);
    }

    public final CaptureRequest.Builder LJIIJJI() {
        CameraDevice cameraDevice = this.LJIIIZ;
        if (cameraDevice == null) {
            return null;
        }
        try {
            return cameraDevice.createCaptureRequest(2);
        } catch (CameraAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public void LJIILIIL() throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 28 || this.LJIIIZ == null) {
            return;
        }
        ((ArrayList) this.LJJJJZ).clear();
        C1DJ6 c1dj6 = this.LJII;
        if (c1dj6.LLJZIJLIL == 0 && c1dj6.LLILLJJLI == 2) {
            List<OutputConfiguration> list = this.LJJJJZ;
            TEFrameSizei tEFrameSizei = this.LJII.LLJJJIL;
            ((ArrayList) list).add(new OutputConfiguration(new Size(tEFrameSizei.width, tEFrameSizei.height), SurfaceTexture.class));
            Handler handlerLJIJ = this.LJII.LLJIJIL ? LJIJ() : this.LJIIJ;
            if (this.LJIIIZ != null) {
                if (this.LIZJ == null) {
                    if (this.LJII.LLLF.getBoolean("enablePreviewTemplate")) {
                        this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
                    } else {
                        this.LIZJ = this.LJIIIZ.createCaptureRequest(3);
                    }
                }
                this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, LJIIJ(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LLILLL.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LLILLL.fpsUnitFactor))));
                LJIIL(null, this.LJJJLL, handlerLJIJ);
            }
        }
        this.LJJJJLI = false;
        this.LJJJJLL = false;
    }

    public final void LJIILJJIL() {
        Bundle bundle;
        C1321640kUs.LIZ("TECameraModeBase-fillFeatures");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.LJII.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fillFeatures key = ");
        sbLIZ2.append(strLIZIZ);
        C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
        if (((HashMap) this.LJI.LJIJJLI).containsKey(strLIZIZ)) {
            bundle = (Bundle) ((HashMap) this.LJI.LJIJJLI).get(strLIZIZ);
        } else {
            bundle = new Bundle();
            ((HashMap) this.LJI.LJIJJLI).put(strLIZIZ, bundle);
        }
        C786410Ut5.LJJIJL(bundle, "camera_preview_size", this.LJII.LLJJJIL);
        if (this.LIZ != null && this.LJIIL != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.mActiveSize = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.mCropSize = (Rect) this.LJIIL.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.mMaxRegionsAE = ((Integer) this.LIZ.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.mMaxRegionsAF = ((Integer) this.LIZ.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            C786410Ut5.LJJIJL(bundle, "camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.LJII.LLILZIL);
        C1321640kUs.LIZIZ();
    }

    public final float[] LJIILLIIL() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJ(-432, -432, "Capture Session is null");
        }
        float[] fArr = (float[]) this.LIZ.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        return fArr == null ? new float[]{-1.0f, -1.0f} : fArr;
    }

    public final Handler LJIJ() {
        if (this.LJJIJ == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.LJJIJ = handlerThread;
            handlerThread.start();
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.LJJIIZI == null) {
            this.LJJIIZI = new BPEAHandler(C786410Ut5.W2(this.LJJIJ));
        }
        return this.LJJIIZI;
    }

    public final List<Size> LJIJJLI() {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "Output is not supported, ignore getBestPreviewSize operation.");
            return new ArrayList();
        }
        Size[] outputSizes = this.LJIIJJI.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(size);
        }
        return arrayList;
    }

    public final float[] LJIL() {
        if (this.LIZIZ == null || this.LJIIL == null || this.LIZLLL == null || this.LIZJ == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.LIZJ.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int iAbs = StrictMath.abs(rect.right - rect.left);
        int iAbs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = this.LJII.LLJJJIL;
        int i2 = tEFrameSizei.width;
        if (iAbs * tEFrameSizei.height <= i2 * iAbs2) {
            float f2 = iAbs;
            dArr[0] = StrictMath.atan(((sizeF.getWidth() * f2) / size.getWidth()) / (f.floatValue() * 2.0f)) * 2.0d;
            float height = sizeF.getHeight();
            float f3 = iAbs2;
            dArr[1] = StrictMath.atan((((height * f3) / size.getHeight()) / ((i2 / r8) / (f2 / f3))) / (f.floatValue() * 2.0f)) * 2.0d;
        } else {
            float f4 = iAbs2;
            dArr[1] = StrictMath.atan(((sizeF.getHeight() * f4) / size.getHeight()) / (f.floatValue() * 2.0f)) * 2.0d;
            float width = sizeF.getWidth();
            float f5 = iAbs;
            dArr[0] = StrictMath.atan((((width * f5) / size.getWidth()) / ((r8 / i2) / (f4 / f5))) / (f.floatValue() * 2.0f)) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Camera2:verticalFOV = ");
        sbLIZ.append(fArr[0]);
        sbLIZ.append(",horizontalFOV = ");
        sbLIZ.append(fArr[1]);
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        double d = fArr[0];
        Iterator<InterfaceC1305720k5C> it2 = C1305710k5B.LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJII(d, "te_record_camera_fov_vertical");
        }
        double d2 = fArr[1];
        Iterator<InterfaceC1305720k5C> it3 = C1305710k5B.LIZ.values().iterator();
        while (it3.hasNext()) {
            it3.next().LJII(d2, "te_record_camera_fov_horizontal");
        }
        return fArr;
    }

    public final int[] LJJI() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJ(-430, -430, "Capture Session is null");
        }
        Range range = (Range) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) ? new int[]{-1, -1} : new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    public final long[] LJJIII() {
        if (this.LIZJ == null || this.LIZLLL == null) {
            this.LJFF.LJ(-431, -431, "Capture Session is null");
        }
        Range range = (Range) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        return range == null ? new long[]{-1, -1} : new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    public final void LJJIIZI() {
        C2254731DMx c2254731DMx = this.LJI;
        if (c2254731DMx != null) {
            c2254731DMx.LLIIIJ();
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openCameraLock failed, ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LJJIJ() {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2254741DMy.LJJIJ():int");
    }

    public final int LJJIJIIJI() {
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder == null) {
            this.LJFF.LIZJ(this.LJIIIZ, this.LJII.LLILLJJLI, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(LJIJI()));
        this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.LJII.LLJILLL) {
            CaptureRequest.Builder builder2 = this.LIZJ;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = InterfaceC2254801DNe.LIZ;
            builder2.set(key, meteringRectangleArr);
            this.LIZJ.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        LJJJJJ(this.LIZJ);
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "rollbackNormalSessionRequest");
        return 0;
    }

    public final void LJJIJIIJIL() {
        C2244641CtK c2244641CtK = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        C1DJ6 c1dj6 = this.LJII;
        TEFrameRateRange tEFrameRateRange = c1dj6.LLILLL;
        int i = tEFrameRateRange.min;
        int i2 = tEFrameRateRange.max;
        int i3 = c1dj6.LLLIIII;
        int i4 = c1dj6.LLILZ;
        c2244641CtK.getClass();
        this.LJJII = C2244641CtK.LIZLLL(cameraCharacteristics, i, i2, i3, i4);
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set Fps Range: ");
        sbLIZ.append(this.LJJII.toString());
        sbLIZ.append(", strategy: ");
        sbLIZ.append(this.LJII.LLLIIII);
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    public int LJJJJI() {
        C1321640kUs.LIZ("TECameraModeBase-updateCapture");
        if (this.LJI.LJI == null || this.LIZJ == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "update capture failed");
            return -100;
        }
        C2244641CtK c2244641CtK = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        c2244641CtK.getClass();
        if (C2244641CtK.LJIIL(cameraCharacteristics)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Stabilization Supported, mode = ");
            sbLIZ.append(this.LJII.LLLL);
            C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            C2244641CtK c2244641CtK2 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics2 = this.LIZ;
            CaptureRequest.Builder builder = this.LIZJ;
            EnumC2244671CtN enumC2244671CtN = this.LJII.LLLL;
            c2244641CtK2.getClass();
            if (C2244641CtK.LIZ(cameraCharacteristics2, builder, enumC2244671CtN) == 0 && this.LJII.LLLJL) {
                this.LJFF.LJ(113, 1, "enable stablization");
            }
        }
        this.LIZJ.set(CaptureRequest.CONTROL_MODE, 1);
        LJJIJIIJIL();
        Range<Integer> rangeLJIIJ = LJIIJ(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LLILLL.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LLILLL.fpsUnitFactor)));
        this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeLJIIJ);
        this.LJFF.LJ(121, 0, rangeLJIIJ.toString());
        this.LIZJ.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.LJIJ));
        this.LJII.LLLFZ.LIZIZ = this.LJIJ;
        LJJJJLI(this.LJJI);
        if (Float.compare(this.LJII.LLLLLLZZ, 1.0f) != 0) {
            float fMin = Math.min(this.LJII.LLLLLLZZ, this.LJIILL);
            this.LJIILLIIL = fMin;
            if (!this.LJII.LLLLLZ) {
                Rect rectLJ = LJ(fMin);
                if (rectLJ == null) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("calculate default crop_region fail! zoom = ");
                    sbLIZ2.append(this.LJIILLIIL);
                    C2183341Ace.LJ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, rectLJ);
                    this.LJIJI = rectLJ;
                }
            } else if (Build.VERSION.SDK_INT < 30) {
                Rect rectLJFF = LJFF();
                if (rectLJFF == null) {
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("calculateV2 default crop_region fail! zoom = ");
                    sbLIZ3.append(this.LJIILLIIL);
                    C2183341Ace.LJ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, rectLJFF);
                    this.LJIJI = rectLJFF;
                }
            } else {
                this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(fMin));
            }
        }
        int i5 = this.LJJIIZ;
        if (i5 != -1) {
            LJJJJIZL(i5);
        }
        C1699800uKo c1699800uKoLJJJJJ = LJJJJJ(this.LIZJ);
        if (!c1699800uKoLJJJJJ.LIZ) {
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("first request failed: ");
            sbLIZ4.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ4));
        }
        this.LJII.LLILZIL = ((Integer) this.LIZ.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.LJI.LLIIIZ(3);
        LJIILJJIL();
        this.LJJIIJZLJL = LJIL();
        int i7 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("send capture request...");
        sbLIZ5.append(this.LIZLLL);
        sbLIZ5.append("mCameraSettings.mRotation = ");
        sbLIZ5.append(this.LJII.LLILZIL);
        sbLIZ5.append(", mCameraSettings:");
        sbLIZ5.append(this.LJII.hashCode());
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ5));
        this.LJFF.LJFF(this.LJI, "TECamera2 preview");
        C1321640kUs.LIZIZ();
        return 0;
    }

    public final void LJJJJLL() {
        C2254731DMx c2254731DMx = this.LJI;
        if (c2254731DMx != null) {
            c2254731DMx.LLIIJI();
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("waitCameraTaskDoneOrTimeout failed, ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJJJ() {
        try {
            int iLJJJJI = LJJJJI();
            if (iLJJJJI != 0) {
                LJJIIZI();
                ARunnableS46S0101000_35 aRunnableS46S0101000_35 = new ARunnableS46S0101000_35(this, iLJJJJI, 11);
                if (this.LJII.LLJIJIL) {
                    C786410Ut5.LJJZZIII(this.LJIIJ, aRunnableS46S0101000_35);
                } else {
                    aRunnableS46S0101000_35.run();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJJIIZI();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerUpdateCaptureRequest failed: ");
            sbLIZ.append(e.getMessage());
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final Rect LJ(float f) {
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics != null && this.LIZJ != null) {
            float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            Rect rect = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            int iWidth = (int) (rect.width() / fFloatValue);
            int iHeight = (int) (rect.height() / fFloatValue);
            int iWidth2 = (int) (((rect.width() - iWidth) / fFloatValue) * f);
            int iHeight2 = (int) (((rect.height() - iHeight) / fFloatValue) * f);
            int i = iWidth2 - (iWidth2 & 3);
            int i2 = iHeight2 - (iHeight2 & 3);
            return new Rect(i, i2, rect.width() - i, rect.height() - i2);
        }
        this.LJFF.LIZJ(this.LJIIIZ, this.LJII.LLILLJJLI, -420, "Camera info is null, may be you need reopen camera.");
        return null;
    }

    public Range<Integer> LJIIJ(Range<Integer> range) {
        int iIntValue;
        int iIntValue2;
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics != null) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            C1DIX c1dix = this.LJII.LLLLII;
            String str = C2183321Acc.LIZ;
            int i = 0;
            if (c1dix == C1DIX.LOW_POWER) {
                int length = rangeArr.length;
                int i2 = 0;
                while (i < length) {
                    Range<Integer> range2 = rangeArr[i];
                    if (20 <= ((Integer) range2.getUpper()).intValue() && ((Integer) range2.getUpper()).intValue() < 30 && ((Integer) range2.getLower()).intValue() < ((Integer) range2.getUpper()).intValue() && (iIntValue2 = (((Integer) range2.getUpper()).intValue() + ((Integer) range2.getUpper()).intValue()) - ((Integer) range2.getLower()).intValue()) > i2) {
                        range = range2;
                        i2 = iIntValue2;
                    }
                    i++;
                }
            } else if (c1dix == C1DIX.HIGH_FPS) {
                int iIntValue3 = ((Integer) range.getLower()).intValue();
                int length2 = rangeArr.length;
                while (i < length2) {
                    Range<Integer> range3 = rangeArr[i];
                    if (((Integer) range3.getUpper()).intValue() == 30 && ((Integer) range3.getLower()).intValue() < ((Integer) range3.getUpper()).intValue() && (iIntValue = ((Integer) range3.getLower()).intValue()) > iIntValue3) {
                        range = range3;
                        iIntValue3 = iIntValue;
                    }
                    i++;
                }
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fpsMode: ");
            sbLIZ.append(this.LJII.LLLLII);
            sbLIZ.append(", selected fps: ");
            sbLIZ.append(range);
            C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        }
        return range;
    }

    public int LJIILL(C1DJG c1djg) {
        boolean z;
        boolean z2;
        boolean z3;
        C2218751Bsf c2218751BsfLLII;
        C2218751Bsf c2218751BsfLLII2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Rect rectLIZJ;
        C1DJ6 c1dj6 = this.LJII;
        if (c1dj6.LLJILJILJ) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("settings = ");
            sbLIZ.append(c1djg);
            C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            this.LJJIFFI = c1djg;
            C1DNO c1dno = this.LJIIIIZZ;
            c1dno.LIZIZ = c1djg;
            C1DJ6 c1dj62 = this.LJII;
            c1dno.LIZJ = c1dj62;
            c1dno.LIZLLL = c1dj62.LLJI;
            if (this.LIZIZ != null && this.LIZLLL != null && this.LIZJ != null && this.LJJIFFI != null) {
                C2244641CtK c2244641CtK = this.LIZIZ;
                CameraCharacteristics cameraCharacteristics = this.LIZ;
                c2244641CtK.getClass();
                if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C2244641CtK c2244641CtK2 = this.LIZIZ;
                CameraCharacteristics cameraCharacteristics2 = this.LIZ;
                c2244641CtK2.getClass();
                if (cameraCharacteristics2 != null && ((Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1) {
                    z5 = true;
                } else {
                    z5 = false;
                    if (!z4) {
                        C2183341Ace.LJ("TECameraModeBase", "not support focus and meter!");
                        this.LJJIFFI.LJIIJJI.LIZ(-412, this.LJII.LLILZ, "not support focus and meter!");
                        return -412;
                    }
                }
                boolean z7 = this.LJIILIIL.get();
                if (z5 && this.LJJIFFI.LJI) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z7 && !z6) {
                    this.LJJJJZI.run();
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    int i3 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TECameraModeBase", "cancel previous touch af..");
                }
                if (z4 && this.LJJIFFI.LJII) {
                    this.LJJIFFI.getClass();
                    C1DJG c1djg2 = this.LJJIFFI;
                    int i4 = c1djg2.LIZ;
                    int i5 = c1djg2.LIZIZ;
                    float f = c1djg2.LIZJ;
                    float f2 = c1djg2.LIZLLL;
                    int i6 = this.LJII.LLILZIL;
                    EnumC21617819iy enumC21617819iy = c1djg2.LJIIJ;
                    i = -100;
                    rectLIZJ = LIZJ(i4, i5, f, f2, i6, 1, enumC21617819iy);
                    if (!C2183321Acc.LJIILL(rectLIZJ)) {
                        C2183341Ace.LIZIZ("TECameraModeBase", "meteringRect is not valid!");
                        this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LLILZ, "meteringRect is not valid!");
                    } else {
                        this.LJIIIIZZ.LJ(this.LIZJ, rectLIZJ);
                        if (z6) {
                            LJJJJJL(this.LIZJ, this.LJIIIIZZ.LIZJ(false), this.LJIIJ);
                            this.LJIILIIL.set(false);
                            return 0;
                        }
                    }
                } else {
                    i = -100;
                    rectLIZJ = null;
                }
                if (z5 && this.LJJIFFI.LJI) {
                    this.LJJIFFI.getClass();
                    C1DJG c1djg3 = this.LJJIFFI;
                    Rect rectLIZJ2 = LIZJ(c1djg3.LIZ, c1djg3.LIZIZ, c1djg3.LIZJ, c1djg3.LIZLLL, this.LJII.LLILZIL, 0, c1djg3.LJIIJ);
                    if (!C2183321Acc.LJIILL(rectLIZJ2)) {
                        C2183341Ace.LIZIZ("TECameraModeBase", "focusRect is not valid!");
                        this.LJJIFFI.LJIIJJI.LIZ(i, this.LJII.LLILZ, "focusRect is not valid!");
                    } else {
                        this.LJIILIIL.set(true);
                        if (this.LJJJ) {
                            if (c1djg.LJIIIZ) {
                                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
                                this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
                            } else {
                                this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                                this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
                            }
                        }
                        this.LJIIIIZZ.LIZLLL(this.LIZJ, rectLIZJ2);
                        LJI(this.LIZJ, this.LJJJLZIJ, LJIJ());
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectLIZJ2, 999)});
                        if (rectLIZJ != null) {
                            this.LIZJ.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectLIZJ, 999)});
                        }
                        this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        CaptureRequest.Builder builder = this.LIZJ;
                        C1699800uKo c1699800uKoLJJJJJL = LJJJJJL(builder, this.LJIIIIZZ.LIZ(builder, this.LJIILIIL, c1djg.LJIIIIZZ, this, this.LJII), this.LJIIJ);
                        if (c1699800uKoLJJJJJL.LIZ) {
                            return 0;
                        }
                        this.LJIILIIL.set(false);
                        C1DJG c1djg4 = this.LJJIFFI;
                        if (c1djg4 != null) {
                            c1djg4.LJIIJJI.LIZ(-108, this.LJII.LLILZ, c1699800uKoLJJJJJL.LIZIZ);
                        }
                        this.LJFF.LJ(-411, -411, c1699800uKoLJJJJJL.LIZIZ);
                        return -108;
                    }
                } else {
                    return -412;
                }
            } else {
                C2183341Ace.LJ("TECameraModeBase", "Env is null");
                C1DJG c1djg5 = this.LJJIFFI;
                if (c1djg5 != null) {
                    c1djg5.LJIIJJI.LIZ(-100, this.LJII.LLILZ, "Env is null");
                }
            }
            return -100;
        }
        this.LJJIFFI = c1djg;
        C1DNO c1dno2 = this.LJIIIIZZ;
        c1dno2.LIZIZ = c1djg;
        c1dno2.LIZJ = c1dj6;
        c1dno2.LIZLLL = c1dj6.LLJI;
        if (this.LIZIZ != null && this.LIZLLL != null && this.LIZJ != null) {
            C2244641CtK c2244641CtK3 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics3 = this.LIZ;
            c2244641CtK3.getClass();
            if (cameraCharacteristics3 != null && ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1) {
                z = true;
            } else {
                z = false;
            }
            C2244641CtK c2244641CtK4 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics4 = this.LIZ;
            c2244641CtK4.getClass();
            if (cameraCharacteristics4 != null && ((Integer) cameraCharacteristics4.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1) {
                z2 = true;
            } else {
                z2 = false;
                if (!z) {
                    int i7 = C2187451AjH.LIZ;
                    C2183341Ace.LJ("TECameraModeBase", "do not support MeteringAreaAF!");
                    this.LJJIFFI.LJIIJJI.LIZ(-412, this.LJII.LLILZ, "do not support MeteringAreaAF!");
                    return -412;
                }
            }
            boolean z8 = c1djg.LJIIIIZZ;
            boolean z9 = this.LJIILIIL.get();
            if (z2 && this.LJJIFFI.LJI) {
                z3 = false;
            } else {
                z3 = true;
            }
            int i8 = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECameraModeBase", "focusAtPoint++");
            if (z9 && !z3) {
                this.LJJJJZI.run();
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                int i9 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TECameraModeBase", "cancel previous touch af..");
            }
            this.LJJIFFI.getClass();
            C1DJG c1djg6 = this.LJJIFFI;
            Rect rectLIZJ3 = LIZJ(c1djg6.LIZ, c1djg6.LIZIZ, c1djg6.LIZJ, c1djg6.LIZLLL, this.LJII.LLILZIL, 0, c1djg6.LJIIJ);
            this.LJJIFFI.getClass();
            C1DJG c1djg7 = this.LJJIFFI;
            Rect rectLIZJ4 = LIZJ(c1djg7.LIZ, c1djg7.LIZIZ, c1djg7.LIZJ, c1djg7.LIZLLL, this.LJII.LLILZIL, 1, c1djg7.LJIIJ);
            if (C2183321Acc.LJIILL(rectLIZJ3) && C2183321Acc.LJIILL(rectLIZJ4)) {
                if (this.LJJIFFI.LJII && z) {
                    this.LJIIIIZZ.LJ(this.LIZJ, rectLIZJ4);
                }
                if (z3) {
                    if (z && this.LJJIFFI.LJII) {
                        LJJJJJL(this.LIZJ, this.LJIIIIZZ.LIZJ(false), this.LJIIJ);
                        this.LJIILIIL.set(false);
                        if (this.LJII.LLJILLL && (c2218751BsfLLII2 = this.LJI.LLII(true)) != null) {
                            c2218751BsfLLII2.LIZIZ(this.LJJJLIIL, this.LJIIJ, this.LJI.LJJJLL(EnumC1270990jBB.REGISTER_SENSOR));
                        }
                    }
                    return -412;
                }
                this.LJIILIIL.set(true);
                this.LJIIIIZZ.LIZLLL(this.LIZJ, rectLIZJ3);
                C1DJ6 c1dj63 = this.LJII;
                if (c1dj63.LLJILLL) {
                    CaptureRequest.Builder builder2 = this.LIZJ;
                    C1699800uKo c1699800uKoLJI = LJI(builder2, this.LJIIIIZZ.LIZ(builder2, this.LJIILIIL, z8, this, c1dj63), this.LJIIJ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("focusAtPoint, capture to trigger focus, response = ");
                    sbLIZ2.append(c1699800uKoLJI.LIZ);
                    C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                }
                CaptureRequest.Builder builder3 = this.LIZJ;
                C1699800uKo c1699800uKoLJJJJJL2 = LJJJJJL(builder3, this.LJIIIIZZ.LIZ(builder3, this.LJIILIIL, z8, this, this.LJII), this.LJIIJ);
                if (!c1699800uKoLJJJJJL2.LIZ) {
                    this.LJIILIIL.set(false);
                    this.LJJIFFI.LJIIJJI.LIZ(-108, this.LJII.LLILZ, c1699800uKoLJJJJJL2.LIZIZ);
                    this.LJFF.LJ(-411, -411, c1699800uKoLJJJJJL2.LIZIZ);
                    return -108;
                }
                if (this.LJII.LLJILLL && !z8 && (c2218751BsfLLII = this.LJI.LLII(true)) != null) {
                    c2218751BsfLLII.LIZIZ(this.LJJJLIIL, this.LJIIJ, this.LJI.LJJJLL(EnumC1270990jBB.REGISTER_SENSOR));
                }
                C2183341Ace.LIZLLL("TECameraModeBase", "focusAtPoint, done");
                return 0;
            }
            C2183341Ace.LIZIZ("TECameraModeBase", "focusRect or meteringRect is not valid!");
            this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LLILZ, "focusRect or meteringRect is not valid!");
            return -100;
        }
        int i10 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECameraModeBase", "Env is null");
        this.LJJIFFI.LJIIJJI.LIZ(-100, this.LJII.LLILZ, "Env is null");
        return -100;
    }

    public final List<Size> LJIJJ(int i) {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (!this.LJIIJJI.isOutputSupportedFor(i)) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "Output format is not supported");
            return new ArrayList();
        }
        Size[] outputSizes = this.LJIIJJI.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(size);
        }
        return arrayList;
    }

    public final int LJJII(List<Surface> list) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.LJII.LLILLJJLI == 9 && list.size() == 1 && this.LJII.LLLJL) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECameraModeBase", "getSessionType, create session for oppo video eis.");
                return 57355;
            }
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraModeBase", "getSessionType, create regular session.");
            return 0;
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "getSessionType, create normal session.");
        return 0;
    }

    public final void LJJIIJZLJL(CaptureFailure captureFailure) {
        if (this.LJII.LLLLJ && !this.LJJIJIIJIL && captureFailure.getReason() == 0) {
            int i = this.LJJIZ + 1;
            this.LJJIZ = i;
            C1DJ6 c1dj6 = this.LJII;
            if (i > c1dj6.LLLLL) {
                this.LJFF.LJI(this.LJIIIZ, c1dj6.LLILLJJLI, -437, "Camera previewing failed");
            }
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failure: ");
        sbLIZ.append(captureFailure);
        sbLIZ.append(", reason: ");
        sbLIZ.append(captureFailure.getReason());
        C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIJLIJ(CaptureRequest.Builder builder) {
        int[] iArr = this.LJJ;
        if (iArr != null) {
            String str = C2183321Acc.LIZ;
            for (int i : iArr) {
                if (i == 1) {
                    builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                    return;
                }
            }
            int[] iArr2 = this.LJJ;
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 2) {
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
                        builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                        return;
                    }
                }
            }
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    public void LJJJIL(int i) {
        if (this.LJJJ) {
            this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    public final void LJJJJIZL(int i) {
        int iIntValue;
        int iIntValue2;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFlashModeParam: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJIIZ = i;
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder == null) {
            C2183341Ace.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.LJFF.LIZJ(this.LJIIIZ, this.LJII.LLILLJJLI, -100, "switchFlashMode : CaptureRequest.Builder is null");
            return;
        }
        Integer num = (Integer) builder.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            iIntValue = 0;
        } else {
            iIntValue = num.intValue();
        }
        if (i == 1) {
            if (this.LJII.LLILZ == 1) {
                C2183341Ace.LJ("TECameraModeBase", "flash on is not supported in front camera!");
                return;
            }
            C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode SINGLE");
            this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
            this.LJJJ = true;
            return;
        }
        if (i == 0) {
            this.LJJJ = false;
            if (iIntValue == 0) {
                C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            }
            C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode OFF");
            this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        if (i == 2) {
            this.LJJJ = false;
            if (iIntValue == 2) {
                C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            }
            C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode TORCH");
            this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
            return;
        }
        if (i == 5) {
            this.LJJJ = false;
            if (Build.VERSION.SDK_INT >= 28) {
                int[] iArr = (int[]) this.LIZ.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                if (iArr != null && Arrays.stream(iArr).anyMatch(new C1DO3())) {
                    Integer num2 = (Integer) this.LIZJ.get(CaptureRequest.CONTROL_AE_MODE);
                    if (num2 == null) {
                        iIntValue2 = 0;
                    } else {
                        iIntValue2 = num2.intValue();
                    }
                    if (iIntValue == 0 && iIntValue2 == 5) {
                        C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode aeStatus == ON_EXTERNAL_FLASH");
                        return;
                    }
                    C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode ON_EXTERNAL_FLASH");
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 5);
                    this.LIZJ.set(CaptureRequest.FLASH_MODE, 0);
                    return;
                }
                C2183341Ace.LIZLLL("TECameraModeBase", "switchFlashMode external flash is not supported");
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not support flash mode: ");
        sbLIZ2.append(i);
        C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C1699800uKo LJJJJJ(CaptureRequest.Builder builder) {
        return LJJJJJL(builder, this.LJJJLZIJ, LJIJ());
    }

    public final void LJJJJLI(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LJJIJLIJ(this.LIZJ);
                        int i2 = C2187451AjH.LIZ;
                        C2183341Ace.LIZLLL("TECameraModeBase", "use faceae for all");
                        return;
                    }
                    return;
                }
                if (this.LJII.LLILZ != 0) {
                    return;
                }
                LJJIJLIJ(this.LIZJ);
                int i3 = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECameraModeBase", "use faceae for rear");
                return;
            }
            if (this.LJII.LLILZ != 1) {
                return;
            }
            LJJIJLIJ(this.LIZJ);
            int i4 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraModeBase", "use faceae for front");
            return;
        }
        CaptureRequest.Builder builder = this.LIZJ;
        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
        builder.set(CaptureRequest.CONTROL_SCENE_MODE, 0);
    }

    public final void LJJIIJ(TotalCaptureResult totalCaptureResult, boolean z) {
        boolean z2;
        C1DNM c1dnm;
        C20188413z0 c20188413z0;
        Long l;
        Handler handler;
        int iIntValue;
        long jLongValue;
        boolean z3;
        C2254731DMx c2254731DMx = this.LJI;
        boolean z4 = this.LJJJJIZL;
        C2254811DNf c2254811DNf = c2254731DMx.LJJIJLIJ.LIZ;
        int i = c2254811DNf.LIZ + 1;
        c2254811DNf.LIZ = i;
        if (i > 0 && i % 30 == 0) {
            c2254811DNf.LIZIZ = ((i * LSPassThroughRecordSizeConfig.DEFAULT) * 1.0f) / (System.currentTimeMillis() - c2254811DNf.LIZJ);
            if (c2254811DNf.LJII != null) {
                float f = c2254811DNf.LJ - c2254811DNf.LIZLLL[c2254811DNf.LJI];
                c2254811DNf.LJ = f;
                c2254811DNf.LJ = f + c2254811DNf.LIZIZ;
                c2254811DNf.LIZLLL[c2254811DNf.LJI] = c2254811DNf.LIZIZ;
                int i2 = (c2254811DNf.LJI + 1) % 3;
                c2254811DNf.LJI = i2;
                if (c2254811DNf.LJFF || i2 == 0) {
                    c2254811DNf.LJFF = true;
                    C1DO1 c1do1 = c2254811DNf.LJII;
                    float f2 = c2254811DNf.LJ / 3.0f;
                    c1do1.getClass();
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[LowLightEnhance], onCameraFpsChanged: ");
                    sbLIZ.append(f2);
                    sbLIZ.append(" photo mode: ");
                    sbLIZ.append(c1do1.LIZ.LJJJI);
                    sbLIZ.append(" camera fps updated: ");
                    sbLIZ.append(c1do1.LIZ.LJJIZ);
                    sbLIZ.append(" mCameraFpsEligibleCount: ");
                    sbLIZ.append(c1do1.LIZ.LJJJJJL);
                    sbLIZ.append(" mCameraFpsLowerCount: ");
                    sbLIZ.append(c1do1.LIZ.LJJJJIZL);
                    sbLIZ.append(" mCameraFpsRestoreCount: ");
                    sbLIZ.append(c1do1.LIZ.LJJJJJ);
                    sbLIZ.append(" mCameraFpsUpdateCount: ");
                    sbLIZ.append(c1do1.LIZ.LJJJJI);
                    C2183341Ace.LIZLLL("TECameraBase", C2188811AlT.LIZIZ(sbLIZ));
                    synchronized (c1do1.LIZ.LJJJ) {
                        try {
                            AbstractC2254721DMw abstractC2254721DMw = c1do1.LIZ;
                            if (!abstractC2254721DMw.LJJIZ) {
                                C1DJ6 c1dj6 = abstractC2254721DMw.LIZIZ;
                                if (f2 >= c1dj6.LLLILZJ && f2 < c1dj6.LLLILZLLLI) {
                                    abstractC2254721DMw.LJJJJJL++;
                                }
                            }
                            if (abstractC2254721DMw.LIZIZ.LLLIL && !abstractC2254721DMw.LJJJI && !abstractC2254721DMw.LJJJJL) {
                                AbstractC2254721DMw abstractC2254721DMw2 = c1do1.LIZ;
                                if (!abstractC2254721DMw2.LJJJIL) {
                                    if (!abstractC2254721DMw2.LJJIZ) {
                                        C1DJ6 c1dj62 = abstractC2254721DMw2.LIZIZ;
                                        if (f2 >= c1dj62.LLLILZJ && f2 < c1dj62.LLLILZLLLI) {
                                            int iLLD = abstractC2254721DMw2.LLD();
                                            if (iLLD == 0) {
                                                AbstractC2254721DMw abstractC2254721DMw3 = c1do1.LIZ;
                                                abstractC2254721DMw3.LJJJJI++;
                                                abstractC2254721DMw3.LJJJJIZL++;
                                                abstractC2254721DMw3.LJJIZ = true;
                                            } else if (iLLD == -502) {
                                                c1do1.LIZ.LJJJIL = true;
                                            }
                                        }
                                    }
                                    AbstractC2254721DMw abstractC2254721DMw4 = c1do1.LIZ;
                                    if (abstractC2254721DMw4.LJJIZ && abstractC2254721DMw4.LIZIZ.LLLILZ && ((Integer) abstractC2254721DMw4.LJJJJ.getUpper()).intValue() < 30 && f2 >= ((Integer) c1do1.LIZ.LJJJJ.getUpper()).intValue() - 0.5f) {
                                        AbstractC2254721DMw abstractC2254721DMw5 = c1do1.LIZ;
                                        abstractC2254721DMw5.LJJJJI++;
                                        abstractC2254721DMw5.LJJJJJ++;
                                        abstractC2254721DMw5.LJJIZ = false;
                                        abstractC2254721DMw5.LL();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            c2254811DNf.LIZ = 0;
            c2254811DNf.LIZJ = System.currentTimeMillis();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            float f3 = c2254731DMx.LJJIJLIJ.LIZ.LIZIZ;
            InterfaceC2186151AhB interfaceC2186151AhB = c2254731DMx.LJIIZILJ;
            if (interfaceC2186151AhB != null) {
                C2186041Ah0 c2186041Ah0 = (C2186041Ah0) interfaceC2186151AhB;
                if (c2186041Ah0.LIZ.mHandle != 0) {
                    TECamera tECamera = c2186041Ah0.LIZ;
                    tECamera.nativeUpdateCameraStatus(tECamera.mHandle, f3);
                }
            }
            C20188413z0 c20188413z02 = c2254731DMx.LJIJ;
            if (c20188413z02 != null) {
                c20188413z02.LIZIZ(EnumC20188613z2.INSTANT_CAMERA_FPS, Float.valueOf(f3));
            }
        }
        if (z4) {
            C2254941DNs c2254941DNs = c2254731DMx.LJJIJLIJ.LIZJ;
            if (c2254941DNs.LJI) {
                c2254941DNs.LIZLLL++;
                c2254941DNs.LJFF = System.currentTimeMillis();
            } else {
                c2254941DNs.LJI = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c2254941DNs.LJ = jCurrentTimeMillis;
                c2254941DNs.LJFF = jCurrentTimeMillis;
            }
        } else {
            C2254941DNs c2254941DNs2 = c2254731DMx.LJJIJLIJ.LIZIZ;
            if (c2254941DNs2.LJI) {
                c2254941DNs2.LIZLLL++;
                c2254941DNs2.LJFF = System.currentTimeMillis();
            } else {
                c2254941DNs2.LJI = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c2254941DNs2.LJ = jCurrentTimeMillis2;
                c2254941DNs2.LJFF = jCurrentTimeMillis2;
            }
        }
        if (totalCaptureResult != null) {
            if (totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY) != null) {
                iIntValue = ((Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY)).intValue();
            } else {
                iIntValue = -1;
            }
            if (totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME) != null) {
                jLongValue = ((Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
            } else {
                jLongValue = -1;
            }
            this.LJJIIJ = iIntValue;
            C2254731DMx c2254731DMx2 = this.LJI;
            boolean z5 = this.LJJJJIZL;
            float f4 = jLongValue / 1000000.0f;
            C20188413z0 c20188413z03 = c2254731DMx2.LJIJ;
            if (c20188413z03 != null) {
                int i4 = c2254731DMx2.LJIJI + 1;
                c2254731DMx2.LJIJI = i4;
                if (i4 >= 30) {
                    c20188413z03.LIZIZ(EnumC20188613z2.INSTANT_ISO, Integer.valueOf(iIntValue));
                    c2254731DMx2.LJIJ.LIZIZ(EnumC20188613z2.INSTANT_EXPOSURE_TIME_MS, Float.valueOf(f4));
                    c2254731DMx2.LJIJI = 0;
                }
            }
            if (z5) {
                c2254731DMx2.LJJIJLIJ.LIZJ.LIZIZ(f4, iIntValue);
            } else {
                c2254731DMx2.LJJIJLIJ.LIZIZ.LIZIZ(f4, iIntValue);
            }
            C1DJ6 c1dj63 = this.LJII;
            if (c1dj63 != null && c1dj63.LLJJI) {
                z3 = true;
            } else {
                z3 = false;
            }
            C2254731DMx c2254731DMx3 = this.LJI;
            if (c2254731DMx3 != null) {
                if (c2254731DMx3.LJJIIJZLJL) {
                    c2254731DMx3.LJJII = 0L;
                    c2254731DMx3.LJJIIJ = 0L;
                    c2254731DMx3.LJJIIJZLJL = false;
                }
                if (jLongValue > 0 && iIntValue > 0) {
                    long j = c2254731DMx3.LJJII;
                    long j2 = c2254731DMx3.LJJIIJ;
                    long j3 = (j * j2) + jLongValue;
                    long j4 = 1 + j2;
                    c2254731DMx3.LJJII = j3 / j4;
                    if (z3) {
                        c2254731DMx3.LJJIII = (int) (((long) ((int) ((((long) c2254731DMx3.LJJIII) * j2) + ((long) this.LJJIIJ)))) / j4);
                    }
                    c2254731DMx3.LJJIIJ = j4;
                }
            }
        }
        if (!this.LJJIJIIJIL) {
            LJJIIZI();
            this.LJJIJIIJIL = true;
            long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LJJIL;
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("first capture result callback arrived! consume = ");
            sbLIZ2.append(jCurrentTimeMillis3);
            sbLIZ2.append(", session consume: ");
            sbLIZ2.append(this.LJJIJLIJ);
            C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            C1305710k5B.LIZ(jCurrentTimeMillis3, "te_record_camera2_set_repeating_request_cost");
            C1DJ6 c1dj64 = this.LJII;
            if (c1dj64 != null && (handler = this.LJIIJ) != null && c1dj64.LLJJI) {
                C786410Ut5.LJLIIL(c1dj64.LLJJIJIL, handler, this.LJI.LJJJJLI);
            }
        }
        C1DJ6 c1dj65 = this.LJII;
        if (c1dj65 != null && c1dj65.LLLLLJIL) {
            TECameraFrame.Metadata metadata = new TECameraFrame.Metadata();
            float[] fArr = this.LJJIIJZLJL;
            metadata.fovx = fArr[0];
            metadata.fovy = fArr[1];
            metadata.zoomRatio = this.LJIILLIIL;
            if (totalCaptureResult != null && (l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null && l.longValue() > 0) {
                metadata.exposureTime = (int) (l.longValue() / 1000);
            }
            C2254731DMx c2254731DMx4 = this.LJI;
            if (c2254731DMx4 != null && (c20188413z0 = c2254731DMx4.LJIJ) != null) {
                metadata.ambientLight = ((Float) c20188413z0.LIZ(EnumC20188613z2.INSTANT_AMBIENT_LIGHT_LUX)).floatValue();
            }
            C2254731DMx c2254731DMx5 = this.LJI;
            if (c2254731DMx5 != null && c2254731DMx5.LJJJJZ == 3 && this.LJJJI && (c1dnm = this.LJI.LJI) != null) {
                if (this.LJII.LLJJIJI) {
                    C1DN3[] c1dn3ArrLIZLLL = c1dnm.LIZLLL();
                    if (c1dn3ArrLIZLLL != null) {
                        for (C1DN3 c1dn3 : c1dn3ArrLIZLLL) {
                            c1dn3.LJIIIZ = metadata;
                        }
                    }
                } else {
                    C1DN3 c1dn3LIZIZ = c1dnm.LIZIZ();
                    if (c1dn3LIZIZ != null) {
                        c1dn3LIZIZ.LJIIIZ = metadata;
                    }
                }
            }
        }
        if (z && this.LJIILJJIL) {
            this.LJIILJJIL = C2183321Acc.LJI(totalCaptureResult);
        }
    }

    public int LJJIIZ(int i, String str) {
        C1321640kUs.LIZ("TECameraModeBase-openCamera");
        this.LJJIJIL = System.currentTimeMillis();
        CameraCharacteristics cameraCharacteristics = this.LIZ;
        if (cameraCharacteristics == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        this.LIZIZ.getClass();
        if (!C2244641CtK.LJIIJ(cameraCharacteristics, i)) {
            return -403;
        }
        this.LJII.LLILZIL = ((Integer) this.LIZ.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mCameraSettings.mRotation = ");
        sbLIZ.append(this.LJII.LLILZIL);
        sbLIZ.append(", mCameraSettings:");
        sbLIZ.append(this.LJII.hashCode());
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJII.LLLLZ) {
            this.LJIIJJI = C2217911BrJ.LIZLLL(this.LIZ, str);
        } else {
            this.LJIIJJI = (StreamConfigurationMap) this.LIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (this.LJIIJJI == null) {
            return -439;
        }
        C2244641CtK c2244641CtK = this.LIZIZ;
        CameraCharacteristics cameraCharacteristics2 = this.LIZ;
        float f = this.LJII.LLJJJ;
        c2244641CtK.getClass();
        this.LJIILL = C2244641CtK.LJ(cameraCharacteristics2, f);
        C1DJ6 c1dj6 = this.LJII;
        if (c1dj6.LLLLLLLLLL != -1.0f && c1dj6.LLLLLLLZIL != -1.0f) {
            this.LJIIZILJ = new Range<>(Float.valueOf(this.LJII.LLLLLLLZIL), Float.valueOf(this.LJII.LLLLLLLLLL));
        } else {
            C2244641CtK c2244641CtK2 = this.LIZIZ;
            CameraCharacteristics cameraCharacteristics3 = this.LIZ;
            c2244641CtK2.getClass();
            this.LJIIZILJ = C2244641CtK.LJIIIIZZ(cameraCharacteristics3);
        }
        this.LJIILLIIL = 1.0f;
        this.LJJIJIIJI = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        LJJIJIIJIL();
        this.LJJI = this.LJII.LLLF.getInt("useCameraFaceDetect");
        this.LJJ = (int[]) this.LIZ.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.LJIJ = 0;
        C1321640kUs.LIZIZ();
        return 0;
    }

    public final void LJJJJL(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession == this.LIZLLL && builder == this.LIZJ) {
            C1699800uKo c1699800uKoLJJJJJ = LJJJJJ(builder);
            if (!c1699800uKoLJJJJJ.LIZ) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateRequestRepeating failed: ");
                sbLIZ.append(c1699800uKoLJJJJJ.LIZIZ);
                C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraModeBase", "updateRequestRepeating failed, session changed...");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1DNP] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1DNG] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0uKN] */
    public AbstractC2254741DMy(C2254731DMx c2254731DMx, Context context, Handler handler) {
        this.LJIILJJIL = true;
        this.LJJJ = false;
        final C1DJ6 c1dj6 = this.LJII;
        this.LJJJLZIJ = new C2254951DNt(this, c1dj6) { // from class: X.1DNc
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                ((AbstractC2254741DMy) this.LIZ).LJJIIJ(totalCaptureResult, true);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC2254741DMy) this.LIZ).LJJIIJZLJL(captureFailure);
            }
        };
        this.LJI = c2254731DMx;
        C1DJ6 c1dj62 = c2254731DMx.LIZIZ;
        this.LJII = c1dj62;
        this.LIZIZ = C2244641CtK.LIZJ(context);
        this.LJFF = c2254731DMx.LIZLLL;
        this.LJIIJ = handler;
        this.LJIILJJIL = c1dj62.LLJI;
        this.LJJJ = false;
    }

    public final C1699800uKo LJI(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C1699800uKo c1699800uKo = new C1699800uKo();
        if (builder == null) {
            c1699800uKo.LIZIZ = "CaptureRequest.Builder is null";
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("capture: ");
            sbLIZ.append(c1699800uKo.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            return c1699800uKo;
        }
        if (this.LIZLLL == null) {
            c1699800uKo.LIZIZ = "Capture Session is null";
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("capture: ");
            sbLIZ2.append(c1699800uKo.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            return c1699800uKo;
        }
        try {
            this.LIZLLL.capture(builder.build(), captureCallback, handler);
            c1699800uKo.LIZ = true;
            return c1699800uKo;
        } catch (CameraAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            c1699800uKo.LIZIZ = e.getMessage();
            return c1699800uKo;
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            c1699800uKo.LIZIZ = e2.getMessage();
            return c1699800uKo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<android.hardware.camera2.params.OutputConfiguration>] */
    public void LJIIL(List list, C1DNG c1dng, final Handler handler) throws CameraAccessException {
        ?? arrayList;
        if (Build.VERSION.SDK_INT >= 28) {
            if (list != null || !this.LJII.LLLLLJLJLL || (arrayList = this.LJJJJZ) == 0) {
                arrayList = new ArrayList();
                for (Surface surface : (ArrayList) list) {
                    if (this.LJII.LLLIIIL) {
                        OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
                        this.LJJJJ = outputConfiguration;
                        outputConfiguration.enableSurfaceSharing();
                        int i = C2187451AjH.LIZ;
                        C2183341Ace.LIZ("TECameraModeBase", "enableSurfaceSharing");
                        arrayList.add(this.LJJJJ);
                    } else {
                        OutputConfiguration outputConfiguration2 = new OutputConfiguration(surface);
                        if (Build.VERSION.SDK_INT >= 33) {
                            C1DJ6 c1dj6 = this.LJII;
                            if (c1dj6.LLJLIL) {
                                if (((HashSet) c1dj6.LLLLZLLIL).contains(Long.valueOf(c1dj6.LLJLILLLLZIIL))) {
                                    outputConfiguration2.setDynamicRangeProfile(this.LJII.LLJLILLLLZIIL);
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("set dynamic profile ");
                                    sbLIZ.append(this.LJII.LLJLILLLLZIIL);
                                    C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
                                } else {
                                    int i3 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("do not support dynamic profile ");
                                    sbLIZ2.append(this.LJII.LLJLILLLLZIIL);
                                    C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        }
                        arrayList.add(outputConfiguration2);
                    }
                }
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(LJJII(list), arrayList, new Executor() { // from class: X.0N1T
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    Handler handler2 = handler;
                    if (handler2 != null) {
                        C786410Ut5.LJJZZIII(handler2, runnable);
                    }
                }
            }, c1dng);
            sessionConfiguration.setSessionParameters(this.LIZJ.build());
            int i4 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraModeBase", "createSession by sessionConfiguration ");
            this.LJIIIZ.createCaptureSession(sessionConfiguration);
            return;
        }
        int i5 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "createSession by normally");
        this.LJIIIZ.createCaptureSession(list, c1dng, handler);
    }

    public final C1699800uKo LJJJJJL(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C1321640kUs.LIZ("TECameraModeBase-updatePreview");
        C1699800uKo c1699800uKo = new C1699800uKo();
        if (builder == null) {
            c1699800uKo.LIZIZ = "CaptureRequest.Builder is null";
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updatePreview: ");
            sbLIZ.append(c1699800uKo.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            return c1699800uKo;
        }
        if (this.LIZLLL == null) {
            c1699800uKo.LIZIZ = "Capture Session is null";
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updatePreview: ");
            sbLIZ2.append(c1699800uKo.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            return c1699800uKo;
        }
        CaptureRequest captureRequestBuild = builder.build();
        this.LJIIL = captureRequestBuild;
        try {
            this.LIZLLL.setRepeatingRequest(captureRequestBuild, captureCallback, handler);
            c1699800uKo.LIZ = true;
            this.LJJJI = true;
        } catch (CameraAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            c1699800uKo.LIZIZ = e.getMessage();
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            c1699800uKo.LIZIZ = e2.getMessage();
        } catch (IllegalStateException e3) {
            TryCatchGuardChecker.doCheck(e3);
            c1699800uKo.LIZIZ = e3.getMessage();
            this.LJJJI = false;
        } catch (NullPointerException e4) {
            TryCatchGuardChecker.doCheck(e4);
            c1699800uKo.LIZIZ = e4.getMessage();
        } catch (SecurityException e5) {
            TryCatchGuardChecker.doCheck(e5);
            c1699800uKo.LIZIZ = e5.getMessage();
        }
        C1321640kUs.LIZIZ();
        return c1699800uKo;
    }

    public final Rect LIZJ(int i, int i2, float f, float f2, int i3, int i4, EnumC21617819iy enumC21617819iy) {
        int i5;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        if (this.LJIIL == null) {
            int i8 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraModeBase", "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int i9 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sbLIZ.append(rect.left);
        sbLIZ.append(", ");
        sbLIZ.append(rect.top);
        sbLIZ.append(", ");
        sbLIZ.append(rect.right);
        sbLIZ.append(", ");
        sbLIZ.append(rect.bottom);
        sbLIZ.append(e3.f);
        C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
        Size size = (Size) this.LIZ.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mCameraCharacteristics:[width, height]: [");
        sbLIZ2.append(size.getWidth());
        sbLIZ2.append(", ");
        sbLIZ2.append(size.getHeight());
        sbLIZ2.append(e3.f);
        C2183341Ace.LIZ("onAreaTouchEvent", C2188811AlT.LIZIZ(sbLIZ2));
        C1DJ6 c1dj6 = this.LJII;
        TEFrameSizei tEFrameSizei = c1dj6.LLJJJIL;
        int i10 = tEFrameSizei.width;
        int i11 = tEFrameSizei.height;
        EnumC21617819iy enumC21617819iy2 = EnumC21617819iy.VIEW;
        if (enumC21617819iy == enumC21617819iy2 && (90 == (i7 = c1dj6.LLILZIL) || 270 == i7)) {
            i6 = i11;
            i5 = i10;
        } else {
            i5 = i11;
            i6 = i10;
        }
        float f8 = 0.0f;
        if (i5 * i >= i6 * i2) {
            f3 = (i * 1.0f) / i6;
            f5 = ((i5 * f3) - i2) / 2.0f;
            f4 = 0.0f;
        } else {
            f3 = (i2 * 1.0f) / i5;
            f4 = ((i6 * f3) - i) / 2.0f;
            f5 = 0.0f;
        }
        float f9 = (f + f4) / f3;
        float f10 = (f2 + f5) / f3;
        if (enumC21617819iy == enumC21617819iy2) {
            if (90 == i3) {
                float f11 = i11 - f9;
                f9 = f10;
                f10 = f11;
            } else if (270 == i3) {
                float f12 = i10 - f10;
                f10 = f9;
                f9 = f12;
            }
        }
        Rect rect2 = (Rect) this.LJIIL.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 != null && !rect2.isEmpty()) {
            rect = rect2;
        } else {
            C2183341Ace.LJ("TECameraModeBase", "can't get crop region");
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cropRegion Rect: [left, top, right, bottom] = [");
        sbLIZ3.append(rect.left);
        sbLIZ3.append(", ");
        sbLIZ3.append(rect.top);
        sbLIZ3.append(", ");
        sbLIZ3.append(rect.right);
        sbLIZ3.append(", ");
        sbLIZ3.append(rect.bottom);
        C2183341Ace.LIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ3));
        int iWidth = rect.width();
        int iHeight = rect.height();
        C1DJ6 c1dj62 = this.LJII;
        TEFrameSizei tEFrameSizei2 = c1dj62.LLJJJIL;
        int i12 = tEFrameSizei2.height;
        int i13 = i12 * iWidth;
        int i14 = tEFrameSizei2.width;
        if (i13 > i14 * iHeight) {
            f6 = (iHeight * 1.0f) / i12;
            f8 = (iWidth - (i14 * f6)) / 2.0f;
            f7 = 0.0f;
        } else {
            f6 = (iWidth * 1.0f) / i14;
            f7 = (iHeight - (i12 * f6)) / 2.0f;
        }
        float f13 = (f9 * f6) + f8 + rect.left;
        float fHeight = (f10 * f6) + f7 + rect.top;
        if (enumC21617819iy == enumC21617819iy2 && c1dj62.LLILZ == 1) {
            fHeight = rect.height() - fHeight;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = f13;
            rect3.left = (int) (d - (((double) rect.width()) * 0.05d));
            rect3.right = (int) (d + (((double) rect.width()) * 0.05d));
            double d2 = fHeight;
            rect3.top = (int) (d2 - (((double) rect.height()) * 0.05d));
            rect3.bottom = (int) (d2 + (0.05d * ((double) rect.height())));
        } else {
            double d3 = f13;
            rect3.left = (int) (d3 - (((double) rect.width()) * 0.1d));
            rect3.right = (int) (d3 + (((double) rect.width()) * 0.1d));
            double d4 = fHeight;
            rect3.top = (int) (d4 - (((double) rect.height()) * 0.1d));
            rect3.bottom = (int) (d4 + (((double) rect.height()) * 0.1d));
        }
        int i15 = rect3.left;
        if (i15 < 0 || i15 < rect.left) {
            rect3.left = rect.left;
        }
        int i16 = rect3.top;
        if (i16 < 0 || i16 < rect.top) {
            rect3.top = rect.top;
        }
        int i17 = rect3.right;
        if (i17 < 0 || i17 > rect.right) {
            rect3.right = rect.right;
        }
        int i18 = rect3.bottom;
        if (i18 < 0 || i18 > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Focus Rect: [left, top, right, bottom] = [");
        sbLIZ4.append(rect3.left);
        sbLIZ4.append(", ");
        sbLIZ4.append(rect3.top);
        sbLIZ4.append(", ");
        sbLIZ4.append(rect3.right);
        sbLIZ4.append(", ");
        sbLIZ4.append(rect3.bottom);
        sbLIZ4.append("] x=");
        sbLIZ4.append(f13);
        sbLIZ4.append(" y=");
        sbLIZ4.append(fHeight);
        C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ4));
        return rect3;
    }
}
