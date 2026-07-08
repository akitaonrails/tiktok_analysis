package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GX4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX4 extends RelativeLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Object parent = getParent();
        while (true) {
            if (parent instanceof View) {
                if (!(parent instanceof C0GX4)) {
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

    public C0GX4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void LIZ(Canvas canvas, View view) {
        C0GX3 c0gx3;
        int min;
        float f;
        float f2;
        if (view instanceof C0GX3) {
            c0gx3 = (C0GX3) view;
        } else {
            c0gx3 = null;
        }
        if (c0gx3 != null) {
            boolean zLJI = C11VU.LJI(c0gx3);
            if (c0gx3.LLILZLL > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    min = c0gx3.getMin();
                } else {
                    min = 0;
                }
                int max = c0gx3.getMax() - min;
                if (max > 0) {
                    f = ((r2 - min) * 1.0f) / max;
                } else {
                    f = 0.0f;
                }
                float fWidth = c0gx3.LLILLJJLI.getBounds().width();
                float f3 = c0gx3.LLILLL.LIZIZ;
                if (zLJI) {
                    f2 = (((f3 - fWidth) * f) + fWidth) - (f3 / 2.0f);
                } else {
                    f2 = ((fWidth - f3) * f) + (f3 / 2.0f);
                }
                float fCenterY = c0gx3.LLILLJJLI.getBounds().centerY() + (c0gx3.LLILLJJLI.LIZJ / 2.0f) + c0gx3.LLIZLLLIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                offsetDescendantRectToMyCoords(c0gx3, new Rect(0, 0, c0gx3.getWidth(), c0gx3.getHeight()));
                canvas.save();
                canvas.translate(r6.left + c0gx3.getPaddingStart(), r6.top);
                canvas.drawCircle(f2, fCenterY, c0gx3.LLIZLLLIL, c0gx3.LLJ);
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
