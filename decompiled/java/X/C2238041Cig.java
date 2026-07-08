package X;

import Y.ACListenerS136S0200000_34;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;
import com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS400S0200000_34;

/* JADX INFO: renamed from: X.1Cig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20647615qs("paid_content_aware_banner_popup_task")
public final class C2238041Cig extends AbstractC20660815t0 {
    public final String LL;
    public final String LLILLJJLI;
    public final PaidContentAwareBannerSetting LLILLL;
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
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_series_dollar;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c20515215Pi.LJFF(c419910GdJ);
            PaidContentAwareBannerSetting paidContentAwareBannerSetting = this.LLILLL;
            String str = paidContentAwareBannerSetting.awareBannerMessageText;
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJFF = str;
            c1057450dcl.LJI = paidContentAwareBannerSetting.awareBannerCtaButtonText;
            c1057450dcl.LJIIJ = 2;
            c1057450dcl.LIZJ = true;
            c1057450dcl.LJIILIIL = new ACListenerS136S0200000_34(this, c20515215Pi, 4);
            c20515215Pi.LIZ.LJIILJJIL = new AwS400S0200000_34(c20656615sK, this, 19);
            c20515215Pi.LIZLLL();
            C2238071Cij c2238071Cij = C2238071Cij.LIZ;
            c2238071Cij.getClass();
            C01GW c01gw = C2238071Cij.LIZIZ;
            int i = ((Keva) c01gw.getValue()).getInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0) + 1;
            c2238071Cij.getClass();
            ((Keva) c01gw.getValue()).storeInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), i);
            this.LLILZ.LIZ(((IPaidContentAwareBannerService) this.LLILZLL.getValue()).LIZIZ().LJJIJIIJI(C11S5.LIZ()).LJJIIJ());
            C1572910r29 c1572910r29 = C1572910r29.LIZ;
            String str2 = this.LLILLL.awareBannerSchema;
            String str3 = this.LL;
            String str4 = this.LLILLJJLI;
            c1572910r29.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("campaign_id", str2);
            c2344009Gk.LJIIIIZZ("position", str4);
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            C20684815ws.LJIILLIIL("paid_content_profile_banner_show_mobile_creation", c2344009Gk.LIZ);
        }
    }

    public C2238041Cig(C0TGX c0tgx, PaidContentAwareBannerSetting paidContentAwareBannerSetting, C11NJ c11nj, FrameLayout frameLayout) {
        super(c0tgx);
        this.LL = "profile_page";
        this.LLILLJJLI = "bottom_bar";
        this.LLILLL = paidContentAwareBannerSetting;
        this.LLILZ = c11nj;
        this.LLILZIL = frameLayout;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(635));
    }
}
