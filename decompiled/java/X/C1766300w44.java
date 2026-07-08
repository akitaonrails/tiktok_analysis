package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptSetting;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766300w44 {
    public static final C1766300w44 LIZ = new C1766300w44();
    public static final C11U9<String, JSONObject> LIZIZ;

    static {
        EcMobSpliceCheckNetworkInterceptSetting.LIZ.getClass();
        C01GW c01gw = EcMobSpliceCheckNetworkInterceptSetting.LIZJ;
        LIZIZ = new C11U9<>(((EcMobSpliceCheckNetworkInterceptSetting.InterceptSetting) c01gw.getValue()).maxCapacity, ((EcMobSpliceCheckNetworkInterceptSetting.InterceptSetting) c01gw.getValue()).limitSize);
    }

    public final synchronized void LIZ(String str, JSONObject jSONObject) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String name;
        C11U9<String, JSONObject> c11u9 = LIZIZ;
        c11u9.LIZLLL(str, jSONObject);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save key: ");
        sbLIZ.append(str);
        sbLIZ.append(", queue size: ");
        sbLIZ.append(c11u9.LJ());
        sbLIZ.append(", data size: ");
        sbLIZ.append(c11u9.LIZIZ());
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).commonLogI("SpliceDebug_DM", C2188811AlT.LIZIZ(sbLIZ));
    }
}
