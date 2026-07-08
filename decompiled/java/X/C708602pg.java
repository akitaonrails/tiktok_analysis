package X;

/* JADX INFO: renamed from: X.02pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C708602pg {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000b, B:8:0x0011, B:10:0x0022, B:12:0x0026, B:21:0x0036, B:23:0x003a, B:24:0x003e, B:29:0x0048, B:32:0x004f), top: B:40:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.DeclarationPayload LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = 0
            java.util.List r0 = r8.getDeclarationInfo()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L2b
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        Lb:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L29
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L53
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.DeclarationInfoStruct r0 = (com.ss.android.ugc.aweme.feed.model.DeclarationInfoStruct) r0     // Catch: java.lang.Throwable -> L53
            int r1 = r0.option     // Catch: java.lang.Throwable -> L53
            com.ss.android.ugc.aweme.feed.model.DeclarationOption r0 = com.ss.android.ugc.aweme.feed.model.DeclarationOption.DATE_LOC     // Catch: java.lang.Throwable -> L53
            int r0 = r0.getServerValue()     // Catch: java.lang.Throwable -> L53
            if (r1 != r0) goto Lb
        L22:
            com.ss.android.ugc.aweme.feed.model.DeclarationInfoStruct r2 = (com.ss.android.ugc.aweme.feed.model.DeclarationInfoStruct) r2     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L2b
            com.ss.android.ugc.aweme.feed.model.DeclarationPayload r1 = r2.payload     // Catch: java.lang.Throwable -> L53
            goto L2c
        L29:
            r2 = r7
            goto L22
        L2b:
            r1 = r7
        L2c:
            r5 = 0
            if (r1 == 0) goto L31
            goto L36
        L31:
            r3 = 0
            if (r1 == 0) goto L42
            goto L3e
        L36:
            java.lang.Long r0 = r1.date     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L31
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L53
        L3e:
            java.lang.String r2 = r1.location     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L44
        L42:
            java.lang.String r2 = ""
        L44:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L4f
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L53
            if (r0 > 0) goto L4f
            r1 = r7
        L4f:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L53
            goto L5f
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L66
            r7 = r1
        L66:
            com.ss.android.ugc.aweme.feed.model.DeclarationPayload r7 = (com.ss.android.ugc.aweme.feed.model.DeclarationPayload) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C708602pg.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.DeclarationPayload");
    }
}
