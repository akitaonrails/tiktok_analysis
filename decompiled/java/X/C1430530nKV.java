package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;

/* JADX INFO: renamed from: X.0nKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430530nKV {
    public static final C1430530nKV LIZ = new C1430530nKV();

    public static void LIZ(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" Data Error\n Please save this message and contact @jinjianping\n");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ((IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class)).LIZIZ();
    }
}
