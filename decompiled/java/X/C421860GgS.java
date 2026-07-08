package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0GgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421860GgS {
    public static final float[] LIZ(List<? extends PointF> list) {
        int i = 0;
        if (list.isEmpty()) {
            return new float[0];
        }
        if (list.size() == 1) {
            PointF pointF = (PointF) ListProtector.get(list, 0);
            float f = pointF.x;
            float f2 = pointF.y;
            return new float[]{f, f2, f, f2};
        }
        int size = list.size() - 1;
        float[] fArr = new float[size * 4];
        int i2 = 0;
        while (i < size) {
            PointF pointF2 = (PointF) ListProtector.get(list, i);
            i++;
            PointF pointF3 = (PointF) ListProtector.get(list, i);
            int i3 = i2 + 1;
            fArr[i2] = pointF2.x;
            int i4 = i3 + 1;
            fArr[i3] = pointF2.y;
            int i5 = i4 + 1;
            fArr[i4] = pointF3.x;
            i2 = i5 + 1;
            fArr[i5] = pointF3.y;
        }
        return fArr;
    }
}
