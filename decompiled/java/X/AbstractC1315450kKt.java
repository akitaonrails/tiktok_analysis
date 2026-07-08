package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0kKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1315450kKt extends AbstractC1316910kNF {
    public static final /* synthetic */ int LLJJI = 0;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;
    public C1313270kHN LLJILLL;
    public Drawable.Callback LLJJ;

    public abstract Drawable LIZJ();

    public void LIZLLL() {
    }

    public abstract void LJ();

    public abstract void LJFF();

    public abstract void LJI();

    public abstract void LJII();

    @Override // X.AbstractC1316910kNF
    public final int LIZ() {
        return this.LLILZLL + this.LLJIJIL;
    }

    public final int LIZIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        float f;
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        int i5 = this.LLILZLL + this.LLJIJIL;
        switch (this.LL) {
            case 1:
                return -i5;
            case 2:
                return (i2 - i5) - ((int) (i4 * 0.1f));
            case 3:
                return i3 + ((int) (i4 * 0.1f));
            case 4:
            case 5:
                return i3;
            case 6:
            default:
                return i3 + ((i4 - i5) / 2);
            case 7:
            case 8:
                return i2 - i5;
            case BdTuring.TYPE_ECAF /* 9 */:
                i = -i5;
                f = this.LLILLJJLI;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                i = -i5;
                f = (this.LLILLJJLI * i4) / 100.0f;
                break;
        }
        return i - ((int) f);
    }

    public void LJIIIZ(Drawable.Callback callback) {
        this.LLJJ = callback;
    }

    public static void LJIIIIZZ(Spanned spanned, Drawable.Callback callback) {
        for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
            abstractC1315450kKt.LJ();
            abstractC1315450kKt.LJIIIZ(callback);
        }
    }

    public AbstractC1315450kKt(int i, int i2, int[] iArr) {
        this.LLIZ = i;
        this.LLILZLL = i2;
        int i3 = iArr[0];
        this.LLIZLLLIL = i3;
        int i4 = iArr[1];
        this.LLJ = i4;
        this.LLJI = i3 + iArr[2];
        this.LLJIJIL = i4 + iArr[3];
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (!(charSequence instanceof SpannableStringBuilder) && charSequence.charAt(i) != "I".charAt(0)) {
            return 0;
        }
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            if (this.LLILZIL) {
                float fLIZ = -(this.LLILZLL + this.LLJIJIL);
                C1316870kNB c1316870kNB = this.LLILZ;
                if (c1316870kNB != null) {
                    fLIZ = c1316870kNB.LIZ(this.LLILLJJLI, fLIZ, 0.0f, this.LL);
                }
                this.LLILLL = (int) fLIZ;
            } else {
                this.LLILLL = LIZIZ(fontMetricsInt);
            }
            int i3 = fontMetricsInt.ascent;
            int i4 = this.LLILLL;
            if (i3 > i4) {
                fontMetricsInt.ascent = i4;
            }
            int i5 = fontMetricsInt.descent;
            int i6 = i4 + this.LLILZLL + this.LLJIJIL;
            if (i5 < i6) {
                fontMetricsInt.descent = i6;
            }
            int i7 = fontMetricsInt.top;
            int i8 = fontMetricsInt.ascent;
            if (i7 > i8) {
                fontMetricsInt.top = i8;
            }
            int i9 = fontMetricsInt.bottom;
            int i10 = fontMetricsInt.descent;
            if (i9 < i10) {
                fontMetricsInt.bottom = i10;
            }
        }
        return this.LLIZ + this.LLJI;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        BackgroundDrawable backgroundDrawable;
        int iLIZIZ;
        if ((!(charSequence instanceof SpannableStringBuilder) && charSequence.charAt(i) != "I".charAt(0)) || LIZJ() == null) {
            return;
        }
        Drawable drawableLIZJ = LIZJ();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i7 = this.LL;
        if (i7 != 4) {
            if (i7 != 7) {
                if (i7 != 11) {
                    if (this.LLILZIL) {
                        iLIZIZ = this.LLILLL;
                    } else if (i7 == 6) {
                        i6 = (((i5 + i3) - this.LLILZLL) - this.LLJIJIL) / 2;
                    } else {
                        iLIZIZ = LIZIZ(fontMetricsInt);
                    }
                    i6 = iLIZIZ + i4;
                } else {
                    i6 = (((i5 + i3) - this.LLILZLL) - this.LLJIJIL) / 2;
                }
            } else {
                i6 = (i5 - this.LLILZLL) - this.LLJIJIL;
            }
        } else {
            i6 = i3;
        }
        if (this.LLJILJIL != 0) {
            Rect rect = new Rect(Math.round(f), Math.round(i3 + this.LLJILJILJ), Math.round(drawableLIZJ.getBounds().width() + f), Math.round(i5 + this.LLJILJILJ));
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.LLJILJIL);
            canvas.drawRect(rect, paint2);
        }
        canvas.translate(f + this.LLIZLLLIL, i6 + this.LLJ + this.LLJILJILJ);
        C1313270kHN c1313270kHN = this.LLJILLL;
        if (c1313270kHN != null && (backgroundDrawable = (BackgroundDrawable) c1313270kHN.LIZIZ) != null) {
            backgroundDrawable.draw(canvas);
            if (((BackgroundDrawable) this.LLJILLL.LIZIZ).LJIIJJI() != null) {
                canvas.clipPath(((BackgroundDrawable) this.LLJILLL.LIZIZ).LJIIJJI());
            }
        }
        drawableLIZJ.draw(canvas);
        canvas.restore();
    }
}
