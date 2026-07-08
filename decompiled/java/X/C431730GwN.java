package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431730GwN extends C1860130yVP implements InterfaceC431780GwS {
    public static final /* synthetic */ int LLLFFI = 0;
    public int LLJJJJLIIL;
    public CharSequence LLJJL;
    public CharSequence LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public EnumC431710GwL LLJZ;
    public String LLJZIJLIL;
    public boolean LLL;
    public final C1860030yVF<C431730GwN> LLLF;
    public final ViewTreeObserverOnGlobalLayoutListenerC462870IDd LLLFF;

    public C431730GwN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final ITakoService getTakoService() {
        return (ITakoService) this.LLJLILLLLZIIL.getValue();
    }

    private final String getTruncateText() {
        int i = C431680GwI.LIZ[this.LLJZ.ordinal()];
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("... ");
            sbLIZ.append(getContext().getString(2131837627));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i == 2) {
            if (C0BQG.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("... ");
                sbLIZ2.append(getContext().getString(2131837627));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("... ");
            sbLIZ3.append(getContext().getString(2131830117));
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (i != 3) {
            if (i == 4) {
                return "...";
            }
            throw new C1954807lC();
        }
        String str = this.LLJZIJLIL;
        if (str == null) {
            return "";
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("... ");
        sbLIZ4.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    private final CharSequence getTruncateSpan() {
        boolean zIsRtl;
        this.LLJJL = getTruncateText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLJJL);
        CharSequence charSequence = this.LLJJL;
        if (charSequence != null) {
            int iLJJJ = a0.LJJJ(charSequence, "...", 0, false, 6);
            int i = iLJJJ + 3;
            if (iLJJJ >= 0 && i < spannableStringBuilder.length()) {
                if ((this.LLJZ == EnumC431710GwL.VIEW_ALL && !C0BQG.LIZ()) || ((this.LLJZ == EnumC431710GwL.CUSTOM && this.LLL) || this.LLJLLIL)) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = this.LLJLLIL ? R.raw.icon_chevron_down_fill : R.raw.icon_chevron_right_fill_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                    tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
                    boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
                    if (Build.VERSION.SDK_INT >= 26) {
                        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                        InterfaceC342000Daw markdownContent = getMarkdownContent();
                        zIsRtl = bidiFormatter.isRtl(markdownContent != null ? markdownContent.LIZLLL() : null);
                    } else {
                        zIsRtl = zLIZLLL;
                    }
                    ITakoService takoService = getTakoService();
                    Context context = getContext();
                    InterfaceC430910Gv3 interfaceC430910Gv3LJJLIL = takoService.LJJLIL(tuxIconDrawableLIZ, 0, 0, context != null ? C426750GoL.LIZLLL(context) : false, true);
                    if (zLIZLLL == zIsRtl) {
                        spannableStringBuilder.append((CharSequence) "\u200b");
                        C786410Ut5.q2(spannableStringBuilder, interfaceC430910Gv3LJJLIL, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    } else {
                        spannableStringBuilder.insert(i, (CharSequence) "\u200b");
                        C786410Ut5.q2(spannableStringBuilder, interfaceC430910Gv3LJJLIL, i, i + 1, 17);
                    }
                }
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), i, spannableStringBuilder.length(), 17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
                if (numLIZJ != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), i, spannableStringBuilder.length(), 17);
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override // X.C1860130yVP, X.C1860100yVM, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLF.LIZ();
    }

    public final boolean getCustomDisableClick() {
        return this.LLJLLL;
    }

    public final boolean getEnableDownChevron() {
        return this.LLJLLIL;
    }

    public final boolean getEnableToggleAction() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC431780GwS
    public C1860030yVF<C431730GwN> getMDWithOriginSelectHelper() {
        return this.LLLF;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener getObserver() {
        return this.LLLFF;
    }

    public final int getShowMaxLines() {
        return this.LLJJJJLIIL;
    }

    public final boolean getTextNeedFold() {
        return this.LLJLIL;
    }

    public final void LJJJJLL(Function1<? super Boolean, Unit> function1) {
        if (!this.LLJLL) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderLIZLLL = null;
        if (this.LLJL) {
            this.LLJLIL = true;
            InterfaceC342000Daw markdownContent = getMarkdownContent();
            if (markdownContent != null) {
                spannableStringBuilderLIZLLL = markdownContent.LIZLLL();
            }
            setText(spannableStringBuilderLIZLLL);
            function1.invoke(Boolean.FALSE);
            return;
        }
        this.LLJLIL = false;
        setMaxLines(Integer.MAX_VALUE);
        InterfaceC342000Daw markdownContent2 = getMarkdownContent();
        if (markdownContent2 != null) {
            spannableStringBuilderLIZLLL = markdownContent2.LIZLLL();
        }
        setText(spannableStringBuilderLIZLLL);
        function1.invoke(Boolean.TRUE);
    }

    @Override // X.C1860130yVP, X.C1857630yRN, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJLLL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCustomDisableClick(boolean z) {
        this.LLJLLL = z;
    }

    public final void setCustomShowTruncateIcon(boolean z) {
        this.LLL = z;
    }

    public final void setCustomTruncateText(String str) {
        this.LLJZIJLIL = str;
    }

    public final void setEnableDownChevron(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setEnableToggleAction(boolean z) {
        this.LLJLL = z;
    }

    public void setOpenOriginSelect(boolean z) {
        C1860030yVF<C431730GwN> mDWithOriginSelectHelper = getMDWithOriginSelectHelper();
        mDWithOriginSelectHelper.LIZIZ = z;
        mDWithOriginSelectHelper.LIZ();
    }

    public final void setShowMaxLines(int i) {
        this.LLJJJJLIIL = i;
        setMaxLines(i);
    }

    public final void setTruncateType(EnumC431710GwL enumC431710GwL) {
        this.LLJZ = enumC431710GwL;
    }

    public final StaticLayout LJJJJLI(int i, CharSequence charSequence) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0 && 0 == 0) {
            numValueOf = Integer.valueOf(getWidth());
            if (numValueOf.intValue() <= 0) {
                return null;
            }
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), numValueOf.intValue()).setIncludePad(getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJJLIIL(android.text.Layout r10, java.lang.CharSequence r11) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C431730GwN.LJJJLIIL(android.text.Layout, java.lang.CharSequence):java.lang.CharSequence");
    }

    @Override // X.C1860130yVP, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence) && this.LLJJJJLIIL != 0 && this.LLJLIL) {
            CharSequence charSequence2 = this.LLJJLIIIJLLLLLLLZ;
            if (charSequence2 != null) {
                this.LLJL = false;
                super.setText(charSequence2, bufferType);
                return;
            }
            C786410Ut5.x3(getViewTreeObserver(), this.LLLFF);
            AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6(this, bufferType, 18);
            Layout layout = getLayout();
            if (layout == null || !layout.getText().equals(charSequence)) {
                awS372S0200000_6.invoke(charSequence);
                layout = getLayout();
                if (layout == null) {
                    return;
                }
            }
            C786410Ut5.C3(getViewTreeObserver(), this.LLLFF);
            awS372S0200000_6.invoke(LJJJLIIL(layout, charSequence));
            return;
        }
        this.LLJL = true;
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C431730GwN(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLJJL = "";
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(121));
        this.LLJZ = EnumC431710GwL.SEE_MORE;
        C418440Gaw.LIZIZ(20);
        C418440Gaw.LIZIZ(4);
        this.LLLF = new C1860030yVF<>(this);
        this.LLLFF = new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 0);
        this.LLJJJJLIIL = 7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FoldTextView);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getInt(R$styleable.FoldTextView_showMaxLine, 7);
            typedArrayObtainStyledAttributes.getColor(R$styleable.FoldTextView_tipColor, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        C341990Dav.LIZ(this, context, 0, 0, null, 14);
    }
}
