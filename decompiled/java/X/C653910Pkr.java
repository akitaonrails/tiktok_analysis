package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchMixUserCell;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C653910Pkr implements InterfaceC653950Pkv {
    public final /* synthetic */ SearchMixUserCell LIZ;

    public C653910Pkr(SearchMixUserCell searchMixUserCell) {
        this.LIZ = searchMixUserCell;
    }

    @Override // X.InterfaceC653950Pkv
    public final void LIZ(C653930Pkt c653930Pkt) {
        String keyword;
        String str;
        int iCardType;
        List<SearchUser> list;
        User user = c653930Pkt.LIZIZ;
        SearchResultParam searchResultParam = this.LIZ.LLJJIII;
        if (searchResultParam == null) {
            keyword = "";
        } else {
            keyword = searchResultParam.getKeyword();
        }
        String str2 = c653930Pkt.LJI;
        String uid = user.getUid();
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = this.LIZ.LLILLJJLI;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        if (c650960Pg6LJI == null) {
            str = "";
        } else {
            str = c650960Pg6LJI.searchVideoModel.groupId;
        }
        HashMap map = new HashMap();
        C653660PkS c653660PkS = this.LIZ.LLJILJIL;
        if (c653660PkS != null) {
            map.put("token_type", c653660PkS.LJJLIIIJ);
            map.put("search_result_id", this.LIZ.LLJILJIL.LJJLIIIJILLIZJL);
            map.put("list_item_id", uid);
            map.put("enter_position", "person");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C662440Pyc.LIZ(user));
            sbLIZ.append("");
            map.put("relation_tag", C2188811AlT.LIZIZ(sbLIZ));
            Integer num = this.LIZ.LLJILJIL.LJIILLIIL;
            if (num != null) {
                map.put("universal_rank", num.toString());
            }
        }
        String str3 = "1";
        if (c653930Pkt.LJIIIZ != null) {
            map.put("is_entity", "1");
            map.put("entity_type", c653930Pkt.LJIIIZ);
        }
        View view2 = c653930Pkt.LIZ;
        int i = c653930Pkt.LIZLLL;
        String requestId = user.getRequestId();
        String uid2 = user.getUid();
        int i2 = this.LIZ.LLJJJIL;
        String str4 = c653930Pkt.LJ;
        HashMap map2 = new HashMap();
        if (TextUtils.equals(str2, "aladdin_card")) {
            map2.put("list_item_id", uid2);
        }
        C653440Pk6.LIZ(i2, view2, uid2, map2);
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = C663370Q0h.LIZ(3);
        c735410St1.LJJLIL = requestId;
        c735410St1.LJJLIIIJJI = 0;
        c735410St1.LJIIJ = String.valueOf(i2);
        c735410St1.LJJLIIJ = uid2;
        c735410St1.LJLJLLL = str4;
        c735410St1.LJLLLLLL = str;
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        if (mapLIZJ.containsKey("search_result_id")) {
            map.put("search_result_id", mapLIZJ.get("search_result_id"));
        }
        c735410St1.LIZIZ(map);
        C663370Q0h.LIZJ(i, keyword, requestId, c735410St1, 3, str2);
        C663370Q0h.LJFF(3, requestId, uid2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ.LL, "aweme://user/profile/");
        Object obj = map.get("universal_rank");
        if (obj == null) {
            obj = "";
        }
        String str5 = c653930Pkt.LIZJ;
        if (str5 != null) {
            smartRouteBuildRoute.withParam("source_btm_token", str5);
        }
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", "general_search");
        smartRouteBuildRoute.withParam("previous_page", "general_search");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "general_search");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "general_search");
        smartRouteBuildRoute.withParam("enter_from_request_id", user.getRequestId());
        smartRouteBuildRoute.withParam("extra_previous_page_position", "main_head");
        smartRouteBuildRoute.withParam("enter_method", str2);
        SearchMixUserCell searchMixUserCell = this.LIZ;
        String uid3 = user.getUid();
        C645320PSw c645320PSw = searchMixUserCell.LLJJIJIL;
        if (c645320PSw != null && (list = c645320PSw.LLILLJJLI) != null) {
            for (SearchUser searchUser : list) {
                if (TextUtils.equals(searchUser.user.getUid(), uid3)) {
                    iCardType = searchUser.cardType();
                    break;
                }
            }
            iCardType = 0;
        } else {
            iCardType = 0;
        }
        smartRouteBuildRoute.withParam("general_search_card_type", iCardType);
        smartRouteBuildRoute.withParam("search_request_id", user.getRequestId());
        if (!c653930Pkt.LJII) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        smartRouteBuildRoute.withParam("sticky_content", str3);
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("rfevent_previous_page", this.LIZ.LLJJIII.getSearchEnterFromPage());
        c2241008qG.LIZ.put("universal_rank", obj);
        smartRouteBuildRoute.withParam("trackParams", C786410Ut5.J3(c2241008qG.LJ()));
        if (!TextUtils.isEmpty(c653930Pkt.LJFF)) {
            smartRouteBuildRoute.withParam("from_scene", c653930Pkt.LJFF);
        }
        C0QER c0qerLJJLJ = C1ER1.LIZIZ.LJJLJ();
        if (c0qerLJJLJ != null && c0qerLJJLJ.getSourcePage() != null) {
            smartRouteBuildRoute.withParam("source_page", c0qerLJJLJ.getSourcePage());
        }
        smartRouteBuildRoute.open(74499320, new OnActivityResultCallback() { // from class: X.0Pkn
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i3, int i4, Intent intent) {
                C653910Pkr c653910Pkr = this.LL;
                c653910Pkr.getClass();
                if (((Number) C1840807Iw.LIZ.getValue()).intValue() != 0) {
                    SearchMixUserCell searchMixUserCell2 = c653910Pkr.LIZ;
                    if (searchMixUserCell2.LLJJJJJIL) {
                        C0PUV.LIZIZ(null, searchMixUserCell2.LLILLJJLI, searchMixUserCell2.LLJILJIL, EnumC645610PTz.USER_DETAIL, true, searchMixUserCell2.LIZIZ());
                        c653910Pkr.LIZ.LLJJJJJIL = false;
                    }
                }
            }
        });
        if (C07F4.LIZ() && !c653930Pkt.LJIIJ) {
            if (((Number) C1840807Iw.LIZ.getValue()).intValue() != 0) {
                C0PUV.LIZ(this.LIZ.LLILLJJLI);
                this.LIZ.LLJJJJJIL = true;
            } else {
                SearchMixUserCell searchMixUserCell2 = this.LIZ;
                C0PUV.LIZIZ(null, searchMixUserCell2.LLILLJJLI, searchMixUserCell2.LLJILJIL, EnumC645610PTz.USER_DETAIL, true, searchMixUserCell2.LIZIZ());
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ.LL);
        if (c19egLIZIZ != null) {
            ((SurveyViewModel) C679340Qkm.LIZIZ(this.LIZ.LLJJIJIIJIL, c19egLIZIZ).get(SurveyViewModel.class)).LLILLL.postValue(Boolean.TRUE);
        }
    }
}
