package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* JADX INFO: renamed from: X.13Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20025313Wx {
    public static PackageManager.ComponentInfoFlags LIZIZ(long j) {
        return PackageManager.ComponentInfoFlags.of(j);
    }

    public static ServiceInfo LIZ(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }
}
