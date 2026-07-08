package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749330vch extends AbstractC1729606py {
    public final TuxTextView LL;
    public final View LLILLJJLI;
    public TuxTextView LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    public /* synthetic */ C1749330vch(Context context) {
        this(context, null, 0);
    }

    private final void setTextStyle(boolean z) {
        Integer numLIZJ;
        if (z) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1q, getContext());
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        }
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (this.LLILZ) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LL.getText());
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, this.LLILZIL, 18);
                this.LL.setText(spannableStringBuilder);
                return;
            }
            this.LL.setTextColor(numLIZJ.intValue());
        }
    }

    @Override // X.AbstractC1729606py
    public void setChildViewAlpha(float f) {
        C786410Ut5.B5(this.LL, f);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, f);
        }
    }

    @Override // X.AbstractC1729606py
    public final void i0(boolean z, boolean z2) {
        h0(this.LLILLJJLI, z, z2, C418440Gaw.LIZIZ(5), C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4));
        setTextStyle(z2);
    }

    public C1749330vch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        C991303uB.LIZ(context, R.layout.azj, this, true);
        this.LL = (TuxTextView) findViewById(R.id.vh0);
        this.LLILLJJLI = findViewById(R.id.vgq);
    }

    public final void j0(String str, SalePropTag salePropTag, boolean z, boolean z2) {
        Font font;
        Integer numLIZ;
        int length = 0;
        this.LLILZ = false;
        this.LLILZIL = 0;
        TuxTextView tuxTextViewE0 = e0();
        this.LLILLL = tuxTextViewE0;
        addView(tuxTextViewE0);
        CharSequence charSequenceLJLILLLLZI = null;
        if (salePropTag != null && salePropTag.description != null) {
            SpannableStringBuilder spannableStringBuilderLIZ = C03C8.LIZ(this.LL, salePropTag.description, "order_submit_voucher_plus_module", null, null, false, 28);
            if (spannableStringBuilderLIZ != null) {
                charSequenceLJLILLLLZI = a0.LJLILLLLZI(spannableStringBuilderLIZ);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            if (charSequenceLJLILLLLZI != null) {
                spannableStringBuilder.append((CharSequence) " ");
                final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iLIZIZ) { // from class: X.0GVM
                    public final int LL;

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    }

                    {
                        this.LL = iLIZIZ;
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                        return this.LL;
                    }
                }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                Integer num = salePropTag.style;
                int value = EnumC1990107qt.SPLIT.getValue();
                if (num != null && num.intValue() == value) {
                    spannableStringBuilder.append((CharSequence) " ");
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
                    if (numLIZJ != null) {
                        gradientDrawable.setColor(numLIZJ.intValue());
                    }
                    gradientDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                    C786410Ut5.q2(spannableStringBuilder, new C419890GdH(gradientDrawable, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) " ");
                    final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iLIZIZ2) { // from class: X.0GVM
                        public final int LL;

                        @Override // android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                        }

                        {
                            this.LL = iLIZIZ2;
                        }

                        @Override // android.text.style.ReplacementSpan
                        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                            return this.LL;
                        }
                    }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append(charSequenceLJLILLLLZI);
                TextAttribute textAttribute = salePropTag.description.textAttribute;
                if (textAttribute != null && (font = textAttribute.font) != null && (numLIZ = font.LIZ()) != null) {
                    int iIntValue = numLIZ.intValue();
                    final C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(61);
                    final C444890HcV c444890HcV2 = new C444890HcV();
                    c444890HcV2.LIZ(iIntValue);
                    C786410Ut5.q2(spannableStringBuilder, new MetricAffectingSpan(c444890HcV, c444890HcV2) { // from class: X.0kar
                        public final C444890HcV LL;
                        public final C444890HcV LLILLJJLI;

                        @Override // android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            int i = textPaint.baselineShift;
                            Paint.FontMetricsInt fontMetricsInt = this.LL.getFontMetricsInt();
                            int i2 = (fontMetricsInt.top + fontMetricsInt.bottom) / 2;
                            Paint.FontMetricsInt fontMetricsInt2 = this.LLILLJJLI.getFontMetricsInt();
                            textPaint.baselineShift = i + (i2 - ((fontMetricsInt2.top + fontMetricsInt2.bottom) / 2));
                        }

                        @Override // android.text.style.MetricAffectingSpan
                        public final void updateMeasureState(TextPaint textPaint) {
                            int i = textPaint.baselineShift;
                            Paint.FontMetricsInt fontMetricsInt = this.LL.getFontMetricsInt();
                            int i2 = (fontMetricsInt.top + fontMetricsInt.bottom) / 2;
                            Paint.FontMetricsInt fontMetricsInt2 = this.LLILLJJLI.getFontMetricsInt();
                            textPaint.baselineShift = i + (i2 - ((fontMetricsInt2.top + fontMetricsInt2.bottom) / 2));
                        }

                        {
                            this.LL = c444890HcV;
                            this.LLILLJJLI = c444890HcV2;
                        }
                    }, length2, charSequenceLJLILLLLZI.length() + length2, 18);
                }
            }
            this.LL.setText(spannableStringBuilder);
            this.LL.setMaxLines(Integer.MAX_VALUE);
            this.LLILZ = true;
            if (str != null) {
                length = str.length();
            }
            this.LLILZIL = length;
        } else {
            this.LLILZ = false;
            this.LLILZIL = 0;
            this.LL.setText(str);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C1749180vcS c1749180vcS = C1749180vcS.LIZ;
            Context context = getContext();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            c1749180vcS.getClass();
            C1749180vcS.LIZIZ(context, tuxTextView, salePropTag, paddingTop, paddingRight);
        }
        i0(z, z2);
    }
}
