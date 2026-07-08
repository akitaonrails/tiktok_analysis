package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.INewUserApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988970bqJ extends C09AY implements Function0<Boolean> {
    public C988970bqJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if ((!((INewUserApi) ServiceManager.get().getService(INewUserApi.class)).isNewUser() || !((INewUserApi) ServiceManager.get().getService(INewUserApi.class)).LIZIZ()) && C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_low_end_device_opt_fold_device_cache", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
