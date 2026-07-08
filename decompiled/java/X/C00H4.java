package X;

import com.bytedance.android.livesdk.model.MeasureSpec;
import com.bytedance.android.livesdk.model.SizeSpec;

/* JADX INFO: renamed from: X.00H4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(MeasureSpec measureSpec) {
        Integer numValueOf;
        if (measureSpec == null || (numValueOf = Integer.valueOf(measureSpec.mode)) == null) {
            return null;
        }
        if (numValueOf.intValue() == 1) {
            return Integer.valueOf((int) ((C488301vF.LJ * measureSpec.value) / 100.0f));
        }
        if (numValueOf.intValue() != 2) {
            return null;
        }
        return Integer.valueOf((int) ((C488301vF.LJ * measureSpec.value) / 390.0f));
    }

    public static Integer LIZIZ(SizeSpec sizeSpec) {
        float f;
        float f2;
        int iIntValue;
        int iIntValue2;
        if (sizeSpec == null) {
            return null;
        }
        int i = sizeSpec.mode;
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            f = C488301vF.LJ * sizeSpec.value;
            f2 = 390.0f;
        } else {
            f = C488301vF.LJ * sizeSpec.value;
            f2 = 100.0f;
        }
        int i2 = (int) (f / f2);
        Integer numLIZ = LIZ(sizeSpec.minSize);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZ2 = LIZ(sizeSpec.maxSize);
        if (numLIZ2 != null) {
            iIntValue2 = numLIZ2.intValue();
        } else {
            iIntValue2 = Integer.MAX_VALUE;
        }
        if (iIntValue > iIntValue2) {
            iIntValue = iIntValue2;
        }
        return Integer.valueOf(C13LZ.LJ(i2, iIntValue, iIntValue2));
    }
}
