package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.08NW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NW {
    public static String LIZ(String str, String str2) {
        try {
            if (str2 == null) {
                return URLEncoder.encode(str, "ISO-8859-1");
            }
            if (str2.equals("null_encoding")) {
                return str;
            }
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
