package X;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.1378, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1378 {
    public boolean LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public C137L LIZLLL;
    public C137L LJ;
    public C137H<Object> LJFF;

    public final C137L LIZ() {
        return (C137L) C135U.LIZ(this.LIZLLL, C137L.LL);
    }

    public final C137L LIZIZ() {
        return (C137L) C135U.LIZ(this.LJ, C137L.LL);
    }

    public final <K, V> ConcurrentMap<K, V> LIZJ() {
        if (!this.LIZ) {
            int i = this.LIZIZ;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.LIZJ;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        C137L c137lLIZ = LIZ();
        C137K c137k = C137L.LL;
        if (c137lLIZ == c137k && LIZIZ() == c137k) {
            return new AnonymousClass1375(this, new C137B<K, V, C199587137h<K, V>, C199591137l<K, V>>() { // from class: X.137b
                @Override // X.C137B
                public final C137L LIZ() {
                    return C137L.LL;
                }

                @Override // X.C137B
                public final C137L LIZIZ() {
                    return C137L.LL;
                }

                @Override // X.C137B
                public final AnonymousClass1376 LIZJ(final AnonymousClass1375 anonymousClass1375, final int i3) {
                    return new AnonymousClass1376<K, V, C199587137h<K, V>, C199591137l<K, V>>(anonymousClass1375, i3) { // from class: X.137l
                        @Override // X.AnonymousClass1376
                        public final AnonymousClass1376 LJIIJ() {
                            return this;
                        }
                    };
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C137B
                public final void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, Object obj) {
                    ((C199587137h) c137c).LLILZ = obj;
                }

                @Override // X.C137B
                public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                    C199587137h c199587137h = (C199587137h) c137c;
                    c199587137h.getClass();
                    C199587137h c199587137h2 = new C199587137h(c199587137h.LL, c199587137h.LLILLJJLI, (C199587137h) c137c2);
                    c199587137h2.LLILZ = c199587137h.LLILZ;
                    return c199587137h2;
                }

                @Override // X.C137B
                public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i3, C137C c137c) {
                    return new C199587137h(obj, i3, (C199587137h) c137c);
                }
            });
        }
        if (LIZ() == c137k && LIZIZ() == C137L.LLILLJJLI) {
            return new AnonymousClass1375(this, new C137B<K, V, C137W<K, V>, C199582137c<K, V>>() { // from class: X.137T
                @Override // X.C137B
                public final C137L LIZ() {
                    return C137L.LL;
                }

                @Override // X.C137B
                public final C137L LIZIZ() {
                    return C137L.LLILLJJLI;
                }

                @Override // X.C137B
                public final AnonymousClass1376 LIZJ(AnonymousClass1375 anonymousClass1375, int i3) {
                    return new C199582137c(anonymousClass1375, i3);
                }

                @Override // X.C137B
                public final void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, Object obj) {
                    C137W c137w = (C137W) c137c;
                    ReferenceQueue<V> referenceQueue = ((C199582137c) anonymousClass1376).LLIZLLLIL;
                    C137R<K, V, C137W<K, V>> c137r = c137w.LLILZ;
                    c137w.LLILZ = new C137P(referenceQueue, obj, c137w);
                    c137r.clear();
                }

                @Override // X.C137B
                public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                    C199582137c c199582137c = (C199582137c) anonymousClass1376;
                    C137W c137w = (C137W) c137c;
                    C137W c137w2 = (C137W) c137c2;
                    if (c137w.getValue() == null) {
                        return null;
                    }
                    ReferenceQueue<V> referenceQueue = c199582137c.LLIZLLLIL;
                    C137W c137w3 = new C137W(c137w.LL, c137w.LLILLJJLI, c137w2);
                    c137w3.LLILZ = c137w.LLILZ.LIZ(referenceQueue, c137w3);
                    return c137w3;
                }

                @Override // X.C137B
                public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i3, C137C c137c) {
                    return new C137W(obj, i3, (C137W) c137c);
                }
            });
        }
        C137L c137lLIZ2 = LIZ();
        C137M c137m = C137L.LLILLJJLI;
        if (c137lLIZ2 == c137m && LIZIZ() == c137k) {
            return new AnonymousClass1375(this, new C137B<K, V, C199584137e<K, V>, C137Z<K, V>>() { // from class: X.137U
                @Override // X.C137B
                public final C137L LIZ() {
                    return C137L.LLILLJJLI;
                }

                @Override // X.C137B
                public final C137L LIZIZ() {
                    return C137L.LL;
                }

                @Override // X.C137B
                public final AnonymousClass1376 LIZJ(AnonymousClass1375 anonymousClass1375, int i3) {
                    return new C137Z(anonymousClass1375, i3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C137B
                public final void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, Object obj) {
                    ((C199584137e) c137c).LLILLL = obj;
                }

                @Override // X.C137B
                public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                    C137Z c137z = (C137Z) anonymousClass1376;
                    C199584137e c199584137e = (C199584137e) c137c;
                    C199584137e c199584137e2 = (C199584137e) c137c2;
                    if (c199584137e.get() == null) {
                        return null;
                    }
                    C199584137e c199584137e3 = new C199584137e(c137z.LLIZLLLIL, c199584137e.get(), c199584137e.LL, c199584137e2);
                    c199584137e3.LLILLL = c199584137e.LLILLL;
                    return c199584137e3;
                }

                @Override // X.C137B
                public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i3, C137C c137c) {
                    return new C199584137e(((C137Z) anonymousClass1376).LLIZLLLIL, obj, i3, (C199584137e) c137c);
                }
            });
        }
        if (LIZ() == c137m && LIZIZ() == c137m) {
            return new AnonymousClass1375(this, new C137B<K, V, C137V<K, V>, C137Y<K, V>>() { // from class: X.137S
                @Override // X.C137B
                public final C137L LIZ() {
                    return C137L.LLILLJJLI;
                }

                @Override // X.C137B
                public final C137L LIZIZ() {
                    return C137L.LLILLJJLI;
                }

                @Override // X.C137B
                public final AnonymousClass1376 LIZJ(AnonymousClass1375 anonymousClass1375, int i3) {
                    return new C137Y(anonymousClass1375, i3);
                }

                @Override // X.C137B
                public final void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, Object obj) {
                    C137V c137v = (C137V) c137c;
                    ReferenceQueue<V> referenceQueue = ((C137Y) anonymousClass1376).LLJ;
                    C137R<K, V, C137V<K, V>> c137r = c137v.LLILLL;
                    c137v.LLILLL = new C137P(referenceQueue, obj, c137v);
                    c137r.clear();
                }

                @Override // X.C137B
                public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                    C137Y c137y = (C137Y) anonymousClass1376;
                    C137V c137v = (C137V) c137c;
                    C137V c137v2 = (C137V) c137c2;
                    if (c137v.get() != null && c137v.getValue() != null) {
                        ReferenceQueue<K> referenceQueue = c137y.LLIZLLLIL;
                        ReferenceQueue<V> referenceQueue2 = c137y.LLJ;
                        C137V c137v3 = new C137V(referenceQueue, c137v.get(), c137v.LL, c137v2);
                        c137v3.LLILLL = c137v.LLILLL.LIZ(referenceQueue2, c137v3);
                        return c137v3;
                    }
                    return null;
                }

                @Override // X.C137B
                public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i3, C137C c137c) {
                    return new C137V(((C137Y) anonymousClass1376).LLIZLLLIL, obj, i3, (C137V) c137c);
                }
            });
        }
        throw new AssertionError();
    }

    public final String toString() {
        C135T c135tLIZIZ = C135U.LIZIZ(this);
        int i = this.LIZIZ;
        if (i != -1) {
            String strValueOf = String.valueOf(i);
            C135V c135v = new C135V();
            c135tLIZIZ.LIZJ.LIZJ = c135v;
            c135tLIZIZ.LIZJ = c135v;
            c135v.LIZIZ = strValueOf;
            c135v.LIZ = "initialCapacity";
        }
        int i2 = this.LIZJ;
        if (i2 != -1) {
            String strValueOf2 = String.valueOf(i2);
            C135V c135v2 = new C135V();
            c135tLIZIZ.LIZJ.LIZJ = c135v2;
            c135tLIZIZ.LIZJ = c135v2;
            c135v2.LIZIZ = strValueOf2;
            c135v2.LIZ = "concurrencyLevel";
        }
        C137L c137l = this.LIZLLL;
        if (c137l != null) {
            c135tLIZIZ.LIZIZ(C19376010rG.LIZ(c137l.toString()), "keyStrength");
        }
        C137L c137l2 = this.LJ;
        if (c137l2 != null) {
            c135tLIZIZ.LIZIZ(C19376010rG.LIZ(c137l2.toString()), "valueStrength");
        }
        if (this.LJFF != null) {
            C135R c135r = new C135R();
            c135tLIZIZ.LIZJ.LIZJ = c135r;
            c135tLIZIZ.LIZJ = c135r;
            c135r.LIZIZ = "keyEquivalence";
        }
        return c135tLIZIZ.toString();
    }

    public final void LIZLLL(C137L c137l) {
        boolean z;
        C137L c137l2 = this.LIZLLL;
        if (c137l2 == null) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIL(c137l2, "Key strength was already set to %s", z);
        c137l.getClass();
        this.LIZLLL = c137l;
        if (c137l != C137L.LL) {
            this.LIZ = true;
        }
    }
}
