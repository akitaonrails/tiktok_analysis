package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EJV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJV extends View {
    public static final /* synthetic */ int LLJ = 0;
    public Integer LL;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final float LLIZ;
    public final C01GW LLIZLLLIL;

    private final Paint getPaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        Integer num = this.LL;
        if (num != null) {
            getPaint().setColor(num.intValue());
        }
        if (!this.LLILZ) {
            getPaint().setStyle(Paint.Style.FILL);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() / 2.0f) - this.LLILZIL) - this.LLILZLL, getPaint());
        } else {
            getPaint().setStyle(Paint.Style.FILL);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() / 2.0f) - this.LLILZIL) - this.LLILZLL, getPaint());
            Paint paint = getPaint();
            Integer num2 = this.LLILLL;
            if (num2 == null && (num2 = this.LL) == null) {
                iIntValue = -1;
            } else {
                iIntValue = num2.intValue();
            }
            paint.setColor(iIntValue);
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(this.LLILZIL);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() - this.LLILZIL) / 2.0f, getPaint());
        }
        Integer num3 = this.LLILLJJLI;
        if (num3 != null) {
            getPaint().setColor(num3.intValue());
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(this.LLIZ);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (((getWidth() / 2.0f) - this.LLILZIL) - this.LLILZLL) - (this.LLIZ / 2), getPaint());
        }
    }

    public final void setSelect(boolean z) {
        this.LLILZ = z;
        invalidate();
    }

    public C0EJV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C418440Gaw.LIZIZ(2);
        this.LLILZLL = C418440Gaw.LIZIZ(2);
        this.LLIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(139));
    }
}
