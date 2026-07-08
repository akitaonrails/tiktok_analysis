package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.07Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1832107Fn {
    public static final boolean LIZ;

    static {
        LIZ = (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).isNewUser() && C1787906zN.LIZ()) ? true : C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "optimize_preload_initpush_opt_1_3960", true, false);
    }
}
