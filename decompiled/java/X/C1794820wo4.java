package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: renamed from: X.0wo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794820wo4 {
    public static SharedPreferences LIZ;

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 0));
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.encode(str.getBytes(), 0));
    }
}
