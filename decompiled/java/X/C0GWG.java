package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0GWG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWG {
    public static C21620719jR LIZ(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (bitmap2 != null && bitmap3 != null) {
            Rect rect = new Rect(0, 0, i3, i4);
            Rect rect2 = new Rect(0, 0, i3, i4);
            int i7 = i6 + 1;
            Rect rect3 = new Rect(0, i7, i3, bitmap.getHeight());
            Rect rect4 = new Rect(0, i2 - rect3.height(), i3, i2);
            int i8 = i5 + 1;
            Rect rect5 = new Rect(i8, 0, bitmap.getWidth(), i4);
            Rect rect6 = new Rect(i - rect5.width(), 0, i, i4);
            Rect rect7 = new Rect(i8, i7, bitmap.getWidth(), bitmap.getHeight());
            Rect rect8 = new Rect(i - rect7.width(), i2 - rect7.height(), i, i2);
            Rect rect9 = new Rect(0, 0, bitmap2.getWidth(), i4);
            Rect rect10 = new Rect(rect2.right, rect2.top, rect6.left, rect6.bottom);
            Rect rect11 = new Rect(0, i7, bitmap2.getWidth(), bitmap2.getHeight());
            Rect rect12 = new Rect(rect4.right, rect4.top, rect8.left, rect8.bottom);
            return new C21620719jR(rect, rect5, rect3, rect7, rect2, rect6, rect4, rect8, rect9, rect11, new Rect(0, 0, i3, bitmap3.getHeight()), new Rect(i8, 0, bitmap3.getWidth(), bitmap3.getHeight()), rect10, rect12, new Rect(rect2.left, rect2.bottom, rect4.right, rect4.top), new Rect(rect6.left, rect6.bottom, rect8.right, rect8.top), new Rect(0, 0, bitmap2.getWidth(), bitmap3.getHeight()), new Rect(rect2.right, rect2.bottom, rect8.left, rect8.top));
        }
        return null;
    }
}
