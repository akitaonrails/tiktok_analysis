package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NBI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBI {
    public static final Map<String, C0NBK> LIZ = Collections.synchronizedMap(new HashMap(4));
    public static final C0NBK LIZIZ;

    static {
        C0NBK c0nbk = new C0NBK();
        c0nbk.LIZ = ((Boolean) C589800NBi.LIZLLL.getValue()).booleanValue();
        c0nbk.LIZIZ = ((Number) C589800NBi.LJ.getValue()).intValue();
        c0nbk.LIZJ = ((Boolean) C589800NBi.LJFF.getValue()).booleanValue();
        c0nbk.LIZLLL = ((Number) C589800NBi.LJI.getValue()).intValue();
        c0nbk.LJ = ((Number) C589800NBi.LJII.getValue()).intValue();
        LIZIZ = c0nbk;
    }

    public static final C0NBK LIZ(C586130Myp c586130Myp) {
        if (!((Boolean) C589800NBi.LIZLLL.getValue()).booleanValue()) {
            return null;
        }
        int iIntValue = 0;
        if (c586130Myp.LIZ.length() == 0) {
            return null;
        }
        if (((Boolean) C589800NBi.LJIIIZ.getValue()).booleanValue()) {
            if (!Intrinsics.LJFF(c586130Myp.LIZJ, Boolean.TRUE)) {
                LIZJ(c586130Myp.LIZ, null);
                return null;
            }
            Map<String, C0NBK> map = LIZ;
            if (map.size() < 4) {
                LIZJ(c586130Myp.LIZ, null);
                return null;
            }
            if (map.containsKey(c586130Myp.LIZ)) {
                return map.get(c586130Myp.LIZ);
            }
            String str = c586130Myp.LIZIZ;
            if (str != null && str.length() != 0) {
                C01GW c01gw = C589800NBi.LJIIJJI;
                if (((Number) c01gw.getValue()).intValue() > -1) {
                    Integer num = c586130Myp.LIZLLL;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    if (iIntValue <= ((Number) c01gw.getValue()).intValue()) {
                        LIZJ(c586130Myp.LIZ, null);
                        return null;
                    }
                }
                try {
                    C0NBJ c0nbjLIZIZ = LIZIZ(C1473210oRL.from(c586130Myp.LIZIZ));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aid: ");
                    sbLIZ.append(c586130Myp.LIZ);
                    sbLIZ.append(",  brightRatioMean: ");
                    sbLIZ.append(Float.valueOf(c0nbjLIZIZ.LIZIZ));
                    sbLIZ.append(" brightnessMean: ");
                    sbLIZ.append(Float.valueOf(c0nbjLIZIZ.LIZ));
                    sbLIZ.append(" stdBrightness: ");
                    sbLIZ.append(Float.valueOf(c0nbjLIZIZ.LIZJ));
                    sbLIZ.append(" overexposureRatioMean: ");
                    sbLIZ.append(Float.valueOf(c0nbjLIZIZ.LIZLLL));
                    sbLIZ.append(" diffOverexposureRatio: ");
                    sbLIZ.append(Float.valueOf(c0nbjLIZIZ.LJ));
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (c0nbjLIZIZ.LIZ < ((Number) C589800NBi.LJIIJ.getValue()).floatValue()) {
                        LIZJ(c586130Myp.LIZ, null);
                        return null;
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } else {
                LIZJ(c586130Myp.LIZ, null);
                return null;
            }
        }
        String str2 = c586130Myp.LIZ;
        C0NBK c0nbk = LIZIZ;
        LIZJ(str2, c0nbk);
        return c0nbk;
    }

    public static C0NBJ LIZIZ(C1473210oRL c1473210oRL) {
        float fOptDouble;
        float fOptDouble2;
        float fOptDouble3;
        float fOptDouble4;
        float fOptDouble5;
        JSONObject json = c1473210oRL.getJson();
        if (json != null) {
            fOptDouble = (float) json.optDouble("brightness_mean", -1.0d);
        } else {
            fOptDouble = -1.0f;
        }
        JSONObject json2 = c1473210oRL.getJson();
        if (json2 != null) {
            fOptDouble2 = (float) json2.optDouble("bright_ratio_mean", -1.0d);
        } else {
            fOptDouble2 = -1.0f;
        }
        JSONObject json3 = c1473210oRL.getJson();
        if (json3 != null) {
            fOptDouble3 = (float) json3.optDouble("std_brightness", -1.0d);
        } else {
            fOptDouble3 = -1.0f;
        }
        JSONObject json4 = c1473210oRL.getJson();
        if (json4 != null) {
            fOptDouble4 = (float) json4.optDouble("overexposure_ratio_mean", -1.0d);
        } else {
            fOptDouble4 = -1.0f;
        }
        JSONObject json5 = c1473210oRL.getJson();
        if (json5 != null) {
            fOptDouble5 = (float) json5.optDouble("diff_overexposure_ratio", -1.0d);
        } else {
            fOptDouble5 = -1.0f;
        }
        return new C0NBJ(fOptDouble, fOptDouble2, fOptDouble3, fOptDouble4, fOptDouble5);
    }

    public static void LIZJ(String str, C0NBK c0nbk) {
        Map<String, C0NBK> map = LIZ;
        if (map.size() >= 4 && !map.containsKey(str)) {
            Iterator<String> it2 = map.keySet().iterator();
            if (it2.hasNext()) {
                map.remove(it2.next());
            }
        }
        map.put(str, c0nbk);
    }
}
