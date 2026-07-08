package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307820C4u {
    public static final C307820C4u LIZJ = new C307820C4u();
    public static boolean LIZLLL = false;
    public final InterfaceC307670C4f LIZ;
    public final Map<String, EnumC1989007qi> LIZIZ = new ConcurrentHashMap();

    public final InterfaceC307670C4f LIZ() {
        if (!((Boolean) C0B51.LIZ.getValue()).booleanValue()) {
            return this.LIZ;
        }
        if (C307840C4w.LIZ == null) {
            C307840C4w.LIZ = this.LIZ;
        }
        return C307840C4w.LIZ;
    }

    public C307820C4u() {
        InterfaceC307670C4f interfaceC307670C4fLIZJ = C0C58.LIZJ.LIZ.LIZJ();
        if (interfaceC307670C4fLIZJ instanceof C308110C5x) {
            this.LIZ = interfaceC307670C4fLIZJ;
        } else {
            this.LIZ = new C307660C4e(interfaceC307670C4fLIZJ);
        }
    }

    public final int LIZIZ(String str) {
        if (!LIZ().contains(str)) {
            return -1;
        }
        return LIZ().getInt(str, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0016, B:15:0x003e, B:17:0x004a, B:20:0x0050, B:23:0x005a, B:25:0x0060, B:27:0x0066, B:9:0x0029, B:11:0x002f, B:13:0x0035), top: B:32:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0016, B:15:0x003e, B:17:0x004a, B:20:0x0050, B:23:0x005a, B:25:0x0060, B:27:0x0066, B:9:0x0029, B:11:0x002f, B:13:0x0035), top: B:32:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r4, java.util.Set r5, com.google.gson.n r6, java.util.Set r7) {
        /*
            r3 = this;
            com.google.gson.n r1 = r6.LJJIJ(r4)     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L26
            java.lang.String r0 = "type"
            com.google.gson.q r2 = r1.LJJIJIIJI(r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "vid"
            com.google.gson.q r1 = r1.LJJIJIIJI(r0)     // Catch: java.lang.Exception -> L6e
            if (r2 == 0) goto L27
            int r0 = r2.LJIIJJI()     // Catch: java.lang.Exception -> L6e
            java.util.Map<java.lang.String, X.07qi> r2 = r3.LIZIZ     // Catch: java.lang.Exception -> L6e
            X.07qi r0 = X.EnumC1989007qi.fromTypeValue(r0)     // Catch: java.lang.Exception -> L6e
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Exception -> L6e
            r2.put(r4, r0)     // Catch: java.lang.Exception -> L6e
            goto L3c
        L26:
            r1 = 0
        L27:
            if (r5 == 0) goto L3c
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L6e
            if (r0 != 0) goto L3c
            boolean r0 = r5.contains(r4)     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L3c
            java.util.Map<java.lang.String, X.07qi> r0 = r3.LIZIZ     // Catch: java.lang.Exception -> L6e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Exception -> L6e
            r0.remove(r4)     // Catch: java.lang.Exception -> L6e
        L3c:
            if (r1 == 0) goto L4a
            int r1 = r1.LJIIJJI()     // Catch: java.lang.Exception -> L6e
            X.0C4f r0 = r3.LIZ()     // Catch: java.lang.Exception -> L6e
            r0.LIZJ(r4, r1)     // Catch: java.lang.Exception -> L6e
            return
        L4a:
            boolean r0 = X.C307820C4u.LIZLLL     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L58
            if (r7 == 0) goto L6d
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: java.lang.Exception -> L6e
            boolean r0 = r7.contains(r4)     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L6d
        L58:
            if (r5 == 0) goto L6d
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L6e
            if (r0 != 0) goto L6d
            boolean r0 = r5.contains(r4)     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L6d
            X.0C4f r0 = r3.LIZ()     // Catch: java.lang.Exception -> L6e
            r0.LIZ(r4)     // Catch: java.lang.Exception -> L6e
        L6d:
            return
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307820C4u.LIZJ(java.lang.String, java.util.Set, com.google.gson.n, java.util.Set):void");
    }
}
