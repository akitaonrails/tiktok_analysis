package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0GWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWQ {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(int i, int i2, C1322110kVd c1322110kVd) {
        Rect rect;
        View view;
        int width = c1322110kVd.getWidth();
        int height = c1322110kVd.getHeight();
        float f = i / i2;
        float f2 = width;
        float f3 = height;
        if (f > f2 / f3) {
            float f4 = f2 / f;
            float f5 = (f3 - f4) / 2;
            rect = new Rect(0, (int) f5, width, (int) (f5 + f4));
        } else {
            float f6 = f3 * f;
            float f7 = (f2 - f6) / 2;
            rect = new Rect((int) f7, 0, (int) (f7 + f6), height);
        }
        int[] iArr = new int[2];
        c1322110kVd.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        Object parent = c1322110kVd.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.getLocationInWindow(iArr2);
        }
        int i3 = iArr[0] - iArr2[0];
        int i4 = iArr[1] - iArr2[1];
        return new Rect(rect.left + i3, rect.top + i4, rect.right + i3, rect.bottom + i4);
    }
}
