package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671510QVp implements InterfaceC736910SvR<InterfaceC673410QbD> {
    public final C671360QVa LL = new InterfaceC673410QbD() { // from class: X.0QVa
        @Override // X.InterfaceC673410QbD
        public final ListenableFuture LJIJI() throws JSONException {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "request_banner");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_middle", jSONObject);
            EcSuggestWordsApi.LIZ.getClass();
            HashMap map = new HashMap();
            map.put("enable_banner", "1");
            map.put("page_name", "middle_page");
            return ((EcSuggestWordsApi.SuggestApi) EcSuggestWordsApi.LIZJ.getValue()).fetchCouponRequestData(map);
        }

        public static void LJLZ(C671380QVc c671380QVc, C0QER c0qer, boolean z) {
            ECSearchEntranceData ecSearchEntranceData;
            if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("entrance_hint_word_in_top_once") && z) {
                c671380QVc.LJFF = c0qer.getSearchHint();
            }
        }

        @Override // X.InterfaceC673410QbD
        public final void LLLLLILLIL(C0QWJ c0qwj, String str, boolean z) {
            ECSearchEntranceData ecSearchEntranceData;
            C0QER c0qer = c0qwj.LIZ;
            if (c0qer != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            C672200QYg.LJFF(str, ecSearchEntranceData, z);
        }

        @Override // X.InterfaceC673410QbD
        public final List<SearchHistory> LLLIL(C0QER c0qer, boolean z, C0QWI c0qwi, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility) {
            int intStrategy;
            ECSearchEntranceData ecSearchEntranceData;
            List<SearchHistory> listLL;
            boolean zKF2;
            ECSearchEntranceData ecSearchEntranceData2;
            boolean zKF22;
            if (c0qwi != null) {
                if (iSearchSuggestSubPageAbility != null) {
                    zKF22 = iSearchSuggestSubPageAbility.KF2();
                } else {
                    zKF22 = false;
                }
                c0qwi.LJ("history", "request", true, z, zKF22, null, null, false, false, null);
            }
            if (c0qer != null && (ecSearchEntranceData2 = c0qer.getEcSearchEntranceData()) != null) {
                intStrategy = ecSearchEntranceData2.getIntStrategy("history_max_count");
            } else {
                intStrategy = 20;
            }
            ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
            if (c0qer != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            List<SearchHistory> listLJIIL = iSearchService.C(ecSearchEntranceData).LJIIL(0);
            if (listLJIIL == null || (listLL = C13LP.LL(listLJIIL, intStrategy)) == null) {
                listLL = C13BV.INSTANCE;
            }
            if (c0qwi != null) {
                if (iSearchSuggestSubPageAbility != null) {
                    zKF2 = iSearchSuggestSubPageAbility.KF2();
                } else {
                    zKF2 = false;
                }
                c0qwi.LJ("history", "response_success", true, z, zKF2, Integer.valueOf(listLL.size()), null, false, false, null);
            }
            return listLL;
        }

        @Override // X.InterfaceC673410QbD
        public final String LLLFZ(C0QWJ c0qwj, boolean z, boolean z2, C0QWI c0qwi, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility) {
            ECSearchEntranceData ecSearchEntranceData;
            boolean zKF2;
            if (c0qwi != null) {
                if (iSearchSuggestSubPageAbility != null) {
                    zKF2 = iSearchSuggestSubPageAbility.KF2();
                } else {
                    zKF2 = false;
                }
                c0qwi.LJ("guess", "request", true, z2, zKF2, null, null, false, false, null);
            }
            C0QER c0qer = c0qwj.LIZ;
            if (c0qer != null) {
                ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData = null;
            }
            return C672200QYg.LIZLLL(ecSearchEntranceData, z);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(63:0|2|(3:4|(1:6)(1:22)|7)|8|(1:10)(1:21)|11|(1:15)|(1:17)|18|(5:142|23|26|(1:28)|29)(1:30)|31|(3:33|(1:35)(1:123)|36)|(1:38)(1:122)|39|(1:45)|46|(1:48)(1:121)|49|(1:55)|56|(1:60)|61|(1:65)|66|(1:68)|69|(37:71|(1:73)|74|(1:76)(1:118)|77|(1:79)(1:117)|80|(1:82)(1:116)|83|(1:85)(1:115)|86|(1:88)(1:114)|89|(1:91)(1:113)|92|(1:96)|97|(1:99)(1:112)|100|(1:102)(1:111)|103|(1:105)(1:110)|106|(1:108)|109|144|124|(1:126)(1:127)|128|(1:130)|131|134|(1:136)|137|(1:139)|140|141)(1:119)|120|74|(0)(0)|77|(0)(0)|80|(0)(0)|83|(0)(0)|86|(0)(0)|89|(0)(0)|92|(2:94|96)(0)|97|(0)(0)|100|(0)(0)|103|(0)(0)|106|(0)|109|144|124|(0)(0)|128|(0)|131|134|(0)|137|(0)|140|141) */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x020f, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x0210, code lost:
        
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
            r3 = new X.C098200Yq(r1);
            X.C189200o6.m2constructorimpl(r3);
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0202 A[Catch: all -> 0x020f, TryCatch #1 {all -> 0x020f, blocks: (B:124:0x01ed, B:128:0x01fb, B:130:0x0202, B:131:0x0207), top: B:144:0x01ed }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x015f  */
        @Override // X.InterfaceC673410QbD
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.common.util.concurrent.ListenableFuture LJLLLLLL(X.C0QER r48, boolean r49, java.lang.String r50, X.C0QWI r51, boolean r52, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r53, java.lang.Integer r54, java.lang.Integer r55, boolean r56, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility r57, java.lang.String r58) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 704
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C671360QVa.LJLLLLLL(X.0QER, boolean, java.lang.String, X.0QWI, boolean, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew, java.lang.Integer, java.lang.Integer, boolean, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
        }

        @Override // X.InterfaceC673410QbD
        public final Object LJJL(C0QER c0qer, boolean z, String str, C0QWI c0qwi, boolean z2, ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew, Integer num, Integer num2, boolean z3, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility, String str2, InterfaceC1364105Vn interfaceC1364105Vn) throws JSONException {
            String groupId;
            boolean z4;
            Object c098200Yq;
            String strLIZJ;
            int value;
            String stringStrategy;
            String groupId2;
            String stringStrategy2;
            String srcMaterialId;
            String srcAnchorProductId;
            C671460QVk c671460QVkQF0;
            Integer num3;
            String str3;
            String str4;
            String str5;
            Integer num4;
            Long l;
            String str6;
            String refreshTime;
            String roomId;
            String ecUserActions;
            ECSearchEntranceData ecSearchEntranceData;
            ECSearchEntranceData ecSearchEntranceData2;
            C669560QOc c669560QOcBk2;
            boolean zKF2;
            String str7 = str;
            if (c0qwi != null) {
                if (iSearchSuggestSubPageAbility != null) {
                    zKF2 = iSearchSuggestSubPageAbility.KF2();
                } else {
                    zKF2 = false;
                }
                c0qwi.LJ("guess", "request", false, z3, zKF2, null, null, false, false, null);
            }
            EcIntermediatePreload.Companion.getClass();
            EcIntermediatePreload.hasPreloading = false;
            String authorId = null;
            if (c0qer != null) {
                groupId = c0qer.getGroupId();
            } else {
                groupId = null;
            }
            C673320Qb4.LIZ.getClass();
            C673400QbC c673400QbC = C673320Qb4.LIZIZ;
            if (c673400QbC != null) {
                z4 = c673400QbC.LJ;
            } else {
                z4 = false;
            }
            if (!z4) {
                C673320Qb4.LJIILL();
            }
            if (c0qwi != null) {
                c0qwi.LIZJ();
            }
            if (c0qwi != null) {
                C0QWI.LIZLLL(c0qwi, "guess", "request", CardStruct.IStatusCode.DEFAULT);
            }
            int i = C670290QQx.LJIJ;
            System.currentTimeMillis();
            String strLIZIZ = C848530XQl.LIZIZ(C848530XQl.LIZ, null, "{}");
            if (strLIZIZ != null) {
                try {
                    c098200Yq = new JSONObject(strLIZIZ).optString("traffic_diversion_info");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                strLIZJ = (String) c098200Yq;
            } else {
                strLIZJ = null;
            }
            if (C1202604nA.LIZ()) {
                C0QVZ c0qvz = C0QVZ.LIZ;
                if (iSearchSuggestContextAbilityNew != null) {
                    c669560QOcBk2 = iSearchSuggestContextAbilityNew.Bk2();
                } else {
                    c669560QOcBk2 = null;
                }
                c0qvz.getClass();
                strLIZJ = C0QVZ.LIZJ(c669560QOcBk2);
            }
            if (c0qer != null) {
                value = c0qer.getEcSearchEntranceValue();
            } else {
                value = C0QXR.DEFAULT.getValue();
            }
            C0QVZ.LIZ.getClass();
            String strLIZIZ2 = C0QVZ.LIZIZ(false, z2, z, str2, iSearchSuggestContextAbilityNew);
            EcSuggestWordsApi ecSuggestWordsApi = EcSuggestWordsApi.LIZ;
            C671380QVc c671380QVc = new C671380QVc();
            if (c0qer == null || (ecSearchEntranceData2 = c0qer.getEcSearchEntranceData()) == null || (stringStrategy = ecSearchEntranceData2.getStringStrategy("middle_guess_business_id")) == null) {
                stringStrategy = "100011";
            }
            c671380QVc.LIZ = stringStrategy;
            if (c0qer != null) {
                groupId2 = c0qer.getGroupId();
            } else {
                groupId2 = null;
            }
            c671380QVc.LIZIZ = groupId2;
            c671380QVc.LIZLLL = C2286608xc.LJ(C293280BeY.LIZ(AFwS196S0000000_10.get$arr$(671), AFwS196S0000000_10.get$arr$(672)));
            String str8 = "";
            if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (stringStrategy2 = ecSearchEntranceData.getStringStrategy("middle_req_source")) == null) {
                stringStrategy2 = "";
            }
            c671380QVc.LJ = stringStrategy2;
            LJLZ(c671380QVc, c0qer, z2);
            if (c0qer == null || (srcMaterialId = c0qer.getSrcMaterialId()) == null) {
                srcMaterialId = "";
            }
            c671380QVc.LJIILJJIL = srcMaterialId;
            if (c0qer == null || (srcAnchorProductId = c0qer.getSrcAnchorProductId()) == null) {
                srcAnchorProductId = "";
            }
            c671380QVc.LJIJJLI = srcAnchorProductId;
            if (str7 == null) {
                str7 = "";
            }
            c671380QVc.LJIL = str7;
            if (iSearchSuggestContextAbilityNew != null) {
                c671460QVkQF0 = iSearchSuggestContextAbilityNew.QF0(groupId);
            } else {
                c671460QVkQF0 = null;
            }
            if (c671460QVkQF0 != null) {
                num3 = c671460QVkQF0.backFromSearch;
            } else {
                num3 = null;
            }
            c671380QVc.LJIIL = num3;
            if (c671460QVkQF0 != null) {
                str3 = c671460QVkQF0.lastSuggestWords;
            } else {
                str3 = null;
            }
            c671380QVc.LJIILIIL = str3;
            if (c671460QVkQF0 != null) {
                str4 = c671460QVkQF0.lastSearchSource;
            } else {
                str4 = null;
            }
            c671380QVc.LJIIIIZZ = str4;
            if (c671460QVkQF0 != null) {
                str5 = c671460QVkQF0.lastGroupId;
            } else {
                str5 = null;
            }
            c671380QVc.LJIIIZ = str5;
            if (c671460QVkQF0 != null) {
                num4 = c671460QVkQF0.hasEffectiveClick;
            } else {
                num4 = null;
            }
            c671380QVc.LJIIJ = num4;
            if (c671460QVkQF0 != null) {
                l = c671460QVkQF0.totalPlayTime;
            } else {
                l = null;
            }
            c671380QVc.LJIIJJI = l;
            if (c671460QVkQF0 != null) {
                str6 = c671460QVkQF0.lastSearchQuery;
            } else {
                str6 = null;
            }
            c671380QVc.LJII = str6;
            if (c0qer != null && (ecUserActions = c0qer.getEcUserActions()) != null) {
                str8 = ecUserActions;
            }
            c671380QVc.LJJI = str8;
            if (c0qer != null) {
                refreshTime = c0qer.getRefreshTime();
            } else {
                refreshTime = null;
            }
            c671380QVc.LJJIII = refreshTime;
            if (c0qer != null) {
                roomId = c0qer.getRoomId();
            } else {
                roomId = null;
            }
            c671380QVc.LJJIFFI = roomId;
            if (c0qer != null) {
                authorId = c0qer.getAuthorId();
            }
            c671380QVc.LJJII = authorId;
            c671380QVc.LJJIIJ = z;
            C672650QZz.LIZ.getClass();
            c671380QVc.LJJIIJZLJL = C672650QZz.LIZLLL(c0qer, "middle_guess_api_params");
            c671380QVc.LJJIIZ = num;
            c671380QVc.LJJIIZI = num2;
            c671380QVc.LJJIJIIJI = strLIZJ;
            c671380QVc.LJJIJIIJIL = C2286608xc.LJ(value);
            c671380QVc.LJJIJIL = C2286608xc.LJ(z2 ? 1 : 0);
            c671380QVc.LJJIJL = strLIZIZ2;
            ecSuggestWordsApi.getClass();
            return EcSuggestWordsApi.LIZ(c671380QVc, interfaceC1364105Vn);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
