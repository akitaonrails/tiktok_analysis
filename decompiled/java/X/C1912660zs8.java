package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notice.api.ab.MultiAccountPopupPanelExp;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS114S0110000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("open_multi_account_push_guide")
public final class C1912660zs8 extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final int LLILZIL = 100;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    public final void LJIIL(String str) {
        C20684815ws.LJIILLIIL("multi_account_push_popup_click", C2097608Jq.LJIIJ(new Pair("enter_from", this.LLILZLL), new Pair("trigger", this.LLIZ), new Pair("popup_type", this.LLIZLLLIL), new Pair("action_type", str)));
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        boolean z;
        String string;
        int i;
        String string2;
        String string3;
        MultiAccountPopupPanelExp.Meta meta = MultiAccountPopupPanelExp.LIZIZ;
        if (meta != null && meta.defaultSettingsOn) {
            z = true;
        } else {
            z = false;
        }
        C770750ULh c770750ULh = new C770750ULh();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        c419910GdJ.LIZ = R.raw.icon_bell;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c770750ULh.LIZIZ = c419910GdJ;
        c770750ULh.LIZLLL = 3;
        if (z) {
            string = this.LL.getString(2131837578);
        } else {
            string = this.LL.getString(2131837579);
        }
        c770750ULh.LJ = string;
        c770750ULh.LJIILLIIL = true;
        C345890DhD[] c345890DhDArr = new C345890DhD[2];
        C19EG c19eg = this.LL;
        if (z) {
            i = 2131837571;
        } else {
            i = 2131837572;
        }
        Object[] objArr = new Object[1];
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        c345890DhDArr[0] = new C345890DhD(c19eg.getString(i, objArr), true);
        c345890DhDArr[1] = new C345890DhD(this.LL.getString(2131837573), true);
        c770750ULh.LJFF(c345890DhDArr);
        if (z) {
            string2 = this.LL.getString(2131837574);
        } else {
            string2 = this.LL.getString(2131837576);
        }
        c770750ULh.LJI(string2, new AwS114S0110000_28(z, this, 4));
        if (z) {
            string3 = this.LL.getString(2131837575);
        } else {
            string3 = this.LL.getString(2131837577);
        }
        c770750ULh.LJII(string3, new AwS114S0110000_28(z, this, 5));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL = new DialogInterfaceOnDismissListenerC19333110kL(c20656615sK, this, 4);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC19333110kL;
        tuxSheet.show(this.LL.getSupportFragmentManager(), "multi-account-notification-panel");
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        C20684815ws.LJIILLIIL("multi_account_push_popup_show", C2097608Jq.LJIIJ(new Pair("enter_from", this.LLILZLL), new Pair("trigger", this.LLIZ), new Pair("popup_type", this.LLIZLLLIL)));
    }

    public C1912660zs8(C19EG c19eg, EnumC1905360zgM enumC1905360zgM, String str, String str2, AwS572S0100000_28 awS572S0100000_28) {
        String str3;
        String str4;
        String str5;
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = awS572S0100000_28;
        int[] iArr = C1905380zgO.LIZ;
        if (iArr[enumC1905360zgM.ordinal()] == 1) {
            str3 = "personal_homepage";
        } else {
            str3 = "notification_page";
        }
        this.LLILZLL = str3;
        int i = iArr[enumC1905360zgM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str4 = "consume_and_switch_within_1_day";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str4 = "consume_after_switch_from_push";
            }
        } else {
            str4 = "close_switch_account";
        }
        this.LLIZ = str4;
        MultiAccountPopupPanelExp.Meta meta = MultiAccountPopupPanelExp.LIZIZ;
        if (meta != null && meta.defaultSettingsOn) {
            str5 = "default_on";
        } else {
            str5 = "default_off";
        }
        this.LLIZLLLIL = str5;
    }
}
