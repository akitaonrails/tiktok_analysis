package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0521, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0521 {
    public static final AnonymousClass0521 LIZ = new AnonymousClass0521();

    public static void LIZ(int i, boolean z, long j, long j2, long j3) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("handle_total_duration", Long.valueOf(j));
            linkedHashMap.put("handle_merge_duration", Long.valueOf(j2));
            linkedHashMap.put("handle_local_duration", Long.valueOf(j3));
            linkedHashMap.put("aweme_size", Integer.valueOf(i));
            linkedHashMap.put("is_from_cache", Boolean.valueOf(z));
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService != null) {
                iFeedDebugService.LIZJ();
            }
            C793770VBv.LJII("fcp_config_process", jSONObject, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
