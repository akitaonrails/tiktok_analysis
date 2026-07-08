package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0H1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1Y {
    public static final boolean LIZ(Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            return true;
        }
        return false;
    }
}
