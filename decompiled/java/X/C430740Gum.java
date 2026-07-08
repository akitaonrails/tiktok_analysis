package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430740Gum extends TuxTextView {
    public int LLJJJJ;
    public final Integer LLJJJJJIL;
    public int LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public Function0<Unit> LLJL;

    private final void setContentColor(Integer num) {
        if (num != null) {
            setTextColorRes(num.intValue());
        }
    }

    private final void setContentFont(Integer num) {
        if (num != null) {
            setTuxFont(num.intValue());
        }
    }

    private final void setSuffixColor(Integer num) {
        if (num != null) {
            this.LLJJJJ = num.intValue();
        }
    }

    public C430740Gum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = R.attr.bb;
        this.LLJJJJJIL = 71;
        this.LLJJJJLIIL = 2;
    }

    public final SpannableStringBuilder LJJJJJ(String str, String str2) {
        int iIntValue;
        int length = 0;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTextColor(C960203pA.LIZ(this.LLJJJJ, tuxTextView.getContext()));
        Integer num = this.LLJJJJJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 71;
        }
        tuxTextView.setTuxFont(iIntValue);
        tuxTextView.setGravity(8388611);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), tuxTextView);
        tuxTextView.setText(str2);
        C430750Gun c430750Gun = new C430750Gun(tuxTextView);
        C0ID7 c0id7 = new C0ID7(this, 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(C2188811AlT.LIZIZ(sbLIZ));
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str).length();
        if (str2 != null) {
            length = str2.length();
        }
        int i = length3 + length;
        C786410Ut5.q2(spannableStringBuilderValueOf, c430750Gun, length2, i, 33);
        C786410Ut5.q2(spannableStringBuilderValueOf, c0id7, length2, i, 33);
        return spannableStringBuilderValueOf;
    }

    public static void LJJJJL(C430740Gum c430740Gum, String str, String str2, Function0 function0) {
        Integer numValueOf = Integer.valueOf(R.attr.a1k);
        Integer numValueOf2 = Integer.valueOf(R.attr.bb);
        c430740Gum.getClass();
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            C03DZ.LIZ(c430740Gum);
            return;
        }
        c430740Gum.LLJJL = str;
        c430740Gum.LLJJLIIIJLLLLLLLZ = str2;
        c430740Gum.LLJJJJLIIL = 2;
        c430740Gum.LLJL = function0;
        c430740Gum.setContentColor(numValueOf);
        c430740Gum.setContentFont(71);
        c430740Gum.setSuffixColor(numValueOf2);
        if (str2 != null && str2.length() != 0) {
            c430740Gum.setMovementMethod(LinkMovementMethod.getInstance());
            c430740Gum.setText(c430740Gum.LJJJJJ(c430740Gum.LLJJL, c430740Gum.LLJJLIIIJLLLLLLLZ));
        } else {
            c430740Gum.setText(str);
            c430740Gum.setMaxLines(2);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLineCount() <= this.LLJJJJLIIL) {
            C12ES.LJIILL(0, this);
            return;
        }
        String str = this.LLJJL;
        if (str != null && str.length() > 0) {
            this.LLJJL = str.substring(0, str.length() - 1);
        }
        setMovementMethod(LinkMovementMethod.getInstance());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJL);
        sbLIZ.append("...");
        setText(LJJJJJ(C2188811AlT.LIZIZ(sbLIZ), this.LLJJLIIIJLLLLLLLZ));
        HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 45));
    }
}
