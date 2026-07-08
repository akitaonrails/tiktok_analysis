package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJN extends TuxTextView {
    public final Paint LLJJJJ;
    public final RectF LLJJJJJIL;
    public final Paint LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public boolean LLJLIL;

    public C0FJN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float height = (float) ((((double) getHeight()) / 2.0d) - (((double) this.LLJJLIIIJLLLLLLLZ) / 2.0d));
        RectF rectF = this.LLJJJJJIL;
        float f = this.LLJL;
        canvas.drawRoundRect(rectF, f, f, this.LLJJJJ);
        if (this.LLJLIL) {
            float f2 = 0;
            float f3 = this.LLJJL;
            float f4 = 2;
            canvas.drawOval(f2 - (f3 / f4), height, f2 + (f3 / f4), height + this.LLJJLIIIJLLLLLLLZ, this.LLJJJJLIIL);
            canvas.drawOval(getWidth() - (this.LLJJL / f4), height, getWidth() + (this.LLJJL / f4), height + this.LLJJLIIIJLLLLLLLZ, this.LLJJJJLIIL);
        }
        super.onDraw(canvas);
    }

    public C0FJN(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJJJ = new Paint(1);
        this.LLJJJJJIL = new RectF();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLJJJJLIIL = paint;
        this.LLJJL = C418440Gaw.LIZIZ(6);
        this.LLJJLIIIJLLLLLLLZ = C418440Gaw.LIZIZ(6);
        this.LLJL = C418440Gaw.LIZIZ(4);
        this.LLJLIL = true;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.LLJJJJJIL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = i3 - i;
        rectF.bottom = i4 - i2;
    }

    public final void LJJJJJ(Integer num, Integer num2, Integer num3, C0FJO c0fjo, Float f, Float f2, Float f3, boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 72;
        }
        setTuxFont(iIntValue);
        int iIntValue4 = R.attr.a1r;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = R.attr.a1r;
        }
        setTextColorRes(iIntValue2);
        Context context = getContext();
        if (num2 != null) {
            iIntValue4 = num2.intValue();
        }
        setTextColor(C960203pA.LIZ(iIntValue4, context));
        Paint paint = this.LLJJJJ;
        paint.setDither(true);
        Context context2 = getContext();
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = R.attr.a07;
        }
        paint.setColor(C960203pA.LIZ(iIntValue3, context2));
        paint.setStyle(Paint.Style.FILL);
        if (c0fjo != null) {
            setPadding(c0fjo.LIZ, c0fjo.LIZIZ, c0fjo.LIZJ, c0fjo.LIZLLL);
        }
        setLayerType(2, null);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        if (f != null) {
            fLIZIZ = f.floatValue();
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(6);
        }
        this.LLJJL = fLIZIZ;
        if (f2 != null) {
            fLIZIZ2 = f2.floatValue();
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(6);
        }
        this.LLJJLIIIJLLLLLLLZ = fLIZIZ2;
        if (f3 != null) {
            fLIZIZ3 = f3.floatValue();
        } else {
            fLIZIZ3 = C418440Gaw.LIZIZ(4);
        }
        this.LLJL = fLIZIZ3;
        this.LLJLIL = z;
    }
}
