package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAutobackupService;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0zxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916120zxi {
    public static boolean LJII;
    public String LIZ;
    public long LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1916160zxm(this));
    public static final C01GW<C1916120zxi> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1916170zxn());
    public static final C01GW<IPNSDeviceConsentService> LJ = C452501pT.LIZIZ(new C1916150zxl());
    public static final String LJFF = "tpc_consent";
    public static final Keva LJI = Keva.getRepo("tpc_consent");
    public static final IAccountService LJIIIIZZ = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public static final IAutobackupService LJIIIZ = AutobackupService.LIZJ();

    public final void LIZ(boolean z) {
        String str;
        int i;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "stay_time");
        if (z) {
            str = "confirm";
        } else {
            str = "background";
        }
        c2344009Gk.LJIIIIZZ("result", str);
        if (C1916110zxh.LIZJ().LJIIL() == EnumC1915930zxP.KR) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_region_kr");
        c2344009Gk.LJIIIIZZ("consent_region", LJIIIIZZ.getStoreRegionUpperCase());
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZ);
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        C10SV.LIZ(c2344009Gk);
        C10H5 c10h5 = C10H5.CONFIRM_CONSENT_BOX;
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
        if (z) {
            j = 0;
        } else {
            j = -1;
        }
        this.LIZIZ = j;
    }
}
