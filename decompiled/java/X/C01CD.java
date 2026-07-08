package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01CD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CD {
    public static String LIZ(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('=');
            sbLIZ.append(value);
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            stringBuffer.append("&");
        }
        String string = stringBuffer.toString();
        if (u.LJIIZILJ(string, "&", false)) {
            return string.substring(0, string.length() - 1);
        }
        return string;
    }

    public static HashMap LIZIZ(String str) {
        HashMap map = new HashMap(0);
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        for (String str2 : (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length >= 2) {
                map.put(strArr[0], strArr[1]);
            }
        }
        return map;
    }

    public static String LIZLLL(String str) {
        int iLJJJ;
        if (str != null && (iLJJJ = a0.LJJJ(str, "?", 0, false, 6)) > 0) {
            if (str != null) {
                return str.substring(0, iLJJJ);
            }
            return null;
        }
        return str;
    }

    public static boolean LIZJ(Uri uri, String str, String str2) {
        if (TextUtils.equals(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str))) {
            return true;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && TextUtils.equals(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), str))) {
            return true;
        }
        return false;
    }
}
