package X;

/* JADX INFO: renamed from: X.0935, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0935 {
    public static final /* synthetic */ int LIZ = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0029
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZ(java.io.File r4) {
        /*
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            X.0VSP r0 = new X.0VSP
            r0.<init>(r4)
            r3.<init>(r0, r1)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 != 0) goto L18
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)
            r3 = r1
        L18:
            r2 = 0
            java.lang.String r0 = X.C08KC.LIZJ(r3)     // Catch: java.lang.Throwable -> L21
            X.C2107108Nh.LIZ(r3, r2)
            return r0
        L21:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L29
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r0 = move-exception
            r2 = r1
            goto L2a
        L29:
            r0 = move-exception
        L2a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L29
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0935.LIZ(java.io.File):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0028
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(java.io.File r4, java.lang.String r5) {
        /*
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            X.0VSV r0 = new X.0VSV
            r0.<init>(r4)
            r3.<init>(r0, r1)
            boolean r0 = r3 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L18
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)
            r3 = r1
        L18:
            r2 = 0
            r3.write(r5)     // Catch: java.lang.Throwable -> L20
            X.C2107108Nh.LIZ(r3, r2)
            return
        L20:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L25
        L25:
            r0 = move-exception
            r2 = r1
            goto L29
        L28:
            r0 = move-exception
        L29:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L28
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0935.LIZIZ(java.io.File, java.lang.String):void");
    }
}
