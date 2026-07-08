package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469080oKg {
    public static boolean LIZ;

    public static Class<?> LIZ(int i, String str) throws Exception {
        if (i >= 0 && !TextUtils.isEmpty(str)) {
            return Class.forName(str);
        }
        throw new Exception("pluginName or/and className is empty");
    }
}
