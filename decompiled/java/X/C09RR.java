package X;

import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: X.09RR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RR {
    public static final int LIZ(String str) {
        if (str == null) {
            return -1;
        }
        if (!C2286708xd.LIZJ(str)) {
            return -2;
        }
        if (C2471909mP.LJIIIZ(str) == 0) {
            return -3;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outWidth <= 0) {
            return -4;
        }
        if (options.outHeight <= 0) {
            return -5;
        }
        if (options.outMimeType == null) {
            return -6;
        }
        return 0;
    }
}
