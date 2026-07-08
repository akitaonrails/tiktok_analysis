package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ea2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366920Ea2 extends ConstraintLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final Rect LLIZ;
    public final Rect LLIZLLLIL;
    public final View LLJ;
    public final ConstraintLayout LLJI;
    public final C01GW LLJIJIL;
    public final int LLJILJIL;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(this.LLIZLLLIL, this.LLILLJJLI);
        super.dispatchDraw(canvas);
        Rect rect = this.LLIZ;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float f5 = this.LLILLL;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.LL);
    }

    public C366920Ea2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C366920Ea2(Context context, AttributeSet attributeSet, int i) {
        float fLIZIZ;
        int i2;
        int iLIZIZ;
        Integer numLIZJ;
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        if (C293820BfQ.LIZ()) {
            fLIZIZ = C418440Gaw.LIZIZ(6);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(4);
        }
        this.LLILLL = fLIZIZ;
        if (C293820BfQ.LIZ()) {
            i2 = 28;
        } else {
            i2 = 22;
        }
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZIL = iLIZIZ2;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C293820BfQ.LIZ() ? 4 : 2));
        this.LLIZ = new Rect(0, 0, 0, 0);
        this.LLIZLLLIL = new Rect(0, 0, 0, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c2n, this, true);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 760));
        this.LLJIJIL = c01gwLIZIZ;
        if (C293820BfQ.LIZ()) {
            if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
                iLIZIZ = iLIZIZ2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
            } else {
                iLIZIZ = iLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        this.LLJILJIL = iLIZIZ;
        this.LLJ = viewTd.findViewById(R.id.yi0);
        this.LLJI = (ConstraintLayout) viewTd.findViewById(R.id.yhz);
        if (C293820BfQ.LIZ()) {
            View view = this.LLJ;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setAntiAlias(true);
        Integer numValueOf = Integer.valueOf(R.attr.bm);
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), context)) != null) {
            paint2.setColor(numLIZJ.intValue());
        }
        paint2.setAlpha(153);
    }
}
