package X;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.activity.SearchGameActivityCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gift.SearchGameGiftCard;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipEnterFromConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880920z2w extends AbstractC1882430z5N implements InterfaceC1883280z6k {
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final Function1<String, Unit> LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public JSONObject LLJJIJIIJIL;
    public GameStationGameInfo LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C1880930z2x LLJJJJ;

    @Override // X.InterfaceC1883280z6k
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1883280z6k
    public final void LJFF() {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILIIL() {
        String str = this.LLJJIJI;
        if (str != null) {
            InterfaceC1878900yzg interfaceC1878900yzgRemove = C1878910yzh.LIZIZ.LIZ.remove(C1878610yzD.LIZ(str));
            if (interfaceC1878900yzgRemove != null) {
                interfaceC1878900yzgRemove.destroy();
            }
        }
        super.LJIILIIL();
        C1880930z2x c1880930z2x = this.LLJJJJ;
        if (c1880930z2x != null) {
            ((InterfaceC1880780z2i) this.LLJJJ.getValue()).LIZ(c1880930z2x);
            ((InterfaceC1880940z2y) this.LLJJJIL.getValue()).LIZ(c1880930z2x);
        }
        this.LLJJJJ = null;
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLJJJ.getValue());
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLJJJIL.getValue());
    }

    public final void LJJ() {
        GameCTAInfo gameCTAInfo;
        GameCTAInfo gameCTAInfo2;
        try {
            Object objOpt = this.LLJJIJIIJIL.opt("game_info");
            String strValueOf = String.valueOf(objOpt instanceof JSONObject ? (JSONObject) objOpt : null);
            GameStationGameInfo gameStationGameInfo = (GameStationGameInfo) (strValueOf.length() != 0 ? C293501Bt.LIZ().LJIIIIZZ(strValueOf, new TypeToken<GameStationGameInfo>() { // from class: X.0z30
            }.getType()) : null);
            this.LLJJIJIL = gameStationGameInfo;
            if (gameStationGameInfo != null) {
                C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(LJIIIZ()), "game_info", gameStationGameInfo);
                C1882380z5I.LJI(LJII(), "game_name", gameStationGameInfo.name);
                C1882380z5I.LJI(LJII(), "game_id", gameStationGameInfo.idStr);
                C1882380z5I.LJI(LJII(), "game_tag_id", gameStationGameInfo.gameTagId);
                C1882380z5I.LJII(LJIIIIZZ(), C2097608Jq.LJIIIIZZ(new Pair("game_id", C1882380z5I.LJFF(LJII(), "game_id")), new Pair("game_name", C1882380z5I.LJFF(LJII(), "game_name"))));
            }
            GameStationGameInfo gameStationGameInfo2 = this.LLJJIJIL;
            if (gameStationGameInfo2 != null && (gameCTAInfo = gameStationGameInfo2.gameCtaInfo) != null && gameCTAInfo.ctaType == 1) {
                C1882410z5L c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(LJIIIZ());
                GameStationGameInfo gameStationGameInfo3 = this.LLJJIJIL;
                C1882380z5I.LJI(c1882410z5LLJIIIIZZ, "is_registered_user", Boolean.valueOf((gameStationGameInfo3 == null || (gameCTAInfo2 = gameStationGameInfo3.gameCtaInfo) == null || !gameCTAInfo2.isRegisteredUser) ? false : true));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLJJJ.getValue());
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLJJJIL.getValue());
        C1880930z2x c1880930z2x = new C1880930z2x(this);
        this.LLJJJJ = c1880930z2x;
        ((InterfaceC1880780z2i) this.LLJJJ.getValue()).LIZIZ(c1880930z2x);
        ((InterfaceC1880940z2y) this.LLJJJIL.getValue()).LIZIZ(c1880930z2x);
    }

    @Override // X.InterfaceC1883280z6k
    public final void LIZLLL(boolean z) {
        if (z) {
            HandlerHook.viewPost(LJIIIZ().getView(), new Runnable() { // from class: X.0z10
                /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x00ae, PHI: r12
                  0x008e: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:29:0x008c, B:27:0x0089] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00ae, blocks: (B:3:0x0007, B:5:0x0014, B:6:0x0016, B:8:0x0028, B:11:0x002f, B:13:0x0035, B:16:0x0075, B:19:0x007a, B:21:0x007e, B:26:0x0087, B:30:0x008e, B:33:0x0093), top: B:38:0x0007 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[PHI: r12
                  0x0092: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:29:0x008c, B:31:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r17 = this;
                        r0 = r17
                        X.0z2w r2 = r0.LL
                        r2.getClass()
                        org.json.JSONObject r1 = r2.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "attribution_info"
                        java.lang.Object r1 = r1.opt(r0)     // Catch: java.lang.Throwable -> Lae
                        boolean r0 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lae
                        r6 = 0
                        if (r0 == 0) goto L2b
                        org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lae
                    L16:
                        java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lae
                        com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Throwable -> Lae
                        java.lang.Class<com.bytedance.android.livesdk.game.model.GameStationAttributionInfo> r0 = com.bytedance.android.livesdk.game.model.GameStationAttributionInfo.class
                        java.lang.Object r3 = r1.LJII(r3, r0)     // Catch: java.lang.Throwable -> Lae
                        com.bytedance.android.livesdk.game.model.GameStationAttributionInfo r3 = (com.bytedance.android.livesdk.game.model.GameStationAttributionInfo) r3     // Catch: java.lang.Throwable -> Lae
                        if (r3 == 0) goto Lba
                        java.lang.String r0 = r3.viewThroughUrl     // Catch: java.lang.Throwable -> Lae
                        goto L2d
                    L2b:
                        r1 = r6
                        goto L16
                    L2d:
                        if (r0 == 0) goto Lba
                        int r0 = r0.length()     // Catch: java.lang.Throwable -> Lae
                        if (r0 == 0) goto Lba
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "host_id"
                        java.lang.String r9 = X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "task_id"
                        java.lang.String r8 = X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "room_id"
                        java.lang.String r7 = X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "src_id"
                        X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "site_id"
                        X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0z5L r1 = r2.LJII()     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r0 = "enter_from_id"
                        java.lang.String r14 = X.C1882380z5I.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.0X8u r4 = new X.0X8u     // Catch: java.lang.Throwable -> Lae
                        java.lang.String r1 = ""
                        if (r3 == 0) goto L79
                        java.lang.String r5 = r3.viewThroughUrl     // Catch: java.lang.Throwable -> Lae
                        if (r5 != 0) goto L7a
                    L79:
                        r5 = r1
                    L7a:
                        com.bytedance.android.livesdk.game.model.GameStationGameInfo r0 = r2.LLJJIJIL     // Catch: java.lang.Throwable -> Lae
                        if (r0 == 0) goto L82
                        java.lang.String r10 = r0.idStr     // Catch: java.lang.Throwable -> Lae
                        if (r10 != 0) goto L83
                    L82:
                        r10 = r1
                    L83:
                        java.lang.String r11 = ""
                        if (r0 == 0) goto L8b
                        java.lang.String r12 = r0.androidPackage     // Catch: java.lang.Throwable -> Lae
                        if (r12 != 0) goto L8e
                    L8b:
                        r12 = r1
                        if (r0 == 0) goto L92
                    L8e:
                        java.lang.String r13 = r0.name     // Catch: java.lang.Throwable -> Lae
                        if (r13 != 0) goto L93
                    L92:
                        r13 = r1
                    L93:
                        r16 = 4098(0x1002, float:5.743E-42)
                        r15 = r6
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lae
                        X.0z3c r0 = r2.LJIIIZ()     // Catch: java.lang.Throwable -> Lae
                        X.01wk r1 = r0.LJIILL()     // Catch: java.lang.Throwable -> Lae
                        X.0X8x r0 = new X.0X8x     // Catch: java.lang.Throwable -> Lae
                        r0.<init>(r2, r4, r6)     // Catch: java.lang.Throwable -> Lae
                        X.0956 r0 = X.C01KE.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Lae
                        X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lae
                        return
                    Lae:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        X.00Yq r0 = new X.00Yq
                        r0.<init>(r1)
                        X.C189200o6.m2constructorimpl(r0)
                    Lba:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1879720z10.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchEntityCardMixPageHost@5618.onFirstPageFinish$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchEntityCardMixPageHost@5618.onFirstPageFinish$1");
                }
            });
        }
    }

    @Override // X.AbstractC1882430z5N, X.InterfaceC1882450z5P
    public final View LJ(ViewGroup viewGroup) {
        View view = new View(this.LL);
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, 0));
        return view;
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        boolean z2;
        if (C476770Imp.LIZLLL(this.LLJILJILJ) && C476770Imp.LIZLLL(this.LLJILLL)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            LJIJ(C1881030z37.LIZ(-1, "dsl or rawData is invalid"), true);
            return;
        }
        try {
            this.LLJJIJIIJIL = new JSONObject(this.LLJILLL);
            LJJ();
            LJIJ(C1881030z37.LIZIZ(new C1881820z4O(this.LLJILJILJ, this.LLJJIJIIJIL)), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ(C1881030z37.LIZ(-1, C1883500z76.LIZ(e)), true);
        }
    }

    public final void LJIL(String str) {
        String strLIZIZ;
        String strLIZIZ2;
        String string;
        boolean z = !Intrinsics.LJFF(str, this.LLJJIJI);
        this.LLJJIJI = str;
        if (z) {
            String str2 = "";
            if (str != null) {
                C1882380z5I.LJI(LJII(), "source_entrance", "search_entity_card");
                C0KYM c0kymLIZ = C513270KAz.LIZ(str);
                try {
                    String strLIZIZ3 = c0kymLIZ.LIZIZ("source_entrance");
                    if (strLIZIZ3 != null && strLIZIZ3.length() != 0) {
                        C1882380z5I.LJI(LJII(), "source_entrance", strLIZIZ3);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("game_first_scene", "1006");
                    jSONObject.put("game_second_scene", "10060002");
                    jSONObject.put("search_id", this.LLJJI);
                    jSONObject.put("search_result_id", this.LLJJIII);
                    C1882380z5I.LJI(LJII(), "log_extra", URLDecoder.decode(C786410Ut5.J3(jSONObject), "UTF-8"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (objOpt == null || (string = objOpt.toString()) == null) {
                            string = "";
                        }
                        linkedHashMap.put(next, string);
                    }
                    C1882380z5I.LJII(LJIIIIZZ(), linkedHashMap);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                String strLIZIZ4 = c0kymLIZ.LIZIZ("game_tag_name");
                if (strLIZIZ4 == null) {
                    strLIZIZ4 = "";
                }
                GameStationGameInfo gameStationGameInfo = this.LLJJIJIL;
                if ((gameStationGameInfo == null || (strLIZIZ = gameStationGameInfo.gameTagId) == null) && (strLIZIZ = c0kymLIZ.LIZIZ("game_tag_id")) == null) {
                    strLIZIZ = "";
                }
                GameStationGameInfo gameStationGameInfo2 = this.LLJJIJIL;
                if ((gameStationGameInfo2 != null && (strLIZIZ2 = gameStationGameInfo2.idStr) != null) || (strLIZIZ2 = c0kymLIZ.LIZIZ("game_id")) != null) {
                    str2 = strLIZIZ2;
                }
                C1882380z5I.LJII(LJII(), C2097608Jq.LJIIIIZZ(new Pair("game_tag_name", strLIZIZ4), new Pair("game_tag_id", strLIZIZ), new Pair("game_id", str2), new Pair("host_id", c0kymLIZ.LIZIZ("host_id"))));
            }
            HandlerHook.viewPostDelay(LJIIIZ().getView(), new Runnable() { // from class: X.0yzi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    String str3;
                    C1C7U.LIZ("SearchEntityCardMixPageHost@5618.setGameDetailSchema$$inlined$postDelayed$1");
                    try {
                        C1880920z2w c1880920z2w = this.LL;
                        if (!c1880920z2w.LLILZLL && (str3 = c1880920z2w.LLJJIJI) != null && ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).S32() != null) {
                            C1878890yzf.LIZIZ(str3, null);
                            C1878890yzf.LIZJ(str3);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchEntityCardMixPageHost@5618.setGameDetailSchema$$inlined$postDelayed$1");
                }
            }, 250L);
        }
    }

    @Override // X.AbstractC1882430z5N, X.InterfaceC1882450z5P
    public final View LIZIZ(ViewGroup viewGroup, C1883300z6m c1883300z6m) {
        View view = new View(this.LL);
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, 0));
        return view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1882430z5N
    public final void LJIIJ(Object obj, String str) throws Throwable {
        String str2;
        C1884390z8X c1884390z8XV01;
        Function1<String, Unit> function1;
        Function1<String, Unit> function12;
        Function1<String, Unit> function13;
        Function1<String, Unit> function14;
        switch (str.hashCode()) {
            case -1026408916:
                if (str.equals("didClickSearchGameActivityLink") && (function14 = this.LLJJ) != null) {
                    function14.invoke("click_game_info_activity_link");
                    break;
                }
                break;
            case -818855834:
                if (str.equals("didClickSearchGameGiftItem") && (function13 = this.LLJJ) != null) {
                    function13.invoke("click_game_info_gift_item");
                    break;
                }
                break;
            case -394846634:
                if (str.equals("didClickSearchGameInfoBg") && (function12 = this.LLJJ) != null) {
                    function12.invoke("click_game_info_bg");
                    break;
                }
                break;
            case 644656747:
                if (str.equals("didClickSearchGameInfoBtn") && (function1 = this.LLJJ) != null) {
                    function1.invoke("click_game_info_btn");
                    break;
                }
                break;
            case 2023963337:
                if (str.equals("open_game_detail") && (str2 = this.LLJJIJI) != null && (c1884390z8XV01 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01()) != null) {
                    c1884390z8XV01.LIZ(this.LL, str2, C2097608Jq.LJ());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1880920z2w(Context context, Fragment fragment, String str, String str2, Function1<? super String, Unit> function1) {
        super(context, "game_entity_card");
        this.LLJILJILJ = str;
        this.LLJILLL = str2;
        this.LLJJ = function1;
        this.LLJJI = "";
        this.LLJJIII = "";
        this.LLJJIJIIJIL = new JSONObject();
        this.LLJJJ = C452501pT.LIZIZ(new C1881000z34(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C1880980z32(this));
        C1881880z4U c1881880z4ULJI = LJIIIZ().LJI();
        c1881880z4ULJI.LIZIZ("search_game_info_abstract_card", SearchGameInfoCard.class, null);
        c1881880z4ULJI.LIZIZ("search_game_activity_card", SearchGameActivityCard.class, null);
        c1881880z4ULJI.LIZIZ("search_game_gift_card", SearchGameGiftCard.class, null);
        C1882380z5I.LJI(LJII(), "biz_name", "game_entity_card");
        C1882380z5I.LJI(LJII(), Scene.SCENE_SERVICE, 18);
        C1882380z5I.LJI(LJII(), "enter_from", "general_search");
        C1882380z5I.LJI(LJII(), "game_first_scene", "1006");
        C1882380z5I.LJI(LJII(), "game_second_scene", "10060002");
        Integer num = GameLivePartnershipEnterFromConfig.INSTANCE.getConfig().get("general_search");
        C1882380z5I.LJI(LJII(), "enter_from_id", Integer.valueOf((num == null ? Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT) : num).intValue()));
        C1882380z5I.LJII(LJIIIIZZ(), C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1882380z5I.LJFF(LJII(), "enter_from")), new Pair("game_first_scene", "1006"), new Pair("game_second_scene", "10060002")));
        e(fragment);
        LJIIZILJ("didClickSearchGameInfoBg");
        LJIIZILJ("didClickSearchGameInfoBtn");
        LJIIZILJ("didClickSearchGameActivityLink");
        LJIIZILJ("didClickSearchGameGiftItem");
        LJIIZILJ("open_game_detail");
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ = LJIIIZ();
        interfaceC1881340z3cLJIIIZ.LJ(new InterfaceC1882940z6C() { // from class: X.0z2z
            @Override // X.InterfaceC1882940z6C
            public final int LIZ(AbstractC1882890z67 abstractC1882890z67) {
                return 1;
            }
        });
        interfaceC1881340z3cLJIIIZ.LJIIJJI().LJIJI(new Size(-1, -2));
        interfaceC1881340z3cLJIIIZ.LJIJI(this);
    }
}
