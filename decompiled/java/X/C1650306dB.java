package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1650306dB {
    public static void LIZ(Context context, int i, String str, String str2, String str3) {
        try {
            long j = CastLongProtector.parseLong(str);
            IMGroupChatDetailAnalytics.LIZ.LJFF("click_audit_request", new Pair[]{new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("request_num", String.valueOf(i))}, C0I0B.LJFF.LIZIZ());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/detail/audit_request");
            smartRouteBuildRoute.withParam("conv_short_id", j);
            smartRouteBuildRoute.withParam("initial_request_size", i);
            smartRouteBuildRoute.withParam("enter_from", str2);
            smartRouteBuildRoute.open();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
