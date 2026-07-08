package X;

import Y.AObserverS234S0100000_32;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetShopShowcaseInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseAnchorState;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18NN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NN implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final C18NV LIZIZ;
    public C18NS LIZJ;

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
    }

    @Override // X.InterfaceC21275218Nq
    public final String LJFF() {
        return "click_list";
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZ() {
        C18NS c18ns = this.LIZJ;
        if (c18ns != null) {
            c18ns.LIZJ();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZIZ() {
        C18NS c18ns;
        C18NS c18ns2 = new C18NS(this.LIZ.getContext());
        this.LIZJ = c18ns2;
        this.LIZ.addView(c18ns2);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LLIZ;
        if ((interfaceC1392640mLO == null || !interfaceC1392640mLO.LJIIIIZZ()) && (c18ns = this.LIZJ) != null) {
            c18ns.LJ();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZLLL() {
        C18NS c18ns = this.LIZJ;
        if (c18ns != null) {
            c18ns.LIZLLL();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final HashMap<String, String> getShowContentInfo() {
        return new HashMap<>();
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        AnchorCommonStruct anchorCommonStruct;
        String keyword;
        ECAnchorInfo eCAnchorInfo;
        ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel = this.LIZIZ.LLILZLL;
        C18NS c18ns = this.LIZJ;
        TuxIconView iconView = c18ns != null ? c18ns.getIconView() : null;
        eCommerceShowcaseAnchorViewModel.getClass();
        if (iconView != null) {
            C18NJ c18nj = C18NJ.LIZ;
            int iLIZLLL = C21274118Nf.LIZLLL(eCommerceShowcaseAnchorViewModel.LL);
            c18nj.getClass();
            iconView.setIconRes(C18NJ.LIZ(iLIZLLL));
        }
        C18NS c18ns2 = this.LIZJ;
        if (c18ns2 != null) {
            ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel2 = this.LIZIZ.LLILZLL;
            ShowcaseContent showcaseContent = eCommerceShowcaseAnchorViewModel2.LLILZLL;
            if ((showcaseContent == null || (keyword = showcaseContent.shopShowcaseTitle) == null) && ((anchorCommonStruct = eCommerceShowcaseAnchorViewModel2.LLILZIL) == null || (keyword = anchorCommonStruct.getKeyword()) == null)) {
                keyword = "";
            }
            ShowcaseContent showcaseContent2 = this.LIZIZ.LLILZLL.LLILZLL;
            c18ns2.LIZIZ(keyword, (showcaseContent2 == null || (eCAnchorInfo = showcaseContent2.ecAnchorInfo) == null) ? null : eCAnchorInfo.anchorTag);
        }
        if (C21274118Nf.LIZ(this.LIZIZ.LLILZLL.LL)) {
            ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel3 = this.LIZIZ.LLILZLL;
            eCommerceShowcaseAnchorViewModel3.getClass();
            ShowcaseContent showcaseContent3 = eCommerceShowcaseAnchorViewModel3.LLILZLL;
            if (showcaseContent3 != null) {
                str = showcaseContent3.sellerId;
                num = showcaseContent3.groupType;
                str2 = showcaseContent3.groupId;
                str3 = showcaseContent3.groupTitle;
                str4 = showcaseContent3.groupSubTitle;
            } else {
                str = null;
                num = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            C1345205Og.LIZIZ(new GetShopShowcaseInfoRequest(str, num, str2, str3, str4, null, showcaseContent3 != null ? showcaseContent3.pageId : null), new AwS611S0100000_32(eCommerceShowcaseAnchorViewModel3, 387));
        }
        ViewGroup viewGroup = this.LIZ;
        MutableLiveData<ECommerceShowcaseAnchorState> mutableLiveData = this.LIZIZ.LLILZLL.LLILZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        if (c19egLIZIZ != null) {
            mutableLiveData.observe(c19egLIZIZ, new AObserverS234S0100000_32(this, 41));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) {
        String str = "c9855.d40179";
        if (C0C14.LIZ()) {
            ViewGroup viewGroup = this.LIZ;
            ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel = this.LIZIZ.LLILZLL;
            Aweme aweme = eCommerceShowcaseAnchorViewModel.LL;
            C18N7.LIZ.getClass();
            C18NJ.LIZ.getClass();
            if (C18NJ.LIZLLL(aweme)) {
                str = "c20736.d0";
            }
            c2344009Gk.LJII(C1104190eq9.LIZ(viewGroup, str));
            C18NZ c18nz = C18NZ.LIZ;
            String str2 = eCommerceShowcaseAnchorViewModel.LLIZ;
            c18nz.getClass();
            C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32(c2344009Gk, str2, 18));
            C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32(c2344009Gk, eCommerceShowcaseAnchorViewModel.LLIZ, 20));
            return;
        }
        ViewGroup viewGroup2 = this.LIZ;
        ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel2 = this.LIZIZ.LLILZLL;
        c2344009Gk.LJII(C1104190eq9.LIZ(viewGroup2, "c9855.d40179"));
        eCommerceShowcaseAnchorViewModel2.getClass();
        C18NZ c18nz2 = C18NZ.LIZ;
        String str3 = eCommerceShowcaseAnchorViewModel2.LLIZ;
        c18nz2.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32(c2344009Gk, str3, 18));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32(c2344009Gk, eCommerceShowcaseAnchorViewModel2.LLIZ, 20));
    }

    public C18NN(ViewGroup viewGroup, C18NV c18nv) {
        this.LIZ = viewGroup;
        this.LIZIZ = c18nv;
    }
}
