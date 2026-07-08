package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20380714ov extends AbstractC960470b6L<C00UQ> {
    public final InterfaceC20380814ow LL;
    public final View LLILLJJLI;

    public final void L5() {
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS610S0100000_31(this, 495));
        C500260Jjc.LJLIIIL(500L, this.LLILLJJLI, new AwS610S0100000_31(this, 496));
    }

    public C20380714ov(View view, InterfaceC20380814ow interfaceC20380814ow) {
        super(view);
        this.LL = interfaceC20380814ow;
        this.LLILLJJLI = view.findViewById(R.id.qop);
        TextView textView = (TextView) view.findViewById(R.id.qoq);
        String strLJIJI = C497740JfY.LJIJI(2131855151);
        String strLJIJI2 = C497740JfY.LJIJI(2131855150);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strLJIJI);
        int length = spannableStringBuilder.length();
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strLJIJI2);
        int length3 = spannableStringBuilder.length();
        C786410Ut5.q2(spannableStringBuilder, new TextAppearanceSpan(textView.getContext(), R.style.a9d), 0, length, 17);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezt, textView.getContext())), 0, length, 17);
        C786410Ut5.q2(spannableStringBuilder, new TextAppearanceSpan(textView.getContext(), R.style.a9f), length2, length3, 17);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, textView.getContext())), length2, length3, 17);
        textView.setText(spannableStringBuilder);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5();
    }
}
