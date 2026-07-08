package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847590yBB extends FrameLayout {
    public float LL;
    public Bitmap LLILLJJLI;
    public AbstractC1160070gIH LLILLL;
    public final C01GW LLILZ;

    public final Paint getPaint() {
        return (Paint) this.LLILZ.getValue();
    }

    public final Bitmap getHollowTemplateBitmap() {
        return this.LLILLJJLI;
    }

    public final AbstractC1160070gIH getHollowType() {
        return this.LLILLL;
    }

    public final float getOutlineWidth() {
        return this.LL;
    }

    public C1847590yBB(Context context) {
        super(context);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILLL = C1160080gII.LIZ;
        this.LLILZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(91));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1160060gIG c1160060gIG;
        View viewLIZ = C460180I2u.LIZ(0, this);
        float f = this.LL;
        RectF rectF = new RectF(viewLIZ.getLeft() - f, viewLIZ.getTop() - f, viewLIZ.getRight() + f, viewLIZ.getBottom() + f);
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, getPaint());
        } else {
            AbstractC1160070gIH abstractC1160070gIH = this.LLILLL;
            if (abstractC1160070gIH instanceof C1160080gII) {
                canvas.drawArc(rectF, -90.0f, 360.0f, false, getPaint());
            } else if ((abstractC1160070gIH instanceof C1160060gIG) && (c1160060gIG = (C1160060gIG) abstractC1160070gIH) != null) {
                float f2 = c1160060gIG.LIZ;
                canvas.drawRoundRect(rectF, f2, f2, getPaint());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void setHollowTemplateBitmap(Bitmap bitmap) {
        this.LLILLJJLI = bitmap;
    }

    public final void setHollowType(AbstractC1160070gIH abstractC1160070gIH) {
        this.LLILLL = abstractC1160070gIH;
    }

    public final void setOutlineWidth(float f) {
        this.LL = f;
    }

    public C1847590yBB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILLL = C1160080gII.LIZ;
        this.LLILZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(91));
    }
}
