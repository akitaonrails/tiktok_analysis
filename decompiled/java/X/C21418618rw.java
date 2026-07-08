package X;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21418618rw extends MetricAffectingSpan implements LineHeightSpan.WithDensity, LineBackgroundSpan, InterfaceC21419318s3, InterfaceC434190H0v {
    public TextView LL;
    public final AwS576S0100000_32 LLILLJJLI;
    public final C21418718rx LLILLL;
    public final C21418918rz LLILZ;
    public final C21419018s0 LLILZIL;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.18ry] */
    public C21418618rw(C21432118u7 c21432118u7) {
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 882);
        this.LLILLJJLI = awS576S0100000_32;
        ?? r2 = new Function2<Integer, Integer, Pair<? extends Float, ? extends Float>>() { // from class: X.18ry
            @Override // kotlin.jvm.functions.Function2
            public final Pair<? extends Float, ? extends Float> invoke(Integer num, Integer num2) {
                CharSequence text;
                float f;
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                TextView textView = this.LL.LL;
                Spanned spanned = null;
                if (textView != null) {
                    text = textView.getText();
                } else {
                    text = null;
                }
                if (text instanceof Spanned) {
                    spanned = (Spanned) text;
                }
                if (spanned != null) {
                    int spanEnd = spanned.getSpanEnd(this.LL);
                    C21419118s1 c21419118s1 = (C21419118s1) this.LL.LLILLJJLI.invoke();
                    if (c21419118s1 == null) {
                        return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
                    }
                    if (iIntValue <= spanEnd && spanEnd <= iIntValue2) {
                        f = c21419118s1.LIZIZ;
                    } else {
                        f = 0.0f;
                    }
                    return new Pair<>(Float.valueOf(0.0f), Float.valueOf(f));
                }
                return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
        };
        AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(this, 883);
        this.LLILLL = new C21418718rx(awS576S0100000_322, awS576S0100000_32, c21432118u7);
        this.LLILZ = new C21418918rz(r2, awS576S0100000_322, awS576S0100000_32, c21432118u7);
        this.LLILZIL = new C21419018s0(awS576S0100000_32, awS576S0100000_322, this, r2);
    }

    @Override // X.InterfaceC21419318s3
    public final void LIZ(TextView textView) {
        this.LL = textView;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        MetricAffectingSpan metricAffectingSpanLIZ = this.LLILLL.LIZ();
        if (metricAffectingSpanLIZ != null) {
            metricAffectingSpanLIZ.updateDrawState(textPaint);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        MetricAffectingSpan metricAffectingSpanLIZ = this.LLILLL.LIZ();
        if (metricAffectingSpanLIZ != null) {
            metricAffectingSpanLIZ.updateMeasureState(textPaint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    @Override // android.text.style.LineHeightSpan.WithDensity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void chooseHeight(java.lang.CharSequence r30, int r31, int r32, int r33, int r34, android.graphics.Paint.FontMetricsInt r35, android.text.TextPaint r36) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21418618rw.chooseHeight(java.lang.CharSequence, int, int, int, int, android.graphics.Paint$FontMetricsInt, android.text.TextPaint):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    @Override // android.text.style.LineBackgroundSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawBackground(android.graphics.Canvas r15, android.graphics.Paint r16, int r17, int r18, int r19, int r20, int r21, java.lang.CharSequence r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21418618rw.drawBackground(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, int):void");
    }
}
