package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: X.09bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2404609bY {
    public static void LIZ(File file) {
        if (file != null && file.exists()) {
            try {
                file.delete();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0038: MOVE (r4 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:16777272), block:B:23:0x0038 */
    public static byte[] LIZIZ(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        if (!file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new C0VSP(file));
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    TryCatchGuardChecker.doCheck(th);
                    C2105408Mq.LIZ(closeable2);
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                bufferedInputStream = null;
            } catch (IOException e2) {
                e = e2;
                bufferedInputStream = null;
            }
            try {
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                C2105408Mq.LIZ(bufferedInputStream);
                return bArr;
            } catch (FileNotFoundException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                C2105408Mq.LIZ(bufferedInputStream);
                return null;
            } catch (IOException e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                C2105408Mq.LIZ(bufferedInputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
