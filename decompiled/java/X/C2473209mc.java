package X;

/* JADX INFO: renamed from: X.09mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2473209mc {
    public static final /* synthetic */ int LIZ = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0027
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(android.graphics.Bitmap r4, java.lang.String r5, int r6, X.EnumC2473309md r7) {
        /*
            X.0VSV r3 = new X.0VSV
            r3.<init>(r5)
            r2 = 0
            X.09md r0 = X.EnumC2473309md.JPG     // Catch: java.lang.Throwable -> L1f
            if (r7 != r0) goto L13
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L1f
            r4.compress(r0, r6, r3)     // Catch: java.lang.Throwable -> L1f
            r3.flush()     // Catch: java.lang.Throwable -> L1f
            goto L1b
        L13:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L1f
            r4.compress(r0, r6, r3)     // Catch: java.lang.Throwable -> L1f
            r3.flush()     // Catch: java.lang.Throwable -> L1f
        L1b:
            X.C2107108Nh.LIZ(r3, r2)
            return
        L1f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            r2 = r1
            goto L28
        L27:
            r0 = move-exception
        L28:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L27
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2473209mc.LIZJ(android.graphics.Bitmap, java.lang.String, int, X.09md):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0247 A[PHI: r9
      0x0247: PHI (r9v3 int) = (r9v1 int), (r9v4 int) binds: [B:200:0x026f, B:191:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e9 A[EXC_TOP_SPLITTER, PHI: r12
      0x00e9: PHI (r12v8 android.os.ParcelFileDescriptor) = 
      (r12v9 android.os.ParcelFileDescriptor)
      (r12v10 android.os.ParcelFileDescriptor)
      (r12v11 android.os.ParcelFileDescriptor)
      (r12v11 android.os.ParcelFileDescriptor)
     binds: [B:65:0x00d2, B:76:0x00e7, B:26:0x006b, B:43:0x00a7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:252:0x0386
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(android.content.Context r15, java.lang.String r16, java.lang.String r17, int r18, X.C2473609mg r19) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2473209mc.LIZ(android.content.Context, java.lang.String, java.lang.String, int, X.09mg):kotlin.Pair");
    }
}
