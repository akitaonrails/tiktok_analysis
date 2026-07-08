package X;

import android.os.Build;

/* JADX INFO: renamed from: X.07mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963507mb {
    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }
}
