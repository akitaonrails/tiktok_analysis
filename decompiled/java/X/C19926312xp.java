package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19926312xp {
    public static volatile C19926312xp LIZIZ;
    public static final C19926312xp LIZJ = new C19926312xp(0);
    public final Map<C19930712yX, C19925512xh<?, ?>> LIZ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0015, B:17:0x0033, B:15:0x002e, B:16:0x0031, B:18:0x0035), top: B:27:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19926312xp LIZ() {
        /*
            java.lang.Class<?> r0 = X.C19915512w5.LIZ
            X.12xp r0 = X.C19926312xp.LIZIZ
            if (r0 != 0) goto L3d
            java.lang.Class<X.12xp> r5 = X.C19926312xp.class
            monitor-enter(r5)
            X.12xp r0 = X.C19926312xp.LIZIZ     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L35
            java.lang.String r3 = "getEmptyRegistry"
            java.lang.Class<?> r2 = X.C1126804aw.LIZ     // Catch: java.lang.Throwable -> L37
            r4 = 0
            if (r2 == 0) goto L31
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            java.lang.String r0 = "dzBzEgU1UM3QUBkxVx2QaW1CwM1E7Lkc3f6t7PBX4Z8pvAF38YJSaH0iXVc="
            r1.<init>(r0, r4)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            java.lang.Object r0 = X.C2204961BRm.a0(r3, r4, r2, r1)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            X.12xp r0 = (X.C19926312xp) r0     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L37
            if (r0 == 0) goto L31
            goto L33
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
        L31:
            X.12xp r0 = X.C19926312xp.LIZJ     // Catch: java.lang.Throwable -> L37
        L33:
            X.C19926312xp.LIZIZ = r0     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            return r0
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19926312xp.LIZ():X.12xp");
    }

    public C19926312xp() {
        this.LIZ = new HashMap();
    }

    public C19926312xp(C19926312xp c19926312xp) {
        if (c19926312xp == LIZJ) {
            this.LIZ = Collections.emptyMap();
        } else {
            this.LIZ = Collections.unmodifiableMap(c19926312xp.LIZ);
        }
    }

    public C19926312xp(int i) {
        this.LIZ = Collections.emptyMap();
    }
}
