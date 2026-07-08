package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XMK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMK {
    public static final /* synthetic */ int LIZ = 0;

    public static final synchronized List LIZ(C0VSJ c0vsj, Class cls) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        try {
            C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZIZ(c0vsj));
            while (true) {
                try {
                    String strLJZ = c1496670p3B.LJZ();
                    if (strLJZ == null || strLJZ.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    Serializable serializable = (Serializable) C051M.LIZ(cls, strLJZ);
                    if (serializable != null) {
                        arrayList.add(serializable);
                    }
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
            C2107108Nh.LIZ(c1496670p3B, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            arrayList = null;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x0049, LOOP:0: B:16:0x002c->B:17:0x002e, LOOP_END, TryCatch #4 {all -> 0x0049, blocks: (B:15:0x0027, B:17:0x002e, B:18:0x0041), top: B:44:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void LIZIZ(X.C0VSJ r7, java.util.List r8) {
        /*
            java.lang.Class<X.0XMK> r6 = X.C0XMK.class
            monitor-enter(r6)
            if (r8 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            boolean r0 = r7.exists()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L17
            r7.createNewFile()     // Catch: java.io.IOException -> L11 java.lang.Throwable -> L60
            goto L17
        L11:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r6)
            return
        L17:
            X.0VSV r0 = new X.0VSV     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            r5 = 0
            r0.<init>(r7, r5)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            X.0p39 r0 = X.C1496330p2d.LIZ(r0)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            X.0p3F r4 = new X.0p3F     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            r4.<init>(r0)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            r3 = 0
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L49
            r1 = 0
        L2c:
            if (r1 >= r2) goto L41
            java.lang.Object r0 = r8.get(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = X.C051M.LJ(r0, r5)     // Catch: java.lang.Throwable -> L49
            r4.LJLLILLLL(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "\n"
            r4.LJLLILLLL(r0)     // Catch: java.lang.Throwable -> L49
            int r1 = r1 + 1
            goto L2c
        L41:
            r4.flush()     // Catch: java.lang.Throwable -> L49
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            monitor-exit(r6)
            return
        L49:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L54
        L4e:
            r0 = move-exception
            r1 = r3
        L50:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r0 = move-exception
            goto L50
        L56:
            X.C2107108Nh.LIZ(r4, r1)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L60
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r6)
            return
        L60:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XMK.LIZIZ(X.0VSJ, java.util.List):void");
    }
}
