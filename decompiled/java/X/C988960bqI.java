package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.INewUserApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988960bqI extends C09AY implements Function0<Integer> {
    public C988960bqI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ((INewUserApi) ServiceManager.get().getService(INewUserApi.class)).LIZ();
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "low_end_fluency_opt", true));
    }
}
