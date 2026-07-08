package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.runtime.VERuntime;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1A66, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A66 {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static void LIZIZ() {
        VERuntime.getInstance().enableRefactorRecorder(true);
    }

    public static void LJ() {
        int enableStickerAmazing = VERuntime.getInstance().setEnableStickerAmazing(true);
        if (enableStickerAmazing == -108) {
            throw new VEException(enableStickerAmazing, "please set VEEnv or VEEnv#init");
        }
    }

    public static Map<String, Object> LIZ() {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1284730jXL.LIZIZ;
        if (concurrentHashMap == null) {
            return null;
        }
        if (concurrentHashMap.containsKey("te_import_video_hw_bit_rate")) {
            C1284730jXL.LIZIZ.put("te_import_video_hw_profile", C1284730jXL.LIZ);
        }
        if (C1284730jXL.LIZIZ.containsKey("te_composition_video_encode_mode")) {
            Object obj = C1284730jXL.LIZIZ.get("te_composition_video_encode_mode");
            try {
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() == 1) {
                        C1284730jXL.LIZJ(new String[]{"te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop", "te_composition_video_sw_qpoffset"});
                    } else if (((Integer) obj).intValue() == 0) {
                        C1284730jXL.LIZJ(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile"});
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            C1284730jXL.LIZJ(new String[]{"te_composition_video_hw_profile"});
        }
        if (C1284730jXL.LIZIZ.containsKey("te_record_video_frame_rate")) {
            C1284730jXL.LIZJ(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile", "te_composition_video_encode_mode", "te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop"});
        }
        if (C1284730jXL.LIZIZ.containsKey("te_record_video_frame_rate") || C1284730jXL.LIZIZ.containsKey("ve_use_camera")) {
            if (!C1284730jXL.LIZIZ.containsKey("te_lens_adaptive_sharpen")) {
                C1284730jXL.LIZIZ.put("te_lens_adaptive_sharpen", 0);
            }
            if (!C1284730jXL.LIZIZ.containsKey("te_record_video_texture_hd")) {
                C1284730jXL.LIZIZ.put("te_record_video_texture_hd", 0);
            }
            C1284730jXL.LIZIZ.put("te_record_video_lanczos", Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_enable_titan_opt_lanczos_screen", false).booleanValue() ? 1 : 0));
        } else {
            C1284730jXL.LIZJ(new String[]{"te_camera_texture_size", "te_camera_preview_size", "te_lens_adaptive_sharpen"});
        }
        if (!C1284730jXL.LIZIZ.containsKey("te_edit_Enhance") && C1284730jXL.LIZIZ.containsKey("te_is_reencode")) {
            C1284730jXL.LIZIZ.put("te_edit_Enhance", 0);
        }
        C1284730jXL.LIZJ(new String[]{"ve_use_camera"});
        C1284730jXL.LIZIZ.put("te_os", 1);
        ConcurrentHashMap<String, Object> concurrentHashMap2 = C1284730jXL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Android ");
        sbLIZ.append(Build.VERSION.RELEASE);
        concurrentHashMap2.put("te_system", C2188811AlT.LIZIZ(sbLIZ));
        C1284730jXL.LIZIZ.put("te_user_device", Build.MODEL);
        C1284730jXL.LIZIZ.put("te_ve_version", "21.8.0.128");
        C1284730jXL.LIZIZ.put("te_effect_version", "21.8.0_rel_395_mt_202606300323_9f354f94044");
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(C1284730jXL.LIZIZ);
        ConcurrentHashMap<String, Object> concurrentHashMap4 = C1284730jXL.LIZIZ;
        if (concurrentHashMap4 == null) {
            return concurrentHashMap3;
        }
        concurrentHashMap4.clear();
        return concurrentHashMap3;
    }

    public static void LIZLLL(ResourceFinder resourceFinder) {
        VERuntime.getInstance().setEffectResourceFinder(resourceFinder);
    }

    public static void LJFF(byte b) {
        if (!TextUtils.isEmpty(null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2484209oO.LIZ);
            sbLIZ.append((String) null);
            sbLIZ.append("-");
            C2484209oO.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C2484209oO.LIZIZ = b;
        byte b2 = 1;
        if (b != 1) {
            if (b != 3) {
                if (b != 7) {
                    if (b != 15) {
                        if (b != 31) {
                            b2 = 0;
                        } else {
                            b2 = 16;
                        }
                    } else {
                        b2 = 8;
                    }
                } else {
                    b2 = 4;
                }
            } else {
                b2 = 2;
            }
        }
        TELogcat.nativeSetLogLevel(b2);
    }

    public static void LJI(String str) {
        boolean z = C1284450jWt.LIZ;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    ((HashMap) C1284450jWt.LJ).put(next, Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, next)));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static void LIZJ(Context context, String str) {
        ?? r2;
        String string;
        String string2;
        String string3;
        synchronized (C1311120kDu.class) {
            C1311120kDu.LIZ = false;
        }
        VEConfigCenter.getInstance().initByteBench();
        VERuntime.getInstance().init(context, str);
        C1A3B c1a3bLIZ = C1A3B.LIZ();
        c1a3bLIZ.LIZJ = str;
        for (String str2 : C1A3B.LJ) {
            C1A67 c1a67 = C1A67.LLILLJJLI;
            String string4 = "";
            String str3 = (String) c1a67.LL.LIZ(str2);
            if (!str3.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    if (str2.hashCode() == 2043549244 && str2.equals("vesdk_log_command")) {
                        if (!jSONObject.has("enable")) {
                            string = "false";
                        } else {
                            string = JSONObjectProtectorUtils.getString(jSONObject, "enable");
                        }
                        String string5 = "2018-12-08 00:00:00";
                        if (!jSONObject.has("starttime")) {
                            string2 = "2018-12-08 00:00:00";
                        } else {
                            string2 = JSONObjectProtectorUtils.getString(jSONObject, "starttime");
                        }
                        if (jSONObject.has("endtime")) {
                            string5 = JSONObjectProtectorUtils.getString(jSONObject, "endtime");
                        }
                        if (!jSONObject.has("level")) {
                            string3 = "";
                        } else {
                            string3 = JSONObjectProtectorUtils.getString(jSONObject, "level");
                        }
                        if (jSONObject.has("sign")) {
                            string4 = JSONObjectProtectorUtils.getString(jSONObject, "sign");
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(string);
                        sbLIZ.append(string2);
                        sbLIZ.append(string5);
                        sbLIZ.append(string3);
                        if (!c1a3bLIZ.LIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ), string4)) {
                            c1a67.LL.LIZIZ("", str2, false);
                            C2484209oO.LIZJ("VECloudCtrlManager", "Cloud Ctrl Command Json is doctored");
                        } else {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            long time = simpleDateFormat.parse(string2).getTime();
                            long time2 = simpleDateFormat.parse(string5).getTime();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (!c1a3bLIZ.LIZ && string.equals("true") && jCurrentTimeMillis >= time && jCurrentTimeMillis < time2) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(c1a3bLIZ.LIZJ);
                                sbLIZ2.append("/vesdklog");
                                C2484209oO.LIZ("VECloudCtrlManager", C2188811AlT.LIZIZ(sbLIZ2));
                                c1a3bLIZ.LIZ = true;
                            } else if (string.equals("false") || (jCurrentTimeMillis < time && jCurrentTimeMillis >= time2)) {
                                if (c1a3bLIZ.LIZ) {
                                    c1a3bLIZ.LIZ = false;
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(str2);
                                sbLIZ3.append(" expired");
                                C2484209oO.LIZ("VECloudCtrlManager", C2188811AlT.LIZIZ(sbLIZ3));
                                c1a67.LL.LIZIZ("", str2, false);
                            }
                        }
                    } else {
                        C2484209oO.LIZJ("VECloudCtrlManager", " json contail invalid command ");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(" json parse failed ");
                    sbLIZ4.append(e.toString());
                    C2484209oO.LIZJ("VECloudCtrlManager", C2188811AlT.LIZIZ(sbLIZ4));
                    C1A67.LLILLJJLI.LL.LIZIZ("", str2, false);
                }
            }
        }
        if (!LIZ && !LIZIZ) {
            VEConfigCenter.getInstance().syncConfigToNative();
            r2 = 1;
        } else {
            r2 = 1;
            VERuntime.getInstance().enableABOptimize(true);
            VEConfigCenter.getInstance().setEffectGetABListener();
        }
        if (Integer.valueOf(VEConfigCenter.getInstance().getValue("use_open_gl_three", (int) r2)).intValue() == r2) {
            VERuntime.getInstance().enableGLES3(r2);
        } else {
            C2484209oO.LJI("VESDK", "No gles config");
        }
        VERuntime.nativeEnableAudioSDKApiV2(VEConfigCenter.getInstance().getValue("aeabtest_v2api", false).booleanValue());
    }
}
