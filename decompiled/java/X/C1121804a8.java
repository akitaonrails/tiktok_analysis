package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1121804a8 extends C09AY implements Function0<ILogDependencyService> {
    public C1121804a8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService, com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService] */
    @Override // kotlin.jvm.functions.Function0
    public final ILogDependencyService invoke() {
        if (!C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            return (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        C1120604Zw.LIZ.LIZ();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ILogDependencyService iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
        C1AQS.LIZJ(jElapsedRealtime, 1, ILogDependencyService.class.getName(), iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin != null ? iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin != null);
        return iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin;
    }
}
