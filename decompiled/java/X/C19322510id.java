package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.10id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19322510id extends C1091700eW0 {
    public C20244814Ji LLILLL;
    public final Paint LLILZ;

    public C19322510id(Context context) {
        super(context);
        this.LLILZ = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        super.dispatchDraw(canvas);
        if (this.LLILLL != null) {
            boolean z2 = false;
            if (getContext().getResources().getConfiguration().orientation == 1) {
                z = true;
            } else {
                z = false;
            }
            if (getLayoutDirection() == 1) {
                z2 = true;
            }
            if (z) {
                if (this.LLILLL.LIZLLL > 0) {
                    canvas.drawRect(0.0f, getHeight() - this.LLILLL.LIZLLL, getWidth(), getHeight(), this.LLILZ);
                }
            } else {
                if (z2) {
                    int i = this.LLILLL.LIZ;
                    if (i <= 0) {
                        return;
                    }
                    canvas.drawRect(0.0f, 0.0f, i, getHeight(), this.LLILZ);
                    return;
                }
                if (this.LLILLL.LIZJ <= 0) {
                    return;
                }
                canvas.drawRect(getWidth() - this.LLILLL.LIZJ, 0.0f, getWidth(), getHeight(), this.LLILZ);
            }
        }
    }

    public void setColor(int i) {
        this.LLILZ.setColor(i);
        invalidate();
    }

    public void setNavigationInsets(C20244814Ji c20244814Ji) {
        this.LLILLL = c20244814Ji;
        invalidate();
    }
}
