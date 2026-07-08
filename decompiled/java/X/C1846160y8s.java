package X;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0y8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846160y8s {
    public static RectF LIZ(View view) {
        if (view == null) {
            return new RectF();
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
