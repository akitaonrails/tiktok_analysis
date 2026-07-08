package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0jjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292460jjo {
    public static final ThreadLocal<Matrix> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<RectF> LIZIZ = new ThreadLocal<>();

    public static void LIZ(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            LIZ(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
