package X;

/* JADX INFO: renamed from: X.090t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23033090t {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LIZ(android.content.Context r8, android.net.Uri r9) throws java.lang.Throwable {
        /*
            r6 = 0
            boolean r0 = X.C2400409as.LJIIIZ(r8, r9)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L62
            if (r0 != 0) goto L8
            return r6
        L8:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L62
            r7 = 1
            r0.inJustDecodeBounds = r7     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L62
            java.io.InputStream r5 = X.C09N1.LJFF(r8, r9)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L62
            android.graphics.BitmapFactory.decodeStream(r5, r6, r0)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r5.close()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            int r4 = r0.outWidth     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            int r3 = r0.outHeight     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r2 = 1
        L1f:
            int r0 = r4 / 2
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 >= r1) goto L42
            int r0 = r3 / 2
            if (r0 >= r1) goto L42
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r1.inSampleSize = r2     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r1.inPurgeable = r7     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r1.inPreferredConfig = r0     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            java.io.InputStream r5 = X.C09N1.LJFF(r8, r9)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5, r6, r1)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            r5.close()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5c
            goto L49
        L42:
            int r4 = r4 / 2
            int r3 = r3 / 2
            int r2 = r2 * 2
            goto L1f
        L49:
            return r0
        L4a:
            r0 = move-exception
            goto L4e
        L4c:
            r0 = move-exception
            r5 = r6
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.lang.Exception -> L57
            return r6
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5b:
            return r6
        L5c:
            r1 = move-exception
            r6 = r5
        L5e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r1 = move-exception
            goto L5e
        L64:
            if (r6 == 0) goto L6e
            r6.close()     // Catch: java.lang.Exception -> L6a
            throw r1
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23033090t.LIZ(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }
}
