package X;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0y91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846250y91 {
    public static RectF LIZ(C1846220y8y c1846220y8y, View view, int i) {
        int contentWidth;
        if (view == null) {
            return new RectF();
        }
        if (!c1846220y8y.LLJILJILJ && (view instanceof C1846230y8z)) {
            C1846230y8z c1846230y8z = (C1846230y8z) view;
            int fixedIndicatorWidthDp = c1846220y8y.getFixedIndicatorWidthDp();
            if (fixedIndicatorWidthDp >= 0) {
                contentWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(fixedIndicatorWidthDp)));
            } else {
                contentWidth = c1846230y8z.getContentWidth();
            }
            int contentHeight = c1846230y8z.getContentHeight();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            if (contentWidth < iLIZIZ && fixedIndicatorWidthDp < 0) {
                contentWidth = iLIZIZ;
            }
            int left = (c1846230y8z.getLeft() + c1846230y8z.getRight()) / 2;
            int top = (c1846230y8z.getTop() + c1846230y8z.getBottom()) / 2;
            int i2 = contentWidth / 2;
            return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
        }
        RectF rectF = new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (i <= 0) {
            return rectF;
        }
        float f = i;
        return new RectF(rectF.left + f, rectF.top, rectF.right - f, rectF.bottom);
    }
}
