package X;

import android.view.View;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchLiveStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655800Pnu implements InterfaceC663110Pzh {
    public final C658480PsE LL;
    public long LLILLJJLI = -1;
    public long LLILLL;
    public long LLILZ;

    @Override // X.InterfaceC663110Pzh
    public final void LIZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJI(int i, int i2, View view) {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJJZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void onBind() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void onLoading() {
    }

    public final LiveRoomStruct LIZJ() {
        Aweme aweme = this.LL.LJI;
        if (aweme != null) {
            return AwemeExtKt.getNewLiveRoomDataExt(aweme);
        }
        return null;
    }

    @Override // X.InterfaceC663110Pzh
    public final void onDestroy() {
        this.LLILLL = 0L;
    }

    @Override // X.InterfaceC663110Pzh
    public final void onInit() {
        this.LLILLL = 0L;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJ() {
        this.LLILLJJLI = System.currentTimeMillis();
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJII() throws JSONException {
        this.LLILLL = System.currentTimeMillis();
        if (this.LLILLJJLI >= 0) {
            this.LLILLJJLI = -1L;
        }
        C653660PkS c653660PkS = this.LL.LJII;
        if (c653660PkS == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_type", "search_live");
        jSONObject.put("did_play", true);
        jSONObject.put("first_play_time", this.LLILLL);
        jSONObject.put("enter_method", c653660PkS.LJIIIZ);
        jSONObject.put("enter_from", c653660PkS.LJIIIIZZ);
        jSONObject.put("search_type", c653660PkS.LIZLLL);
        AppLogNewUtils.onEventV3("search_live_perf_event", jSONObject);
    }

    @Override // X.InterfaceC663110Pzh
    public final void onPause() {
        C653660PkS c653660PkS;
        Object uid;
        User user;
        String aid;
        LiveRoomStruct newLiveRoomDataExt;
        HashMap<String, String> mobParams;
        String str;
        HashMap<String, String> mobParams2;
        String str2;
        HashMap<String, String> mobParams3;
        String str3;
        Map<String, String> mapInvoke;
        SearchExtraStruct searchExtraStruct;
        SearchLiveStruct searchLiveStruct;
        LiveRoomStruct liveRoomStructLIZJ = LIZJ();
        if (liveRoomStructLIZJ == null || !liveRoomStructLIZJ.isFinish()) {
            C658480PsE c658480PsE = this.LL;
            if (c658480PsE.LJIIIZ && this.LLILLL > 0 && this.LLILZ > 0 && (c653660PkS = c658480PsE.LJII) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C655850Pnz<C655830Pnx> c655850Pnz = new C655850Pnz<C655830Pnx>() { // from class: X.0Pnx
                };
                c655850Pnz.LJIIZILJ("enter_from_merge", c653660PkS.LJIIIIZZ);
                c655850Pnz.LJIIZILJ("enter_method", c653660PkS.LJIIIZ);
                LiveRoomStruct liveRoomStructLIZJ2 = LIZJ();
                if (liveRoomStructLIZJ2 != null) {
                    uid = Long.valueOf(liveRoomStructLIZJ2.ownerUserId);
                } else {
                    LiveRoomStruct liveRoomStructLIZJ3 = LIZJ();
                    uid = (liveRoomStructLIZJ3 == null || (user = liveRoomStructLIZJ3.owner) == null) ? null : user.getUid();
                }
                c655850Pnz.LJIIZILJ("anchor_id", String.valueOf(uid));
                LiveRoomStruct liveRoomStructLIZJ4 = LIZJ();
                c655850Pnz.LJIIZILJ("room_id", String.valueOf(liveRoomStructLIZJ4 != null ? Long.valueOf(liveRoomStructLIZJ4.id) : null));
                c655850Pnz.LJIIZILJ("action_type", "click");
                c655850Pnz.LJIIZILJ("request_id", c653660PkS.LJIIJJI);
                c655850Pnz.LJIIZILJ("duration", String.valueOf(Long.valueOf(jCurrentTimeMillis - this.LLILZ)));
                c655850Pnz.LJIIZILJ("search_id", c653660PkS.LJIIJ);
                c655850Pnz.LJIIZILJ("search_keyword", c653660PkS.LJFF);
                c655850Pnz.LJIIZILJ("search_type", c653660PkS.LIZLLL);
                c655850Pnz.LJIJI("search_result_id", c653660PkS.LJIJI);
                Aweme aweme = this.LL.LJI;
                c655850Pnz.LJIIZILJ("follow_status", String.valueOf(aweme != null ? Integer.valueOf(AwemeExtKt.getFollowStatus(aweme)) : null));
                c655850Pnz.LJIILLIIL.putAll(c653660PkS.LJJJJJL);
                LiveRoomStruct liveRoomStructLIZJ5 = LIZJ();
                c655850Pnz.LJIIZILJ("list_item_id", String.valueOf(liveRoomStructLIZJ5 != null ? Long.valueOf(liveRoomStructLIZJ5.id) : null));
                c655850Pnz.LJIIZILJ("first_frame_time", String.valueOf(this.LLILLL - this.LLILZ));
                Aweme aweme2 = this.LL.LJI;
                c655850Pnz.LJIIZILJ("cover_type", (aweme2 == null || (searchExtraStruct = aweme2.getSearchExtraStruct()) == null || (searchLiveStruct = searchExtraStruct.getSearchLiveStruct()) == null) ? null : searchLiveStruct.liveCoverType);
                Aweme aweme3 = this.LL.LJI;
                c655850Pnz.LJIIZILJ("live_screen_type", C486810J7f.LIZIZ(aweme3 != null ? AwemeExtKt.getNewLiveRoomDataExt(aweme3) : null) ? "vertical" : "horizontal");
                Aweme aweme4 = this.LL.LJI;
                c655850Pnz.LJ("is_ad", aweme4 != null && aweme4.isAd() ? "1" : CardStruct.IStatusCode.DEFAULT);
                Aweme aweme5 = this.LL.LJI;
                c655850Pnz.LJ("is_ecom", (aweme5 == null || !aweme5.getIsLiveHasProduct()) ? CardStruct.IStatusCode.DEFAULT : "1");
                Function0<? extends Map<String, String>> function0 = this.LL.LJIIL;
                if (function0 != null && (mapInvoke = function0.invoke()) != null) {
                    c655850Pnz.LJIILLIIL.putAll(mapInvoke);
                }
                Aweme aweme6 = this.LL.LJI;
                if (aweme6 != null && C0PI4.LJ(aweme6)) {
                    Aweme aweme7 = this.LL.LJI;
                    if (aweme7 != null && (mobParams3 = aweme7.getMobParams()) != null && (str3 = mobParams3.get("is_inner")) != null) {
                        c655850Pnz.LJIIZILJ("is_inner", str3);
                    }
                    Aweme aweme8 = this.LL.LJI;
                    if (aweme8 != null && (mobParams2 = aweme8.getMobParams()) != null && (str2 = mobParams2.get("inner_search_id")) != null) {
                        c655850Pnz.LJIIZILJ("inner_search_id", str2);
                    }
                    Aweme aweme9 = this.LL.LJI;
                    if (aweme9 != null && (mobParams = aweme9.getMobParams()) != null && (str = mobParams.get("rank_inner")) != null) {
                        c655850Pnz.LJIIZILJ("rank_inner", str);
                    }
                    c655850Pnz.LJIIZILJ("is_slide", CardStruct.IStatusCode.DEFAULT);
                    c655850Pnz.LJIIZILJ("slide_rank", CardStruct.IStatusCode.DEFAULT);
                }
                Aweme aweme10 = this.LL.LJI;
                if (aweme10 != null && (aid = aweme10.getAid()) != null) {
                    C2252051DCp c2252051DCp = C2252051DCp.LIZ;
                    EnumC2252111DCv enumC2252111DCv = EnumC2252111DCv.LIVE_WINDOW_DURATION;
                    HashMap<String, String> map = c655850Pnz.LJIILLIIL;
                    c2252051DCp.getClass();
                    C2252051DCp.LJIIJ(enumC2252111DCv, "general_search", aid, map);
                    EnumC2252111DCv enumC2252111DCv2 = EnumC2252111DCv.LIVE_ROOM_USER_COUNT;
                    Aweme aweme11 = this.LL.LJI;
                    C2252051DCp.LJIIJJI(enumC2252111DCv2, "", Long.valueOf((aweme11 == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme11)) == null) ? -1L : newLiveRoomDataExt.user_count), "general_search", aid);
                }
                c655850Pnz.LJIILJJIL();
            }
            this.LLILLL = 0L;
        }
    }

    public C655800Pnu(C658480PsE c658480PsE) {
        this.LL = c658480PsE;
    }

    @Override // X.InterfaceC663110Pzh
    public final void onError(String str) {
        this.LLILLL = 0L;
    }
}
