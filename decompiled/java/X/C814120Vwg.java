package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0Vwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814120Vwg implements Closeable {
    public final URL LL;
    public volatile Future<?> LLILLJJLI;
    public C835510Wq5 LLILLL;

    public final Bitmap LIZ() throws Throwable {
        URLConnection uRLConnectionE0 = C2204961BRm.e0(this.LL, new C0WZX("dzBzEgU1UM3QUBknTACBZOH3RnJ+RNEWrFftiFMy57TrcxjXa4qK1mGcYw==", new String[]{"01a8f"}));
        if (uRLConnectionE0.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionE0.getInputStream();
        try {
            byte[] bArrLIZIZ = C814130Vwh.LIZIZ(new C818820WAe(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (bArrLIZIZ.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLIZIZ, 0, bArrLIZIZ.length);
            if (bitmapDecodeByteArray != null) {
                return bitmapDecodeByteArray;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to decode image: ");
            sbLIZ.append(this.LL);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (inputStream != null) {
                try {
                    inputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILLJJLI.cancel(true);
    }

    public C814120Vwg(URL url) {
        this.LL = url;
    }
}
