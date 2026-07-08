package X;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;
import lth.o;

/* JADX INFO: renamed from: X.0nJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429730nJD {
    public static C1429730nJD LIZIZ;
    public final ExecutorService LIZ = C786410Ut5.d4(4);

    public C1429730nJD() {
        new BPEAHandler(Looper.getMainLooper());
        final int i = ((int) Runtime.getRuntime().totalMemory()) / 5;
        new LruCache<String, Bitmap>(i) { // from class: X.0nJC
            @Override // android.util.LruCache
            public final int sizeOf(String str, Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                return bitmap2.getRowBytes() * bitmap2.getHeight();
            }
        };
        o.LIZ.getCacheDir().getPath();
    }
}
