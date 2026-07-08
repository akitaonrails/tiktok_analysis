package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.ReplacementSpan;
import android.text.style.UpdateAppearance;
import android.text.style.UpdateLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21409218qQ extends ReplacementSpan implements LeadingMarginSpan, SpanWatcher {
    public final C448860Hiu LL;
    public final C445110Hcr LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public final GradientDrawable LLILZIL;
    public final TextPaint LLILZLL;
    public final TextPaint LLIZ;
    public final int LLIZLLLIL;
    public final TreeMap<Point, Layout> LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final int LIZ() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LLJILJIL.getValue()).booleanValue();
    }

    public final int LIZJ() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return C445120Hcs.LIZ(3);
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.LL.LIZ(textPaint);
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.LL.LIZ(textPaint);
    }

    public C21409218qQ(C448860Hiu c448860Hiu, C445110Hcr c445110Hcr, int i) {
        C21408618qK c21408618qK;
        this.LL = c448860Hiu;
        this.LLILLJJLI = c445110Hcr;
        this.LLILLL = i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C21409518qT c21409518qT = c445110Hcr.LJ;
        if (c21409518qT != null) {
            c21408618qK = c21409518qT.LIZJ;
        } else {
            c21408618qK = null;
        }
        if (c21408618qK != null) {
            gradientDrawable.setColor(c21408618qK.LIZJ);
            gradientDrawable.setBounds(0, 0, c21408618qK.LIZ, c21408618qK.LIZIZ);
            gradientDrawable.setCornerRadius(c21408618qK.LIZIZ * 0.5f);
        }
        this.LLILZIL = gradientDrawable;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(C445120Hcs.LIZIZ(14));
        C21409518qT c21409518qT2 = c445110Hcr.LJ;
        if (c21409518qT2 != null) {
            textPaint.setColor(c21409518qT2.LIZLLL);
        }
        this.LLILZLL = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        C21409418qS c21409418qS = c445110Hcr.LJFF;
        if (c21409418qS != null) {
            textPaint2.setTextSize(C445120Hcs.LIZIZ(14));
            textPaint2.setColor(c21409418qS.LIZJ);
            textPaint2.setTypeface(Typeface.MONOSPACE);
            textPaint2.setTextAlign(Paint.Align.RIGHT);
        }
        this.LLIZ = textPaint2;
        C21409418qS c21409418qS2 = c445110Hcr.LJFF;
        this.LLIZLLLIL = (int) textPaint2.measureText(String.valueOf(c21409418qS2 != null ? Integer.valueOf(c21409418qS2.LIZIZ) : null));
        this.LLJ = new TreeMap<>(new Comparator() { // from class: X.18qR
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                int i2 = point.x;
                int i3 = point2.x;
                if (i2 == i3) {
                    return point.y - point2.y;
                }
                return i2 - i3;
            }
        });
        this.LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 750));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 748));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 749));
        LIZJ();
        getLeadingMargin(false);
    }

    public final Layout LIZLLL(int i, int i2, CharSequence charSequence) {
        C21409518qT c21409518qT;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        spannableStringBuilder.removeSpan(this);
        CharSequence charSequenceLJJJLIIL = a0.LJJJLIIL(spannableStringBuilder, "\n");
        if (LIZIZ() && (c21409518qT = this.LLILLJJLI.LJ) != null && c21409518qT.LIZIZ != null) {
            return LJ(Integer.MAX_VALUE, 1, charSequenceLJJJLIIL);
        }
        return LJ(LIZ(), Integer.MAX_VALUE, charSequenceLJJJLIIL);
    }

    public final Layout LJ(int i, int i2, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LLILZLL, i).setIncludePad(false).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setMaxLines(i2).build();
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLILZ = true;
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLILZ = true;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C21408918qN c21408918qN;
        boolean z;
        if (charSequence == null) {
            return 0;
        }
        Layout layoutLIZLLL = LIZLLL(i, i2, charSequence);
        this.LLJ.put(new Point(i, i2), layoutLIZLLL);
        C21409518qT c21409518qT = this.LLILLJJLI.LJ;
        C21408618qK c21408618qK = null;
        if (c21409518qT != null) {
            c21408918qN = c21409518qT.LIZIZ;
        } else {
            c21408918qN = null;
        }
        float f = 0.0f;
        if (c21408918qN != null && LIZIZ()) {
            c21408918qN.LIZJ = Math.max(0.0f, Math.max(c21408918qN.LIZJ, layoutLIZLLL.getLineWidth(0) - LIZ()));
        }
        if (fontMetricsInt != null) {
            Integer num = this.LLILLJJLI.LIZIZ;
            if (num != null && i2 == num.intValue()) {
                z = true;
            } else {
                z = false;
            }
            C21409518qT c21409518qT2 = this.LLILLJJLI.LJ;
            if (c21409518qT2 != null) {
                c21408618qK = c21409518qT2.LIZJ;
            }
            if (z && c21408618qK != null && LIZIZ()) {
                f = 0.0f + c21408618qK.LIZIZ;
            }
            int i3 = -layoutLIZLLL.getHeight();
            fontMetricsInt.ascent = i3;
            if (z) {
                fontMetricsInt.ascent = i3 - C814420VxA.LIZIZ(f);
            }
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
            this.LLILZ = false;
        }
        if (c21408918qN != null && LIZIZ()) {
            return Math.min(LIZ(), C814420VxA.LIZIZ(layoutLIZLLL.getLineWidth(0)));
        }
        return LIZ();
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLILZ = true;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Layout layoutLIZLLL;
        Object next;
        float fLIZJ;
        C21408918qN c21408918qN;
        if (charSequence == null) {
            return;
        }
        if (this.LLILZ) {
            layoutLIZLLL = LIZLLL(i, i2, charSequence);
            this.LLJ.put(new Point(i, i2), layoutLIZLLL);
        } else {
            layoutLIZLLL = this.LLJ.get(new Point(i, i2));
            if (layoutLIZLLL == null) {
                Iterator<T> it2 = this.LLJ.entrySet().iterator();
                while (true) {
                    layoutLIZLLL = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        Map.Entry entry = (Map.Entry) next;
                        if (((Point) entry.getKey()).x == i && ((Point) entry.getKey()).y >= i2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    layoutLIZLLL = (Layout) entry2.getValue();
                }
            }
        }
        int iSave = canvas.save();
        try {
            if (LIZIZ()) {
                canvas.clipRect((int) (f + this.LLIZLLLIL), i3, this.LLILLL, i5);
            }
            C21409518qT c21409518qT = this.LLILLJJLI.LJ;
            if (c21409518qT != null && (c21408918qN = c21409518qT.LIZIZ) != null) {
                fLIZJ = c21408918qN.LIZIZ + LIZJ();
            } else {
                fLIZJ = LIZJ();
            }
            canvas.translate(fLIZJ, i3);
            if (layoutLIZLLL != null) {
                layoutLIZLLL.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        C21409518qT c21409518qT;
        Map<Integer, Integer> map;
        Integer num;
        C21409418qS c21409418qS = this.LLILLJJLI.LJFF;
        if (c21409418qS != null && (map = c21409418qS.LIZ) != null && (num = map.get(Integer.valueOf(i6))) != null) {
            canvas.drawText(num.toString(), i + this.LLIZLLLIL + getLeadingMargin(false), i3 + (this.LLIZ.descent() - this.LLIZ.ascent()), this.LLIZ);
        }
        Integer num2 = this.LLILLJJLI.LIZIZ;
        if (num2 != null && i7 == num2.intValue() && (c21409518qT = this.LLILLJJLI.LJ) != null) {
            C21408918qN c21408918qN = c21409518qT.LIZIZ;
            C21408618qK c21408618qK = c21409518qT.LIZJ;
            if (c21408918qN != null && LIZIZ() && c21408618qK != null) {
                int iSave = canvas.save();
                try {
                    canvas.translate((((-c21408918qN.LIZIZ) / c21408918qN.LIZJ) * (LIZ() - c21408618qK.LIZ)) + LIZJ(), (i5 - c21408618qK.LIZIZ) - 0.0f);
                    this.LLILZIL.draw(canvas);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
    }
}
