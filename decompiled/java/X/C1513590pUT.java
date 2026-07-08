package X;

import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0pUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513590pUT {
    public final LinkedList<RectF>[] LIZ;
    public final int LIZIZ;

    public C1513590pUT() {
        new RectF();
        new RectF();
        this.LIZ = new LinkedList[]{new LinkedList<>(), new LinkedList<>()};
        this.LIZIZ = 6;
    }

    public final RectF LIZ(float[] fArr) {
        RectF rectF = new RectF();
        int length = fArr.length / this.LIZIZ;
        for (int i = 0; i < length; i++) {
            int i2 = this.LIZIZ * i;
            float f = fArr[i2];
            float f2 = fArr[i2 + 1];
            float f3 = rectF.left;
            if (f3 == 0.0f || f < f3) {
                rectF.left = f;
            }
            float f4 = rectF.top;
            if (f4 == 0.0f || f2 < f4) {
                rectF.top = f2;
            }
            float f5 = rectF.right;
            if (f5 == 0.0f || f > f5) {
                rectF.right = f;
            }
            float f6 = rectF.bottom;
            if (f6 == 0.0f || f2 > f6) {
                rectF.bottom = f2;
            }
        }
        return rectF;
    }
}
