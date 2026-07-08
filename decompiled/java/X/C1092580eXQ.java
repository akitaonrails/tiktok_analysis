package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092580eXQ {
    public static final Map<String, List<WeakReference<InterfaceC1092590eXR>>> LIZ = new LinkedHashMap();
    public static final Map<String, Object> LIZIZ = new LinkedHashMap();
    public static final Object LIZJ = new Object();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:4:0x0003, B:6:0x0010, B:8:0x001a, B:10:0x0020, B:11:0x0024, B:13:0x002a, B:15:0x003a, B:16:0x0049, B:18:0x0055, B:19:0x0058, B:20:0x0064, B:22:0x0070, B:23:0x0078, B:24:0x0088), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r5, X.InterfaceC1092590eXR r6) {
        /*
            java.lang.Object r4 = X.C1092580eXQ.LIZJ
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<X.0eXR>>> r3 = X.C1092580eXQ.LIZ     // Catch: java.lang.Throwable -> Laa
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> Laa
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L88
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r1 = r3.get(r5)     // Catch: java.lang.Throwable -> Laa
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L64
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L64
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Laa
        L24:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L64
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Laa
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Laa
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L24
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "registerSubscriber fail,have already registered: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Laa
            r1.append(r6)     // Catch: java.lang.Throwable -> Laa
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Laa
        L49:
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<X.0eXR>>> r0 = X.C1092580eXQ.LIZ     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Laa
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L58
            r0.size()     // Catch: java.lang.Throwable -> Laa
        L58:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1092580eXQ.LIZIZ     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Laa
            r6.LIZLLL(r0, r5)     // Catch: java.lang.Throwable -> Laa
            goto La8
        L64:
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<X.0eXR>>> r0 = X.C1092580eXQ.LIZ     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> Laa
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L78
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Laa
            r1.add(r0)     // Catch: java.lang.Throwable -> Laa
        L78:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "registerSubscriber: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Laa
            r1.append(r6)     // Catch: java.lang.Throwable -> Laa
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Laa
            goto L49
        L88:
            java.lang.ref.WeakReference[] r1 = new java.lang.ref.WeakReference[r0]     // Catch: java.lang.Throwable -> Laa
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Laa
            r1[r2] = r0     // Catch: java.lang.Throwable -> Laa
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r1)     // Catch: java.lang.Throwable -> Laa
            r3.put(r5, r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "registerSubscriber: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Laa
            r1.append(r6)     // Catch: java.lang.Throwable -> Laa
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Laa
            goto L49
        La8:
            monitor-exit(r4)
            return
        Laa:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092580eXQ.LIZ(java.lang.String, X.0eXR):void");
    }

    public static void LIZIZ(Object obj, String str) {
        synchronized (LIZJ) {
            try {
                LIZIZ.put(str, obj);
                List list = (List) ((LinkedHashMap) LIZ).get(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1092590eXR interfaceC1092590eXR = (InterfaceC1092590eXR) ((WeakReference) it2.next()).get();
                        if (interfaceC1092590eXR != null) {
                            interfaceC1092590eXR.LIZLLL(obj, str);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(String str, InterfaceC1092590eXR interfaceC1092590eXR) {
        synchronized (LIZJ) {
            try {
                List list = (List) ((LinkedHashMap) LIZ).get(str);
                if (list != null) {
                    C19719612Di.LJJIIJ(list, new AwS596S0100000_17(interfaceC1092590eXR, 685), true);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregisterSubscriber: ");
                sbLIZ.append(interfaceC1092590eXR);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
