package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399360mWE extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) ? "AI Portrait" : keyword;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        c2344009Gk.LJFF("tt_template_id", anchorCommonStruct != null ? AnchorKt.getExtraBasedOnKey(anchorCommonStruct, "template_id") : null);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        c2344009Gk.LJFF("tt_template_type", Intrinsics.LJFF(anchorCommonStruct2 != null ? AnchorKt.getExtraBasedOnKey(anchorCommonStruct2, "template_type") : null, "4") ? "ugc" : "official");
        return new C1400390mXt(new AwS565S0100000_21(c2344009Gk, 1264), new AwS565S0100000_21(c2344009Gk, 1265), new AwS565S0100000_21(c2344009Gk, 1266), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1399360mWE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_PORTRAIT_ANCHOR_TYPE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS422S0200000_21(this, smartImageView, 85));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        AccountUserService accountUserServiceLJIIJ;
        if (LJIIZILJ().getAuthor().isAccuratePrivateAccount()) {
            C19719612Di.LJJIIJ(list, new AwS600S0100000_21(this, 255), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.getCurUser().isAccuratePrivateAccount()) {
            C19719612Di.LJJIIJ(list, new AwS600S0100000_21(this, 256), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (!AwemeExtKt.isPublic(LJIIZILJ())) {
            C19719612Di.LJJIIJ(list, new AwS600S0100000_21(this, 257), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        EnumC1050190dR3 enumC1050190dR3LJJJJLL = super.LJJJJLL(list);
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ2 = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ2 != null && (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureServiceLIZ2.LJFF()) != null && iAIPortraitCreationServiceLJFF.LJFF()) {
                if (enumC1050190dR3LJJJJLL != EnumC1050190dR3.NOT_FOUND) {
                    Map<? extends Object, Integer> map = C1430360nKE.LIZ;
                    this.LLILLJJLI = C1430360nKE.LIZ(type());
                }
                return enumC1050190dR3LJJJJLL;
            }
            return EnumC1050190dR3.NOT_FOUND;
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        Aweme awemeLJIIZILJ = LJIIZILJ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//ai_portrait/detail");
        if (!(awemeLJIIZILJ instanceof Serializable)) {
            awemeLJIIZILJ = null;
        }
        smartRouteBuildRoute.withParam("ai_portrait_aweme", awemeLJIIZILJ);
        smartRouteBuildRoute.withParam("ai_portrait_enter_from", LJIJJLI());
        smartRouteBuildRoute.open();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        String str;
        String keyword;
        UrlModel icon;
        List<String> urlList;
        C1397480mTC c1397480mTCLIZ = C1397470mTB.LIZ(viewGroup.getContext());
        C786410Ut5.I7(new C1401840maE(dialog, this, c2344009Gk, 0), c1397480mTCLIZ);
        c1397480mTCLIZ.LIZIZ(true);
        c1397480mTCLIZ.setButtonOnClickListener(new AwS117S0400000_21(dialog, this, c1397480mTCLIZ, c2344009Gk, 8));
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (icon = anchorCommonStruct.getIcon()) == null || (urlList = icon.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "https://p16.tiktokcdn.com/obj/tiktok-obj/ai_live.png";
        }
        c1397480mTCLIZ.LIZLLL(str);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 == null || (keyword = anchorCommonStruct2.getKeyword()) == null) {
            keyword = "AI Portrait";
        }
        c1397480mTCLIZ.setTitle(keyword);
        viewGroup.addView(c1397480mTCLIZ);
        return c1397480mTCLIZ;
    }
}
