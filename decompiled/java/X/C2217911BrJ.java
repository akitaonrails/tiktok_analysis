package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217911BrJ {
    public static final Map<String, Object> LIZ = new HashMap();
    public static boolean LIZIZ = false;
    public static boolean LIZJ = false;
    public static boolean LIZLLL = false;

    public static synchronized String[] LIZIZ(CameraManager cameraManager) {
        String[] cameraIdList;
        Map<String, Object> map = LIZ;
        if (((HashMap) map).containsKey("CAMERA_2_LIST")) {
            cameraIdList = (String[]) ((HashMap) map).get("CAMERA_2_LIST");
        } else {
            cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList != null) {
                ((HashMap) map).put("CAMERA_2_LIST", cameraIdList);
            }
        }
        return cameraIdList;
    }

    public static synchronized Sensor LIZJ(SensorManager sensorManager) {
        Sensor sensorLJJL;
        Map<String, Object> map = LIZ;
        if (((HashMap) map).containsKey("CAMERA_2_SENSOR")) {
            sensorLJJL = (Sensor) ((HashMap) map).get("CAMERA_2_SENSOR");
        } else {
            sensorLJJL = C2204961BRm.LJJL(sensorManager, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoP/Dfyk=", null));
            ((HashMap) map).put("CAMERA_2_SENSOR", sensorLJJL);
        }
        return sensorLJJL;
    }

    public static synchronized void LJIIIIZZ(Context context) {
        if (!LIZJ && context != null) {
            LIZJ = true;
        }
    }

    public static synchronized void LJIIIZ(Context context) {
        if (!LIZIZ && context != null) {
            try {
                CameraManager cameraManager = (CameraManager) C786410Ut5.H2(context, "camera");
                String[] strArrLIZIZ = LIZIZ(cameraManager);
                if (strArrLIZIZ != null) {
                    for (String str : strArrLIZIZ) {
                        LIZLLL(LIZ(cameraManager, str), str);
                    }
                    LJI(strArrLIZIZ, cameraManager);
                }
                LIZIZ = true;
                LIZJ((SensorManager) C786410Ut5.H2(context, "sensor"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static synchronized CameraCharacteristics LIZ(CameraManager cameraManager, String str) {
        CameraCharacteristics cameraCharacteristics;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CAMERA_2_CHARACTERISTICS");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = LIZ;
        if (((HashMap) map).containsKey(strLIZIZ)) {
            cameraCharacteristics = (CameraCharacteristics) ((HashMap) map).get(strLIZIZ);
        } else {
            cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            ((HashMap) map).put(strLIZIZ, cameraCharacteristics);
        }
        return cameraCharacteristics;
    }

    public static synchronized StreamConfigurationMap LIZLLL(CameraCharacteristics cameraCharacteristics, String str) {
        StreamConfigurationMap streamConfigurationMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CAMERA_2_STREAM_CONFIGURATION_MAP");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = LIZ;
        if (((HashMap) map).containsKey(strLIZIZ)) {
            streamConfigurationMap = (StreamConfigurationMap) ((HashMap) map).get(strLIZIZ);
        } else {
            try {
                streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e) {
                e = e;
                streamConfigurationMap = null;
            } catch (Exception e2) {
                e = e2;
                streamConfigurationMap = null;
            }
            try {
                ((HashMap) map).put(strLIZIZ, streamConfigurationMap);
            } catch (AssertionError e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Assertion failed: ");
                sbLIZ2.append(e.getMessage());
                C2183341Ace.LIZIZ("TECameraProb", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Unexpected exception: ");
                sbLIZ3.append(e.getMessage());
                C2183341Ace.LIZIZ("TECameraProb", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return streamConfigurationMap;
    }

    public static String LJ(String[] strArr, CameraManager cameraManager) {
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
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECameraProb", "exception occurs when getTelephotoID: ", th);
            return str;
        }
    }

    public static synchronized void LJFF(int i, Context context) {
        Map<String, Object> map = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vendor_camera_");
        sbLIZ.append(i);
        if (((HashMap) map).get(C2188811AlT.LIZIZ(sbLIZ)) == null) {
            try {
                Object objInvoke = Class.forName("com.ss.android.ttvecamera.TEVendorCamera").getMethod("initialize", Context.class, Integer.TYPE).invoke(null, context, Integer.valueOf(i));
                if (objInvoke != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("vendor_camera_");
                    sbLIZ2.append(i);
                    ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ2), objInvoke);
                } else {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LJFF("TECameraProb", "preloadVendorCamera failed.", e);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("vendor_camera_");
        sbLIZ3.append(i);
        ((HashMap) map).get(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static synchronized String LJI(String[] strArr, CameraManager cameraManager) {
        String strLJII;
        Map<String, Object> map = LIZ;
        if (((HashMap) map).containsKey("CAMERA_2_WIDE_ID")) {
            strLJII = (String) ((HashMap) map).get("CAMERA_2_WIDE_ID");
        } else {
            strLJII = LJII(strArr, cameraManager);
            ((HashMap) map).put("CAMERA_2_WIDE_ID", strLJII);
        }
        return strLJII;
    }

    public static String LJII(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = CardStruct.IStatusCode.DEFAULT;
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristicsLIZ = LIZ(cameraManager, str2);
                Integer num = (Integer) cameraCharacteristicsLIZ.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) cameraCharacteristicsLIZ.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
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
            C2183341Ace.LIZJ("TECameraProb", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }

    public static synchronized void LJIIJ(int i, Context context) {
        if (!LIZLLL && context != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadVendorCamera, cameraType = ");
            sbLIZ.append(i);
            C2183341Ace.LIZLLL("TECameraProb", C2188811AlT.LIZIZ(sbLIZ));
            if (i != 10 && i != 11) {
                if (i == 8 && Build.VERSION.SDK_INT >= 28) {
                    try {
                        Class.forName("com.ss.android.ttvecamera.xmv2.MiSDKSingleton").getMethod("getInstance", Context.class).invoke(null, context);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i3 = C2187451AjH.LIZ;
                        C2183341Ace.LJFF("TECameraProb", "preloadXiaomiCamera failed.", e);
                    }
                }
            }
            LJFF(i, context);
            LIZLLL = true;
        }
    }
}
