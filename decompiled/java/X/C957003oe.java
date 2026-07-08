package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957003oe extends LinearLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public Paint LLILLL;
    public final Paint LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public int LLIZ;

    public final SmartImageView getTagIcFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x1b);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTagTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x29);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Paint getCirclePaint() {
        return this.LLILLL;
    }

    public final int getTextFont() {
        return this.LLIZ;
    }

    public C957003oe(Context context) {
        int i;
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bpo, this, true);
        setBackground(C800330VaR.LIZIZ(context, R.drawable.bj4));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        this.LLIZ = 92;
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        paint.setDither(true);
        Paint paint2 = this.LLILLL;
        if (paint2 != null) {
            if (C960203pA.LIZIZ(context)) {
                i = R.attr.bw;
            } else {
                i = R.attr.bx;
            }
            paint2.setColor(C960203pA.LIZ(i, context));
        }
        Paint paint3 = this.LLILLL;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        Paint paint4 = new Paint(1);
        this.LLILZ = paint4;
        paint4.setDither(true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        paint4.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        paint4.setAlpha(26);
        paint4.setStyle(Paint.Style.STROKE);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        double height = ((double) getHeight()) / 2.0d;
        int i = this.LLILZLL;
        float f = (float) (height - (((double) i) / 2.0d));
        Paint paint = this.LLILLL;
        if (paint != null) {
            int i2 = this.LLILZIL;
            canvas.drawOval(-(i2 / 2), f, i2 / 2, f + i, paint);
        }
        Paint paint2 = this.LLILLL;
        if (paint2 != null) {
            canvas.drawOval(getWidth() - (this.LLILZIL / 2), f, getWidth() + (this.LLILZIL / 2), f + this.LLILZLL, paint2);
        }
        Paint paint3 = this.LLILZ;
        if (paint3 != null) {
            int i3 = this.LLILZIL;
            canvas.drawArc(-(i3 / 2), f, i3 / 2, f + this.LLILZLL, 0.0f, 360.0f, false, paint3);
        }
        Paint paint4 = this.LLILZ;
        if (paint4 != null) {
            canvas.drawArc(getWidth() - (this.LLILZIL / 2), f, getWidth() + (this.LLILZIL / 2), f + this.LLILZLL, 0.0f, 360.0f, false, paint4);
        }
    }

    public final void setCirclePaint(Paint paint) {
        this.LLILLL = paint;
    }

    public final void setTagIcFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTagText(String str) {
        int iIntValue;
        C786410Ut5.LLFF(8, getTagIcFromXml());
        getTagTextFromXml().setText(str);
        TuxTextView tagTextFromXml = getTagTextFromXml();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tagTextFromXml.setTextColor(iIntValue);
        C426750GoL.LJIIIZ(getTagTextFromXml(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), false, 16);
    }

    public final void setTagTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTextFont(int i) {
        this.LLIZ = i;
    }
}
