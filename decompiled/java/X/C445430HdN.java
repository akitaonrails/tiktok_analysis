package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0HdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445430HdN extends C645200PSk {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Integer LLJ;
    public Integer LLJI;

    private final Rect getE2eStatusBarRect() {
        return (Rect) this.LLILZ.getValue();
    }

    private final Paint getFakeStatusBarPaint() {
        return (Paint) this.LL.getValue();
    }

    private final Rect getFakeStatusBarRect() {
        return (Rect) this.LLILLL.getValue();
    }

    private final Paint getHandlePaint() {
        return (Paint) this.LLILZLL.getValue();
    }

    private final RectF getHandleRect() {
        return (RectF) this.LLILZIL.getValue();
    }

    public final int getStatusBarHeight() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public final boolean getShouldDrawHandleRect() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.LLIZ) {
            Integer num = this.LLJI;
            if (num != null) {
                getFakeStatusBarPaint().setColor(num.intValue());
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                    getE2eStatusBarRect().right = C0SK0.LIZ(getContext());
                }
                canvas.drawRect(getE2eStatusBarRect(), getFakeStatusBarPaint());
                return;
            }
            return;
        }
        Integer num2 = this.LLJ;
        if (num2 != null) {
            getFakeStatusBarPaint().setColor(num2.intValue());
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                getFakeStatusBarRect().right = C0SK0.LIZ(getContext());
            }
            canvas.drawRect(getFakeStatusBarRect(), getFakeStatusBarPaint());
        }
        if (this.LLIZLLLIL) {
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                float fLIZIZ = C418440Gaw.LIZIZ(36) / 2;
                getHandleRect().left = (C0SK0.LIZ(getContext()) / 2) - fLIZIZ;
                getHandleRect().right = (C0SK0.LIZ(getContext()) / 2) + fLIZIZ;
            }
            canvas.drawRoundRect(getHandleRect(), C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(2), getHandlePaint());
        }
    }

    public final void setDynamicStatusBarHeightPercent(float f) {
        if (!this.LLIZ) {
            return;
        }
        int statusBarHeight = (int) (getStatusBarHeight() * f);
        getHandlePaint().setAlpha(Math.min(255, Math.max(0, (int) ((1 - f) * 30.599998f))));
        getHandleRect().top = C418440Gaw.LIZIZ(5) + (statusBarHeight / 2);
        getHandleRect().bottom = getHandleRect().top + C418440Gaw.LIZIZ(4);
        getFakeStatusBarRect().bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)) + statusBarHeight;
        setPadding(getPaddingLeft(), (int) C13LZ.LIZLLL(statusBarHeight + C418440Gaw.LIZIZ(14), 0.0f, getStatusBarHeight()), getPaddingRight(), getPaddingBottom());
    }

    public final void setE2eStatusBarColor(Integer num) {
        this.LLJI = num;
        invalidate();
    }

    public final void setEnableSevenSplitMode(boolean z) {
        this.LLIZ = z;
    }

    public final void setFakeStatusBarColor(Integer num) {
        this.LLJ = num;
        invalidate();
    }

    public final void setShouldDrawHandleRect(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C445430HdN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new C445470HdR());
        this.LLILLJJLI = C452501pT.LIZIZ(new C445450HdP(context));
        this.LLILLL = C452501pT.LIZIZ(new C445440HdO(context, this));
        this.LLILZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 114));
        this.LLILZIL = C452501pT.LIZIZ(new C0GTC(context));
        this.LLILZLL = C452501pT.LIZIZ(new C413170GHz(context));
        this.LLIZLLLIL = true;
    }
}
