package X;

import Y.ACListenerS136S0200000_34;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.service.IPaidContentBannerService;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.1Cif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20647615qs("paid_content_banner_popup_task")
public final class C2238031Cif extends AbstractC20660815t0 {
    public final String LL;
    public final String LLILLJJLI;
    public final PaidContentBannerCampaign LLILLL;
    public final C11NJ LLILZ;
    public final FrameLayout LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        if (c688120Qyw.LIZIZ() != null) {
            C20515215Pi c20515215Pi = new C1257230ioz(this.LLILZIL, false).LIZ;
            PaidContentBannerCampaign paidContentBannerCampaign = this.LLILLL;
            String str = paidContentBannerCampaign.paidContentBannerTitleText;
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJ = str;
            c1057450dcl.LJFF = paidContentBannerCampaign.paidContentBannerMessageText;
            c1057450dcl.LJI = paidContentBannerCampaign.paidContentBannerLinkText;
            if (paidContentBannerCampaign.paidContentBannerIconUrl != null) {
                c20515215Pi.LJI(new AwS606S0100000_27(this, 362));
            }
            c20515215Pi.LIZ.LIZJ = true;
            AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(c20656615sK, this, 20);
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJIILJJIL = awS400S0200000_34;
            c1057450dcl2.LJIILIIL = new ACListenerS136S0200000_34(this, c20515215Pi, 5);
            c20515215Pi.LIZLLL();
            String str2 = this.LLILLL.paidContentBannerCampaignId;
            C1957707lf.LIZ.getClass();
            String strLIZ = C1957707lf.LIZ(str2);
            int iLIZJ = C1957707lf.LIZJ(str2);
            C1957707lf.LIZIZ(str2);
            ((Keva) C1957707lf.LIZIZ.getValue()).storeInt(strLIZ, iLIZJ + 1);
            this.LLILZ.LIZ(((IPaidContentBannerService) this.LLILZLL.getValue()).LIZJ(this.LLILLL.paidContentBannerCampaignId).LJJIJIIJI(C11S5.LIZ()).LJJIIJ());
            int iLIZJ2 = C1957707lf.LIZJ(this.LLILLL.paidContentBannerCampaignId);
            C2238141Ciq c2238141Ciq = C2238141Ciq.LIZ;
            PaidContentBannerCampaign paidContentBannerCampaign2 = this.LLILLL;
            String str3 = paidContentBannerCampaign2.paidContentBannerCampaignId;
            String str4 = this.LL;
            String str5 = this.LLILLJJLI;
            Map<String, String> map = paidContentBannerCampaign2.extraParams;
            c2238141Ciq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("campaign_id", str3);
            c2344009Gk.LJIIIIZZ("position", str5);
            c2344009Gk.LJIIIIZZ("enter_from", str4);
            c2344009Gk.LIZJ(iLIZJ2, "display_count");
            c2344009Gk.LJII(map);
            C20684815ws.LJIILLIIL("paid_content_profile_banner_show", c2344009Gk.LIZ);
        }
    }

    public C2238031Cif(InterfaceC20660715sz interfaceC20660715sz, String str, String str2, PaidContentBannerCampaign paidContentBannerCampaign, C11NJ c11nj, FrameLayout frameLayout) {
        super(interfaceC20660715sz);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = paidContentBannerCampaign;
        this.LLILZ = c11nj;
        this.LLILZIL = frameLayout;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(636));
    }
}
