package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472090oPX {
    public static int LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("http:")) {
            return 1;
        }
        if (str.startsWith("https:")) {
            return 2;
        }
        if (str.startsWith("mdl:")) {
            return 3;
        }
        if (!str.startsWith("/")) {
            return -1;
        }
        return 4;
    }
}
