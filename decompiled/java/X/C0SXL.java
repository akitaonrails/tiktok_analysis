package X;

import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0SXL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXL {
    public static C1325340kaq LIZ(Layout layout, Spanned spanned, float f, float f2, float f3) {
        int lineForOffset;
        boolean z;
        float primaryHorizontal;
        C1325340kaq c1325340kaq = null;
        if (f2 >= 0.0f && f2 <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical((int) f2);
            int lineTop = layout.getLineTop(lineForVertical);
            int lineBottom = layout.getLineBottom(lineForVertical);
            if (f2 >= lineTop && f2 <= lineBottom) {
                float f4 = Float.MAX_VALUE;
                for (C1325340kaq c1325340kaq2 : (C1325340kaq[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), C1325340kaq.class)) {
                    int spanStart = spanned.getSpanStart(c1325340kaq2);
                    int spanEnd = spanned.getSpanEnd(c1325340kaq2);
                    if (spanStart >= 0 && spanEnd > spanStart && (lineForOffset = layout.getLineForOffset(spanStart)) == lineForVertical) {
                        WeakHashMap<View, C0P0T> weakHashMap = C1325340kaq.LLJILJIL;
                        int i = spanStart - 1;
                        if (i < 0) {
                            i = 0;
                        }
                        C1325340kaq[] c1325340kaqArr = (C1325340kaq[]) spanned.getSpans(i, spanStart, C1325340kaq.class);
                        int length = c1325340kaqArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (spanned.getSpanEnd(c1325340kaqArr[i2]) == spanStart) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        if (z) {
                            iLIZIZ = 0;
                        }
                        int paragraphDirection = layout.getParagraphDirection(lineForOffset);
                        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        if (paragraphDirection < 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanStart) - fLIZIZ;
                        } else {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                        }
                        float f5 = primaryHorizontal + iLIZIZ;
                        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + f5;
                        float f6 = fLIZIZ2 + f3;
                        if (f5 - f3 <= f && f <= f6) {
                            float fAbs = Math.abs(f - ((f5 + fLIZIZ2) / 2.0f));
                            if (fAbs < f4) {
                                f4 = fAbs;
                                c1325340kaq = c1325340kaq2;
                            }
                        }
                    }
                }
            }
        }
        return c1325340kaq;
    }
}
