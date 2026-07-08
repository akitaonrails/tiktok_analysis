package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0W19, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W19 {
    public final OutputStream LIZ;
    public final C0W1C LIZIZ;
    public final boolean LIZJ;

    public static byte[] LIZ(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 != i) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStream.close();
                try {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C2112008Pe.LIZ(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2112008Pe.LIZ(byteArrayOutputStream);
                    throw th;
                }
            }
        }
    }

    public C0W19(OutputStream outputStream, boolean z) {
        C0W1C c0w1c = new C0W1C(outputStream);
        this.LIZIZ = c0w1c;
        if (z) {
            this.LIZ = new C0W1A(c0w1c);
        } else {
            this.LIZ = new C0W1B(c0w1c);
        }
        this.LIZJ = z;
    }
}
