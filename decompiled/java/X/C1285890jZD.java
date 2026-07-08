package X;

import com.lynx.tasm.service.ILynxTrailService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0jZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285890jZD {
    public static Object LIZIZ(String str) {
        Object objObjectValueForTrailKey;
        ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
        if (iLynxTrailService == null || (objObjectValueForTrailKey = iLynxTrailService.objectValueForTrailKey(str)) == null) {
            return null;
        }
        return objObjectValueForTrailKey;
    }

    public static boolean LIZ(String str, boolean z) {
        Object objLIZIZ = LIZIZ(str);
        if (objLIZIZ == null) {
            return z;
        }
        if (objLIZIZ instanceof Boolean) {
            return ((Boolean) objLIZIZ).booleanValue();
        }
        if (objLIZIZ instanceof Number) {
            if (((Number) objLIZIZ).doubleValue() != 0.0d) {
                return true;
            }
            return false;
        }
        if (objLIZIZ instanceof String) {
            String str2 = (String) objLIZIZ;
            if (str2.equalsIgnoreCase("true") || str2.equals("1")) {
                return true;
            }
            if (str2.equalsIgnoreCase("false") || str2.equals(CardStruct.IStatusCode.DEFAULT)) {
                return false;
            }
        }
        return z;
    }
}
