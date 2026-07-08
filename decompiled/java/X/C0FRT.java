package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FRT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRT extends FrameLayout {
    public final C0FRQ LL;
    public final C0FRQ LLILLJJLI;
    public final View LLILLL;
    public boolean LLILZ;
    public final Paint LLILZIL;

    public final int getFirstSlotCenterX() {
        return this.LL.getLeft() + (this.LL.getWidth() / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        if (this.LLILLL.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLILZ || this.LLILLJJLI.getVisibility() != 0) {
            z2 = false;
        }
        if (!z && !z2) {
            super.dispatchDraw(canvas);
            return;
        }
        if (z2) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            drawChild(canvas, this.LLILLJJLI, getDrawingTime());
            canvas.drawCircle(this.LL.getLeft() + (this.LL.getWidth() / 2.0f), this.LL.getTop() + (this.LL.getHeight() / 2.0f), (C418440Gaw.LIZIZ(26) / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))), this.LLILZIL);
            canvas.restoreToCount(iSaveLayer);
            drawChild(canvas, this.LL, getDrawingTime());
            return;
        }
        if (!z) {
            return;
        }
        int iSaveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        drawChild(canvas, this.LL, getDrawingTime());
        canvas.drawCircle(this.LLILLL.getLeft() + (this.LLILLL.getWidth() / 2.0f), this.LLILLL.getTop() + (this.LLILLL.getHeight() / 2.0f), (C418440Gaw.LIZIZ(12) / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))), this.LLILZIL);
        canvas.restoreToCount(iSaveLayer2);
        drawChild(canvas, this.LLILLL, getDrawingTime());
    }

    public C0FRT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLILZIL = paint;
        setClipChildren(false);
        setClipToPadding(false);
        C0FRQ c0frq = new C0FRQ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        layoutParams.gravity = 8388627;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0frq);
        c0frq.setLayoutParams(layoutParams);
        this.LL = c0frq;
        C0FRQ c0frq2 = new C0FRQ(context);
        int visibility = c0frq2.getVisibility();
        c0frq2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0frq2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0frq2);
        c0frq2.setLayoutParams(layoutParams2);
        this.LLILLJJLI = c0frq2;
        View view = new View(context);
        C786410Ut5.LJLLLLLL(8, view);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus_tiny_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.as5);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        view.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams3.gravity = 8388691;
        layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        C786410Ut5.W5(view, layoutParams3);
        this.LLILLL = view;
        addView(c0frq);
        addView(c0frq2);
        addView(view);
        setLayerType(2, null);
        setWillNotDraw(false);
    }
}
