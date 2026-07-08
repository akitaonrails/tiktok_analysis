package X;

/* JADX INFO: renamed from: X.0934, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0934 {
    public static final /* synthetic */ int LIZ = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x003a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZ(java.lang.String r5) {
        /*
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r4)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            r3.<init>(r1, r0)
            boolean r0 = r3 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L21
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)
            r3 = r1
        L21:
            r2 = 0
            r3.write(r5)     // Catch: java.lang.Throwable -> L32
            X.C2107108Nh.LIZ(r3, r2)
            byte[] r1 = r4.toByteArray()
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            return r0
        L32:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            r2 = r1
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3a
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0934.LIZ(java.lang.String):java.lang.String");
    }
}
