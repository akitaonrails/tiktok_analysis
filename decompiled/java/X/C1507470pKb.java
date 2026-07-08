package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0pKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507470pKb<K, V> {
    public final LruCache<K, V> LIZ;
    public final Object LIZIZ = new Object();

    public final Set<Map.Entry<K, V>> LIZ() {
        Set<Map.Entry<K, V>> setEntrySet;
        synchronized (this.LIZIZ) {
            try {
                setEntrySet = this.LIZ.snapshot().entrySet();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return setEntrySet;
    }

    public final V LIZIZ(K k) {
        V v;
        synchronized (this.LIZIZ) {
            try {
                v = this.LIZ.get(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return v;
    }

    public final V LIZLLL(K k) {
        V vRemove;
        synchronized (this.LIZIZ) {
            try {
                vRemove = this.LIZ.remove(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return vRemove;
    }

    public final void LJ(Collection<? extends K> collection) {
        synchronized (this.LIZIZ) {
            try {
                Iterator<? extends K> it2 = collection.iterator();
                while (it2.hasNext()) {
                    this.LIZ.remove(it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1507470pKb(int i, Float f) {
        this.LIZ = new LruCache<>(i);
        if (f != null) {
            final int iFloatValue = (int) (i * f.floatValue());
            C687360Qxi.LIZ(new InterfaceC687370Qxj(this) { // from class: X.0pKf
                public final /* synthetic */ C1507470pKb<K, V> LL;

                @Override // X.InterfaceC687370Qxj
                public final void onLowMemory() {
                    C1507470pKb<K, V> c1507470pKb = this.LL;
                    int i2 = iFloatValue;
                    synchronized (c1507470pKb.LIZIZ) {
                        try {
                            c1507470pKb.LIZ.trimToSize(i2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                {
                    this.LL = this;
                }
            });
        }
    }

    public final void LIZJ(Object obj, Object obj2) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZ.put(obj, obj2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
