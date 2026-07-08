package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766720w4k extends C18QS {
    public static final /* synthetic */ int LLJZ = 0;
    public SpannableStringBuilder LLJJL;
    public SpannableStringBuilder LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;

    public final int getFoldMaxLine() {
        return this.LLJLLL;
    }

    public final boolean getHasCalculate() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getNeedExpandDesc() {
        return this.LLJLL;
    }

    public final boolean getShouleExpand() {
        return this.LLJLLIL;
    }

    public final void setExpand(boolean z) {
        this.LLJLIL = z;
    }

    public final void setHasCalculate(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setNeedExpandDesc(boolean z) {
        this.LLJLL = z;
    }

    public final void setShouleExpand(boolean z) {
        this.LLJLLIL = z;
    }

    public C1766720w4k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = " ";
        this.LLJLLL = 2;
    }

    public final void LJJJZ(int i, CharSequence charSequence) {
        int length;
        int length2;
        C1766720w4k c1766720w4k = this;
        if (!c1766720w4k.LLJLL) {
            return;
        }
        c1766720w4k.setEllipsize(null);
        c1766720w4k.setMovementMethod(LinkMovementMethod.getInstance());
        try {
            int width = (c1766720w4k.getWidth() - c1766720w4k.getPaddingStart()) - c1766720w4k.getPaddingEnd();
            if (c1766720w4k.getLayout() == null || c1766720w4k.getLayout().getLineCount() == 0) {
                c1766720w4k.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(C12ES.LJIIIIZZ(c1766720w4k.getContext()), Integer.MIN_VALUE));
            }
            c1766720w4k = c1766720w4k;
            C1761490vwJ c1761490vwJ = new C1761490vwJ(c1766720w4k, width, "", i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            c1761490vwJ.LJFF = "  ";
            CharSequence text = c1766720w4k.getText();
            if (text == null) {
                text = "";
            }
            SpannableString spannableStringLIZ = c1761490vwJ.LIZ(SpannableString.valueOf(text));
            if (c1761490vwJ.LIZLLL) {
                c1766720w4k.setMaxLines(Integer.MAX_VALUE);
                c1766720w4k.getWidth();
                c1766720w4k.getPaddingStart();
                c1766720w4k.getPaddingEnd();
                final AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c1766720w4k, 1295);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1766720w4k.getText());
                c1766720w4k.LLJJLIIIJLLLLLLLZ = spannableStringBuilder;
                AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0w4l
                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                    }

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        awS570S0100000_26.invoke();
                    }
                };
                SpannableStringBuilder spannableStringBuilder2 = c1766720w4k.LLJJLIIIJLLLLLLLZ;
                if (spannableStringBuilder2 != null) {
                    length = spannableStringBuilder2.length();
                } else {
                    length = 0;
                }
                C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 0, length, 33);
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringLIZ).append((CharSequence) c1766720w4k.LLJL);
                c1766720w4k.LLJJL = spannableStringBuilderAppend;
                if (spannableStringBuilderAppend != null) {
                    int length3 = spannableStringBuilderAppend.length() - 9;
                    if (length3 < 0) {
                        length3 = 0;
                    }
                    C786410Ut5.q2(spannableStringBuilderAppend, new ReplacementSpan() { // from class: X.0GVA
                        @Override // android.text.style.ReplacementSpan
                        public final int getSize(Paint paint, CharSequence charSequence2, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                            return (int) paint.measureText(charSequence2, i2, i3);
                        }

                        @Override // android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence2, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                            float fMeasureText = paint.measureText(charSequence2, i2, i3);
                            float f2 = i5;
                            canvas.drawText(charSequence2, i2, i3, f, f2, paint);
                            float f3 = f + fMeasureText;
                            LinearGradient linearGradient = new LinearGradient(f3 - fMeasureText, 0.0f, f3, 0.0f, new int[]{Color.argb(0, 255, 255, 255), -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Shader shader = paint.getShader();
                            paint.setShader(linearGradient);
                            canvas.drawText(charSequence2, i2, i3, f, f2, paint);
                            paint.setShader(shader);
                        }
                    }, length3, spannableStringBuilderAppend.length(), 33);
                }
                SpannableStringBuilder spannableStringBuilder3 = c1766720w4k.LLJJL;
                if (spannableStringBuilder3 != null) {
                    AbstractC426530Gnz abstractC426530Gnz2 = new AbstractC426530Gnz() { // from class: X.0w4m
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                        }

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            awS570S0100000_26.invoke();
                        }
                    };
                    SpannableStringBuilder spannableStringBuilder4 = c1766720w4k.LLJJL;
                    if (spannableStringBuilder4 != null) {
                        length2 = spannableStringBuilder4.length();
                    } else {
                        length2 = 0;
                    }
                    C786410Ut5.q2(spannableStringBuilder3, abstractC426530Gnz2, 0, length2, 33);
                }
                c1766720w4k.LJJJLZIJ(c1766720w4k.LLJJL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), false, awS570S0100000_26);
                c1766720w4k.setText(c1766720w4k.LLJJL);
                c1766720w4k.requestLayout();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1766720w4k.setText(charSequence);
            c1766720w4k.setMaxLines(i);
        }
    }

    public final void LJJJLZIJ(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5, boolean z, Function0 function0) {
        if (spannableStringBuilder == null) {
            return;
        }
        spannableStringBuilder.insert(spannableStringBuilder.length(), " ");
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(getContext(), R.raw.icon_chevron_down_fill);
        tuxIconDrawable.LJI(R.attr.a1k, getContext());
        tuxIconDrawable.setBounds(i, i2, i3, i4);
        C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
        c419890GdH.LIZIZ(i5, 0, false);
        C786410Ut5.q2(spannableStringBuilder, c419890GdH, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        final AwS570S0100000_26 awS570S0100000_26 = (AwS570S0100000_26) function0;
        C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0w4n
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                awS570S0100000_26.invoke();
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
}
