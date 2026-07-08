package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;

/* JADX INFO: renamed from: X.0CXC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXC {
    public static final C0CXC LIZ = new C0CXC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CXJ());

    public static boolean LIZIZ() {
        if (((Number) LIZIZ.getValue()).intValue() == 1) {
            boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
            TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().mallTabUserInfo;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldShowMallTab: ");
            sbLIZ.append(!zIsLogin || (tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay()));
            C2188811AlT.LIZIZ(sbLIZ);
            if ((!zIsLogin || (tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay())) && !ComplianceServiceProvider.LJIL().LJJJJZI()) {
                return true;
            }
        }
        return false;
    }

    public static int LIZ() {
        if (LIZIZ()) {
            return ((Number) C258580ABk.LIZ.getValue()).intValue();
        }
        return 0;
    }
}
