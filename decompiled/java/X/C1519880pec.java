package X;

import com.bytedance.keva.KevaMonitor;
import com.tiktok.ttf.storage.task.IInitStorageHook;

/* JADX INFO: renamed from: X.0pec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519880pec extends KevaMonitor {
    public static volatile boolean LIZ;

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportWarning(int i, String str, String str2, Object obj, String str3) {
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void loadLibrary(String str) {
        LIZ = true;
        IInitStorageHook iInitStorageHook = C1519870peb.LIZJ;
        if (iInitStorageHook != null) {
            iInitStorageHook.LIZJ(str);
        } else {
            System.loadLibrary("c++_shared");
            System.loadLibrary(str);
        }
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void onLoadRepo(String str, int i) {
        super.onLoadRepo(str, i);
        IInitStorageHook iInitStorageHook = C1519870peb.LIZJ;
        if (iInitStorageHook != null) {
            iInitStorageHook.LIZ();
        }
    }
}
