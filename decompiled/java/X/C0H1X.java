package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H1X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1X implements C0MOK {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZJ(Bitmap bitmap) {
        int height = (int) (((double) bitmap.getHeight()) * 0.1d);
        if (height < 1) {
            height = 1;
        }
        return new Rect(0, bitmap.getHeight() - height, bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // X.C0MOK
    public final C443120HZe<Integer, Integer, Integer> LIZ(Bitmap bitmap) {
        if (!C0H1Y.LIZ(bitmap)) {
            return new C443120HZe<>(-16777216, -16777216, -16777216);
        }
        int iLIZLLL = LIZLLL(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        int height = (int) (((double) bitmap.getHeight()) * 0.1d);
        if (height < 1) {
            height = 1;
        }
        return new C443120HZe<>(Integer.valueOf(LIZLLL(bitmap, new Rect(0, 0, bitmap.getWidth(), height))), Integer.valueOf(LIZLLL(bitmap, LIZJ(bitmap))), Integer.valueOf(iLIZLLL));
    }

    @Override // X.C0MOK
    public final Pair<Integer, Integer> LIZIZ(Bitmap bitmap) {
        if (!C0H1Y.LIZ(bitmap)) {
            return new Pair<>(-16777216, -16777216);
        }
        int height = (int) (((double) bitmap.getHeight()) * 0.1d);
        if (height < 1) {
            height = 1;
        }
        return new Pair<>(Integer.valueOf(LIZLLL(bitmap, new Rect(0, 0, bitmap.getWidth(), height))), Integer.valueOf(LIZLLL(bitmap, LIZJ(bitmap))));
    }

    public static int LIZLLL(Bitmap bitmap, Rect rect) {
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
