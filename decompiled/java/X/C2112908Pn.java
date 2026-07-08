package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.08Pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2112908Pn {
    public static final C2112908Pn LIZ = new C2112908Pn();
    public static final List<String> LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append("/VESDK_Demo/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("veimage/");
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("resource/");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append("stickers/");
        C2188811AlT.LIZIZ(sbLIZ4);
        LIZIZ = new ArrayList();
        new ArrayList();
        new Formatter(new StringBuilder(), Locale.getDefault());
        int i = 1;
        while (true) {
            List<String> list = LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Filter_0");
            sbLIZ5.append(i);
            ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ5));
            while (true) {
                i++;
                if (i >= 20) {
                    return;
                }
                if (i >= 10) {
                    List<String> list2 = LIZIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Filter_");
                    sbLIZ6.append(i);
                    ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
        }
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || c0vsj.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            C0VSF c0vsf = new C0VSF(c0vsj);
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = inputStreamReader.read();
                if (i != -1) {
                    stringBuffer.append((char) i);
                } else {
                    c0vsf.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(android.graphics.Bitmap r5, java.io.File r6, android.graphics.Bitmap.CompressFormat r7) throws java.lang.Throwable {
        /*
            r4 = 0
            if (r5 == 0) goto L50
            if (r6 == 0) goto L50
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r0 = 100
            r5.compress(r7, r0, r1)
            byte[] r0 = r1.toByteArray()
            r3 = 0
            X.0VSV r2 = new X.0VSV     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2b
            r2.<init>(r6)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2b
            r2.write(r0)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L31
            r2.flush()     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L31
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L23:
            r0 = move-exception
            r3 = r2
            goto L27
        L26:
            r0 = move-exception
        L27:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2b
            goto L3e
        L2b:
            r1 = move-exception
            r2 = r3
        L2d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r1 = move-exception
            goto L2d
        L33:
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L39
            throw r1
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3d:
            throw r1
        L3e:
            if (r3 == 0) goto L4f
            r3.close()     // Catch: java.io.IOException -> L44
            goto L49
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        L49:
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4e:
            r4 = 1
        L4f:
            return r4
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2112908Pn.LIZJ(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat):boolean");
    }
}
