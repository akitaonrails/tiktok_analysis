package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;

/* JADX INFO: renamed from: X.0vMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739200vMM {
    public static final C1739200vMM LIZ = new C1739200vMM();

    public static String LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApmDependencyService.class.getName(), anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        return ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent();
    }
}
