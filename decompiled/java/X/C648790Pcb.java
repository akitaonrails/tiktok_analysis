package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648790Pcb extends AbstractC648060PbQ implements InterfaceC648800Pcc, InterfaceC663700Q1o, InterfaceC647940PbE {
    public static int LLILZIL = 10;
    public final List<String> LLILLJJLI;
    public final C01GW LLILLL;
    public String LLILZ;

    public C648790Pcb(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        ((ArrayList) ((C647920PbC) c647830Pb3.LJIIL.getValue()).LIZ).add(this);
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = C452501pT.LIZIZ(new AwS411S0200000_10(c647830Pb3, this, 80));
    }

    @Override // X.InterfaceC663700Q1o
    public final boolean LIZIZ(JSONObject jSONObject) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("search_extra");
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString("video_from");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString, "from_search_continuous_loading_card")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC647940PbE
    public final void LIZJ(C1051660dTQ c1051660dTQ) {
        c1051660dTQ.LIZJ(InterfaceC663700Q1o.class, this);
    }

    @Override // X.InterfaceC648800Pcc
    public final void LIZLLL(Aweme aweme, String str) throws JSONException {
        ContinuousLoadingAwemeList continuousLoadingAwemeListLIZJ;
        List<Aweme> list;
        List listLIZLLL;
        if (!TextUtils.equals(aweme.getAid(), this.LLILZ)) {
            C647830Pb3 c647830Pb3 = this.LL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scroll_aweme_id", aweme.getAid());
            jSONObject.put("cid", AwemeBizExtKt.getChallengeId(aweme));
            C653460Pk8 c653460Pk8 = (C653460Pk8) this.LLILLL.getValue();
            if (c653460Pk8 != null && Intrinsics.LJFF(str, "from_search_continuous_loading_card")) {
                C737030Svd c737030Svd = new C737030Svd(21);
                c737030Svd.LIZLLL = str;
                AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(jSONObject, 110);
                if ((Intrinsics.LJFF(c737030Svd.LIZLLL, "from_search_continuous_loading_card") || Intrinsics.LJFF(c737030Svd.LIZLLL, "from_search_continuous_play_card")) && (continuousLoadingAwemeListLIZJ = c653460Pk8.LIZJ()) != null && (list = continuousLoadingAwemeListLIZJ.awemeList) != null) {
                    if (c653460Pk8.LIZIZ.LIZJ(aweme)) {
                        listLIZLLL = null;
                    } else {
                        listLIZLLL = c653460Pk8.LIZLLL(aweme, list);
                    }
                    awS624S0100000_10.invoke(aweme, listLIZLLL);
                }
            }
            c647830Pb3.LIZ("updateVideoCloseState", jSONObject);
        }
        Iterator it2 = ((Map) C648810Pcd.LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Reference) entry.getValue()).get() == this || ((Reference) entry.getValue()).get() == null) {
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC663700Q1o
    public final boolean LIZ(JSONObject jSONObject, Bundle bundle, Bundle bundle2) throws Throwable {
        Integer numValueOf;
        String strOptString;
        SparkContext sparkContext;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C647830Pb3 c647830Pb3 = this.LL;
        Fragment fragment = c647830Pb3.LIZ;
        C19EG c19eg = c647830Pb3.LIZJ;
        sAFHelper.getClass();
        Integer numLJJIJIL = SAFHelper.LJJIJIL(fragment, c19eg);
        if (numLJJIJIL != null) {
            numLJJIJIL.intValue();
            ((Map) C648810Pcd.LIZIZ.getValue()).put(numLJJIJIL, new WeakReference(this));
        }
        this.LLILZ = jSONObject.optString("current_item_id");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("item_ids");
        int length = jSONArrayOptJSONArray.length();
        ((ArrayList) this.LLILLJJLI).clear();
        for (int i = 0; i < length; i++) {
            ((ArrayList) this.LLILLJJLI).add(jSONArrayOptJSONArray.optString(i));
        }
        LLILZIL = bundle.getInt("item_size", 10);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("search_extra");
        if (jSONObjectOptJSONObject != null) {
            numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("type"));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 2) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65456);
            } else if (numValueOf.intValue() == 4) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65458);
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = this.LL.LIZIZ.getSparkView();
        if (sparkView == null || (sparkContext = sparkView.getSparkContext()) == null || sparkContext.LJFF(ISearchContextAbility.class) == null) {
            C0Q3E.LJI();
        }
        C653460Pk8 c653460Pk8 = (C653460Pk8) this.LLILLL.getValue();
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString("video_from");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString, "from_search_continuous_loading_card")) {
            if (jSONObject.optBoolean("use_general_search_video_flow") && Intrinsics.LJFF(jSONObject.optString("from_card_type"), "tt_featured_answer")) {
                C1440005kM.LIZ(new C2037607yY(this.LLILZ));
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                C786410Ut5.LJJJI("video_from", "from_search_mix", bundle);
                bundle.putBoolean("is_update_search_result_id", true);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.LIZIZ.getContext(), "//aweme/detail");
                smartRouteBuildRoute.withParam(bundle);
                if (bundle2 != null) {
                    smartRouteBuildRoute.withBundleAnimation(bundle2);
                    smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                }
                smartRouteBuildRoute.withParam("search_detail", C301530Brr.LIZ());
                smartRouteBuildRoute.open();
                return true;
            }
            if (C301500Bro.LIZ() && jSONObject.optBoolean("use_general_search_video_flow")) {
                AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, bundle, 79);
                if (jSONObject.optBoolean("click_on_live_card") && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C1ER1.LIZIZ.O0(awS411S0200000_10, null);
                    return true;
                }
                awS411S0200000_10.invoke();
                return true;
            }
            if (c653460Pk8 != null) {
                Context context = this.LL.LIZIZ.getContext();
                C653530PkF c653530PkF = new C653530PkF();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("search_extra");
                if (jSONObjectOptJSONObject2 != null) {
                    c653530PkF.LIZ = jSONObjectOptJSONObject2.optString("keyword");
                    c653530PkF.LIZIZ = jSONObjectOptJSONObject2.optInt("type");
                    c653530PkF.LIZJ = jSONObjectOptJSONObject2.optString(FollowStatusChangeMethod.PARAM_UID);
                }
                c653460Pk8.LJ(context, bundle, c653530PkF, null, null, null);
                return true;
            }
        }
        return false;
    }
}
