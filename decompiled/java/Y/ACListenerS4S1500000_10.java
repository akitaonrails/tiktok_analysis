package Y;

import X.C123100dR;
import X.C1440005kM;
import X.C737030Svd;
import X.EnumC669620QOi;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS4S1500000_10 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS4S1500000_10 aCListenerS4S1500000_10, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS4S1500000_10.l1;
        Map map = (Map) aCListenerS4S1500000_10.l2;
        Map map2 = (Map) aCListenerS4S1500000_10.l3;
        String str = aCListenerS4S1500000_10.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS4S1500000_10.l4;
        Aweme aweme = (Aweme) aCListenerS4S1500000_10.l5;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIILIIL(view2, map, map2, str, searchSugWordResponse, aweme, "click_bar_search");
    }

    public static final void onClick$1(ACListenerS4S1500000_10 aCListenerS4S1500000_10, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS4S1500000_10.l1;
        Map map = (Map) aCListenerS4S1500000_10.l2;
        Map map2 = (Map) aCListenerS4S1500000_10.l3;
        String str = aCListenerS4S1500000_10.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS4S1500000_10.l4;
        Aweme aweme = (Aweme) aCListenerS4S1500000_10.l5;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIILIIL(view2, map, map2, str, searchSugWordResponse, aweme, "click_bar_search");
    }

    public static final void onClick$2(ACListenerS4S1500000_10 aCListenerS4S1500000_10, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS4S1500000_10.l1;
        Map map = (Map) aCListenerS4S1500000_10.l2;
        Map map2 = (Map) aCListenerS4S1500000_10.l3;
        String str = aCListenerS4S1500000_10.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS4S1500000_10.l4;
        Aweme aweme = (Aweme) aCListenerS4S1500000_10.l5;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIILIIL(view2, map, map2, str, searchSugWordResponse, aweme, "click_search_icon");
    }

    public static final void onClick$3(ACListenerS4S1500000_10 aCListenerS4S1500000_10, View view) throws JSONException {
        if (C123100dR.LIZ(aCListenerS4S1500000_10.s0)) {
            String str = aCListenerS4S1500000_10.s0;
            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
            Context context = ((View) aCListenerS4S1500000_10.l1).getContext();
            detailFeedSearchHelper.getClass();
            if (!Intrinsics.LJFF(str, DetailFeedSearchHelper.LIZJ(context))) {
                ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
                Map map = (Map) aCListenerS4S1500000_10.l2;
                String str2 = aCListenerS4S1500000_10.s0;
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) aCListenerS4S1500000_10.l3;
                eCDetailFeedSearchHelper.getClass();
                ECDetailFeedSearchHelper.LJIIJ(map, str2, suggestWordResponse);
            }
        }
        ECDetailFeedSearchHelper eCDetailFeedSearchHelper2 = ECDetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS4S1500000_10.l1;
        Map map2 = (Map) aCListenerS4S1500000_10.l2;
        Map map3 = (Map) aCListenerS4S1500000_10.l4;
        String str3 = aCListenerS4S1500000_10.s0;
        Aweme aweme = (Aweme) aCListenerS4S1500000_10.l5;
        eCDetailFeedSearchHelper2.getClass();
        if (view2.getAlpha() == 0.0f) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("DetailFeedSearchHelper", "search bar is not visiable, alpha = 0, disable nativate action");
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view2.getContext(), "//ec/search");
        DetailFeedSearchHelper.LL.getClass();
        smartRouteBuildRoute.withParam(DetailFeedSearchHelper.LJI(map2, map3, str3, null, aweme));
        smartRouteBuildRoute.withParam("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("c4790.d0", PageFinder.via(view2), null));
        smartRouteBuildRoute.withParam("use_ec_container", "simple_exp");
        smartRouteBuildRoute.withParam("target_tab", EnumC669620QOi.SHOP.getTabName());
        smartRouteBuildRoute.withParam("enter_method", "default_search_keyword_outer");
        smartRouteBuildRoute.withParam("src_anchor_product_id", ECDetailFeedSearchHelper.LIZLLL(aweme));
        smartRouteBuildRoute.withParam("traffic_source_list", ECDetailFeedSearchHelper.LJ(aweme, map2));
        smartRouteBuildRoute.withParam("enter_from", ECDetailFeedSearchHelper.LIZJ(map2));
        smartRouteBuildRoute.withParam("keep_tab_position", "true");
        smartRouteBuildRoute.withParam("last_search_position", ECDetailFeedSearchHelper.LIZ(map2));
        Integer numLIZIZ = ECDetailFeedSearchHelper.LIZIZ(map2);
        if (numLIZIZ != null) {
            smartRouteBuildRoute.withParam("root_enter_from_type", numLIZIZ.intValue());
        }
        smartRouteBuildRoute.open();
        C1440005kM.LIZ(new C737030Svd(90, map2.get("group_id")));
    }

    public ACListenerS4S1500000_10(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj4;
        this.l3 = obj2;
        this.l4 = obj5;
        this.l5 = obj3;
    }
}
