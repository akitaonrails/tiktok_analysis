package X;

import X.InterfaceC1541240qD4;
import com.google.gson.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS109S0110000_23;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541090qCp<V extends InterfaceC1541240qD4> {
    public static final C1541220qD2 LJFF;
    public int LIZ;
    public final InterfaceC1541110qCr<?, V> LIZIZ;
    public final ConcurrentHashMap<C1540930qCZ, AbstractC1541140qCu<V>> LIZJ;
    public final ConcurrentHashMap<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> LIZLLL;
    public volatile int LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0qD2] */
    static {
        long j = 0;
        final C1540930qCZ c1540930qCZ = new C1540930qCZ(true, "", null, new InterfaceC1541060qCm() { // from class: X.0qD3
            @Override // X.InterfaceC1541060qCm
            public final C1535940q4W LIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
                return null;
            }

            @Override // X.InterfaceC1541060qCm
            public final int hashCode() {
                return 0;
            }

            @Override // X.InterfaceC1541060qCm
            public final String toString() {
                return "";
            }
        }, new C1541070qCn("sentinel", false, j, j, EnumC1533170q03.REMOVE_ON_CONSUME, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (InterfaceC1541110qCr) new InterfaceC1541110qCr<Object, InterfaceC1541240qD4>() { // from class: X.0q07
            @Override // X.InterfaceC1541110qCr
            public final void LIZ(C1541080qCo<InterfaceC1541240qD4> c1541080qCo, String str) {
            }

            @Override // X.InterfaceC1541110qCr
            public final void LIZIZ(InterfaceC1541060qCm interfaceC1541060qCm, AbstractC1541140qCu<InterfaceC1541240qD4> abstractC1541140qCu, EnumC1541150qCv enumC1541150qCv) {
            }

            @Override // X.InterfaceC1541110qCr
            public final Object LIZJ(k kVar, C08AB c08ab, Map<String, ? extends InterfaceC679950Qll> map) {
                return null;
            }

            @Override // X.InterfaceC1541110qCr
            public final boolean LIZLLL(InterfaceC1541060qCm interfaceC1541060qCm, InterfaceC1541060qCm interfaceC1541060qCm2) {
                return true;
            }

            @Override // X.InterfaceC1541110qCr
            public final InterfaceC1541060qCm LJ(Object obj, boolean z) {
                return null;
            }

            @Override // X.InterfaceC1541110qCr
            public final C1535940q4W LJFF(Object obj, InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
                return c1535940q4W;
            }

            @Override // X.InterfaceC1541110qCr
            public final boolean LJI(C1541080qCo<InterfaceC1541240qD4> c1541080qCo) {
                return true;
            }

            @Override // X.InterfaceC1541110qCr
            public final void LJII(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<InterfaceC1541240qD4> c1541080qCo) {
            }

            @Override // X.InterfaceC1541110qCr
            public final void LJIIIIZZ(InterfaceC1541240qD4 interfaceC1541240qD4, C08AB c08ab, C1541080qCo<InterfaceC1541240qD4> c1541080qCo) {
            }

            @Override // X.InterfaceC1541110qCr
            public final AbstractC1541130qCt<?> LJIIIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<InterfaceC1541240qD4> c1541080qCo, AbstractC1541130qCt<?> abstractC1541130qCt) throws Exception {
                throw new Exception("unreachable");
            }
        }, 448));
        LJFF = new AbstractC1541140qCu<InterfaceC1541240qD4>(c1540930qCZ) { // from class: X.0qD2
            @Override // X.InterfaceC1541260qD6
            public final boolean LIZ(C1540930qCZ c1540930qCZ2) {
                return false;
            }
        };
    }

    public final void LIZ(Function2<? super C1540930qCZ, ? super AbstractC1541140qCu<V>, Unit> function2) {
        ConcurrentHashMap<C1540930qCZ, AbstractC1541140qCu<V>> concurrentHashMap = this.LIZJ;
        if (concurrentHashMap != null) {
            for (Map.Entry<C1540930qCZ, AbstractC1541140qCu<V>> entry : concurrentHashMap.entrySet()) {
                function2.invoke(entry.getKey(), entry.getValue());
            }
            this.LJ = concurrentHashMap.size();
            return;
        }
        ConcurrentHashMap<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> concurrentHashMap2 = this.LIZLLL;
        int i = 0;
        if (concurrentHashMap2 != null) {
            for (Map.Entry<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> entry2 : concurrentHashMap2.entrySet()) {
                C1540930qCZ key = entry2.getKey();
                C1541160qCw<AbstractC1541140qCu<V>> value = entry2.getValue();
                value.LIZJ(new AwS389S0200000_23((Function2) function2, key, (C1540930qCZ) 18));
                i += value.LIZLLL;
            }
        }
        this.LJ = i;
    }

    public C1541090qCp(boolean z, int i, InterfaceC1541110qCr<?, V> interfaceC1541110qCr) {
        ConcurrentHashMap<C1540930qCZ, AbstractC1541140qCu<V>> concurrentHashMap;
        this.LIZ = i;
        this.LIZIZ = interfaceC1541110qCr;
        if (!z) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = null;
        }
        this.LIZJ = concurrentHashMap;
        this.LIZLLL = z ? new ConcurrentHashMap<>() : null;
    }

    public final boolean LIZJ(C1540930qCZ c1540930qCZ, AbstractC1541140qCu<V> abstractC1541140qCu, EnumC1541150qCv enumC1541150qCv) {
        C1541160qCw<?> c1541160qCw;
        boolean zLIZLLL;
        Object obj;
        int i = 0;
        if (abstractC1541140qCu.LIZIZ == null || abstractC1541140qCu.LIZLLL != null) {
            return false;
        }
        ConcurrentHashMap<C1540930qCZ, AbstractC1541140qCu<V>> concurrentHashMap = this.LIZJ;
        if (concurrentHashMap != null) {
            zLIZLLL = concurrentHashMap.remove(c1540930qCZ, abstractC1541140qCu);
        } else {
            ConcurrentHashMap<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> concurrentHashMap2 = this.LIZLLL;
            if (concurrentHashMap2 != null) {
                AbstractC1541140qCu abstractC1541140qCu2 = null;
                if (abstractC1541140qCu instanceof C1541080qCo) {
                    C1541080qCo c1541080qCo = (C1541080qCo) abstractC1541140qCu;
                    c1541160qCw = c1541080qCo.LJIILJJIL;
                    if ((c1541160qCw instanceof C1541160qCw) && c1541160qCw != null) {
                        WeakReference<?> weakReference = c1541080qCo.LJIILL;
                        if (weakReference != null) {
                            obj = weakReference.get();
                        } else {
                            obj = null;
                        }
                        if (obj instanceof AbstractC1541140qCu) {
                            abstractC1541140qCu2 = (AbstractC1541140qCu) obj;
                        }
                        zLIZLLL = c1541160qCw.LIZLLL(abstractC1541140qCu, abstractC1541140qCu2);
                    } else {
                        return false;
                    }
                } else {
                    c1541160qCw = concurrentHashMap2.get(c1540930qCZ);
                    if (c1541160qCw != null) {
                        zLIZLLL = c1541160qCw.LIZLLL(abstractC1541140qCu, null);
                    } else {
                        return false;
                    }
                }
                if (c1541160qCw.LIZLLL == 0) {
                    this.LIZLLL.remove(c1540930qCZ, c1541160qCw);
                }
            } else {
                return false;
            }
        }
        if (zLIZLLL) {
            int i2 = this.LJ - 1;
            if (i2 >= 0) {
                i = i2;
            }
            this.LJ = i;
            abstractC1541140qCu.LIZLLL = Long.valueOf(System.currentTimeMillis());
            this.LIZIZ.LIZIZ(c1540930qCZ.LIZLLL, abstractC1541140qCu, enumC1541150qCv);
        }
        return zLIZLLL;
    }

    public final void LIZLLL(C1540930qCZ c1540930qCZ, C1541080qCo c1541080qCo, C1541180qCy c1541180qCy) {
        Boolean boolValueOf = null;
        if (c1541080qCo instanceof C1541080qCo) {
            C1541160qCw<?> c1541160qCw = c1541080qCo.LJIILJJIL;
            if ((c1541160qCw instanceof C1541160qCw) && c1541160qCw != null && c1541160qCw.LJ(c1541080qCo, c1541180qCy)) {
                c1541180qCy.LIZIZ = c1541080qCo.LIZIZ;
                c1541180qCy.LJ = c1541080qCo.LJ;
                c1541180qCy.LIZJ = c1541080qCo.LIZJ;
                c1541180qCy.LJFF = c1541080qCo.LJFF;
                c1541080qCo.LJIILL = new WeakReference<>(c1541180qCy);
                return;
            }
            return;
        }
        ConcurrentHashMap<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> concurrentHashMap = this.LIZLLL;
        if (concurrentHashMap != null) {
            C1541160qCw<AbstractC1541140qCu<V>> c1541160qCw2 = concurrentHashMap.get(c1540930qCZ);
            if (c1541160qCw2 != null) {
                boolValueOf = Boolean.valueOf(c1541160qCw2.LJ(c1541080qCo, c1541180qCy));
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                c1541180qCy.LIZIZ = c1541080qCo.LIZIZ;
                c1541180qCy.LJ = c1541080qCo.LJ;
                c1541180qCy.LIZJ = c1541080qCo.LIZJ;
                c1541180qCy.LJFF = c1541080qCo.LJFF;
            }
        }
    }

    public final AbstractC1541140qCu<V> LIZIZ(C1540930qCZ c1540930qCZ, AbstractC1541140qCu<V> abstractC1541140qCu, int i, boolean z) {
        C1541160qCw<AbstractC1541140qCu<V>> c1541160qCwPutIfAbsent;
        ConcurrentHashMap<C1540930qCZ, AbstractC1541140qCu<V>> concurrentHashMap = this.LIZJ;
        if (concurrentHashMap != null) {
            AbstractC1541140qCu<V> abstractC1541140qCuPutIfAbsent = concurrentHashMap.putIfAbsent(c1540930qCZ, abstractC1541140qCu);
            if (abstractC1541140qCuPutIfAbsent == null) {
                this.LJ++;
                abstractC1541140qCu.LIZIZ = Long.valueOf(System.currentTimeMillis());
            }
            return abstractC1541140qCuPutIfAbsent;
        }
        ConcurrentHashMap<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<V>>> concurrentHashMap2 = this.LIZLLL;
        if (concurrentHashMap2 == null) {
            return null;
        }
        C1541160qCw<AbstractC1541140qCu<V>> c1541160qCw = concurrentHashMap2.get(c1540930qCZ);
        if (c1541160qCw == null && (c1541160qCwPutIfAbsent = concurrentHashMap2.putIfAbsent(c1540930qCZ, (c1541160qCw = new C1541160qCw<>(i)))) != null) {
            c1541160qCw = c1541160qCwPutIfAbsent;
        }
        if (c1541160qCw.LIZLLL == 0) {
            c1541160qCw.LIZ(abstractC1541140qCu);
            if (abstractC1541140qCu instanceof C1541080qCo) {
                ((C1541080qCo) abstractC1541140qCu).LJIILJJIL = c1541160qCw;
            }
            this.LJ++;
            abstractC1541140qCu.LIZIZ = Long.valueOf(System.currentTimeMillis());
            return null;
        }
        AbstractC1541140qCu<V> abstractC1541140qCuLIZIZ = c1541160qCw.LIZIZ(new AwS109S0110000_23(z, c1540930qCZ, 0));
        if (abstractC1541140qCuLIZIZ == null) {
            if (c1541160qCw.LIZ(abstractC1541140qCu)) {
                if (abstractC1541140qCu instanceof C1541080qCo) {
                    ((C1541080qCo) abstractC1541140qCu).LJIILJJIL = c1541160qCw;
                }
                this.LJ++;
                abstractC1541140qCu.LIZIZ = Long.valueOf(System.currentTimeMillis());
            } else {
                return LJFF;
            }
        }
        return abstractC1541140qCuLIZIZ;
    }
}
