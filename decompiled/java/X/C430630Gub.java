package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0Gub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430630Gub extends TuxTextView {
    public boolean LLJJJJ;
    public CharSequence LLJJJJJIL;
    public String LLJJJJLIIL;

    private final CharSequence getTrimmedText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        if (layout.getLineCount() <= 3) {
            return this.LLJJJJJIL;
        }
        this.LLJJJJLIIL = getContext().getString(2131847411);
        CharSequence charSequenceSubSequence = this.LLJJJJJIL.subSequence(0, layout.getLineVisibleEnd(2) - 10);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) charSequenceSubSequence);
        sbLIZ.append("... ");
        sbLIZ.append(this.LLJJJJLIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) charSequenceSubSequence);
        sbLIZ2.append("... ");
        sbLIZ2.append(this.LLJJJJLIIL);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), charSequenceSubSequence.length() + 3, strLIZIZ.length(), 34);
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a1h, getContext());
        C786410Ut5.q2(spannableStringBuilder, numLIZ != null ? new ForegroundColorSpan(numLIZ.intValue()) : null, charSequenceSubSequence.length() + 3, strLIZIZ.length(), 34);
        return spannableStringBuilder;
    }

    public C430630Gub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = "More";
        setEllipsize(TextUtils.TruncateAt.END);
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 55);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS141S0100000_6) : aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && Intrinsics.LJFF(this.LLJJJJJIL, "")) {
            this.LLJJJJJIL = charSequence;
        }
        super.setText(charSequence, bufferType);
        if (!this.LLJJJJ) {
            super.setText(getTrimmedText(), bufferType);
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
