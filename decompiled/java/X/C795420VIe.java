package X;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.0VIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C795420VIe {
    public static Context LIZ(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File LIZIZ(Context context) {
        return context.getDataDir();
    }

    public static boolean LIZJ(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
