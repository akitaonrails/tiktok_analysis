package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08Nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108408Nu {
    public static HashMap<Class<?>, HashMap<String, ?>> LIZIZ;
    public static boolean LJ;
    public static final C2108408Nu LIZ = new C2108408Nu();
    public static final ConcurrentHashMap<Class<?>, Object> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class<?>, InterfaceC2108608Nw> LIZLLL = new ConcurrentHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r0 = r5.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r0.length() == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        LIZJ(r1, r5.getName(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        X.C786410Ut5.LJJZZIII(new com.bytedance.bpea.transmit.delegate.BPEAHandler(android.os.Looper.getMainLooper()), new Y.ARunnableS103S0100000_3(r5, 174));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        X.C2108408Nu.LIZJ.put(r1, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.Class<?> r8) {
        /*
            r7 = this;
            java.lang.Class[] r4 = r8.getInterfaces()
            int r3 = r4.length
            r2 = 0
        L6:
            if (r2 >= r3) goto L9f
            r1 = r4[r2]
            java.lang.Class<X.08Nv> r0 = X.InterfaceC2108508Nv.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1d
            r2 = 1
            if (r1 == 0) goto L9f
            java.lang.Class<X.08Nu> r0 = X.C2108408Nu.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            monitor-enter(r7)
            goto L20
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            java.lang.Class<X.08Nu> r0 = X.C2108408Nu.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L95
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L34
            boolean r0 = X.C2108408Nu.LJ     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L32
            monitor-exit(r7)
            return
        L32:
            X.C2108408Nu.LJ = r2     // Catch: java.lang.Throwable -> L95
        L34:
            java.lang.Class<X.08Nv> r0 = X.InterfaceC2108508Nv.class
            java.util.ServiceLoader r0 = X.C786410Ut5.o4(r0, r1)     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L95
        L3e:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L99
            java.lang.Object r5 = r6.next()     // Catch: java.lang.Throwable -> L95
            X.08Nv r5 = (X.InterfaceC2108508Nv) r5     // Catch: java.lang.Throwable -> L95
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.Class[] r4 = r0.getInterfaces()     // Catch: java.lang.Throwable -> L95
            int r3 = r4.length     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L54:
            if (r2 >= r3) goto L9e
            r1 = r4[r2]     // Catch: java.lang.Throwable -> L95
            java.lang.Class<X.08Nv> r0 = X.InterfaceC2108508Nv.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L95
            r0 = r0 ^ 1
            if (r0 == 0) goto L63
            goto L66
        L63:
            int r2 = r2 + 1
            goto L54
        L66:
            if (r1 == 0) goto L9e
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L95
            r7.LIZJ(r1, r0, r5)     // Catch: java.lang.Throwable -> L95
        L7b:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = new com.bytedance.bpea.transmit.delegate.BPEAHandler     // Catch: java.lang.Throwable -> L95
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L95
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L95
            Y.ARunnableS103S0100000_3 r1 = new Y.ARunnableS103S0100000_3     // Catch: java.lang.Throwable -> L95
            r0 = 174(0xae, float:2.44E-43)
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L95
            X.C786410Ut5.LJJZZIII(r2, r1)     // Catch: java.lang.Throwable -> L95
            goto L3e
        L8f:
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Object> r0 = X.C2108408Nu.LIZJ     // Catch: java.lang.Throwable -> L95
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L95
            goto L7b
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r7)
            return
        L9b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L9e:
            monitor-exit(r7)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2108408Nu.LIZ(java.lang.Class):void");
    }

    public final <T> T LIZIZ(Class<T> cls) {
        ConcurrentHashMap<Class<?>, InterfaceC2108608Nw> concurrentHashMap;
        InterfaceC2108608Nw interfaceC2108608Nw;
        LIZ(cls);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap2 = LIZJ;
        Object obj = concurrentHashMap2.get(cls);
        Object objCreate = null;
        if (obj == null) {
            obj = (T) null;
        }
        if (obj == null) {
            synchronized (concurrentHashMap2) {
                try {
                    Object obj2 = concurrentHashMap2.get(cls);
                    if (obj2 != null) {
                        objCreate = obj2;
                    }
                    if (objCreate == null && (interfaceC2108608Nw = (concurrentHashMap = LIZLLL).get(cls)) != null) {
                        objCreate = interfaceC2108608Nw.create();
                        if (objCreate != null) {
                            concurrentHashMap2.put(cls, objCreate);
                        }
                        concurrentHashMap.remove(cls);
                    }
                    obj = (T) objCreate;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (T) obj;
    }

    public final synchronized void LIZJ(Class cls, String str, InterfaceC2108508Nv interfaceC2108508Nv) {
        if (str != null) {
            if (str.length() != 0) {
                if (LIZIZ == null) {
                    LIZIZ = new HashMap<>();
                }
                HashMap<String, ?> map = LIZIZ.get(cls);
                if (map == null) {
                    map = new HashMap<>();
                    LIZIZ.put(cls, map);
                }
                map.put(str, interfaceC2108508Nv);
                return;
            }
        }
        LIZJ.put(cls, interfaceC2108508Nv);
    }
}
