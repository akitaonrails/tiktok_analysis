package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L4B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4B {
    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZJ(Context context, int i, Intent intent) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        intent.setClass(context, VECutVideoActivity.class);
        if (intent.getLongExtra("extra_start_enter_cut_page", -1L) == -1) {
            intent.putExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        }
        if (i != -1 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx7o4Ku/s4aGo5rzq0qNQsELeeA==", null));
            return;
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx7o4Ku/s4aGo5rzq0qNQsELeeA==", null));
    }

    public static void LIZIZ(Activity activity, Intent intent, boolean z, boolean z2) {
        String string;
        if (z2) {
            ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(activity, LIZ(intent));
            C0MWH.LJIILLIIL(activity, LIZ(intent));
            return;
        }
        if (z) {
            intent.putExtra("extra_request_code", 8);
            ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(activity, LIZ(intent));
            C0MWH.LJIILLIIL(activity, LIZ(intent));
            return;
        }
        Bundle bundleLIZ = LIZ(intent);
        if (bundleLIZ != null) {
            string = bundleLIZ.getString("shoot_way", "");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "story") && C0L4C.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(activity, intent, false);
            return;
        }
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(activity, LIZ(intent));
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && !creativeToolsPluginService.LIZJ(activity, "cut2EditScene", true)) {
            return;
        }
        C0MWH.LJIILL(activity, LIZ(intent));
    }
}
