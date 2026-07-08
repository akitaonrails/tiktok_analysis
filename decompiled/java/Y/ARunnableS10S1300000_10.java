package Y;

import X.C0QER;
import X.C0QXR;
import X.C0QXS;
import X.C123100dR;
import X.C1233040iBy;
import X.C1507790pL7;
import X.C1942307jB;
import X.C1AF0;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C644660PQi;
import X.C644670PQj;
import X.C644680PQk;
import X.C647350PaH;
import X.C647660Pam;
import X.C649470Pdh;
import X.C650500PfM;
import X.C662390PyX;
import X.C786410Ut5;
import X.C794240VDq;
import X.C823050WQl;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.net.Uri;
import android.util.ArrayMap;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.lynx.core.config.LynxCardsCacheConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS10S1300000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        final String strOptString;
        String strLIZIZ;
        C644680PQk c644680PQk = (C644680PQk) this.l1;
        String str = this.s0;
        JSONObject jSONObject = (JSONObject) this.l2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.l3;
        c644680PQk.getClass();
        if (jSONObject != null) {
            if (linkedHashMap.isEmpty()) {
                AppLogNewUtils.onEventV3(str, jSONObject);
                C794240VDq.LIZJ(str, jSONObject);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                String strLIZIZ2 = "";
                try {
                    strOptString = jSONObject.optString("keyword");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (strOptString == null) {
                    strOptString = "";
                }
                List listLIZ = C647350PaH.LIZ(strOptString);
                String str2 = "";
                String str3 = "";
                long j = 0;
                int i = 0;
                long j2 = 0;
                long j3 = 0;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ArrayMap<Object, C644680PQk> arrayMap = C644680PQk.LJ;
                    String strLIZIZ3 = C647660Pam.LIZIZ((Uri) entry.getKey());
                    if (listLIZ != null && listLIZ.contains(((Uri) entry.getKey()).toString())) {
                        StringBuilder sb4 = c644680PQk.LIZLLL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(',');
                        sbLIZ.append(strLIZIZ3);
                        sb4.append(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C644660PQi c644660PQi = (C644660PQi) entry.getValue();
                    long j4 = c644660PQi.LIZIZ - c644660PQi.LIZ;
                    if (j4 <= 0) {
                        j4 = 0;
                    }
                    boolean z = c644660PQi.LIZLLL;
                    j += j4;
                    String str4 = ((C644660PQi) entry.getValue()).LJFF;
                    if (str4 == null || str4.length() == 0) {
                        strLIZIZ = strLIZIZ3;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ3);
                        sbLIZ2.append('_');
                        sbLIZ2.append(str4);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    if (sb.length() == 0) {
                        sb.append(strLIZIZ);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(',');
                        sbLIZ3.append(strLIZIZ);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (sb2.length() == 0) {
                        sb2.append(((Uri) entry.getKey()).toString());
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("__");
                        sbLIZ4.append(entry.getKey());
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (z) {
                        if (sb3.length() == 0) {
                            sb3.append(strLIZIZ3);
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(',');
                            sbLIZ5.append(strLIZIZ3);
                            sb3.append(C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                    if (j4 > i) {
                        i = (int) j4;
                        j2 = c644660PQi.LIZJ;
                        str2 = strLIZIZ3;
                    }
                    long j5 = c644660PQi.LIZ;
                    if (j5 < jCurrentTimeMillis) {
                        jCurrentTimeMillis = j5;
                    }
                    long j6 = c644660PQi.LIZIZ;
                    if (j6 > j3) {
                        j3 = j6;
                    }
                    str3 = c644660PQi.LJ;
                }
                if (Intrinsics.LJFF(str, "search_trigger_refresh_monitor_v2")) {
                    Keva keva = C647350PaH.LIZ;
                    final String string = sb2.toString();
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0PaL
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SearchLynxCardsCacheHelper@5f37.updateCacheCardsSchema$1");
                            try {
                                Keva keva2 = C647350PaH.LIZ;
                                int iCount = keva2.count();
                                C647420PaO.LIZ.getClass();
                                if (iCount >= ((LynxCardsCacheConfig) C647420PaO.LIZJ.getValue()).maxCacheSize) {
                                    keva2.clear();
                                }
                                String str5 = strOptString;
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("search_lynx_cards_schema");
                                sbLIZ6.append(str5);
                                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
                                if (!a0.LJJJIL(string)) {
                                    keva2.storeStringJustDisk(strLIZIZ4, string);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SearchLynxCardsCacheHelper@5f37.updateCacheCardsSchema$1");
                        }
                    });
                }
                jSONObject.put("lynx_longest_cost", i);
                jSONObject.put("lynx_type_cost_longest", str2);
                jSONObject.put("lynx_res_version", j2);
                jSONObject.put("lynx_cards_type", sb.toString());
                jSONObject.put("lynx_ssr_cards_type", sb3.toString());
                jSONObject.put("lynx_cards_count", linkedHashMap.size());
                jSONObject.put("lynx_cards_client_predict_type", c644680PQk.LIZLLL.toString());
                jSONObject.put("lynx_cards_cache_size", C647350PaH.LIZ.count());
                jSONObject.put("lynx_cards_res_from", str3);
                String strLIZIZ4 = "";
                for (String str5 : (Set) C644670PQj.LIZ.getValue()) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strLIZIZ4);
                    sbLIZ6.append(',');
                    sbLIZ6.append(C649470Pdh.LJ(str5));
                    strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
                }
                String strLIZIZ5 = "";
                for (String str6 : (Set) C644670PQj.LIZJ.getValue()) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(strLIZIZ5);
                    sbLIZ7.append(',');
                    sbLIZ7.append(C649470Pdh.LJ(str6));
                    strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ7);
                }
                for (String str7 : (Set) C644670PQj.LIZIZ.getValue()) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ2);
                    sbLIZ8.append(',');
                    sbLIZ8.append(str7);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                }
                jSONObject.put("lynx_predict_cards_type", strLIZIZ4);
                jSONObject.put("lynx_predict_update_cards_type", strLIZIZ5);
                jSONObject.put("lynx_invalid_predict_cards_type", strLIZIZ2);
                ((Set) C644670PQj.LIZ.getValue()).clear();
                ((Set) C644670PQj.LIZJ.getValue()).clear();
                ((Set) C644670PQj.LIZIZ.getValue()).clear();
                long j7 = j3 - jCurrentTimeMillis;
                if (j7 > 0) {
                    jSONObject.put("lynx_all_draw_cost", j7);
                }
                if (j > 0) {
                    jSONObject.put("lynx_cost_sum", j);
                }
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("lynxLongestCost:");
                sbLIZ9.append(i);
                sbLIZ9.append("\nlynxTypeLongest:");
                sbLIZ9.append(str2);
                sbLIZ9.append("\nlynxCardsType:");
                sbLIZ9.append((Object) sb);
                sbLIZ9.append("\nlynxCardsCount:");
                sbLIZ9.append(Integer.valueOf(linkedHashMap.size()));
                sbLIZ9.append("\nlynx_predict_cards_type:");
                sbLIZ9.append(jSONObject.get("lynx_predict_cards_type"));
                sbLIZ9.append("\nlynxAllDrawCost:");
                sbLIZ9.append(j7);
                C2188811AlT.LIZIZ(sbLIZ9);
                AppLogNewUtils.onEventV3(str, jSONObject);
                C794240VDq.LIZJ(str, jSONObject);
            }
        }
        C644680PQk c644680PQk2 = (C644680PQk) this.l1;
        c644680PQk2.LIZJ().clear();
        c644680PQk2.LIZLLL = new StringBuilder();
        c644680PQk2.LIZIZ = 0;
        C644680PQk.LJ.remove(c644680PQk2.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() throws JSONException {
        C662390PyX.LIZ.getClass();
        ObjectAnimator objectAnimator = C662390PyX.LIZIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        C662390PyX.LIZIZ = null;
        C662390PyX.LJ = false;
        C662390PyX.LIZIZ(0, this.s0);
        C786410Ut5.LJLLLLLL(0, (View) this.l1);
        View view = (View) this.l2;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ((View) this.l1).getLocalVisibleRect((Rect) ((C259800zU) this.l3).element);
        C662390PyX.LIZJ = true;
        if (((Rect) ((C259800zU) this.l3).element).left < 0) {
            C1233040iBy c1233040iBy = new C1233040iBy(GlobalContext.getContext());
            c1233040iBy.LIZIZ(2131834209);
            c1233040iBy.LIZLLL();
        }
    }

    public final void LIZ$2() {
        String enterSearchFrom;
        String enterMethod;
        String keyword;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            SearchResultParam searchResultParam = (SearchResultParam) this.l1;
            Uri uri = (Uri) this.l2;
            String str = this.s0;
            Function1 function1 = (Function1) this.l3;
            Integer numValueOf = null;
            if (searchResultParam != null) {
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                enterSearchFrom = searchEnterParam != null ? searchEnterParam.getEnterSearchFrom() : null;
                numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchResultParam.getSearchEnterParam()));
                if (searchResultParam.getSearchEnterParam().getEcSearchEntranceData() == null) {
                    return;
                }
                enterMethod = searchResultParam.getEnterMethod();
                keyword = searchResultParam.getKeyword();
            } else if (uri != null) {
                C0QXS.LIZ.getClass();
                Integer numLIZIZ = C0QXS.LIZIZ(uri);
                int value = C0QXR.DEFAULT.getValue();
                if (numLIZIZ != null && numLIZIZ.intValue() == value) {
                    return;
                }
                enterSearchFrom = C1942307jB.LIZIZ(uri, "enter_from");
                enterMethod = C1942307jB.LIZIZ(uri, "enter_method");
                keyword = C1942307jB.LIZIZ(uri, "keyword");
            } else {
                enterSearchFrom = "";
                keyword = "";
                enterMethod = "";
            }
            if (C123100dR.LIZ(enterMethod) && enterMethod != null) {
                jSONObject.put("enter_method", enterMethod);
            }
            if (C123100dR.LIZ(enterSearchFrom) && enterSearchFrom != null) {
                jSONObject.put("enter_from", enterSearchFrom);
            }
            if (keyword != null) {
                jSONObject.put("search_keyword", keyword);
            }
            if (numValueOf != null) {
                jSONObject.put("root_enter_from_type", numValueOf.intValue());
            }
            jSONObject.put(Scene.SCENE_SERVICE, str);
            if (function1 != null) {
                function1.invoke(jSONObject);
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_trace", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZIZ();
        }
    }

    public static final void run$0(ARunnableS10S1300000_10 aRunnableS10S1300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("LynxMonitorHelper@9917.checkAndSend$3");
        try {
            aRunnableS10S1300000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxMonitorHelper@9917.checkAndSend$3");
    }

    public static final void run$1(ARunnableS10S1300000_10 aRunnableS10S1300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchUserHelper@7b95.horizontalLoadMore$1$onError$1");
        try {
            aRunnableS10S1300000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchUserHelper@7b95.horizontalLoadMore$1$onError$1");
    }

    public static final void run$2(ARunnableS10S1300000_10 aRunnableS10S1300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcomSearchServiceImpl@2921.reportSearchTrace$1");
        try {
            aRunnableS10S1300000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcomSearchServiceImpl@2921.reportSearchTrace$1");
    }

    public ARunnableS10S1300000_10(C644680PQk c644680PQk, JSONObject jSONObject, LinkedHashMap linkedHashMap, int i) {
        this.$t = i;
        this.l1 = c644680PQk;
        this.s0 = "search_trigger_refresh_monitor_v2";
        this.l2 = jSONObject;
        this.l3 = linkedHashMap;
    }

    public ARunnableS10S1300000_10(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj3;
    }
}
