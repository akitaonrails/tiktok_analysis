package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0nll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447430nll implements IVideoConfigService {
    public static int LIZ = 576;
    public static int LIZIZ = 1024;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static final void LIZ() {
        int[] importVideoSize;
        int i;
        int i2;
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (importVideoSize = AVSettingsWrapper.getImportVideoSize()) != null && importVideoSize.length == 2 && (i = importVideoSize[0]) > 0 && (i2 = importVideoSize[1]) > 0) {
                    LIZ = i;
                    LIZIZ = i2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        LIZJ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        LIZ();
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        LIZ();
        return LIZ;
    }
}
