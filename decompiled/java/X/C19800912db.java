package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: X.12db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19800912db extends AbstractC19781512aT {
    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    public final boolean LJIILIIL() {
        LJIIIIZZ();
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(this.LIZ.LIZ, "connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
            return networkInfoLJIJ != null && networkInfoLJIJ.isConnected();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public C19800912db(C12Z4 c12z4) {
        super(c12z4);
    }

    public static byte[] LJIIJJI(HttpURLConnection httpURLConnection) throws IOException {
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
