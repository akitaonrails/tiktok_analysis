package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718810SHn {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public int LJI;
    public SpannableString LJII;
    public SpannableString LJIIIIZZ;
    public SpannableString LJIIIZ;
    public SpannableString LJIIJ;
    public SpannableString LJIIJJI;
    public SpannableString LJIIL;
    public SpannableStringBuilder LJIILIIL;
    public Function0<? extends Object> LJIILJJIL;
    public boolean LJIILL;
    public TuxIconDrawable LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public Integer LJIJI;
    public Aweme LJIJJLI;
    public InterfaceC719180SIy LJIL;
    public int LJFF = 62;
    public C0SKK LJIJJ = C0SKK.INITIALIZED;

    public final boolean LJ() {
        SpannableString spannableStringLJI;
        return this.LIZIZ && !this.LIZ && (spannableStringLJI = LJI(false)) != null && (a0.LJJJIL(spannableStringLJI) ^ true);
    }

    public static int LJII(Layout layout) {
        int lineCount = layout.getLineCount();
        if (lineCount == 0) {
            return 0;
        }
        int i = lineCount - 1;
        CharSequence charSequenceSubSequence = layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i));
        int i2 = 0;
        for (int i3 = 0; i3 < charSequenceSubSequence.length(); i3++) {
            if (charSequenceSubSequence.charAt(i3) != 8288) {
                i2++;
            }
        }
        return i2;
    }

    public static void LJIIL(SpannableString spannableString) {
        C786410Ut5.p2(spannableString, new ReplacementSpan() { // from class: X.0HCu
            public static void LIZ(Spanned spanned, int i, int i2, Paint paint) {
                TextPaint textPaint;
                C444920HcY c444920HcY = (C444920HcY) C13LQ.LJJJJIZL(spanned.getSpans(i, i2, C444920HcY.class));
                if (c444920HcY != null) {
                    if (paint instanceof TextPaint) {
                        textPaint = (TextPaint) paint;
                    } else {
                        textPaint = null;
                    }
                    c444920HcY.updateDrawState(textPaint);
                }
                ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) C13LQ.LJJJJIZL(spanned.getSpans(i, i2, ForegroundColorSpan.class));
                if (foregroundColorSpan != null) {
                    paint.setColor(foregroundColorSpan.getForegroundColor());
                }
            }

            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                int color = paint.getColor();
                Typeface typeface = paint.getTypeface();
                float textSize = paint.getTextSize();
                if (charSequence instanceof Spanned) {
                    LIZ((Spanned) charSequence, i, i2, paint);
                }
                int iMeasureText = (int) paint.measureText(charSequence, i, i2);
                paint.setColor(color);
                paint.setTypeface(typeface);
                paint.setTextSize(textSize);
                return iMeasureText;
            }

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                int color = paint.getColor();
                Typeface typeface = paint.getTypeface();
                float textSize = paint.getTextSize();
                if (charSequence instanceof Spanned) {
                    LIZ((Spanned) charSequence, i, i2, paint);
                }
                canvas.drawText(charSequence, i, i2, f, i4, paint);
                paint.setColor(color);
                paint.setTypeface(typeface);
                paint.setTextSize(textSize);
            }
        }, 0, spannableString.length(), 33);
    }

    public final SpannableString LJI(boolean z) {
        SpannableString spannableString;
        C0SKK c0skk = this.LJIJJ;
        SpannableString spannableString2 = null;
        if (c0skk == C0SKK.INITIALIZED) {
            if (!z) {
                return null;
            }
            SpannableString spannableString3 = this.LJII;
            SpannableString spannableString4 = this.LJIIJ;
            if (C444960Hcc.LIZIZ()) {
                return spannableString4;
            }
            return spannableString3;
        }
        int i = C0SBL.LIZ[c0skk.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    spannableString = this.LJIIIZ;
                    spannableString2 = this.LJIIL;
                    if (C444960Hcc.LIZIZ()) {
                    }
                }
                return spannableString2;
            }
            spannableString = this.LJIIIIZZ;
            SpannableString spannableString5 = this.LJIIJJI;
            if (C444960Hcc.LIZIZ()) {
                return spannableString5;
            }
        } else {
            spannableString = this.LJII;
            SpannableString spannableString6 = this.LJIIJ;
            if (C444960Hcc.LIZIZ()) {
                return spannableString6;
            }
        }
        return spannableString;
    }

    public final void LJIILIIL(Integer num) {
        Integer num2;
        this.LIZLLL = num;
        SpannableString spannableString = this.LJII;
        if (spannableString != null) {
            LJIIJ(spannableString, num);
        }
        SpannableString spannableString2 = this.LJIIIIZZ;
        if (spannableString2 != null) {
            LJIIJ(spannableString2, this.LIZLLL);
        }
        SpannableString spannableString3 = this.LJIIIZ;
        if (spannableString3 != null) {
            LJIIJ(spannableString3, this.LIZLLL);
        }
        SpannableString spannableString4 = this.LJIIJ;
        if (spannableString4 != null) {
            LJIIJ(spannableString4, this.LIZLLL);
        }
        SpannableString spannableString5 = this.LJIIJJI;
        if (spannableString5 != null) {
            LJIIJ(spannableString5, this.LIZLLL);
        }
        SpannableString spannableString6 = this.LJIIL;
        if (spannableString6 != null) {
            LJIIJ(spannableString6, this.LIZLLL);
        }
        SpannableStringBuilder spannableStringBuilder = this.LJIILIIL;
        if (spannableStringBuilder != null && (num2 = this.LIZLLL) != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num2.intValue()), 0, spannableStringBuilder.length(), 33);
        }
    }

    public final void LJIILJJIL(int i) {
        Integer numValueOf;
        this.LJFF = i;
        SpannableString spannableString = this.LJII;
        if (spannableString != null) {
            LJIIJJI(spannableString, Integer.valueOf(i));
        }
        SpannableString spannableString2 = this.LJIIIIZZ;
        if (spannableString2 != null) {
            LJIIJJI(spannableString2, Integer.valueOf(this.LJFF));
        }
        SpannableString spannableString3 = this.LJIIIZ;
        if (spannableString3 != null) {
            LJIIJJI(spannableString3, Integer.valueOf(this.LJFF));
        }
        SpannableString spannableString4 = this.LJIIJ;
        if (spannableString4 != null) {
            LJIIJJI(spannableString4, Integer.valueOf(this.LJFF));
        }
        SpannableString spannableString5 = this.LJIIJJI;
        if (spannableString5 != null) {
            LJIIJJI(spannableString5, Integer.valueOf(this.LJFF));
        }
        SpannableString spannableString6 = this.LJIIL;
        if (spannableString6 != null) {
            LJIIJJI(spannableString6, Integer.valueOf(this.LJFF));
        }
        SpannableStringBuilder spannableStringBuilder = this.LJIILIIL;
        if (spannableStringBuilder != null && (numValueOf = Integer.valueOf(this.LJFF)) != null) {
            numValueOf.intValue();
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(numValueOf.intValue(), true), 0, spannableStringBuilder.length(), 33);
        }
    }

    public static void LJIIJ(SpannableString spannableString, Integer num) {
        if (num != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
        }
    }

    public static void LJIIJJI(SpannableString spannableString, Integer num) {
        if (num != null) {
            num.intValue();
            C786410Ut5.p2(spannableString, new C444920HcY(num.intValue(), true), 0, spannableString.length(), 33);
        }
    }

    public final void LJIIIZ(SpannableString spannableString, Function0<Unit> function0) {
        C786410Ut5.p2(spannableString, new C738660SyG(this, function0, 0), 0, spannableString.length(), 33);
    }

    public final SpannableStringBuilder LJIILL(Spanned spanned, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.LJIILL) {
            i = spanned.length();
        } else {
            int length = spanned.length();
            if (i > length) {
                i = length;
            }
        }
        spannableStringBuilder.append(spanned.subSequence(0, i));
        C089E c089e = new C089E(spanned.getSpans(0, spanned.length(), Object.class));
        while (c089e.hasNext()) {
            Object next = c089e.next();
            int spanStart = spanned.getSpanStart(next);
            if (spanStart < 0) {
                spanStart = 0;
            }
            if (spanStart > i) {
                spanStart = i;
            }
            int spanEnd = spanned.getSpanEnd(next);
            if (spanEnd < 0) {
                spanEnd = 0;
            }
            if (spanEnd > i) {
                spanEnd = i;
            }
            int spanFlags = spanned.getSpanFlags(next);
            if (spanStart < spanEnd) {
                C786410Ut5.q2(spannableStringBuilder, next, spanStart, spanEnd, spanFlags);
            }
        }
        return spannableStringBuilder;
    }

    public final void LJIIIIZZ(String str, String str2, String str3) {
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        SpannableString spannableString4;
        SpannableString spannableString5;
        SpannableString spannableString6;
        if (str != null && !a0.LJJJIL(str) && ((spannableString5 = this.LJII) == null || a0.LJJJIL(spannableString5) || (spannableString6 = this.LJIIJ) == null || a0.LJJJIL(spannableString6))) {
            SpannableString spannableString7 = new SpannableString(str);
            LJIIIZ(spannableString7, new AwS555S0100000_11(this, 28));
            LJIIL(spannableString7);
            this.LJII = spannableString7;
            SpannableString spannableString8 = new SpannableString(str);
            LJIIIZ(spannableString8, new AwS555S0100000_11(this, 29));
            LJIIL(spannableString8);
            this.LJIIJ = spannableString8;
        }
        if (str2 != null && !a0.LJJJIL(str2) && ((spannableString3 = this.LJIIIIZZ) == null || a0.LJJJIL(spannableString3) || (spannableString4 = this.LJIIJJI) == null || a0.LJJJIL(spannableString4))) {
            SpannableString spannableString9 = new SpannableString(str2);
            LJIIL(spannableString9);
            this.LJIIIIZZ = spannableString9;
            SpannableString spannableString10 = new SpannableString(str2);
            LJIIL(spannableString10);
            this.LJIIJJI = spannableString10;
        }
        if (str3 != null && !a0.LJJJIL(str3) && ((spannableString = this.LJIIIZ) == null || a0.LJJJIL(spannableString) || (spannableString2 = this.LJIIL) == null || a0.LJJJIL(spannableString2))) {
            SpannableString spannableString11 = new SpannableString(str3);
            LJIIIZ(spannableString11, new AwS555S0100000_11(this, 30));
            LJIIL(spannableString11);
            this.LJIIIZ = spannableString11;
            SpannableString spannableString12 = new SpannableString(str3);
            LJIIIZ(spannableString12, new AwS555S0100000_11(this, 31));
            LJIIL(spannableString12);
            this.LJIIL = spannableString12;
        }
        LJIILJJIL(this.LJFF);
        LJIILIIL(this.LIZLLL);
    }

    public final Layout LIZ(C444830HcP c444830HcP, Layout layout, int i, String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (this.LIZ) {
            return layout;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.LIZIZ && !z) {
            return layout;
        }
        CharSequence text = layout.getText();
        if (a0.LJJJIL(text)) {
            Aweme aweme = this.LJIJJLI;
            if (aweme != null && !AwemeExtKt.isPhotoMode(aweme)) {
                this.LIZJ = true;
            }
            return layout;
        }
        int lineCount = layout.getLineCount();
        int i2 = 0;
        while (true) {
            if (i2 < lineCount) {
                if (layout.getEllipsisCount(i2) > 0) {
                    int ellipsisStart = layout.getEllipsisStart(layout.getLineCount() - 1) + layout.getLineStart(layout.getLineCount() - 1) + 1;
                    if (text instanceof Spanned) {
                        spannableStringBuilder = LJIILL((Spanned) text, ellipsisStart);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(text.subSequence(0, ellipsisStart).toString());
                    }
                } else {
                    i2++;
                }
            } else {
                int iLJJJJI = a0.LJJJJI(text, "…", 0, 6);
                if (iLJJJJI != -1 && C123100dR.LIZ(str)) {
                    int length = iLJJJJI + str.length();
                    if (text instanceof Spanned) {
                        spannableStringBuilder = LJIILL((Spanned) text, length + 1 + 1);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(text.subSequence(0, length + 1).toString());
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(text);
                }
            }
        }
        SpannableString spannableStringLJI = LJI(z);
        if (spannableStringLJI == null) {
            return layout;
        }
        a0.LJJJIL(spannableStringLJI);
        this.LJIIZILJ = spannableStringLJI.length();
        if (str != null && !a0.LJJJIL(str)) {
            spannableStringBuilder.append("\u2060 \u2060");
            this.LJIIZILJ += 3;
            SpannableString spannableString = new SpannableString("|");
            LJIIJ(spannableString, this.LJ);
            spannableStringBuilder.append((CharSequence) spannableString);
            this.LJIIZILJ++;
            spannableStringBuilder.append("\u2060 \u2060");
            this.LJIIZILJ += 3;
        } else {
            spannableStringBuilder.append(" ");
            this.LJIIZILJ++;
        }
        spannableStringBuilder.append((CharSequence) spannableStringLJI);
        this.LJIIZILJ += spannableStringLJI.length();
        if (this.LJIILL) {
            Layout layoutLJFF = LJFF(c444830HcP, spannableStringBuilder, i, text, str, this.LJIILIIL, spannableStringLJI, jCurrentTimeMillis);
            if (layoutLJFF == null) {
                return LIZLLL(c444830HcP, spannableStringBuilder, i, str, spannableStringLJI);
            }
            return layoutLJFF;
        }
        return LIZLLL(c444830HcP, spannableStringBuilder, i, str, spannableStringLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZLLL(X.C444830HcP r6, android.text.SpannableStringBuilder r7, int r8, java.lang.String r9, android.text.SpannableString r10) {
        /*
            r5 = this;
            r6.LJIILIIL(r7)
            r6.LJIIIZ(r8)
            X.0HcQ r1 = r6.LIZIZ
            r0 = 0
            r1.LJII = r0
            r0 = 0
            r1.LJIIIIZZ = r0
            r6.LJFF = r0
            android.text.Layout r4 = r6.LIZIZ()
            int r0 = r4.getLineCount()
            r1 = 1
            if (r0 != r1) goto L21
            r5.LJI = r1
        L1d:
            java.lang.System.currentTimeMillis()
            return r4
        L21:
            r3 = 2
            if (r0 != r3) goto L2e
            boolean r0 = X.C123100dR.LIZ(r9)
            if (r0 == 0) goto L30
            r0 = 4
            r5.LJI = r0
            goto L1d
        L2e:
            if (r0 != r3) goto L1d
        L30:
            int r0 = r4.getLineCount()
            int r0 = r0 - r1
            int r2 = r4.getLineStart(r0)
            int r1 = r4.getLineEnd(r0)
            java.lang.CharSequence r0 = r4.getText()
            java.lang.CharSequence r0 = r0.subSequence(r2, r1)
            java.lang.String r0 = r0.toString()
            if (r10 == 0) goto L58
            int r1 = r0.length()
            int r0 = r10.length()
            if (r1 != r0) goto L58
        L55:
            r5.LJI = r3
            goto L1d
        L58:
            r3 = 3
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718810SHn.LIZLLL(X.0HcP, android.text.SpannableStringBuilder, int, java.lang.String, android.text.SpannableString):android.text.Layout");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r5, boolean r6, android.text.SpannableStringBuilder r7, android.text.SpannableStringBuilder r8, android.text.SpannableString r9, boolean r10) {
        /*
            r4 = this;
            r0 = 0
            r4.LJIIZILJ = r0
            r3 = 1
            if (r5 == 0) goto L76
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            if (r0 != 0) goto L76
            r1 = 0
        Ld:
            java.lang.String r0 = " "
            if (r1 == 0) goto L33
            if (r6 != 0) goto L35
            r7.append(r0)
            int r0 = r4.LJIIZILJ
            int r0 = r0 + 1
            r4.LJIIZILJ = r0
        L1c:
            if (r9 == 0) goto L32
        L1e:
            boolean r0 = kotlin.text.a0.LJJJIL(r9)
            r0 = r0 ^ 1
            if (r0 != r3) goto L32
            r7.append(r9)
            int r1 = r4.LJIIZILJ
            int r0 = r9.length()
            int r1 = r1 + r0
            r4.LJIIZILJ = r1
        L32:
            return
        L33:
            if (r6 == 0) goto L4e
        L35:
            if (r10 != 0) goto L40
            r7.append(r0)
            int r0 = r4.LJIIZILJ
            int r0 = r0 + 1
            r4.LJIIZILJ = r0
        L40:
            if (r8 == 0) goto L4e
            r7.append(r8)
            int r1 = r4.LJIIZILJ
            int r0 = r8.length()
            int r1 = r1 + r0
            r4.LJIIZILJ = r1
        L4e:
            if (r9 == 0) goto L32
            boolean r0 = kotlin.text.a0.LJJJIL(r9)
            r0 = r0 ^ 1
            if (r0 != r3) goto L1e
            java.lang.String r2 = "\u2060 \u2060"
            r7.append(r2)
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.String r0 = "|"
            r1.<init>(r0)
            java.lang.Integer r0 = r4.LJ
            LJIIJ(r1, r0)
            r7.append(r1)
            r7.append(r2)
            int r0 = r4.LJIIZILJ
            int r0 = r0 + 3
            r4.LJIIZILJ = r0
            goto L1c
        L76:
            r1 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718810SHn.LIZJ(java.lang.String, boolean, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableString, boolean):void");
    }

    public final Layout LJFF(C444830HcP c444830HcP, SpannableStringBuilder spannableStringBuilder, int i, CharSequence charSequence, String str, SpannableStringBuilder spannableStringBuilder2, SpannableString spannableString, long j) {
        SpannableStringBuilder spannableStringBuilder3;
        CharSequence charSequenceSubSequence = charSequence;
        if (C123100dR.LIZ(str)) {
            spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, a0.LJJJJI(spannableStringBuilder, str, 0, 6)));
            LIZJ(str, true, spannableStringBuilder3, this.LJIILIIL, LJI(false), true);
        } else {
            spannableStringBuilder3 = spannableStringBuilder;
        }
        c444830HcP.LJIILIIL(spannableStringBuilder3);
        c444830HcP.LJIIIZ(i);
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJII = null;
        c444840HcQ.LJIIIIZZ = 0;
        c444830HcP.LJFF = false;
        Layout layoutLIZIZ = c444830HcP.LIZIZ();
        if (C123100dR.LIZ(str)) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, a0.LJJJJI(charSequenceSubSequence, str, 0, 6));
        }
        if (layoutLIZIZ.getLineCount() == i && LJII(layoutLIZIZ) < this.LJIIZILJ) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceSubSequence);
            spannableStringBuilder4.append("\n");
            try {
                LIZJ(str, true, spannableStringBuilder4, spannableStringBuilder2, spannableString, true);
                return LIZLLL(c444830HcP, spannableStringBuilder4, i, str, spannableString);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                return null;
            }
        }
        if (layoutLIZIZ.getLineCount() > i) {
            try {
                int length = charSequenceSubSequence.length() - LJII(layoutLIZIZ);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(new SpannableStringBuilder(charSequenceSubSequence).subSequence(0, length));
                LIZJ(str, true, spannableStringBuilder5, spannableStringBuilder2, spannableString, false);
                Layout layoutLIZLLL = LIZLLL(c444830HcP, spannableStringBuilder5, i, str, spannableString);
                if (layoutLIZLLL.getLineCount() == i && LJII(layoutLIZLLL) < this.LJIIZILJ) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(new SpannableStringBuilder(charSequenceSubSequence).subSequence(0, length));
                    spannableStringBuilder6.append("\n");
                    try {
                        LIZJ(str, true, spannableStringBuilder6, spannableStringBuilder2, spannableString, true);
                        return LIZLLL(c444830HcP, spannableStringBuilder6, i, str, spannableString);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C098200Yq c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                            return null;
                        }
                    }
                }
                return layoutLIZLLL;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C098200Yq c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
                C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            }
        }
        return null;
    }
}
