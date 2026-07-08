package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275108vl {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(int i, Bitmap bitmap) {
        int i2;
        int i3;
        if (i <= 0) {
            i = 256;
        }
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            double width = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
            if (!((Boolean) C2275308vn.LIZ.getValue()).booleanValue() ? width <= 1.0d : width > 1.0d) {
                i3 = (int) (((double) i) / width);
                i2 = i;
            } else {
                i2 = (int) (((double) i) * width);
                i3 = i;
                if (i2 > 0) {
                }
                i3 = i;
                return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
            }
            if (i3 <= 0) {
                i3 = i;
            }
            return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        }
        i2 = i;
        i3 = i;
        i = i2;
        return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
    }

    public static Pair LIZIZ(VEUtils.VEVideoFileInfo vEVideoFileInfo, int i) {
        int i2;
        int i3;
        int i4;
        if (i <= 0) {
            i = 256;
        }
        int i5 = vEVideoFileInfo.width;
        if (i5 > 0 && (i4 = vEVideoFileInfo.height) > 0) {
            double d = ((double) i5) / ((double) i4);
            if (!((Boolean) C2275208vm.LIZ.getValue()).booleanValue() ? d <= 1.0d : d > 1.0d) {
                i3 = (int) (((double) i) / d);
                i2 = i;
            } else {
                i2 = (int) (((double) i) * d);
                i3 = i;
                if (i2 > 0) {
                }
                i3 = i;
                return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
            }
            if (i3 <= 0) {
                i3 = i;
            }
            return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        }
        i2 = i;
        i3 = i;
        i = i2;
        return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
    }
}
