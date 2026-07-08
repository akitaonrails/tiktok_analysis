package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.08Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106108Mx {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJFF(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                LJFF(file.getPath());
            } else {
                file.delete();
            }
        }
        c0vsj.delete();
    }

    public static boolean LIZIZ(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        outputStream.write(bArr, 0, i);
                    } else {
                        outputStream.flush();
                        LIZ(inputStream);
                        LIZ(outputStream);
                        return true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZ(inputStream);
                    LIZ(outputStream);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(inputStream);
                LIZ(outputStream);
                throw th;
            }
            TryCatchGuardChecker.doCheck(th);
            LIZ(inputStream);
            LIZ(outputStream);
            throw th;
        }
    }

    public static C0VSJ LIZJ(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                if (!z) {
                    c0vsj.mkdirs();
                } else {
                    try {
                        File parentFile = c0vsj.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        c0vsj.createNewFile();
                        return c0vsj;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return c0vsj;
                    }
                }
            }
            return c0vsj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[Catch: Exception -> 0x003e, all -> 0x0054, TryCatch #1 {Exception -> 0x003e, blocks: (B:4:0x0008, B:6:0x0014, B:7:0x001a), top: B:42:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.io.InputStream r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            if (r7 == 0) goto L1a
            java.lang.String r1 = ""
            java.lang.String r0 = r7.trim()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
            if (r0 != 0) goto L1a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
            r3.<init>(r6, r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
            goto L1f
        L1a:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
            r3.<init>(r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L54
        L1f:
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4e
        L23:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4e
            r0 = -1
            if (r0 == r1) goto L2f
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4e
            goto L23
        L2f:
            r3.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            java.lang.String r0 = r5.toString()
            return r0
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            r0 = move-exception
            r3 = r4
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.io.IOException -> L49
            return r4
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            return r4
        L4e:
            r1 = move-exception
            r4 = r3
        L50:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r1 = move-exception
            goto L50
        L56:
            if (r4 == 0) goto L60
            r4.close()     // Catch: java.io.IOException -> L5c
            throw r1
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L60:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2106108Mx.LIZLLL(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static byte[] LJ(InputStream inputStream, long j, String str) throws IOException {
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        if (i2 >= i) {
            inputStream.close();
            return bArr;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Could not completely read file ");
        sbLIZ.append(str);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
