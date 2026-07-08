package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import jv6.a;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830730WiN {
    public static final C830730WiN LIZ = new C830730WiN();

    public static void LIZ(Context context, TTWebViewEnableStatusSettings.TikTokTTWebViewStatusModel tikTokTTWebViewStatusModel) {
        Context contextLIZ;
        Context contextLIZ2 = context;
        if (C2104108Md.LJ(contextLIZ2)) {
            return;
        }
        try {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            iPluginService.LJIL();
            if (contextLIZ2 != null) {
                contextLIZ = contextLIZ2;
            } else {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            a.install(contextLIZ);
            Long lLJJIIJZLJL = iPluginService.LJJIIJZLJL();
            if (lLJJIIJZLJL != null) {
                TTWebViewHelper.splitCompatInstallExecuteTime = Long.valueOf(lLJJIIJZLJL.longValue());
            }
            TTWebViewHelper.isTTWebViewRemoved = iPluginService.LJJIIJ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
        if (contextLIZ2 == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ2 = C844470XAv.LIZ();
        }
        C1546140qKy c1546140qKy = C1546140qKy.LIZ;
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJ());
        long j = C844470XAv.LJIJJLI;
        IHybridDevtoolService iHybridDevtoolService = (IHybridDevtoolService) ServiceManager.get().getService(IHybridDevtoolService.class, false, false);
        if (iHybridDevtoolService != null) {
            iHybridDevtoolService.isOpen();
        }
        tTWebViewHelper.initTTWebView(contextLIZ2, "com.ss.android.ugc.aweme.ttwebview.TTWebViewRuntimeService", c1546140qKy, tikTokTTWebViewStatusModel, strValueOf, j, false, 1);
    }
}
