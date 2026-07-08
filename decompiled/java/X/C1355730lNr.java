package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0lNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1355730lNr extends C1355740lNs {
    public InterfaceC1355720lNq LLJ;
    public View.OnClickListener LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public final int LLJJI;
    public SpannableString LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;

    public int getDesiredHeight() {
        Layout layout = getLayout();
        return layout == null ? getHeight() : layout.getLineTop(getLineCount()) + getCompoundPaddingBottom() + getCompoundPaddingTop();
    }

    public final boolean LJJJIL(float f) {
        boolean z = false;
        if (getDesiredHeight() <= getHeight()) {
            return false;
        }
        if (f > 0.0f) {
            if ((getDesiredHeight() - getHeight()) - getScrollY() <= 8) {
                z = true;
            }
            getParent().requestDisallowInterceptTouchEvent(!z);
            return true;
        }
        ViewParent parent = getParent();
        if (getScrollY() != 0) {
            z = true;
        }
        parent.requestDisallowInterceptTouchEvent(z);
        return true;
    }

    @Override // X.C1355740lNs, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = this.LLJJIJIIJIL - motionEvent.getY();
                    float x = this.LLJJIJIL - motionEvent.getX();
                    if (Math.abs(y) > 5.0f || Math.abs(x) > 5.0f) {
                        this.LLJJJIL = false;
                        int i = this.LLJJJ;
                        if (i == 0) {
                            if (Math.abs(y) > Math.abs(x)) {
                                boolean zLJJJIL = LJJJIL(y);
                                this.LLJJJ = 2;
                                if (zLJJJIL) {
                                    return true;
                                }
                            } else {
                                if (!C444960Hcc.LIZJ(getContext()) ? x <= 0.0f : x >= 0.0f) {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                } else {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                }
                                this.LLJJJ = 1;
                                return true;
                            }
                        } else if (i == 2) {
                            LJJJIL(y);
                        }
                    }
                }
            } else {
                View.OnClickListener onClickListener = this.LLJI;
                if (onClickListener != null && this.LLJJJIL) {
                    onClickListener.onClick(this);
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        } else {
            this.LLJJJ = 0;
            this.LLJJJIL = true;
        }
        this.LLJJIJIIJIL = motionEvent.getY();
        this.LLJJIJIL = motionEvent.getX();
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAdHashTag(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1355730lNr.setAdHashTag(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.LLJI = onClickListener;
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setMentionSpanColor(int i) {
        this.LLJILJILJ = i;
    }

    public void setOnSpanClickListener(InterfaceC1355720lNq interfaceC1355720lNq) {
        this.LLJ = interfaceC1355720lNq;
    }

    public void setSpanColor(int i) {
        this.LLJJIJI = i;
    }

    public void setSpanSize(float f) {
        this.LLJIJIL = f;
    }

    public void setSpanStyle(int i) {
        if (i == 0) {
            this.LLJJ = 11;
        } else {
            if (i != 1) {
                return;
            }
            this.LLJJ = 12;
        }
    }

    public C1355730lNr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJ = 12;
        this.LLJJI = 12;
        this.LLJJJIL = true;
        this.LLJIJIL = getTextSize();
        this.LLJILJIL = getCurrentTextColor();
        this.LLJILJILJ = -1;
        this.LLJILLL = 0.75f;
        setHighlightColor(0);
    }

    public final void LJJJJ(CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (TextUtils.equals("ko", str) || TextUtils.equals("ja", str) || TextUtils.equals("zh-Hant", str)) {
            final int iLIZ = C341940Daq.LIZ(20.0d);
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            C786410Ut5.q2(spannableStringBuilder, new LineHeightSpan(iLIZ) { // from class: X.0GVl
                public final int LL;

                {
                    this.LL = iLIZ;
                }

                @Override // android.text.style.LineHeightSpan
                public final void chooseHeight(CharSequence charSequence2, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                    int i5 = fontMetricsInt.descent;
                    int i6 = this.LL;
                    if (i5 > i6) {
                        int iMin = Math.min(i6, i5);
                        fontMetricsInt.descent = iMin;
                        fontMetricsInt.bottom = iMin;
                        fontMetricsInt.ascent = 0;
                        fontMetricsInt.top = 0;
                        return;
                    }
                    int i7 = fontMetricsInt.ascent;
                    if ((-i7) + i5 > i6) {
                        fontMetricsInt.bottom = i5;
                        int i8 = (-i6) + i5;
                        fontMetricsInt.ascent = i8;
                        fontMetricsInt.top = i8;
                        return;
                    }
                    int i9 = fontMetricsInt.bottom;
                    if ((-i7) + i9 > i6) {
                        fontMetricsInt.top = i7;
                        fontMetricsInt.bottom = i7 + i6;
                        return;
                    }
                    int i10 = fontMetricsInt.top;
                    if ((-i10) + i9 > i6) {
                        fontMetricsInt.top = i9 - i6;
                        return;
                    }
                    double d = (i6 - ((-i10) + i9)) / 2.0f;
                    fontMetricsInt.top = i10 - ((int) Math.ceil(d));
                    int iFloor = fontMetricsInt.bottom + ((int) Math.floor(d));
                    fontMetricsInt.bottom = iFloor;
                    fontMetricsInt.ascent = fontMetricsInt.top;
                    fontMetricsInt.descent = iFloor;
                }
            }, 0, charSequence.length(), 33);
            setLineSpacing(0.0f, 1.0f);
            charSequence = spannableStringBuilder;
        }
        setText(charSequence);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
        }
    }

    public C1355730lNr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJ = 12;
        this.LLJJI = 12;
        this.LLJJJIL = true;
        this.LLJIJIL = getTextSize();
        this.LLJILJIL = getCurrentTextColor();
        this.LLJILJILJ = -1;
        this.LLJILLL = 0.75f;
        setHighlightColor(0);
    }

    public final void LJJJJI(int i, int i2, Object obj) {
        int length;
        SpannableString spannableString = this.LLJJIII;
        if (spannableString != null && i <= (length = spannableString.length()) && i2 <= length && i <= i2) {
            C786410Ut5.p2(this.LLJJIII, obj, i, i2, 33);
            setText(this.LLJJIII);
        }
    }

    public final void LJJJJIZL(List<TextExtraStruct> list, C0SQF c0sqf, C0SQF c0sqf2) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableString.toString())) {
            int length = spannableString.length();
            for (final TextExtraStruct textExtraStruct : list) {
                if (c0sqf == null || !c0sqf.LIZ(textExtraStruct)) {
                    if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                        final int i = 0;
                        if (textExtraStruct.getStart() < 0) {
                            start = 0;
                        } else {
                            start = textExtraStruct.getStart();
                        }
                        if (textExtraStruct.getEnd() > length) {
                            end = length;
                        } else {
                            end = textExtraStruct.getEnd();
                        }
                        if (end > start) {
                            if (textExtraStruct.getType() == 65281) {
                                C786410Ut5.p2(spannableString, textExtraStruct.getCustomSpan(), start, end, 33);
                            } else if (textExtraStruct.getType() != 4 && (c0sqf2 == null || !c0sqf2.LIZ(textExtraStruct))) {
                                if (textExtraStruct.getType() == 65282) {
                                    final InterfaceC1355720lNq interfaceC1355720lNq = this.LLJ;
                                    final int color = textExtraStruct.getColor();
                                    C786410Ut5.p2(spannableString, new AbstractC1355710lNp(interfaceC1355720lNq, textExtraStruct, color) { // from class: X.0lNn
                                        public final InterfaceC1355720lNq LLILLL;
                                        public final TextExtraStruct LLILZ;
                                        public final int LLILZIL;
                                        public final boolean LLILZLL;

                                        @Override // android.text.style.ClickableSpan
                                        public final void onClick(View view) {
                                            InterfaceC1355720lNq interfaceC1355720lNq2;
                                            if (!C0OBG.LIZIZ(view) && (interfaceC1355720lNq2 = this.LLILLL) != null) {
                                                interfaceC1355720lNq2.LIZ(this.LLILZ);
                                            }
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public final void updateDrawState(TextPaint textPaint) {
                                            int iArgb = this.LLILZIL;
                                            if (iArgb == 0) {
                                                iArgb = textPaint.linkColor;
                                            }
                                            if (this.LL) {
                                                iArgb = Color.argb(Math.round(Color.alpha(iArgb) * this.LLIZ.LLJILLL), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
                                            }
                                            textPaint.setColor(iArgb);
                                            this.LLIZ.getClass();
                                            textPaint.setUnderlineText(false);
                                            C444890HcV c444890HcV = new C444890HcV();
                                            if (this.LLILZLL) {
                                                c444890HcV.LIZ(82);
                                            } else {
                                                c444890HcV.LIZ(81);
                                            }
                                            textPaint.setTypeface(c444890HcV.getTypeface());
                                        }

                                        {
                                            super(this.LLIZ);
                                            this.LLILLL = interfaceC1355720lNq;
                                            this.LLILZ = textExtraStruct;
                                            this.LLILZIL = color;
                                            this.LLILZLL = textExtraStruct.isBoldText();
                                        }
                                    }, start, end, 33);
                                } else if (textExtraStruct.getType() == 5) {
                                    final InterfaceC1355720lNq interfaceC1355720lNq2 = this.LLJ;
                                    final int color2 = textExtraStruct.getColor();
                                    C786410Ut5.p2(spannableString, new AbstractC1355710lNp(interfaceC1355720lNq2, textExtraStruct, color2) { // from class: X.0lNn
                                        public final InterfaceC1355720lNq LLILLL;
                                        public final TextExtraStruct LLILZ;
                                        public final int LLILZIL;
                                        public final boolean LLILZLL;

                                        @Override // android.text.style.ClickableSpan
                                        public final void onClick(View view) {
                                            InterfaceC1355720lNq interfaceC1355720lNq22;
                                            if (!C0OBG.LIZIZ(view) && (interfaceC1355720lNq22 = this.LLILLL) != null) {
                                                interfaceC1355720lNq22.LIZ(this.LLILZ);
                                            }
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public final void updateDrawState(TextPaint textPaint) {
                                            int iArgb = this.LLILZIL;
                                            if (iArgb == 0) {
                                                iArgb = textPaint.linkColor;
                                            }
                                            if (this.LL) {
                                                iArgb = Color.argb(Math.round(Color.alpha(iArgb) * this.LLIZ.LLJILLL), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
                                            }
                                            textPaint.setColor(iArgb);
                                            this.LLIZ.getClass();
                                            textPaint.setUnderlineText(false);
                                            C444890HcV c444890HcV = new C444890HcV();
                                            if (this.LLILZLL) {
                                                c444890HcV.LIZ(82);
                                            } else {
                                                c444890HcV.LIZ(81);
                                            }
                                            textPaint.setTypeface(c444890HcV.getTypeface());
                                        }

                                        {
                                            super(this.LLIZ);
                                            this.LLILLL = interfaceC1355720lNq2;
                                            this.LLILZ = textExtraStruct;
                                            this.LLILZIL = color2;
                                            this.LLILZLL = textExtraStruct.isBoldText();
                                        }
                                    }, start, end, 33);
                                } else if (textExtraStruct.getType() == 6) {
                                    C786410Ut5.p2(spannableString, new C444920HcY(this.LLJJI, true), start, end, 33);
                                    int i2 = end + 1;
                                    if (i2 <= spannableString.length()) {
                                        end = i2;
                                    }
                                    final InterfaceC1355720lNq interfaceC1355720lNq3 = null;
                                    C786410Ut5.p2(spannableString, new AbstractC1355710lNp(interfaceC1355720lNq3, textExtraStruct, i) { // from class: X.0lNn
                                        public final InterfaceC1355720lNq LLILLL;
                                        public final TextExtraStruct LLILZ;
                                        public final int LLILZIL;
                                        public final boolean LLILZLL;

                                        @Override // android.text.style.ClickableSpan
                                        public final void onClick(View view) {
                                            InterfaceC1355720lNq interfaceC1355720lNq22;
                                            if (!C0OBG.LIZIZ(view) && (interfaceC1355720lNq22 = this.LLILLL) != null) {
                                                interfaceC1355720lNq22.LIZ(this.LLILZ);
                                            }
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public final void updateDrawState(TextPaint textPaint) {
                                            int iArgb = this.LLILZIL;
                                            if (iArgb == 0) {
                                                iArgb = textPaint.linkColor;
                                            }
                                            if (this.LL) {
                                                iArgb = Color.argb(Math.round(Color.alpha(iArgb) * this.LLIZ.LLJILLL), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
                                            }
                                            textPaint.setColor(iArgb);
                                            this.LLIZ.getClass();
                                            textPaint.setUnderlineText(false);
                                            C444890HcV c444890HcV = new C444890HcV();
                                            if (this.LLILZLL) {
                                                c444890HcV.LIZ(82);
                                            } else {
                                                c444890HcV.LIZ(81);
                                            }
                                            textPaint.setTypeface(c444890HcV.getTypeface());
                                        }

                                        {
                                            super(this.LLIZ);
                                            this.LLILLL = interfaceC1355720lNq3;
                                            this.LLILZ = textExtraStruct;
                                            this.LLILZIL = i;
                                            this.LLILZLL = textExtraStruct.isBoldText();
                                        }
                                    }, start, end, 33);
                                } else {
                                    if (textExtraStruct.getType() == 2) {
                                        this.LLJILJIL = C960203pA.LIZ(R.attr.a1h, getContext());
                                    } else if (textExtraStruct.getType() != 0 && textExtraStruct.getType() != 1 && textExtraStruct.getType() != 5) {
                                        if (textExtraStruct.getType() == 3) {
                                            this.LLJILJIL = C960203pA.LIZ(R.attr.a1h, getContext());
                                        }
                                    } else {
                                        this.LLJILJIL = C960203pA.LIZ(R.attr.nl, getContext());
                                    }
                                    final InterfaceC1355720lNq interfaceC1355720lNq4 = this.LLJ;
                                    final int i3 = this.LLJILJIL;
                                    C786410Ut5.p2(spannableString, new AbstractC1355710lNp(interfaceC1355720lNq4, textExtraStruct, i3) { // from class: X.0lNo
                                        public final InterfaceC1355720lNq LLILLL;
                                        public final TextExtraStruct LLILZ;
                                        public final int LLILZIL;

                                        @Override // X.AbstractC1355710lNp
                                        public final void LIZ(boolean z) {
                                            super.LIZ(z);
                                        }

                                        @Override // android.text.style.ClickableSpan
                                        public final void onClick(View view) {
                                            InterfaceC1355720lNq interfaceC1355720lNq5;
                                            if (!C0OBG.LIZIZ(view) && (interfaceC1355720lNq5 = this.LLILLL) != null) {
                                                interfaceC1355720lNq5.LIZ(this.LLILZ);
                                            }
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public final void updateDrawState(TextPaint textPaint) {
                                            C1355730lNr c1355730lNr = this.LLILZLL;
                                            int iArgb = c1355730lNr.LLJJIJI;
                                            if (iArgb == 0 && (iArgb = this.LLILZIL) == 0) {
                                                iArgb = textPaint.linkColor;
                                            }
                                            if (c1355730lNr.LLJILJILJ != -1 && this.LLILZ.getType() == 0) {
                                                iArgb = this.LLILZLL.LLJILJILJ;
                                            }
                                            if (this.LL) {
                                                iArgb = Color.argb(Math.round(Color.alpha(iArgb) * this.LLILZLL.LLJILLL), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
                                            }
                                            textPaint.setColor(iArgb);
                                            this.LLILZLL.getClass();
                                            textPaint.setUnderlineText(false);
                                        }

                                        {
                                            super(this.LLILZLL);
                                            this.LLILLL = interfaceC1355720lNq4;
                                            this.LLILZ = textExtraStruct;
                                            this.LLILZIL = i3;
                                            if (this.LLILZLL.LLJJIJI != 0) {
                                                this.LLILZLL.getPaint().setColor(this.LLILZLL.LLJJIJI);
                                            } else {
                                                this.LLILZLL.getPaint().setColor(i3 == 0 ? this.LLILZLL.getPaint().linkColor : i3);
                                            }
                                        }
                                    }, start, end, 33);
                                    C786410Ut5.p2(spannableString, new C444920HcY(this.LLJJ, true), start, end, 33);
                                    C786410Ut5.p2(spannableString, new AbsoluteSizeSpan((int) this.LLJIJIL), start, end, 33);
                                }
                            }
                        }
                    }
                }
            }
            this.LLJJIII = spannableString;
            setText(spannableString);
            return;
        }
        this.LLJJIII = spannableString;
    }
}
