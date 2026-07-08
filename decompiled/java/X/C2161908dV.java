package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2161908dV {
    public static final Map<String, Object> LIZ = new ConcurrentHashMap();

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static int LIZIZ(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.String r8, X.C0VSP r9) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r6 = -1
            int r5 = r9.read(r7)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r4 = 0
        La:
            if (r4 >= r5) goto L41
            r1 = r7[r4]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r0 = 10
            if (r1 == r0) goto L16
            if (r4 != 0) goto L35
            if (r1 != r0) goto L18
        L16:
            int r4 = r4 + 1
        L18:
            r3 = r4
        L19:
            if (r3 >= r5) goto L35
            int r2 = r3 - r4
            r1 = r7[r3]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            char r0 = r8.charAt(r2)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            if (r1 != r0) goto L35
            int r0 = r8.length()     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            int r0 = r0 + (-1)
            if (r2 != r0) goto L32
            int r0 = LIZIZ(r7, r3)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            return r0
        L32:
            int r3 = r3 + 1
            goto L19
        L35:
            int r4 = r4 + 1
            goto La
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2161908dV.LIZJ(java.lang.String, X.0VSP):int");
    }
}
