package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19LC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19LC {
    public static final /* synthetic */ int LIZ = 0;

    public static C21666819qs LIZLLL(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = fArr[0];
        return new C21666819qs(f, -((float) (((double) ((float) Math.atan2(fArr[1], f))) * 57.29577951308232d)), fArr[2], fArr[5]);
    }

    public static List LIZIZ(List list, RectF rectF, Matrix matrix) {
        Matrix matrix2 = new Matrix();
        if (!matrix.invert(matrix2)) {
            C201955140j.LIZLLL(C1450080nq2.LIZIZ, "edit_crop", "Transition matrix cannot be inverted");
            return C13BV.INSTANCE;
        }
        ArrayList<PointF> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PointF pointF = (PointF) it2.next();
            float[] fArr = {0.0f, 0.0f};
            matrix2.mapPoints(fArr, new float[]{pointF.x, pointF.y});
            arrayList.add(new PointF(fArr[0], fArr[1]));
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (PointF pointF2 : arrayList) {
            float f = (pointF2.x - rectF.left) / fWidth;
            float f2 = (pointF2.y - rectF.top) / fHeight;
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f3 = 1.0f;
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else {
                if (f2 > 1.0f) {
                }
                arrayList2.add(new PointF(f, f3));
            }
            f3 = f2;
            arrayList2.add(new PointF(f, f3));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[PHI: r1 r4
      0x00cc: PHI (r1v10 float) = (r1v9 float), (r1v14 float) binds: [B:6:0x0098, B:8:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r4v5 float) = (r4v4 float), (r4v8 float) binds: [B:6:0x0098, B:8:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix LIZJ(android.graphics.Matrix r9, android.graphics.RectF r10, android.graphics.RectF r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19LC.LIZJ(android.graphics.Matrix, android.graphics.RectF, android.graphics.RectF):android.graphics.Matrix");
    }

    public static Matrix LIZ(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i2;
        float fMin = Math.min(i5 / f, i6 / f2);
        float f3 = 2;
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(i3 - ((f * fMin) / f3), i4 - ((f2 * fMin) / f3));
        return matrix;
    }
}
