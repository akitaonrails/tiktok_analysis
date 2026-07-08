package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: renamed from: X.1AIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177171AIp {
    public static final C2177171AIp LIZ = new C2177171AIp();
    public static final LruCache<String, Bitmap> LIZIZ = new LruCache<>(200);

    public final synchronized void LIZ(Bitmap bitmap, String str) {
        LIZIZ.put(str, bitmap);
    }
}
