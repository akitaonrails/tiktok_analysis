package X;

import android.graphics.Bitmap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2252608s8 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, int i2, Bitmap bitmap) {
        if (i < 0) {
            i = 0;
        } else if (i >= bitmap.getWidth()) {
            i = bitmap.getWidth() - 1;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= bitmap.getHeight()) {
            i2 = bitmap.getHeight() - 1;
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        return bitmap.getPixel(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
    }
}
