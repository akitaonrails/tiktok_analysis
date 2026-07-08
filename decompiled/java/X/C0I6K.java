package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6K extends FrameLayout {
    public boolean LL;
    public final C01GW LLILLJJLI;
    public C0I6M LLILLL;
    public final float[] LLILZ;
    public final Path LLILZIL;

    private final Paint getBorderPaint() {
        return (Paint) this.LLILLJJLI.getValue();
    }

    public final void LIZ(Canvas canvas) {
        C0I6M c0i6m = this.LLILLL;
        if (!Intrinsics.LJFF(c0i6m, C0I6Q.LIZ)) {
            if (Intrinsics.LJFF(c0i6m, C0I62.LIZ)) {
                this.LLILZIL.reset();
                this.LLILZIL.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, Path.Direction.CW);
                canvas.clipPath(this.LLILZIL);
            } else if (Intrinsics.LJFF(c0i6m, new C0I6M() { // from class: X.0I6P
            })) {
                this.LLILZIL.reset();
                this.LLILZIL.addOval(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
                canvas.clipPath(this.LLILZIL);
            } else if (c0i6m instanceof C07Y6) {
                float f = ((C07Y6) c0i6m).LIZ;
                LIZIZ(canvas, f, f, f, f);
            } else {
                if (c0i6m instanceof C07Y7) {
                    C07Y7 c07y7 = (C07Y7) c0i6m;
                    LIZIZ(canvas, c07y7.LIZ, c07y7.LIZIZ, c07y7.LIZJ, c07y7.LIZLLL);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        LIZ(canvas);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.LL) {
            canvas.drawPath(this.LLILZIL, getBorderPaint());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LIZ(canvas);
        super.onDraw(canvas);
    }

    public final void setBorder(C0I6N c0i6n) {
        int iIntValue = 0;
        if (Intrinsics.LJFF(c0i6n, C0I6R.LIZ)) {
            this.LL = false;
        } else if (c0i6n instanceof C0I6L) {
            this.LL = true;
            getBorderPaint().setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(r5.LIZ))));
            Paint borderPaint = getBorderPaint();
            Integer numLIZJ = C1308910kAL.LIZJ(((C0I6L) c0i6n).LIZIZ, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            borderPaint.setColor(iIntValue);
        } else {
            throw new C1954807lC();
        }
        invalidate();
    }

    public final void setStyle(C0I6M c0i6m) {
        this.LLILLL = c0i6m;
        invalidate();
    }

    public C0I6K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C1509305vX.LIZ(AFwS192S0000000_6.get$arr$(421));
        this.LLILLL = C0I6Q.LIZ;
        this.LLILZ = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LLILZIL = new Path();
    }

    public final void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4) {
        float[] fArr = this.LLILZ;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
        this.LLILZIL.reset();
        this.LLILZIL.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILZ, Path.Direction.CW);
        canvas.clipPath(this.LLILZIL);
    }
}
