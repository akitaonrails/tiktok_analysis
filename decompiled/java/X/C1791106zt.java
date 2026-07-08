package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1791106zt extends C09AY implements Function0<Integer> {
    public C1791106zt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Integer, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        boolean zLIZ = C1784706yr.LIZ();
        C07MC.LIZ.getClass();
        return C1827607Du.LIZIZ(zLIZ, 1, C07MC.LIZIZ.contains(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIJ()), new C1773206x0());
    }
}
