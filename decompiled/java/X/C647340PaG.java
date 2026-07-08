package X;

import Y.ARunnableS4S2100000_10;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.search.lynx.core.config.LynxCardsCacheConfig;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647340PaG {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final long LJ;
    public final TemplateData LJFF;
    public final String LJI;
    public final int LJII;

    public C647340PaG() {
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        this.LJI = "";
    }

    public C647340PaG(Map<String, ? extends Object> map) throws JSONException {
        Object c098200Yq;
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        this.LJI = "";
        this.LJ = System.currentTimeMillis();
        if (C0BQ3.LIZ()) {
            try {
                c098200Yq = C1741890vQh.LJIIIIZZ(map);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String str = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            String str2 = str != null ? str : "";
            this.LJI = str2;
            this.LJFF = TemplateData.LJIIIIZZ(str2);
            this.LJII = str2.length();
            return;
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            this.LIZ.put((String) entry.getKey(), entry.getValue());
        }
    }

    public final void LIZ(C1537480q70 c1537480q70) {
        ISearchContextAbility iSearchContextAbility;
        boolean z;
        int iIntValue;
        String str;
        if (c1537480q70 != null && (iSearchContextAbility = (ISearchContextAbility) c1537480q70.LJFF(ISearchContextAbility.class)) != null) {
            C663990Q2r c663990Q2r = (C663990Q2r) iSearchContextAbility.Ww1().LIZJ();
            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
            C0PM7 c0pm7 = (C0PM7) iSearchContextAbility.ak0().LIZJ();
            C0Q39 c0q39 = (C0Q39) iSearchContextAbility.P70().LIZJ();
            C646670PYb c646670PYb = (C646670PYb) iSearchContextAbility.Jh0().LIZJ();
            C0PM7 c0pm72 = (C0PM7) iSearchContextAbility.pR().LIZJ();
            C647460PaS c647460PaS = (C647460PaS) iSearchContextAbility.gX().LIZJ();
            String str2 = c0prc.LLIZLLLIL;
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str2 = c646670PYb.LLILZIL;
            }
            try {
                JSONObject jSONObject = this.LIZJ;
                jSONObject.put("searchKeyword", str2);
                jSONObject.put("enterFrom", c0prc.LIZIZ());
                jSONObject.put("searchId", c0prc.LLILLL);
                jSONObject.put("searchType", c0prc.LLILLJJLI);
                C644490PPr.LIZ.getClass();
                jSONObject.put("preSearchId", C644490PPr.LIZIZ);
                jSONObject.put("enterMethod", c0prc.LLJLL);
                jSONObject.put("searchSessionId", c0pm7.LL);
                jSONObject.put("endToEndSearchSessionId", String.valueOf(c0pm7.LLILLJJLI));
                C0PZA c0pza = C0PZA.LIZ;
                String str3 = c0prc.LLJLL;
                C0PSX c0psx = c0prc.LLJLIL;
                c0pza.getClass();
                jSONObject.put("switchTabType", C0PZA.LIZ(str3, c0psx));
                jSONObject.put("searchEntrance", c663990Q2r.LL);
                jSONObject.put("enterFromSub", c663990Q2r.LLILLJJLI);
                jSONObject.put("dynamicTabImprId", ((C639820P7s) iSearchContextAbility.Wa0().LIZJ()).LL);
                jSONObject.put("searchTypePosition", c0prc.LL);
                if (Intrinsics.LJFF(c0prc.LLJLL, "switch_tab")) {
                    int i = ((C0PRF) iSearchContextAbility.Wg1().LIZJ()).LLILLL;
                    jSONObject.put("fromSearchSubtabPosition", i);
                    jSONObject.put(C665110Q6z.LIZ("from_search_subtab"), C0PSI.LJFF(i));
                }
                jSONObject.put("lastFromGroupId", c0q39.LLILLJJLI);
                jSONObject.put("rank", c646370PWx.LLILZLL);
                Integer num = c646370PWx.LLJILJIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                jSONObject.put("universalRank", iIntValue);
                String str4 = c646370PWx.LLIZLLLIL;
                if (str4.length() == 0) {
                    str4 = c0prc.LLJLLIL;
                }
                jSONObject.put("logPb", str4);
                jSONObject.put("docId", c646370PWx.LLJ);
                jSONObject.put("isPreload", c646370PWx.LLJI);
                if (!jSONObject.has("lynxBindTime")) {
                    jSONObject.put("lynxBindTime", c646370PWx.LLJILLL);
                }
                String str5 = c0pm72.LLILZLL;
                if (str5 != null) {
                    jSONObject.put("inspire_id", str5);
                }
                jSONObject.put("hasTopBar", c0prc.LLIZ);
                INetwork iNetwork = (INetwork) C647490PaV.LIZ.getValue();
                if (iNetwork != null) {
                    long jLIZIZ = iNetwork.LIZIZ();
                    if (jLIZIZ > 0) {
                        jSONObject.put("serverTimestamp", jLIZIZ);
                    }
                }
                if (C1111904Wn.LIZ() && (str = c647460PaS.LLILZIL) != null && str.length() > 0) {
                    jSONObject.put("ls_attribution_params", str);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final TemplateData LIZIZ(final String str) throws JSONException {
        TemplateData templateDataLJIIIIZZ;
        if (C0BQ3.LIZ()) {
            templateDataLJIIIIZZ = this.LJFF;
            if (templateDataLJIIIIZZ == null) {
                templateDataLJIIIIZZ = new TemplateData();
            }
            templateDataLJIIIIZZ.LJIJJ(C051S.LIZJ(this.LIZIZ));
            templateDataLJIIIIZZ.LJIJJ(C051S.LIZJ(this.LIZJ));
            templateDataLJIIIIZZ.LJIJJ(C051S.LIZJ(this.LIZLLL));
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("serverData", this.LIZ);
            jSONObject.put("nativeData", this.LIZIZ);
            jSONObject.put("logExtra", this.LIZJ);
            jSONObject.put("storageData", this.LIZLLL);
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(C786410Ut5.J3(jSONObject));
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
        Keva keva = C647350PaH.LIZ;
        String str2 = this.LJI;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 1346);
        if (str != null && !a0.LJJJIL(str) && !TextUtils.isEmpty(str2) && C647350PaH.LIZJ(str)) {
            C647420PaO.LIZ.getClass();
            if (((LynxCardsCacheConfig) C647420PaO.LIZJ.getValue()).enableCacheData) {
                C823050WQl.LIZIZ().execute(new ARunnableS4S2100000_10(awS554S0100000_10, str, str2, 0));
            }
        }
        if (((Number) C270860AjU.LIZ.getValue()).intValue() == 1) {
            if (this.LJ % ((long) 20) == 0) {
                C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0PaI
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchSparkTemplateDataProtocol$Builder@b7b3.build$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchSparkTemplateDataProtocol$Builder@b7b3.build$2");
                    }

                    public final void LIZ() {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        int length = C0BQ3.LIZ() ? this.LL.LJII : C786410Ut5.J3(this.LL.LIZ).length();
                        int length2 = C786410Ut5.J3(this.LL.LIZIZ).length();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        long j = jCurrentTimeMillis;
                        String str3 = str;
                        c2344009Gk.LIZLLL(j, "cost");
                        c2344009Gk.LIZLLL(jCurrentTimeMillis3, "to_string_duration");
                        c2344009Gk.LIZJ(length, "server_data_size");
                        c2344009Gk.LIZJ(length2, "native_data_size");
                        c2344009Gk.LIZJ(length + length2, "total_size");
                        c2344009Gk.LJFF("card_type", C649470Pdh.LJ(str3));
                        C20684815ws.LJIILLIIL("search_lynx_template_data", c2344009Gk.LIZ);
                    }
                });
            }
            return templateDataLJIIIIZZ;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "cost");
        c2344009Gk.LJFF("card_type", C649470Pdh.LJ(str));
        C20684815ws.LJIILLIIL("search_lynx_template_data", c2344009Gk.LIZ);
        return templateDataLJIIIIZZ;
    }

    public C647340PaG(String str) {
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        this.LJI = "";
        this.LJ = System.currentTimeMillis();
        if (C0BQ3.LIZ()) {
            this.LJI = str;
            this.LJFF = TemplateData.LJIIIIZZ(str);
            this.LJII = str.length();
        } else if (TextUtils.isEmpty(str)) {
            this.LIZ = new JSONObject();
        } else {
            this.LIZ = new JSONObject(str);
        }
    }

    public C647340PaG(TemplateData templateData) {
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        this.LJI = "";
        this.LJFF = templateData;
    }

    public final void LIZJ(boolean z, Map map, boolean z2) throws JSONException {
        Object c098200Yq;
        if (map != null && (r5 = map.entrySet().iterator()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!z || !C647380PaK.LJIIIIZZ.LIZJ.contains(str)) {
                    if (!z2 || !C647380PaK.LJIIIIZZ.LIZLLL.contains(str)) {
                        if (C647380PaK.LJIIIIZZ.LJ.contains(str) || ((Number) C270940Ajc.LIZ.getValue()).intValue() == 1) {
                            if (value instanceof List) {
                                try {
                                    c098200Yq = this.LIZIZ.put(str, new JSONArray((Collection) value));
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    C1AF0.LIZJ("Error converting list type");
                                }
                                C189200o6.m1boximpl(c098200Yq);
                            } else {
                                this.LIZIZ.put(str, value);
                            }
                        }
                        C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
                        if (c647380PaK.LJFF.contains(str)) {
                            this.LIZJ.put(str, value);
                        }
                        if (c647380PaK.LJI.contains(str)) {
                            this.LIZIZ.put(str, value);
                        }
                    }
                }
            }
        }
    }
}
