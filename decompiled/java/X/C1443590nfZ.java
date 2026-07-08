package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0nfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443590nfZ implements IVideoConfigService {
    public int LIZ = 576;
    public int LIZIZ = 1024;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final boolean LIZLLL;

    public final void LIZ() {
        int i;
        int i2;
        if (this.LIZJ.get()) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                if (this.LIZJ.compareAndSet(false, true)) {
                    int[] nowEncodeSize = this.LIZLLL ? AVSettingsWrapper.getNowEncodeSize() : AVSettingsWrapper.getRecordVideoSize(false);
                    if (nowEncodeSize != null && nowEncodeSize.length == 2 && (i = nowEncodeSize[0]) > 0 && (i2 = nowEncodeSize[1]) > 0) {
                        if (this.LIZLLL) {
                            this.LIZ = i;
                            this.LIZIZ = i2;
                        } else {
                            this.LIZ = i;
                            this.LIZIZ = i2;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        this.LIZJ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        LIZ();
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        LIZ();
        return this.LIZ;
    }

    public C1443590nfZ(boolean z) {
        this.LIZLLL = z;
    }
}
