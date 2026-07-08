package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixNetCacheConfig;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881590z41 extends AbstractC1882430z5N {
    public final C1881760z4I LLJILJILJ;
    public GameStationGameInfo LLJILLL;
    public List<BriefBenefitInfo> LLJJ;
    public GameDetailHeaderInfo LLJJI;
    public GameStationAttributionInfo LLJJIII;
    public volatile RawGameDetailHomeResponse$ResponseData LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final GameDetailMixPageBaseFragment LLJJIJIL;
    public JSONObject LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public Size LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final int LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final MutableLiveData<Boolean> LLJLL;
    public boolean LLJLLIL;
    public Boolean LLJLLL;
    public final MutableLiveData<Boolean> LLJZ;
    public final C01GW LLJZIJLIL;
    public C1881610z43 LLL;
    public final List<Function0<Unit>> LLLF;
    public final C1881670z49 LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public AnonymousClass0956 LLLI;
    public AnonymousClass0956 LLLII;
    public boolean LLLIIII;

    @Override // X.AbstractC1882430z5N
    public final void LJIIJJI(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
    }

    public final JSONObject LJIL() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", C1882380z5I.LJFF(LJII(), "enter_from"));
        jSONObject.put("item_id", C1882380z5I.LJFF(LJII(), "item_id"));
        jSONObject.put("game_id", C1882380z5I.LJFF(LJII(), "game_id"));
        jSONObject.put("creator_id", C1882380z5I.LJFF(LJII(), "author_id"));
        jSONObject.put("task_id", C1882380z5I.LJFF(LJII(), "task_id"));
        return jSONObject;
    }

    public final C0KYM LJJI() {
        return (C0KYM) this.LLJLILLLLZIIL.getValue();
    }

    public final void LJJIII() {
        JSONObject jSONObject;
        try {
            Object objOpt = this.LLJJJ.opt("common");
            Unit unit = null;
            if ((objOpt instanceof JSONObject) && (jSONObject = (JSONObject) objOpt) != null) {
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object map2 = jSONObject.get(next);
                    if (map2 instanceof JSONArray) {
                        map2 = C119700ct.LIZ((JSONArray) map2);
                    } else if (map2 instanceof JSONObject) {
                        map2 = JsonExtKt.toMap((JSONObject) map2);
                    }
                    map.put(next, map2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    C1882380z5I.LJI(LJII(), (String) entry.getKey(), entry.getValue());
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJIIJ() {
        JSONObject jSONObject;
        try {
            Object objOpt = this.LLJJJ.opt("attribution_info");
            String strJ3 = null;
            if ((objOpt instanceof JSONObject) && (jSONObject = (JSONObject) objOpt) != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            this.LLJJIII = (GameStationAttributionInfo) C293501Bt.LIZ().LJII(strJ3, GameStationAttributionInfo.class);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJIIJZLJL() {
        String str;
        GameCTAInfo gameCTAInfo;
        GameCTAInfo gameCTAInfo2;
        String str2;
        try {
            Object objOpt = this.LLJJJ.opt("game_info");
            String strValueOf = String.valueOf(objOpt instanceof JSONObject ? (JSONObject) objOpt : null);
            boolean z = false;
            GameStationGameInfo gameStationGameInfo = (GameStationGameInfo) (strValueOf.length() != 0 ? C293501Bt.LIZ().LJIIIIZZ(strValueOf, new TypeToken<GameStationGameInfo>() { // from class: X.0z4H
            }.getType()) : null);
            this.LLJILLL = gameStationGameInfo;
            if (gameStationGameInfo != null) {
                C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(LJIIIZ()), "game_info", gameStationGameInfo);
            }
            C1882410z5L c1882410z5LLJII = LJII();
            GameStationGameInfo gameStationGameInfo2 = this.LLJILLL;
            String str3 = "";
            if (gameStationGameInfo2 == null || (str = gameStationGameInfo2.name) == null) {
                str = "";
            }
            C1882380z5I.LJI(c1882410z5LLJII, "game_name", str);
            C1882410z5L c1882410z5LLJIIIIZZ = LJIIIIZZ();
            GameStationGameInfo gameStationGameInfo3 = this.LLJILLL;
            if (gameStationGameInfo3 != null && (str2 = gameStationGameInfo3.name) != null) {
                str3 = str2;
            }
            C1882380z5I.LJI(c1882410z5LLJIIIIZZ, "game_name", str3);
            GameStationGameInfo gameStationGameInfo4 = this.LLJILLL;
            if (gameStationGameInfo4 != null && (gameCTAInfo = gameStationGameInfo4.gameCtaInfo) != null && gameCTAInfo.ctaType == 1) {
                C1882410z5L c1882410z5LLJIIIIZZ2 = C1882380z5I.LJIIIIZZ(LJIIIZ());
                GameStationGameInfo gameStationGameInfo5 = this.LLJILLL;
                if (gameStationGameInfo5 != null && (gameCTAInfo2 = gameStationGameInfo5.gameCtaInfo) != null && gameCTAInfo2.isRegisteredUser) {
                    z = true;
                }
                C1882380z5I.LJI(c1882410z5LLJIIIIZZ2, "is_registered_user", Boolean.valueOf(z));
            }
            C1882380z5I.LJI(LJIIIIZZ(), "page_type", C1880070z1Z.LIZIZ(LJIIIZ(), this.LLJILLL));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJIIZ() {
        JSONObject jSONObject;
        String strJ3;
        try {
            Object objOpt = this.LLJJJ.opt("game_detail_header_info");
            GameDetailHeaderInfo gameDetailHeaderInfo = (GameDetailHeaderInfo) ((!(objOpt instanceof JSONObject) || (jSONObject = (JSONObject) objOpt) == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null || strJ3.length() == 0) ? null : C293501Bt.LIZ().LJIIIIZZ(strJ3, new TypeToken<GameDetailHeaderInfo>() { // from class: X.0z4L
            }.getType()));
            this.LLJJI = gameDetailHeaderInfo;
            C1882380z5I.LJI(LJIIIIZZ(), "is_second_floor_activity", Intrinsics.LJFF(gameDetailHeaderInfo != null ? C1884670z8z.LIZ(gameDetailHeaderInfo) : null, "interactive_full_screen") ? "1" : CardStruct.IStatusCode.DEFAULT);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJIIZI() {
        try {
            Object objOpt = this.LLJJJ.opt("reward_list");
            String strValueOf = String.valueOf(objOpt instanceof JSONArray ? (JSONArray) objOpt : null);
            List<BriefBenefitInfo> list = (List) (strValueOf.length() != 0 ? C293501Bt.LIZ().LJIIIIZZ(strValueOf, new TypeToken<List<? extends BriefBenefitInfo>>() { // from class: X.0z4B
            }.getType()) : null);
            this.LLJJ = list;
            int size = list != null ? list.size() : 0;
            C1882410z5L c1882410z5LLJIIIIZZ = LJIIIIZZ();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("benefits_cnt", String.valueOf(size));
            pairArr[1] = new Pair("is_contain_benefit", size > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
            C1882380z5I.LJII(c1882410z5LLJIIIIZZ, C2097608Jq.LJIIIIZZ(pairArr));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILIIL() {
        C1883340z6q c1883340z6qLJIILJJIL;
        InterfaceC1881720z4E interfaceC1881720z4E;
        super.LJIILIIL();
        Iterator it2 = ((HashSet) this.LLJJL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) it2.next()).dispose();
        }
        if (!GameLivePartnershipMixNetCacheConfig.INSTANCE.getConfig().enable.contains(Integer.valueOf(this.LLJLIL))) {
            InterfaceC1878900yzg interfaceC1878900yzgRemove = C1878910yzh.LIZIZ.LIZ.remove(this.LLJJJIL.getValue());
            if (interfaceC1878900yzgRemove != null) {
                interfaceC1878900yzgRemove.destroy();
            }
        }
        if (this.LLJLIL == 2 || this.LLJJIJIIJIL) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryChangeShortVideoPlayingStatus(Boolean.TRUE);
        }
        C1881610z43 c1881610z43 = this.LLL;
        if (c1881610z43 != null) {
            ((InterfaceC1880780z2i) this.LLLFFI.getValue()).LIZ(c1881610z43);
            ((InterfaceC1880940z2y) this.LLLFZ.getValue()).LIZ(c1881610z43);
        }
        this.LLL = null;
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880290z1v.class, this.LLLFF);
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLLFFI.getValue());
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLLFZ.getValue());
        C1881950z4b c1881950z4b = (C1881950z4b) this.LLJZIJLIL.getValue();
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ = LJIIIZ();
        if (interfaceC1881340z3cLJIIIZ != null && (c1883340z6qLJIILJJIL = interfaceC1881340z3cLJIIIZ.LJIILJJIL()) != null && (interfaceC1881720z4E = (InterfaceC1881720z4E) c1883340z6qLJIILJJIL.LIZ(InterfaceC1881720z4E.class)) != null) {
            interfaceC1881720z4E.LIZLLL(GameDetailPageApi.class, c1881950z4b);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLI = null;
        AnonymousClass0956 anonymousClass09562 = this.LLLII;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLLII = null;
    }

    public final C1883550z7B LJJ() {
        List<InterfaceC1883040z6M> list = LJIIIZ().LJIIJJI().LLILZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C1883550z7B) {
                arrayList.add(obj);
            }
        }
        return (C1883550z7B) C13LP.LJJJLL(arrayList);
    }

    @Override // X.AbstractC1882430z5N, X.InterfaceC1882450z5P
    public final View LJ(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gme, viewGroup, false);
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJLIIIJLLLLLLLZ = true;
            C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881600z42(this, null), 2);
        }
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
        String str;
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LLJJIJIL;
        if (gameDetailMixPageBaseFragment != null) {
            gameDetailMixPageBaseFragment.show(fragmentManager, "GameDetailMixPageHost");
            if (C0IXW.LIZLLL(C475510Ikn.LJ(gameDetailMixPageBaseFragment))) {
                str = "ad";
            } else {
                str = "normal";
            }
            C1882380z5I.LJII(LJIIIIZZ(), C2097908Jt.LIZJ(new Pair("traffic_source", str)));
        }
        if (this.LLJLIL != 2) {
            this.LLJJIJIIJIL = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryChangeShortVideoPlayingStatus(Boolean.FALSE);
        }
        LJIIZILJ("try_expand_page");
        LJIIZILJ("didClickDownloadBtn");
        LJIIZILJ("__mix_base_jump_tab_by_class");
        LJIIZILJ("__mix_base_tab_bottom_sheet_btn_show");
        LJIIZILJ("on_tab_sticky_exit");
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880290z1v.class, this.LLLFF);
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLLFFI.getValue());
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLLFZ.getValue());
        C1881610z43 c1881610z43 = new C1881610z43(this);
        this.LLL = c1881610z43;
        ((InterfaceC1880780z2i) this.LLLFFI.getValue()).LIZIZ(c1881610z43);
        ((InterfaceC1880940z2y) this.LLLFZ.getValue()).LIZIZ(c1881610z43);
    }

    public final void LJJIFFI(RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData) {
        try {
            LJJIII();
            LJJIIZ();
            LJJIIJ();
            LJJIIJZLJL();
            LJJIIZI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameDetailMixPageHost", "parseRespDataJson error", e);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        LJJIJ(null);
        this.LLJLL.postValue(Boolean.TRUE);
        String str = rawGameDetailHomeResponse$ResponseData.dsl;
        if (str == null) {
            str = "";
        }
        LJIJ(C1881030z37.LIZIZ(new C1881820z4O(str, this.LLJJJ)), false);
        if (!this.LLLIIII) {
            this.LLLIIII = true;
            C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1879770z15(this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:63:0x016b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881590z41.LJJII(X.05Vn):java.lang.Object");
    }

    public final void LJJIJ(List<MixTabModel> list) {
        Object next;
        C1883550z7B c1883550z7B;
        List<C1883100z6S> list2;
        if (this.LLJL) {
            return;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<MixTabModel> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().tabName;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            C1882380z5I.LJI(LJIIIIZZ(), "all_tab_name", C13LP.LJJLIIIJ(C13LP.LJLLLL(String.CASE_INSENSITIVE_ORDER, arrayList), ",", null, null, 0, null, null, 62));
            this.LLJL = true;
            return;
        }
        Iterator it3 = ((ArrayList) LJIIIZ().LJIIJJI().LLILZ).iterator();
        do {
            next = null;
            if (!it3.hasNext()) {
                break;
            } else {
                next = it3.next();
            }
        } while (!(next instanceof C1883550z7B));
        InterfaceC1883040z6M interfaceC1883040z6M = (InterfaceC1883040z6M) next;
        if (interfaceC1883040z6M != null && (interfaceC1883040z6M instanceof C1883550z7B) && (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) != null && (list2 = c1883550z7B.LLJJJIL) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it4 = ((ArrayList) list2).iterator();
            while (it4.hasNext()) {
                String str2 = ((C1883100z6S) it4.next()).LLILLL.tabName;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(str2);
            }
            C1882380z5I.LJI(LJIIIIZZ(), "all_tab_name", C13LP.LJJLIIIJ(C13LP.LJLLLL(String.CASE_INSENSITIVE_ORDER, arrayList2), ",", null, null, 0, null, null, 62));
            this.LLJL = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06c3  */
    /* JADX WARN: Type inference failed for: r0v172, types: [X.0z49] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0z47] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1881590z41(android.content.Context r34, X.C1881760z4I r35) {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881590z41.<init>(android.content.Context, X.0z4I):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1882430z5N
    public final void LJIIJ(Object obj, String str) {
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment;
        View view;
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment2;
        Integer num;
        List<C1883100z6S> list;
        C1883100z6S c1883100z6S;
        C1882420z5M c1882420z5MLIZLLL;
        switch (str.hashCode()) {
            case -1892469334:
                if (str.equals("on_tab_sticky_exit") && (gameDetailMixPageBaseFragment = this.LLJJIJIL) != null && (view = gameDetailMixPageBaseFragment.getView()) != null) {
                    C476770Imp.LIZJ(view, new Runnable() { // from class: X.0z7o
                        public final void LIZ() {
                            InterfaceC1883030z6L interfaceC1883030z6L;
                            LynxView lynxView;
                            UISimpleView uISimpleView;
                            C1883550z7B c1883550z7BLJJ = this.LL.LJJ();
                            if (c1883550z7BLJJ != null) {
                                int iLJIIL = c1883550z7BLJJ.LJIIL();
                                int i = 0;
                                for (Object obj2 : (ArrayList) c1883550z7BLJJ.LLJJJIL) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                    C1883100z6S c1883100z6S2 = (C1883100z6S) obj2;
                                    if (iLJIIL != i && (interfaceC1883030z6L = (InterfaceC1883030z6L) C13LP.LJJJLZIJ(0, c1883100z6S2.LLJILJIL)) != null && (interfaceC1883030z6L instanceof MixSparkCard)) {
                                        MixSparkCard mixSparkCard = (MixSparkCard) interfaceC1883030z6L;
                                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL = mixSparkCard.LJJJJLL(mixSparkCard.LLILZLL);
                                        Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL.getKitView() : null;
                                        if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                                            LynxBaseUI lynxBaseUIFindUIByName = lynxView.findUIByName("partnership_nested_scroll_view");
                                            if ((lynxBaseUIFindUIByName instanceof UISimpleView) && (uISimpleView = (UISimpleView) lynxBaseUIFindUIByName) != null) {
                                                if (uISimpleView instanceof UIList) {
                                                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                                                    javaOnlyMap.put("position", 0);
                                                    ((UIList) uISimpleView).scrollToPosition(javaOnlyMap, new C0PMN());
                                                } else if (uISimpleView instanceof UIListContainer) {
                                                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                                                    javaOnlyMap2.put("position", 0);
                                                    ((UIListContainer) uISimpleView).scrollToPosition(javaOnlyMap2, new Callback() { // from class: X.0z7p
                                                        @Override // com.lynx.react.bridge.Callback
                                                        public final void invoke(Object[] objArr) {
                                                        }
                                                    });
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("lynxNestedScrollView =");
                                                sbLIZ.append(uISimpleView);
                                                C20441214yg.LIZIZ("GameDetailMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameDetailMixPageHost@9f5f.handleEvent$3");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.handleEvent$3");
                        }
                    });
                    break;
                }
                break;
            case -1650943829:
                if (str.equals("didClickDownloadBtn") && (gameStationGameInfo = this.LLJILLL) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null) {
                    InterfaceC1880940z2y interfaceC1880940z2y = (InterfaceC1880940z2y) this.LLLFZ.getValue();
                    InterfaceC1880710z2b.LIZ.getClass();
                    interfaceC1880940z2y.LJII(new C1880150z1h(gameCTAInfo, 5), new C1879840z1C(this), new C1879850z1D(this));
                    break;
                }
                break;
            case -1478780768:
                if (str.equals("__mix_base_jump_tab_by_class") && (gameDetailMixPageBaseFragment2 = this.LLJJIJIL) != null) {
                    gameDetailMixPageBaseFragment2.LLJJIII = true;
                    break;
                }
                break;
            case -923423600:
                if (str.equals("try_expand_page")) {
                    Boolean bool = this.LLJLLL;
                    Boolean bool2 = Boolean.TRUE;
                    if (!Intrinsics.LJFF(bool, bool2)) {
                        this.LLJZ.postValue(bool2);
                    }
                }
                break;
            case -576526465:
                if (str.equals("__mix_base_tab_bottom_sheet_btn_show")) {
                    C1882410z5L c1882410z5LLJIIIIZZ = null;
                    if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                        int iIntValue = num.intValue();
                        C1883550z7B c1883550z7BLJJ = LJJ();
                        if (c1883550z7BLJJ != null && (list = c1883550z7BLJJ.LLJJJIL) != null && (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(iIntValue, list)) != null && Intrinsics.LJFF(c1883100z6S.LLILLL.tabClass, "videos")) {
                            InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ = LJIIIZ();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_post_video_button_show");
                            if (interfaceC1881340z3cLJIIIZ != null) {
                                c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3cLJIIIZ);
                            } else {
                                c1882420z5MLIZLLL = null;
                            }
                            c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                            c474500IjALIZ.LJJII("videos", "tab_name");
                            if (interfaceC1881340z3cLJIIIZ != null) {
                                c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(interfaceC1881340z3cLJIIIZ);
                            }
                            String strLJFF = C1882380z5I.LJFF(c1882410z5LLJIIIIZZ, "sub_tab_name");
                            if (strLJFF == null) {
                                strLJFF = "";
                            }
                            c474500IjALIZ.LJJII(strLJFF, "sub_tab_name");
                            c474500IjALIZ.LIZ();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
