package X;

import com.bytedance.pumbaa.base2.interfaces.ISettingsService;
import com.bytedance.pumbaa.impl.tt.ABMockSettingsService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308480C7i {
    public static volatile ISettingsService LIZIZ;
    public static final C308480C7i LIZ = new C308480C7i();
    public static final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();
    public static final AtomicBoolean LJ = new AtomicBoolean(true);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);

    public static void LIZ() {
        Object c098200Yq;
        if (LIZIZ == null) {
            try {
                LIZIZ = ABMockSettingsService.LIZLLL();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public static final Object LIZJ(Class cls, String str) {
        Object objLIZJ;
        if (LJFF.get()) {
            return null;
        }
        AtomicBoolean atomicBoolean = LJ;
        if (atomicBoolean.get()) {
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZLLL;
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str);
            }
        }
        LIZ.getClass();
        LIZ();
        LIZJ.containsKey(str);
        ISettingsService iSettingsService = LIZIZ;
        if (iSettingsService == null || (objLIZJ = iSettingsService.LIZJ(cls, str)) == null) {
            objLIZJ = null;
        }
        if (atomicBoolean.get() && !Intrinsics.LJFF(objLIZJ, null) && objLIZJ != null) {
            LIZLLL.put(str, objLIZJ);
        }
        return objLIZJ;
    }

    public static final void LJ(Object obj, String str) {
        if (obj == null) {
            return;
        }
        LIZJ.put(str, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[PHI: r1
      0x003e: PHI (r1v2 java.lang.Object) = (r1v0 java.lang.Object), (r1v3 java.lang.Object) binds: [B:19:0x003c, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.lang.Class r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C308480C7i.LJFF
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return r5
        L9:
            java.util.concurrent.atomic.AtomicBoolean r2 = X.C308480C7i.LJ
            boolean r0 = r2.get()
            if (r0 == 0) goto L1e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = X.C308480C7i.LIZLLL
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.get(r4)
            return r0
        L1e:
            X.0C7i r0 = X.C308480C7i.LIZ
            r0.getClass()
            LIZ()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C308480C7i.LIZJ
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L31
            LJ(r5, r4)
        L31:
            com.bytedance.pumbaa.base2.interfaces.ISettingsService r0 = X.C308480C7i.LIZIZ
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r0.LIZ(r3, r4, r5)
            if (r1 != 0) goto L3e
        L3b:
            r1 = r5
            if (r5 == 0) goto L4f
        L3e:
            boolean r0 = r2.get()
            if (r0 == 0) goto L4f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 != 0) goto L4f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C308480C7i.LIZLLL
            r0.put(r4, r1)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308480C7i.LIZIZ(java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[PHI: r1
      0x003e: PHI (r1v2 java.lang.Object) = (r1v0 java.lang.Object), (r1v3 java.lang.Object) binds: [B:19:0x003c, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(java.lang.Class r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C308480C7i.LJFF
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return r5
        L9:
            java.util.concurrent.atomic.AtomicBoolean r2 = X.C308480C7i.LJ
            boolean r0 = r2.get()
            if (r0 == 0) goto L1e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = X.C308480C7i.LIZLLL
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.get(r4)
            return r0
        L1e:
            X.0C7i r0 = X.C308480C7i.LIZ
            r0.getClass()
            LIZ()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C308480C7i.LIZJ
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L31
            LJ(r5, r4)
        L31:
            com.bytedance.pumbaa.base2.interfaces.ISettingsService r0 = X.C308480C7i.LIZIZ
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r0.LIZIZ(r3, r4, r5)
            if (r1 != 0) goto L3e
        L3b:
            r1 = r5
            if (r5 == 0) goto L4f
        L3e:
            boolean r0 = r2.get()
            if (r0 == 0) goto L4f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 != 0) goto L4f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C308480C7i.LIZLLL
            r0.put(r4, r1)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308480C7i.LIZLLL(java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
