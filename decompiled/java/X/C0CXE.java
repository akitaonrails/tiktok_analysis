package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;

/* JADX INFO: renamed from: X.0CXE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXE {
    public static final C0CXE LIZ = new C0CXE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CXH());

    public static boolean LIZ() {
        return ((Number) LIZIZ.getValue()).intValue() == 1 && LIZIZ() && !ComplianceServiceProvider.LJIL().LJJJJZI();
    }

    public static boolean LIZIZ() {
        boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().mallTabUserInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowMallTab: ");
        sbLIZ.append(!zIsLogin || (tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay()));
        C2188811AlT.LIZIZ(sbLIZ);
        if (zIsLogin) {
            return tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay();
        }
        return true;
    }
}
