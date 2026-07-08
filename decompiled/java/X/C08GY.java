package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08GY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GY {
    public static String LIZ(String str, List<Pair<String, String>> list) {
        String strEncode;
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        StringBuilder sb2 = new StringBuilder();
        for (Pair pair : (ArrayList) list) {
            try {
                String strEncode2 = URLEncoder.encode((String) pair.first, "UTF-8");
                String str2 = (String) pair.second;
                if (str2 != null) {
                    try {
                        strEncode = URLEncoder.encode(str2, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    strEncode = "";
                }
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append(strEncode2);
                sb2.append("=");
                sb2.append(strEncode);
            } catch (UnsupportedEncodingException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }
}
