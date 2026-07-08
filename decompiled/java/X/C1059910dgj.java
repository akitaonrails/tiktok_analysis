package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0dgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059910dgj {
    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("sslocal://")) {
            return false;
        }
        String host = UriProtector.parse(str).getHost();
        if (!"microapp".equals(host) && !"microgame".equals(host)) {
            return false;
        }
        return true;
    }
}
