package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0l1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342010l1j extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final TextPaint LLILLL;
    public final TextPaint LLILZ;
    public final TextPaint LLILZIL;
    public final TextPaint LLILZLL;
    public final TextPaint LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ C1342000l1i LLJI;

    public final void LIZIZ() {
        int iLIZ;
        int i;
        if (this.LLJI.getHasSelection()) {
            C1342000l1i c1342000l1i = this.LLJI;
            iLIZ = c1342000l1i.LLILZIL ? C1342000l1i.LIZ(c1342000l1i.getTextActive(), c1342000l1i.LLJJJIL, c1342000l1i.LLJJIJIL) : c1342000l1i.LLJJJJ;
        } else {
            iLIZ = this.LLJI.LLJJJIL;
        }
        if (this.LLJI.getHasSelection()) {
            C1342000l1i c1342000l1i2 = this.LLJI;
            i = c1342000l1i2.LLILZIL ? c1342000l1i2.LLJJJIL : c1342000l1i2.LLJJJJ;
        } else {
            i = this.LLJI.LLJJJIL;
        }
        this.LLILLL.setColor(iLIZ);
        this.LLILZ.setColor(i);
    }

    public final void LIZJ() {
        int iLIZ;
        if (this.LLJI.getHasSelection()) {
            C1342000l1i c1342000l1i = this.LLJI;
            iLIZ = c1342000l1i.LLILZIL ? C1342000l1i.LIZ(c1342000l1i.getTextActive(), c1342000l1i.LLJJJIL, c1342000l1i.LLJJIJIL) : c1342000l1i.LLJJJJ;
        } else {
            iLIZ = this.LLJI.LLJJJIL;
        }
        C1342000l1i c1342000l1i2 = this.LLJI;
        int i = c1342000l1i2.LLILZIL ? c1342000l1i2.LLJJJIL : c1342000l1i2.LLJJJJJIL;
        this.LLIZLLLIL = C1342000l1i.LIZIZ(c1342000l1i2.getPercentAlpha(), iLIZ);
        this.LLJ = C1342000l1i.LIZIZ(this.LLJI.getPercentAlpha(), i);
        this.LLIZ.setColor(this.LLIZLLLIL);
        this.LLILZIL.setColor(this.LLJ);
        this.LLILZLL.setColor(this.LLJ);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float fLIZLLL;
        float f;
        float f2;
        float avatarSizePx;
        float horizontalPaddingPx;
        float horizontalPaddingPx2;
        TextPaint textPaint;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f3 = 0.0f;
        if (width > 0.0f && height > 0.0f) {
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            Paint paint = this.LL;
            if (this.LLJI.getHasSelection()) {
                i = this.LLJI.LLJJIJIIJIL;
            } else {
                i = this.LLJI.LLJJJ;
            }
            paint.setColor(i);
            canvas.drawRect(0.0f, 0.0f, width, height, this.LL);
            if (!this.LLJI.getHasSelection()) {
                i2 = this.LLJI.LLJJIJIIJIL;
            } else {
                C1342000l1i c1342000l1i = this.LLJI;
                if (c1342000l1i.LLILZIL) {
                    i2 = c1342000l1i.LLJJJIL;
                } else {
                    i2 = c1342000l1i.LLJJL;
                }
            }
            this.LLILLJJLI.setColor(i2);
            float fLIZLLL2 = C13LZ.LIZLLL((this.LLJI.getFillPercent() / 100.0f) * width, 0.0f, width);
            if (this.LLJI.getFillPercent() <= 0.0f && !this.LLJI.getHasAnyVote()) {
                fLIZLLL = 0.0f;
            } else if (this.LLJI.getFillPercent() >= 100.0f) {
                fLIZLLL = width;
            } else {
                float fMin = Math.min(this.LLJI.getEdgeReservePx(), width);
                fLIZLLL = C13LZ.LIZLLL(fLIZLLL2, fMin, Math.max(fMin, width - this.LLJI.getEdgeReservePx()));
            }
            if (z) {
                f = width - fLIZLLL;
                f2 = width;
            } else {
                f = 0.0f;
                f2 = fLIZLLL;
            }
            if (fLIZLLL > 0.0f) {
                canvas.drawRect(f, 0.0f, f2, height, this.LLILLJJLI);
            }
            String displayPercentText = this.LLJI.getDisplayPercentText();
            float fMeasureText = this.LLILZLL.measureText(displayPercentText);
            C1342000l1i c1342000l1i2 = this.LLJI;
            if (c1342000l1i2.LLJL) {
                avatarSizePx = c1342000l1i2.getAvatarSizePx() + this.LLJI.getGapAvatarPercentPx();
            } else {
                avatarSizePx = 0.0f;
            }
            float horizontalPaddingPx3 = ((width - this.LLJI.getHorizontalPaddingPx()) - ((avatarSizePx + fMeasureText) + this.LLJI.getHorizontalPaddingPx())) - this.LLJI.getHorizontalPaddingPx();
            if (horizontalPaddingPx3 >= 0.0f) {
                f3 = horizontalPaddingPx3;
            }
            String string = TextUtils.ellipsize(this.LLJI.getOptionLabel(), this.LLILZ, f3, TextUtils.TruncateAt.END).toString();
            float fMeasureText2 = this.LLILZ.measureText(string);
            if (z) {
                horizontalPaddingPx = (width - this.LLJI.getHorizontalPaddingPx()) - fMeasureText2;
            } else {
                horizontalPaddingPx = this.LLJI.getHorizontalPaddingPx();
            }
            float f4 = height / 2.0f;
            LIZ(canvas, string, horizontalPaddingPx, fMeasureText2, f4 - ((this.LLILZ.descent() + this.LLILZ.ascent()) / 2.0f), f, f2, height, this.LLILLL, this.LLILZ);
            if (z) {
                horizontalPaddingPx2 = this.LLJI.getHorizontalPaddingPx();
            } else {
                horizontalPaddingPx2 = (width - this.LLJI.getHorizontalPaddingPx()) - fMeasureText;
            }
            float fDescent = f4 - ((this.LLILZLL.descent() + this.LLILZLL.ascent()) / 2.0f);
            if (this.LLJI.LLILZIL) {
                textPaint = this.LLILZLL;
            } else {
                textPaint = this.LLILZIL;
            }
            LIZ(canvas, displayPercentText, horizontalPaddingPx2, fMeasureText, fDescent, f, f2, height, this.LLIZ, textPaint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342010l1j(C1342000l1i c1342000l1i, Context context) {
        super(context);
        this.LLJI = c1342000l1i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        TextPaint textPaint = new TextPaint(1);
        Float fValueOf = Float.valueOf(14.0f);
        textPaint.setTextSize(C0HD5.LIZIZ(this, fValueOf));
        textPaint.setTypeface(c1342000l1i.LLJJIII);
        this.LLILLL = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(C0HD5.LIZIZ(this, fValueOf));
        textPaint2.setTypeface(c1342000l1i.LLJJIII);
        this.LLILZ = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setTextSize(C0HD5.LIZIZ(this, fValueOf));
        textPaint3.setTypeface(c1342000l1i.LLJJIII);
        textPaint3.setFontFeatureSettings("tnum");
        this.LLILZIL = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        textPaint4.setTextSize(C0HD5.LIZIZ(this, fValueOf));
        textPaint4.setTypeface(c1342000l1i.LLJJIII);
        textPaint4.setFontFeatureSettings("tnum");
        this.LLILZLL = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        textPaint5.setTextSize(C0HD5.LIZIZ(this, fValueOf));
        textPaint5.setTypeface(c1342000l1i.LLJJIII);
        textPaint5.setFontFeatureSettings("tnum");
        this.LLIZ = textPaint5;
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(this.LLJI.getAvatarSizePx()), 1073741824);
        this.LLJI.LLJJLIIIJLLLLLLLZ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float horizontalPaddingPx;
        float f = i3 - i;
        float f2 = i4 - i2;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        float fMeasureText = this.LLILZLL.measureText(this.LLJI.getDisplayPercentText());
        if (z2) {
            horizontalPaddingPx = this.LLJI.getHorizontalPaddingPx() + fMeasureText + this.LLJI.getGapAvatarPercentPx();
        } else {
            horizontalPaddingPx = (((f - this.LLJI.getHorizontalPaddingPx()) - fMeasureText) - this.LLJI.getGapAvatarPercentPx()) - this.LLJI.getAvatarSizePx();
        }
        float avatarSizePx = (f2 - this.LLJI.getAvatarSizePx()) / 2.0f;
        int iLIZIZ = C814420VxA.LIZIZ(this.LLJI.getAvatarSizePx());
        this.LLJI.LLJJLIIIJLLLLLLLZ.layout(C814420VxA.LIZIZ(horizontalPaddingPx), C814420VxA.LIZIZ(avatarSizePx), C814420VxA.LIZIZ(horizontalPaddingPx) + iLIZIZ, C814420VxA.LIZIZ(avatarSizePx) + iLIZIZ);
    }

    public static void LIZ(Canvas canvas, String str, float f, float f2, float f3, float f4, float f5, float f6, TextPaint textPaint, TextPaint textPaint2) {
        int iSave;
        if (f2 <= 0.0f) {
            return;
        }
        float f7 = f2 + f;
        float fMax = Math.max(f, f4);
        float fMin = Math.min(f7, f5);
        if (fMax < fMin) {
            iSave = canvas.save();
            try {
                canvas.clipRect(fMax, 0.0f, fMin, f6);
                canvas.drawText(str, f, f3, textPaint);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        if (f < fMax) {
            iSave = canvas.save();
            try {
                canvas.clipRect(f, 0.0f, fMax, f6);
                canvas.drawText(str, f, f3, textPaint2);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        if (fMin < f7) {
            int iSave2 = canvas.save();
            try {
                canvas.clipRect(Math.max(fMin, f), 0.0f, f7, f6);
                canvas.drawText(str, f, f3, textPaint2);
                canvas.restoreToCount(iSave2);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave2);
            }
        }
    }
}
