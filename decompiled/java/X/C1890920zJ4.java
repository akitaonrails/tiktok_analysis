package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0zJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890920zJ4 {
    public static final C1890920zJ4 LIZ = new C1890920zJ4();
    public static final ConcurrentHashMap<String, InterfaceC1890940zJ6> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r5, X.C1890930zJ5 r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onBannerClick, item: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", routeUrl: "
            r1.append(r0)
            r1.append(r7)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 4
            X.C319370CfX.LIZ(r6, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0zJ6> r1 = X.C1890920zJ4.LIZIZ
            java.lang.String r0 = r6.LL
            java.lang.Object r4 = r1.get(r0)
            X.0zJ6 r4 = (X.InterfaceC1890940zJ6) r4
            if (r4 == 0) goto L89
            X.062Z r3 = new X.062Z
            java.lang.String r2 = r6.LL
            java.lang.String r1 = r6.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLJJIJI
            if (r0 != 0) goto L37
            r0 = 641(0x281, float:8.98E-43)
            kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
        L37:
            r3.<init>(r2, r1, r0)
            r4.LIZIZ(r5, r3, r7)
        L3d:
            java.lang.String r1 = r6.LLJILLL
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLJJIJI
            if (r0 == 0) goto L4e
            r0.invoke()
        L4e:
            java.lang.String r1 = r6.LL
            X.06O1 r0 = X.C06O1.CLICK
            X.C1599206Ny.LIZLLL(r1, r0)
            X.0Htx r4 = X.C455710Htx.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LLJJI
            if (r0 == 0) goto L9d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L68:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L68
        L89:
            android.app.Activity r0 = X.C1388190mED.LIZ(r5)
            if (r0 == 0) goto L3d
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r5, r7)
            r0.open()
            goto L3d
        L97:
            java.util.Map r2 = X.C2097608Jq.LJIILLIIL(r5)
            if (r2 != 0) goto La1
        L9d:
            java.util.Map r2 = X.C2097608Jq.LJ()
        La1:
            java.lang.String r1 = r6.LL
            X.06O1 r0 = X.C06O1.SHOW
            int r0 = X.C1599206Ny.LIZ(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "click"
            X.C455710Htx.LIZIZ(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1890920zJ4.LIZ(android.content.Context, X.0zJ5, java.lang.String):void");
    }
}
