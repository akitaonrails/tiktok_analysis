package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0Ks1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530950Ks1 {
    public static final boolean LIZ(Bitmap bitmap) {
        if (((double) bitmap.getWidth()) / ((double) bitmap.getHeight()) > 0.5625d) {
            return true;
        }
        return false;
    }
}
