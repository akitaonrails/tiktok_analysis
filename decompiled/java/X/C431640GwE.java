package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431640GwE extends TuxTextView {
    public int LLJJJJ;
    public CharSequence LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public CharSequence LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public EnumC431710GwL LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;

    private final ITakoService getTakoService() {
        return (ITakoService) this.LLJLIL.getValue();
    }

    private final String getTruncateText() {
        int i = C431660GwG.LIZ[this.LLJLL.ordinal()];
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("...");
            sbLIZ.append(' ');
            sbLIZ.append(getContext().getString(2131837627));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i == 2) {
            if (C0BQG.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("...");
                sbLIZ2.append(' ');
                sbLIZ2.append(getContext().getString(2131837627));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("...");
            sbLIZ3.append(' ');
            sbLIZ3.append(getContext().getString(2131830117));
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (i != 3) {
            if (i != 4) {
                throw new C1954807lC();
            }
            return "...";
        }
        String str = this.LLJLLIL;
        if (str == null) {
            return "";
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("...");
        sbLIZ4.append(' ');
        sbLIZ4.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    public final CharSequence getDisplayText() {
        CharSequence charSequence = this.LLJJL;
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence charSequence2 = this.LLJJJJLIIL;
        return charSequence2 == null ? "" : charSequence2;
    }

    private final CharSequence getTruncateSpan() {
        this.LLJJJJJIL = getTruncateText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLJJJJJIL);
        CharSequence charSequence = this.LLJJJJJIL;
        if (charSequence != null) {
            int iLJJJ = a0.LJJJ(charSequence, "...", 0, false, 6);
            int i = iLJJJ + 3;
            if (iLJJJ >= 0 && i < spannableStringBuilder.length()) {
                if ((this.LLJLL == EnumC431710GwL.VIEW_ALL && !C0BQG.LIZ()) || (this.LLJLL == EnumC431710GwL.CUSTOM && this.LLJLLL)) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                    tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
                    boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
                    if (zLIZLLL == (Build.VERSION.SDK_INT >= 26 ? BidiFormatter.getInstance().isRtl(this.LLJJJJLIIL) : zLIZLLL)) {
                        spannableStringBuilder.append((CharSequence) "\u200b");
                        ITakoService takoService = getTakoService();
                        Context context = getContext();
                        C786410Ut5.q2(spannableStringBuilder, takoService.LJJLIL(tuxIconDrawableLIZ, 0, 0, context != null ? C426750GoL.LIZLLL(context) : false, false), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    } else {
                        spannableStringBuilder.insert(i, (CharSequence) "\u200b");
                        ITakoService takoService2 = getTakoService();
                        Context context2 = getContext();
                        C786410Ut5.q2(spannableStringBuilder, takoService2.LJJLIL(tuxIconDrawableLIZ, 0, 0, context2 != null ? C426750GoL.LIZLLL(context2) : false, false), i, i + 1, 17);
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

    public final void setCustomShowTruncateIcon(boolean z) {
        this.LLJLLL = z;
    }

    public final void setCustomTruncateText(String str) {
        this.LLJLLIL = str;
    }

    public final void setShowMaxLines(int i) {
        this.LLJJJJ = i;
    }

    public final void setTruncateType(EnumC431710GwL enumC431710GwL) {
        this.LLJLL = enumC431710GwL;
    }

    public C431640GwE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJJIL = "";
        this.LLJL = true;
        this.LLJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(411));
        this.LLJLL = EnumC431710GwL.SEE_MORE;
        this.LLJJJJ = 7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FoldTextView);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.FoldTextView_showMaxLine, 7);
            typedArrayObtainStyledAttributes.getColor(R$styleable.FoldTextView_tipColor, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        setMovementMethod(getTakoService().LJJJZ());
        setClickable(false);
        setLongClickable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(android.text.Layout r12, android.widget.TextView.BufferType r13) {
        /*
            r11 = this;
            java.lang.CharSequence r5 = r11.LLJJJJLIIL
            if (r5 == 0) goto Lb3
            int r1 = r12.getLineCount()
            int r0 = r11.LLJJJJ
            r4 = 0
            if (r1 <= r0) goto L6c
            r6 = 1
            r11.LLJLILLLLZIIL = r6
            r11.LLJJLIIIJLLLLLLLZ = r4
            java.lang.CharSequence r3 = r11.getTruncateSpan()
            int r7 = r11.LLJJJJ
            int r7 = r7 - r6
            int r1 = r12.getLineStart(r7)
            int r0 = r12.getLineEnd(r7)
            java.lang.CharSequence r2 = r5.subSequence(r1, r0)
            android.text.TextPaint r1 = r11.getPaint()
            int r0 = r2.length()
            float r10 = r1.measureText(r2, r4, r0)
            int r0 = r2.length()
            float r0 = (float) r0
            float r10 = r10 / r0
            android.text.TextPaint r1 = r11.getPaint()
            int r0 = r3.length()
            float r9 = r1.measureText(r3, r4, r0)
            boolean r0 = r3 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L6f
            r2 = r3
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            if (r2 == 0) goto L6f
            r0 = r3
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            int r1 = r0.length()
            java.lang.Class<X.0Gv3> r0 = X.InterfaceC430910Gv3.class
            java.lang.Object[] r8 = r2.getSpans(r4, r1, r0)
            X.0Gv3[] r8 = (X.InterfaceC430910Gv3[]) r8
            if (r8 == 0) goto L6f
            int r2 = r8.length
            r1 = 0
        L5f:
            if (r1 >= r2) goto L6f
            r0 = r8[r1]
            int r0 = r0.LIZIZ()
            float r0 = (float) r0
            float r9 = r9 + r0
            int r1 = r1 + 1
            goto L5f
        L6c:
            r11.LLJLILLLLZIIL = r4
            return
        L6f:
            int r0 = r12.getWidth()
            float r2 = (float) r0
            float r2 = r2 - r9
            float r2 = r2 - r10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto Lb4
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance()
            java.lang.CharSequence r0 = r11.getText()
            boolean r0 = r1.isRtl(r0)
        L88:
            if (r0 == 0) goto L91
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r2 = r0 - r2
        L91:
            int r2 = X.C786410Ut5.U3(r12, r7, r2)
            int r2 = r2 - r6
            char r1 = r5.charAt(r2)
            r0 = 10
            if (r1 != r0) goto La0
            int r2 = r2 + (-1)
        La0:
            int r0 = r2 + 1
            java.lang.CharSequence r1 = r5.subSequence(r4, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r0.append(r3)
            r11.LLJJL = r0
            super.setText(r0, r13)
        Lb3:
            return
        Lb4:
            android.content.Context r0 = r11.getContext()
            if (r0 == 0) goto L91
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C431640GwE.LJJJJJ(android.text.Layout, android.widget.TextView$BufferType):void");
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!TextUtils.isEmpty(charSequence) && this.LLJJJJ != 0 && this.LLJL) {
            CharSequence charSequence2 = this.LLJJL;
            if (charSequence2 != null) {
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJJJJLIIL = charSequence;
                super.setText(charSequence2, bufferType);
                return;
            }
            this.LLJJJJLIIL = charSequence;
            Layout layout = getLayout();
            if (layout == null || !layout.getText().equals(this.LLJJJJLIIL)) {
                super.setText(this.LLJJJJLIIL, bufferType);
                layout = getLayout();
                if (layout == null) {
                    C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, bufferType, 6));
                    return;
                }
            }
            LJJJJJ(layout, bufferType);
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJJJJLIIL = charSequence;
        super.setText(charSequence, bufferType);
    }
}
