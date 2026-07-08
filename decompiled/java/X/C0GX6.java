package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GX6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX6 extends RelativeLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Object parent = getParent();
        while (true) {
            if (parent instanceof View) {
                if (!(parent instanceof C0GX6)) {
                    parent = ((View) parent).getParent();
                } else {
                    return;
                }
            } else {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LIZ(canvas, getChildAt(i));
                }
                return;
            }
        }
    }

    public C0GX6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void LIZ(Canvas canvas, View view) {
        C0GX9 c0gx9;
        int min;
        float f;
        float f2;
        if (view instanceof C0GX9) {
            c0gx9 = (C0GX9) view;
        } else {
            c0gx9 = null;
        }
        if (c0gx9 != null) {
            boolean zLJI = C11VU.LJI(c0gx9);
            if (c0gx9.LLIZ > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    min = c0gx9.getMin();
                } else {
                    min = 0;
                }
                int max = c0gx9.getMax() - min;
                if (max > 0) {
                    f = ((r2 - min) * 1.0f) / max;
                } else {
                    f = 0.0f;
                }
                float fWidth = c0gx9.LLILLL.getBounds().width();
                float f3 = c0gx9.LLILZIL.LIZ;
                if (zLJI) {
                    f2 = (((f3 - fWidth) * f) + fWidth) - (f3 / 2.0f);
                } else {
                    f2 = ((fWidth - f3) * f) + (f3 / 2.0f);
                }
                float fCenterY = c0gx9.LLILLL.getBounds().centerY() + (c0gx9.LLILZIL.LIZIZ / 2.0f) + c0gx9.LLIZLLLIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                offsetDescendantRectToMyCoords(c0gx9, new Rect(0, 0, c0gx9.getWidth(), c0gx9.getHeight()));
                canvas.save();
                canvas.translate(r6.left + c0gx9.getPaddingStart(), r6.top);
                canvas.drawCircle(f2, fCenterY, c0gx9.LLIZLLLIL, c0gx9.LLJ);
                canvas.restore();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZ(canvas, viewGroup.getChildAt(i));
            }
        }
    }
}
