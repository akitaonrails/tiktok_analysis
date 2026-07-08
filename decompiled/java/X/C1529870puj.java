package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0puj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529870puj {
    public static final C1529870puj LIZ = new C1529870puj();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<C1537480q70>> LJI = new ConcurrentHashMap<>();

    public static Map LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(LIZJ);
        return linkedHashMap;
    }

    public static Map LIZLLL() {
        return C2097608Jq.LJIIL(LIZIZ, LIZLLL);
    }

    public static void LJII() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        Map<String, InterfaceC1537420q6u> map = C1161970gLL.LIZIZ().LIZJ;
        int i = C1535630q41.LJIJJ;
        if (i > 0) {
            if (!(map instanceof ConcurrentHashMap)) {
                C1532760pzO.LIZIZ(C1532920pze.LIZJ, "SWEEP", "sweep", "settings fail", null, null, 48);
                return;
            }
            for (Map.Entry<String, WeakReference<C1537480q70>> entry : LJI.entrySet()) {
                if (entry.getValue().get() == null) {
                    LJI.remove(entry.getKey());
                    C1529830puf c1529830puf = C1537480q70.Companion;
                    String key = entry.getKey();
                    c1529830puf.getClass();
                    ((ConcurrentHashMap) map).remove(C1529830puf.LIZ(key));
                }
            }
            C1532960pzi.LIZJ(i, new Runnable() { // from class: X.0TRf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("KitViewManager@3fea.sweep$2");
                    try {
                        C1529870puj.LIZ.getClass();
                        C1529870puj.LJII();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("KitViewManager@3fea.sweep$2");
                }
            });
        }
    }

    public static void LIZ(C1537480q70 c1537480q70) {
        LJI.put(c1537480q70.containerId, new WeakReference<>(c1537480q70));
    }

    public static void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        EnumC1067640dtC type;
        if (interfaceC1541990qEH != null) {
            String str = interfaceC1541990qEH.getHybridContext().containerId;
            InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (type = interfaceC1531560pxS.getType()) != null) {
                int i = C1067770dtP.LIZ[type.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LJFF.put(str, new WeakReference<>(interfaceC1541990qEH));
                            return;
                        }
                        return;
                    }
                    LIZJ.put(str, new WeakReference<>(interfaceC1541990qEH));
                    return;
                }
                LIZIZ.put(str, new WeakReference<>(interfaceC1541990qEH));
            }
        }
    }

    public static C1537480q70 LJ(String str) {
        WeakReference<C1537480q70> weakReference = LJI.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC1541990qEH LJFF(java.lang.String r3) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.0qEH>> r1 = X.C1529870puj.LIZJ
            java.lang.Object r0 = r1.get(r3)
            r2 = 0
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            X.0qEH r0 = (X.InterfaceC1541990qEH) r0
        L17:
            if (r0 != 0) goto L69
        L19:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.0qEH>> r1 = X.C1529870puj.LJ
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L2f
            java.lang.Object r2 = r0.get()
            X.0qEH r2 = (X.InterfaceC1541990qEH) r2
        L2f:
            return r2
        L30:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.0qEH>> r0 = X.C1529870puj.LIZLLL
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L2f
            java.lang.Object r2 = r0.get()
            X.0qEH r2 = (X.InterfaceC1541990qEH) r2
            return r2
        L41:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.0qEH>> r1 = X.C1529870puj.LIZIZ
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L58
            java.lang.Object r0 = r1.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            X.0qEH r0 = (X.InterfaceC1541990qEH) r0
            goto L17
        L58:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.0qEH>> r0 = X.C1529870puj.LJFF
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            X.0qEH r0 = (X.InterfaceC1541990qEH) r0
            goto L17
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529870puj.LJFF(java.lang.String):X.0qEH");
    }

    public static void LJI(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (interfaceC1541990qEH == null || Intrinsics.LJFF(interfaceC1541990qEH, LJFF(str))) {
            LIZIZ.remove(str);
            LIZJ.remove(str);
            LIZLLL.remove(str);
            LJ.remove(str);
            LJFF.remove(str);
            LJI.remove(str);
        }
    }
}
