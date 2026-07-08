package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0e5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075260e5U implements InterfaceC1370310llN {
    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_flag_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_flag;
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
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
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
    public final int LJJLIIIJJIZ() {
        return R.string.s65;
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
        return "ad_report";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
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

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(baseSharePackage.extras.getString("aweme_id"));
        if (awemeEr == null && (awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(baseSharePackage.extras.getString("aweme_id"))) == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJIIL(baseSharePackage.extras.getString("aweme_id"), baseSharePackage);
        int i = baseSharePackage.extras.getInt("anchor_type");
        AnchorCommonStruct anchorCommonStruct = null;
        if (i != 0) {
            List<AnchorCommonStruct> anchors = awemeEr.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it2.next();
                    if (next.getType() == i) {
                        anchorCommonStruct = next;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2 != null) {
                    ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LIZIZ(awemeEr, anchorCommonStruct2, context, AwemeExtKt.isAdTraffic(awemeEr));
                    return;
                }
                return;
            }
            return;
        }
        List<AnchorCommonStruct> anchors2 = awemeEr.getAnchors();
        if (anchors2 != null) {
            for (AnchorCommonStruct anchorCommonStruct3 : anchors2) {
                AnchorCommonStruct anchorCommonStruct4 = anchorCommonStruct3;
                if (anchorCommonStruct4.getType() == 76 || anchorCommonStruct4.getType() == 56) {
                    anchorCommonStruct = anchorCommonStruct3;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct5 = anchorCommonStruct;
            if (anchorCommonStruct5 != null) {
                ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LIZIZ(awemeEr, anchorCommonStruct5, context, AwemeExtKt.isAdTraffic(awemeEr));
                return;
            }
        }
        ComplianceServiceProvider.LJJ().LIZJ(C1375500ltk.LJII(context), C1048440dOE.LIZJ(awemeEr, "landing_page"));
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
