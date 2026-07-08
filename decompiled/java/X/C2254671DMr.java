package X;

import Y.ARunnableS44S0101000_33;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254671DMr extends AbstractC2254721DMw {
    public Camera LJJJJLL;
    public Camera.Parameters LJJJJZ;
    public final C21617719ix LJJJJZI;
    public String LJJJLIIL;
    public int LJJJLL;
    public List<TEFrameSizei> LJJJLZIJ;
    public List<TEFrameSizei> LJJJZ;
    public List<TEFrameSizei> LJJL;
    public List<Integer> LJJLI;
    public float LJJLIIIIJ;
    public int LJJLIIIJ;
    public final AtomicBoolean LJJLIIIJILLIZJL;
    public long LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public boolean LJJLIIIJL;

    @Override // X.C1DJK
    public final void LJIIJ(EnumC2244671CtN enumC2244671CtN) {
    }

    @Override // X.C1DJK
    public final boolean LJJIZ(long j) {
        return false;
    }

    @Override // X.C1DJK
    public final boolean LJJJI() {
        Camera.Parameters parameters;
        try {
            if (this.LJJJJLL != null && (parameters = this.LJJJJZ) != null && parameters.getSupportedWhiteBalance() != null) {
                if (this.LJJJJZ.isAutoWhiteBalanceLockSupported()) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported whileBalance!: ");
            sbLIZ.append(e.toString());
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    @Override // X.C1DJK
    public final boolean LJJJJIZL(EnumC2244671CtN enumC2244671CtN) {
        return false;
    }

    @Override // X.C1DJK
    public final float[] LJJJJJL() {
        float[] fArr = new float[2];
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "getFOV: camera device is null.");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "getFOV: camera device is null.");
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJJJZ = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.LJJJJZ.getHorizontalViewAngle();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Camera1:verticalFOV = ");
            sbLIZ.append(fArr[0]);
            sbLIZ.append(",horizontalFOV = ");
            sbLIZ.append(fArr[1]);
            C2183341Ace.LIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            return fArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // X.C1DJK
    public final boolean LJJLJLI() {
        return false;
    }

    @Override // X.AbstractC2254721DMw
    public final int LJZI() {
        return 1;
    }

    @Override // X.AbstractC2254721DMw
    public final int LL() {
        return 0;
    }

    @Override // X.AbstractC2254721DMw
    public final int LLD() {
        return 0;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJ() {
        Camera.Size pictureSize;
        Camera camera = this.LJJJJLL;
        if (camera != null) {
            try {
                pictureSize = camera.getParameters().getPictureSize();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                pictureSize = null;
            }
        } else {
            pictureSize = null;
        }
        if (pictureSize == null) {
            return null;
        }
        return new int[]{pictureSize.width, pictureSize.height};
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJII() {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / LSPassThroughRecordSizeConfig.DEFAULT;
            iArr[1] = iArr[1] / LSPassThroughRecordSizeConfig.DEFAULT;
            return iArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C1DJK
    public final void LJIIIIZZ() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera1", "cancelFocus...");
        Camera camera = this.LJJJJLL;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.C1DJK
    public final void LJJIL() {
        if (this.LJJJJLL == null || this.LJJJJZ == null) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera1", "enableCaf...");
        try {
            if (this.LJJJJZ.getSupportedFocusModes().contains("continuous-video")) {
                this.LJJJJLL.cancelAutoFocus();
                this.LJJJJZ.setFocusMode("continuous-video");
                this.LJJJJLL.setParameters(this.LJJJJZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error: focusAtPoint failed: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -411, strLIZIZ);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final List<TEFrameSizei> LJJJJI() {
        Camera.Parameters parameters = this.LJJJJZ;
        if (parameters == null) {
            this.LJJJZ.clear();
            return this.LJJJZ;
        }
        List<TEFrameSizei> listLLF = LLF(parameters.getSupportedPictureSizes());
        this.LJJJZ = listLLF;
        return listLLF;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJJLIIL() {
        Camera.Parameters parameters = this.LJJJJZ;
        if (parameters == null) {
            return;
        }
        if (this.LJJJJLL == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "setPreviewFpsRange : camera is null");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "setPreviewFpsRange : camera is null");
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int iLIZ = TEFrameRateRange.LIZ(supportedPreviewFpsRange);
        C1DJ6 c1dj6 = this.LIZIZ;
        int[] iArrLJIIL = C2183321Acc.LJIIL(c1dj6.LLLIIII, c1dj6.LLILZ, c1dj6.LLILLL.LIZIZ(iLIZ), supportedPreviewFpsRange);
        this.LJJJJZ.setPreviewFpsRange(iArrLJIIL[0], iArrLJIIL[1]);
        this.LIZLLL.LJ(121, 0, new TEFrameRateRange(iArrLJIIL[0], iArrLJIIL[1]).toString());
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Camera1:setPreviewFpsRange(");
        sbLIZ.append(iArrLJIIL[0]);
        sbLIZ.append(", ");
        sbLIZ.append(iArrLJIIL[1]);
        sbLIZ.append(") strategy=");
        sbLIZ.append(this.LIZIZ.LLLIIII);
        C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.LJJJJLL.setParameters(this.LJJJJZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to set parameters: ");
            sbLIZ2.append(e);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final boolean LJJLIIIJJIZ() {
        Camera.Parameters parameters;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "isAutoFocusLockSupported...");
        Camera camera = this.LJJJJLL;
        if (camera == null || (parameters = this.LJJJJZ) == null || !this.LIZJ) {
            this.LIZLLL.LIZJ(camera, 1, -439, "setAutoFocusLock failed. ： Camera is null.");
            return false;
        }
        try {
            return parameters.getSupportedFocusModes().contains("fixed");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZLLL.LJ(-433, -433, "isAutoFocusLockSupported failed");
            return false;
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final List<TEFrameSizei> LJJLIIJ() {
        Camera.Parameters parameters = this.LJJJJZ;
        if (parameters == null) {
            this.LJJJLZIJ.clear();
            return this.LJJJLZIJ;
        }
        List<TEFrameSizei> listLLF = LLF(parameters.getSupportedPreviewSizes());
        this.LJJJLZIJ = listLLF;
        return listLLF;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLJ() {
        if (this.LJJJJLL == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "takePicture: camera is null.");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "takePicture: camera is null.");
            return;
        }
        try {
            this.LIZJ = false;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("takePicture size: ");
            sbLIZ.append(this.LIZIZ.LLJJJJJIL.toString());
            C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJJJJLL.takePicture(null, null, new Camera.PictureCallback() { // from class: X.1Ail
                @Override // android.hardware.Camera.PictureCallback
                public final void onPictureTaken(byte[] bArr, Camera camera) throws Throwable {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("capture data arrive consume: ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
                    Camera camera2 = this.LIZIZ.LJJJJLL;
                    if (camera2 != null) {
                        C2204961BRm.LJJJZ(camera2, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ4=", null));
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DJH.LIZ(e);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJZ() {
        C1321640kUs.LIZ("TECamera1-collectCameraCapabilities");
        if (!this.LIZIZ.LLLLLLZ || this.LJJI) {
            C1321640kUs.LIZIZ();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.LJJJJZ != null) {
                this.LJJ.putOpt("camera_id", Integer.valueOf(this.LIZIZ.LLILZLL));
                if (this.LJJJJZ.isZoomSupported()) {
                    this.LJJ.putOpt("camera_zoom_max_ability", Integer.valueOf(this.LJJJJZ.getMaxZoom()));
                }
                if (this.LJJJJZ.isVideoStabilizationSupported()) {
                    this.LJJ.putOpt("camera_stabilization", 1);
                } else {
                    this.LJJ.putOpt("camera_stabilization", -1);
                }
                List<TEFrameSizei> listLJJLIIJ = LJJLIIJ();
                if (listLJJLIIJ != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (TEFrameSizei tEFrameSizei : listLJJLIIJ) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.width));
                        jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.height));
                        jSONArray.put(jSONObject);
                    }
                    this.LJJ.putOpt("preview_size_lit", jSONArray);
                }
                List<TEFrameSizei> listLJJJJI = LJJJJI();
                if (listLJJJJI != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (TEFrameSizei tEFrameSizei2 : listLJJJJI) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("width", Integer.valueOf(tEFrameSizei2.width));
                        jSONObject2.putOpt("height", Integer.valueOf(tEFrameSizei2.height));
                        jSONArray2.put(jSONObject2);
                    }
                    this.LJJ.putOpt("picture_size_list", jSONArray2);
                }
                List<int[]> supportedPreviewFpsRange = this.LJJJJZ.getSupportedPreviewFpsRange();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZIZ.LLLFF);
                sbLIZ.append("=");
                new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                JSONArray jSONArray3 = new JSONArray();
                if (supportedPreviewFpsRange != null) {
                    for (int[] iArr : supportedPreviewFpsRange) {
                        supportedPreviewFpsRange.indexOf(iArr);
                        supportedPreviewFpsRange.size();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.putOpt("fps_min", Integer.valueOf(iArr[0] / LSPassThroughRecordSizeConfig.DEFAULT));
                        jSONObject3.putOpt("fps_max", Integer.valueOf(iArr[1] / LSPassThroughRecordSizeConfig.DEFAULT));
                        jSONArray3.put(jSONObject3);
                    }
                    this.LJJ.putOpt("fps_range_list", jSONArray3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECamera1", "collectCameraCapabilities fails");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
        this.LJJI = true;
        C1321640kUs.LIZIZ();
    }

    @Override // X.C1DJK
    public final boolean LJLIIIL() {
        Camera.Parameters parameters;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "isAutoExposureLockSupported...");
        if (this.LJJJJLL == null || (parameters = this.LJJJJZ) == null || !this.LIZJ) {
            return false;
        }
        return parameters.isAutoExposureLockSupported();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJLJJI() {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractC2254721DMw
    public final Bundle LJZ() {
        List<TEFrameSizei> listLLF;
        ArrayList arrayList;
        Camera.Parameters parameters;
        C1DJ6 c1dj6 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILZ);
        sbLIZ.append("");
        c1dj6.LLLFF = C2188811AlT.LIZIZ(sbLIZ);
        Bundle bundleLJZ = super.LJZ();
        if (bundleLJZ != null) {
            C786410Ut5.LJJIL(bundleLJZ, "support_preview_sizes", (ArrayList) LJJLIIJ());
            C786410Ut5.LJJIL(bundleLJZ, "support_picture_sizes", (ArrayList) LJJJJI());
            Camera.Parameters parameters2 = this.LJJJJZ;
            if (parameters2 == null || parameters2.getSupportedVideoSizes() == null) {
                ((ArrayList) this.LJJL).clear();
                listLLF = this.LJJL;
            } else {
                listLLF = LLF(this.LJJJJZ.getSupportedVideoSizes());
                this.LJJL = listLLF;
            }
            C786410Ut5.LJJIL(bundleLJZ, "support_video_sizes", (ArrayList) listLLF);
            Camera.Parameters parameters3 = this.LJJJJZ;
            if (parameters3 == null) {
                arrayList = null;
            } else {
                List<int[]> supportedPreviewFpsRange = parameters3.getSupportedPreviewFpsRange();
                arrayList = new ArrayList(supportedPreviewFpsRange.size());
                for (int[] iArr : supportedPreviewFpsRange) {
                    arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
                }
            }
            C786410Ut5.LJJIL(bundleLJZ, "camera_support_fps_range", arrayList);
            C786410Ut5.LJJIJL(bundleLJZ, "camera_preview_size", this.LIZIZ.LLJJJIL);
            try {
                bundleLJZ.putBoolean("camera_torch_supported", (this.LJJJJLL == null || (parameters = this.LJJJJZ) == null || parameters.getSupportedFlashModes() == null) ? false : true);
                return bundleLJZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Get camera torch information failed: ");
                sbLIZ2.append(e.toString());
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
                bundleLJZ.putBoolean("camera_torch_supported", false);
            }
        }
        return bundleLJZ;
    }

    @Override // X.AbstractC2254721DMw
    public final int LJZL() {
        int iLJIIJ = this.LJIIJ;
        if (iLJIIJ < 0) {
            iLJIIJ = C2183321Acc.LJIIJ(this.LJFF);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.LJII = this.LJIIIIZZ;
        try {
            Camera.getCameraInfo(this.LIZIZ.LLILZLL, cameraInfo);
            if (this.LJII == 1) {
                int i = (cameraInfo.orientation + iLJIIJ) % 360;
                this.LJIIIZ = i;
                this.LJIIIZ = ((360 - i) + 180) % 360;
            } else {
                this.LJIIIZ = ((cameraInfo.orientation - iLJIIJ) + 360) % 360;
            }
            return this.LJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFrameOrientation :");
            sbLIZ.append(e.getMessage());
            interfaceC2254691DMt.LIZJ(this.LJJJJLL, 1, -443, C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0388 A[PHI: r1
      0x0388: PHI (r1v22 java.lang.String) = (r1v20 java.lang.String), (r1v23 java.lang.String) binds: [B:126:0x037f, B:132:0x0390] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLFFF() {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254671DMr.LLFFF():int");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int getFlashMode() {
        String flashMode;
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            return -1;
        }
        try {
            if (this.LJJJJZ == null) {
                this.LJJJJZ = camera.getParameters();
            }
            flashMode = this.LJJJJZ.getFlashMode();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            flashMode = null;
        }
        if ("on".equals(flashMode)) {
            return 1;
        }
        if ("auto".equals(flashMode)) {
            return 3;
        }
        if ("off".equals(flashMode)) {
            return 0;
        }
        if ("torch".equals(flashMode)) {
            return 2;
        }
        return "red-eye".equals(flashMode) ? 4 : -1;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final boolean isSupportedExposureCompensation() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "isSupportedExposureCompensation...");
        if (this.LJJJJLL == null || this.LJJJJZ == null || !this.LIZJ) {
            return false;
        }
        return this.LIZIZ.LLLFZ.LIZ();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void stopCapture() throws Throwable {
        Handler handler;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "Camera stopCapture...");
        C1321640kUs.LIZ("TECamera1-stopCapture");
        if (this.LIZJ && this.LJJJJLL != null) {
            this.LIZJ = false;
            this.LJJLIIIJILLIZJL.set(false);
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2204961BRm.LJJJZ(this.LJJJJLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ4=", null));
                C1305710k5B.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "te_record_camera1_stop_preview_cost");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("camera stopcapture failed: ");
                sbLIZ.append(e.getMessage());
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJJLIIIJJI = 0L;
            this.LJJIIZ = 0;
            C1DJ6 c1dj6 = this.LIZIZ;
            if (c1dj6 != null && (handler = this.LJ) != null && c1dj6.LLJJI) {
                handler.removeCallbacks(this.LJJJJLI);
            }
            C2183341Ace.LIZLLL("TECamera1", "Camera preview stopped!");
            this.LIZLLL.LIZ(this.LJJJJLL, "TECamera1 preview stoped");
        }
        C1321640kUs.LIZIZ();
    }

    @Override // X.C1DJK
    public final boolean LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZIZ.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isTorchSupported key = ");
        sbLIZ2.append(strLIZIZ);
        C2183341Ace.LIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
        BaseBundle baseBundle = (BaseBundle) ((HashMap) this.LJIJJLI).get(strLIZIZ);
        if (baseBundle == null) {
            return false;
        }
        return baseBundle.getBoolean("camera_torch_supported", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0495 A[Catch: Exception -> 0x04af, TRY_LEAVE, TryCatch #0 {Exception -> 0x04af, blocks: (B:161:0x0491, B:163:0x0495), top: B:176:0x0491 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: Exception -> 0x0445, TryCatch #1 {Exception -> 0x0445, blocks: (B:9:0x0022, B:11:0x0026, B:13:0x002a, B:14:0x002f, B:16:0x0033, B:17:0x003b, B:20:0x004f, B:22:0x0059, B:24:0x005f, B:26:0x0063, B:31:0x009b, B:27:0x007e, B:29:0x0082, B:30:0x0094, B:41:0x00ec, B:44:0x00fa, B:46:0x0104, B:48:0x010a, B:50:0x010e, B:52:0x0116, B:54:0x011c, B:56:0x0124, B:58:0x012a, B:59:0x0139, B:71:0x0189, B:72:0x0193, B:60:0x0148, B:62:0x0150, B:64:0x0159, B:66:0x0161, B:68:0x0169, B:69:0x0173, B:73:0x0194, B:74:0x019e, B:75:0x019f, B:70:0x0183, B:86:0x01f7, B:88:0x01fb, B:90:0x0207, B:92:0x0222, B:93:0x0231, B:112:0x02ce, B:114:0x02d8, B:116:0x02e4, B:126:0x032c, B:118:0x02f0, B:120:0x02ff, B:122:0x0303, B:123:0x0319, B:124:0x0327, B:127:0x0338, B:129:0x033e, B:130:0x0376, B:131:0x037d, B:133:0x03f0, B:135:0x03f4, B:137:0x03f8, B:94:0x023f, B:96:0x0258, B:77:0x01b7, B:79:0x01c1, B:81:0x01c9, B:83:0x01d7, B:85:0x01e3, B:97:0x026d, B:140:0x0405, B:141:0x040f, B:98:0x027f, B:100:0x0289, B:102:0x0293, B:104:0x029b, B:106:0x02a5, B:108:0x02ad, B:109:0x02b7, B:142:0x0410, B:143:0x041a, B:144:0x041b, B:145:0x0422, B:146:0x0423, B:32:0x009e, B:34:0x00a8, B:36:0x00c2, B:39:0x00da, B:37:0x00cc, B:148:0x043d, B:149:0x0444), top: B:178:0x0022 }] */
    @Override // X.AbstractC2254721DMw, X.C1DJK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254671DMr.LJJLIIIJLJLI():void");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final JSONObject LJJIJ() {
        return this.LJJ;
    }

    public static List<TEFrameSizei> LLF(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LIZ(int i) {
        String strLIZIZ;
        int i2;
        String str;
        int i3;
        Handler handler;
        int i4 = 0;
        if (this.LJJJJLL == null) {
            int i5 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C2183341Ace.LIZIZ("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "switchFlashMode failed: Camera is not ready!");
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            if (i != 0) {
                i4 = 1;
            }
            interfaceC2254691DMt.LJIIIZ(i4, "switchFlashMode failed: Camera is not ready!");
            return;
        }
        if (this.LJJLIIIJJI != 0 && System.currentTimeMillis() - this.LJJLIIIJJI < 200 && (handler = this.LJ) != null) {
            C786410Ut5.LJLIIL(200L, handler, new ARunnableS44S0101000_33(i, this, 3));
            return;
        }
        this.LJJLIIIJL = false;
        try {
            Camera.Parameters parameters = this.LJJJJLL.getParameters();
            this.LJJJJZ = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i == 0) {
                    str = "off";
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str = "red-eye";
                            }
                        } else {
                            str = "auto";
                        }
                    } else {
                        str = "torch";
                    }
                } else {
                    str = "on";
                    this.LJJLIIIJL = true;
                }
                if (supportedFlashModes.contains(str)) {
                    InterfaceC2254691DMt interfaceC2254691DMt2 = this.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("camera1 will change flash mode ");
                    sbLIZ.append(str);
                    interfaceC2254691DMt2.LJ(104, 0, C2188811AlT.LIZIZ(sbLIZ));
                    this.LJJJJZ.setFlashMode(str);
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    if ("off".equalsIgnoreCase(str) && this.LIZIZ.LLLF.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    InterfaceC2254691DMt interfaceC2254691DMt3 = this.LIZLLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("camera1 did change flash mode ");
                    sbLIZ2.append(str);
                    interfaceC2254691DMt3.LJ(105, 0, C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC2254691DMt interfaceC2254691DMt4 = this.LIZLLL;
                    if (i == 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    interfaceC2254691DMt4.LJIIIIZZ(i3, "torch success");
                    return;
                }
            }
            if (supportedFlashModes != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Camera does not support flash mode: ");
                sbLIZ3.append(i);
                sbLIZ3.append("support list: ");
                sbLIZ3.append(supportedFlashModes);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Camera does not support flash mode: ");
                sbLIZ4.append(i);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode ");
            sbLIZ5.append(i);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ5));
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -419, strLIZIZ);
            InterfaceC2254691DMt interfaceC2254691DMt5 = this.LIZLLL;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            interfaceC2254691DMt5.LJIIIZ(i2, strLIZIZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: ");
            sbLIZ6.append(e2);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Switch flash mode failed: ");
            sbLIZ7.append(e2.toString());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ2);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -418, strLIZIZ2);
            InterfaceC2254691DMt interfaceC2254691DMt6 = this.LIZLLL;
            if (i != 0) {
                i4 = 1;
            }
            interfaceC2254691DMt6.LJIIIZ(i4, strLIZIZ2);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJI(Cert cert) throws Throwable {
        Handler handler;
        C1321640kUs.LIZ("TECamera1-close");
        this.LJJLIIIJL = false;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "Camera close start...");
        if (this.LJJJJLL != null) {
            if (this.LIZJ) {
                try {
                    if (!this.LIZIZ.LLLLLZIL) {
                        C2183341Ace.LIZLLL("TECamera1", "Camera close torch...");
                        Camera.Parameters parameters = this.LJJJJLL.getParameters();
                        this.LJJJJZ = parameters;
                        parameters.setFlashMode("off");
                        this.LJJJJLL.setParameters(this.LJJJJZ);
                    } else if (getFlashMode() == 2) {
                        if (this.LJJJJZ == null) {
                            this.LJJJJZ = this.LJJJJLL.getParameters();
                        }
                        this.LJJJJZ.setFlashMode("off");
                        this.LJJJJLL.setParameters(this.LJJJJZ);
                    }
                    C2183341Ace.LIZLLL("TECamera1", "Camera stopPreview...");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C2204961BRm.LJJJZ(this.LJJJJLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ4=", null));
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C2183341Ace.LIZLLL("TECamera1", "Camera stopPreview end...");
                    this.LJJIIZ = 0;
                    C1DJ6 c1dj6 = this.LIZIZ;
                    if (c1dj6 != null && (handler = this.LJ) != null && c1dj6.LLJJI) {
                        handler.removeCallbacks(this.LJJJJLI);
                    }
                    C1305710k5B.LIZ(jCurrentTimeMillis2, "te_record_camera1_stop_preview_cost");
                    if (this.LIZIZ.LLJJIJI) {
                        for (C1DN3 c1dn3 : this.LJI.LIZLLL()) {
                            if (c1dn3.LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_SURFACE_TEXTURE) {
                                c1dn3.LJI().setOnFrameAvailableListener(null, null);
                            } else if (c1dn3.LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_BUFFER_CALLBACK) {
                                this.LJJJJLL.setPreviewCallbackWithBuffer(null);
                            }
                        }
                    } else if (this.LJI.LIZJ() == EnumC2186221AhI.PROVIDER_TYPE_SURFACE_TEXTURE) {
                        this.LJI.LJ().setOnFrameAvailableListener(null, null);
                    } else if (this.LJI.LIZJ() == EnumC2186221AhI.PROVIDER_TYPE_BUFFER_CALLBACK) {
                        this.LJJJJLL.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Close camera failed: ");
                    sbLIZ.append(e.getMessage());
                    C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZJ = false;
            }
            try {
                this.LJJJJLL.setErrorCallback(null);
                LJLZ(108, "will close camera1");
                if (cert == null) {
                    cert = LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                }
                C1305590k4z.LIZ(this.LJJJJLL, cert);
                LJLZ(109, "did close camera1");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Camera release failed: ");
                sbLIZ2.append(e2.getMessage());
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LJJLIIIJILLIZJL.set(false);
            this.LJJJJLL = null;
            int i4 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera1", "Camera closed end!");
            this.LIZLLL.LJII(1, this, this.LJJJJLL);
        }
        this.LJIL = null;
        C1321640kUs.LIZIZ();
        return 0;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJIILL(final C1DJG c1djg) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "focusAtPoint: camera is null.");
            c1djg.LJIIJJI.LIZ(-439, this.LIZIZ.LLILZ, "focusAtPoint: camera is null.");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "focusAtPoint: camera is null.");
            return;
        }
        boolean z = false;
        try {
            parameters = camera.getParameters();
            this.LJJJJZ = parameters;
            C21617719ix c21617719ix = this.LJJJJZI;
            str = this.LJJJLIIL;
            c21617719ix.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error: focusAtPoint failed: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            c1djg.LJIIJJI.LIZ(-411, this.LIZIZ.LLILZ, strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -411, strLIZIZ);
        }
        if (parameters != null) {
            if (!((ArrayList) C21617719ix.LIZLLL).contains(Build.BRAND.toLowerCase()) && parameters.getMaxNumFocusAreas() > 0 && parameters.getSupportedFocusModes().contains(str)) {
                if (c1djg.LJII) {
                    C21617719ix c21617719ix2 = this.LJJJJZI;
                    Camera.Parameters parameters2 = this.LJJJJZ;
                    c21617719ix2.getClass();
                    if (parameters2 != null && parameters2.getMaxNumMeteringAreas() > 0) {
                        this.LJJJJZ.setMeteringAreas(this.LJJJJZI.LIZ(c1djg.LIZ, c1djg.LIZIZ, c1djg.LJ, c1djg.LIZJ, c1djg.LIZLLL, this.LIZIZ.LLILZIL, c1djg.LJIIJ));
                    }
                }
                if (c1djg.LJI) {
                    Camera.Parameters parameters3 = this.LJJJJZ;
                    C21617719ix c21617719ix3 = this.LJJJJZI;
                    Rect rectLIZIZ = c21617719ix3.LIZIZ(c1djg.LIZ, c1djg.LIZIZ, c1djg.LJ, 90.0f, c1djg.LIZJ, c1djg.LIZLLL, this.LIZIZ.LLILZIL, c1djg.LJIIJ);
                    if (((ArrayList) c21617719ix3.LIZIZ).size() > 0) {
                        ((ArrayList) c21617719ix3.LIZIZ).clear();
                    }
                    ((ArrayList) c21617719ix3.LIZIZ).add(new Camera.Area(rectLIZIZ, LSPassThroughRecordSizeConfig.DEFAULT));
                    parameters3.setFocusAreas(c21617719ix3.LIZIZ);
                    this.LJJJJLL.cancelAutoFocus();
                    this.LJJJJZ.setFocusMode("auto");
                    if (this.LJJLIIIJL && !c1djg.LJIIIZ) {
                        this.LJJJJZ.setFlashMode("off");
                        z = true;
                    }
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    this.LJJJJLL.autoFocus(new Camera.AutoFocusCallback() { // from class: X.1AmS
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z2, Camera camera2) {
                            String str2;
                            if (z2) {
                                C1DJG c1djg2 = c1djg;
                                str2 = "Camera Focus Succeed!";
                                c1djg2.LJIIJJI.LIZ(c1djg2.LIZ(), this.LIZIZ.LIZIZ.LLILZ, "Camera Focus Succeed!");
                            } else {
                                str2 = "Camera Focus Failed!";
                                c1djg.LJIIJJI.LIZ(-1, this.LIZIZ.LIZIZ.LLILZ, "Camera Focus Failed!");
                            }
                            int i3 = C2187451AjH.LIZ;
                            C2183341Ace.LIZLLL("TECamera1", str2);
                            if (c1djg.LJIIIIZZ && z2) {
                                return;
                            }
                            try {
                                Camera.Parameters parameters4 = camera2.getParameters();
                                parameters4.setFocusMode("continuous-video");
                                camera2.setParameters(parameters4);
                                C2254671DMr c2254671DMr = this.LIZIZ;
                                c2254671DMr.LLFII(c2254671DMr.LJJLIIIJJIZ);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Error: focusAtPoint failed: ");
                                sbLIZ2.append(e2);
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                int i4 = C2187451AjH.LIZ;
                                C2183341Ace.LIZIZ("TECamera1", strLIZIZ2);
                                C2254671DMr c2254671DMr2 = this.LIZIZ;
                                c2254671DMr2.LIZLLL.LIZJ(c2254671DMr2.LJJJJLL, 1, -411, strLIZIZ2);
                            }
                        }
                    });
                    if (z) {
                        try {
                            this.LJJJJZ.setFlashMode("on");
                            this.LJJJJLL.setParameters(this.LJJJJZ);
                            return;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return;
                        }
                    }
                    return;
                }
                this.LJJJJLL.setParameters(this.LJJJJZ);
                int i3 = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECamera1", "focus is not enable!");
                return;
            }
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera1", "Error: not support focus.");
        this.LIZLLL.LJ(-412, -412, "Error: not support focus.");
        C21617719ix c21617719ix4 = this.LJJJJZI;
        Camera.Parameters parameters4 = this.LJJJJZ;
        c21617719ix4.getClass();
        if (parameters4 != null && parameters4.getMaxNumMeteringAreas() > 0 && c1djg.LJII) {
            this.LJJJJZ.setMeteringAreas(this.LJJJJZI.LIZ(c1djg.LIZ, c1djg.LIZIZ, c1djg.LJ, c1djg.LIZJ, c1djg.LIZLLL, this.LIZIZ.LLILZIL, c1djg.LJIIJ));
            this.LJJJJLL.setParameters(this.LJJJJZ);
        } else {
            c1djg.LJIIJJI.LIZ(-412, this.LIZIZ.LLILZ, "Error: not support focus.");
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJ(Bundle bundle) {
        Object obj;
        if (bundle == null) {
            return;
        }
        BaseBundle baseBundle = (BaseBundle) ((HashMap) this.LJIJJLI).get(this.LIZIZ.LLLFF);
        for (String str : bundle.keySet()) {
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (C2247811CyR.LIZ(obj, str) && TextUtils.equals(str, "support_light_soft")) {
                baseBundle.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // X.C1DJK
    public final void LJJIFFI(String str) {
        Camera camera = this.LJJJJLL;
        if (camera != null && this.LIZJ) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                this.LJJJJZ = parameters;
                List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
                if (supportedWhiteBalance != null && supportedWhiteBalance.contains(str)) {
                    this.LJJJJZ.setWhiteBalance(str);
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SupportWBList has no value: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
                this.LIZLLL.LIZJ(this.LJJJJLL, 1, -424, strLIZIZ);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Set WhileBalance failed: ");
                sbLIZ2.append(e.toString());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", strLIZIZ2);
                this.LIZLLL.LIZJ(this.LJJJJLL, 1, -424, strLIZIZ2);
                return;
            }
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera1", "setWhileBalance : Camera is null!");
        this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "setWhileBalance : Camera is null!");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJIIJ(boolean z) {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "setAutoFocusLock...");
        Camera camera = this.LJJJJLL;
        if (camera != null && this.LJJJJZ != null && this.LIZJ) {
            if (!LJJLIIIJJIZ()) {
                C2183341Ace.LJ("TECamera1", "Current camera doesn't support af lock.");
                this.LIZLLL.LJ(-433, -433, "Current camera doesn't support af lock.");
                return;
            }
            try {
                if (z) {
                    this.LJJJJZ.setFocusMode("fixed");
                } else {
                    this.LJJJJZ.setFocusMode("continuous-video");
                }
                this.LJJJJLL.setParameters(this.LJJJJZ);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: setAutoFocusLock failed: ");
                sbLIZ.append(e.toString());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
                this.LIZLLL.LJ(-427, -427, strLIZIZ);
                return;
            }
        }
        this.LIZLLL.LIZJ(camera, 1, -439, "setAutoFocusLock failed. ： Camera is null.");
    }

    @Override // X.C1DJK
    public final void LJJIIZI(int i) {
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECamera1", "Does not support switch mode for camera1");
        this.LIZLLL.LJ(-200, -200, "Does not support switch mode for camera1");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJJI(Cert cert) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("force close camera: ");
        sbLIZ.append(this.LJJJJLL);
        C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (this.LJJJJLL != null) {
                if (cert == null) {
                    cert = LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                }
                C1305590k4z.LIZ(this.LJJJJLL, cert);
                this.LJJJJLL = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "force close camera failed");
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLL(TEFrameRateRange tEFrameRateRange) {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: mCameraDevice is null");
            C2183341Ace.LIZIZ("TECamera1", "setPreviewFpsRangeWhenRunning : Camera is null!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "setPreviewFpsRangeWhenRunning : Camera is null!");
            return;
        }
        try {
            if (this.LJJJJZ == null) {
                this.LJJJJZ = camera.getParameters();
            }
            List<int[]> supportedPreviewFpsRange = this.LJJJJZ.getSupportedPreviewFpsRange();
            int[] iArrLJIIL = C2183321Acc.LJIIL(3, this.LIZIZ.LLILZ, tEFrameRateRange.LIZIZ(TEFrameRateRange.LIZ(supportedPreviewFpsRange)), supportedPreviewFpsRange);
            this.LJJJJZ.setPreviewFpsRange(iArrLJIIL[0], iArrLJIIL[1]);
            this.LIZLLL.LJ(121, 0, new TEFrameRateRange(iArrLJIIL[0], iArrLJIIL[1]).toString());
            this.LJJJJLL.setParameters(this.LJJJJZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -420. Reason: ");
            sbLIZ.append(e);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setPreviewFpsRangeWhenRunning failed : ");
            sbLIZ2.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -443, strLIZIZ);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJLIL(int i) {
        super.LJLIL(i);
        if (i == 0) {
            if (this.LIZIZ.LLLLIILL) {
                try {
                    this.LJJJJZ.setRecordingHint(false);
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            if (this.LIZIZ.LLLLIILL) {
                try {
                    this.LJJJJZ.setRecordingHint(true);
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("un support scene");
    }

    @Override // X.C1DJK
    public final void LJLILLLLZI(InterfaceC1287190jbJ interfaceC1287190jbJ) {
        if (interfaceC1287190jbJ == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "queryShaderZoomStep : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom > 0) {
                    Math.pow(((zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue()) / 100.0f) + 1.0f, 0.5d);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Query shader zoom step failed : ");
            sbLIZ.append(e.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -420, strLIZIZ);
        }
    }

    @Override // X.C1DJK
    public final void LJLJLLL(boolean z) {
        Camera.Parameters parameters;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "setAutoExposureLock...");
        Camera camera = this.LJJJJLL;
        if (camera != null && (parameters = this.LJJJJZ) != null && this.LIZJ) {
            if (!parameters.isAutoExposureLockSupported()) {
                C2183341Ace.LJ("TECamera1", "Current camera doesn't support ae lock.");
                this.LIZLLL.LJ(-426, -426, "Current camera doesn't support ae lock.");
                return;
            }
            try {
                this.LJJJJZ.setAutoExposureLock(z);
                this.LJJJJLL.setParameters(this.LJJJJZ);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: setAutoExposureLock failed: ");
                sbLIZ.append(e.toString());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
                this.LIZLLL.LJ(-427, -427, strLIZIZ);
                return;
            }
        }
        this.LIZLLL.LIZJ(camera, 1, -439, "setAutoExposureLock failed. ： Camera is null.");
    }

    @Override // X.C1DJK
    public final void LJLLJ(InterfaceC2254701DMu interfaceC2254701DMu) {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C2183341Ace.LIZIZ("TECamera1", "stopZoom : Camera is null!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "stopZoom : Camera is null!");
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && interfaceC2254701DMu != null && interfaceC2254701DMu.LJII()) {
                this.LJJJJLL.stopSmoothZoom();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: ");
            sbLIZ.append(e);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Stop zoom failed : ");
            sbLIZ2.append(e.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -420, strLIZIZ);
        }
    }

    @Override // X.C1DJK
    public final void LJLLLLLL(boolean z) {
        String str;
        int i = 0;
        this.LJJLIIIJL = false;
        if (this.LJJJJLL == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C2183341Ace.LIZIZ("TECamera1", "toggleTorch : Camera is not ready!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "toggleTorch : Camera is not ready!");
            this.LIZLLL.LJIIIZ(z ? 1 : 0, "toggleTorch : Camera is not ready!");
            return;
        }
        if (this.LIZIZ.LLILZ == 1) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C2183341Ace.LJ("TECamera1", "Front camera does not support torch!");
            this.LIZLLL.LJ(-416, -416, "Front camera does not support torch!");
            this.LIZLLL.LJIIIZ(z ? 1 : 0, "Front camera does not support torch!");
            return;
        }
        try {
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("camera1 will change flash mode ");
            sbLIZ.append(z);
            interfaceC2254691DMt.LJ(104, 0, C2188811AlT.LIZIZ(sbLIZ));
            Camera.Parameters parameters = this.LJJJJLL.getParameters();
            this.LJJJJZ = parameters;
            if (z) {
                str = "torch";
            } else {
                str = "off";
            }
            parameters.setFlashMode(str);
            this.LJJJJLL.setParameters(this.LJJJJZ);
            InterfaceC2254691DMt interfaceC2254691DMt2 = this.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("camera1 did change flash mode ");
            sbLIZ2.append(z);
            interfaceC2254691DMt2.LJ(105, 0, C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC2254691DMt interfaceC2254691DMt3 = this.LIZLLL;
            if (z) {
                i = 1;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("toggleTorch ");
            sbLIZ3.append(z);
            interfaceC2254691DMt3.LJIIIIZZ(i, C2188811AlT.LIZIZ(sbLIZ3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: ");
            sbLIZ4.append(e);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Toggle torch failed: ");
            sbLIZ5.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -417, strLIZIZ);
            this.LIZLLL.LJIIIZ(z ? 1 : 0, strLIZIZ);
        }
    }

    public final int LLFF(int i) {
        int size = this.LJJLI.size() - 1;
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) / 2;
            if (i > ((Integer) ListProtector.get(this.LJJLI, i3)).intValue()) {
                i2 = i3;
            } else {
                size = i3;
            }
        }
        if (Math.abs(i - ((Integer) ListProtector.get(this.LJJLI, i2)).intValue()) > Math.abs(i - ((Integer) ListProtector.get(this.LJJLI, size)).intValue())) {
            return size;
        }
        return i2;
    }

    public final void LLFII(int i) {
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera1", "Camera start face detect");
        if (this.LIZJ && this.LJJJJLL != null && this.LJJJJZ.getMaxNumDetectedFaces() > 0) {
            try {
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.LJJJJLL.startFaceDetection();
                                C2183341Ace.LIZLLL("TECamera1", "use faceae for all");
                                return;
                            }
                            return;
                        }
                        if (this.LJII == 0) {
                            this.LJJJJLL.startFaceDetection();
                            C2183341Ace.LIZLLL("TECamera1", "use faceae for rear");
                            return;
                        }
                        return;
                    }
                    if (this.LJII == 1) {
                        this.LJJJJLL.startFaceDetection();
                        C2183341Ace.LIZLLL("TECamera1", "use faceae for front");
                        return;
                    }
                    return;
                }
                this.LJJJJLL.stopFaceDetection();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i3 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", "camera start face detect failed");
            }
        }
    }

    @Override // X.C1DJK
    public final boolean setExposureCompensation(int i) {
        String strLIZIZ;
        this.LJJLIIIJ = i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExposureCompensation... value: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
        int i3 = -413;
        boolean z = false;
        if (this.LJJJJLL != null && this.LJJJJZ != null && this.LIZJ && this.LIZIZ.LLLFZ.LIZ()) {
            C1286570jaJ c1286570jaJ = this.LIZIZ.LLLFZ;
            if (i <= c1286570jaJ.LIZ && i >= c1286570jaJ.LIZJ) {
                try {
                    this.LJJJJZ.setExposureCompensation(i);
                    this.LJJJJLL.setParameters(this.LJJJJZ);
                    this.LIZIZ.LLLFZ.LIZIZ = this.LJJJJZ.getExposureCompensation();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("EC = ");
                    sbLIZ2.append(this.LIZIZ.LLLFZ.LIZIZ);
                    sbLIZ2.append(", EV = ");
                    sbLIZ2.append(r2.LIZIZ * this.LIZIZ.LLLFZ.LIZLLL);
                    C2183341Ace.LIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
                    z = true;
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Error: setExposureCompensation failed: ");
                    sbLIZ3.append(e);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    this.LIZLLL.LIZJ(this.LJJJJLL, 1, -413, strLIZIZ);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Invalid exposure: ");
                sbLIZ4.append(i);
                this.LIZLLL.LIZJ(this.LJJJJLL, 1, -415, C2188811AlT.LIZIZ(sbLIZ4));
                return false;
            }
        } else {
            Camera camera = this.LJJJJLL;
            if (camera != null && this.LJJJJZ != null && this.LIZJ) {
                i3 = -414;
                strLIZIZ = "Unsupported exposure compensation!";
            } else {
                strLIZIZ = "setExposureCompensation ： Camera is null.";
            }
            this.LIZLLL.LIZJ(camera, 1, i3, strLIZIZ);
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("setExposureCompensation failed: ");
        sbLIZ5.append(strLIZIZ);
        C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ5));
        return z;
    }

    @Override // X.C1DJK
    public final void LJIILJJIL(float f, final InterfaceC2254701DMu interfaceC2254701DMu) {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C2183341Ace.LIZIZ("TECamera1", "startZoom : Camera is null!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "startZoom : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJJJZ = parameters;
            if (!parameters.isZoomSupported() && !this.LJJJJZ.isSmoothZoomSupported()) {
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                C2183341Ace.LIZIZ("TECamera1", "Camera is not support zoom!");
                this.LIZLLL.LIZJ(this.LJJJJLL, 1, -421, "Camera is not support zoom!");
                return;
            }
            int iMin = (int) Math.min(this.LJJJJZ.getMaxZoom(), f);
            if (this.LJJJJZ.isSmoothZoomSupported() && interfaceC2254701DMu != null && interfaceC2254701DMu.LJII()) {
                this.LJJJJLL.startSmoothZoom(iMin);
                this.LJJJJLL.setZoomChangeListener(new Camera.OnZoomChangeListener() { // from class: X.1DMv
                    @Override // android.hardware.Camera.OnZoomChangeListener
                    public final void onZoomChange(int i3, boolean z, Camera camera2) {
                        InterfaceC2254701DMu interfaceC2254701DMu2 = interfaceC2254701DMu;
                        if (interfaceC2254701DMu2 != null) {
                            interfaceC2254701DMu2.LIZLLL(i3, 1, z);
                        }
                    }
                });
                return;
            }
            this.LJJJJZ.setZoom(iMin);
            this.LJJJJLL.setParameters(this.LJJJJZ);
            if (interfaceC2254701DMu != null) {
                interfaceC2254701DMu.LIZLLL(iMin, 1, true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
            sbLIZ.append(e);
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Start zoom failed : ");
            sbLIZ2.append(e.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -420, strLIZIZ);
        }
    }

    @Override // X.C1DJK
    public final TEFrameSizei LJIJJLI(float f, TEFrameSizei tEFrameSizei) {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.LJJJJZ == null) {
            this.LJJJJZ = camera.getParameters();
        }
        if (tEFrameSizei != null) {
            return C2183321Acc.LIZIZ(LJJLIIJ(), tEFrameSizei, this.LIZIZ.LLLZ);
        }
        return C2183321Acc.LIZJ(LJJLIIJ(), f);
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJI(InterfaceC2254701DMu interfaceC2254701DMu, boolean z) {
        if (interfaceC2254701DMu == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "queryZoomAbility : Camera is null!");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "queryZoomAbility : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJIIJJI = parameters.getMaxZoom();
            if (z) {
                interfaceC2254701DMu.LIZJ(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), this.LJJLI.get((int) r0).intValue() / 100.0f, parameters.getZoomRatios());
            } else {
                interfaceC2254701DMu.LIZJ(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Query zoom ability failed : ");
            sbLIZ.append(e.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", strLIZIZ);
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -420, strLIZIZ);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJII(int i, int i2) {
        C1DJ6 c1dj6 = this.LIZIZ;
        c1dj6.LLJLLL = true;
        TEFrameSizei tEFrameSizei = c1dj6.LLJJJJJIL;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        stopCapture();
        LJJLIIIJLJLI();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJL(int i, int i2) {
        Camera camera = this.LJJJJLL;
        if (camera == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera1", "takePicture : camera is null");
            this.LIZLLL.LIZJ(this.LJJJJLL, 1, -439, "takePicture : camera is null");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJJJZ = parameters;
            if (parameters.getPictureSize().width != i || this.LJJJJZ.getPictureSize().height != i2) {
                TEFrameSizei tEFrameSizeiLJIIIZ = C2183321Acc.LJIIIZ(LLF(this.LJJJJZ.getSupportedPictureSizes()), this.LIZIZ.LLJJJIL, new TEFrameSizei(i, i2));
                this.LJJJJZ.setPictureSize(tEFrameSizeiLJIIIZ.width, tEFrameSizeiLJIIIZ.height);
                List<Integer> supportedPictureFormats = this.LJJJJZ.getSupportedPictureFormats();
                if (this.LIZIZ.LLLLLLL && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.LJJJJZ.setPictureFormat(17);
                } else {
                    this.LJJJJZ.setPictureFormat(256);
                    this.LJJJJZ.setJpegQuality(100);
                }
                this.LJJJJLL.setParameters(this.LJJJJZ);
            }
            this.LIZJ = false;
            this.LJJJJLL.takePicture(null, null, new Camera.PictureCallback(this) { // from class: X.1Aim
                @Override // android.hardware.Camera.PictureCallback
                public final void onPictureTaken(byte[] bArr, Camera camera2) {
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DJH.LIZ(e);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJLJI(float f, InterfaceC2254701DMu interfaceC2254701DMu) {
        if (this.LJJLI != null && this.LJJJJLL != null) {
            float f2 = this.LJJLIIIIJ * f;
            this.LJJLIIIIJ = f2;
            try {
                if (f2 < r4.get(0).intValue()) {
                    this.LJJLIIIIJ = this.LJJLI.get(0).intValue();
                }
                float f3 = this.LJJLIIIIJ;
                List<Integer> list = this.LJJLI;
                if (f3 > list.get(list.size() - 1).intValue()) {
                    List<Integer> list2 = this.LJJLI;
                    this.LJJLIIIIJ = list2.get(list2.size() - 1).intValue();
                }
                Camera.Parameters parameters = this.LJJJJLL.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    int iLLFF = LLFF((int) this.LJJLIIIIJ);
                    if (parameters.getZoom() != iLLFF) {
                        parameters.setZoom(iLLFF);
                        this.LJJJJLL.setParameters(parameters);
                        if (interfaceC2254701DMu != null) {
                            interfaceC2254701DMu.LIZLLL(this.LJJLI.get(iLLFF).intValue() / 100.0f, 1, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C2183341Ace.LIZIZ("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: ");
                sbLIZ.append(e);
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setZoom failed, ");
                sbLIZ2.append(e.getMessage());
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJLLI(C1DJ6 c1dj6, Cert cert) {
        int iLLFFF;
        super.LJLLI(c1dj6, cert);
        this.LIZIZ = c1dj6;
        this.LJIIIIZZ = c1dj6.LLILZ;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera1", "CAMERA_COST camera1 system innerOpen start");
        C1321640kUs.LIZ("VECamera-TECamera1-innerOpen");
        this.LJJLIIIJ = 0;
        this.LJIL = cert;
        int i2 = -401;
        try {
            C1DJ6 c1dj62 = this.LIZIZ;
            if (c1dj62.LLLLLIL && !TextUtils.isEmpty(c1dj62.LLLFFI)) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i3 = CastIntegerProtector.parseInt(this.LIZIZ.LLLFFI);
                Camera.getCameraInfo(i3, cameraInfo);
                C1DJ6 c1dj63 = this.LIZIZ;
                c1dj63.LLILZLL = i3;
                this.LJIIIIZZ = c1dj63.LLILZ;
            } else {
                this.LJJJLL = Camera.getNumberOfCameras();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("innerOpen mNumberOfCameras: ");
                sbLIZ.append(this.LJJJLL);
                sbLIZ.append(", current mDefaultCameraID:");
                sbLIZ.append(this.LIZIZ.LLILZLL);
                C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ));
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i4 = 0;
                while (true) {
                    if (i4 >= this.LJJJLL) {
                        break;
                    }
                    Camera.getCameraInfo(i4, cameraInfo2);
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("innerOpen cameraInfo facing: ");
                    sbLIZ2.append(cameraInfo2.facing);
                    sbLIZ2.append(", mCameraSettings.mFacing:");
                    sbLIZ2.append(this.LIZIZ.LLILZ);
                    C2183341Ace.LIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ2));
                    int i6 = cameraInfo2.facing;
                    C1DJ6 c1dj64 = this.LIZIZ;
                    if (i6 == c1dj64.LLILZ) {
                        c1dj64.LLILZLL = i4;
                        break;
                    }
                    i4++;
                }
            }
            C1DJ6 c1dj65 = this.LIZIZ;
            if (c1dj65.LLILZLL == -1 && this.LJJJLL > 0 && c1dj65.LLLLJI) {
                int i7 = C2187451AjH.LIZ;
                C2183341Ace.LJ("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                this.LIZIZ.LLILZLL = 0;
            }
            int i8 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("innerOpen: ");
            sbLIZ3.append(this.LIZIZ.LLILZLL);
            C2183341Ace.LIZLLL("TECamera1", C2188811AlT.LIZIZ(sbLIZ3));
            LJLZ(106, "will start camera1");
            C1321640kUs.LIZ("TECamera1-innerOpen-openCamera");
            int i9 = this.LIZIZ.LLILZLL;
            if (i9 >= 0) {
                this.LJJJJLL = C1305590k4z.LIZIZ(i9, cert);
            } else {
                this.LJJJJLL = C1305590k4z.LIZIZ(i9, cert);
                this.LIZIZ.LLILZ = 0;
                this.LJIIIIZZ = 0;
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                int i10 = 0;
                while (true) {
                    if (i10 >= this.LJJJLL) {
                        break;
                    }
                    Camera.getCameraInfo(i10, cameraInfo3);
                    if (cameraInfo3.facing == this.LJIIIIZZ) {
                        this.LIZIZ.LLILZLL = i10;
                        break;
                    }
                    i10++;
                }
            }
            C1321640kUs.LIZIZ();
            int i11 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera1", "innerOpen mNewFacing: " + this.LJIIIIZZ);
            LJLZ(107, "did start camera1");
            if (this.LJJJJLL == null) {
                C2183341Ace.LIZIZ("TECamera1", "Open Camera Failed with ID:" + this.LIZIZ.LLILZLL);
                if (this.LIZIZ.LLILZLL == -1) {
                    i2 = -405;
                }
                this.LIZLLL.LIZIZ(1, i2, this, this.LJJJJLL, "Open Camera Failed with ID:" + this.LIZIZ.LLILZLL);
                return i2;
            }
            try {
                C1321640kUs.LIZ("TECamera1-initCamera");
                iLLFFF = LLFFF();
            } catch (Exception e) {
                e = e;
                iLLFFF = 0;
            }
            try {
                C1321640kUs.LIZIZ();
                C1321640kUs.LIZ("TECamera1-fillFeatures");
                LJZ();
                C1321640kUs.LIZIZ();
                this.LIZLLL.LJ(1, 0, "TECamera1 features is ready");
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                int i12 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Open init Camera Failed!: ");
                sbLIZ4.append(Log.getStackTraceString(e));
                C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ4));
                C1DJH.LIZ(e);
            }
            this.LIZLLL.LIZIZ(1, iLLFFF, this, this.LJJJJLL, "Open Camera Success!");
            C1321640kUs.LIZIZ();
            C2183341Ace.LIZLLL("TECamera1", "CAMERA_COST camera1 system innerOpen end");
            return iLLFFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i13 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Open Camera Failed!: ");
            sbLIZ5.append(th.getClass());
            sbLIZ5.append(" ");
            sbLIZ5.append(th.getMessage());
            C2183341Ace.LIZIZ("TECamera1", C2188811AlT.LIZIZ(sbLIZ5));
            if (th.getMessage() != null) {
                if (th.getMessage().equals("Fail to connect to camera service")) {
                    i2 = C2183321Acc.LJIILJJIL(this.LJFF) ? -410 : -408;
                } else if (th.getMessage().equals("Camera initialization failed")) {
                    i2 = -407;
                }
            }
            C1DJH.LIZ(th);
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            Camera camera = this.LJJJJLL;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Open Camera Failed!: ");
            sbLIZ6.append(th.getClass());
            sbLIZ6.append(" ");
            sbLIZ6.append(th.getMessage());
            int i14 = i2;
            interfaceC2254691DMt.LIZIZ(1, i14, this, camera, C2188811AlT.LIZIZ(sbLIZ6));
            this.LJJJJLL = null;
            return i14;
        }
    }

    public C2254671DMr(Context context, InterfaceC2254691DMt interfaceC2254691DMt, Handler handler, C1DJO c1djo) {
        super(context, interfaceC2254691DMt, handler, c1djo);
        this.LJJJLIIL = "";
        this.LJJJLZIJ = new ArrayList();
        this.LJJJZ = new ArrayList();
        this.LJJL = new ArrayList();
        this.LJJLI = null;
        this.LJJLIIIIJ = 100.0f;
        this.LJJLIIIJ = 0;
        this.LJJLIIIJILLIZJL = new AtomicBoolean(false);
        this.LJJLIIIJJI = 0L;
        this.LJJLIIIJJIZ = 0;
        this.LJJLIIIJL = false;
        this.LIZIZ = new C1DJ6(context, 1);
        this.LJJJJZI = new C21617719ix();
        this.LJIL = null;
    }
}
