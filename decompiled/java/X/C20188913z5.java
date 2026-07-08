package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.13z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20188913z5 {
    public static final long LIZ(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final X.C1852730yJT LIZIZ(android.content.Context r8, java.lang.String r9) {
        /*
            r1 = 0
            java.lang.String r0 = "content://"
            boolean r1 = kotlin.text.u.LJJIIJZLJL(r9, r0, r1)
            java.lang.String r7 = "image/*"
            r0 = 1
            if (r1 == 0) goto L83
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r9)
            if (r8 != 0) goto L1e
            X.0yJT r0 = new X.0yJT
            java.lang.String r3 = "image/*"
            r1 = 0
            r4 = 0
            r5 = r4
            r0.<init>(r1, r3, r4, r5)
            return r0
        L1e:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r3.inJustDecodeBounds = r0
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L6b
            java.io.InputStream r2 = X.C09NT.LJ(r0, r5)     // Catch: java.lang.Throwable -> L6b
            r4 = 0
            if (r2 == 0) goto L47
            android.graphics.BitmapFactory.decodeStream(r2, r4, r3)     // Catch: java.lang.Throwable -> L34
            goto L44
        L34:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            r4 = r1
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            X.C2107108Nh.LIZ(r2, r4)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L44:
            X.C2107108Nh.LIZ(r2, r4)     // Catch: java.lang.Throwable -> L6b
        L47:
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = X.C09NT.LIZIZ(r1, r5, r0)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6f
            long r5 = r2.getLength()     // Catch: java.lang.Throwable -> L5b
            X.C2107108Nh.LIZ(r2, r4)     // Catch: java.lang.Throwable -> L6b
            goto L71
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            r4 = r1
            goto L64
        L63:
            r0 = move-exception
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            X.C2107108Nh.LIZ(r2, r4)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6f:
            r5 = 0
        L71:
            java.lang.String r0 = r3.outMimeType
            if (r0 == 0) goto L76
            r7 = r0
        L76:
            int r0 = r3.outWidth
            float r9 = (float) r0
            int r0 = r3.outHeight
            float r8 = (float) r0
            X.0yJT r0 = new X.0yJT
            r4 = r0
            r4.<init>(r5, r7, r8, r9)
            return r0
        L83:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r0
            android.graphics.BitmapFactory.decodeFile(r9, r1)
            java.lang.String r0 = r1.outMimeType
            if (r0 == 0) goto L92
            r7 = r0
        L92:
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r9)
            long r5 = r0.length()
            int r0 = r1.outWidth
            float r9 = (float) r0
            int r0 = r1.outHeight
            float r8 = (float) r0
            X.0yJT r0 = new X.0yJT
            r4 = r0
            r4.<init>(r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20188913z5.LIZIZ(android.content.Context, java.lang.String):X.0yJT");
    }

    public static final boolean LIZJ(TakoImageUploadAuthConfig takoImageUploadAuthConfig, Integer num) throws ParseException {
        int iIntValue;
        if (takoImageUploadAuthConfig == null || takoImageUploadAuthConfig.sessionToken.length() == 0 || takoImageUploadAuthConfig.accessKeyId.length() == 0 || takoImageUploadAuthConfig.secretAccessKey.length() == 0 || takoImageUploadAuthConfig.domain.length() == 0 || takoImageUploadAuthConfig.serviceId.length() == 0) {
            return false;
        }
        long jLIZ = LIZ(takoImageUploadAuthConfig.expiredTime);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 30000;
        }
        if (jCurrentTimeMillis > jLIZ - ((long) iIntValue)) {
            return false;
        }
        return true;
    }
}
