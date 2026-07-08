package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.ISettingDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0hb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210120hb0 implements InterfaceC1370310llN {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "ad_settings";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        TcmConfig tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII();
        return (tcmConfigLJII == null || !tcmConfigLJII.getUseNewBCSetting()) ? R.raw.icon_horn_fill : R.raw.icon_film_star_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        TcmConfig tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII();
        return (tcmConfigLJII == null || !tcmConfigLJII.getUseNewBCSetting()) ? R.raw.icon_2pt_horn_ltr : R.raw.icon_2pt_film_star;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LJIIIZ() ? !this.LL.getIsTikTokStory() ? 2131847745 : 2131849972 : !((Boolean) this.LLILLL.getValue()).booleanValue() ? 2131847745 : 2131849972;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    public C1210120hb0(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = C452501pT.LIZIZ(new AwS420S0200000_19(aweme, this, 145));
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String uid;
        String str;
        String str2;
        TcmConfig tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII();
        if (tcmConfigLJII != null && tcmConfigLJII.getUseNewBCSetting()) {
            ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIILL(this.LL, C1388190mED.LIZ(context));
        } else {
            ISettingDependService iSettingDependService = (ISettingDependService) PluggableExtentionKt.pluggableSpi$default(ISettingDependService.class, false, false, false, 14, null);
            if (iSettingDependService != null) {
                iSettingDependService.LIZIZ(context, this.LL);
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        User author = this.LL.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("enter_method", "click_share_button");
        if (this.LL.getAwemeType() == 150) {
            str = "photo mode";
        } else {
            str = "video";
        }
        c2344009Gk.LJIIIIZZ("content_type", str);
        if (this.LL.getIsTikTokStory()) {
            str2 = "story";
        } else {
            str2 = "general content";
        }
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        C20684815ws.LJIILLIIL("click_adsetting_entrance", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
        String uid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        User author = this.LL.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("enter_method", "click_share_button");
        C20684815ws.LJIILLIIL("show_adsetting_entrance", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }
}
