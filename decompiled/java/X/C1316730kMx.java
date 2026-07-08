package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;
import j27.s;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316730kMx {
    public Layout LIZ;
    public final C1316750kMz LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF = -1.0f;

    static {
        new BoringLayout.Metrics();
    }

    public final float LIZLLL() {
        float f = this.LJFF;
        if (f >= 0.0f) {
            return f;
        }
        this.LJFF = -1.0f;
        for (int i = 0; i < LJII(); i++) {
            this.LJFF = Math.max(this.LJFF, this.LIZIZ.LIZ.LIZIZ.LIZLLL(false) == Layout.Alignment.ALIGN_NORMAL ? this.LIZ.getLineMax(i) : this.LIZ.getLineMax(i) - this.LIZ.getParagraphLeft(i));
        }
        if (this.LIZIZ.LIZ.LIZ.length() != 0) {
            if (this.LIZIZ.LIZ.LIZIZ.LJII == 2) {
                this.LJFF = (float) (((double) this.LJFF) + (((double) (-this.LIZ.getLineAscent(0))) * 0.2d));
                break;
            }
            int lineEnd = this.LIZ.getLineEnd(LJII() - 1);
            if (Build.VERSION.SDK_INT < 28) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((SpannableStringBuilder) this.LIZIZ.LIZ.LIZ).getSpans(0, lineEnd, StyleSpan.class)) {
                    if (styleSpan.getStyle() == 2) {
                        this.LJFF = (float) (((double) this.LJFF) + (((double) (-this.LIZ.getLineAscent(0))) * 0.2d));
                        break;
                    }
                }
            } else {
                for (C1316820kN6 c1316820kN6 : (C1316820kN6[]) ((SpannableStringBuilder) this.LIZIZ.LIZ.LIZ).getSpans(0, lineEnd, C1316820kN6.class)) {
                    if (c1316820kN6.LL == 2) {
                        this.LJFF = (float) (((double) this.LJFF) + (((double) (-this.LIZ.getLineAscent(0))) * 0.2d));
                        break;
                    }
                }
            }
        }
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI() {
        /*
            r3 = this;
            X.0kMz r0 = r3.LIZIZ
            X.0jwO r1 = r0.LIZIZ
            X.0jwO r0 = X.EnumC1300260jwO.EXACTLY
            if (r1 != r0) goto L1e
            android.text.Layout r0 = r3.LIZ
            int r0 = r0.getWidth()
            float r2 = (float) r0
            X.0kMz r0 = r3.LIZIZ
            float r1 = r0.LIZLLL
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L1e
            double r0 = (double) r1
            double r1 = java.lang.Math.ceil(r0)
        L1c:
            int r0 = (int) r1
            return r0
        L1e:
            float r0 = r3.LIZLLL()
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316730kMx.LJI():int");
    }

    public final int LJII() {
        int i = this.LIZIZ.LIZ.LIZIZ.LIZ;
        return (i == -1 || i > this.LIZ.getLineCount()) ? this.LIZ.getLineCount() : i;
    }

    public final boolean LJIIIZ() {
        if (C1314570kJT.LIZ(this.LIZIZ.LIZ.LIZIZ.LJIIJ)) {
            return false;
        }
        C1316750kMz c1316750kMz = this.LIZIZ;
        if (!c1316750kMz.LJIIIIZZ || !c1316750kMz.LJII) {
            return false;
        }
        C1316720kMw c1316720kMw = c1316750kMz.LIZ.LIZIZ;
        return (c1316720kMw.LJIIIIZZ != 1 || c1316720kMw.LJIILLIIL || c1316720kMw.LJIIZILJ) ? false : true;
    }

    public final boolean LJIIJ() {
        return (this.LIZIZ.LIZJ != EnumC1300260jwO.UNDEFINED && ((float) this.LIZ.getHeight()) > this.LIZIZ.LJ) || LIZLLL() > this.LIZIZ.LIZLLL || LJIIJJI();
    }

    public final boolean LJIIJJI() {
        if (this.LIZ.getLineCount() > LJII()) {
            return true;
        }
        Layout layout = this.LIZ;
        if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            return true;
        }
        Layout layout2 = this.LIZ;
        return layout2.getLineEnd(layout2.getLineCount() - 1) < this.LIZ.getText().length();
    }

    public final int LJIIIIZZ() {
        if (LJIIIZ()) {
            return (int) Math.ceil(this.LIZIZ.LIZ.LIZIZ.LJIIJ);
        }
        C1316720kMw c1316720kMw = this.LIZIZ.LIZ.LIZIZ;
        int i = c1316720kMw.LIZ;
        if (c1316720kMw.LJIIIIZZ != 1 && i != 1) {
            if (i != -1) {
            }
            return this.LIZ.getHeight();
        }
        i = 1;
        if (i <= this.LIZ.getLineCount()) {
            return this.LIZ.getLineBottom(i - 1);
        }
        return this.LIZ.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1316840kN8 r15) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316730kMx.LIZ(X.0kN8):void");
    }

    public final float LIZJ(float f) {
        if (this.LIZ.getLineLeft(0) == 0.0f) {
            return 0.0f;
        }
        if (this.LIZ.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            return (-(this.LIZ.getWidth() - f)) / 2.0f;
        }
        if (this.LIZ.getAlignment() != Layout.Alignment.ALIGN_OPPOSITE && this.LIZ.getParagraphDirection(0) != -1 && this.LIZ.getParagraphAlignment(0) != Layout.Alignment.ALIGN_OPPOSITE) {
            return 0.0f;
        }
        return -(this.LIZ.getWidth() - f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x02c7, code lost:
    
        if (r2 < 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02c9, code lost:
    
        LIZIZ(r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02d5, code lost:
    
        LIZIZ(r11, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0261 A[EDGE_INSN: B:272:0x0261->B:153:0x0261 BREAK  A[LOOP:2: B:125:0x0211->B:145:0x024e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02cc A[EDGE_INSN: B:282:0x02cc->B:189:0x02cc BREAK  A[LOOP:3: B:165:0x028b->B:289:0x028b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(j27.s r16) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316730kMx.LJIIL(j27.s):void");
    }

    public C1316730kMx(s sVar, C1316750kMz c1316750kMz) {
        C1316790kN3[] c1316790kN3Arr;
        this.LIZIZ = c1316750kMz;
        LJIIL(sVar);
        if (c1316750kMz.LJI && !c1316750kMz.LJII) {
            Layout layout = this.LIZ;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) != 0 && (c1316750kMz.LIZ.LIZ instanceof SpannableStringBuilder)) {
                int lineCount = this.LIZ.getLineCount() - 1;
                int lineStart = this.LIZ.getLineStart(lineCount) + this.LIZ.getEllipsisStart(lineCount);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1316750kMz.LIZ.LIZ);
                C1316790kN3[] c1316790kN3Arr2 = (C1316790kN3[]) spannableStringBuilder.getSpans(0, 1, C1316790kN3.class);
                if (c1316790kN3Arr2 != null && c1316790kN3Arr2.length != 0 && (c1316790kN3Arr = (C1316790kN3[]) spannableStringBuilder.getSpans(lineStart, lineStart + 1, C1316790kN3.class)) != null && c1316790kN3Arr.length != 0) {
                    C1316790kN3 c1316790kN3 = c1316790kN3Arr[c1316790kN3Arr.length - 1];
                    int spanStart = spannableStringBuilder.getSpanStart(c1316790kN3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(c1316790kN3);
                    spannableStringBuilder.removeSpan(c1316790kN3);
                    if (spanStart < lineStart) {
                        C786410Ut5.q2(spannableStringBuilder, c1316790kN3, spanStart, lineStart, 33);
                    }
                    C786410Ut5.q2(spannableStringBuilder, new C1316790kN3(c1316790kN3Arr2[0].LL), lineStart, spanEnd, 34);
                    c1316750kMz.LIZ.LIZ = spannableStringBuilder;
                    this.LIZ = null;
                    LJIIL(sVar);
                }
            }
        }
        if (this.LIZ.getWidth() != 0 && this.LIZ.getHeight() != 0) {
            Spanned spanned = (Spanned) this.LIZ.getText();
            for (C1316800kN4 c1316800kN4 : (C1316800kN4[]) spanned.getSpans(0, spanned.length(), C1316800kN4.class)) {
                int spanStart2 = spanned.getSpanStart(c1316800kN4);
                int spanEnd2 = spanned.getSpanEnd(c1316800kN4);
                if (spanStart2 == 0 && spanEnd2 == spanned.length()) {
                    float fLIZLLL = LIZLLL();
                    float f = -this.LIZLLL;
                    c1316800kN4.LL.set(new Rect((int) f, 0, (int) (f + fLIZLLL), this.LIZ.getHeight()));
                } else {
                    int lineForOffset = this.LIZ.getLineForOffset(spanStart2);
                    int lineForOffset2 = this.LIZ.getLineForOffset(spanEnd2);
                    Rect rect = new Rect();
                    for (int i = lineForOffset; i <= lineForOffset2; i++) {
                        Rect rect2 = new Rect();
                        this.LIZ.getLineBounds(i, rect2);
                        if (i == lineForOffset) {
                            rect2.left = Math.max(rect2.left, (int) this.LIZ.getPrimaryHorizontal(spanStart2));
                        }
                        if (i == lineForOffset2) {
                            rect2.right = Math.min(rect2.right, (int) this.LIZ.getPrimaryHorizontal(spanEnd2));
                        }
                        if (rect2.right != 0) {
                            rect.union(rect2);
                        }
                    }
                    c1316800kN4.LL.set(rect);
                }
            }
            for (C1315120kKM c1315120kKM : (C1315120kKM[]) spanned.getSpans(0, spanned.length(), C1315120kKM.class)) {
                Layout layout2 = this.LIZ;
                c1315120kKM.getClass();
                c1315120kKM.LLILZ = new HashMap<>();
                for (int lineForOffset3 = layout2.getLineForOffset(c1315120kKM.LL); lineForOffset3 <= layout2.getLineForOffset(c1315120kKM.LLILLJJLI); lineForOffset3++) {
                    int lineStart2 = layout2.getLineStart(lineForOffset3);
                    int lineEnd = layout2.getLineEnd(lineForOffset3);
                    int i2 = c1315120kKM.LL;
                    if (i2 > lineStart2 && i2 < lineEnd) {
                        lineStart2 = i2;
                    }
                    int i3 = c1315120kKM.LLILLJJLI;
                    if (i3 > lineStart2 && i3 < lineEnd) {
                        lineEnd = i3;
                    }
                    int primaryHorizontal = (int) layout2.getPrimaryHorizontal(lineStart2);
                    int primaryHorizontal2 = (int) layout2.getPrimaryHorizontal(lineEnd);
                    primaryHorizontal = lineStart2 == layout2.getLineStart(lineForOffset3) ? (int) layout2.getLineLeft(lineForOffset3) : primaryHorizontal;
                    if (lineEnd == layout2.getLineEnd(lineForOffset3)) {
                        primaryHorizontal2 = (int) layout2.getLineRight(lineForOffset3);
                    }
                    c1315120kKM.LLILZ.put(Integer.valueOf(lineForOffset3), new int[]{primaryHorizontal, primaryHorizontal2});
                }
            }
        }
    }

    public final void LIZIZ(int i, C1316840kN8 c1316840kN8) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1316840kN8.LIZ;
        for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AbsoluteSizeSpan.class)) {
            spannableStringBuilder.removeSpan(absoluteSizeSpan);
        }
        c1316840kN8.LJFF.setTextSize(i);
        LIZ(c1316840kN8);
    }

    public final CharSequence LJFF(int i, SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(0, Math.min(spannableStringBuilder.length(), Math.max(0, i)));
        if (this.LIZIZ.LIZ.LIZIZ.LIZIZ() == TextDirectionHeuristics.LTR) {
            spannableStringBuilder2.append((CharSequence) "\u200e");
        } else if (this.LIZIZ.LIZ.LIZIZ.LIZIZ() == TextDirectionHeuristics.RTL) {
            spannableStringBuilder2.append((CharSequence) "\u200f");
        }
        spannableStringBuilder2.append((CharSequence) "…");
        return spannableStringBuilder2;
    }

    public final StaticLayout.Builder LJ(CharSequence charSequence, Layout.Alignment alignment, TextPaint textPaint, float f) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.floor(f));
        builderObtain.setAlignment(alignment);
        builderObtain.setLineSpacing(this.LIZIZ.LIZ.LIZIZ.LJIIL, 1.0f);
        builderObtain.setIncludePad(this.LIZIZ.LIZ.LIZIZ.LJIJI);
        builderObtain.setTextDirection(this.LIZIZ.LIZ.LIZIZ.LIZIZ());
        builderObtain.setBreakStrategy(this.LIZIZ.LJFF);
        if (Build.VERSION.SDK_INT >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        return builderObtain;
    }
}
