package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0GQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415460GQu {
    public static final boolean LIZ(Rect rect, Rect rect2) {
        if (rect.right != rect2.left && rect.top != rect2.bottom && rect.left != rect2.right && rect.bottom != rect2.top) {
            return false;
        }
        return true;
    }
}
