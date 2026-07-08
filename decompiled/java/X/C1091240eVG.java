package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.0eVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091240eVG extends LruCache<String, SoftReference<Bitmap>> {
    public C1091240eVG(int i) {
        super(i);
    }

    public final Bitmap LIZ(String str) {
        SoftReference<Bitmap> softReference = get(str);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, SoftReference<Bitmap> softReference) {
        int byteCount;
        Bitmap bitmap = softReference.get();
        if (bitmap != null) {
            byteCount = bitmap.getByteCount();
        } else {
            byteCount = 0;
        }
        return byteCount / 1024;
    }
}
