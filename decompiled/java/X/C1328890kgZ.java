package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328890kgZ {
    public static void LIZ(int i, InputStream inputStream, byte[] bArr) throws IOException {
        boolean z;
        inputStream.getClass();
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                C842030X1l.LIZIZ(inputStream, bArr, i);
                inputStream.reset();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                inputStream.reset();
                throw th;
            }
        }
        C842030X1l.LIZIZ(inputStream, bArr, i);
    }
}
