package X;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: X.0Wut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838490Wut {
    public static <T> T LIZ(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int LIZIZ(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int LIZJ(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}
