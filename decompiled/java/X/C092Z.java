package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: X.092Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092Z {
    public static String LIZ(byte[] bArr) {
        String string = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i);
                    }
                    string = byteArrayOutputStream.toString("UTF-8");
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    byteArrayInputStream.close();
                }
                byteArrayOutputStream.close();
                return string;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return string;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }
}
