package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ma6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570800Ma6 {
    public static PermissionCheckResponse LIZ(C570790Ma5 c570790Ma5) {
        try {
            return ((PermissionCheckApi.CheckPermissionRequest) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, PermissionCheckApi.CheckPermissionRequest.class)).checkPermission(c570790Ma5).execute().LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("permission check failed: ");
            sbLIZ.append(Unit.LIZ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
