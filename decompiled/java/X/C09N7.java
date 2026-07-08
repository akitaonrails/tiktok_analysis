package X;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.09N7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N7 {
    public static final List<String> LIZ = Arrays.asList("com.kuaishou.nebula.fileprovider", "com.kwai.videoeditor.kyfileprovider", "com.lemon.lvoverseas.provider", "com.lwcx.lw121.fileprovider", "com.zivn.cloudbrush3.utilcode.provider", "com.tencent.mtt.fileprovider", "com.campmobile.snowcamera.fileprovider", "com.android.fileexplorer.myprovider", "com.ifeimo.videoeditor.provider", "com.mi.android.globalFileexplorer.myprovider");
    public static final List<String> LIZIZ = Arrays.asList("com.jk.cutout.application", "com.zone2345.fileprovider", "com.mobile.kadian.fileprovider");

    public static String LIZIZ(Context context, Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        C0VSP c0vsp;
        BufferedInputStream bufferedInputStream;
        C0VSJ c0vsj;
        BufferedOutputStream bufferedOutputStream2;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(context.getContentResolver(), uri, "r");
        C0VSP c0vsp2 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        if (parcelFileDescriptorLIZLLL == null) {
            return null;
        }
        try {
            c0vsp = new C0VSP(parcelFileDescriptorLIZLLL.getFileDescriptor());
            try {
                bufferedInputStream = new BufferedInputStream(c0vsp);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri.getPath().substring(uri.getPath().lastIndexOf("/")));
                sbLIZ.append(".jpg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VSJ c0vsj2 = new C0VSJ(C786410Ut5.w2(context), "uritemp");
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                c0vsj = new C0VSJ(c0vsj2, strLIZIZ);
                bufferedOutputStream2 = new BufferedOutputStream(new C0VSV(c0vsj));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    bufferedOutputStream2.write(bArr, 0, i);
                } else {
                    c0vsp.close();
                    bufferedOutputStream2.close();
                    return c0vsj.getAbsolutePath();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream3 = bufferedOutputStream2;
            bufferedOutputStream = bufferedOutputStream3;
            c0vsp2 = c0vsp;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (c0vsp2 != null) {
                c0vsp2.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            java.lang.String r2 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            r8 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            X.0WZX r9 = new X.0WZX     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKretw+PPS4ubr1DJXpS7zBmPQ=="
            r9.<init>(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            r7 = r12
            r6 = r11
            r4 = r10
            android.database.Cursor r1 = X.C2204961BRm.LJJJ(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            if (r1 == 0) goto L37
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            r1.close()
            return r0
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r1 = r8
        L31:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            goto L39
        L37:
            if (r1 == 0) goto L3c
        L39:
            r1.close()
        L3c:
            return r8
        L3d:
            r0 = move-exception
            r8 = r1
        L3f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L3f
        L45:
            if (r8 == 0) goto L4a
            r8.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09N7.LIZ(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
