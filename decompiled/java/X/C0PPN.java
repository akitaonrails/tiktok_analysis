package X;

import com.ss.android.agilelogger.ALog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PPN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPN {
    public static final C0PPN LIZ = new C0PPN();

    public static void LIZJ(Object obj, String str, Map map) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        ((HashMap) map).put(str, string);
    }

    public static void LIZ(String str, String str2, EnumC682580Qq0 enumC682580Qq0, Integer num) {
        StringBuilder sb = new StringBuilder("not_shown reason=");
        sb.append(str);
        sb.append(" source=");
        sb.append(enumC682580Qq0.getValue());
        sb.append(" search_id=");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        if (num != null) {
            int iIntValue = num.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" error_type=");
            sbLIZ.append(iIntValue);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                str3 = strLIZIZ;
            }
        }
        sb.append(str3);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SearchGpsPopup", sb.toString());
    }
}
