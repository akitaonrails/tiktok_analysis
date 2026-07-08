package X;

import Y.ACListenerS141S0100000_6;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0iXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("long_to_short_outreach_profile_banner_popup_task")
public final class C1246240iXG extends AbstractC20660815t0 {
    public final C20515215Pi LL;
    public final C1246250iXH LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 16;
    }

    public final void LJIILIIL() {
        LJIIL("click", "banner");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(Uri.encode("https://www.tiktok.com/tiktokstudio/notifications/try-smart-split"));
        sbLIZ.append("?from=profile_banner&use_spark=1&hide_nav_bar=1&container_bg_color=000000&loading_bg_color=000000&&status_bar_color=000000");
        SmartRouter.buildRoute(C1948707kD.LIZ().getApplicationContext(), C2188811AlT.LIZIZ(sbLIZ)).open();
        this.LL.LIZIZ();
    }

    public static void LJIIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (C1533950q1J.LJ(str2)) {
            c2344009Gk.LJFF("button_name", str2);
        }
        C20684815ws.LJIILLIIL("smart_split_profile_banner_show_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        String string;
        int iLIZ = C0BDW.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ != 3) {
                    string = "";
                } else {
                    string = c688120Qyw.LIZ.getResources().getString(2131822148);
                }
            } else {
                string = c688120Qyw.LIZ.getResources().getString(2131822149);
            }
        } else {
            string = c688120Qyw.LIZ.getResources().getString(2131822150);
        }
        String string2 = c688120Qyw.LIZ.getResources().getString(2131822147);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((char) 160);
        SpannableString spannableString = new SpannableString(string2);
        C786410Ut5.p2(spannableString, new C0ID5(c688120Qyw, this, 0), 0, spannableString.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) spannableString);
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LJI(new AwS585S0100000_6(c688120Qyw, 23));
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LIZJ = false;
        c1057450dcl.LJIILLIIL = true;
        c1057450dcl.LJFF = spannableStringBuilderAppend2;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LJIILIIL = new ACListenerS141S0100000_6(this, 11);
        c20515215Pi.LIZ.LJIILJJIL = new AwS385S0200000_19(this, c20656615sK, 11);
        c20515215Pi.LIZLLL();
        LJIIL("show", "");
        C1246250iXH c1246250iXH = this.LLILLJJLI;
        c1246250iXH.LIZ.storeLong("last_show_time", System.currentTimeMillis());
        Keva keva = c1246250iXH.LIZ;
        keva.storeInt("show_count", keva.getInt("show_count", 0) + 1);
    }

    public C1246240iXG(C0TGX c0tgx, C20515215Pi c20515215Pi, C1246250iXH c1246250iXH) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = c1246250iXH;
    }
}
