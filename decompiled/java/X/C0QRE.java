package X;

import com.ss.android.ugc.aweme.config.Crowd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spi.IHomePageService;

/* JADX INFO: renamed from: X.0QRE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRE {
    public static final C0QRE LIZ = new C0QRE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0OAM());

    public static boolean LIZ() {
        Integer num;
        int iIntValue;
        Crowd crowdLIZ;
        Integer num2;
        int iIntValue2;
        if (((Number) LIZIZ.getValue()).intValue() != 1) {
            return false;
        }
        if (!((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJ() || ((Number) C271370AkJ.LIZ.getValue()).intValue() != 1) {
            C311300CIe.LIZ.getClass();
            Crowd crowdLIZ2 = C311300CIe.LIZ();
            if (crowdLIZ2 != null && (num = crowdLIZ2.enableVTag) != null && ((100 > (iIntValue = num.intValue()) || iIntValue >= 200) && (crowdLIZ = C311300CIe.LIZ()) != null && (num2 = crowdLIZ.enableFallbackVTag) != null && (100 > (iIntValue2 = num2.intValue()) || iIntValue2 >= 200))) {
                return false;
            }
        }
        return true;
    }
}
