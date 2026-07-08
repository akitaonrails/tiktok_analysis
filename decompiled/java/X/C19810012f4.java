package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: X.12f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19810012f4 extends AbstractC19810712fB {
    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        return false;
    }

    public C19810012f4(C19804712eD c19804712eD) {
        super(c19804712eD);
    }

    public static byte[] LJIIIIZZ(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
