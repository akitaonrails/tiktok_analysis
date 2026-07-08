package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431320Gvi {
    public static void LIZ(TuxTextView tuxTextView, final View.OnClickListener onClickListener, int i) {
        Context context = tuxTextView.getContext();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setTuxFont(41);
        String string = context.getString(i);
        final int i2 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131850159, string));
        final int iLIZ = C960203pA.LIZ(R.attr.a04, context);
        AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iLIZ, i2, onClickListener) { // from class: X.0Gvj
            public final /* synthetic */ View.OnClickListener LL;
            public final /* synthetic */ int LLILLJJLI;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                this.LL.onClick(view);
            }

            @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                C444890HcV c444890HcV = new C444890HcV();
                int i3 = this.LLILLJJLI;
                if (i3 == 0) {
                    c444890HcV.LIZ(82);
                } else {
                    c444890HcV.LIZ(i3);
                }
                textPaint.setTypeface(c444890HcV.getTypeface());
                super.updateDrawState(textPaint);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iLIZ, iLIZ);
                this.LL = onClickListener;
                this.LLILLJJLI = i2;
            }
        };
        int iLJJJ = a0.LJJJ(spannableStringBuilder.toString(), string, 0, false, 6);
        C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iLJJJ, string.length() + iLJJJ, 34);
        tuxTextView.setHighlightColor(C446980Hfs.LIZ(context, R.color.dr));
        tuxTextView.setText(spannableStringBuilder);
        tuxTextView.setMovementMethod(C431300Gvg.LIZ());
    }
}
