package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS99S0210000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("bind_lemon8_guide")
public final class C1242870iRp extends AbstractC20660815t0 {
    public final ViewGroup LL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C1242870iRp(ViewGroup viewGroup, C0TGX c0tgx) {
        super(c0tgx);
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ == null) {
            return;
        }
        C20515215Pi c20515215Pi = new C1257230ioz(this.LL, true).LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_lemon8_radius;
        c419910GdJ.LIZIZ = (int) C12ES.LIZJ(32.0f, c19egLIZIZ);
        c419910GdJ.LIZJ = (int) C12ES.LIZJ(32.0f, c19egLIZIZ);
        c20515215Pi.LJFF(c419910GdJ);
        String string = c19egLIZIZ.getString(2131822636);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19egLIZIZ.getString(2131822637));
        sbLIZ.append(' ');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new C1265750j2j(this, c19egLIZIZ, 0), 0, strLIZIZ.length(), 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, c19egLIZIZ);
        if (numLIZJ != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), a0.LJJJ(strLIZIZ, string, 0, false, 6), strLIZIZ.length(), 33);
        }
        C786410Ut5.p2(spannableString, new C444920HcY(52, false), a0.LJJJ(strLIZIZ, string, 0, false, 6), strLIZIZ.length(), 33);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = spannableString;
        c1057450dcl.LJIIJ = 0;
        c20515215Pi.LIZ.LJIILJJIL = new AwS598S0100000_19(c20656615sK, 21);
        c20515215Pi.LIZLLL();
        C1254250ikB.LIZ.getClass();
        Keva kevaLIZ = C1254250ikB.LIZ();
        kevaLIZ.storeInt("key_show_count", kevaLIZ.getInt("key_show_count", 0) + 1);
        kevaLIZ.storeLong("key_last_show_time", System.currentTimeMillis());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("platform", "lemon8");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("show_social_account_bind", c2344009Gk.LIZ);
    }

    public final void LJIIL(C19EG c19eg, boolean z) {
        if (((Boolean) C1ECB.LIZJ.getValue()).booleanValue()) {
            C1254160ik2.LIZIZ.LJIIJJI(c19eg, C2097608Jq.LJIIJ(new Pair("from_scene", "tiktok_selfhomepage_banner")), null, new AwS99S0210000_19(this, c19eg, z, 0));
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("show_lemon8_intro_popup", c2344009Gk.LIZ);
        C1254160ik2.LIZIZ.LIZLLL(c19eg, "personal_homepage", z);
    }
}
