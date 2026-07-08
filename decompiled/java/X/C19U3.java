package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.19U3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19U3 {
    public static RectF LIZ(C19U1 c19u1, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!c19u1.isTabIndicatorFullWidth() && (view instanceof C21546519Tz)) {
            C21546519Tz c21546519Tz = (C21546519Tz) view;
            int contentWidth = c21546519Tz.getContentWidth();
            int contentHeight = c21546519Tz.getContentHeight();
            int iLIZIZ = (int) C21551419Vw.LIZIZ(24, c21546519Tz.getContext());
            if (contentWidth < iLIZIZ) {
                contentWidth = iLIZIZ;
            }
            int left = (c21546519Tz.getLeft() + c21546519Tz.getRight()) / 2;
            int top = (c21546519Tz.getTop() + c21546519Tz.getBottom()) / 2;
            int i = contentWidth / 2;
            return new RectF(left - i, top - (contentHeight / 2), i + left, top + (left / 2));
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void LIZIZ(C19U1 c19u1, View view, View view2, float f, Drawable drawable) {
        RectF rectFLIZ = LIZ(c19u1, view);
        RectF rectFLIZ2 = LIZ(c19u1, view2);
        drawable.setBounds(C194V.LIZ(f, (int) rectFLIZ.left, (int) rectFLIZ2.left), drawable.getBounds().top, C194V.LIZ(f, (int) rectFLIZ.right, (int) rectFLIZ2.right), drawable.getBounds().bottom);
    }
}
