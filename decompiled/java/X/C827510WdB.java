package X;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0WdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827510WdB {
    public static boolean LIZ() {
        return (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) ? false : true;
    }
}
