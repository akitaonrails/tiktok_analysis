package X;

import com.ss.android.ttve.nativePort.VEBingoManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.09pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2491109pV {
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public volatile boolean LIZIZ = false;

    public final synchronized void LIZ() {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            throw null;
        }
    }

    public C2491109pV(VEBingoManager vEBingoManager, int i) {
    }
}
