package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510711Uz extends AbstractC960470b6L<C11V2> {
    public final Function1<Integer, Unit> LL;
    public final C16F5 LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C19510711Uz(View view, Function1<? super Integer, Unit> function1) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.qpu);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int iIntValue;
        final C11V2 c11v2 = (C11V2) obj;
        int i2 = c11v2.LIZ;
        String strLJIJI = C497740JfY.LJIJI(2131855164);
        String strLJIJI2 = C497740JfY.LJIJI(2131855165);
        if (!PlaybookUtilKt.LJIJJLI(true, Integer.valueOf(i2))) {
            strLJIJI2 = C497740JfY.LJIJI(2131855166);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append(' ');
        sbLIZ.append(strLJIJI2);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        int length = strLJIJI.length() + 1;
        int length2 = strLJIJI2.length() + length;
        C786410Ut5.p2(spannableString, new TextAppearanceSpan(this.itemView.getContext(), R.style.a93), length, length2, 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), length, length2, 33);
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.11V0
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                int i3 = 1;
                if (PlaybookUtilKt.LJIJJLI(true, Integer.valueOf(c11v2.LIZ))) {
                    i3 = 2;
                }
                this.LL.invoke(Integer.valueOf(i3));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, length, length2, 33);
        this.LLILLJJLI.setText(spannableString);
        this.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
        this.LLILLJJLI.setHighlightColor(0);
    }
}
