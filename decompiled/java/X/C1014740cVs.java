package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014740cVs {
    public static final void LIZ(boolean z, String str, AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA) {
        String str2;
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        String refer = anoleComponentModel.getRefer();
        if (refer == null) {
            refer = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("load_success", str2);
        linkedHashMap.put("load_status", str);
        c1015450cX1.getClass();
        C1015450cX1.LJIIJ("anole_hybrid_load_status", "anole_ad", refer, anoleComponentModel, c1009340cNA, linkedHashMap);
    }

    public static final void LIZJ(C1014730cVr c1014730cVr, boolean z, AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, Boolean bool) {
        String string;
        AwemeRawAd awemeRawAd;
        String str;
        if (!C298290Bmd.LIZ()) {
            return;
        }
        AbstractC1014880cW6 abstractC1014880cW6 = c1014730cVr.LLJLL;
        C1014980cWG c1014980cWG = C1014980cWG.LIZ;
        if (!Intrinsics.LJFF(abstractC1014880cW6, c1014980cWG) && !Intrinsics.LJFF(c1014730cVr.LLJLL, C1014990cWH.LIZ)) {
            c1014730cVr.LLJLL = c1014980cWG;
            c1014730cVr.LLJLLIL = System.currentTimeMillis();
            C1015400cWw c1015400cWw = C1015400cWw.LIZ;
            Long creativeId = c1009340cNA.LIZLLL.getCreativeId();
            if (creativeId == null || (string = creativeId.toString()) == null) {
                string = "";
            }
            String str2 = anoleComponentModel.type;
            c1015400cWw.getClass();
            C1015400cWw.LIZ(string, str2).renderStage = "render_start";
            C1015290cWl c1015290cWlLJJ = c1014730cVr.LJJ();
            Object obj = c1015290cWlLJJ.getProvidedContexts().get(AwemeRawAd.class);
            String str3 = null;
            if (obj instanceof AwemeRawAd) {
                awemeRawAd = (AwemeRawAd) obj;
            } else {
                awemeRawAd = null;
            }
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str3 = c1014490cVTLIZ.LIZ;
                str = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275921E6k.LIZ.getClass();
            c1015290cWlLJJ.logAd(C2275921E6k.LIZIZ, new C2275941E6m(anoleComponentModel, c1015290cWlLJJ, bool, str3, str, z, awemeRawAd));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleHybridTrackMonitor real render() return ,cause is rendering or success ,renderStatus = ");
        sbLIZ.append(c1014730cVr.LLJLL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(C1014730cVr c1014730cVr, boolean z, String str, String str2, AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, Map<String, Object> map) {
        Object obj;
        String str3;
        Object obj2;
        Long l;
        Object obj3;
        String str4;
        AwemeRawAd awemeRawAd;
        String str5;
        String string;
        if (!C298290Bmd.LIZ()) {
            return;
        }
        c1014730cVr.LLJLLL = System.currentTimeMillis();
        if (Intrinsics.LJFF(c1014730cVr.LLJLL, C1014990cWH.LIZ)) {
            C1015400cWw c1015400cWw = C1015400cWw.LIZ;
            Long creativeId = c1009340cNA.LIZLLL.getCreativeId();
            if (creativeId == null || (string = creativeId.toString()) == null) {
                string = "";
            }
            String str6 = anoleComponentModel.type;
            c1015400cWw.getClass();
            C1015400cWw.LIZ(string, str6).renderStage = "render_result";
        }
        C1015290cWl c1015290cWlLJJ = c1014730cVr.LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long j = c1014730cVr.LLJLLL - c1014730cVr.LLJLLIL;
        String str7 = null;
        if (map != null) {
            obj = map.get("render_fail_reason");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        if (map != null) {
            obj2 = map.get("render_times");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Long) {
            l = (Long) obj2;
        } else {
            l = null;
        }
        if (map != null) {
            obj3 = map.get("render_reason");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str4 = (String) obj3;
        } else {
            str4 = null;
        }
        Object obj4 = c1015290cWlLJJ.getProvidedContexts().get(AwemeRawAd.class);
        if (obj4 instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj4;
        } else {
            awemeRawAd = null;
        }
        C1014250cV5.LIZ.getClass();
        C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
        if (c1014490cVTLIZ != null) {
            str5 = c1014490cVTLIZ.LIZ;
            str7 = c1014490cVTLIZ.LIZIZ;
        } else {
            str5 = null;
        }
        C2275921E6k.LIZ.getClass();
        c1015290cWlLJJ.logAd(C2275921E6k.LIZJ, new C2275951E6n(anoleComponentModel, c1015290cWlLJJ, str5, str7, str3, z, l, str4, j, strLIZIZ, awemeRawAd));
    }
}
