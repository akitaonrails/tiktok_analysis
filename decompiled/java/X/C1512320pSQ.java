package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.0pSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512320pSQ {
    public static boolean LIZ;
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void LIZIZ(Throwable th) {
        InterfaceC1512430pSb interfaceC1512430pSb = C1512310pSP.LIZ().LIZ.LJFF;
        if (interfaceC1512430pSb != null) {
            interfaceC1512430pSb.ensureNotReachHere(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r4 = -1
            java.lang.String r3 = ""
            if (r0 != 0) goto L2c
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L21
            r0.<init>(r5)     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r1 = r0.getPath()     // Catch: java.net.MalformedURLException -> L21
            r0 = 47
            int r0 = r1.lastIndexOf(r0)     // Catch: java.net.MalformedURLException -> L21
            if (r0 == r4) goto L2c
            int r0 = r0 + 1
            java.lang.String r2 = r1.substring(r0)     // Catch: java.net.MalformedURLException -> L21
            goto L2d
        L21:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "ml#evaluator"
            java.lang.String r0 = "Utils getName error!"
            X.C1512290pSN.LIZ(r1, r0, r2)
        L2c:
            r2 = r3
        L2d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L34
            return r3
        L34:
            java.lang.String r0 = "."
            int r1 = r2.indexOf(r0)
            if (r1 != r4) goto L3d
            return r3
        L3d:
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1512320pSQ.LIZJ(java.lang.String):java.lang.String");
    }

    public static String LIZLLL(String str) {
        String string = null;
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                char[] cArr = LIZIZ;
                sb.append(cArr[(b & 240) >> 4]);
                sb.append(cArr[b & 15]);
            }
            string = sb.toString();
            return string;
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }

    public static boolean LIZ(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || c0vsj.length() == 0) {
            return false;
        }
        int iIndexOf = str2.indexOf("?");
        if (iIndexOf == -1) {
            return true;
        }
        String strSubstring = str2.substring(iIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            return false;
        }
        String str3 = "";
        if (c0vsj.isFile()) {
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new C0VSP(c0vsj));
                    while (true) {
                        try {
                            int i = bufferedInputStream2.read(bArr, 0, 1024);
                            if (i != -1) {
                                messageDigest.update(bArr, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedInputStream = bufferedInputStream2;
                            TryCatchGuardChecker.doCheck(e);
                            C1512290pSN.LIZ("ml#evaluator", "Utils getFileMD5 error!", e);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            TryCatchGuardChecker.doCheck(th);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                    throw th;
                                } catch (IOException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedInputStream2.close();
                    byte[] bArrDigest = messageDigest.digest();
                    if (bArrDigest != null && bArrDigest.length > 0) {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                        char[] cArr2 = new char[bArrDigest.length * 2];
                        int i2 = 0;
                        for (byte b : bArrDigest) {
                            int i3 = i2 + 1;
                            cArr2[i2] = cArr[(b >>> 4) & 15];
                            i2 = i3 + 1;
                            cArr2[i3] = cArr[b & 15];
                        }
                        str3 = new String(cArr2);
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (!strSubstring.equalsIgnoreCase(str3)) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x0095
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJ(X.C0VSJ r11, X.C0VSJ r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1512320pSQ.LJ(X.0VSJ, X.0VSJ):void");
    }
}
