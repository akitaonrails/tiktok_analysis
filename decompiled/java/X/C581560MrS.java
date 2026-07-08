package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0MrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C581560MrS implements InterfaceC582820MtU {
    public static final Aweme LIZ(String str) {
        C0SZ8 c0sz8LJJIJIL;
        try {
            IBaseListFragmentPanel iBaseListFragmentPanelLIZ = C581550MrR.LIZ();
            if (iBaseListFragmentPanelLIZ != null && (c0sz8LJJIJIL = iBaseListFragmentPanelLIZ.LJJIJIL(str)) != null) {
                return c0sz8LJJIJIL.LJIIIIZZ();
            }
            return ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
