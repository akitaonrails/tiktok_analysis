package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0cvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030670cvZ {
    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String host = UriProtector.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }
}
