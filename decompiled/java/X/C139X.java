package X;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.139X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139X<K, V> {
    public final long LIZ;
    public final long LIZIZ;
    public final TimeUnit LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public C139X() {
        this(0);
    }

    public final C139P<K, V> LIZ() {
        return (C139P) this.LIZLLL.getValue();
    }

    public final ConcurrentHashMap<K, SoftReference<V>> LIZIZ() {
        return (ConcurrentHashMap) this.LJ.getValue();
    }

    public C139X(int i) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        this.LIZ = 1000L;
        this.LIZIZ = 12L;
        this.LIZJ = timeUnit;
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN(this) { // from class: X.0uNX
            public final /* synthetic */ C139X<Object, Object> LL;

            {
                this.LL = this;
            }

            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ContactsLruCache@5368.<init>$1");
                if (((C606810Nr5) obj).LIZIZ) {
                    C139X<Object, Object> c139x = this.LL;
                    if (c139x.LIZIZ().size() > c139x.LIZ) {
                        Iterator<Map.Entry<Object, SoftReference<Object>>> it2 = c139x.LIZIZ().entrySet().iterator();
                        while (it2.hasNext() && c139x.LIZIZ().size() > c139x.LIZ) {
                            if (it2.next().getValue().get() == null) {
                                it2.remove();
                            }
                        }
                    }
                }
                C1C7U.LIZIZ("ContactsLruCache@5368.<init>$1");
            }
        });
        this.LIZLLL = C452501pT.LIZIZ(new C199601137v(this));
        this.LJ = C452501pT.LIZIZ(new C1091660eVw());
    }
}
