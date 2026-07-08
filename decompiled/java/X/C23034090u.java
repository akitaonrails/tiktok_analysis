package X;

import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: X.090u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23034090u {
    public static BitmapFactory.Options LIZ(String str) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i4 && i3 > 90) {
            i = i3 / 90;
        } else if (i3 < i4 && i4 > 110) {
            i = i4 / 110;
        } else {
            i = 1;
            i2 = i;
            options.inSampleSize = i2;
            return options;
        }
        if (i > 0) {
            i2 = i;
        }
        options.inSampleSize = i2;
        return options;
    }
}
