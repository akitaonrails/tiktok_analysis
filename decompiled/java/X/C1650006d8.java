package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: renamed from: X.06d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1650006d8 extends CardView implements C06OA {
    public final /* synthetic */ C06ME LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LLIZLLLIL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LLIZLLLIL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LLIZLLLIL.l(c06mf);
    }

    private final View getNotice() {
        return (View) this.LLJI.getValue();
    }

    private final TuxTextView getText() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final void LJIIIZ(int i) {
        String quantityString;
        Resources resources;
        TuxTextView text = getText();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            quantityString = resources.getQuantityString(2131755235, i, Integer.valueOf(i));
        } else {
            quantityString = null;
        }
        text.setText(quantityString);
    }

    public C1650006d8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = new C06ME();
        C786410Ut5.LJLLJ(context, R.layout.cj1, this);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1091));
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1090));
    }

    public final void LJIIIIZZ(C1649906d7 c1649906d7, AwS403S0200000_2 awS403S0200000_2) {
        String quantityString;
        Resources resources;
        IMGroupChatDetailAnalytics.LIZ.LJFF("show_audit_request", new Pair[]{new Pair("enter_from", "chat")}, C0I0B.LJFF.LIZIZ());
        TuxTextView text = getText();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            int i = c1649906d7.LIZ;
            quantityString = resources.getQuantityString(2131755235, i, Integer.valueOf(i));
        } else {
            quantityString = null;
        }
        text.setText(quantityString);
        C786410Ut5.I7(new AbS686S0100000_2(awS403S0200000_2, 17), getNotice());
    }
}
