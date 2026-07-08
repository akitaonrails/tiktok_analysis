package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.15YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15YQ {
    public static final C15YR LIZ = (C15YR) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(C15YR.class);

    public static C19482711Kf LIZ(int i) {
        C15YR c15yr = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(1);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("");
        sbLIZ3.append(i);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("");
        sbLIZ4.append(1);
        return C632140Oqq.LIZLLL(c15yr.LIZ(i, 1, i, 1, strLIZIZ, strLIZIZ2, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ4)), "/tiktok/v1/guardian/platform/engagement/count/permission", null);
    }

    public static C19482711Kf LIZIZ(String str) {
        return C632140Oqq.LIZLLL(LIZ.LIZIZ(str), "/aweme/v2/guardian/platform/verify/password/", null);
    }
}
