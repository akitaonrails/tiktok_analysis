package X;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0y8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845920y8U {
    public static RectF LIZ(C1846010y8d c1846010y8d, View view, int i) {
        if (view == null) {
            return new RectF();
        }
        if (!c1846010y8d.LLJI && (view instanceof C1845910y8T)) {
            C1845910y8T c1845910y8T = (C1845910y8T) view;
            int contentWidth = c1845910y8T.getContentWidth();
            int contentHeight = c1845910y8T.getContentHeight();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            if (contentWidth < iLIZIZ) {
                contentWidth = iLIZIZ;
            }
            int left = (c1845910y8T.getLeft() + c1845910y8T.getRight()) / 2;
            int top = (c1845910y8T.getTop() + c1845910y8T.getBottom()) / 2;
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
