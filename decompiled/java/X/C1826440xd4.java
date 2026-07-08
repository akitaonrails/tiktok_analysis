package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826440xd4 extends TuxTextView {
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public float LLJJL;
    public EnumC1779390wPB LLJJLIIIJLLLLLLLZ;
    public List<Pair<Integer, Integer>> LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final boolean LLJLL;

    public C1826440xd4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJJJJJ() {
        TextUtils.TruncateAt truncateAt;
        int i = C1779400wPC.LIZ[this.LLJJLIIIJLLLLLLLZ.ordinal()];
        if (i == 1) {
            truncateAt = null;
        } else {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        setEllipsize(truncateAt);
    }

    public final void LJJJJLL() {
        int i = C1779400wPC.LIZ[this.LLJJLIIIJLLLLLLLZ.ordinal()];
        if (i == 1) {
            setMaxLines(Integer.MAX_VALUE);
            return;
        }
        if (i != 2 && i != 3) {
            throw new C1954807lC();
        }
        int i2 = this.LLJJJJJIL;
        if (i2 > 0) {
            setMaxLines(i2);
        } else {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final boolean getFontStepOnOverflow() {
        return this.LLJJLIIIJLLLLLLLZ == EnumC1779390wPB.SHRINK_OR_GROW;
    }

    public final void LJJJJL() {
        int maxWidth;
        if (getWidth() > 0) {
            maxWidth = getWidth();
        } else {
            maxWidth = this.LLJJJJ;
            if (maxWidth <= 0) {
                int maxWidth2 = getMaxWidth();
                maxWidth = (1 > maxWidth2 || maxWidth2 >= Integer.MAX_VALUE) ? 0 : getMaxWidth();
            }
        }
        LJJJJLI((maxWidth - getPaddingLeft()) - getPaddingRight());
    }

    public final List<Pair<Integer, Integer>> getAutoSizeSteps() {
        return this.LLJL;
    }

    public final int getMaxContentWidth() {
        return this.LLJJJJ;
    }

    public final int getMaxFontSize() {
        return this.LLJJJJLIIL;
    }

    public final int getMaxNumberOfLines() {
        return this.LLJJJJJIL;
    }

    public final float getMinFontSize() {
        return this.LLJJL;
    }

    public final EnumC1779390wPB getOverflowMode() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[Catch: all -> 0x00a5, PHI: r3
      0x007a: PHI (r3v3 java.lang.Integer) = (r3v2 java.lang.Integer), (r3v4 java.lang.Integer) binds: [B:31:0x005a, B:33:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a5, blocks: (B:21:0x002b, B:27:0x0041, B:30:0x0048, B:32:0x005c, B:34:0x0069, B:41:0x009e, B:35:0x007a, B:36:0x007f, B:37:0x0084, B:40:0x0088), top: B:49:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(int r12) {
        /*
            r11 = this;
            X.0wPB r1 = r11.LLJJLIIIJLLLLLLLZ
            X.0wPB r0 = X.EnumC1779390wPB.ELLIPSIZE
            if (r1 != r0) goto L7
            return
        L7:
            boolean r0 = r11.LLJLILLLLZIIL
            if (r0 == 0) goto Lc
            return
        Lc:
            java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r8 = r11.LLJL
            if (r8 != 0) goto L11
            return
        L11:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.CharSequence r4 = r11.getText()
            r6 = r12
            if (r6 <= 0) goto Lac
            r1 = 0
            r2 = 1
            if (r4 == 0) goto Lac
            int r0 = r4.length()
            if (r0 == 0) goto Lac
            r11.LLJLILLLLZIIL = r2
            boolean r10 = r11.getIncludeFontPadding()     // Catch: java.lang.Throwable -> La5
            X.0wPB r0 = r11.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> La5
            int[] r3 = X.C1779400wPC.LIZ     // Catch: java.lang.Throwable -> La5
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La5
            r3 = r3[r0]     // Catch: java.lang.Throwable -> La5
            if (r3 == r2) goto L88
            r0 = 2
            if (r3 == r0) goto L85
            r0 = 3
            if (r3 != r0) goto L7f
            int r9 = r11.LLJJJJJIL     // Catch: java.lang.Throwable -> La5
            if (r9 > 0) goto L48
            r9 = 2147483647(0x7fffffff, float:NaN)
        L48:
            android.text.TextPaint r5 = r11.getPaint()     // Catch: java.lang.Throwable -> La5
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Throwable -> La5
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> La5
            float r7 = r0.density     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r3 = X.C0DIW.LIZIZ(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L7a
            float r0 = r11.LLJJL     // Catch: java.lang.Throwable -> La5
            int r0 = (int) r0     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La5
            int r0 = r3.intValue()     // Catch: java.lang.Throwable -> La5
            if (r0 > 0) goto L7a
            java.lang.Object r0 = X.C13LP.LJJLIIIJJI(r8)     // Catch: java.lang.Throwable -> La5
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Throwable -> La5
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> La5
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La5
            goto L9e
        L7a:
            int r0 = r3.intValue()     // Catch: java.lang.Throwable -> La5
            goto L9e
        L7f:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        L85:
            r11.LLJLILLLLZIIL = r1
            return
        L88:
            android.text.TextPaint r5 = r11.getPaint()     // Catch: java.lang.Throwable -> La5
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Throwable -> La5
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> La5
            float r7 = r0.density     // Catch: java.lang.Throwable -> La5
            r4 = r4
            r6 = r6
            r8 = r8
            r9 = r10
            int r0 = X.C0DIW.LIZ(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La5
        L9e:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> La5
            r11.setTextSize(r2, r0)     // Catch: java.lang.Throwable -> La5
            r11.LLJLILLLLZIIL = r1
            return
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
            r11.LLJLILLLLZIIL = r1
            throw r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1826440xd4.LJJJJLI(int):void");
    }

    public final void setAutoSizeSteps(List<Pair<Integer, Integer>> list) {
        if (Intrinsics.LJFF(this.LLJL, list)) {
            return;
        }
        this.LLJL = list;
        LJJJJL();
    }

    public final void setFontStepOnOverflow(boolean z) {
        EnumC1779390wPB enumC1779390wPB;
        if (z) {
            enumC1779390wPB = EnumC1779390wPB.SHRINK_OR_GROW;
        } else {
            enumC1779390wPB = EnumC1779390wPB.ELLIPSIZE;
        }
        setOverflowMode(enumC1779390wPB);
    }

    public final void setMaxContentWidth(int i) {
        if (this.LLJJJJ == i) {
            return;
        }
        this.LLJJJJ = i;
        if (i > 0) {
            setMaxWidth(i);
        }
        requestLayout();
    }

    public final void setMaxFontSize(int i) {
        if (this.LLJJJJLIIL == i) {
            return;
        }
        this.LLJJJJLIIL = i;
        if (i != 0) {
            setTuxFont(i);
        }
        LJJJJL();
    }

    public final void setMaxNumberOfLines(int i) {
        if (this.LLJJJJJIL == i) {
            return;
        }
        this.LLJJJJJIL = i;
        LJJJJLL();
        LJJJJL();
    }

    public final void setMinFontSize(float f) {
        if (this.LLJJL == f) {
            return;
        }
        this.LLJJL = f;
        if (this.LLJJLIIIJLLLLLLLZ == EnumC1779390wPB.ELLIPSIZE && f > 0.0f) {
            setMinTextSize(f);
        }
        LJJJJL();
    }

    public final void setOverflowMode(EnumC1779390wPB enumC1779390wPB) {
        boolean z;
        if (this.LLJJLIIIJLLLLLLLZ == enumC1779390wPB) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = enumC1779390wPB;
        LJJJJJ();
        LJJJJLL();
        if (enumC1779390wPB == EnumC1779390wPB.ELLIPSIZE) {
            z = true;
        } else {
            z = false;
        }
        setIncludeFontPadding(z);
        LJJJJL();
    }

    public final void setPrompt(String str) {
        String str2;
        this.LLJLIL = str;
        CharSequence text = getText();
        if (text != null && text.length() != 0) {
            str2 = "";
        } else {
            str2 = this.LLJLIL;
        }
        setHint(str2);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        if (this.LLJLL && ((size = View.MeasureSpec.getSize(i)) > 0 || (size = this.LLJJJJ) > 0)) {
            LJJJJLI((size - getPaddingLeft()) - getPaddingRight());
        }
        super.onMeasure(i, i2);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        super.setText(charSequence, bufferType);
        if (!this.LLJLL) {
            return;
        }
        CharSequence text = getText();
        if (text != null && text.length() != 0) {
            str = "";
        } else {
            str = this.LLJLIL;
        }
        setHint(str);
        LJJJJJ();
        LJJJJLL();
        LJJJJL();
    }

    public C1826440xd4(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJLIIIJLLLLLLLZ = EnumC1779390wPB.ELLIPSIZE;
        this.LLJLIL = "";
        setFocusable(false);
        setFocusableInTouchMode(false);
        setCursorVisible(false);
        setLongClickable(false);
        setGravity(8388627);
        setTextAlignment(4);
        setEllipsize(TextUtils.TruncateAt.END);
        setBackground(null);
        setTextColorRes(R.attr.a1h);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 2046820352;
        }
        setHintTextColor(iIntValue);
        this.LLJLL = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJLL && i != i3 && i > 0) {
            LJJJJJ();
            LJJJJLL();
            LJJJJL();
        }
    }
}
