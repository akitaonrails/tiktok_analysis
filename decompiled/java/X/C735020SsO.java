package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0SsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735020SsO {
    public static final C735020SsO LIZ = new C735020SsO();
    public static final InterfaceC735030SsP LIZIZ = (InterfaceC735030SsP) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC735030SsP.class);

    public static void LIZ(int i) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", "/aweme/v1/mask/cancel/");
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        C794420VEi.LIZIZ("tns_api_status", "", c2241008qG.LJ());
    }

    public static void LIZIZ(String str, String str2) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", "/aweme/v1/mask/cancel/");
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        c2241008qG.LIZ.put("error_message", str2);
        c2241008qG.LIZ.put("tns_logId", str);
        C794420VEi.LIZIZ("tns_api_status", "", c2241008qG.LJ());
    }
}
