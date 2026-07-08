package X;

import android.graphics.Paint;
import android.text.Layout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424890GlL {
    public static final /* synthetic */ int LIZ = 0;

    public static Layout LIZ(int i, float f, float f2, C444830HcP c444830HcP) {
        int i2;
        int i3 = (int) f;
        int i4 = (int) f2;
        Float fValueOf = null;
        while (i3 <= i4 && i3 > 0 && (i2 = (i3 + i4) / 2) > 0) {
            int lineCount = C444830HcP.LIZJ(c444830HcP, 0.0f, false, Collections.singletonList(new Pair(Integer.valueOf(i2), Integer.valueOf(i2))), 27).getLineCount();
            if (lineCount > i) {
                i4 = i2 - 1;
            } else {
                if (lineCount == i) {
                    fValueOf = Float.valueOf(i2);
                }
                i3 = i2 + 1;
            }
        }
        if (fValueOf == null || fValueOf.floatValue() <= 0.0f) {
            return null;
        }
        int iFloatValue = (int) fValueOf.floatValue();
        return C444830HcP.LIZJ(c444830HcP, 0.0f, false, Collections.singletonList(new Pair(Integer.valueOf(iFloatValue), Integer.valueOf(iFloatValue))), 27);
    }

    public static C424900GlM LIZIZ(int i, int i2, String str, List list) {
        int iIntValue;
        Paint paint = new Paint();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        int i3 = 0;
        Integer numValueOf = null;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Pair pair = (Pair) obj;
                int iIntValue2 = ((Number) pair.getFirst()).intValue();
                int iIntValue3 = ((Number) pair.getSecond()).intValue();
                while (iIntValue2 <= iIntValue3) {
                    int i5 = (iIntValue2 + iIntValue3) / 2;
                    paint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5))));
                    if (paint.measureText(str) <= iLIZIZ) {
                        numValueOf = Integer.valueOf(i5);
                        iIntValue2 = i5 + 1;
                    } else {
                        iIntValue3 = i5 - 1;
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = ((Number) ((Pair) ListProtector.get(list, list.size() - 1)).getFirst()).intValue();
        }
        paint.setTextSize(iIntValue);
        return new C424900GlM(Math.min(Math.max(paint.measureText(str), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))));
    }
}
