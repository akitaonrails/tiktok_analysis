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
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430890Gv1 extends TuxTextView {
    public static final /* synthetic */ int LLLFZ = 0;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public InterfaceC430910Gv3 LLJJL;
    public InterfaceC430960Gv8 LLJJLIIIJLLLLLLLZ;
    public CharSequence LLJL;
    public CharSequence LLJLIL;
    public CharSequence LLJLILLLLZIIL;
    public CharSequence LLJLL;
    public CharSequence LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public InterfaceC430670Guf LLLFF;
    public Integer LLLFFI;

    public final void LJJJJLI() {
        this.LLLF = false;
        this.LLJLLL = false;
        this.LLJZ = true;
        this.LLJL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
    }

    private final CharSequence getEndAppendTextNoOmit() {
        CharSequence charSequence = this.LLJLIL;
        if (charSequence != null) {
            return charSequence;
        }
        if (((String) this.LLJJJJLIIL).length() == 0) {
            return new SpannableStringBuilder();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append((Object) this.LLJJJJLIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        int iLJJJ = a0.LJJJ(strLIZIZ, this.LLJJJJLIIL.toString(), 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, C0BQC.LIZ() ? new C444920HcY(62, true) : new C444920HcY(62, false), iLJJJ, spannableStringBuilder.length(), 17);
            Integer numLIZJ = this.LLLFFI;
            if (numLIZJ != null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, getContext())) != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, spannableStringBuilder.length(), 17);
            }
        }
        LJJJJJ(spannableStringBuilder);
        this.LLJLIL = spannableStringBuilder;
        return spannableStringBuilder;
    }

    private final CharSequence getEndAppendTextNoOmitWithClick() {
        CharSequence charSequence = this.LLJLILLLLZIIL;
        if (charSequence != null) {
            return charSequence;
        }
        if (((String) this.LLJJJJLIIL).length() == 0) {
            return new SpannableStringBuilder();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append((Object) this.LLJJJJLIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        int iLJJJ = a0.LJJJ(strLIZIZ, this.LLJJJJLIIL.toString(), 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new C430920Gv4(this), iLJJJ, spannableStringBuilder.length(), 18);
        }
        this.LLJLILLLLZIIL = spannableStringBuilder;
        LJJJJJ(spannableStringBuilder);
        return spannableStringBuilder;
    }

    private final ITakoService getTakoService() {
        return (ITakoService) this.LLL.getValue();
    }

    private final CharSequence getTruncateSpan() {
        String truncateText = getTruncateText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(truncateText);
        int iLJJJ = a0.LJJJ(truncateText, "...", 0, false, 6);
        int i = iLJJJ + 3;
        if (iLJJJ >= 0 && i < spannableStringBuilder.length()) {
            C786410Ut5.q2(spannableStringBuilder, new C430920Gv4(this), i, spannableStringBuilder.length(), 17);
        }
        if (this.LLJJL != null) {
            boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
            if (zLIZLLL != (Build.VERSION.SDK_INT >= 26 ? BidiFormatter.getInstance().isRtl(this.LLJL) : zLIZLLL)) {
                spannableStringBuilder.insert(i, (CharSequence) "\u200b");
                C786410Ut5.q2(spannableStringBuilder, this.LLJJL, i, i + 1, 17);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) "\u200b");
            C786410Ut5.q2(spannableStringBuilder, this.LLJJL, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    private final String getTruncateText() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("...");
        sbLIZ.append(' ');
        sbLIZ.append((Object) this.LLJJJJLIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InterfaceC430670Guf getCustomTruncationHandler() {
        return this.LLLFF;
    }

    public final Integer getSeeMoreColor() {
        return this.LLLFFI;
    }

    public final void LJJJJJ(SpannableStringBuilder spannableStringBuilder) {
        boolean zIsRtl;
        if (C0BQC.LIZ()) {
            if (this.LLJJL != null) {
                boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
                if (Build.VERSION.SDK_INT >= 26) {
                    zIsRtl = BidiFormatter.getInstance().isRtl(this.LLJL);
                } else {
                    zIsRtl = zLIZLLL;
                }
                if (zLIZLLL == zIsRtl) {
                    spannableStringBuilder.append("\u200b");
                    C786410Ut5.q2(spannableStringBuilder, this.LLJJL, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    return;
                } else {
                    spannableStringBuilder.insert(0, "\u200b");
                    C786410Ut5.q2(spannableStringBuilder, this.LLJJL, 0, 1, 33);
                    return;
                }
            }
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("\u200b");
        InterfaceC430910Gv3 interfaceC430910Gv3 = this.LLJJL;
        if (interfaceC430910Gv3 == null) {
            return;
        }
        C786410Ut5.q2(spannableStringBuilder2, interfaceC430910Gv3, 0, spannableStringBuilder2.length(), 17);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
    }

    public final void setCustomTruncationHandler(InterfaceC430670Guf interfaceC430670Guf) {
        this.LLLFF = interfaceC430670Guf;
    }

    public void setEndAppendText(String str) {
        this.LLJJJJLIIL = str;
    }

    public void setEndSpanClick(InterfaceC430960Gv8 interfaceC430960Gv8) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC430960Gv8;
    }

    public void setExpandShowMaxLine(int i) {
        this.LLJJJJJIL = i;
    }

    public void setFoldShowMaxLines(int i) {
        this.LLJJJJ = i;
    }

    public final void setSeeMoreColor(Integer num) {
        this.LLLFFI = num;
    }

    public C430890Gv1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJLIIL = "";
        this.LLJZ = true;
        this.LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(412));
        this.LLJJJJ = 2;
        this.LLJJJJJIL = 6;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FoldTextView);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.FoldTextView_showMaxLine, 2);
            typedArrayObtainStyledAttributes.recycle();
        }
        setMovementMethod(new C430990GvB());
        setClickable(false);
        setLongClickable(false);
    }

    public final StaticLayout LJJJJL(int i, CharSequence charSequence) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0 && 0 == 0) {
            numValueOf = Integer.valueOf(getWidth());
            if (numValueOf.intValue() <= 0) {
                return null;
            }
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), numValueOf.intValue()).setIncludePad(getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }

    public final void LJJJLIIL(Layout layout, TextView.BufferType bufferType) {
        CharSequence charSequence = this.LLJL;
        if (charSequence != null) {
            if (C0BQC.LIZ()) {
                StaticLayout staticLayoutLJJJJL = LJJJJL(layout.getWidth(), new SpannableStringBuilder(this.LLJL).append(getEndAppendTextNoOmit()));
                if (staticLayoutLJJJJL != null) {
                    layout = staticLayoutLJJJJL;
                }
            }
            int lineCount = layout.getLineCount();
            int i = this.LLJJJJ;
            if (lineCount > i) {
                this.LLJZIJLIL = true;
                this.LLJLLL = false;
                CharSequence charSequenceLJJJLZIJ = LJJJLZIJ(i, layout, charSequence);
                this.LLJLL = charSequenceLJJJLZIJ;
                super.setText(charSequenceLJJJLZIJ, bufferType);
            } else {
                this.LLJZIJLIL = false;
                this.LLJLL = new SpannableStringBuilder(this.LLJL).append(getEndAppendTextNoOmit());
                this.LLJLLIL = new SpannableStringBuilder(this.LLJL).append(getEndAppendTextNoOmit());
                super.setText(this.LLJLL, bufferType);
            }
            int lineCount2 = layout.getLineCount();
            int i2 = this.LLJJJJJIL;
            if (lineCount2 > i2) {
                this.LLJLLIL = LJJJLZIJ(i2, layout, charSequence);
            } else if (layout.getLineCount() > this.LLJJJJ) {
                this.LLJLLIL = new SpannableStringBuilder(this.LLJL).append(getEndAppendTextNoOmitWithClick());
            }
        }
        this.LLLF = true;
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i;
        if (!TextUtils.isEmpty(charSequence) && (i = this.LLJJJJ) != 0 && this.LLJZ) {
            if (this.LLJLL != null) {
                this.LLJLLL = false;
                this.LLJL = charSequence;
                setMaxLines(i);
                super.setText(this.LLJLL, bufferType);
                return;
            }
            setMaxLines(i);
            if (this.LLJJJJLIIL.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) charSequence);
                sbLIZ.append(' ');
                sbLIZ.append((Object) this.LLJJJJLIIL);
                super.setText(C2188811AlT.LIZIZ(sbLIZ), bufferType);
            } else {
                super.setText(charSequence, bufferType);
            }
            this.LLJL = charSequence;
            C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, charSequence, bufferType, 7));
            return;
        }
        this.LLJLLL = true;
        this.LLJL = charSequence;
        setMaxLines(this.LLJJJJJIL);
        super.setText(this.LLJLLIL, bufferType);
    }

    public final CharSequence LJJJLZIJ(int i, Layout layout, CharSequence charSequence) {
        boolean z;
        CharSequence charSequenceLIZIZ;
        float fMeasureText;
        boolean zLIZLLL;
        Character chLJLLJ;
        SpannableStringBuilder spannableStringBuilder;
        InterfaceC430910Gv3[] interfaceC430910Gv3Arr;
        CharSequence truncateSpan = getTruncateSpan();
        if (((String) this.LLJJJJLIIL).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(' ');
            sbLIZ.append((Object) this.LLJJJJLIIL);
            charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            charSequenceLIZIZ = charSequence;
        }
        int i2 = i - 1;
        CharSequence charSequenceSubSequence = charSequenceLIZIZ.subSequence(layout.getLineStart(i2), layout.getLineEnd(i2));
        float fMeasureText2 = getPaint().measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length()) / charSequenceSubSequence.length();
        if (C0BQC.LIZ()) {
            try {
                StaticLayout staticLayoutLJJJJL = LJJJJL(layout.getWidth(), truncateSpan);
                if (staticLayoutLJJJJL != null) {
                    fMeasureText = staticLayoutLJJJJL.getLineWidth(0);
                } else {
                    fMeasureText = getPaint().measureText(truncateSpan, 0, truncateSpan.length());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                fMeasureText = getPaint().measureText(truncateSpan, 0, truncateSpan.length());
            }
        } else {
            fMeasureText = getPaint().measureText(truncateSpan, 0, truncateSpan.length());
        }
        if (!C0BQC.LIZ()) {
            if (truncateSpan instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) truncateSpan;
            } else {
                spannableStringBuilder = null;
            }
            if (spannableStringBuilder != null && (interfaceC430910Gv3Arr = (InterfaceC430910Gv3[]) spannableStringBuilder.getSpans(0, ((SpannableStringBuilder) truncateSpan).length(), InterfaceC430910Gv3.class)) != null) {
                for (InterfaceC430910Gv3 interfaceC430910Gv3 : interfaceC430910Gv3Arr) {
                    fMeasureText += interfaceC430910Gv3.LIZIZ();
                }
            }
        }
        float width = (layout.getWidth() - fMeasureText) - fMeasureText2;
        if (Build.VERSION.SDK_INT >= 26) {
            zLIZLLL = BidiFormatter.getInstance().isRtl(getText());
        } else {
            Context context = getContext();
            if (context != null) {
                zLIZLLL = C426750GoL.LIZLLL(context);
            } else {
                zLIZLLL = false;
            }
        }
        if (zLIZLLL) {
            width = layout.getWidth() - width;
        }
        int iU3 = C786410Ut5.U3(layout, i2, width) - 1;
        if (iU3 >= charSequence.length() || ((chLJLLJ = C13LN.LJLLJ(iU3, charSequence)) != null && chLJLLJ.charValue() == '\n')) {
            iU3--;
        }
        InterfaceC430670Guf interfaceC430670Guf = this.LLLFF;
        if (interfaceC430670Guf != null) {
            interfaceC430670Guf.LIZ(iU3, charSequence, truncateSpan);
        }
        int i3 = iU3 + 1;
        if (i3 < charSequence.length()) {
            charSequence = charSequence.subSequence(0, i3);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        spannableStringBuilder2.append(truncateSpan);
        return spannableStringBuilder2;
    }

    public final void LJJJJLL(TuxIconDrawable tuxIconDrawable, int i, int i2, Boolean bool) {
        boolean zLIZLLL;
        ITakoService takoService = getTakoService();
        if (bool != null) {
            zLIZLLL = bool.booleanValue();
        } else {
            Context context = getContext();
            if (context != null) {
                zLIZLLL = C426750GoL.LIZLLL(context);
            } else {
                zLIZLLL = false;
            }
        }
        this.LLJJL = takoService.LJJLIL(tuxIconDrawable, i, i2, zLIZLLL, false);
    }
}
