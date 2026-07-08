package X;

import android.webkit.WebResourceResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0dCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041220dCa {
    public final Set<InterfaceC1041260dCe> LIZ = new LinkedHashSet();
    public final ReentrantReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public final WebResourceResponse LIZ(String str) {
        WebResourceResponse webResourceResponseLIZ = null;
        if (str != null) {
            this.LIZIZ.readLock().lock();
            try {
                Iterator<InterfaceC1041260dCe> it2 = this.LIZ.iterator();
                while (it2.hasNext() && (webResourceResponseLIZ = it2.next().LIZ(str)) == null) {
                }
                this.LIZIZ.readLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ.readLock().unlock();
                throw th;
            }
        }
        return webResourceResponseLIZ;
    }
}
