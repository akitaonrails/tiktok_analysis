package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745010vVj implements InterfaceC1745040vVm {
    @Override // X.InterfaceC1745040vVm
    public final void LIZ(Context context, JSONObject jSONObject) {
        String strLIZIZ;
        Integer numLIZ = C1907607da.LIZ("open_state", jSONObject);
        Integer numLIZ2 = C1907607da.LIZ("time_away_ui_type", jSONObject);
        if (numLIZ2 != null) {
            if (numLIZ2.intValue() == -1) {
                int i = EnumC1745020vVk.CLOSE.getI();
                if (numLIZ != null && numLIZ.intValue() == i) {
                    for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                        if (abstractC1387200mCc.LIZIZ() instanceof ScheduleDowntimeServerDrivenActivity) {
                            abstractC1387200mCc.LIZ();
                        }
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("current_stage", "close_time_away");
                    C20684815ws.LJIILLIIL("aggregate_screen_time_infra", c2344009Gk.LIZ);
                    return;
                }
                int i2 = EnumC1745020vVk.OPEN.getI();
                if (numLIZ != null && numLIZ.intValue() == i2) {
                    String strLIZIZ2 = C1907607da.LIZIZ("schema", jSONObject);
                    String strLIZIZ3 = C1907607da.LIZIZ("end_time", jSONObject);
                    String strLIZIZ4 = C1907607da.LIZIZ("start_time", jSONObject);
                    Integer numLIZ3 = C1907607da.LIZ("review_status", jSONObject);
                    Integer numLIZ4 = C1907607da.LIZ("time_away_ui_type", jSONObject);
                    Integer numLIZ5 = C1907607da.LIZ("start_timestamp", jSONObject);
                    Integer numLIZ6 = C1907607da.LIZ("end_timestamp", jSONObject);
                    if (strLIZIZ2 != null && !a0.LJJJIL(strLIZIZ2) && strLIZIZ3 != null && !a0.LJJJIL(strLIZIZ3) && strLIZIZ4 != null && !a0.LJJJIL(strLIZIZ4) && numLIZ3 != null && context != null) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLIZIZ2);
                        smartRouteBuildRoute.withParam("endTime", strLIZIZ3);
                        smartRouteBuildRoute.withParam("startTime", strLIZIZ4);
                        smartRouteBuildRoute.withParam("startTimestamp", numLIZ5);
                        smartRouteBuildRoute.withParam("endTimestamp", numLIZ6);
                        smartRouteBuildRoute.withParam("reviewStatus", numLIZ3.intValue());
                        smartRouteBuildRoute.withParam("timeAwayUiType", numLIZ4);
                        smartRouteBuildRoute.open();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("current_stage", "open_time_away");
                        C20684815ws.LJIILLIIL("aggregate_screen_time_infra", c2344009Gk2.LIZ);
                        return;
                    }
                    return;
                }
                return;
            }
            if (numLIZ2.intValue() == 2) {
                Integer numLIZ7 = C1907607da.LIZ("min_left", jSONObject);
                if (jSONObject != null && (strLIZIZ = C1907607da.LIZIZ("schema", jSONObject)) != null && !a0.LJJJIL(strLIZIZ) && numLIZ7 != null && context != null) {
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, strLIZIZ);
                    smartRouteBuildRoute2.withParam("minLeft", numLIZ7.intValue());
                    smartRouteBuildRoute2.open();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("current_stage", "in_app_push_time_away");
                    C20684815ws.LJIILLIIL("aggregate_screen_time_infra", c2344009Gk3.LIZ);
                }
            }
        }
    }
}
