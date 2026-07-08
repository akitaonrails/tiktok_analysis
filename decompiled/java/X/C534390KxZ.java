package X;

import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: X.0KxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534390KxZ {
    public static int[] LIZ(String str) {
        if (!C2286708xd.LIZJ(str)) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
