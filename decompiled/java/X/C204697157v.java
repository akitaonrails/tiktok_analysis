package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.IToolsDetailConfigService;

/* JADX INFO: renamed from: X.157v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204697157v {
    public static final C204699157x LIZ() {
        try {
            return ((IToolsDetailConfigService) ServiceManager.get().getService(IToolsDetailConfigService.class)).LIZIZ();
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            return new C204699157x(0);
        }
    }
}
