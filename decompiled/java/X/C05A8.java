package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05A8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05A8 {
    public static final C05A8 LIZ = new C05A8();

    public static void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
