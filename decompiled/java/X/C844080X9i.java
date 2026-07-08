package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0X9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844080X9i {
    public static byte[] LIZ(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(8192);
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                if (bArr != null) {
                    try {
                        gZIPOutputStream.write(bArr);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2209791BeD.LJIJJ().LJIILIIL(14, "compress with gzip failed", th, new Object[0]);
                            C844090X9j.LIZ(gZIPOutputStream);
                            C844090X9j.LIZ(byteArrayOutputStream);
                            return null;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C844090X9j.LIZ(gZIPOutputStream);
                            C844090X9j.LIZ(byteArrayOutputStream);
                            throw th2;
                        }
                    }
                }
                C844090X9j.LIZ(gZIPOutputStream);
                C844090X9j.LIZ(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }
}
