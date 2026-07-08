package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0Df2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20647615qs("batch_replace_snack_bar_task")
public final class C344540Df2 extends AbstractC20660815t0 {
    public final ViewGroup LL;
    public C20515215Pi LLILLJJLI;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 108;
    }

    public static void LJIIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("type", "profile_page_bottom_bar_replace");
        C20684815ws.LJIILLIIL("snackbar_click", c2344009Gk.LIZ);
    }

    public C344540Df2(ViewGroup viewGroup, InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C20515215Pi c20515215Pi = new C1257230ioz(this.LL, true).LIZ;
        c20515215Pi.LIZ.LIZJ = false;
        Context context = c688120Qyw.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getString(2131857889));
        sbLIZ.append((char) 160);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String string = context.getString(2131857902);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        SpannableString spannableString = new SpannableString(string);
        C786410Ut5.p2(spannableString, new C346200Dhi(context, this, 1), 0, spannableString.length(), 17);
        c20515215Pi.LIZ.LJFF = spannableStringBuilder.append((CharSequence) spannableString);
        c20515215Pi.LJI(new AwS583S0100000_4(c688120Qyw, 364));
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJIILLIIL = true;
        c1057450dcl.LJIIJ = 0;
        c20515215Pi.LIZ.LJIILJJIL = new AwS370S0200000_4(this, c20656615sK, 113);
        this.LLILLJJLI = c20515215Pi;
        c20515215Pi.LJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("type", "profile_page_bottom_bar_replace");
        C20684815ws.LJIILLIIL("snackbar_show", c2344009Gk.LIZ);
    }
}
