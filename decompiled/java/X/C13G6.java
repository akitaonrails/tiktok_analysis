package X;

import Y.AObjectS127S0000000_30;
import Y.AObjectS165S0000000_30;
import Y.AObjectS79S0000000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13G6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13G6 {
    public static final InterfaceC1841110y0j<? extends Object> LIZ;
    public static final InterfaceC1841110y0j<Object> LIZIZ;
    public static final C13G4<? extends Object> LIZJ;
    public static final C13G4<Object> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final AObjectS127S0000000_30 aObjectS127S0000000_30 = new AObjectS127S0000000_30(7);
        boolean z = C788400UwI.LIZ;
        LIZ = z ? new C13GA(aObjectS127S0000000_30) : new InterfaceC1841110y0j<T>(aObjectS127S0000000_30) { // from class: X.13G8
            public final Function1<C13IQ<?>, C13HG<T>> LIZ;
            public final ConcurrentHashMap<Class<?>, C13G9<T>> LIZIZ = new ConcurrentHashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS127S0000000_30;
            }

            @Override // X.InterfaceC1841110y0j
            public final C13HG<T> LIZ(C13IQ<Object> c13iq) {
                C13G9<T> c13g9PutIfAbsent;
                ConcurrentHashMap<Class<?>, C13G9<T>> concurrentHashMap = this.LIZIZ;
                Class<?> clsLIZ = C09R7.LIZ(c13iq);
                C13G9<T> c13g9 = concurrentHashMap.get(clsLIZ);
                if (c13g9 == null && (c13g9PutIfAbsent = concurrentHashMap.putIfAbsent(clsLIZ, (c13g9 = new C13G9<>(this.LIZ.invoke(c13iq))))) != null) {
                    c13g9 = c13g9PutIfAbsent;
                }
                return c13g9.LIZ;
            }
        };
        final AObjectS127S0000000_30 aObjectS127S0000000_302 = new AObjectS127S0000000_30(8);
        LIZIZ = z ? new C13GA<>(aObjectS127S0000000_302) : new InterfaceC1841110y0j<T>(aObjectS127S0000000_302) { // from class: X.13G8
            public final Function1<C13IQ<?>, C13HG<T>> LIZ;
            public final ConcurrentHashMap<Class<?>, C13G9<T>> LIZIZ = new ConcurrentHashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS127S0000000_302;
            }

            @Override // X.InterfaceC1841110y0j
            public final C13HG<T> LIZ(C13IQ<Object> c13iq) {
                C13G9<T> c13g9PutIfAbsent;
                ConcurrentHashMap<Class<?>, C13G9<T>> concurrentHashMap = this.LIZIZ;
                Class<?> clsLIZ = C09R7.LIZ(c13iq);
                C13G9<T> c13g9 = concurrentHashMap.get(clsLIZ);
                if (c13g9 == null && (c13g9PutIfAbsent = concurrentHashMap.putIfAbsent(clsLIZ, (c13g9 = new C13G9<>(this.LIZ.invoke(c13iq))))) != null) {
                    c13g9 = c13g9PutIfAbsent;
                }
                return c13g9.LIZ;
            }
        };
        final AObjectS165S0000000_30 aObjectS165S0000000_30 = new AObjectS165S0000000_30(1);
        LIZJ = z ? new C13G4<T>(aObjectS165S0000000_30) { // from class: X.13GB
            public final Function2<C13IQ<Object>, List<? extends C09RO>, C13HG<T>> LIZ;
            public final C1722350uvB<C13GD<T>> LIZIZ = new C1722350uvB<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS165S0000000_30;
            }

            @Override // X.C13G4
            public final Object LIZ(C13IQ<Object> c13iq, List<? extends C09RO> list) {
                Object c098200Yq;
                C1701640uNm c1701640uNm = (C1701640uNm) this.LIZIZ.get(C09R7.LIZ(c13iq));
                Object objInvoke = c1701640uNm.reference.get();
                if (objInvoke == null) {
                    AObjectS79S0000000_30 aObjectS79S0000000_30 = new AObjectS79S0000000_30(2);
                    synchronized (c1701640uNm) {
                        objInvoke = c1701640uNm.reference.get();
                        if (objInvoke == null) {
                            objInvoke = aObjectS79S0000000_30.invoke();
                            c1701640uNm.reference = new SoftReference<>(objInvoke);
                        }
                    }
                }
                C13GD c13gd = (C13GD) objInvoke;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C09RN((C09RO) it2.next()));
                }
                ConcurrentHashMap<List<C09RN>, C189200o6<C13HG<T>>> concurrentHashMap = c13gd.LIZ;
                C189200o6<C13HG<T>> c189200o6M1boximpl = concurrentHashMap.get(arrayList);
                if (c189200o6M1boximpl == null) {
                    try {
                        c098200Yq = (C13HG) this.LIZ.invoke(c13iq, list);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C189200o6<C13HG<T>> c189200o6PutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, c189200o6M1boximpl);
                    if (c189200o6PutIfAbsent != null) {
                        c189200o6M1boximpl = c189200o6PutIfAbsent;
                    }
                }
                return c189200o6M1boximpl.m10unboximpl();
            }
        } : new C13G4<T>(aObjectS165S0000000_30) { // from class: X.13GC
            public final Function2<C13IQ<Object>, List<? extends C09RO>, C13HG<T>> LIZ;
            public final ConcurrentHashMap<Class<?>, C13GD<T>> LIZIZ = new ConcurrentHashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS165S0000000_30;
            }

            @Override // X.C13G4
            public final Object LIZ(C13IQ<Object> c13iq, List<? extends C09RO> list) {
                Object c098200Yq;
                C13GD<T> c13gdPutIfAbsent;
                ConcurrentHashMap<Class<?>, C13GD<T>> concurrentHashMap = this.LIZIZ;
                Class<?> clsLIZ = C09R7.LIZ(c13iq);
                C13GD<T> c13gd = concurrentHashMap.get(clsLIZ);
                if (c13gd == null && (c13gdPutIfAbsent = concurrentHashMap.putIfAbsent(clsLIZ, (c13gd = new C13GD<>()))) != null) {
                    c13gd = c13gdPutIfAbsent;
                }
                C13GD<T> c13gd2 = c13gd;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C09RN((C09RO) it2.next()));
                }
                ConcurrentHashMap<List<C09RN>, C189200o6<C13HG<T>>> concurrentHashMap2 = c13gd2.LIZ;
                C189200o6<C13HG<T>> c189200o6M1boximpl = concurrentHashMap2.get(arrayList);
                if (c189200o6M1boximpl == null) {
                    try {
                        c098200Yq = (C13HG) this.LIZ.invoke(c13iq, list);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C189200o6<C13HG<T>> c189200o6PutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, c189200o6M1boximpl);
                    if (c189200o6PutIfAbsent != null) {
                        c189200o6M1boximpl = c189200o6PutIfAbsent;
                    }
                }
                return c189200o6M1boximpl.m10unboximpl();
            }
        };
        final AObjectS165S0000000_30 aObjectS165S0000000_302 = new AObjectS165S0000000_30(2);
        LIZLLL = z ? new C13G4<T>(aObjectS165S0000000_302) { // from class: X.13GB
            public final Function2<C13IQ<Object>, List<? extends C09RO>, C13HG<T>> LIZ;
            public final C1722350uvB<C13GD<T>> LIZIZ = new C1722350uvB<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS165S0000000_302;
            }

            @Override // X.C13G4
            public final Object LIZ(C13IQ<Object> c13iq, List<? extends C09RO> list) {
                Object c098200Yq;
                C1701640uNm c1701640uNm = (C1701640uNm) this.LIZIZ.get(C09R7.LIZ(c13iq));
                Object objInvoke = c1701640uNm.reference.get();
                if (objInvoke == null) {
                    AObjectS79S0000000_30 aObjectS79S0000000_30 = new AObjectS79S0000000_30(2);
                    synchronized (c1701640uNm) {
                        objInvoke = c1701640uNm.reference.get();
                        if (objInvoke == null) {
                            objInvoke = aObjectS79S0000000_30.invoke();
                            c1701640uNm.reference = new SoftReference<>(objInvoke);
                        }
                    }
                }
                C13GD c13gd = (C13GD) objInvoke;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C09RN((C09RO) it2.next()));
                }
                ConcurrentHashMap<List<C09RN>, C189200o6<C13HG<T>>> concurrentHashMap = c13gd.LIZ;
                C189200o6<C13HG<T>> c189200o6M1boximpl = concurrentHashMap.get(arrayList);
                if (c189200o6M1boximpl == null) {
                    try {
                        c098200Yq = (C13HG) this.LIZ.invoke(c13iq, list);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C189200o6<C13HG<T>> c189200o6PutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, c189200o6M1boximpl);
                    if (c189200o6PutIfAbsent != null) {
                        c189200o6M1boximpl = c189200o6PutIfAbsent;
                    }
                }
                return c189200o6M1boximpl.m10unboximpl();
            }
        } : new C13G4<T>(aObjectS165S0000000_302) { // from class: X.13GC
            public final Function2<C13IQ<Object>, List<? extends C09RO>, C13HG<T>> LIZ;
            public final ConcurrentHashMap<Class<?>, C13GD<T>> LIZIZ = new ConcurrentHashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = aObjectS165S0000000_302;
            }

            @Override // X.C13G4
            public final Object LIZ(C13IQ<Object> c13iq, List<? extends C09RO> list) {
                Object c098200Yq;
                C13GD<T> c13gdPutIfAbsent;
                ConcurrentHashMap<Class<?>, C13GD<T>> concurrentHashMap = this.LIZIZ;
                Class<?> clsLIZ = C09R7.LIZ(c13iq);
                C13GD<T> c13gd = concurrentHashMap.get(clsLIZ);
                if (c13gd == null && (c13gdPutIfAbsent = concurrentHashMap.putIfAbsent(clsLIZ, (c13gd = new C13GD<>()))) != null) {
                    c13gd = c13gdPutIfAbsent;
                }
                C13GD<T> c13gd2 = c13gd;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C09RN((C09RO) it2.next()));
                }
                ConcurrentHashMap<List<C09RN>, C189200o6<C13HG<T>>> concurrentHashMap2 = c13gd2.LIZ;
                C189200o6<C13HG<T>> c189200o6M1boximpl = concurrentHashMap2.get(arrayList);
                if (c189200o6M1boximpl == null) {
                    try {
                        c098200Yq = (C13HG) this.LIZ.invoke(c13iq, list);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C189200o6<C13HG<T>> c189200o6PutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, c189200o6M1boximpl);
                    if (c189200o6PutIfAbsent != null) {
                        c189200o6M1boximpl = c189200o6PutIfAbsent;
                    }
                }
                return c189200o6M1boximpl.m10unboximpl();
            }
        };
    }
}
