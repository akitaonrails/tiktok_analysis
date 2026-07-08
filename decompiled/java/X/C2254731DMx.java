package X;

import Y.AComparatorS39S0000000_20;
import Y.ARunnableS135S0100000_35;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.camera2.TEImage2Mode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254731DMx extends AbstractC2254721DMw {
    public final C2244641CtK LJJJJLL;
    public volatile int LJJJJZ;
    public CameraManager LJJJJZI;
    public volatile CameraDevice LJJJLIIL;
    public boolean LJJJLL;
    public AbstractC2254741DMy LJJJLZIJ;
    public C2218751Bsf LJJJZ;
    public boolean LJJL;
    public boolean LJJLI;
    public List<TEFrameSizei> LJJLIIIIJ;
    public List<TEFrameSizei> LJJLIIIJ;
    public final ConditionVariable LJJLIIIJILLIZJL;
    public final C1DN2 LJJLIIIJJI;

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LIZJ() {
        this.LJJJJL = false;
        this.LJJJLZIJ.LJJJ();
        return 0;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJIJJ() {
        this.LJJJJL = true;
        this.LJJJLZIJ.LJJIZ();
        return 0;
    }

    @Override // X.C1DJK
    public final boolean LJJJI() {
        return true;
    }

    @Override // X.C1DJK
    public final void LJLLJ(InterfaceC2254701DMu interfaceC2254701DMu) {
    }

    @Override // X.AbstractC2254721DMw
    public final int LJZI() {
        return 2;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJ() {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy != null) {
            return abstractC2254741DMy.LJJIFFI();
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJII() {
        CaptureRequest.Builder builder;
        Range range;
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null || (builder = abstractC2254741DMy.LIZJ) == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    @Override // X.C1DJK
    public final void LJIIIIZZ() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "cancelFocus : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "cancelFocus : camera is null.");
        } else if (abstractC2254741DMy.LIZJ == null) {
            abstractC2254741DMy.LJFF.LJ(-100, -100, "rollbackNormalSessionRequest : param is null.");
        } else {
            abstractC2254741DMy.LJIIIIZZ.LJIIIIZZ();
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final float LJJIJIL() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "getManualFocusAbility : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getManualFocusAbility : camera is null.");
            return -1.0f;
        }
        if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
            abstractC2254741DMy.LJFF.LJ(-435, -435, "Capture Session is null");
        }
        if (abstractC2254741DMy.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) != null) {
            float fFloatValue = ((Float) abstractC2254741DMy.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
            if (fFloatValue >= 0.0f) {
                return fFloatValue;
            }
        }
        abstractC2254741DMy.LJFF.LJ(-435, -435, "can not get manual focus ability");
        return -1.0f;
    }

    @Override // X.C1DJK
    public final void LJJIL() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
            return;
        }
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "enableCaf : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "enableCaf : camera is null.");
        } else {
            CaptureRequest.Builder builder = abstractC2254741DMy.LIZJ;
            if (builder == null) {
                abstractC2254741DMy.LJFF.LIZJ(abstractC2254741DMy.LJIIIZ, abstractC2254741DMy.LJII.LLILLJJLI, -100, "rollbackNormalSessionRequest : param is null.");
            } else {
                abstractC2254741DMy.LJIIIIZZ.LIZIZ(builder);
                abstractC2254741DMy.LJJJJL(abstractC2254741DMy.LIZLLL, abstractC2254741DMy.LIZJ);
            }
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final List<TEFrameSizei> LJJJJI() {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy != null && abstractC2254741DMy.LIZ != null) {
            if (this.LJJLIIIJ == null) {
                this.LJJLIIIJ = C2183321Acc.LJ(abstractC2254741DMy.LJIJJ(256));
            }
            return this.LJJLIIIJ;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "getSupportedPictureSizes: camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getSupportedPictureSizes: camera is null.");
        return null;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJJJJJ() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "getISO...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            C2183341Ace.LJ("TECamera2", "getISO : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getISO : camera is null.");
            return -1;
        }
        if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
            abstractC2254741DMy.LJFF.LJ(-430, -430, "Capture Session is null");
        }
        return abstractC2254741DMy.LJJIIJ;
    }

    @Override // X.C1DJK
    public final float[] LJJJJJL() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "getVFOV...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            return abstractC2254741DMy.LJIL();
        }
        C2183341Ace.LIZIZ("TECamera2", "getFOV : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getFOV : camera is null.");
        return new float[]{-2.0f, -2.0f};
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJJJLI() {
        this.LJJJLZIJ.LJII();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final float[] LJJJJZ() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "getApertureRange...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            return abstractC2254741DMy.LJIILLIIL();
        }
        C2183341Ace.LJ("TECamera2", "getApertureRange : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getApertureRange : camera is null.");
        return new float[]{-1.0f, -1.0f};
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJJJZ() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "getISORange...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            return abstractC2254741DMy.LJJI();
        }
        C2183341Ace.LJ("TECamera2", "setWhileBalance : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setWhileBalance : camera is null.");
        return new int[]{-1, -1};
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIIJ() {
        HandlerThread handlerThread;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "clearResourceBeforeRestartWhenCameraErr");
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null || (handlerThread = abstractC2254741DMy.LJJIJ) == null) {
            return;
        }
        handlerThread.quitSafely();
        abstractC2254741DMy.LJJIJ = null;
        abstractC2254741DMy.LJJIIZI = null;
        C2183341Ace.LIZLLL("TECameraModeBase", "releaseCameraThread");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final List<TEFrameSizei> LJJLIIJ() {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy != null && abstractC2254741DMy.LIZ != null) {
            if (this.LJJLIIIIJ == null) {
                this.LJJLIIIIJ = C2183321Acc.LJ(abstractC2254741DMy.LJIJJLI());
            }
            return this.LJJLIIIIJ;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "getSupportedPreviewSizes: camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getSupportedPreviewSizes: camera is null.");
        return null;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLJ() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.LJJJJZ == 2) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else {
            if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
                abstractC2254741DMy.LJJJIL(this.LJIIIIZZ);
                return;
            }
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "takePicture : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "takePicture : camera is null.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJZ() {
        int i;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        List<Integer> supportedExtensions;
        DynamicRangeProfiles dynamicRangeProfiles;
        C1321640kUs.LIZ("TECamera2-collectCameraCapabilities");
        if (!this.LIZIZ.LLLLLLZ || this.LJJI) {
            C1321640kUs.LIZIZ();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJJJJZI != null) {
            try {
                this.LJJ.putOpt("camera_id", this.LIZIZ.LLLFF);
                if (this.LJJJJLL != null) {
                    this.LJJ.putOpt("camera_zoom_max_ability", Float.valueOf(C2244641CtK.LJ(this.LJJJLZIJ.LIZ, this.LIZIZ.LLJJJ)));
                    C2244641CtK c2244641CtK = this.LJJJJLL;
                    CameraCharacteristics cameraCharacteristics = this.LJJJLZIJ.LIZ;
                    c2244641CtK.getClass();
                    if (C2244641CtK.LJIIL(cameraCharacteristics)) {
                        this.LJJ.putOpt("camera_stabilization", 1);
                    } else {
                        this.LJJ.putOpt("camera_stabilization", -1);
                    }
                    C2244641CtK c2244641CtK2 = this.LJJJJLL;
                    CameraCharacteristics cameraCharacteristics2 = this.LJJJLZIJ.LIZ;
                    c2244641CtK2.getClass();
                    Range rangeLJIIIIZZ = C2244641CtK.LJIIIIZZ(cameraCharacteristics2);
                    this.LJJ.putOpt("camera_zoom_range_low", rangeLJIIIIZZ.getLower());
                    this.LJJ.putOpt("camera_zoom_range_high", rangeLJIIIIZZ.getUpper());
                    this.LJJ.put("camera_wide_angle", LLIIIILZ());
                    this.LJJ.put("camera_telephoto", LLIIII());
                }
                JSONArray jSONArray = new JSONArray();
                String[] strArrLIZIZ = this.LIZIZ.LLLLZ ? C2217911BrJ.LIZIZ(this.LJJJJZI) : this.LJJJJZI.getCameraIdList();
                this.LJJ.putOpt("camera_number", Integer.valueOf(strArrLIZIZ.length));
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                for (String str : strArrLIZIZ) {
                    JSONObject jSONObject = new JSONObject();
                    CameraCharacteristics cameraCharacteristicsLIZ = this.LIZIZ.LLLLZ ? C2217911BrJ.LIZ(this.LJJJJZI, str) : this.LJJJJZI.getCameraCharacteristics(str);
                    if (cameraCharacteristicsLIZ != null) {
                        jSONObject.putOpt("camera_id", str);
                        jSONObject.putOpt("camera_facing", Integer.valueOf(((Integer) cameraCharacteristicsLIZ.get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1));
                        ArrayList arrayList = new ArrayList();
                        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristicsLIZ.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) != null) {
                            Iterator<Long> it2 = dynamicRangeProfiles.getSupportedProfiles().iterator();
                            while (it2.hasNext()) {
                                arrayList.add((String) ((HashMap) C2183321Acc.LJIIIZ).get(Long.valueOf(it2.next().longValue())));
                            }
                        }
                        jSONObject.putOpt("camera_is_hdr_supported", Boolean.valueOf(arrayList.size() > 1));
                        jSONObject.putOpt("camera_hdr_profiles", new JSONArray((Collection) arrayList));
                        ArrayList arrayList2 = new ArrayList();
                        this.LJJJJLL.getClass();
                        if (C2244641CtK.LJIIJJI(cameraCharacteristicsLIZ)) {
                            arrayList2.add("ois");
                        }
                        this.LJJJJLL.getClass();
                        int[] iArr = (int[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
                        if (iArr != null) {
                            i = 0;
                            for (int i2 : iArr) {
                                if (i2 == 1) {
                                    i |= 1;
                                } else if (i2 == 2) {
                                    i |= 2;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        String str2 = C2183321Acc.LIZ;
                        ArrayList arrayList3 = new ArrayList();
                        if (i == 1) {
                            arrayList3.add("video_eis");
                        } else if (i == 2) {
                            arrayList3.add("preview_eis");
                        } else if (i == 3) {
                            try {
                                arrayList3.add("video_eis");
                                arrayList3.add("preview_eis");
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                int i3 = C2187451AjH.LIZ;
                                C2183341Ace.LJFF("TECamera2", "Get Camera Capbilities failed!", e);
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("collectCameraCapabilities consume: ");
                                sbLIZ.append(jCurrentTimeMillis2);
                                C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
                                this.LJJI = true;
                                C1321640kUs.LIZIZ();
                            }
                        }
                        arrayList2.addAll(arrayList3);
                        jSONObject.putOpt("camera_supported_stabilization_modes", new JSONArray((Collection) arrayList2));
                        int[] iArr2 = (int[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr2 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i5 : iArr2) {
                                arrayList4.add(Integer.valueOf(i5));
                            }
                            jSONObject.putOpt("manual_3A", Boolean.valueOf(arrayList4.contains(1)));
                            jSONObject.putOpt("depth_out_put", Boolean.valueOf(arrayList4.contains(8)));
                            int i6 = Build.VERSION.SDK_INT;
                            if (i6 >= 28) {
                                jSONObject.putOpt("logical_multi_Camera", Boolean.valueOf(arrayList4.contains(11)));
                                if (i6 >= 33) {
                                    jSONObject.put("stream_use_case", arrayList4.contains(19));
                                }
                            }
                        }
                        StreamConfigurationMap streamConfigurationMapLIZLLL = this.LIZIZ.LLLLZ ? C2217911BrJ.LIZLLL(cameraCharacteristicsLIZ, str) : (StreamConfigurationMap) cameraCharacteristicsLIZ.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMapLIZLLL != null) {
                            Range<Integer>[] highSpeedVideoFpsRanges = streamConfigurationMapLIZLLL.getHighSpeedVideoFpsRanges();
                            if (highSpeedVideoFpsRanges != null && highSpeedVideoFpsRanges.length != 0) {
                                JSONArray jSONArray4 = new JSONArray();
                                for (Range<Integer> range : highSpeedVideoFpsRanges) {
                                    int iIntValue = ((Integer) range.getLower()).intValue();
                                    try {
                                        int iIntValue2 = ((Integer) range.getUpper()).intValue();
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.putOpt("high_fps_min", Integer.valueOf(iIntValue));
                                        jSONObject2.putOpt("high_fps_max", Integer.valueOf(iIntValue2));
                                        jSONArray4.put(jSONObject2);
                                        if (iIntValue == iIntValue2) {
                                            Size[] highSpeedVideoSizesFor = streamConfigurationMapLIZLLL.getHighSpeedVideoSizesFor(range);
                                            for (Size size : highSpeedVideoSizesFor) {
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.putOpt("fixed_fps", Integer.valueOf(iIntValue2));
                                                jSONObject3.putOpt("width", Integer.valueOf(size.getWidth()));
                                                jSONObject3.putOpt("height", Integer.valueOf(size.getHeight()));
                                                if (((Integer) cameraCharacteristicsLIZ.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                                    jSONArray2.put(jSONObject3);
                                                } else {
                                                    jSONArray3.put(jSONObject3);
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        int i32 = C2187451AjH.LIZ;
                                        C2183341Ace.LJFF("TECamera2", "Get Camera Capbilities failed!", e);
                                        long jCurrentTimeMillis22 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        int i42 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("collectCameraCapabilities consume: ");
                                        sbLIZ2.append(jCurrentTimeMillis22);
                                        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
                                        this.LJJI = true;
                                        C1321640kUs.LIZIZ();
                                    }
                                }
                                jSONObject.putOpt("high_speed_fps_range", jSONArray4);
                            }
                            List<Size> listLJIJJLI = this.LJJJLZIJ.LJIJJLI();
                            JSONArray jSONArray5 = new JSONArray();
                            ArrayList<Size> arrayList5 = (ArrayList) listLJIJJLI;
                            if (!arrayList5.isEmpty()) {
                                for (Size size2 : arrayList5) {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.putOpt("width", Integer.valueOf(size2.getWidth()));
                                    jSONObject4.putOpt("height", Integer.valueOf(size2.getHeight()));
                                    jSONArray5.put(jSONObject4);
                                }
                                jSONObject.putOpt("preview_size_list", jSONArray5);
                            }
                            Size[] outputSizes = streamConfigurationMapLIZLLL.getOutputSizes(256);
                            JSONArray jSONArray6 = new JSONArray();
                            if (outputSizes != null && outputSizes.length > 0) {
                                for (Size size3 : outputSizes) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.putOpt("width", Integer.valueOf(size3.getWidth()));
                                    jSONObject5.putOpt("height", Integer.valueOf(size3.getHeight()));
                                    jSONArray6.put(jSONObject5);
                                }
                                jSONObject.putOpt("picture_size_list", jSONArray6);
                            }
                        }
                        Range[] rangeArr = (Range[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        JSONArray jSONArray7 = new JSONArray();
                        if (rangeArr != null && rangeArr.length > 0) {
                            for (Range range2 : rangeArr) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.putOpt("fps_min", range2.getLower());
                                jSONObject6.putOpt("fps_max", range2.getUpper());
                                jSONArray7.put(jSONObject6);
                            }
                            jSONObject.putOpt("fps_range_List", jSONArray7);
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            JSONArray jSONArray8 = new JSONArray();
                            int[] iArr3 = (int[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                            if (iArr3 != null) {
                                for (int i7 : iArr3) {
                                    jSONArray8.put(i7);
                                }
                            }
                            jSONObject.putOpt("support_ae_modes", jSONArray8);
                        }
                        float[] fArr = (float[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                        JSONArray jSONArray9 = new JSONArray();
                        if (fArr != null && fArr.length > 0) {
                            for (float f : fArr) {
                                jSONArray9.put(f);
                            }
                            jSONObject.putOpt("support_apertures", jSONArray9);
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            long[] jArr = (long[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                            JSONArray jSONArray10 = new JSONArray();
                            if (jArr != null && jArr.length > 0) {
                                for (long j : jArr) {
                                    jSONArray10.put(j);
                                }
                                jSONObject.putOpt("available_stream_use_cases", jSONArray10);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (cameraExtensionCharacteristics = this.LJJJJZI.getCameraExtensionCharacteristics(str)) != null && (supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions()) != null) {
                            JSONArray jSONArray11 = new JSONArray();
                            if (supportedExtensions.size() > 0) {
                                Iterator<Integer> it3 = supportedExtensions.iterator();
                                while (it3.hasNext()) {
                                    jSONArray11.put(it3.next().intValue());
                                }
                                jSONObject.putOpt("support_extensions", jSONArray11);
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
                this.LJJ.putOpt("camera_feature", jSONArray);
                this.LJJ.putOpt("camera_fixed_back_fps_sizes", jSONArray2);
                this.LJJ.putOpt("camera_fixed_front_fps_sizes", jSONArray3);
                if (Build.VERSION.SDK_INT >= 30) {
                    Set<Set<String>> concurrentCameraIds = this.LJJJJZI.getConcurrentCameraIds();
                    ArrayList arrayList6 = new ArrayList();
                    if (concurrentCameraIds != null) {
                        for (Set<String> set : concurrentCameraIds) {
                            Iterator<String> it4 = set.iterator();
                            boolean z = false;
                            boolean z2 = false;
                            while (it4.hasNext()) {
                                CameraCharacteristics cameraCharacteristics3 = this.LJJJJZI.getCameraCharacteristics(it4.next());
                                if (cameraCharacteristics3 != null) {
                                    if (((Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                        z = true;
                                    } else if (((Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2 && z) {
                                arrayList6.add(set);
                            }
                        }
                        JSONArray jSONArray12 = new JSONArray();
                        if (arrayList6.size() > 0) {
                            Iterator it5 = arrayList6.iterator();
                            while (it5.hasNext()) {
                                jSONArray12.put((Set) it5.next());
                            }
                            this.LJJ.putOpt("camera_front_back_multicam_combos", jSONArray12);
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        long jCurrentTimeMillis222 = System.currentTimeMillis() - jCurrentTimeMillis;
        int i422 = C2187451AjH.LIZ;
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("collectCameraCapabilities consume: ");
        sbLIZ22.append(jCurrentTimeMillis222);
        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ22));
        this.LJJI = true;
        C1321640kUs.LIZIZ();
    }

    @Override // X.C1DJK
    public final boolean LJLIIIL() {
        AbstractC2254741DMy abstractC2254741DMy;
        CameraCharacteristics cameraCharacteristics;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "isAutoExposureLockSupported...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null || (cameraCharacteristics = abstractC2254741DMy.LIZ) == null) {
            C2183341Ace.LIZIZ("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "isAutoExposureLockSupported : camera is null.");
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final long[] LJLIIL() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "getShutterTimeRange...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            return abstractC2254741DMy.LJJIII();
        }
        C2183341Ace.LJ("TECamera2", "getShutterTimeRange : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "getShutterTimeRange : camera is null.");
        return new long[]{-1, -1};
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int[] LJLJJI() {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null) {
            return null;
        }
        return abstractC2254741DMy.LJIIZILJ();
    }

    @Override // X.AbstractC2254721DMw
    public final int LJZL() {
        CameraCharacteristics cameraCharacteristics;
        int iLJIIJ = this.LJIIJ;
        if (iLJIIJ < 0) {
            iLJIIJ = C2183321Acc.LJIIJ(this.LJFF);
        }
        this.LJII = this.LJIIIIZZ;
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        int iIntValue = (abstractC2254741DMy == null || (cameraCharacteristics = abstractC2254741DMy.LIZ) == null) ? this.LIZIZ.LLILZIL : ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (this.LJII == 1) {
            int i = (iIntValue + iLJIIJ) % 360;
            this.LJIIIZ = i;
            this.LJIIIZ = ((360 - i) + 180) % 360;
        } else {
            this.LJIIIZ = ((iIntValue - iLJIIJ) + 360) % 360;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mDeviceRotation = ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mFacing = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", degrees = ");
        sbLIZ.append(iLJIIJ);
        sbLIZ.append(", senserOrientation = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", mCameraSettings.mRotation = ");
        sbLIZ.append(this.LIZIZ.LLILZIL);
        sbLIZ.append(", mCameraSettings: ");
        sbLIZ.append(this.LIZIZ.hashCode());
        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIIIZ;
    }

    @Override // X.AbstractC2254721DMw
    public final int LL() {
        int i = -1;
        if (this.LJJJJZ != 3) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: restoreDefaultFps. Code: -439. Reason: session is not running");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid state, state = ");
            sbLIZ.append(this.LJJJJZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -443, strLIZIZ);
            return -1;
        }
        if (!LLF() || this.LJJJLZIJ == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: restoreDefaultFps. Code: -439. Reason: camera is null");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "restoreDefaultFps : Camera is null.");
            return -1;
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "[LowLightEnhance], restoreDefaultFps");
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (!abstractC2254741DMy.LJJJJIZL) {
            abstractC2254741DMy.LJJIJIIJIL();
            abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, abstractC2254741DMy.LJIIJ(new Range<>(Integer.valueOf(abstractC2254741DMy.LJJII.min / abstractC2254741DMy.LJII.LLILLL.fpsUnitFactor), Integer.valueOf(abstractC2254741DMy.LJJII.max / abstractC2254741DMy.LJII.LLILLL.fpsUnitFactor))));
            if (abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ).LIZ) {
                i = 0;
                InterfaceC2253721DJa interfaceC2253721DJa = this.LJIILLIIL;
                if (interfaceC2253721DJa != null) {
                    ((C1DJY) interfaceC2253721DJa).LIZ(false);
                }
            }
        }
        return i;
    }

    @Override // X.AbstractC2254721DMw
    public final int LLD() {
        int i = -1;
        if (this.LJJJJZ != 3) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: updatePreviewFpsRangeUnderLowLight. Code: -439. Reason: session is not running");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid state, state = ");
            sbLIZ.append(this.LJJJJZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -443, strLIZIZ);
            return -1;
        }
        if (!LLF() || this.LJJJLZIJ == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: updatePreviewFpsRangeUnderLowLight. Code: -439. Reason: camera is null");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "updatePreviewFpsRangeUnderLowLight : Camera is null.");
            return -1;
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "[LowLightEnhance], updatePreviewFpsRangeUnderLowLight");
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        Range[] rangeArr = (Range[]) abstractC2254741DMy.LIZ.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null && rangeArr.length != 0 && !abstractC2254741DMy.LJJJJIZL) {
            ArrayList<Range<Integer>> arrayList = new ArrayList(Arrays.asList(rangeArr));
            Collections.sort(arrayList, new AComparatorS39S0000000_20(19));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[LowLightEnhance], Sorted FPS ranges for low light: ");
            sbLIZ2.append(arrayList);
            C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            for (Range<Integer> range : arrayList) {
                if (((Integer) range.getLower()).intValue() >= abstractC2254741DMy.LJII.LLLILZLLLI && ((Integer) range.getLower()).intValue() <= abstractC2254741DMy.LJII.LLLIZZ && ((Integer) range.getUpper()).intValue() > ((Integer) range.getLower()).intValue()) {
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[LowLightEnhance], Selected FPS range for low light: ");
                    sbLIZ3.append(range);
                    C2183341Ace.LIZLLL("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ3));
                    abstractC2254741DMy.LJJIII = range;
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                    i = 0;
                    InterfaceC2253721DJa interfaceC2253721DJa = this.LJIILLIIL;
                    if (interfaceC2253721DJa != null) {
                        ((C1DJY) interfaceC2253721DJa).LIZ(true);
                    }
                    this.LJJJJ = this.LJJJLZIJ.LJJIII;
                }
            }
            int i6 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraModeBase", "[LowLightEnhance], no matching target fps found, abort session update");
            return -502;
        }
        return i;
    }

    public final boolean LLF() {
        return this.LJJJLIIL != null;
    }

    public final void LLFII() {
        C1321640kUs.LIZ("VECamera-TECamera2-_startCapture");
        if (this.LJJJLZIJ == null) {
            this.LJIIL = 0;
            this.LIZLLL.LJI(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "_startCapture : mode is null");
            return;
        }
        try {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera2", "CAMERA_COST camera2 system startPreview start");
            int iLJJIL = this.LJJJLZIJ.LJJIL();
            C2183341Ace.LIZLLL("TECamera2", "CAMERA_COST camera2 system startPreview end");
            if (iLJJIL != 0) {
                LLIIIJ();
                this.LIZLLL.LJI(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, iLJJIL, "_startCapture : something wrong");
            }
            C1321640kUs.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = e instanceof CameraAccessException ? -410 : e instanceof IllegalArgumentException ? -402 : e instanceof IllegalStateException ? -409 : -425;
            LLIIIJ();
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LJFF("TECamera2", "_startCapture exception occurred.", e);
            C1DJH.LIZ(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_startCapture error occurred, err msg: ");
            sbLIZ.append(e.getMessage());
            this.LIZLLL.LJI(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, i2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LLFZ() {
        Handler handler;
        if (this.LJJJLZIJ == null) {
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "_stopCapture : mode is null");
            return;
        }
        try {
            C1321640kUs.LIZ("TECamera2-_stopCapture-closePreviewSession");
            this.LJJJLZIJ.LJIIIZ();
            this.LJJJJI = 0;
            C1321640kUs.LIZIZ();
            this.LJJIIZ = 0;
            this.LJJIIJ = 0L;
            C1DJ6 c1dj6 = this.LIZIZ;
            if (c1dj6 != null && (handler = this.LJ) != null && c1dj6.LLJJI) {
                handler.removeCallbacks(this.LJJJJLI);
            }
            this.LIZLLL.LIZ(this.LJJJLIIL, "TECamera2 preview stoped");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJFF("TECamera2", "_stopCapture exception occurred.", e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_stopCapture error occurred, err msg: ");
            sbLIZ.append(e.getMessage());
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -425, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final boolean LLIIII() {
        String strLJFF;
        String strLJ;
        boolean z;
        if (!this.LIZIZ.LLLLZ) {
            C2244641CtK c2244641CtK = this.LJJJJLL;
            if (c2244641CtK == null) {
                return false;
            }
            CameraManager cameraManager = (CameraManager) C786410Ut5.H2(c2244641CtK.LIZ, "camera");
            try {
                strLJFF = C2244641CtK.LJFF(cameraManager.getCameraIdList(), cameraManager);
            } catch (CameraAccessException | IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                strLJFF = CardStruct.IStatusCode.DEFAULT;
            }
            return strLJFF.equals(CardStruct.IStatusCode.DEFAULT) ^ true;
        }
        Context context = this.LJFF;
        synchronized (C2217911BrJ.class) {
            Map<String, Object> map = C2217911BrJ.LIZ;
            if (((HashMap) map).containsKey("CAMERA_2_TELEPHOTO_ID")) {
                strLJ = (String) ((HashMap) map).get("CAMERA_2_TELEPHOTO_ID");
            } else {
                try {
                    CameraManager cameraManager2 = (CameraManager) C786410Ut5.H2(context, "camera");
                    strLJ = C2217911BrJ.LJ(C2217911BrJ.LIZIZ(cameraManager2), cameraManager2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZJ("TECameraProb", "exception occurs when getTelephotoID", th);
                    strLJ = CardStruct.IStatusCode.DEFAULT;
                }
                ((HashMap) C2217911BrJ.LIZ).put("CAMERA_2_TELEPHOTO_ID", strLJ);
            }
            z = !CardStruct.IStatusCode.DEFAULT.equals(strLJ);
        }
        return z;
    }

    public final boolean LLIIIILZ() {
        String strLJII;
        boolean z;
        if (!this.LIZIZ.LLLLZ) {
            C2244641CtK c2244641CtK = this.LJJJJLL;
            return c2244641CtK != null && c2244641CtK.LJIILIIL();
        }
        Context context = this.LJFF;
        synchronized (C2217911BrJ.class) {
            Map<String, Object> map = C2217911BrJ.LIZ;
            if (((HashMap) map).containsKey("CAMERA_2_WIDE_ID")) {
                strLJII = (String) ((HashMap) map).get("CAMERA_2_WIDE_ID");
            } else {
                try {
                    CameraManager cameraManager = (CameraManager) C786410Ut5.H2(context, "camera");
                    strLJII = C2217911BrJ.LJII(C2217911BrJ.LIZIZ(cameraManager), cameraManager);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZJ("TECameraProb", "exception occurs when getWideAngleID", th);
                    strLJII = CardStruct.IStatusCode.DEFAULT;
                }
                ((HashMap) C2217911BrJ.LIZ).put("CAMERA_2_WIDE_ID", strLJII);
            }
            z = !CardStruct.IStatusCode.DEFAULT.equals(strLJII);
        }
        return z;
    }

    public final void LLIIIJ() {
        if (this.LIZIZ.LLJIJIL) {
            this.LJJLIIIJILLIZJL.open();
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera2", "open camera-operation lock");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[PHI: r2 r9
      0x009f: PHI (r2v11 java.lang.String) = (r2v7 java.lang.String), (r2v12 java.lang.String) binds: [B:70:0x0206, B:27:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:70:0x0206, B:27:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLIIIL() throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254731DMx.LLIIIL():java.lang.String");
    }

    public final void LLIIJI() {
        if (this.LIZIZ.LLJIJIL) {
            this.LJJLIIIJILLIZJL.close();
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera2", "block camera-operation start...");
            boolean zBlock = this.LJJLIIIJILLIZJL.block(1000L);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("block camera-operation end...result = ");
            sbLIZ.append(zBlock);
            C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int getFlashMode() {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null) {
            return -1;
        }
        return abstractC2254741DMy.LJJ();
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final boolean isSupportedExposureCompensation() {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "isSupportedExposureCompensation...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && abstractC2254741DMy.LIZ != null) {
            return this.LIZIZ.LLLFZ.LIZ();
        }
        C2183341Ace.LIZIZ("TECamera2", "isSupportedExposureCompensation : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -413, "isSupportedExposureCompensation : camera is null.");
        return false;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void stopCapture() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "stopCapture...");
        if (!LLF()) {
            C2183341Ace.LIZIZ("TECamera2", "Device is not ready.");
            return;
        }
        if (this.LJJJJZ != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopCapture, invalid state: ");
            sbLIZ.append(this.LJJJJZ);
            C2183341Ace.LIZIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1321640kUs.LIZ("TECamera2-stopCapture");
        LLFZ();
        C1321640kUs.LIZIZ();
    }

    @Override // X.C1DJK
    public final boolean LIZLLL() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null || abstractC2254741DMy.LIZ == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECamera2", "Query torch info failed, you must open camera first.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "Query torch info failed, you must open camera first.");
            return false;
        }
        if (this.LJJJJLL == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "DeviceProxy is null!");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -417, "isTorchSupported: DeviceProxy is null!");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZIZ.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isTorchSupported key = ");
        sbLIZ2.append(strLIZIZ);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
        BaseBundle baseBundle = (BaseBundle) ((HashMap) this.LJIJJLI).get(strLIZIZ);
        if (baseBundle == null) {
            return false;
        }
        return baseBundle.getBoolean("camera_torch_supported", false);
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJJIL() {
        AbstractC2254741DMy abstractC2254741DMy;
        OutputConfiguration outputConfiguration;
        OutputConfiguration outputConfiguration2;
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "updateSurface, device is not readt or mode is null...");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "updateSurface");
        C1DNM c1dnm = abstractC2254741DMy.LJI.LJI;
        if (c1dnm == null || c1dnm.LIZIZ() == null || abstractC2254741DMy.LIZLLL == null) {
            C2183341Ace.LIZ("TECameraModeBase", "providerManager or provider or camera session is null");
            return;
        }
        Surface surfaceLJ = c1dnm.LIZIZ().LJ();
        if (surfaceLJ == null) {
            C2183341Ace.LIZ("TECameraModeBase", "surface is null");
            return;
        }
        int i3 = C2186181AhE.LIZ[c1dnm.LIZIZ().LJFF().ordinal()];
        if (i3 == 1 || i3 == 2) {
            if (Build.VERSION.SDK_INT >= 28 && (outputConfiguration = abstractC2254741DMy.LJJJJ) != null) {
                outputConfiguration.addSurface(surfaceLJ);
                try {
                    abstractC2254741DMy.LIZLLL.updateOutputConfiguration(abstractC2254741DMy.LJJJJ);
                    abstractC2254741DMy.LJJJJI = true;
                } catch (CameraAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            abstractC2254741DMy.LIZJ.addTarget(surfaceLJ);
            abstractC2254741DMy.LIZJ.removeTarget(c1dnm.LIZIZ().LIZJ());
            abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            return;
        }
        if (i3 == 3) {
            if (Build.VERSION.SDK_INT >= 28 && (outputConfiguration2 = abstractC2254741DMy.LJJJJ) != null && abstractC2254741DMy.LJJJJI) {
                outputConfiguration2.removeSurface(surfaceLJ);
                abstractC2254741DMy.LJJJJI = false;
            }
            abstractC2254741DMy.LIZJ.addTarget(c1dnm.LIZIZ().LIZJ());
            abstractC2254741DMy.LIZJ.removeTarget(surfaceLJ);
            abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            c1dnm.LIZIZ().LJIJ();
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLI() {
        if (!LLF()) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "Device is not ready.");
        } else {
            AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
            if (abstractC2254741DMy != null) {
                abstractC2254741DMy.LIZLLL();
            }
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJLJLI() {
        super.LJJLIIIJLJLI();
        if (this.LJJJLZIJ == null) {
            this.LJIIL = 0;
            this.LIZLLL.LJI(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "startCapture : mode is null");
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "CAMERA_COST camera2 startCapture start");
        C1321640kUs.LIZ("VECamera-TECamera2-startCapture");
        if (!LLF() || this.LJI == null) {
            C2183341Ace.LIZIZ("TECamera2", "startCapture, Device is not ready.");
            return;
        }
        if (this.LJJJJZ != 2 && this.LJJJJZ != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCapture, invalid state: ");
            sbLIZ.append(this.LJJJJZ);
            C2183341Ace.LIZIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            this.LIZIZ.LLILZIL = LJZL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DJH.LIZ(e);
            LLFFF(this.LJIL);
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            if (interfaceC2254691DMt != null) {
                int i2 = this.LIZIZ.LLILLJJLI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getFrameOrientation face = ");
                sbLIZ2.append(this.LJIIIIZZ);
                sbLIZ2.append(" failed: e: ");
                sbLIZ2.append(e.getClass());
                sbLIZ2.append(" ");
                sbLIZ2.append(e.getMessage());
                interfaceC2254691DMt.LIZJ(this.LJJJLIIL, i2, -425, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        int i3 = this.LIZIZ.LLJZIJLIL;
        if (i3 != 0 ? !(i3 != 1 || (this.LJJJLZIJ instanceof TEImage2Mode)) : !(this.LJJJLZIJ instanceof C2254751DMz)) {
            LLI(i3);
            return;
        }
        LLFII();
        C1321640kUs.LIZIZ();
        if (C1321640kUs.LIZ && Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection("VECamera-TECamera2-camera-frame", 2);
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "CAMERA_COST camera2 startCapture end");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJLLLLLLLZ() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "updateSurface, device is not readt or mode is null...");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraModeBase", "updateCameraSurface");
        C1DNM c1dnm = abstractC2254741DMy.LJI.LJI;
        if (c1dnm == null || abstractC2254741DMy.LIZLLL == null) {
            C2183341Ace.LIZ("TECameraModeBase", "providerManager or provider or camera session is null");
            return;
        }
        abstractC2254741DMy.LIZLLL();
        for (C1DN3 c1dn3 : c1dnm.LIZLLL()) {
            Surface surfaceLIZJ = c1dn3.LIZJ();
            if (surfaceLIZJ != null) {
                if (c1dn3.LIZLLL) {
                    abstractC2254741DMy.LIZJ.removeTarget(surfaceLIZJ);
                    int i3 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TECameraModeBase", "updateCameraSurface removeTarget");
                } else {
                    abstractC2254741DMy.LIZJ.addTarget(surfaceLIZJ);
                    int i4 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TECameraModeBase", "updateCameraSurface addTarget");
                }
            }
        }
        abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
    }

    @Override // X.C1DJK
    public final boolean LJJLJLI() {
        AbstractC2254741DMy abstractC2254741DMy;
        if (!LLF() || (abstractC2254741DMy = this.LJJJLZIJ) == null || abstractC2254741DMy.LIZ == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECamera2", "Query HDR info failed, you must open camera first.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "Query HDR info failed, you must open camera first.");
            return false;
        }
        if (this.LJJJJLL == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "DeviceProxy is null!");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -441, "isHDR10BitSupported: DeviceProxy is null!");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZIZ.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isHDR10BitSupported key = ");
        sbLIZ2.append(strLIZIZ);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
        BaseBundle baseBundle = (BaseBundle) ((HashMap) this.LJIJJLI).get(strLIZIZ);
        if (baseBundle == null) {
            return false;
        }
        return baseBundle.getBoolean("camera_hdr_10_bit_supported", false);
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void destroy() {
        super.destroy();
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy != null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECameraModeBase", "removeFocusSettings");
            C1DNO c1dno = abstractC2254741DMy.LJIIIIZZ;
            if (c1dno != null) {
                c1dno.LIZIZ = null;
                abstractC2254741DMy.LJJIFFI = null;
            }
        }
        C2218751Bsf c2218751Bsf = this.LJJJZ;
        if (c2218751Bsf != null) {
            Cert certLJJJLL = LJJJLL(EnumC1270990jBB.UNREGISTER_SENSOR);
            if (certLJJJLL == null || C825920Wac.LIZ(certLJJJLL) == null || C825920Wac.LIZ(certLJJJLL).intValue() <= 0) {
                certLJJJLL = CertProviderManagerKt.findCert("bpea-ve_sensor", 1476415509);
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy sensor, Cert: ");
            sbLIZ.append(certLJJJLL);
            C2183341Ace.LIZLLL("Gyro", C2188811AlT.LIZIZ(sbLIZ));
            c2218751Bsf.LJ.clear();
            c2218751Bsf.LIZ();
            SensorManager sensorManager = c2218751Bsf.LIZ;
            if (sensorManager != null) {
                try {
                    C1300690jx5.LIZLLL(sensorManager, c2218751Bsf.LJFF, c2218751Bsf.LIZIZ, certLJJJLL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    C2183341Ace.LJFF("Gyro", "sensorManager unregister listener exception occurred.", e);
                }
            }
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final JSONObject LJJIJ() {
        return this.LJJ;
    }

    public static int LLIFFJFJJ(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason != 1) {
            if (reason != 2) {
                if (reason != 3) {
                    if (reason != 4 && reason != 5) {
                        return -401;
                    }
                    return -406;
                }
                return -410;
            }
            return -409;
        }
        return -408;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LIZ(int i) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (i == 2 && !LIZLLL()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchFlashMode not support torch, just return facing = ");
            sbLIZ.append(this.LIZIZ.LLLFF);
            C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchFlashMode: ");
        sbLIZ2.append(i);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
        int i4 = 1;
        if (this.LJJJJZ != 1 && this.LJJJJZ != 2) {
            if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
                abstractC2254741DMy.LIZ(i);
                return;
            }
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            C2183341Ace.LIZIZ("TECamera2", "switch flash mode  failed, you must open camera first.");
            InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
            if (i == 0) {
                i4 = 0;
            }
            interfaceC2254691DMt.LJIIIZ(i4, "switch flash mode  failed, you must open camera first.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "switch flash mode  failed, you must open camera first.");
            return;
        }
        AbstractC2254741DMy abstractC2254741DMy2 = this.LJJJLZIJ;
        if (abstractC2254741DMy2 != null) {
            abstractC2254741DMy2.LJJJJIZL(i);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJI(Cert cert) {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "close...");
        if (this.LJJJJZ == 1) {
            if (this.LJJLI) {
                this.LJJL = true;
                return -114;
            }
            return -114;
        }
        LLFFF(cert);
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy != null) {
            C2218751Bsf c2218751BsfLLII = abstractC2254741DMy.LJI.LLII(false);
            if (abstractC2254741DMy.LJII.LLJILLL && c2218751BsfLLII != null) {
                c2218751BsfLLII.LIZJ(abstractC2254741DMy.LJJJLIIL, abstractC2254741DMy.LJI.LJJJLL(EnumC1270990jBB.UNREGISTER_SENSOR));
            }
            HandlerThread handlerThread = abstractC2254741DMy.LJJIJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                abstractC2254741DMy.LJJIJ = null;
                abstractC2254741DMy.LJJIIZI = null;
                C2183341Ace.LIZLLL("TECameraModeBase", "releaseCameraThread");
            }
        }
        return 0;
    }

    @Override // X.C1DJK
    public final void LJIIJ(EnumC2244671CtN enumC2244671CtN) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (enumC2244671CtN != EnumC2244671CtN.OFF && !LJJJJIZL(enumC2244671CtN)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setStabilizationMode not support, just return facing = ");
            sbLIZ.append(this.LIZIZ.LLLFF);
            C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJJJJZ == 1) {
            AbstractC2254741DMy abstractC2254741DMy2 = this.LJJJLZIJ;
            if (abstractC2254741DMy2 != null && (abstractC2254741DMy2 instanceof TEImage2Mode)) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateStabilizationModeParam: ");
                sbLIZ2.append(enumC2244671CtN);
                C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                CaptureRequest.Builder builder = abstractC2254741DMy2.LIZJ;
                if (builder == null) {
                    abstractC2254741DMy2.LJFF.LIZJ(abstractC2254741DMy2.LJIIIZ, abstractC2254741DMy2.LJII.LLILLJJLI, -100, "updateStabilizationModeParam : CaptureRequest.Builder is null");
                    return;
                }
                C2244641CtK c2244641CtK = abstractC2254741DMy2.LIZIZ;
                CameraCharacteristics cameraCharacteristics = abstractC2254741DMy2.LIZ;
                c2244641CtK.getClass();
                if (C2244641CtK.LIZ(cameraCharacteristics, builder, enumC2244671CtN) != 0) {
                    return;
                }
                abstractC2254741DMy2.LJFF.LJ(113, 1, "update stabilization mode param");
                return;
            }
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setStabilizationMode operation.");
            this.LIZLLL.LIZLLL(enumC2244671CtN.ordinal(), "Camera is opening, ignore setStabilizationMode operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            CaptureRequest.Builder builder2 = abstractC2254741DMy.LIZJ;
            if (builder2 == null) {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setStabilizationMode failed, mode: ");
                sbLIZ3.append(enumC2244671CtN);
                C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            C2244641CtK c2244641CtK2 = abstractC2254741DMy.LIZIZ;
            CameraCharacteristics cameraCharacteristics2 = abstractC2254741DMy.LIZ;
            c2244641CtK2.getClass();
            if (C2244641CtK.LIZ(cameraCharacteristics2, builder2, enumC2244671CtN) == 0) {
                abstractC2254741DMy.LJFF.LJ(113, 1, "config stabilization");
            }
            C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            if (c1699800uKoLJJJJJ.LIZ) {
                return;
            }
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[VE_UI_TEST]Failed event: setStabilizationMode. Code: -100. Reason: ");
            sbLIZ4.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ4));
            abstractC2254741DMy.LJFF.LJ(-100, -100, c1699800uKoLJJJJJ.LIZIZ);
            return;
        }
        int i6 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "setStabilizationMode failed, you must open camera first.");
        this.LIZLLL.LIZLLL(enumC2244671CtN.ordinal(), "setStabilizationMode failed, you must open camera first.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setStabilizationMode failed, you must open camera first.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJIILL(C1DJG c1djg) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECamera2", "setFocusAreas...");
        if (this.LJJJJZ != 3) {
            C2183341Ace.LJ("TECamera2", "Camera is not previewing, ignore setFocusAreas operation.");
            c1djg.LJIIJJI.LIZ(0, this.LIZIZ.LLILZ, "Camera is not previewing, ignore setFocusAreas operation.");
        } else {
            if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
                if (abstractC2254741DMy.LJIILL(c1djg) != 0) {
                    C2183341Ace.LIZIZ("TECamera2", "focusAtPoint : something wrong.");
                    this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -411, "focusAtPoint : something wrong.");
                    return;
                }
                return;
            }
            C2183341Ace.LIZIZ("TECamera2", "focusAtPoint : camera is null.");
            c1djg.LJIIJJI.LIZ(-439, this.LIZIZ.LLILZ, "focusAtPoint : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "focusAtPoint : camera is null.");
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJIJI(int i) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setISO : ");
        sbLIZ.append(i);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setISO operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
                abstractC2254741DMy.LJFF.LJ(-430, -430, "Capture Session is null");
            }
            if (i <= abstractC2254741DMy.LJJI()[1] && i >= abstractC2254741DMy.LJJI()[0]) {
                if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
                }
                if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
                }
                abstractC2254741DMy.LIZJ.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
                C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                if (!c1699800uKoLJJJJJ.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setISO exception: ");
                    sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
                    C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                    abstractC2254741DMy.LJFF.LJ(-430, -430, c1699800uKoLJJJJJ.LIZIZ);
                    return;
                }
                return;
            }
            abstractC2254741DMy.LJFF.LJ(-430, -430, "invalid iso");
            return;
        }
        C2183341Ace.LJ("TECamera2", "setISO : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setISO : camera is null.");
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
            if (C2247811CyR.LIZ(obj, str) && "support_light_soft".equalsIgnoreCase(str)) {
                baseBundle.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1DJK
    public final void LJJIFFI(String str) {
        AbstractC2254741DMy abstractC2254741DMy;
        int iIntValue;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWhileBalance: ");
        sbLIZ.append(str);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
                abstractC2254741DMy.LJFF.LJ(-424, -424, "Capture Session is null");
            }
            if (abstractC2254741DMy.LJJJJJ.get(str) == null) {
                iIntValue = 1;
            } else {
                iIntValue = abstractC2254741DMy.LJJJJJ.get(str).intValue();
            }
            if (!Arrays.asList(abstractC2254741DMy.LIZ.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(iIntValue))) {
                abstractC2254741DMy.LJFF.LJ(-424, -424, "invalid white balance");
                return;
            }
            C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            if (c1699800uKoLJJJJJ.LIZ) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setWhiteBalance exception: ");
            sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            abstractC2254741DMy.LJFF.LJ(-424, -424, c1699800uKoLJJJJJ.LIZIZ);
            return;
        }
        C2183341Ace.LJ("TECamera2", "setWhileBalance : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setWhileBalance : camera is null.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJIIJ(boolean z) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "setAutoFocusLock...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && abstractC2254741DMy.LIZ != null) {
            if (abstractC2254741DMy.LIZJ != null && abstractC2254741DMy.LIZLLL != null) {
                try {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    abstractC2254741DMy.LJFF.LJ(-434, -434, e.toString());
                    return;
                }
            }
            abstractC2254741DMy.LJFF.LIZJ(abstractC2254741DMy.LJIIIZ, abstractC2254741DMy.LJII.LLILLJJLI, -100, "setAutoFocusLock : Capture Session is null");
            return;
        }
        C2183341Ace.LIZIZ("TECamera2", "setAutoFocusLock : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setAutoFocusLock : camera is null.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJIIJZLJL(float f) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAperture : ");
        sbLIZ.append(f);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setAperture operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
                abstractC2254741DMy.LJFF.LJ(-432, -432, "Capture Session is null");
            }
            if (abstractC2254741DMy.LJIILLIIL().length == 1 && !Arrays.asList(abstractC2254741DMy.LJIILLIIL()).contains(Float.valueOf(f))) {
                abstractC2254741DMy.LJFF.LJ(-432, -432, "invalid aperture");
                return;
            }
            if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
            }
            abstractC2254741DMy.LIZJ.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
            C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            if (c1699800uKoLJJJJJ.LIZ) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setAperture exception: ");
            sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
            abstractC2254741DMy.LJFF.LJ(-432, -432, c1699800uKoLJJJJJ.LIZIZ);
            return;
        }
        C2183341Ace.LJ("TECamera2", "setAperture : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setAperture : camera is null.");
    }

    @Override // X.C1DJK
    public final void LJJIIZI(int i) {
        if (this.LJJJJZ != 3) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchCameraMode， invalid state: ");
            sbLIZ.append(this.LJJJJZ);
            C2183341Ace.LJ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LLI(i);
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJIJIIJIL(float f) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
                abstractC2254741DMy.LJFF.LJ(-436, -436, "Capture Session is null");
            }
            if (f < 0.0f) {
                abstractC2254741DMy.LJFF.LJ(-436, -436, "invalid distance");
                return;
            }
            abstractC2254741DMy.LIZJ.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
            C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            if (c1699800uKoLJJJJJ.LIZ) {
                return;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setManualFocusDistance exception: ");
            sbLIZ.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
            abstractC2254741DMy.LJFF.LJ(-430, -430, c1699800uKoLJJJJJ.LIZIZ);
            return;
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "setManualFocusDistance : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setManualFocusDistance : camera is null.");
    }

    @Override // X.C1DJK
    public final boolean LJJIZ(long j) {
        return this.LIZIZ.LLLLZLLIL.contains(Long.valueOf(j));
    }

    @Override // X.C1DJK
    public final boolean LJJJJIZL(EnumC2244671CtN enumC2244671CtN) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && abstractC2254741DMy.LIZ != null) {
            if (this.LJJJJLL == null) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera2", "DeviceProxy is null!");
                this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -442, "isStabilizationSupported: DeviceProxy is null!");
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.LLILLJJLI);
            sbLIZ.append("_");
            sbLIZ.append(this.LIZIZ.LLILZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isStabilizationSupported key = ");
            sbLIZ2.append(strLIZIZ);
            C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
            BaseBundle baseBundle = (BaseBundle) ((HashMap) this.LJIJJLI).get(strLIZIZ);
            if (baseBundle == null) {
                return false;
            }
            int i3 = C2244681CtO.LIZ[enumC2244671CtN.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        C2183341Ace.LIZ("TECamera2", "stabilization type is unknown");
                        return false;
                    }
                    if (!baseBundle.getBoolean("camera_eis_supported", false) || !baseBundle.getBoolean("camera_ois_supported", false)) {
                        return false;
                    }
                    return true;
                }
                return baseBundle.getBoolean("camera_ois_supported", false);
            }
            return baseBundle.getBoolean("camera_eis_supported", false);
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECamera2", "Query stabilization info failed, you must open camera first.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "Query stabilization info failed, you must open camera first.");
        return false;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJ(boolean z) {
        synchronized (this.LJJJ) {
            try {
                this.LJJJI = z;
                this.LJJJJI = 0;
                this.LJJJJIZL = 0;
                this.LJJJJJ = 0;
                this.LJJJJJL = 0;
                if (z && this.LJJIZ && LL() == 0) {
                    this.LJJIZ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJJI(Cert cert) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("force close camera: ");
        sbLIZ.append(this.LJJJLIIL);
        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJLIIL != null) {
            if (cert == null) {
                cert = LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
            }
            C1305640k54.LIZ(this.LJJJLIIL, cert);
            this.LJJJLIIL = null;
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIL(boolean z) {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "enableMulticamZoom failed, mode is null...");
            return;
        }
        if (!z && abstractC2254741DMy.LJIILLIIL != 1.0f) {
            abstractC2254741DMy.LJIILLIIL = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (abstractC2254741DMy.LIZJ != null && abstractC2254741DMy.LIZLLL != null) {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(abstractC2254741DMy.LJIILLIIL));
                    C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                    if (!c1699800uKoLJJJJJ.LIZ) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
                        sbLIZ.append(c1699800uKoLJJJJJ.LIZIZ);
                        C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ));
                        abstractC2254741DMy.LJFF.LJ(-420, -420, c1699800uKoLJJJJJ.LIZIZ);
                        return;
                    }
                } else {
                    abstractC2254741DMy.LJFF.LIZJ(abstractC2254741DMy.LJIIIZ, abstractC2254741DMy.LJII.LLILLJJLI, -100, "enableMulticamZoom : Capture Session is null");
                    return;
                }
            }
            abstractC2254741DMy.LJIJI = abstractC2254741DMy.LJFF();
        }
        abstractC2254741DMy.LJII.LLJJIII = z;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLL(TEFrameRateRange tEFrameRateRange) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ != 3) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: session is not running");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid state, state = ");
            sbLIZ.append(this.LJJJJZ);
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -443, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            C2244641CtK c2244641CtK = abstractC2254741DMy.LIZIZ;
            CameraCharacteristics cameraCharacteristics = abstractC2254741DMy.LIZ;
            int i2 = tEFrameRateRange.min;
            int i3 = tEFrameRateRange.max;
            int i4 = abstractC2254741DMy.LJII.LLILZ;
            c2244641CtK.getClass();
            TEFrameRateRange tEFrameRateRangeLIZLLL = C2244641CtK.LIZLLL(cameraCharacteristics, i2, i3, 3, i4);
            abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(tEFrameRateRangeLIZLLL.min), Integer.valueOf(tEFrameRateRangeLIZLLL.max)));
            abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
            abstractC2254741DMy.LJFF.LJ(121, 0, tEFrameRateRangeLIZLLL.toString());
            return;
        }
        int i5 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: camera is null");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setPreviewFpsRangeWhenRunning : Camera is null.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJLIL(int i) {
        super.LJLIL(i);
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "set scene failed, no mode...");
        } else {
            abstractC2254741DMy.LJJIJL(i);
        }
    }

    @Override // X.C1DJK
    public final void LJLILLLLZI(InterfaceC1287190jbJ interfaceC1287190jbJ) {
        AbstractC2254741DMy abstractC2254741DMy;
        CameraCharacteristics cameraCharacteristics;
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && (cameraCharacteristics = abstractC2254741DMy.LIZ) != null) {
            if (this.LJJJJLL == null) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera2", "DeviceProxy is null!");
                this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -420, "queryShaderZoomStep: DeviceProxy is null!");
                return;
            } else {
                float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
                Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                try {
                    CastFloatProtector.valueOf(new DecimalFormat("0.00").format(((rect.width() - ((int) (rect.width() / fFloatValue))) / fFloatValue) / rect.width()).trim()).floatValue();
                    return;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "queryShaderZoomStep: camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "queryShaderZoomStep: camera is null.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJLJJL(long j) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setShutterTime : ");
        sbLIZ.append(j);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setShutterTime operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (abstractC2254741DMy.LIZJ == null || abstractC2254741DMy.LIZLLL == null) {
                abstractC2254741DMy.LJFF.LJ(-431, -431, "Capture Session is null");
            }
            if (j <= abstractC2254741DMy.LJJIII()[1] && j >= abstractC2254741DMy.LJJIII()[0]) {
                if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
                }
                if (!((Integer) abstractC2254741DMy.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                    abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
                }
                abstractC2254741DMy.LIZJ.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
                C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                if (!c1699800uKoLJJJJJ.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setShutterTime exception: ");
                    sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
                    C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                    abstractC2254741DMy.LJFF.LJ(-431, -431, c1699800uKoLJJJJJ.LIZIZ);
                    return;
                }
                return;
            }
            abstractC2254741DMy.LJFF.LJ(-431, -431, "invalid shutter time");
            return;
        }
        C2183341Ace.LJ("TECamera2", "setISO : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setISO : camera is null.");
    }

    @Override // X.C1DJK
    public final void LJLJLLL(boolean z) {
        AbstractC2254741DMy abstractC2254741DMy;
        CameraCharacteristics cameraCharacteristics;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "setAutoExposureLock...");
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && (cameraCharacteristics = abstractC2254741DMy.LIZ) != null) {
            Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
            if (bool != null && bool.booleanValue()) {
                AbstractC2254741DMy abstractC2254741DMy2 = this.LJJJLZIJ;
                if (abstractC2254741DMy2.LIZJ != null && abstractC2254741DMy2.LIZLLL != null) {
                    try {
                        abstractC2254741DMy2.LIZJ.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
                        abstractC2254741DMy2.LJJJJJ(abstractC2254741DMy2.LIZJ);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        abstractC2254741DMy2.LJFF.LJ(-427, -427, e.toString());
                        return;
                    }
                }
                abstractC2254741DMy2.LJFF.LIZJ(abstractC2254741DMy2.LJIIIZ, abstractC2254741DMy2.LJII.LLILLJJLI, -100, "setExposureCompensation : Capture Session is null");
                return;
            }
            C2183341Ace.LJ("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.LIZLLL.LJ(-426, -426, "Current camera doesn't support auto exposure lock.");
            return;
        }
        C2183341Ace.LIZIZ("TECamera2", "setAutoExposureLock : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "setAutoExposureLock : camera is null.");
    }

    @Override // X.C1DJK
    public final void LJLLLLLL(boolean z) {
        int i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleTorch: ");
        sbLIZ.append(z);
        C2183341Ace.LIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        LIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x025f A[EDGE_INSN: B:105:0x025f->B:85:0x025f BREAK  A[LOOP:1: B:62:0x019e->B:84:0x025b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLFF(com.bytedance.bpea.basics.Cert r16) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254731DMx.LLFF(com.bytedance.bpea.basics.Cert):int");
    }

    public final void LLFFF(Cert cert) {
        Handler handler;
        try {
            AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
            abstractC2254741DMy.LJIJI = null;
            abstractC2254741DMy.LJJIZ = 0;
            abstractC2254741DMy.LJIIIZ();
            this.LJJIIZ = 0;
            this.LJJIIJ = 0L;
            C1DJ6 c1dj6 = this.LIZIZ;
            if (c1dj6 != null && (handler = this.LJ) != null && c1dj6.LLJJI) {
                handler.removeCallbacks(this.LJJJJLI);
            }
            if (this.LJJJLIIL != null) {
                LJLZ(108, "will close camera2");
                if (cert == null) {
                    cert = LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                }
                C1305640k54.LIZ(this.LJJJLIIL, cert);
                LJLZ(109, "did close camera2");
                this.LIZLLL.LJII(2, this, this.LJJJLIIL);
                this.LJJJLIIL = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", th.getMessage());
        }
        LLIIIZ(0);
        this.LJIL = null;
    }

    public final void LLI(int i) {
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECamera2", "_switchCameraMode");
        if (this.LJJJLZIJ == null) {
            return;
        }
        LLFZ();
        if (i == 0) {
            C2183341Ace.LIZ("TECamera2", "create TEVideo2Mode");
            this.LJJJLZIJ = new C2254751DMz(this, this.LJFF, this.LJJJJZI, this.LJ);
        } else if (i == 1) {
            C2183341Ace.LIZ("TECamera2", "create TEImage2Mode");
            TEImage2Mode tEImage2Mode = new TEImage2Mode(this, this.LJFF, this.LJJJJZI, this.LJ);
            this.LJJJLZIJ = tEImage2Mode;
            tEImage2Mode.LJIJJ = this.LJIILIIL;
            tEImage2Mode.LJIJJLI = this.LJIILJJIL;
            tEImage2Mode.LJIL = this.LJIILL;
        }
        if (this.LIZIZ.LLJIJIL) {
            this.LJJJLZIJ.LJIJ();
        }
        try {
            this.LIZIZ.LLLFF = LLIIIL();
            C1305710k5B.LIZIZ("te_record_camera_id", this.LIZIZ.LLLFF);
            C1DJ6 c1dj6 = this.LIZIZ;
            String str = c1dj6.LLLFF;
            if (str == null) {
                return;
            }
            if (this.LJJJLZIJ.LJJIIZ(c1dj6.LLL, str) != 0) {
                return;
            }
        } catch (CameraAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        CameraDevice cameraDevice = this.LJJJLIIL;
        abstractC2254741DMy.getClass();
        abstractC2254741DMy.LJIIIZ = cameraDevice;
        LLFII();
    }

    public final C2218751Bsf LLII(boolean z) {
        if (z && this.LJJJZ == null) {
            this.LJJJZ = new C2218751Bsf(this.LJFF);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera2", "init gyro after focus");
        }
        return this.LJJJZ;
    }

    public final void LLIIIZ(int i) {
        if (this.LJJJJZ == i) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No need update state: ");
            sbLIZ.append(i);
            C2183341Ace.LJ("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[updateSessionState]: ");
        sbLIZ2.append(this.LJJJJZ);
        sbLIZ2.append(" -> ");
        sbLIZ2.append(i);
        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJJJJZ = i;
    }

    @Override // X.C1DJK
    public final boolean setExposureCompensation(int i) {
        AbstractC2254741DMy abstractC2254741DMy;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExposureCompensation... value: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJJJZ == 1) {
            C2183341Ace.LJ("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && abstractC2254741DMy.LIZ != null) {
            if (!this.LIZIZ.LLLFZ.LIZ()) {
                C2183341Ace.LJ("TECamera2", "Current camera doesn't support setting exposure compensation.");
                this.LIZLLL.LJ(-414, -414, "Current camera doesn't support setting exposure compensation.");
                return false;
            }
            C1286570jaJ c1286570jaJ = this.LIZIZ.LLLFZ;
            if (i <= c1286570jaJ.LIZ && i >= c1286570jaJ.LIZJ) {
                AbstractC2254741DMy abstractC2254741DMy2 = this.LJJJLZIJ;
                abstractC2254741DMy2.LJIJ = i;
                if (abstractC2254741DMy2.LIZJ != null && abstractC2254741DMy2.LIZLLL != null) {
                    Integer num = (Integer) abstractC2254741DMy2.LIZJ.get(CaptureRequest.CONTROL_AE_MODE);
                    if (num != null && num.intValue() == 0) {
                        C2183341Ace.LJ("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
                        return false;
                    }
                    if (abstractC2254741DMy2.LJII.LLLFZ.LIZIZ == i) {
                        C2183341Ace.LIZLLL("TECameraModeBase", "setExposureCompensation return, no need to set");
                        return false;
                    }
                    abstractC2254741DMy2.LIZJ.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
                    abstractC2254741DMy2.LJII.LLLFZ.LIZIZ = i;
                    C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy2.LJJJJJ(abstractC2254741DMy2.LIZJ);
                    if (!c1699800uKoLJJJJJ.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("setExposureCompensation failed: ");
                        sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
                        C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                        abstractC2254741DMy2.LJFF.LJ(-413, -413, c1699800uKoLJJJJJ.LIZIZ);
                    }
                    return c1699800uKoLJJJJJ.LIZ;
                }
                abstractC2254741DMy2.LJFF.LIZJ(abstractC2254741DMy2.LJIIIZ, abstractC2254741DMy2.LJII.LLILLJJLI, -413, "setExposureCompensation : Capture Session is null");
                return false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Invalid exposure compensation value: ");
            sbLIZ3.append(i);
            sbLIZ3.append(", it must between [");
            sbLIZ3.append(this.LIZIZ.LLLFZ.LIZJ);
            sbLIZ3.append(", ");
            sbLIZ3.append(this.LIZIZ.LLLFZ.LIZ);
            sbLIZ3.append("].");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            C2183341Ace.LJ("TECamera2", strLIZIZ);
            this.LIZLLL.LJ(-415, -415, strLIZIZ);
            return false;
        }
        C2183341Ace.LIZIZ("TECamera2", "setExposureCompensation : camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -413, "setExposureCompensation : camera is null.");
        return false;
    }

    @Override // X.C1DJK
    public final void LJIILJJIL(float f, InterfaceC2254701DMu interfaceC2254701DMu) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ != 3) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid state, state = ");
            sbLIZ.append(this.LJJJJZ);
            this.LIZLLL.LJ(-420, -420, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
            if (Math.abs(abstractC2254741DMy.LJIILLIIL - f) >= 0.1f) {
                if (abstractC2254741DMy.LIZIZ != null && abstractC2254741DMy.LJIIL != null && abstractC2254741DMy.LIZLLL != null && abstractC2254741DMy.LIZJ != null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        Rect rectLJ = abstractC2254741DMy.LJ(f);
                        if (rectLJ == null) {
                            int i2 = C2187451AjH.LIZ;
                            C2183341Ace.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
                            abstractC2254741DMy.LJFF.LJ(-420, -420, "zoom rect is null.");
                            return;
                        }
                        abstractC2254741DMy.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, rectLJ);
                    } else {
                        Range<Float> range = abstractC2254741DMy.LJIIZILJ;
                        if (range != null) {
                            Float f2 = (Float) range.getUpper();
                            Float f3 = (Float) abstractC2254741DMy.LJIIZILJ.getLower();
                            if (Float.compare(f, f2.floatValue()) >= 0) {
                                f = f2.floatValue();
                            } else if (Float.compare(f, f3.floatValue()) < 0) {
                                f = f3.floatValue();
                            }
                        }
                        abstractC2254741DMy.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f));
                    }
                    C1699800uKo c1699800uKoLJJJJJ = abstractC2254741DMy.LJJJJJ(abstractC2254741DMy.LIZJ);
                    if (!c1699800uKoLJJJJJ.LIZ) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
                        sbLIZ2.append(c1699800uKoLJJJJJ.LIZIZ);
                        C2183341Ace.LIZIZ("TECameraModeBase", C2188811AlT.LIZIZ(sbLIZ2));
                        abstractC2254741DMy.LJFF.LJ(-420, -420, c1699800uKoLJJJJJ.LIZIZ);
                        return;
                    }
                    if (interfaceC2254701DMu != null) {
                        interfaceC2254701DMu.LIZLLL(f, abstractC2254741DMy.LJII.LLILLJJLI, true);
                    }
                    abstractC2254741DMy.LJIILJJIL();
                    abstractC2254741DMy.LJIILLIIL = f;
                    return;
                }
                int i4 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
                abstractC2254741DMy.LJFF.LJ(-420, -420, "startZoom : Env is null");
                return;
            }
            return;
        }
        int i5 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "startZoom : Camera is null.");
    }

    @Override // X.C1DJK
    public final TEFrameSizei LJIJJLI(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizeiLIZ;
        if (this.LJJJJZ != 0 && this.LJJJJZ != 1) {
            List<TEFrameSizei> listLJJLIIJ = LJJLIIJ();
            InterfaceC1305790k5J interfaceC1305790k5J = this.LJIILJJIL;
            if (interfaceC1305790k5J == null || (tEFrameSizeiLIZ = ((C1305780k5I) interfaceC1305790k5J).LIZ(listLJJLIIJ)) == null) {
                if (tEFrameSizei != null) {
                    return C2183321Acc.LIZIZ(listLJJLIIJ, tEFrameSizei, this.LIZIZ.LLLZ);
                }
                return C2183321Acc.LIZJ(listLJJLIIJ, f);
            }
            return tEFrameSizeiLIZ;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
        return null;
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJI(InterfaceC2254701DMu interfaceC2254701DMu, boolean z) {
        AbstractC2254741DMy abstractC2254741DMy;
        CameraCharacteristics cameraCharacteristics;
        if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null && (cameraCharacteristics = abstractC2254741DMy.LIZ) != null) {
            if (this.LJJJJLL == null) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera2", "DeviceProxy is null!");
                this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -420, "queryZoomAbility: DeviceProxy is null!");
                return;
            }
            float fLJ = C2244641CtK.LJ(cameraCharacteristics, this.LIZIZ.LLJJJ);
            this.LJIIJJI = fLJ;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mMaxZoom: ");
            sbLIZ.append(this.LJIIJJI);
            sbLIZ.append(", factor = ");
            sbLIZ.append(this.LIZIZ.LLJJJ);
            C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC2254701DMu != null) {
                boolean z2 = true;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * fLJ)));
                int i3 = this.LIZIZ.LLILLJJLI;
                if (fLJ <= 0.0f) {
                    z2 = false;
                }
                interfaceC2254701DMu.LIZJ(i3, z2, false, fLJ, arrayList);
                return;
            }
            return;
        }
        int i4 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECamera2", "queryZoomAbility: camera is null.");
        this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "queryZoomAbility: camera is null.");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJII(int i, int i2) {
        AbstractC2254741DMy abstractC2254741DMy = this.LJJJLZIJ;
        if (abstractC2254741DMy == null) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "set picture size failed, no mode...");
        } else {
            abstractC2254741DMy.LJJIJIL(i, i2);
        }
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final void LJJLIIIJL(int i, int i2) {
        AbstractC2254741DMy abstractC2254741DMy;
        if (this.LJJJJZ == 1) {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.LJJJJZ == 2) {
            int i4 = C2187451AjH.LIZ;
            C2183341Ace.LIZ("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else {
            if (LLF() && (abstractC2254741DMy = this.LJJJLZIJ) != null) {
                abstractC2254741DMy.LJJJI();
                return;
            }
            int i5 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECamera2", "takePicture : camera is null.");
            this.LIZLLL.LIZJ(this.LJJJLIIL, this.LIZIZ.LLILLJJLI, -439, "takePicture : camera is null.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    @Override // X.AbstractC2254721DMw, X.C1DJK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJI(float r14, X.InterfaceC2254701DMu r15) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254731DMx.LJLJI(float, X.1DMu):void");
    }

    @Override // X.AbstractC2254721DMw, X.C1DJK
    public final int LJLLI(C1DJ6 c1dj6, Cert cert) {
        int iLLIFFJFJJ;
        C1321640kUs.LIZ("VECamera-TECamera2-open");
        super.LJLLI(c1dj6, cert);
        if (!c1dj6.LLLIIL) {
            this.LJJJZ = new C2218751Bsf(this.LJFF);
        } else {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECamera2", "delay init gyro after focus");
        }
        this.LJIL = cert;
        this.LIZIZ = c1dj6;
        if (this.LJJJJZ == 4) {
            LLFFF(cert);
        }
        try {
            LLIIIZ(1);
            int iLLFF = LLFF(cert);
            this.LJIIIIZZ = c1dj6.LLILZ;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open: camera face = ");
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(", deferred surface: ");
            sbLIZ.append(c1dj6.LLLLLJLJLL);
            sbLIZ.append(", ret: ");
            sbLIZ.append(iLLFF);
            C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            if (iLLFF != 0) {
                LLIIIZ(0);
                LLFFF(cert);
                InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
                if (interfaceC2254691DMt != null) {
                    int i3 = c1dj6.LLILLJJLI;
                    CameraDevice cameraDevice = this.LJJJLIIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("open: camera face = ");
                    sbLIZ2.append(this.LJIIIIZZ);
                    sbLIZ2.append(" failed");
                    interfaceC2254691DMt.LIZIZ(i3, iLLFF, this, cameraDevice, C2188811AlT.LIZIZ(sbLIZ2));
                    return -1;
                }
                return -1;
            }
            this.LJJLI = c1dj6.LLLJ;
            C1321640kUs.LIZIZ();
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("open: camera face = ");
            sbLIZ3.append(this.LJIIIIZZ);
            sbLIZ3.append(" failed: e: ");
            sbLIZ3.append(th.getClass());
            sbLIZ3.append(" ");
            sbLIZ3.append(th.getMessage());
            C2183341Ace.LIZIZ("TECamera2", C2188811AlT.LIZIZ(sbLIZ3));
            if (th instanceof CameraAccessException) {
                iLLIFFJFJJ = LLIFFJFJJ(th);
            } else if (th instanceof IllegalArgumentException) {
                iLLIFFJFJJ = -405;
            } else if (th instanceof SecurityException) {
                iLLIFFJFJJ = -408;
            } else {
                iLLIFFJFJJ = -401;
            }
            LLIIIZ(4);
            LLFFF(cert);
            InterfaceC2254691DMt interfaceC2254691DMt2 = this.LIZLLL;
            if (interfaceC2254691DMt2 != null) {
                int i5 = c1dj6.LLILLJJLI;
                CameraDevice cameraDevice2 = this.LJJJLIIL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("open: camera face = ");
                sbLIZ4.append(this.LJIIIIZZ);
                sbLIZ4.append(" failed: e: ");
                sbLIZ4.append(th.getClass());
                sbLIZ4.append(" ");
                sbLIZ4.append(th.getMessage());
                interfaceC2254691DMt2.LIZIZ(i5, iLLIFFJFJJ, this, cameraDevice2, C2188811AlT.LIZIZ(sbLIZ4));
            }
            return iLLIFFJFJJ;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1DN2] */
    public C2254731DMx(int i, Context context, InterfaceC2254691DMt interfaceC2254691DMt, Handler handler, C1DJO c1djo) {
        super(context, interfaceC2254691DMt, handler, c1djo);
        this.LJJJLL = true;
        this.LJJLIIIJILLIZJL = new ConditionVariable();
        this.LJJLIIIJJI = new CameraDevice.StateCallback() { // from class: X.1DN2
            public C2244691CtP<CameraDevice> LIZ;

            {
                this.LIZ = new C2244691CtP<>(this.LIZIZ);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onClosed(CameraDevice cameraDevice) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onClosed, CameraDevice:");
                sbLIZ.append(cameraDevice);
                C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onDisconnected(CameraDevice cameraDevice) {
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECamera2", "onDisconnected: OpenCameraCallBack");
                this.LIZIZ.LLIIIJ();
                C2244691CtP<CameraDevice> c2244691CtP = this.LIZ;
                if (c2244691CtP != null) {
                    C2183341Ace.LIZIZ("TECamera2", "StateCallback::onDisconnected...");
                    C2254731DMx c2254731DMx = c2244691CtP.LIZ.get();
                    if (c2254731DMx != null) {
                        C1DJ6 c1dj6 = c2254731DMx.LIZIZ;
                        if (c1dj6.LLLLLILLIL) {
                            C2183341Ace.LIZIZ("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                            c2254731DMx.LIZIZ.LLLLLILLIL = false;
                            return;
                        }
                        ARunnableS135S0100000_35 aRunnableS135S0100000_35 = new ARunnableS135S0100000_35(c2254731DMx, 10);
                        if (c1dj6.LLJIJIL) {
                            C786410Ut5.LJJZZIII(c2254731DMx.LJ, aRunnableS135S0100000_35);
                        } else {
                            aRunnableS135S0100000_35.run();
                        }
                    }
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onOpened(CameraDevice cameraDevice) throws Throwable {
                Object obj;
                CameraDevice cameraDevice2 = cameraDevice;
                C0WST c0wst = new C0WST();
                Object[] objArr = {cameraDevice2};
                C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/camera2/CameraDevice;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ0=", null));
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", null, objArr, this, c0wzw, false);
                    return;
                }
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null && (obj = objArr2[0]) != null) {
                    cameraDevice2 = (CameraDevice) obj;
                }
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECamera2", "onOpened: OpenCameraCallBack");
                this.LIZIZ.LJLZ(107, "did start camera2");
                this.LIZIZ.LJJJLIIL = cameraDevice2;
                AbstractC2254741DMy abstractC2254741DMy = this.LIZIZ.LJJJLZIJ;
                abstractC2254741DMy.getClass();
                abstractC2254741DMy.LJIIIZ = cameraDevice2;
                this.LIZIZ.LLIIIJ();
                C2244691CtP<CameraDevice> c2244691CtP = this.LIZ;
                if (c2244691CtP != null) {
                    C2254731DMx c2254731DMx = c2244691CtP.LIZ.get();
                    if (c2254731DMx == null) {
                        C2183341Ace.LIZIZ("TECamera2", "StateCallback::onOpened...no camera holder");
                    } else {
                        c2254731DMx.LIZIZ.LLLLLILLIL = false;
                        c2254731DMx.LLIIIZ(2);
                        ARunnableS135S0100000_35 aRunnableS135S0100000_35 = new ARunnableS135S0100000_35(c2254731DMx, 9);
                        if (c2254731DMx.LIZIZ.LLJIJIL) {
                            C786410Ut5.LJJZZIII(c2254731DMx.LJ, aRunnableS135S0100000_35);
                        } else {
                            aRunnableS135S0100000_35.run();
                        }
                        c2254731DMx.LJJJLL = false;
                        C2254731DMx c2254731DMx2 = this.LIZIZ;
                        if (c2254731DMx2.LJJLI && c2254731DMx2.LJJL) {
                            C1305640k54.LIZ(cameraDevice2, c2254731DMx2.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA));
                            InterfaceC2254691DMt interfaceC2254691DMt2 = this.LIZIZ.LIZLLL;
                            if (interfaceC2254691DMt2 != null) {
                                interfaceC2254691DMt2.LJII(2, this.LIZ.LIZ.get(), this.LIZIZ.LJJJLIIL);
                            }
                            C2183341Ace.LJ("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                            this.LIZIZ.LJJL = false;
                            c0wst.LIZ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", null, objArr, this, c0wzw, true);
                            return;
                        }
                        if (c2254731DMx2.LIZIZ.LLLLLJLJLL) {
                            try {
                                c2254731DMx2.LJJJLZIJ.LJIILIIL();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                int i3 = C2187451AjH.LIZ;
                                C2183341Ace.LJ("TECamera2", "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e.getMessage());
                                C2254731DMx c2254731DMx3 = this.LIZIZ;
                                c2254731DMx3.LIZIZ.LLLLLJLJLL = false;
                                if (c2254731DMx3.LJJJJZ != 3) {
                                    this.LIZIZ.LJJLIIIJLJLI();
                                }
                            }
                        }
                        c0wst.LIZ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", null, objArr, this, c0wzw, true);
                        return;
                    }
                }
                C1305640k54.LIZ(cameraDevice2, this.LIZIZ.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA));
                C2183341Ace.LJ("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                c0wst.LIZ(100200, "com/ss/android/ttvecamera/TECamera2$1", "onOpened", null, objArr, this, c0wzw, true);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onError(CameraDevice cameraDevice, final int i2) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onError: ");
                sbLIZ.append(i2);
                sbLIZ.append(" this = ");
                sbLIZ.append(this);
                C2183341Ace.LIZLLL("TECamera2", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZIZ.LLIIIJ();
                C2244691CtP<CameraDevice> c2244691CtP = this.LIZ;
                if (c2244691CtP == null) {
                    C2183341Ace.LIZIZ("TECamera2", "had called onError");
                    return;
                }
                final C2254731DMx c2254731DMx = c2244691CtP.LIZ.get();
                if (c2254731DMx == null) {
                    C2183341Ace.LIZIZ("TECamera2", "onError...no camera holder");
                } else {
                    final int i4 = c2254731DMx.LJJJJZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("StateCallback::onError...");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", session code: ");
                    sbLIZ2.append(i4);
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C2183341Ace.LIZLLL("TECamera2", strLIZIZ);
                    Runnable runnable = new Runnable() { // from class: X.1DNL
                        public final void LIZ() {
                            int i5;
                            C2254731DMx c2254731DMx2 = c2254731DMx;
                            c2254731DMx2.LLFFF(c2254731DMx2.LJIL);
                            C2254731DMx c2254731DMx3 = c2254731DMx;
                            InterfaceC2254691DMt interfaceC2254691DMt2 = c2254731DMx3.LIZLLL;
                            if (interfaceC2254691DMt2 != null) {
                                if (i4 == 3 && (i5 = i2) == 3) {
                                    interfaceC2254691DMt2.LIZJ(c2254731DMx3.LJJJLIIL, c2254731DMx3.LIZIZ.LLILLJJLI, i5, strLIZIZ);
                                } else {
                                    interfaceC2254691DMt2.LIZIZ(c2254731DMx3.LIZIZ.LLILLJJLI, i2, c2254731DMx3, c2254731DMx3.LJJJLIIL, strLIZIZ);
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TECamera2$CameraStateCallback@a425.onError$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TECamera2$CameraStateCallback@a425.onError$1");
                        }
                    };
                    if (c2254731DMx.LIZIZ.LLJIJIL) {
                        C786410Ut5.LJJZZIII(c2254731DMx.LJ, runnable);
                    } else {
                        runnable.run();
                    }
                    c2254731DMx.LLIIIZ(4);
                }
                this.LIZ = null;
            }
        };
        this.LIZIZ = new C1DJ6(context, i);
        this.LJJJJLL = C2244641CtK.LIZJ(context);
    }
}
