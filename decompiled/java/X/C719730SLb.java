package X;

/* JADX INFO: renamed from: X.0SLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719730SLb {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.Object r5) {
        /*
            r1 = 1
            if (r4 == 0) goto L17
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r4)
            if (r0 != r1) goto L17
            java.util.List<java.lang.ref.WeakReference<kotlin.jvm.functions.Function0<java.lang.String>>> r1 = X.C719720SLa.LIZ
            monitor-enter(r1)
            java.util.List r4 = X.C13LP.LLIIII(r1)     // Catch: java.lang.Throwable -> L11
            goto L1a
        L11:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            throw r0
        L17:
            java.lang.String r1 = ""
            goto L46
        L1a:
            monitor-exit(r1)
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r3 = 0
            if (r0 < 0) goto L3c
        L24:
            int r2 = r0 + (-1)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 != 0) goto L4f
            r3 = 1
        L35:
            if (r2 >= 0) goto L4d
            if (r3 == 0) goto L3c
            X.C719720SLa.LIZ()
        L3c:
            java.lang.String r1 = ""
        L3e:
            int r0 = r1.length()
            if (r0 != 0) goto L46
            java.lang.String r1 = "original"
        L46:
            int r0 = r1.length()
            if (r0 != 0) goto L5d
            return
        L4d:
            r0 = r2
            goto L24
        L4f:
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L35
            if (r3 == 0) goto L3e
            X.C719720SLa.LIZ()
            goto L3e
        L5d:
            boolean r0 = r5 instanceof X.AbstractC1386130mAt
            if (r0 == 0) goto L69
            X.0mAt r5 = (X.AbstractC1386130mAt) r5
            java.lang.String r0 = "photo_view_status"
            r5.LJ(r0, r1)
        L68:
            return
        L69:
            boolean r0 = r5 instanceof X.C2344009Gk
            if (r0 == 0) goto L68
            X.09Gk r5 = (X.C2344009Gk) r5
            java.lang.String r0 = "photo_view_status"
            r5.LJFF(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719730SLb.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):void");
    }
}
