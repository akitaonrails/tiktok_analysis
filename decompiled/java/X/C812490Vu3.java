package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Vu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812490Vu3<T> implements InterfaceC812380Vts<Set<T>> {
    public volatile Set<InterfaceC812380Vts<T>> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile Set<T> LIZIZ;

    public final synchronized void LIZ() {
        Iterator<InterfaceC812380Vts<T>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            this.LIZIZ.add(it2.next().get());
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC812380Vts
    public final Object get() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
                        LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.LIZIZ);
    }

    public C812490Vu3(Collection<InterfaceC812380Vts<T>> collection) {
        this.LIZ.addAll(collection);
    }
}
