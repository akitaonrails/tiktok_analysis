package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0JH5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JH5 {
    public static final void LIZ(C0JH6 c0jh6, C1324720kZq c1324720kZq) {
        Bitmap bitmap = c0jh6.LIZ;
        if (bitmap != null) {
            c1324720kZq.setImageBitmap(bitmap);
            return;
        }
        String str = c0jh6.LIZIZ;
        if (str == null) {
            return;
        }
        c1324720kZq.setImageURI(str);
    }
}
