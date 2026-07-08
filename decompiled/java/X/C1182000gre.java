package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0gre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182000gre extends AbstractC1182140grs {
    public String LLILLL;
    public PoiAiSummaryListSharedVM LLILZ;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19egLIZIZ;
        Object c098200Yq;
        String str;
        String str2;
        InterfaceC1182130grr interfaceC1182130grr = (InterfaceC1182130grr) xBaseParamModel;
        try {
            this.LLILLL = interfaceC1182130grr.getPoiId();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                String strValueOf = String.valueOf(c19egLIZIZ.hashCode());
                List<String> awemeIds = interfaceC1182130grr.getAwemeIds();
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String trackParams = interfaceC1182130grr.getTrackParams();
                    Type type = new TypeToken<Map<String, String>>() { // from class: X.04ZH
                    }.getType();
                    c1227904rF.getClass();
                    c098200Yq = (Map) C1227904rF.LIZJ(trackParams, type);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Map map = (Map) c098200Yq;
                if (map != null) {
                    str = (String) map.get("enter_method");
                } else {
                    str = null;
                }
                if (!C123100dR.LIZ(str) || str == null) {
                    str = "highlight";
                }
                if (map == null) {
                    str2 = null;
                } else {
                    str2 = (String) map.get("enter_from");
                }
                if (!C123100dR.LIZ(str2) || str2 == null) {
                    str2 = "poi_secondary_page";
                }
                PoiAiSummaryListSharedVM poiAiSummaryListSharedVM = (PoiAiSummaryListSharedVM) new C736950SvV(C13LE.LIZ(PoiAiSummaryListSharedVM.class), new AwS167S1100000_18(this, strValueOf, 26), new C452070Ho5(), C724750Sbp.LJII(c19egLIZIZ), C1220000hqw.LIZ(c19egLIZIZ), AFwS256S0000000_18.get$arr$(978), new C0I27(c19egLIZIZ), new C0I28(c19egLIZIZ), new C338530DOx(c19egLIZIZ)).getValue();
                this.LLILZ = poiAiSummaryListSharedVM;
                poiAiSummaryListSharedVM.LLILZIL = null;
                poiAiSummaryListSharedVM.LLILZLL.clear();
                poiAiSummaryListSharedVM.setState(new AwS583S0100000_4(poiAiSummaryListSharedVM, 317));
                poiAiSummaryListSharedVM.listClear();
                PoiAiSummaryListSharedVM poiAiSummaryListSharedVM2 = this.LLILZ;
                if (poiAiSummaryListSharedVM2 != null) {
                    C325860Cq0 c325860Cq0 = new C325860Cq0(interfaceC1182130grr.getDimensionKey(), interfaceC1182130grr.getCursor(), interfaceC1182130grr.getPoiId(), awemeIds, interfaceC1182130grr.getDataVersion());
                    poiAiSummaryListSharedVM2.LLILZIL = c325860Cq0;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setInitialInfo: ");
                    sbLIZ.append(C2365509Or.LJ(c325860Cq0));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                String str3 = (String) C13LP.LJJJLL(awemeIds);
                if (str3 == null) {
                    str3 = "";
                }
                LIZJ(c19egLIZIZ, str, str3, strValueOf, str2);
                C189200o6.m2constructorimpl(c19egLIZIZ);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final void LIZJ(C19EG c19eg, String str, String str2, String str3, String str4) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str2, bundle);
        C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        bundle.putInt("video_type", 47);
        C786410Ut5.LJJJI("enter_from", str4, bundle);
        C786410Ut5.LJJJI("enter_method", str, bundle);
        C786410Ut5.LJJJI("page_poi_id", this.LLILLL, bundle);
        bundle.putBoolean("poi_collect_bottom_bar", true);
        bundle.putBoolean("hide_poi_anchor", true);
        C786410Ut5.LJJJI("video_from", "POI_AI_SUMMARY_ENTRANCE", bundle);
        HashMap map = new HashMap();
        str3.toString();
        map.put("fragment_id", str3);
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map);
        int i = 0;
        C786410Ut5.LJJIZ(bundle, "screen_shot_param", C2097608Jq.LJI(new Pair("poi_id", this.LLILLL)));
        if (C1226204qy.LIZ()) {
            i = 3;
        }
        bundle.putInt("post_bottom_bar_style", i);
        C1192440h8U.LIZ.getClass();
        bundle.putBoolean("privacy_auth_status_query_required", C1192440h8U.LIZIZ());
        bundle.putBoolean("poi_bottom_bar_new_ui", C1226204qy.LIZ());
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }
}
