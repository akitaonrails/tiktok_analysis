package X;

import Y.AfS148S0200000_12;
import Y.AfS45S1100000_12;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TME, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("profile_views_guide")
public final class C0TME extends AbstractC20660815t0 {
    public final FragmentManager LL;
    public final C0P0T LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 400;
    }

    public final boolean LJIIL() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    public static void LJIILJJIL(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("enter_method", "auto_scene");
        c2344009Gk.LJIIIIZZ("pop_up_type", "one_button");
        c2344009Gk.LIZJ(i, "to_status");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("profile_visitor_pop_up_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(final C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        int i;
        int i2;
        int i3;
        int i4;
        Context context = c688120Qyw.LIZ;
        String string = context.getString(2131844971, context.getString(2131844972));
        final C0TJ6 c0tj6 = new C0TJ6(context);
        if (LJIIL()) {
            c0tj6.setSwitchDescription(C1216270hkv.LIZJ(2131837213));
        }
        C770750ULh c770750ULh = new C770750ULh();
        if (C960203pA.LIZIZ(context)) {
            i = R.drawable.d0v;
        } else {
            i = R.drawable.d0u;
        }
        c770750ULh.LIZ = C800330VaR.LIZIZ(context, i);
        c770750ULh.LIZLLL = 0;
        if (LJIIL()) {
            i2 = 2131837198;
        } else {
            i2 = 2131845504;
        }
        c770750ULh.LJ = context.getString(i2);
        C345890DhD[] c345890DhDArr = new C345890DhD[3];
        if (LJIIL()) {
            i3 = 2131837195;
        } else {
            i3 = 2131845502;
        }
        c345890DhDArr[0] = new C345890DhD(context.getString(i3), true);
        if (LJIIL()) {
            i4 = 2131837196;
        } else {
            i4 = 2131845503;
        }
        c345890DhDArr[1] = new C345890DhD(context.getString(i4), true);
        if (LJIIL()) {
            string = C1216270hkv.LIZJ(2131837197);
        }
        c345890DhDArr[2] = new C345890DhD(string, true);
        c770750ULh.LJFF(c345890DhDArr);
        c770750ULh.LJIILL = c0tj6;
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(context.getString(R.string.sg8), AFwS245S0000000_12.get$arr$(260));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0TJ1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                String str2;
                c20656615sK.LIZ();
                C757860To8.LIZ.getClass();
                C757860To8.LIZLLL = false;
                C0TME c0tme = this;
                C688120Qyw c688120Qyw2 = c688120Qyw;
                C0TJ6 c0tj62 = c0tj6;
                c0tme.getClass();
                String str3 = TuxSheet._pnsPageId;
                AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ)) {
                    C849850XVn.LIZIZ.LIZJ().LJIJI("profile_view_history_turnon_nscreen", "popup_close", false);
                    str = "close";
                } else if (abstractC343940De4LJIIJJI instanceof C343950De5) {
                    str = "save";
                    if (c0tj62.getViewerAuthSwitchFromXml().isChecked()) {
                        C849850XVn.LIZIZ.LIZJ().LJIJI("profile_view_history_turnon_nscreen", "save", true);
                    } else {
                        C849850XVn.LIZIZ.LIZJ().LJIJI("profile_view_history_turnon_nscreen", "save", false);
                    }
                } else {
                    C849850XVn.LIZIZ.LIZJ().LJIJI("profile_view_history_turnon_nscreen", "popup_close", false);
                    str = "leave_page";
                }
                if (c0tj62.getViewerAuthSwitchFromXml().isChecked()) {
                    InterfaceC742660TBg interfaceC742660TBgLIZIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZIZ();
                    if (interfaceC742660TBgLIZIZ != null) {
                        C0TJI.LIZ.LIZ(interfaceC742660TBgLIZIZ.LIZLLL(1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS45S1100000_12(c0tme, str, 6), new AfS148S0200000_12(c0tme, c688120Qyw2, 78), new InterfaceC781210Ukh() { // from class: X.0TB2
                            @Override // X.InterfaceC781210Ukh
                            public final void run() {
                                C0TJI.LIZ.dispose();
                            }
                        }));
                    }
                } else {
                    C0TME.LJIILJJIL(0, str);
                    C0TME.LJIILIIL(0, 1, 0);
                }
                if (c0tme.LJIIL()) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_popup");
                    if (c0tj62.getViewerAuthSwitchFromXml().isChecked()) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("to_status", str2);
                    c2344009Gk.LJIIIIZZ("action", "change_status");
                    C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk.LIZ);
                }
            }
        };
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LLILLJJLI = onDismissListener;
        if (this.LL != null) {
            C757860To8.LIZ.getClass();
            C757860To8.LIZLLL = true;
            InterfaceC625970Ogt interfaceC625970OgtLIZ = C2192401ArG.LIZ(C589170N8x.LIZ("social", "profile"), "profile_viewer_dialog_keva_repo_name");
            C0TMQ.LIZ.getClass();
            interfaceC625970OgtLIZ.LIZLLL("profile_viewer_dialog_has_show", true);
            C1391850mK7.LIZIZ(tuxSheet, "profile_view_history_turnon_nscreen");
            tuxSheet.show(this.LL, "ProfileViewerDialog");
            if (LJIIL()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_popup");
                C20684815ws.LJIILLIIL("load_viewers_permission", c2344009Gk.LIZ);
            }
        }
    }

    public C0TME(InterfaceC20660615sy interfaceC20660615sy, FragmentManager fragmentManager, C0P0T c0p0t) {
        super(interfaceC20660615sy);
        this.LL = fragmentManager;
        this.LLILLJJLI = c0p0t;
        this.LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(554));
    }

    public static void LJIILIIL(int i, int i2, int i3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("pop_up_type", "one_button");
        c2344009Gk.LIZJ(i, "to_status");
        c2344009Gk.LIZJ(i2, "auth_result");
        if (i2 == 1) {
            c2344009Gk.LIZJ(i3, "status_code");
        }
        C20684815ws.LJIILLIIL("profile_visitor_pop_up_auth_result", c2344009Gk.LIZ);
    }
}
