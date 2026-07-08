package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.settings.NetworkConfig;
import com.ss.android.ugc.aweme.compliance.api.settings.SettingsModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService;
import com.ss.android.ugc.aweme.net.model.ScopeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841830X0r {
    public static boolean LIZJ() {
        SettingsModel settingsModel;
        if (((Boolean) C0ANL.LIZ.getValue()).booleanValue()) {
            return false;
        }
        boolean zLIZJ = C08Q1.LIZJ();
        if (!C841860X0u.LIZ.getValue().booleanValue() || !C303780BvU.LIZ().enableNetworkMonitor || !zLIZJ) {
            return false;
        }
        IKidsSettingsService iKidsSettingsService = (IKidsSettingsService) PluggableExtentionKt.pluggableSpi$default(IKidsSettingsService.class, false, false, false, 14, null);
        if (iKidsSettingsService == null || (settingsModel = iKidsSettingsService.LIZ()) == null) {
            settingsModel = new SettingsModel(false, false, new NetworkConfig(false, C2097608Jq.LJ()), C2097608Jq.LJ());
        }
        return !settingsModel.networkConfig.enabled;
    }

    public static void LIZ(C0X0V c0x0v) {
        synchronized (C841860X0u.LIZIZ) {
            try {
                String simpleName = c0x0v.getClass().getSimpleName();
                CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = C841860X0u.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (C0X0V c0x0v2 : copyOnWriteArrayList) {
                    if (Intrinsics.LJFF(c0x0v2.getClass().getSimpleName(), simpleName)) {
                        arrayList.add(c0x0v2);
                    }
                }
                CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList2 = C841860X0u.LIZLLL;
                copyOnWriteArrayList2.removeAll(arrayList);
                copyOnWriteArrayList2.add(c0x0v);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static List LIZIZ(UnexpectedConfig[] unexpectedConfigArr) {
        if (unexpectedConfigArr != null) {
            ArrayList arrayList = new ArrayList();
            for (UnexpectedConfig unexpectedConfig : unexpectedConfigArr) {
                C0X1T c0x1t = ScopeEnum.Companion;
                int i = unexpectedConfig.scope;
                c0x1t.getClass();
                if (C0X1T.LIZ(i)) {
                    arrayList.add(unexpectedConfig);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }

    public static void LIZLLL(String str, String str2, Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !a0.LJJJIL(str)) {
                jSONObject.put("url", str);
            }
            jSONObject.put("exception_name", exc.getClass().getSimpleName());
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            jSONObject.put("exception_message", message);
            jSONObject.put("monitor_method", str2);
            C793770VBv.LJ(EnumC841820X0q.NATIVE_NETWORK_MONITOR_EXCEPTION_LOG.getLogType(), jSONObject);
            C01GW<Boolean> c01gw = C841860X0u.LIZ;
            C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
