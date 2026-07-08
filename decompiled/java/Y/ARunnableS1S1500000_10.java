package Y;

import X.AbstractC19484711Kz;
import X.C078A;
import X.C07BX;
import X.C09JN;
import X.C0Q68;
import X.C0QF6;
import X.C0QJX;
import X.C0QKX;
import X.C0QPJ;
import X.C0QQF;
import X.C0QXR;
import X.C0X52;
import X.C11JL;
import X.C11S5;
import X.C1494600ozq;
import X.C1494690ozz;
import X.C1507790pL7;
import X.C1515820pY4;
import X.C1701940uOG;
import X.C1860990yWn;
import X.C1861010yWp;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C665580Q8u;
import X.C667120QEs;
import X.C668500QKa;
import X.C668510QKb;
import X.C668540QKe;
import X.C786410Ut5;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS1S1500000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IFamilyPairingService iFamilyPairingServiceLJIIL;
        CommentSuggestWordList commentSuggestWordList;
        SuggestWordStruct suggestWordStruct;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct next;
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
        View view = (View) this.l1;
        detailFeedSearchHelper.getClass();
        View viewLJFF = DetailFeedSearchHelper.LJFF(view);
        if (viewLJFF == null) {
            return;
        }
        if (viewLJFF.getWidth() == 0) {
            viewLJFF.requestLayout();
        }
        C786410Ut5.LJLLLLLL(C665580Q8u.LIZIZ.LIZIZ() ? 0 : 8, viewLJFF);
        C786410Ut5.T4(viewLJFF, 1.0f);
        DetailFeedSearchHelper.LJIIJ(viewLJFF, (Map) this.l2, (Map) ((C259800zU) this.l3).element, (Aweme) this.l4);
        if (((Number) C07BX.LIZ.getValue()).intValue() != 3 || ((iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL()) != null && iFamilyPairingServiceLJIIL.LJIIIZ())) {
            TuxIconView tuxIconView = (TuxIconView) viewLJFF.findViewById(R.id.lcc);
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LJ()) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            DetailFeedSearchHelper.LJIIIZ(viewLJFF, null, (Map) this.l2, (Map) ((C259800zU) this.l3).element, null, (Aweme) this.l4, (View) this.l1);
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.l5;
        String str = this.s0;
        Map<String, String> map = (Map) this.l2;
        Map<String, Boolean> map2 = (Map) ((C259800zU) this.l3).element;
        Aweme aweme = (Aweme) this.l4;
        View view2 = (View) this.l1;
        if (!((Boolean) C078A.LIZ.getValue()).booleanValue()) {
            detailFeedSearchHelper.LJIILJJIL(lifecycleOwner, viewLJFF, str, map, map2, aweme, view2);
            return;
        }
        if (aweme == null || (commentSuggestWordList = aweme.getCommentSuggestWordList()) == null || !commentSuggestWordList.getFeedQueryEnableVideoSug()) {
            detailFeedSearchHelper.LJIILJJIL(lifecycleOwner, viewLJFF, str, map, map2, aweme, view2);
            return;
        }
        try {
            CommentSuggestWordList commentSuggestWordList2 = aweme.getCommentSuggestWordList();
            if (commentSuggestWordList2 == null || (suggestWords = commentSuggestWordList2.getSuggestWords()) == null) {
                suggestWordStruct = null;
            } else {
                Iterator<SuggestWordStruct> it2 = suggestWords.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    SuggestWordStruct suggestWordStruct2 = next;
                    if (Intrinsics.LJFF(suggestWordStruct2 != null ? suggestWordStruct2.getScene() : null, "videosug")) {
                        break;
                    }
                }
                suggestWordStruct = next;
            }
            boolean zLJJII = ComplianceServiceProvider.LJI().LJJII();
            DetailFeedSearchHelper.LLILLJJLI = new C667120QEs(str, map.containsKey("isTrending") ? "trending_inflow" : DetailFeedSearchHelper.LIZLLL(map), zLJJII ? 1 : null);
            if (suggestWordStruct == null || zLJJII) {
                if (detailFeedSearchHelper.LJIIL(lifecycleOwner)) {
                    return;
                }
                DetailFeedSearchHelper.LJIIIZ(viewLJFF, null, map, map2, null, aweme, view2);
            } else {
                SearchSugWordResponse searchSugWordResponseLIZIZ = DetailFeedSearchHelper.LIZIZ(suggestWordStruct);
                if (detailFeedSearchHelper.LJIIL(lifecycleOwner)) {
                    return;
                }
                DetailFeedSearchHelper.LJIIIZ(viewLJFF, searchSugWordResponseLIZIZ, map, map2, null, aweme, view2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoSug new path failed: ");
            sbLIZ.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DetailFeedSearchHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$1() throws JSONException {
        JSONObject jSONObject;
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
        View view = (View) this.l1;
        detailFeedSearchHelper.getClass();
        final View viewLJFF = DetailFeedSearchHelper.LJFF(view);
        if (viewLJFF == null) {
            return;
        }
        if (viewLJFF.getWidth() == 0) {
            viewLJFF.requestLayout();
        }
        C786410Ut5.LJLLLLLL(0, viewLJFF);
        C786410Ut5.T4(viewLJFF, 1.0f);
        DetailFeedSearchHelper.LJIIJ(viewLJFF, (Map) this.l2, (Map) this.l3, (Aweme) this.l4);
        ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
        Map map = (Map) this.l2;
        eCDetailFeedSearchHelper.getClass();
        boolean zLJII = ECDetailFeedSearchHelper.LJII(map);
        boolean zLJIIIIZZ = ECDetailFeedSearchHelper.LJIIIIZZ((Map) this.l2);
        if (zLJII || zLJIIIIZZ) {
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) this.l5;
            String str = this.s0;
            final Map map2 = (Map) this.l2;
            final Map map3 = (Map) this.l3;
            final Aweme aweme = (Aweme) this.l4;
            View view2 = (View) this.l1;
            String strLIZLLL = map2.containsKey("isTrending") ? "trending_inflow" : DetailFeedSearchHelper.LIZLLL(map2);
            Integer num = ComplianceServiceProvider.LJI().LJJII() ? 1 : null;
            C667120QEs c667120QEs = ECDetailFeedSearchHelper.LLILLJJLI;
            if (Intrinsics.LJFF(c667120QEs != null ? c667120QEs.LIZ : null, str)) {
                C667120QEs c667120QEs2 = ECDetailFeedSearchHelper.LLILLJJLI;
                if (Intrinsics.LJFF(c667120QEs2 != null ? c667120QEs2.LIZIZ : null, strLIZLLL)) {
                    C667120QEs c667120QEs3 = ECDetailFeedSearchHelper.LLILLJJLI;
                    if (Intrinsics.LJFF(c667120QEs3 != null ? c667120QEs3.LIZJ : null, num)) {
                        return;
                    }
                }
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Pair[] pairArr = new Pair[3];
            String strLIZ = ECDetailFeedSearchHelper.LIZ(map2);
            String str2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            pairArr[0] = new Pair("enter_from", strLIZ);
            String strLIZJ = ECDetailFeedSearchHelper.LIZJ(map2);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            pairArr[1] = new Pair("search_entrance", strLIZJ);
            pairArr[2] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("show_search", mapLJIIJ);
            DetailFeedSearchHelper.LLILZLL.clear();
            ECDetailFeedSearchHelper.LLILLJJLI = new C667120QEs(str, strLIZLLL, num);
            if (ECDetailFeedSearchHelper.LJII(map2)) {
                Integer numLIZIZ = ECDetailFeedSearchHelper.LIZIZ(map2);
                if (numLIZIZ != null) {
                    int iIntValue = numLIZIZ.intValue();
                    if (iIntValue == C0QXR.MALL_FEED_VIDEO.getValue()) {
                        str2 = "short_video_in_mall";
                    } else if (iIntValue == C0QXR.SHOP_SEARCH_IN_MALL_VIDEO.getValue() || iIntValue == C0QXR.VIDEO_VERTICAL_TAB_VIDEO_CELL.getValue()) {
                        str2 = "short_video_in_mall_search";
                    } else if (iIntValue == C0QXR.ORDER_GUESS_VIDEO.getValue()) {
                        str2 = "short_video_in_order";
                    }
                    jSONObject = new JSONObject();
                    jSONObject.put("reqSource", str2);
                    jSONObject.put("fromGroupId", aweme.getAid());
                    jSONObject.put("enterFrom", map2.get("enter_from"));
                    ECSearchEntranceData eCSearchEntranceDataLJJLIIIJLJLI = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJLJLI(iIntValue);
                    if (eCSearchEntranceDataLJJLIIIJLJLI != null) {
                        C0QF6 c0qf6LJIJI = C0QPJ.LJIJI(eCSearchEntranceDataLJJLIIIJLJLI);
                        JSONArray jSONArray = new JSONArray();
                        Iterator<SearchHistory> it2 = c0qf6LJIJI.LJIIL(0).iterator();
                        while (it2.hasNext()) {
                            jSONArray.put(it2.next().toString());
                        }
                        jSONObject.put("historyList", Uri.encode(jSONArray.toString()));
                    }
                    ECDetailFeedSearchHelper.LL.getClass();
                    jSONObject.put("srcAnchorProductId", ECDetailFeedSearchHelper.LIZLLL(aweme));
                } else {
                    jSONObject = new JSONObject();
                }
            } else if (ECDetailFeedSearchHelper.LJIIIIZZ(map2)) {
                jSONObject = new JSONObject();
                jSONObject.put("reqSource", "short_video_in_shop_tab");
                jSONObject.put("fromGroupId", aweme.getAid());
                jSONObject.put("enterFrom", map2.get("enter_from"));
                C0QF6 c0qf6LJIJI2 = C0QPJ.LJIJI(null);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<SearchHistory> it3 = c0qf6LJIJI2.LJIIL(0).iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(it3.next().toString());
                }
                jSONObject.put("historyList", Uri.encode(jSONArray2.toString()));
                ECDetailFeedSearchHelper.LL.getClass();
                jSONObject.put("srcAnchorProductId", ECDetailFeedSearchHelper.LIZLLL(aweme));
            } else {
                jSONObject = new JSONObject();
            }
            AbstractC19484711Kz<SuggestWordResponse> abstractC19484711KzLJJLIIIJILLIZJL = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJILLIZJL(C0Q68.LIZIZ("reqSource", jSONObject), C0Q68.LIZIZ("fromGroupId", jSONObject), C0Q68.LIZIZ("enterFrom", jSONObject), C0Q68.LIZIZ("historyList", jSONObject), C0Q68.LIZIZ("srcAnchorProductId", jSONObject));
            ECDetailFeedSearchHelper.LLILLL = (C11JL) (abstractC19484711KzLJJLIIIJILLIZJL != null ? abstractC19484711KzLJJLIIIJILLIZJL.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS8S0600000_10(viewLJFF, view2, lifecycleOwner, aweme, map2, map3, 2), new C09JN() { // from class: X.0QEq
                @Override // X.C09JN
                public final void accept(Object obj) throws JSONException {
                    C1C7U.LIZ("ECDetailFeedSearchHelper@5f7b.requestAndUpdateEcInputWord$1$2");
                    if (!ECDetailFeedSearchHelper.LL.LJI(lifecycleOwner)) {
                        ECDetailFeedSearchHelper.LJFF(viewLJFF, null, map2, map3, aweme);
                    }
                    C1C7U.LIZIZ("ECDetailFeedSearchHelper@5f7b.requestAndUpdateEcInputWord$1$2");
                }
            }) : null);
        }
    }

    public static final void run$0(ARunnableS1S1500000_10 aRunnableS1S1500000_10) {
        C0QJX c0qjx = (C0QJX) aRunnableS1S1500000_10.l1;
        C668510QKb c668510QKb = (C668510QKb) aRunnableS1S1500000_10.l2;
        String str = aRunnableS1S1500000_10.s0;
        C668540QKe c668540QKe = (C668540QKe) aRunnableS1S1500000_10.l3;
        AtomicBoolean atomicBoolean = (AtomicBoolean) aRunnableS1S1500000_10.l4;
        C0QKX c0qkx = (C0QKX) aRunnableS1S1500000_10.l5;
        c0qjx.getClass();
        C1C7U.LIZ("SearchSugPresenter@ac4.syncFetchSugByFastChunk$1L");
        try {
            C0X52<C1515820pY4<SearchSugResponse>> c0x52Execute = c668510QKb.LIZIZ.execute();
            C1515820pY4<SearchSugResponse> c1515820pY4 = c0x52Execute.LIZIZ;
            c1515820pY4.setRequestInfo((C1494600ozq) c0x52Execute.LIZ.LJFF);
            c1515820pY4.LIZLLL(new C668500QKa(c668540QKe, c668510QKb, c0qkx, c0qjx, str, atomicBoolean));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if ((th instanceof C1494690ozz) && th.getCronetInternalErrorCode() == -999) {
                c668510QKb.LIZIZ(null);
            }
        }
        C1C7U.LIZIZ("SearchSugPresenter@ac4.syncFetchSugByFastChunk$1L");
    }

    public static final void run$1(ARunnableS1S1500000_10 aRunnableS1S1500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TakoVideoConfigKt@864a.bindVideoCover$loadCoverAction$1");
        try {
            C1860990yWn.LIZIZ((SmartImageView) aRunnableS1S1500000_10.l1, (TakoVideoItem) aRunnableS1S1500000_10.l2, aRunnableS1S1500000_10.s0, (Map) aRunnableS1S1500000_10.l3, (C1861010yWp) aRunnableS1S1500000_10.l4, (Pair) aRunnableS1S1500000_10.l5);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoVideoConfigKt@864a.bindVideoCover$loadCoverAction$1");
    }

    public static final void run$2(ARunnableS1S1500000_10 aRunnableS1S1500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("DetailFeedSearchHelper@a066.checkSearchEntry$2");
        try {
            aRunnableS1S1500000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFeedSearchHelper@a066.checkSearchEntry$2");
    }

    public static final void run$3(ARunnableS1S1500000_10 aRunnableS1S1500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ECDetailFeedSearchHelper@5f7b.checkECSearchEntry$1");
        try {
            aRunnableS1S1500000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECDetailFeedSearchHelper@5f7b.checkECSearchEntry$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S1500000_10(Object obj, View view, Map<String, String> map, Map<String, Boolean> map2, Aweme aweme, LifecycleOwner lifecycleOwner, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = view;
        this.l3 = map;
        this.l4 = map2;
        this.l5 = aweme;
        this.s0 = lifecycleOwner;
    }
}
