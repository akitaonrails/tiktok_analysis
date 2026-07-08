package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.08Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084508Ep {
    public static String LIZ(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #2 {all -> 0x0056, blocks: (B:6:0x0009, B:10:0x002a, B:27:0x0055, B:25:0x004b, B:26:0x004f, B:7:0x000e, B:9:0x0025, B:22:0x0045), top: B:34:0x0009, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.graphics.Bitmap r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L5a
            boolean r0 = r6.isRecycled()
            if (r0 != 0) goto L5a
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L56
            r4.<init>()     // Catch: java.lang.Throwable -> L56
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L36
            r0 = 100
            r6.compress(r1, r0, r4)     // Catch: java.lang.Throwable -> L36
            r4.flush()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L36
            byte[] r2 = r4.toByteArray()     // Catch: java.lang.Throwable -> L36
            int r0 = r2.length     // Catch: java.lang.Throwable -> L36
            if (r0 <= 0) goto L2a
            int r1 = r2.length     // Catch: java.lang.Throwable -> L36
            r0 = 0
            r3.update(r2, r0, r1)     // Catch: java.lang.Throwable -> L36
        L2a:
            r4.close()     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r3.digest()
            java.lang.String r0 = LIZ(r0)
            return r0
        L36:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L3b
            throw r2     // Catch: java.lang.Throwable -> L41
        L3b:
            r1 = move-exception
            r2 = r5
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r1 = move-exception
            goto L3d
        L43:
            if (r2 == 0) goto L4b
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r0 = move-exception
            goto L4f
        L4b:
            r4.close()     // Catch: java.lang.Throwable -> L56
            goto L55
        L4f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L56
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L56
        L55:
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2084508Ep.LIZIZ(android.graphics.Bitmap):java.lang.String");
    }

    public static String LIZJ(String str) {
        if (str.length() > 0) {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists() || !c0vsj.isFile()) {
                    return null;
                }
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                C0VSP c0vsp = new C0VSP(c0vsj);
                try {
                    byte[] bArr = new byte[1024];
                    for (int i = c0vsp.read(bArr, 0, 1024); i > 0; i = c0vsp.read(bArr, 0, 1024)) {
                        messageDigest.update(bArr, 0, i);
                    }
                    c0vsp.close();
                    return LIZ(messageDigest.digest());
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                    }
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        return null;
    }
}
