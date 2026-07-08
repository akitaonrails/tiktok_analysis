package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.util.Set;

/* JADX INFO: renamed from: X.1EOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280631EOn {
    public static final C2280631EOn LIZ = new C2280631EOn();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"PK", "BD", "IQ", "DZ", "KH", "VE", "SN", "NG", "DO", "TN", "KE", "ET", "LK", "LY", "LB", "SO", "GH", "NI", "UG", "ML", "YE", "TZ", "CI", "SD", "CD", "UZ", "PS", "AF", "ZM", "CM", "TG", "AO", "HT", "MR"});

    public static boolean LIZ() {
        String strLJIIJ = ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIJ();
        if (strLJIIJ != null) {
            return LIZIZ.contains(strLJIIJ);
        }
        return false;
    }
}
