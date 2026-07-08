package X;

import Y.AObserverS234S0100000_32;
import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetShopShowcaseInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseCommentAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import com.zhiliaoapp.musically.R;
import g1c.AjS72S0100000_32;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18NK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NK extends ConstraintLayout implements InterfaceC1164530gPT {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public final ECommerceShowcaseCommentAnchorViewModel LLIZ;

    public final TuxTextView getProductSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rzs);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getProductTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rzz);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getShopCartFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v6c);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        super.onAttachedToWindow();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ILogDependencyService iLogDependencyService = (ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IAnchorDependencyService.class.getName(), anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str = iAnchorDependencyService.getAnchorMobRefactorExpEnable() ? "comment_top_anchor" : "comment_anchor";
        C18NZ c18nz = C18NZ.LIZ;
        String str2 = this.LLILLJJLI;
        Aweme aweme = this.LL;
        ShowcaseContent showcaseContent = this.LLIZ.LLILZLL;
        c18nz.getClass();
        C2344009Gk c2344009GkLIZ = C18NZ.LIZ(str2, aweme, showcaseContent, str);
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            iLogDependencyService.onEventV3("multi_anchor_entrance_show", iAnchorDependencyService.mobParamsParserGetJSONObject(iAnchorDependencyService.appendCommentLogParams(c2344009GkLIZ, this.LL, this.LLIZ.LLILZIL, false)));
        }
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 18));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 20));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_anchor_open_comment", this);
    }

    public final void setProductSubtitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setProductTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setShopCartFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        Type type;
        C1350640lFe c1350640lFe;
        if (Intrinsics.LJFF(str, "ec_anchor_open_comment")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(C1350640lFe.class));
                } else {
                    type = new TypeToken<C1350640lFe>() { // from class: X.18OT
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof C1350640lFe)) {
                    objFromJson = null;
                }
                c1350640lFe = (C1350640lFe) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (c1350640lFe == null) {
                str3 = null;
            } else {
                str3 = c1350640lFe.eventType;
            }
            if (Intrinsics.LJFF(str3, this.LLILLJJLI)) {
                C18NZ.LIZ.getClass();
                C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 18));
            }
        }
    }

    public C18NK(Context context, Aweme aweme, String str, AwS265S0300000_21 awS265S0300000_21) {
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        AnchorCommonStruct anchorCommonStruct;
        String keyword;
        String strLJIIIIZZ;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        boolean z;
        String name;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = awS265S0300000_21;
        ECommerceShowcaseCommentAnchorViewModel eCommerceShowcaseCommentAnchorViewModel = new ECommerceShowcaseCommentAnchorViewModel(aweme, str);
        this.LLIZ = eCommerceShowcaseCommentAnchorViewModel;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ICommentDependencyService.class.getName();
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        if (!((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).enablePreloadHighestAnchor() || C20673215v0.LJFF(context, context, R.layout.all, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.all, this, true);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_anchor_open_comment", this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            eCommerceShowcaseCommentAnchorViewModel.LLILZ.observe(c19egLIZIZ, new AObserverS234S0100000_32(this, 46));
        }
        TuxTextView productTitleFromXml = getProductTitleFromXml();
        ShowcaseContent showcaseContent = eCommerceShowcaseCommentAnchorViewModel.LLILZLL;
        String str6 = "";
        if ((showcaseContent == null || (keyword = showcaseContent.shopShowcaseTitle) == null) && ((anchorCommonStruct = eCommerceShowcaseCommentAnchorViewModel.LLILZIL) == null || (keyword = anchorCommonStruct.getKeyword()) == null)) {
            keyword = "";
        }
        productTitleFromXml.setText(keyword);
        TuxIconView shopCartFromXml = getShopCartFromXml();
        if (shopCartFromXml != null) {
            C18NJ c18nj = C18NJ.LIZ;
            int iLIZLLL = C21274118Nf.LIZLLL(eCommerceShowcaseCommentAnchorViewModel.LL);
            c18nj.getClass();
            shopCartFromXml.setIconRes(C18NJ.LIZ(iLIZLLL));
        }
        if (C21274118Nf.LIZ(aweme)) {
            ShowcaseContent showcaseContent2 = eCommerceShowcaseCommentAnchorViewModel.LLILZLL;
            if (showcaseContent2 != null) {
                str2 = showcaseContent2.sellerId;
                num = showcaseContent2.groupType;
                str3 = showcaseContent2.groupId;
                str4 = showcaseContent2.groupTitle;
                str5 = showcaseContent2.groupSubTitle;
            } else {
                str2 = null;
                num = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            C1345205Og.LIZIZ(new GetShopShowcaseInfoRequest(str2, num, str3, str4, str5, null, showcaseContent2 != null ? showcaseContent2.pageId : null), new AwS611S0100000_32(eCommerceShowcaseCommentAnchorViewModel, 388));
        }
        C786410Ut5.I7(new AjS72S0100000_32(this, 20), this);
        IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
        HashMap map = new HashMap();
        for (Map.Entry entry : ((LinkedHashMap) eCommerceShowcaseCommentAnchorViewModel.LLILLL).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        C18NJ c18nj2 = C18NJ.LIZ;
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ.LLILZIL;
        c18nj2.getClass();
        ShowcaseContent showcaseContentLIZIZ = C18NJ.LIZIZ(anchorCommonStruct2);
        if (showcaseContentLIZIZ != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(showcaseContentLIZIZ)) != null) {
            str6 = strLJIIIIZZ;
        }
        map.put("showcase_anchor", str6);
        iEComOfflineService.LIZLLL();
    }
}
