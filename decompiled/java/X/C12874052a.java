package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.052a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12874052a {
    public static final boolean LIZ;

    static {
        LIZ = (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).isNewUser() && C1787906zN.LIZ()) ? true : C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "optimize_preload_initpush_opt_2_3960", true, false);
    }
}
