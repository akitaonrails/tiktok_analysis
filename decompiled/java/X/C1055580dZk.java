package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideComponent;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.experiments.ContentLiveSpecificCheckSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055580dZk {
    public static void LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Double d;
        String str;
        ContentLiveSpecificCheckSettings.Config config = (ContentLiveSpecificCheckSettings.Config) ContentLiveSpecificCheckSettings.LIZIZ.getValue();
        if (!config.enable || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        String packageName = awemeRawAd.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (openUrl == null) {
            openUrl = "";
        }
        List listLIZ = LIZ(C13LP.LLIIII(config.targets.keySet()), packageName, openUrl);
        if (listLIZ.isEmpty()) {
            return;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        FeatureCenterModel feature = awemeRawAd.getFeature();
        Double d2 = null;
        if (feature != null) {
            d = feature.pctr;
        } else {
            d = null;
        }
        FeatureCenterModel feature2 = awemeRawAd.getFeature();
        if (feature2 != null) {
            d2 = feature2.pcvr;
        }
        for (Object obj : listLIZ) {
            EcVideoGuideComponent.LLJLIL.put((String) obj, aid);
            if (d != null) {
                EcVideoGuideComponent.LLJLILLLLZIIL.put((String) obj, d);
            } else {
                EcVideoGuideComponent.LLJLILLLLZIIL.remove(obj);
            }
            if (d2 != null) {
                EcVideoGuideComponent.LLJLL.put((String) obj, d2);
            } else {
                EcVideoGuideComponent.LLJLL.remove(obj);
            }
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("url", openUrl);
            pairArr[1] = new Pair("vid", aid);
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_UID, curUserId);
            pairArr[3] = new Pair("target", obj);
            EcVideoGuideComponent.LLJJLIIIJLLLLLLLZ.getClass();
            InterfaceC1603190roz.LJJIJIIJI.getClass();
            if (!C0SPD.LIZ()) {
                str = "";
            } else {
                str = "homepage";
            }
            pairArr[4] = new Pair("page", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (d != null) {
                mapLJIIJ.put("pctr", Double.valueOf(d.doubleValue()));
            }
            if (d2 != null) {
                mapLJIIJ.put("pcvr", Double.valueOf(d2.doubleValue()));
            }
            try {
                C1018703yb.LJ("rd_tiktokec_content_live_specific_show_event", mapLJIIJ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static List LIZ(List list, String... strArr) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        List listLJJII = C09RB.LJJII(new C08LY(C09RB.LJIIIZ(C13LQ.LJIIJJI(strArr), AnonymousClass0207.get$arr$(32)), AnonymousClass0207.get$arr$(33)));
        if (listLJJII.isEmpty()) {
            return C13BV.INSTANCE;
        }
        return C09RB.LJJII(C09RB.LJI(C09RB.LJIIIZ(C09RB.LJIIIZ(new C08LY(new C1939607ik(list), AnonymousClass0207.get$arr$(30)), AnonymousClass0207.get$arr$(31)), new C5183020f(listLJJII, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 135))));
    }

    public static void LIZJ(List list, JSONObject jSONObject) {
        String str;
        String strOptString = jSONObject.optString("app_url", "");
        String strOptString2 = jSONObject.optString("open_url", "");
        List listLIZ = LIZ(list, strOptString, strOptString2);
        if (listLIZ.isEmpty()) {
            return;
        }
        if (a0.LJJJIL(strOptString)) {
            strOptString = strOptString2;
        }
        String strOptString3 = jSONObject.optString("is_app_installed", "");
        for (Object obj : listLIZ) {
            String str2 = EcVideoGuideComponent.LLJLIL.get(obj);
            if (str2 == null) {
                str2 = "";
            }
            Double d = EcVideoGuideComponent.LLJLILLLLZIIL.get(obj);
            Double d2 = EcVideoGuideComponent.LLJLL.get(obj);
            EcVideoGuideComponent.LLJJLIIIJLLLLLLLZ.getClass();
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("url", strOptString);
            pairArr[1] = new Pair("vid", str2);
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_UID, curUserId);
            pairArr[3] = new Pair("installed", strOptString3);
            pairArr[4] = new Pair("target", obj);
            InterfaceC1603190roz.LJJIJIIJI.getClass();
            if (!C0SPD.LIZ()) {
                str = "";
            } else {
                str = "homepage";
            }
            pairArr[5] = new Pair("page", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (d != null) {
                mapLJIIJ.put("pctr", Double.valueOf(d.doubleValue()));
            }
            if (d2 != null) {
                mapLJIIJ.put("pcvr", Double.valueOf(d2.doubleValue()));
            }
            try {
                C1018703yb.LJ("rd_tiktokec_content_live_specific_click_event", mapLJIIJ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, String str, Map map) {
        String strOptString;
        boolean z;
        Object c098200Yq;
        Object obj = null;
        if (map == null || (strOptString = (String) map.get(str)) == null) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString(str, null);
            } else {
                strOptString = null;
            }
        }
        if (strOptString != null && !a0.LJJJIL(strOptString)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                c098200Yq = new JSONObject(strOptString);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (JSONObject) obj;
        }
        return jSONObject;
    }
}
