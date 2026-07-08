package X;

import Y.ACListenerS136S0200000_34;
import kotlin.jvm.internal.AwS400S0200000_34;

/* JADX INFO: renamed from: X.1Cih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20647615qs("education_outreach_profile_banner_popup_task")
public final class C2238051Cih extends AbstractC20660815t0 {
    public final C20515215Pi LL;
    public final C2238081Cik LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 25;
    }

    public static void LJIIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("click_position", str);
        c2344009Gk.LJIIIIZZ("activity_id", C2238061Cii.LIZ().activityId);
        c2344009Gk.LJIIIIZZ("banner_text", C2238061Cii.LIZ().bannerText);
        c2344009Gk.LJIIIIZZ("user_id_cohort", C2238061Cii.LIZ().userIdCohort);
        C20684815ws.LJIILLIIL("vertical_edu_banner_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LIZ.LJI = C2238061Cii.LIZ().buttonText;
        c20515215Pi.LIZ.LJ = C2238061Cii.LIZ().titleText;
        String str = C2238061Cii.LIZ().subTitleText;
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = str;
        c1057450dcl.LJIILIIL = new ACListenerS136S0200000_34(this, c688120Qyw, 3);
        c20515215Pi.LIZ.LJIILJJIL = new AwS400S0200000_34(this, c20656615sK, 10);
        c20515215Pi.LIZLLL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("activity_id", C2238061Cii.LIZ().activityId);
        c2344009Gk.LJIIIIZZ("banner_text", C2238061Cii.LIZ().bannerText);
        c2344009Gk.LJIIIIZZ("user_id_cohort", C2238061Cii.LIZ().userIdCohort);
        C20684815ws.LJIILLIIL("vertical_edu_banner_show", c2344009Gk.LIZ);
        this.LLILLJJLI.LIZ.storeLong("last_show_time", System.currentTimeMillis());
    }

    public C2238051Cih(C0TGX c0tgx, C20515215Pi c20515215Pi, C2238081Cik c2238081Cik) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = c2238081Cik;
    }
}
