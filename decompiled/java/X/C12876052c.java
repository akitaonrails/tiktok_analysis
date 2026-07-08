package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.052c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12876052c {
    public static long LIZ() {
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).isNewUser() && C1787906zN.LIZ()) {
            return 1L;
        }
        return C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "optimize_downgrade_betaapptask_4010", -1L);
    }

    static {
        LIZ();
    }
}
