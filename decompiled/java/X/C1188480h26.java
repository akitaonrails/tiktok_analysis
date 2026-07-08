package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;

/* JADX INFO: renamed from: X.0h26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188480h26 {
    public static C1188510h29 LIZ(String str) {
        return (C1188510h29) ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJJJZI(C1188500h28.LIZ(EnumC1188490h27.SEARCH, str));
    }
}
