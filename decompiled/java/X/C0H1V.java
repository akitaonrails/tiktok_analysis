package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H1V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1V {
    public static GradientDrawable LIZ(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = (int) (((double) bitmap.getHeight()) * 0.1d);
        if (height < 1) {
            height = 1;
        }
        Integer numValueOf = Integer.valueOf(LIZIZ(bitmap, new Rect(0, 0, width, height)));
        int height2 = bitmap.getHeight();
        int height3 = (int) (((double) bitmap.getHeight()) * 0.1d);
        if (height3 < 1) {
            height3 = 1;
        }
        Pair pair = new Pair(numValueOf, Integer.valueOf(LIZIZ(bitmap, new Rect(0, height2 - height3, bitmap.getWidth(), bitmap.getHeight()))));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()});
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static int LIZIZ(Bitmap bitmap, Rect rect) {
        System.nanoTime();
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, rect));
        int[] iArrLIZ = c204674156yLIZ.LIZ();
        int[] iArrCopyOf = Arrays.copyOf(c204674156yLIZ.LJI, Math.max(0, c204674156yLIZ.LIZLLL));
        if (iArrLIZ.length == 0) {
            iArrLIZ = new int[]{0};
            iArrCopyOf = new int[]{0};
        }
        int i = iArrCopyOf[0];
        ArrayList<Pair> arrayList = new ArrayList(iArrLIZ.length);
        int length = iArrLIZ.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Pair(Integer.valueOf(iArrLIZ[i2]), Integer.valueOf(iArrCopyOf[i3])));
            i2++;
            i3++;
        }
        int iLJJLIIIJ = C13LQ.LJJLIIIJ(iArrCopyOf);
        int[] iArr = new int[3];
        int i4 = 0;
        for (Pair pair : arrayList) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            if (Math.abs(iIntValue2 - i) / (i * 1.0f) < 0.1f || i4 / iLJJLIIIJ < 0.65f) {
                iArr[0] = iArr[0] + (((iIntValue >> 16) & 255) * iIntValue2);
                iArr[1] = iArr[1] + (((iIntValue >> 8) & 255) * iIntValue2);
                iArr[2] = iArr[2] + ((iIntValue & 255) * iIntValue2);
                i4 += iIntValue2;
            }
        }
        float[] fArr = new float[3];
        ColorProtector.RGBToHSV(iArr[0] / i4, iArr[1] / i4, iArr[2] / i4, fArr);
        float f = fArr[2];
        if (0.0f <= f && f <= 0.5f) {
            f += 0.1f;
        }
        return Color.HSVToColor(new float[]{fArr[0], fArr[1], f});
    }
}
