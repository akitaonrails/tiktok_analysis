package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818970WAt implements C0WBI, C0WB5 {
    public static final C819020WAy LJIIIIZZ = new InterfaceC812380Vts() { // from class: X.0WAy
        @Override // X.InterfaceC812380Vts
        public final Object get() {
            return Collections.emptySet();
        }
    };
    public final List<InterfaceC812380Vts<ComponentRegistrar>> LIZLLL;
    public final C811550VsX LJFF;
    public final ComponentRegistrarProcessor LJII;
    public final Map<C0WBP<?>, InterfaceC812380Vts<?>> LIZ = new HashMap();
    public final Map<C0WBF<?>, InterfaceC812380Vts<?>> LIZIZ = new HashMap();
    public final Map<C0WBF<?>, C812490Vu3<?>> LIZJ = new HashMap();
    public final Set<String> LJ = new HashSet();
    public final AtomicReference<Boolean> LJI = new AtomicReference<>();

    public final void LJII() {
        for (C0WBP c0wbp : ((HashMap) this.LIZ).keySet()) {
            for (C0WBG c0wbg : c0wbp.LIZIZ) {
                if (c0wbg.LIZIZ == 2 && !((HashMap) this.LIZJ).containsKey(c0wbg.LIZ)) {
                    ((HashMap) this.LIZJ).put(c0wbg.LIZ, new C812490Vu3(Collections.emptySet()));
                } else if (((HashMap) this.LIZIZ).containsKey(c0wbg.LIZ)) {
                    continue;
                } else {
                    int i = c0wbg.LIZIZ;
                    if (i == 1) {
                        final String strJ4 = C786410Ut5.j4("Unsatisfied dependency for component %s: %s", new Object[]{c0wbp, c0wbg.LIZ});
                        throw new C0WB4(strJ4) { // from class: X.0WB3
                        };
                    }
                    if (i != 2) {
                        ((HashMap) this.LIZIZ).put(c0wbg.LIZ, new C0WB7());
                    }
                }
            }
        }
    }

    public final List<Runnable> LJIIIZ() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            C0WBP c0wbp = (C0WBP) entry.getKey();
            if (c0wbp.LIZLLL != 0) {
                Object value = entry.getValue();
                for (Object obj : c0wbp.LIZ) {
                    if (!map.containsKey(obj)) {
                        map.put(obj, new HashSet());
                    }
                    ((Set) map.get(obj)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((HashMap) this.LIZJ).containsKey(entry2.getKey())) {
                final C812490Vu3 c812490Vu3 = (C812490Vu3) ((HashMap) this.LIZJ).get(entry2.getKey());
                for (final InterfaceC812380Vts interfaceC812380Vts : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: X.0Vu4
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C812490Vu3 c812490Vu32 = c812490Vu3;
                            InterfaceC812380Vts interfaceC812380Vts2 = interfaceC812380Vts;
                            C1C7U.LIZ("ComponentRuntime@758e.processSetComponents$1L");
                            synchronized (c812490Vu32) {
                                if (c812490Vu32.LIZIZ == 0) {
                                    c812490Vu32.LIZ.add((InterfaceC812380Vts<T>) interfaceC812380Vts2);
                                } else {
                                    c812490Vu32.LIZIZ.add((T) interfaceC812380Vts2.get());
                                }
                            }
                            C1C7U.LIZIZ("ComponentRuntime@758e.processSetComponents$1L");
                        }
                    });
                }
            } else {
                ((HashMap) this.LIZJ).put(entry2.getKey(), new C812490Vu3((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // X.C0WBI
    public final synchronized <T> InterfaceC812380Vts<T> LIZ(C0WBF<T> c0wbf) {
        return (InterfaceC812380Vts) ((HashMap) this.LIZIZ).get(c0wbf);
    }

    @Override // X.C0WBI
    public final Object LIZIZ(Class cls) {
        return LJFF(C0WBF.LIZ(cls));
    }

    @Override // X.C0WBI
    public final InterfaceC812380Vts LIZJ(Class cls) {
        return LIZ(C0WBF.LIZ(cls));
    }

    @Override // X.C0WBI
    public final Set LIZLLL(C0WBF c0wbf) {
        return (Set) LJIIJ(c0wbf).get();
    }

    public final Object LJFF(C0WBF c0wbf) {
        InterfaceC812380Vts interfaceC812380VtsLIZ = LIZ(c0wbf);
        if (interfaceC812380VtsLIZ == null) {
            return null;
        }
        return interfaceC812380VtsLIZ.get();
    }

    public final void LJI(boolean z) {
        HashMap map;
        AtomicReference<Boolean> atomicReference = this.LJI;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            try {
                map = new HashMap(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJ(map, z);
    }

    public final List<Runnable> LJIIIIZZ(List<C0WBP<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C0WBP c0wbp : (ArrayList) list) {
            if (c0wbp.LIZLLL == 0) {
                final InterfaceC812380Vts interfaceC812380Vts = (InterfaceC812380Vts) ((HashMap) this.LIZ).get(c0wbp);
                for (Object obj : c0wbp.LIZ) {
                    if (!((HashMap) this.LIZIZ).containsKey(obj)) {
                        ((HashMap) this.LIZIZ).put(obj, interfaceC812380Vts);
                    } else {
                        final C0WB7 c0wb7 = (C0WB7) ((InterfaceC812380Vts) ((HashMap) this.LIZIZ).get(obj));
                        arrayList.add(new Runnable() { // from class: X.0WB6
                            @Override // java.lang.Runnable
                            public final void run() {
                                Object obj2;
                                C0WB7 c0wb72 = c0wb7;
                                InterfaceC812380Vts<T> interfaceC812380Vts2 = interfaceC812380Vts;
                                C1C7U.LIZ("ComponentRuntime@758e.processInstanceComponents$1L");
                                if (c0wb72.LIZIZ != C0WB7.LIZLLL) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (c0wb72) {
                                    try {
                                        obj2 = c0wb72.LIZ;
                                        c0wb72.LIZ = null;
                                        c0wb72.LIZIZ = interfaceC812380Vts2;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                obj2.getClass();
                                C1C7U.LIZIZ("ComponentRuntime@758e.processInstanceComponents$1L");
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T> InterfaceC812380Vts<Set<T>> LJIIJ(C0WBF<T> c0wbf) {
        C812490Vu3 c812490Vu3 = (C812490Vu3) ((HashMap) this.LIZJ).get(c0wbf);
        if (c812490Vu3 != null) {
            return c812490Vu3;
        }
        return LJIIIIZZ;
    }

    public final void LJ(Map<C0WBP<?>, InterfaceC812380Vts<?>> map, boolean z) {
        Queue<C1267204xa<?>> queue;
        for (Map.Entry<C0WBP<?>, InterfaceC812380Vts<?>> entry : map.entrySet()) {
            C0WBP<?> key = entry.getKey();
            InterfaceC812380Vts<?> value = entry.getValue();
            int i = key.LIZJ;
            if (i == 1 || (i == 2 && z)) {
                value.get();
            }
        }
        C811550VsX c811550VsX = this.LJFF;
        synchronized (c811550VsX) {
            try {
                queue = c811550VsX.LIZIZ;
                if (queue != null) {
                    c811550VsX.LIZIZ = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (queue != null) {
            Iterator<C1267204xa<?>> it2 = queue.iterator();
            while (it2.hasNext()) {
                c811550VsX.LIZLLL(it2.next());
            }
        }
    }

    public C818970WAt(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        C811550VsX c811550VsX = new C811550VsX(executor);
        this.LJFF = c811550VsX;
        this.LJII = componentRegistrarProcessor;
        ArrayList<C0WBP> arrayList = new ArrayList();
        arrayList.add(C0WBP.LIZIZ(c811550VsX, C811550VsX.class, InterfaceC811540VsW.class, InterfaceC795440VIg.class));
        arrayList.add(C0WBP.LIZIZ(this, C0WB5.class, new Class[0]));
        for (Object obj : (ArrayList) collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) iterable).iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.LIZLLL = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            try {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    try {
                        ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC812380Vts) it3.next()).get();
                        if (componentRegistrar != null) {
                            arrayList.addAll(this.LJII.processRegistrar(componentRegistrar));
                            it3.remove();
                        }
                    } catch (C819010WAx e) {
                        TryCatchGuardChecker.doCheck(e);
                        it3.remove();
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object[] array = ((C0WBP) it4.next()).LIZ.toArray();
                    int length = array.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Object obj2 = array[i];
                            if (obj2.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                                if (((HashSet) this.LJ).contains(obj2.toString())) {
                                    it4.remove();
                                    break;
                                }
                                ((HashSet) this.LJ).add(obj2.toString());
                            }
                            i++;
                        }
                    }
                }
                if (((HashMap) this.LIZ).isEmpty()) {
                    C0WBB.LIZ(arrayList);
                } else {
                    ArrayList arrayList4 = new ArrayList(((HashMap) this.LIZ).keySet());
                    arrayList4.addAll(arrayList);
                    C0WBB.LIZ(arrayList4);
                }
                for (final C0WBP c0wbp : arrayList) {
                    ((HashMap) this.LIZ).put(c0wbp, new C818870WAj(new InterfaceC812380Vts() { // from class: X.0WBL
                        @Override // X.InterfaceC812380Vts
                        public final Object get() {
                            C818970WAt c818970WAt = this.LIZ;
                            C0WBP c0wbp2 = c0wbp;
                            c818970WAt.getClass();
                            return c0wbp2.LJ.LIZ(new C0WBH(c0wbp2, c818970WAt));
                        }
                    }));
                }
                arrayList3.addAll(LJIIIIZZ(arrayList));
                arrayList3.addAll(LJIIIZ());
                LJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.LJI.get();
        if (bool != null) {
            LJ(this.LIZ, bool.booleanValue());
        }
    }
}
