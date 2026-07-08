package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0gkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177460gkK {
    public final C1183630guH<C1157370gDv, SoftReference<C1177000gja>> LIZ = new C1183630guH<>(160);
    public final C1183630guH<C1157370gDv, SoftReference<Bitmap>> LIZIZ = new C1183630guH<>(80);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        C1183630guH<C1157370gDv, SoftReference<C1177000gja>> c1183630guH = this.LIZ;
        C1177050gjf c1177050gjf = new C1177050gjf();
        ReentrantReadWriteLock.ReadLock lock = c1183630guH.LIZIZ.readLock();
        lock.lock();
        try {
            for (Map.Entry entry : ((LinkedHashMap) c1183630guH.LIZ.LJIIIIZZ()).entrySet()) {
                c1177050gjf.invoke(entry.getKey(), entry.getValue());
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final C1177000gja LIZ(C1157370gDv c1157370gDv) {
        SoftReference<C1177000gja> softReferenceLIZ = this.LIZ.LIZ(c1157370gDv);
        if (softReferenceLIZ != null) {
            return softReferenceLIZ.get();
        }
        return null;
    }
}
