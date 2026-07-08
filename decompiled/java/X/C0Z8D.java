package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0Z8D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8D {
    public static final float LIZ(View view) {
        Rect rect = new Rect();
        if (!view.getLocalVisibleRect(rect)) {
            return 0.0f;
        }
        float width = view.getWidth();
        float fWidth = rect.width();
        if (fWidth > width) {
            fWidth = width;
        }
        return fWidth / width;
    }
}
