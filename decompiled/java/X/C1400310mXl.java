package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0mXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400310mXl {
    public static final C1400310mXl LIZ = new C1400310mXl();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB", "US"});
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"AR", "BR", "CO", "ID", "IQ", "JP", "KR", "MX", "MY", "PE", "PH", "PK", "SA", "TH", "VN"});

    public static boolean LIZ() {
        if (!C1514430pVp.LIZLLL().booleanValue() || !C0TKA.LJI) {
            return false;
        }
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        if (LIZJ.contains(storeRegionUpperCase)) {
            return ((Boolean) C1785606z0.LIZJ.getValue()).booleanValue();
        }
        if (LIZIZ.contains(storeRegionUpperCase)) {
            return ((Boolean) C1785606z0.LIZJ.getValue()).booleanValue();
        }
        return false;
    }
}
