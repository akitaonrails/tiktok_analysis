package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CRD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CRD {
    public static int LIZ(String str) {
        Integer num;
        Map<String, Integer> map = C1CRB.LLILZLL;
        if (map != null && (num = (Integer) ((LinkedHashMap) map).get(str)) != null) {
            return num.intValue();
        }
        int i = C1CRB.LLIZ;
        C1CRB.LLIZ = i + 1;
        Map<String, Integer> map2 = C1CRB.LLILZLL;
        if (map2 == null) {
            return i;
        }
        map2.put(str, Integer.valueOf(i));
        return i;
    }

    public static boolean LIZIZ(Context context) {
        boolean z;
        if (C1CRB.LLILZIL == null && context != null) {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            C1CRB.LLILZIL = Boolean.valueOf(z);
        }
        return Intrinsics.LJFF(C1CRB.LLILZIL, Boolean.TRUE);
    }

    public static boolean LIZLLL(C1CR9 c1cr9) {
        if (c1cr9 != null) {
            for (Object obj : c1cr9.LIZ) {
                if ((obj instanceof C2230261CQu) && ((C2230261CQu) obj).LIZ != 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZJ(C1CRB c1crb, View view, C1CRC c1crc, int i, int i2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (i == -5) {
            float fLJI = c1crc.LJI();
            if (fLJI == fLJI) {
                i = Math.round(fLJI);
            } else {
                if (!LIZLLL(c1crc.LJI) || !LIZLLL(c1crc.LIZ) || !LIZLLL(c1crc.LIZIZ) || !LIZLLL(c1crc.LJ)) {
                    return false;
                }
                i = -2;
            }
        }
        if (i2 == -5) {
            float fLIZJ = c1crc.LIZJ();
            if (fLIZJ == fLIZJ) {
                i2 = Math.round(fLIZJ);
            } else {
                if (!LIZLLL(c1crc.LJII) || !LIZLLL(c1crc.LIZJ) || !LIZLLL(c1crc.LIZLLL) || !LIZLLL(c1crc.LJFF)) {
                    return false;
                }
                i2 = -2;
            }
        }
        if (c1crb.getMyWidth() == -1) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(c1crb.getMyWidthMeasureSpec(), c1crb.getPaddingLeft() + c1crb.getPaddingRight(), i);
        } else {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(c1crb.getMyWidth(), 1073741824), 0, i);
        }
        if (c1crb.getMyHeight() == -1) {
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(c1crb.getMyHeightMeasureSpec(), c1crb.getPaddingTop() + c1crb.getPaddingBottom(), i2);
        } else {
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(c1crb.getMyHeight(), 1073741824), 0, i2);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
        c1crc.LJIILLIIL = view.getMeasuredWidth();
        c1crc.LJIIZILJ = view.getMeasuredHeight();
        return true;
    }
}
