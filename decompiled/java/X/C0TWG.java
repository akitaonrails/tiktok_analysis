package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0TWG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TWG {
    public static final C0TWG LIZ = new C0TWG();

    public static final void LIZ(Context context, LiveEventStruct liveEventStruct) {
        Object c098200Yq;
        if (((Boolean) C267130AdT.LIZ.getValue()).booleanValue()) {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("live_event_detail_schema", "");
            if (context != null && !TextUtils.isEmpty(strLJI)) {
                try {
                    c098200Yq = Boolean.valueOf(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZLLL(context, UriProtector.parse(strLJI).buildUpon().appendQueryParameter("event_id", liveEventStruct.getId()).appendQueryParameter("live_event_enter_from", "live_event_card").build().toString()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
                return;
            }
            return;
        }
        SettingsManager.LIZLLL().getClass();
        String strLJI2 = SettingsManager.LJI("live_event_detail_format", "");
        if (context != null && !TextUtils.isEmpty(strLJI2)) {
            C0XI4 c0xi4 = new C0XI4("sslocal://webcast_webview");
            c0xi4.LIZIZ(1, "hide_nav_bar");
            c0xi4.LIZIZ(1, "hide_status_bar");
            C0XI4 c0xi42 = new C0XI4(strLJI2);
            c0xi42.LJ("event_id", liveEventStruct.getId());
            c0xi42.LJ("live_event_enter_from", "live_event_card");
            c0xi4.LJ("url", c0xi42.LJFF());
            String strLJFF = c0xi4.LJFF();
            if (strLJFF != null && strLJFF.length() != 0) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJ(context, UriProtector.parse(strLJFF));
            }
        }
    }

    public static final String LIZJ(boolean z, String str, String str2, List<LiveEventStruct> list, Integer num, String str3, Long l, Map<String, String> map) {
        ServiceManager serviceManager;
        ILiveOuterService iLiveOuterService;
        String str4;
        boolean z2;
        String str5;
        ServiceManager serviceManager2;
        ILiveOuterService iLiveOuterService2;
        C1251210ifH.LIZ.getClass();
        String str6 = "";
        if (!z ? !((serviceManager = ServiceManager.get()) == null || (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) == null || (str4 = (String) iLiveOuterService.LIZJ("", "live_info_audience_schema")) == null) : !((serviceManager2 = ServiceManager.get()) == null || (iLiveOuterService2 = (ILiveOuterService) serviceManager2.getService(ILiveOuterService.class)) == null || (str4 = (String) iLiveOuterService2.LIZJ("", "live_info_schema")) == null)) {
            str6 = str4;
        }
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(str6).buildUpon().appendQueryParameter("host_user_id", str).appendQueryParameter("user_id", str2);
            if (list == null || list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("has_event", str5).appendQueryParameter("tab_pos", String.valueOf(num)).appendQueryParameter("target_handler", "webcast");
            if (str3 != null) {
                builderAppendQueryParameter2.appendQueryParameter("spark_perf_biz", str3);
            }
            if (l != null) {
                builderAppendQueryParameter2.appendQueryParameter("entrance_click_ts", l.toString());
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builderAppendQueryParameter2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            return builderAppendQueryParameter2.build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final void LIZIZ(Context context, boolean z, String str, String str2, List<LiveEventStruct> list, Integer num, String str3, AbstractC1542200qEc abstractC1542200qEc, Map<String, String> map) {
        String strLIZJ = LIZJ(z, str, str2, list, num, str3, Long.valueOf(System.currentTimeMillis()), map);
        if (strLIZJ != null && context != null && !TextUtils.isEmpty(strLIZJ)) {
            try {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(strLIZJ);
                if (abstractC1542200qEc != null) {
                    sparkContext.LJJJJZI(abstractC1542200qEc);
                }
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().Cw(sparkContext);
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
