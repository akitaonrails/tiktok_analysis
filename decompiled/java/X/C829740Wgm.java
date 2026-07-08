package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.ttmparam.ITTMParamData;

/* JADX INFO: renamed from: X.0Wgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829740Wgm {
    public static double LIZ(Object obj, String str) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue();
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return 1.0d;
                }
                return 0.0d;
            }
            if (obj instanceof String) {
                return CastDoubleProtector.parseDouble((String) obj);
            }
            if (obj instanceof ITTMParamData) {
                return ((ITTMParamData) obj).getDoubleValue(str, Integer.MAX_VALUE);
            }
            return Double.MAX_VALUE;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Double.MAX_VALUE;
        }
    }

    public static long LIZIZ(Object obj, String str) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return 1L;
                }
                return 0L;
            }
            if (obj instanceof String) {
                return CastLongProtector.parseLong((String) obj);
            }
            if (obj instanceof ITTMParamData) {
                return ((ITTMParamData) obj).getIntValue(str, Integer.MAX_VALUE);
            }
            return Long.MAX_VALUE;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Long.MAX_VALUE;
        }
    }

    public static String LIZJ(Object obj, String str) {
        try {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof ITTMParamData) {
                return ((ITTMParamData) obj).getStringValue(str, Integer.MAX_VALUE);
            }
            if (obj instanceof Number) {
                return obj.toString();
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
