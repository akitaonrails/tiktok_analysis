package X;

/* JADX INFO: renamed from: X.010V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010V {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri LIZ(java.lang.String r3) {
        /*
            r2 = 1
            if (r3 == 0) goto Ld
            int r0 = r3.length()
            if (r0 == 0) goto Ld
            r0 = 0
        La:
            if (r0 != 0) goto L26
            goto Lf
        Ld:
            r0 = 1
            goto La
        Lf:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "content"
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.getScheme()     // Catch: java.lang.Exception -> L22
        L1b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L22
            goto L28
        L20:
            r0 = 0
            goto L1b
        L22:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L26:
            r2 = 0
            goto L2a
        L28:
            if (r0 == 0) goto L26
        L2a:
            if (r2 == 0) goto L31
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)
            return r0
        L31:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "file://"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010V.LIZ(java.lang.String):android.net.Uri");
    }
}
