package X;

import Y.ACListenerS160S0100000_26;
import Y.ARunnableS15S0301000_26;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0vwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761470vwH extends FrameLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public C1528180ps0 LLILLL;
    public C1528180ps0 LLILZ;
    public Integer LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJ;
    public Function1<? super Boolean, Unit> LLJI;

    public final C1528180ps0 getContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eu1);
            this.LLILLL = (C1528180ps0) callbackFindViewById;
        }
        return (C1528180ps0) callbackFindViewById;
    }

    public final C1528180ps0 getMoreContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oks);
            this.LLILZ = (C1528180ps0) callbackFindViewById;
        }
        return (C1528180ps0) callbackFindViewById;
    }

    public final TuxTextView getMoreDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oku);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getMoreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.okj);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final Integer getContentHeight() {
        return this.LLILZIL;
    }

    public final int getSeeLessTextColor() {
        return this.LLIZ;
    }

    public final boolean getShowLessDisplayed() {
        return this.LLILZLL;
    }

    public final int getTextType() {
        return this.LLIZLLLIL;
    }

    public final void setCollapseListener(Function1<? super Boolean, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setContentColor(int i) {
        getContentFromXml().setTextColorRes(i);
        getMoreDotFromXml().setTextColorRes(i);
        getMoreContentFromXml().setTextColorRes(i);
    }

    public final void setContentFont(int i) {
        getContentFromXml().setTuxFont(i);
    }

    public final void setContentFromXml(C1528180ps0 c1528180ps0) {
        this.LLILLL = c1528180ps0;
    }

    public final void setContentHeight(Integer num) {
        this.LLILZIL = num;
    }

    public final void setDisplayShowLess(boolean z) {
        this.LLILZLL = z;
    }

    public final void setExpandListener(Function1<? super Boolean, Unit> function1) {
        this.LLJ = function1;
    }

    public final void setLessColor(int i) {
        this.LLIZ = i;
    }

    public final void setMoreContentFromXml(C1528180ps0 c1528180ps0) {
        this.LLILZ = c1528180ps0;
    }

    public final void setMoreDotFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setMoreDotText(String str) {
        getMoreDotFromXml().setText(str);
    }

    public final void setMoreFont(int i) {
        getMoreDotFromXml().setTuxFont(i);
        getMoreContentFromXml().setTuxFont(i);
    }

    public final void setMoreFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setSeeLessTextColor(int i) {
        this.LLIZ = i;
    }

    public final void setShowLessDisplayed(boolean z) {
        this.LLILZLL = z;
    }

    public final void setTextType(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setViewSource(int i) {
        this.LLIZLLLIL = i;
    }

    public C1761470vwH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = R.attr.a1h;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aul, this, true);
        C786410Ut5.R7(getMoreFromXml(), new ACListenerS160S0100000_26(this, 2));
        getMoreDotFromXml().setText("... ");
    }

    public final int LIZ(int i, CharSequence charSequence) {
        C1528180ps0 contentFromXml = getContentFromXml();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getContentFromXml().getTextSize());
        return C20588115hH.LIZLLL(contentFromXml, charSequence, textPaint, i, null, true).getLineCount();
    }

    public static void LIZIZ(final C1761470vwH c1761470vwH, final CharSequence charSequence, int i, boolean z, final boolean z2, int i2) {
        AFwS268S0000000_26 aFwS268S0000000_26;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(8);
        } else {
            aFwS268S0000000_26 = null;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if (!z) {
            c1761470vwH.getContentFromXml().setEllipsize(null);
            c1761470vwH.getContentFromXml().setMaxLines(i3);
            C786410Ut5.LJZL(8, c1761470vwH.getMoreFromXml());
            HandlerHook.viewPost(c1761470vwH, new ARunnableS15S0301000_26(i3, c1761470vwH, aFwS268S0000000_26, charSequence, 0));
            return;
        }
        c1761470vwH.getContentFromXml().setEllipsize(null);
        c1761470vwH.getContentFromXml().setMaxLines(Integer.MAX_VALUE);
        final AFwS268S0000000_26 aFwS268S0000000_262 = aFwS268S0000000_26;
        final int i4 = i3;
        HandlerHook.viewPost(c1761470vwH, new Runnable() { // from class: X.0vwI
            public final void LIZ() {
                FrameLayout.LayoutParams layoutParams;
                FrameLayout.LayoutParams layoutParams2;
                try {
                    C1528180ps0 contentFromXml = this.LL.getContentFromXml();
                    Function1<CharSequence, CharSequence> function1 = aFwS268S0000000_262;
                    CharSequence charSequence2 = charSequence;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    contentFromXml.setText(function1.invoke(SpannableString.valueOf(charSequence2)));
                    C1761490vwJ c1761490vwJ = new C1761490vwJ(this.LL.getContentFromXml(), (this.LL.getWidth() - this.LL.getPaddingStart()) - this.LL.getPaddingEnd(), this.LL.getMoreContentFromXml().getText().toString(), i4, -1.0f);
                    CharSequence charSequence3 = charSequence;
                    SpannableString spannableStringLIZ = c1761490vwJ.LIZ(SpannableString.valueOf(charSequence3 != null ? charSequence3 : ""));
                    if (!c1761490vwJ.LIZLLL) {
                        this.LL.getContentFromXml().setText(aFwS268S0000000_262.invoke(spannableStringLIZ));
                        C786410Ut5.LJZL(8, this.LL.getMoreFromXml());
                        return;
                    }
                    this.LL.getContentFromXml().setText(aFwS268S0000000_262.invoke(spannableStringLIZ));
                    LinearLayout moreFromXml = this.LL.getMoreFromXml();
                    boolean z3 = z2;
                    C786410Ut5.LJZL(0, moreFromXml);
                    FrameLayout.LayoutParams layoutParams3 = null;
                    if (!z3) {
                        ViewGroup.LayoutParams layoutParams4 = moreFromXml.getLayoutParams();
                        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                            layoutParams.gravity = 8388693;
                            layoutParams.setMarginStart(0);
                            layoutParams3 = layoutParams;
                        }
                        C786410Ut5.d6(moreFromXml, layoutParams3);
                        return;
                    }
                    float f = c1761490vwJ.LJII;
                    ViewGroup.LayoutParams layoutParams5 = moreFromXml.getLayoutParams();
                    if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                        layoutParams2.gravity = 8388691;
                        layoutParams2.setMarginStart((int) f);
                        layoutParams3 = layoutParams2;
                    }
                    C786410Ut5.d6(moreFromXml, layoutParams3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ViewMoreText@262b.setText$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ViewMoreText@262b.setText$3");
            }
        });
    }

    public static void LIZJ(C1761470vwH c1761470vwH, CharSequence charSequence, int i, int i2, boolean z, int i3) {
        AFwS268S0000000_26 aFwS268S0000000_26;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i4 = i2;
        if ((i3 & 4) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(9);
        } else {
            aFwS268S0000000_26 = null;
        }
        c1761470vwH.getClass();
        int paddingStart = (i - c1761470vwH.getPaddingStart()) - c1761470vwH.getPaddingEnd();
        CharSequence charSequence5 = "";
        try {
            if (!z) {
                c1761470vwH.getContentFromXml().setEllipsize(null);
                c1761470vwH.getContentFromXml().setMaxLines(i4);
                C786410Ut5.LJZL(8, c1761470vwH.getMoreFromXml());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(new Regex("\\s+").replace(c1761470vwH.getResources().getString(2131857251), " "));
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.p2(spannableString, new C1775670wJB(c1761470vwH, 0), 0, spannableString.length(), 33);
                c1761470vwH.getContentFromXml().setHighlightColor(0);
                C1528180ps0 contentFromXml = c1761470vwH.getContentFromXml();
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence;
                }
                contentFromXml.setText((CharSequence) aFwS268S0000000_26.invoke(SpannableString.valueOf(charSequence2)));
                C1761500vwK c1761500vwK = new C1761500vwK(c1761470vwH.getContentFromXml(), "", i4);
                if (charSequence == null) {
                    charSequence3 = "";
                } else {
                    charSequence3 = charSequence;
                }
                SpannableString spannableStringLIZ = c1761500vwK.LIZ(SpannableString.valueOf(charSequence3), paddingStart);
                if (c1761500vwK.LIZLLL) {
                    c1761470vwH.getContentFromXml().setText((CharSequence) aFwS268S0000000_26.invoke(aFwS268S0000000_26.invoke(new SpannableStringBuilder(spannableStringLIZ).append((CharSequence) "..."))));
                } else {
                    C1528180ps0 contentFromXml2 = c1761470vwH.getContentFromXml();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringLIZ);
                    if (c1761470vwH.LLILZLL) {
                        charSequence5 = spannableString;
                    }
                    contentFromXml2.setText((CharSequence) aFwS268S0000000_26.invoke(aFwS268S0000000_26.invoke(spannableStringBuilder.append(charSequence5))));
                    if (c1761470vwH.LLILZLL) {
                        C1748720vbi.LIZLLL(c1761470vwH.getContentFromXml(), new C049X(), new AwS605S0100000_26(c1761470vwH, 23));
                    }
                    c1761470vwH.getContentFromXml().setMovementMethod(LinkMovementMethod.getInstance());
                }
                C1528180ps0 contentFromXml3 = c1761470vwH.getContentFromXml();
                CharSequence text = c1761470vwH.getContentFromXml().getText();
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(c1761470vwH.getContentFromXml().getTextSize());
                c1761470vwH.LLILZIL = Integer.valueOf(C20588115hH.LIZLLL(contentFromXml3, text, textPaint, paddingStart, null, true).getHeight());
                return;
            }
            c1761470vwH.getContentFromXml().setEllipsize(null);
            c1761470vwH.getContentFromXml().setMaxLines(Integer.MAX_VALUE);
            C1528180ps0 contentFromXml4 = c1761470vwH.getContentFromXml();
            if (charSequence == null) {
                charSequence4 = "";
            } else {
                charSequence4 = charSequence;
            }
            contentFromXml4.setText((CharSequence) aFwS268S0000000_26.invoke(SpannableString.valueOf(charSequence4)));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ...");
            sbLIZ2.append(new Regex("\\s+").replace(c1761470vwH.getResources().getString(2131857252), " "));
            SpannableString spannableString2 = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.p2(spannableString2, new C1775670wJB(c1761470vwH, 1), 0, spannableString2.length(), 33);
            c1761470vwH.getContentFromXml().setHighlightColor(0);
            C1761500vwK c1761500vwK2 = new C1761500vwK(c1761470vwH.getContentFromXml(), spannableString2.toString(), i4);
            if (charSequence != null) {
                charSequence5 = charSequence;
            }
            SpannableString spannableStringLIZ2 = c1761500vwK2.LIZ(SpannableString.valueOf(charSequence5), paddingStart);
            if (c1761500vwK2.LIZLLL) {
                c1761470vwH.getContentFromXml().setText((CharSequence) aFwS268S0000000_26.invoke(aFwS268S0000000_26.invoke(new SpannableStringBuilder(spannableStringLIZ2).append((CharSequence) spannableString2))));
                C1748720vbi.LIZLLL(c1761470vwH.getContentFromXml(), new C049X(), new AwS605S0100000_26(c1761470vwH, 24));
                c1761470vwH.getContentFromXml().setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                c1761470vwH.getContentFromXml().setText((CharSequence) aFwS268S0000000_26.invoke(spannableStringLIZ2));
                C786410Ut5.LJZL(8, c1761470vwH.getMoreFromXml());
            }
            C1528180ps0 contentFromXml5 = c1761470vwH.getContentFromXml();
            CharSequence text2 = c1761470vwH.getContentFromXml().getText();
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(c1761470vwH.getContentFromXml().getTextSize());
            c1761470vwH.LLILZIL = Integer.valueOf(C20588115hH.LIZLLL(contentFromXml5, text2, textPaint2, paddingStart, null, true).getHeight());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1761470vwH.getContentFromXml().setText(charSequence);
            C1528180ps0 contentFromXml6 = c1761470vwH.getContentFromXml();
            CharSequence text3 = c1761470vwH.getContentFromXml().getText();
            TextPaint textPaint3 = new TextPaint();
            textPaint3.setTextSize(c1761470vwH.getContentFromXml().getTextSize());
            c1761470vwH.LLILZIL = Integer.valueOf(C20588115hH.LIZLLL(contentFromXml6, text3, textPaint3, paddingStart, null, true).getHeight());
        }
    }
}
