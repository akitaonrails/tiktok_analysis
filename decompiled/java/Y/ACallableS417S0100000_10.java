package Y;

import X.C0PIF;
import X.C0PRW;
import X.C0PYW;
import X.C13LP;
import X.C1C7U;
import X.C20684815ws;
import X.C486180J4u;
import X.C642340PHk;
import X.C646000PVm;
import X.C650950Pg5;
import X.C655840Pny;
import X.C658270Prt;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.fragment.SearchTabFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ACallableS417S0100000_10 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS417S0100000_10 aCallableS417S0100000_10) throws Exception {
        String str;
        Object obj;
        Object obj2;
        C1C7U.LIZ("BatchDetailModel@4c33.sendRequest$1");
        Object[] objArr = (Object[]) aCallableS417S0100000_10.l0;
        String str2 = "";
        if (objArr.length <= 1 || (obj2 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj2;
        }
        if (objArr.length > 2 && (obj = objArr[2]) != null) {
            str2 = (String) obj;
        }
        BatchDetailList batchDetailListLIZJ = DetailApi.LIZJ(0, (String) objArr[0], 0, str, str2, 0, null);
        C1C7U.LIZIZ("BatchDetailModel@4c33.sendRequest$1");
        return batchDetailListLIZJ;
    }

    public static final Object call$1(ACallableS417S0100000_10 aCallableS417S0100000_10) {
        String strCS;
        C1C7U.LIZ("SearchTabFragment@75c6.mobStartRefreshData$1");
        if (Intrinsics.LJFF(((SearchTabFragment) aCallableS417S0100000_10.l0).cS(), "general_search")) {
            strCS = "general";
        } else {
            strCS = ((SearchTabFragment) aCallableS417S0100000_10.l0).cS();
        }
        boolean z = C0PYW.LIZ;
        C20684815ws.LJIJI("search_start_refresh_data", new Pair(strCS, "search_type"), new Pair(Integer.valueOf(((SearchTabFragment) aCallableS417S0100000_10.l0).LLJJJJ), "page_index"), new Pair(((SearchTabFragment) aCallableS417S0100000_10.l0).LLJJIJI, "enter_method"), new Pair(Boolean.valueOf(C0PYW.LIZ), "is_first_search"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchTabFragment@75c6.mobStartRefreshData$1");
        return unit;
    }

    public static final Object call$2(ACallableS417S0100000_10 aCallableS417S0100000_10) {
        String str;
        String str2;
        String authorUid;
        String string;
        String uid;
        String string2;
        int followStatus;
        User author;
        User author2;
        User author3;
        User author4;
        C1C7U.LIZ("SearchUserLiveItemViewHolder@2482.onViewAttachedToWindow$1");
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = ((C658270Prt) aCallableS417S0100000_10.l0).itemView;
        c646000PVm.getClass();
        C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(view);
        C655840Pny c655840Pny = new C655840Pny();
        String requestId = null;
        if (c0prwLIZLLL != null) {
            str = c0prwLIZLLL.searchId;
        } else {
            str = null;
        }
        c655840Pny.LJIIZILJ("search_id", str);
        if (c0prwLIZLLL != null) {
            str2 = c0prwLIZLLL.searchKeyword;
        } else {
            str2 = null;
        }
        c655840Pny.LJIIZILJ("search_keyword", str2);
        c655840Pny.LJIIZILJ("search_type", "general");
        Aweme aweme = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c655840Pny.LJIJI("search_result_id", authorUid);
        Aweme aweme2 = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme2 == null || (author4 = aweme2.getAuthor()) == null || (string = Long.valueOf(C486180J4u.LIZ(author4)).toString()) == null) {
            string = "";
        }
        c655840Pny.LJIIZILJ("list_item_id", string);
        c655840Pny.LJIIZILJ("enter_from_merge", "general_search");
        c655840Pny.LJIIZILJ("enter_method", "live_cover");
        c655840Pny.LJIIZILJ("action_type", "click");
        Aweme aweme3 = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme3 != null && (author3 = aweme3.getAuthor()) != null) {
            uid = author3.getUid();
        } else {
            uid = null;
        }
        c655840Pny.LJIIZILJ("anchor_id", uid);
        Aweme aweme4 = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme4 != null && (author2 = aweme4.getAuthor()) != null) {
            string2 = Long.valueOf(C486180J4u.LIZ(author2)).toString();
        } else {
            string2 = null;
        }
        c655840Pny.LJIIZILJ("room_id", string2);
        Aweme aweme5 = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme5 != null) {
            requestId = aweme5.getRequestId();
        }
        c655840Pny.LJIIZILJ("request_id", requestId);
        Aweme aweme6 = ((C658270Prt) aCallableS417S0100000_10.l0).LLJJIJI;
        if (aweme6 != null && (author = aweme6.getAuthor()) != null) {
            followStatus = author.getFollowStatus();
        } else {
            followStatus = 0;
        }
        c655840Pny.LJJIJL(followStatus);
        c655840Pny.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchUserLiveItemViewHolder@2482.onViewAttachedToWindow$1");
        return unit;
    }

    public static final Object call$3(ACallableS417S0100000_10 aCallableS417S0100000_10) {
        List<Aweme> awemeCards;
        List<Aweme> awemeList;
        List<SearchUser> users;
        C1C7U.LIZ("SearchDualStreamMobHelper@b2f5.clearDualStreamMobFromAllAwemes$1");
        C0PIF c0pif = C0PIF.LIZ;
        List<SearchMixFeed> list = (List) aCallableS417S0100000_10.l0;
        c0pif.getClass();
        ArrayList<Aweme> arrayList = new ArrayList();
        for (SearchMixFeed searchMixFeed : list) {
            if (searchMixFeed.getAweme() != null) {
                arrayList.add(searchMixFeed.getAweme());
            } else if (searchMixFeed.getFeedType() == 70) {
                SearchSpot hotSpot = searchMixFeed.getHotSpot();
                if (hotSpot != null && (awemeCards = hotSpot.getAwemeCards()) != null) {
                    arrayList.addAll(awemeCards);
                }
            } else if (searchMixFeed.getFeedType() == 65514) {
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null && (awemeList = dynamicPatch.getAwemeList()) != null) {
                    arrayList.addAll(C13LP.LJJJJLI(awemeList));
                }
            } else if (searchMixFeed.getFeedType() == 65458 && (users = searchMixFeed.getUsers()) != null) {
                Iterator it2 = ((ArrayList) C13LP.LJJJJLI(users)).iterator();
                while (it2.hasNext()) {
                    List<Aweme> list2 = ((SearchUser) it2.next()).awemeCards;
                    if (list2 != null) {
                        arrayList.addAll(C13LP.LJJJJLI(list2));
                    }
                }
            }
        }
        for (Aweme aweme : arrayList) {
            C0PIF.LIZ.getClass();
            if (aweme != null) {
                HashMap<String, String> mobParams = aweme.getMobParams();
                if (mobParams != null) {
                    mobParams.remove("click_times");
                }
                HashMap<String, String> mobParams2 = aweme.getMobParams();
                if (mobParams2 != null) {
                    mobParams2.remove("is_slide");
                }
                HashMap<String, String> mobParams3 = aweme.getMobParams();
                if (mobParams3 != null) {
                    mobParams3.remove("slide_rank");
                }
                C642340PHk.LIZ(aweme);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchDualStreamMobHelper@b2f5.clearDualStreamMobFromAllAwemes$1");
        return unit;
    }

    public static final Object call$4(ACallableS417S0100000_10 aCallableS417S0100000_10) {
        C1C7U.LIZ("DynamicSearchFragment@f924.mobRefreshData$1");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_word", ((DynamicSearchFragment) aCallableS417S0100000_10.l0).dS());
            if (Intrinsics.LJFF(((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJ, "search_history")) {
                ((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJIJIIJIL = "search_history";
            } else if (Intrinsics.LJFF(((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJ, "search_sug")) {
                ((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJIJIIJIL = "search_sug";
            } else {
                ((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJIJIIJIL = "normal_search";
            }
            jSONObject.put("enter_from", ((DynamicSearchFragment) aCallableS417S0100000_10.l0).LLJJIJIIJIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strCS = ((DynamicSearchFragment) aCallableS417S0100000_10.l0).cS();
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("search");
        mobClickObtain.setLabelName(strCS);
        mobClickObtain.setJsonObject(jSONObject);
        C20684815ws.onEvent(mobClickObtain);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSearchFragment@f924.mobRefreshData$1");
        return unit;
    }

    public static final Object call$5(ACallableS417S0100000_10 aCallableS417S0100000_10) {
        View view = (View) aCallableS417S0100000_10.l0;
        C1C7U.LIZ("FeedLiveWindowView@5fa1.initView$1L");
        String strLIZJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZJ(view.getContext(), "pm_following_livecard_live_icon");
        C1C7U.LIZIZ("FeedLiveWindowView@5fa1.initView$1L");
        return strLIZJ;
    }

    public ACallableS417S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
