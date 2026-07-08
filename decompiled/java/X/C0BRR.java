package X;

import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BRR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BRR {
    public static final C0BRR LIZ = new C0BRR();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3561));

    public static final int LIZ() {
        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            return 10;
        }
        SearchSecurityControlConfig.LIZ.getClass();
        Integer numLIZ = SearchSecurityControlConfig.LIZ();
        if (numLIZ == null || numLIZ.intValue() != 4) {
            return 10;
        }
        LIZ.getClass();
        return ((Number) LIZIZ.getValue()).intValue();
    }
}
