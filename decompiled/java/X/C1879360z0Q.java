package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879360z0Q implements InterfaceC1745040vVm {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(663));

    @Override // X.InterfaceC1745040vVm
    public final void LIZ(Context context, JSONObject jSONObject) {
        Object c098200Yq;
        Activity activityLIZ;
        Uri uriLJIJ;
        SparkActivity sparkActivity;
        SparkContext sparkContext;
        Integer numLIZ = C1907607da.LIZ("daily_screen_time_type", jSONObject);
        int i = EnumC2009507u1.DAILY_SCREEN_TIME_POPUP.getI();
        if (numLIZ != null && numLIZ.intValue() == i) {
            String strLIZIZ = C1907607da.LIZIZ("schema", jSONObject);
            if (C290530Ba7.LIZ()) {
                int iLJJJIL = ComplianceServiceProvider.LJIL().LJJJIL();
                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LIZ.getValue();
                if (pnSDigitalWellbeingSDKService != null) {
                    pnSDigitalWellbeingSDKService.LIZ("daily_screen_time_block_shown", C2097608Jq.LJIIIIZZ(new Pair("daily_limit_minutes", String.valueOf(iLJJJIL)), new Pair("time_to_show_ms", String.valueOf(System.currentTimeMillis()))));
                }
            }
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                C0DQ0.LIZ.getClass();
                if (context != null) {
                    try {
                        SparkContext sparkContext2 = new SparkContext();
                        sparkContext2.LJJLIIJ(strLIZIZ);
                        Uri uri = UriProtector.parse(sparkContext2.LJIJI());
                        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                            if (activityLIZIZ != null) {
                                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                            } else {
                                activityLIZ = null;
                            }
                            if (!(activityLIZ instanceof SparkActivity) || (sparkActivity = (SparkActivity) activityLIZ) == null || (sparkContext = sparkActivity.LL) == null) {
                                uriLJIJ = null;
                            } else {
                                uriLJIJ = sparkContext.LJIJ();
                            }
                            if (C0DQ0.LIZIZ(uri, uriLJIJ)) {
                                break;
                            }
                        }
                        SmartRouter.buildRoute(context, strLIZIZ).open();
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        SmartRouter.buildRoute(context, strLIZIZ).open();
                    }
                }
            } else {
                ComplianceServiceProvider.LJIL().LJIIZILJ();
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("current_stage", "openDailyScreenTimePage");
            C20684815ws.LJIILLIIL("aggregate_screen_time_infra", c2344009Gk.LIZ);
            return;
        }
        int i2 = EnumC2009507u1.DAILY_SCREEN_TIME_NORMAL_PUSH.getI();
        if (numLIZ == null || numLIZ.intValue() != i2) {
            int i3 = EnumC2009507u1.DAILY_SCREEN_TIME_CHALLENGE_PUSH.getI();
            if (numLIZ == null || numLIZ.intValue() != i3) {
                return;
            }
        }
        String strLIZIZ2 = C1907607da.LIZIZ("schema", jSONObject);
        if (strLIZIZ2 == null) {
            return;
        }
        SmartRouter.buildRoute(context, strLIZIZ2).open();
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService2 = (PnSDigitalWellbeingSDKService) this.LIZ.getValue();
        if (pnSDigitalWellbeingSDKService2 != null) {
            pnSDigitalWellbeingSDKService2.LJIIJ(EnumC1879480z0c.DAILY_SCREEN_TIME, AnonymousClass0566.STATUS_ID_NOT_SHOW_REMINDER, null);
        }
    }
}
