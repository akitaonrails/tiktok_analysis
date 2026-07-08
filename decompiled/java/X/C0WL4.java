package X;

import Y.ARunnableS0S2110000_13;
import Y.ARunnableS22S0400000_13;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.rasp.router.BostonRouterInterceptorModel;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WL4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WL4 {
    public final C0WL8 LIZ;

    public C0WL4(C0WL8 c0wl8) {
        this.LIZ = c0wl8;
    }

    public final boolean LIZ(Uri uri, String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C805400Vic c805400VicLIZ = C295401Cm.LIZ(uri);
        if (C0WL5.LIZIZ == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            BostonRouterInterceptorModel bostonRouterInterceptorModel = C0WL5.LIZ;
            BostonRouterInterceptorModel bostonRouterInterceptorModel2 = (BostonRouterInterceptorModel) settingsManagerLIZLLL.LJIIIIZZ("boston_router_interceptor", BostonRouterInterceptorModel.class, bostonRouterInterceptorModel);
            if (bostonRouterInterceptorModel2 != null) {
                bostonRouterInterceptorModel = bostonRouterInterceptorModel2;
            }
            C0WL5.LIZIZ = bostonRouterInterceptorModel;
        }
        BostonRouterInterceptorModel bostonRouterInterceptorModel3 = C0WL5.LIZIZ;
        if (bostonRouterInterceptorModel3.enable && bostonRouterInterceptorModel3.reportEnable && c805400VicLIZ != null) {
            C823050WQl.LIZIZ().execute(new ARunnableS22S0400000_13(uri, c805400VicLIZ, bostonRouterInterceptorModel3, new Throwable(), 2));
        }
        PrivacyEvent.Companion.getClass();
        PrivacyEvent privacyEventLIZ = C0WRC.LIZ("5000", "RASP");
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        privacyEventLIZ.addCallSiteInfo("source", new C0WQ8(enumC823400WRu, "rasp"));
        privacyEventLIZ.addCallSiteInfo("type", new C0WQ8(enumC823400WRu, "router"));
        if (c805400VicLIZ != null) {
            privacyEventLIZ.addCallSiteInfo("url", new C0WQ8(enumC823400WRu, c805400VicLIZ.LIZ));
            String str2 = c805400VicLIZ.LIZJ;
            if (str2 != null) {
                privacyEventLIZ.addCallSiteInfo("scheme", new C0WQ8(enumC823400WRu, str2));
            }
            String str3 = c805400VicLIZ.LIZLLL;
            if (str3 != null) {
                privacyEventLIZ.addCallSiteInfo("host", new C0WQ8(enumC823400WRu, str3));
            }
            String str4 = c805400VicLIZ.LJFF;
            if (str4 != null) {
                privacyEventLIZ.addCallSiteInfo("path", new C0WQ8(enumC823400WRu, str4));
            }
            Map<String, String> map = c805400VicLIZ.LJI;
            if (map != null && (!map.isEmpty())) {
                privacyEventLIZ.addCallSiteInfo("querys", new C0WQ8(EnumC823400WRu.Any, map));
            }
            String str5 = c805400VicLIZ.LJII;
            if (str5 != null) {
                privacyEventLIZ.addCallSiteInfo("query_str", new C0WQ8(enumC823400WRu, str5));
            }
            privacyEventLIZ.addCallSiteInfo(Scene.SCENE_SERVICE, new C0WQ8(enumC823400WRu, str));
        }
        boolean z = false;
        for (C0WRN c0wrn : EventPipeline.handleEvent(privacyEventLIZ, null)) {
            String str6 = c0wrn.LIZIZ;
            String str7 = c0wrn.LIZ.LIZIZ;
            if (Intrinsics.LJFF(str7, "fuse")) {
                C0WL8 c0wl8 = this.LIZ;
                if (c0wl8 != null) {
                    c0wl8.LIZ(new AwS592S0100000_13(uri, 64));
                }
                z = true;
            } else if (Intrinsics.LJFF(str7, "report")) {
                C823050WQl.LIZIZ().execute(new ARunnableS0S2110000_13(c805400VicLIZ, str6, str, 1));
            }
        }
        C800860VbI.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "router");
        return z;
    }
}
