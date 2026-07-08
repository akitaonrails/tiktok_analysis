package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.088G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088G {
    public static final Set<Integer> LIZ;
    public static final Set<Integer> LIZIZ;
    public static final Object LIZJ;
    public static Set<String> LIZLLL;
    public static final Set<String> LJ;
    public static final Object LJFF;
    public static C088Y LJI;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        HashSet hashSet2 = new HashSet();
        LIZIZ = hashSet2;
        LIZJ = new Object();
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(123);
        hashSet2.add(140);
        hashSet2.add(118);
        hashSet2.add(113);
        hashSet2.add(114);
        hashSet2.add(115);
        hashSet2.add(116);
        hashSet2.add(121);
        hashSet2.add(122);
        hashSet2.add(123);
        LJ = new HashSet();
        LJFF = new Object();
        LJI = new C088Y() { // from class: X.088S
            @Override // X.C088Y
            public final boolean LIZ(String str) {
                return C088G.LIZLLL.contains(str);
            }
        };
    }

    public static void LIZ(Message message) {
        if (message == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success handle delay message ");
        sbLIZ.append(message.what);
        sbLIZ.append("!");
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0888.LIZ();
        Handler handler = (Handler) C1966607n6.LIZJ();
        synchronized (LIZJ) {
            try {
                message.arg2 = 1000089;
                handler.dispatchMessage(message);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.os.Message r5) {
        /*
            android.os.Handler r1 = r5.getTarget()
            java.lang.Object r0 = X.C1966607n6.LIZJ()
            r4 = 0
            if (r1 == r0) goto Lc
            return r4
        Lc:
            java.util.Set<java.lang.Integer> r1 = X.C088G.LIZ
            int r0 = r5.what
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L6a
            java.util.Set<java.lang.String> r0 = X.C088G.LIZLLL
            if (r0 == 0) goto L69
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            X.088I r3 = X.C088I.LIZ(r5)
            java.lang.Object r2 = X.C088G.LJFF
            monitor-enter(r2)
            int r1 = r5.what     // Catch: java.lang.Throwable -> L61
            r0 = 114(0x72, float:1.6E-43)
            if (r1 != r0) goto L46
            X.088Y r1 = X.C088G.LJI     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            boolean r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L46
            java.util.Set<java.lang.String> r1 = X.C088G.LJ     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L61
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> L61
            r1.add(r0)     // Catch: java.lang.Throwable -> L61
        L46:
            X.088Y r1 = X.C088G.LJI     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            boolean r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L5e
            java.util.Set<java.lang.String> r1 = X.C088G.LJ     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L61
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> L61
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L5e
            r0 = 0
            goto L5f
        L5e:
            r0 = 1
        L5f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            goto L67
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            throw r0
        L67:
            if (r0 != 0) goto L6a
        L69:
            r4 = 1
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C088G.LIZIZ(android.os.Message):boolean");
    }
}
