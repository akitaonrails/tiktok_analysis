package X;

/* JADX INFO: renamed from: X.09MX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MX {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x00b3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r10, int r11, android.graphics.Bitmap r12) {
        /*
            int r7 = r12.getWidth()
            int r6 = r12.getHeight()
            double r4 = (double) r7
            double r0 = (double) r10
            double r4 = r4 / r0
            double r2 = (double) r6
            double r0 = (double) r11
            double r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 <= 0) goto L48
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L48
            int r0 = r12.getHeight()
            double r0 = (double) r0
            double r0 = r0 / r4
        L1e:
            int r11 = (int) r0
        L1f:
            r0 = 1
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r12, r10, r11, r0)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MMdd_HHmmss"
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r2.<init>(r1, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r2.format(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Dou_fsm_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r4 = 0
            goto L71
        L48:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L58
            int r0 = r12.getWidth()
            double r0 = (double) r0
            double r0 = r0 / r2
            int r10 = (int) r0
            goto L1f
        L58:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6e
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6e
            int r0 = r12.getWidth()
            double r0 = (double) r0
            double r0 = r0 / r4
            int r10 = (int) r0
            int r0 = r12.getHeight()
            double r0 = (double) r0
            double r0 = r0 / r2
            goto L1e
        L6e:
            r10 = r7
            r11 = r6
            goto L1f
        L71:
            X.08m6 r1 = new X.08m6     // Catch: java.lang.Exception -> L7d
            X.09MY r0 = X.C09MY.CACHE     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = r0.getToken()     // Catch: java.lang.Exception -> L7d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7d
            goto L87
        L7d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.03xw r0 = X.EnumC1014603xw.UNKNOWN_ERR
            X.C1019103yf.LIZ(r0, r1, r4)
            r1 = r4
        L87:
            if (r1 != 0) goto L8d
            r3 = r4
        L8a:
            if (r3 != 0) goto L94
            return r4
        L8d:
            java.lang.String r0 = ".jpg"
            java.io.File r3 = java.io.File.createTempFile(r2, r0, r1)
            goto L8a
        L94:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lb3
            X.0VSV r0 = new X.0VSV     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Lb0
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb0
            r2.flush()     // Catch: java.lang.Throwable -> Lb0
            X.C1319770kRr.LIZJ(r2)
            java.lang.String r0 = r3.getAbsolutePath()
            return r0
        Lb0:
            r0 = move-exception
            r4 = r2
            goto Lb4
        Lb3:
            r0 = move-exception
        Lb4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb3
            X.C1319770kRr.LIZJ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09MX.LIZ(int, int, android.graphics.Bitmap):java.lang.String");
    }
}
