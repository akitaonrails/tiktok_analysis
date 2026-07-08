package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1CtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2244641CtK {
    public final Context LIZ;

    public String LJI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = (CameraManager) C786410Ut5.H2(this.LIZ, "camera");
        try {
            String strLJII = LJII(cameraManager.getCameraIdList(), cameraManager);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getWideAngleID, wideAngleId = ");
            sbLIZ.append(strLJII);
            sbLIZ.append(", cost time = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2183341Ace.LIZLLL("TECameraHardware2Proxy", C2188811AlT.LIZIZ(sbLIZ));
            return strLJII;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECameraHardware2Proxy", "exception occurs when getWideAngleID", th);
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public boolean LJIILIIL() {
        return !LJI().equals(CardStruct.IStatusCode.DEFAULT);
    }

    public C2244641CtK(Context context) {
        this.LIZ = context;
    }

    public static C2244641CtK LIZJ(final Context context) {
        String str = Build.BRAND;
        if (str.toLowerCase().equals("samsung")) {
            return new C2244591CtF(context);
        }
        String str2 = Build.HARDWARE;
        String lowerCase = str2.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            if (str2.toLowerCase().matches("mt[0-9]*")) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TECameraHardware2", "MTK Platform.");
                return new C2244641CtK(context) { // from class: X.1DjB
                    public static final List<String> LIZIZ;

                    static {
                        ArrayList arrayList = new ArrayList();
                        LIZIZ = arrayList;
                        C1966207n2.LIZIZ(new String[]{"ro.mediatek.platform"});
                        Collections.addAll(arrayList, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
                    }
                };
            }
            String lowerCase2 = str.toLowerCase();
            if (!lowerCase2.equals("huawei") && !lowerCase2.equals("honor")) {
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECameraHardware2Proxy", "Unknown platform");
                return new C2244641CtK(context);
            }
            return new C2244641CtK(context) { // from class: X.1CtE
                public static boolean LJIILJJIL() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("YAL-AL00");
                    arrayList.add("YAL-AL10");
                    arrayList.add("YAL-TL00");
                    arrayList.add("YAL-TL10");
                    arrayList.add("YAL-L21");
                    arrayList.add("YAL-L41");
                    arrayList.add("YAL-AL50");
                    arrayList.add("YAL-TL50");
                    arrayList.add("YAL-L51");
                    arrayList.add("SEA-AL00");
                    arrayList.add("SEA-TL00");
                    arrayList.add("SEA-AL10");
                    arrayList.add("SEA-TL10");
                    return arrayList.contains(Build.MODEL);
                }

                @Override // X.C2244641CtK
                public final boolean LJIILIIL() {
                    return !CardStruct.IStatusCode.DEFAULT.equals(LJI()) || LJIILJJIL();
                }

                @Override // X.C2244641CtK
                public final String LJI() {
                    return LJIILJJIL() ? "3" : super.LJI();
                }
            };
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECameraHardware2", "QCOM Platform.");
        return new C2244641CtK(context) { // from class: X.1CtJ
        };
    }

    public static Range LJIIIIZZ(CameraCharacteristics cameraCharacteristics) {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                if (range != null) {
                    return range;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJFF("TECameraHardware2Proxy", "getZoomValueRange catch exception: ", e);
        }
        return new Range(Float.valueOf(0.0f), (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM));
    }

    public static boolean LJIIIZ(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1 || i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJJI(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static boolean LJIIL(CameraCharacteristics cameraCharacteristics) {
        boolean zLJIIIZ = LJIIIZ(cameraCharacteristics);
        ?? r2 = zLJIIIZ;
        if (LJIIJJI(cameraCharacteristics)) {
            r2 = (zLJIIIZ ? 1 : 0) | 2;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stabilization type: ");
        sbLIZ.append(Integer.toBinaryString(r2));
        C2183341Ace.LIZ("TECameraHardware2Proxy", C2188811AlT.LIZIZ(sbLIZ));
        if (r2 > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static float LJ(CameraCharacteristics cameraCharacteristics, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return 0.0f;
        }
        float fFloatValue = f2.floatValue();
        if (f == -1.0f) {
            if (Build.VERSION.SDK_INT < 30) {
                return fFloatValue / 2.0f;
            }
            return fFloatValue;
        }
        return fFloatValue * f;
    }

    public static String LJFF(String[] strArr, CameraManager cameraManager) {
        String str = CardStruct.IStatusCode.DEFAULT;
        try {
            float f = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    float f2 = fArr[0];
                    if (f2 > f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str;
    }

    public static String LJII(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = CardStruct.IStatusCode.DEFAULT;
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
                    float f2 = fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECameraHardware2Proxy", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }

    public static boolean LJIIJ(CameraCharacteristics cameraCharacteristics, int i) {
        int iIntValue;
        if (cameraCharacteristics == null) {
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue >= 0 && iIntValue <= 4) {
            int i2 = C2244651CtL.LIZ[iIntValue];
            C1305710k5B.LIZ(i2, "te_record_camera_hardware_level");
            if (i2 >= i) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Camera hardware level supported, deviceLevel = ");
                sbLIZ.append(i2);
                sbLIZ.append(", require = ");
                sbLIZ.append(i);
                C2183341Ace.LIZLLL("TECameraHardware2Proxy", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Camera hardware level not supported, deviceLevel = ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", require = ");
            sbLIZ2.append(i);
            C2183341Ace.LIZIZ("TECameraHardware2Proxy", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invalid hardware level = ");
        sbLIZ3.append(iIntValue);
        C2183341Ace.LIZIZ("TECameraHardware2Proxy", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    public static int LIZ(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, EnumC2244671CtN enumC2244671CtN) {
        if (cameraCharacteristics != null && builder != null) {
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            int i = C2244661CtM.LIZ[enumC2244671CtN.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            int i2 = C2187451AjH.LIZ;
                            C2183341Ace.LIZ("TECameraHardware2Proxy", "stabilization type is unknown");
                            return -200;
                        }
                        if (LIZIZ(2, iArr)) {
                            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                        } else if (LIZIZ(1, iArr)) {
                            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        } else {
                            int i3 = C2187451AjH.LIZ;
                            C2183341Ace.LIZ("TECameraHardware2Proxy", "Don't support EIS");
                        }
                        if (LIZIZ(1, iArr2)) {
                            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                            return 0;
                        }
                        int i4 = C2187451AjH.LIZ;
                        C2183341Ace.LIZ("TECameraHardware2Proxy", "Don't support OIS");
                        return 0;
                    }
                    if (LIZIZ(1, iArr2)) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        return 0;
                    }
                    int i5 = C2187451AjH.LIZ;
                    C2183341Ace.LIZ("TECameraHardware2Proxy", "Don't support OIS");
                    return -200;
                }
                if (LIZIZ(2, iArr)) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                    return 0;
                }
                if (LIZIZ(1, iArr)) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    return 0;
                }
                int i6 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TECameraHardware2Proxy", "Don't support EIS");
                return -200;
            }
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        return -100;
    }

    public static TEFrameRateRange LIZLLL(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i, i2);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = tEFrameRateRange.fpsUnitFactor;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            int i7 = iArr[1];
            if (i6 < i7) {
                i6 = i7;
            }
        }
        int i8 = tEFrameRateRange.min;
        int i9 = tEFrameRateRange.fpsUnitFactor;
        int[] iArrLJIIL = C2183321Acc.LJIIL(i3, i4, new int[]{i8 / i9, tEFrameRateRange.max / i9}, arrayList);
        tEFrameRateRange.min = iArrLJIIL[0];
        tEFrameRateRange.max = iArrLJIIL[1];
        return tEFrameRateRange;
    }
}
