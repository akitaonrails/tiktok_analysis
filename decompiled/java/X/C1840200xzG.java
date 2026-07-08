package X;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0xzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840200xzG {
    public static RectF LIZ(C1846060y8i c1846060y8i, View view, int i) {
        if (view == null) {
            return new RectF();
        }
        if (!c1846060y8i.LLJILJILJ && (view instanceof C1845930y8V)) {
            C1845930y8V c1845930y8V = (C1845930y8V) view;
            int contentWidth = c1845930y8V.getContentWidth();
            int contentHeight = c1845930y8V.getContentHeight();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            if (contentWidth < iLIZIZ) {
                contentWidth = iLIZIZ;
            }
            int left = (c1845930y8V.getLeft() + c1845930y8V.getRight()) / 2;
            int top = (c1845930y8V.getTop() + c1845930y8V.getBottom()) / 2;
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
