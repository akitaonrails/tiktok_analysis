package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292480jjq {
    public static boolean LJFF(View view, View view2) {
        if (view == null || view2 == null || !(view instanceof ViewGroup)) {
            return false;
        }
        while (view2.getParent() != null) {
            if (view2.getParent() == view) {
                return true;
            }
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            view2 = (View) view2.getParent();
        }
        return false;
    }

    public static PointF LIZ(PointF pointF, View view, View view2) {
        if (view != null && view2 != null) {
            if (view == view2) {
                return pointF;
            }
            float[] fArr = {pointF.x, pointF.y};
            ArrayList arrayList = new ArrayList();
            while (view2 != view) {
                arrayList.add(view2);
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            Matrix matrix = new Matrix();
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view3 = (View) ListProtector.get(arrayList, size);
                fArr[0] = fArr[0] + view.getScrollX();
                fArr[1] = fArr[1] + view.getScrollY();
                fArr[0] = fArr[0] - view3.getLeft();
                fArr[1] = fArr[1] - view3.getTop();
                if (!view3.getMatrix().isIdentity()) {
                    matrix.reset();
                    if (view3.getMatrix().invert(matrix)) {
                        float[] fArr2 = {fArr[0], fArr[1]};
                        matrix.mapPoints(fArr2);
                        fArr[0] = fArr2[0];
                        fArr[1] = fArr2[1];
                    } else {
                        fArr[0] = Float.MAX_VALUE;
                        fArr[1] = Float.MAX_VALUE;
                    }
                }
                size--;
                view = view3;
            }
            return new PointF(fArr[0], fArr[1]);
        }
        LynxLog.e("ViewHelper", "convertPointFromAncestorToDescendant failed since ancestor or descendant is null");
        return pointF;
    }

    public static PointF LIZIZ(PointF pointF, View view, View view2) {
        if (view2 != null && view != null) {
            if (view2 == view) {
                return pointF;
            }
            float[] fArr = {pointF.x, pointF.y};
            if (!view.getMatrix().isIdentity()) {
                view.getMatrix().mapPoints(fArr);
            }
            while (true) {
                if (view == view2) {
                    break;
                }
                View view3 = (View) view.getParent();
                if (view3 == null) {
                    LynxLog.e("ViewHelper", "convertPointFromDescendantToAncestor failed, parent is null.");
                    break;
                }
                fArr[0] = fArr[0] + view.getLeft();
                fArr[1] = fArr[1] + view.getTop();
                fArr[0] = fArr[0] - view3.getScrollX();
                fArr[1] = fArr[1] - view3.getScrollY();
                if (!view3.getMatrix().isIdentity()) {
                    view3.getMatrix().mapPoints(fArr);
                }
                view = view3;
            }
            return new PointF(fArr[0], fArr[1]);
        }
        LynxLog.e("ViewHelper", "convertPointFromAncestorToDescendant failed since view or another is null");
        return pointF;
    }

    public static PointF LIZJ(PointF pointF, View view, View view2) {
        if (view != null && view2 != null) {
            if (view == view2) {
                return pointF;
            }
            if (LJFF(view, view2)) {
                return LIZ(pointF, view, view2);
            }
            if (LJFF(view2, view)) {
                return LIZIZ(pointF, view, view2);
            }
            return LIZ(LIZIZ(pointF, view, view.getRootView()), view2.getRootView(), view2);
        }
        LynxLog.e("ViewHelper", "convertPointFromAncestorToDescendant failed since view or another is null");
        return pointF;
    }

    public static RectF LIZLLL(View view, View view2, RectF rectF) {
        if (view != null) {
            if (view == view2) {
                return rectF;
            }
            PointF pointF = new PointF(rectF.left, rectF.top);
            PointF pointF2 = new PointF(rectF.right, rectF.top);
            PointF pointF3 = new PointF(rectF.left, rectF.bottom);
            PointF pointF4 = new PointF(rectF.right, rectF.bottom);
            PointF pointFLIZ = LIZ(pointF, view, view2);
            PointF pointFLIZ2 = LIZ(pointF2, view, view2);
            PointF pointFLIZ3 = LIZ(pointF3, view, view2);
            PointF pointFLIZ4 = LIZ(pointF4, view, view2);
            RectF rectF2 = new RectF();
            rectF2.left = Math.min(Math.min(pointFLIZ.x, pointFLIZ2.x), Math.min(pointFLIZ3.x, pointFLIZ4.x));
            rectF2.top = Math.min(Math.min(pointFLIZ.y, pointFLIZ2.y), Math.min(pointFLIZ3.y, pointFLIZ4.y));
            rectF2.right = Math.max(Math.max(pointFLIZ.x, pointFLIZ2.x), Math.max(pointFLIZ3.x, pointFLIZ4.x));
            rectF2.bottom = Math.max(Math.max(pointFLIZ.y, pointFLIZ2.y), Math.max(pointFLIZ3.y, pointFLIZ4.y));
            return rectF2;
        }
        LynxLog.e("ViewHelper", "convertPointFromAncestorToDescendant failed since ancestor or descendant is null");
        return rectF;
    }

    public static RectF LJ(View view, View view2, RectF rectF) {
        if (view2 != null) {
            if (view2 == view) {
                return rectF;
            }
            PointF pointF = new PointF(rectF.left, rectF.top);
            PointF pointF2 = new PointF(rectF.right, rectF.top);
            PointF pointF3 = new PointF(rectF.left, rectF.bottom);
            PointF pointF4 = new PointF(rectF.right, rectF.bottom);
            PointF pointFLIZIZ = LIZIZ(pointF, view, view2);
            PointF pointFLIZIZ2 = LIZIZ(pointF2, view, view2);
            PointF pointFLIZIZ3 = LIZIZ(pointF3, view, view2);
            PointF pointFLIZIZ4 = LIZIZ(pointF4, view, view2);
            RectF rectF2 = new RectF();
            rectF2.left = Math.min(Math.min(pointFLIZIZ.x, pointFLIZIZ2.x), Math.min(pointFLIZIZ3.x, pointFLIZIZ4.x));
            rectF2.top = Math.min(Math.min(pointFLIZIZ.y, pointFLIZIZ2.y), Math.min(pointFLIZIZ3.y, pointFLIZIZ4.y));
            rectF2.right = Math.max(Math.max(pointFLIZIZ.x, pointFLIZIZ2.x), Math.max(pointFLIZIZ3.x, pointFLIZIZ4.x));
            rectF2.bottom = Math.max(Math.max(pointFLIZIZ.y, pointFLIZIZ2.y), Math.max(pointFLIZIZ3.y, pointFLIZIZ4.y));
            return rectF2;
        }
        LynxLog.e("ViewHelper", "convertPointFromAncestorToDescendant failed since ancestor or descendant is null");
        return rectF;
    }
}
