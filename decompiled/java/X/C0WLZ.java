package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0WLZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLZ {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to close resource: ");
            sbLIZ.append(e);
            AnimaXLog.LIZ("AnimaXStreamUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static byte[] LIZJ(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (LIZIZ(inputStream, byteArrayOutputStream, i)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f A[PHI: r0
      0x000f: PHI (r0v5 int) = (r0v4 int), (r0v8 int) binds: [B:6:0x0009, B:8:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.io.InputStream r5, java.io.OutputStream r6, int r7) {
        /*
            java.lang.String r4 = "AnimaXStreamUtil"
            r3 = 0
            if (r5 == 0) goto L25
            if (r6 == 0) goto L25
            r0 = 1024(0x400, float:1.435E-42)
            if (r7 < r0) goto Lf
            r0 = 8192(0x2000, float:1.148E-41)
            if (r7 <= r0) goto L10
        Lf:
            r7 = r0
        L10:
            byte[] r2 = new byte[r7]     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
        L12:
            int r1 = r5.read(r2, r3, r7)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            r0 = -1
            if (r1 == r0) goto L1d
            r6.write(r2, r3, r1)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            goto L12
        L1d:
            LIZ(r5)
            LIZ(r6)
            r0 = 1
            return r0
        L25:
            java.lang.String r0 = "Invalid input stream or output stream"
            com.lynx.animax.util.AnimaXLog.LIZ(r4, r0)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            goto L42
        L2b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "Failed to copy input stream to output stream, reason: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            r1.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L49
            com.lynx.animax.util.AnimaXLog.LIZ(r4, r0)     // Catch: java.lang.Throwable -> L49
        L42:
            LIZ(r5)
            LIZ(r6)
            return r3
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
            LIZ(r5)
            LIZ(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WLZ.LIZIZ(java.io.InputStream, java.io.OutputStream, int):boolean");
    }
}
