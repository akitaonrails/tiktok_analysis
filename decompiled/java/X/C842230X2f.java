package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0X2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842230X2f {
    public static String LIZ(int i, Context context) {
        String strLIZJ;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        switch (i) {
            case 1:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "ssids");
                break;
            case 2:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "dns");
                break;
            case 3:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "https_dns");
                break;
            case 4:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "tnc_config");
                break;
            case 5:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "tnc_etag");
                break;
            case 6:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "tnc_abtest");
                break;
            case 7:
                strLIZJ = TTNetInit.getTTNetDepend().LIZJ(context, "is_full_config");
                break;
            default:
                strLIZJ = "";
                break;
        }
        if (!(strLIZJ instanceof String)) {
            return "";
        }
        return String.valueOf(strLIZJ);
    }

    public static void LIZIZ(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case 5:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case 6:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
                case 7:
                    linkedHashMap.put("is_full_config", str);
                    break;
            }
            Logger.debug();
            TTNetInit.getTTNetDepend().LIZLLL(context, linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
