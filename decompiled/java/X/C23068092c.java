package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.092c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23068092c {
    public static String LIZ(String str) throws Throwable {
        System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        Throwable th = null;
        try {
            gZIPOutputStream.write(str.getBytes(Charsets.UTF_8));
            C2107108Nh.LIZ(gZIPOutputStream, null);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(gZIPOutputStream, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0039
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZIZ(java.lang.String r4) {
        /*
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L41
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.Exception -> L41
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L41
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L41
            r0.<init>(r2)     // Catch: java.lang.Exception -> L41
            r1.<init>(r0)     // Catch: java.lang.Exception -> L41
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L41
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L41
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L41
            boolean r0 = r3 instanceof java.io.BufferedReader     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L20
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Exception -> L41
            goto L28
        L20:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L41
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L41
            r3 = r1
        L28:
            r2 = 0
            java.lang.String r0 = X.C08KC.LIZJ(r3)     // Catch: java.lang.Throwable -> L31
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L41
            return r0
        L31:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            r2 = r1
            goto L3a
        L39:
            r0 = move-exception
        L3a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L39
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L41
            throw r0     // Catch: java.lang.Exception -> L41
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23068092c.LIZIZ(java.lang.String):java.lang.String");
    }

    public static boolean LIZJ(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode.length >= 2 && (bArrDecode[0] & 255) == 31) {
                if ((bArrDecode[1] & 255) == 139) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
