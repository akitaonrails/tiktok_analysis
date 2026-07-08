package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;

/* JADX INFO: renamed from: X.0uLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700140uLM {
    public static final C1700140uLM LIZ = new C1700140uLM();
    public static DownloadableModelSupportLibraryLoader LIZIZ = new DownloadableModelSupportLibraryLoader.SystemLoader();
    public static volatile boolean LIZJ;

    public final void LIZ() {
        if (LIZJ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZJ) {
                    LIZIZ.loadLibrary("newep");
                    LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
