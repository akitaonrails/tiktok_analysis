package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312180CLo {
    public static final C312180CLo LIZ = new C312180CLo();
    public static final Keva LIZIZ = Keva.getRepo("live_support_cache_manager_for_screen_adapter_repo");

    public static final boolean LIZ() {
        return LIZIZ.getBoolean(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), true);
    }

    public static final void LIZIZ(boolean z) {
        LIZIZ.storeBoolean(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), z);
    }
}
