package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216171BoV {
    public static final C2216171BoV LIZ = new C2216171BoV();
    public static final Map<String, Integer> LIZIZ;
    public static final Map<String, Integer> LIZJ;
    public static final Boolean LIZLLL;
    public static final Map<String, Integer> LJ;
    public static final Map<String, Integer> LJFF;
    public static final Boolean LJI;

    static {
        String h264HWDecodeThreshold;
        String byteVC1HWDecodeThreshold;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C09GA c09gaLIZ;
        ByteBenchStrategyHWFastImportConfiguration byteBenchStrategyHWFastImportConfiguration;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        String byteVC1HWPageModeDecodeThreshold = null;
        if (c212350188eLIZJ == null || (c09gaLIZ = c212350188eLIZJ.LIZ()) == null || (byteBenchStrategyHWFastImportConfiguration = (ByteBenchStrategyHWFastImportConfiguration) c09gaLIZ.LJII(ByteBenchStrategyHWFastImportConfiguration.class)) == null) {
            h264HWDecodeThreshold = null;
            byteVC1HWDecodeThreshold = null;
            str = null;
        } else {
            h264HWDecodeThreshold = byteBenchStrategyHWFastImportConfiguration.getH264HWDecodeThreshold();
            byteVC1HWDecodeThreshold = byteBenchStrategyHWFastImportConfiguration.getByteVC1HWDecodeThreshold();
            str = byteBenchStrategyHWFastImportConfiguration.geth264HWPageModeDecodeThreshold();
            byteVC1HWPageModeDecodeThreshold = byteBenchStrategyHWFastImportConfiguration.getByteVC1HWPageModeDecodeThreshold();
        }
        boolean z = true;
        Map<String, Integer> mapLJ = (h264HWDecodeThreshold == null || h264HWDecodeThreshold.length() == 0) ? C2097608Jq.LJ() : LIZIZ(h264HWDecodeThreshold);
        LIZIZ = mapLJ;
        LIZJ = (str == null || str.length() == 0) ? C2097608Jq.LJ() : LIZJ(str);
        LIZLLL = Boolean.valueOf(!(h264HWDecodeThreshold == null || h264HWDecodeThreshold.length() == 0) && ((num3 = mapLJ.get("lower_fps_min_side_threshold")) == null || LIZ(num3) || (num4 = mapLJ.get("higher_fps_min_side_threshold")) == null || LIZ(num4)));
        Map<String, Integer> mapLJ2 = (byteVC1HWDecodeThreshold == null || byteVC1HWDecodeThreshold.length() == 0) ? C2097608Jq.LJ() : LIZIZ(byteVC1HWDecodeThreshold);
        LJ = mapLJ2;
        LJFF = (byteVC1HWPageModeDecodeThreshold == null || byteVC1HWPageModeDecodeThreshold.length() == 0) ? C2097608Jq.LJ() : LIZJ(byteVC1HWPageModeDecodeThreshold);
        if (byteVC1HWDecodeThreshold == null || byteVC1HWDecodeThreshold.length() == 0 || ((num = mapLJ2.get("lower_fps_min_side_threshold")) != null && !LIZ(num) && (num2 = mapLJ2.get("higher_fps_min_side_threshold")) != null && !LIZ(num2))) {
            z = false;
        }
        LJI = Boolean.valueOf(z);
    }

    public static boolean LIZ(Integer num) {
        int iIntValue;
        if (num != null && 1 <= (iIntValue = num.intValue()) && iIntValue < 10000) {
            return true;
        }
        return false;
    }

    public static Map LIZIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return C2097608Jq.LJIIIIZZ(new Pair("lower_fps_min_side_threshold", Integer.valueOf(jSONObject.optInt("lower_fps_min_side_threshold", 0))), new Pair("higher_fps_threshold", Integer.valueOf(jSONObject.optInt("higher_fps_threshold", 0))), new Pair("higher_fps_min_side_threshold", Integer.valueOf(jSONObject.optInt("higher_fps_min_side_threshold", 0))));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("expand_hw_decoder_list_by_bytebench", new Throwable("json parse fail"));
            return C2097608Jq.LJ();
        }
    }

    public static Map LIZJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("page_mode", -1);
            int iOptInt2 = jSONObject.optInt("lower_fps_min_side_threshold", 0);
            int iOptInt3 = jSONObject.optInt("higher_fps_min_side_threshold", 0);
            int iOptInt4 = jSONObject.optInt("higher_fps_threshold", 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (iOptInt >= 0) {
                C2216171BoV c2216171BoV = LIZ;
                Integer numValueOf = Integer.valueOf(iOptInt2);
                c2216171BoV.getClass();
                if (LIZ(numValueOf) && LIZ(Integer.valueOf(iOptInt3))) {
                    linkedHashMap.put("page_mode", Integer.valueOf(iOptInt));
                    linkedHashMap.put("lower_fps_min_side_threshold", Integer.valueOf(iOptInt2));
                    linkedHashMap.put("higher_fps_min_side_threshold", Integer.valueOf(iOptInt3));
                    linkedHashMap.put("higher_fps_threshold", Integer.valueOf(iOptInt4));
                }
            }
            return linkedHashMap;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("expand_hw_decoder_list_by_bytebench", new Throwable("json parse page_mode_config fail"));
            return C2097608Jq.LJ();
        }
    }
}
