package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0WG2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WG2 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ(boolean z) {
        C1913870zu5.LIZ.getClass();
        Keva repo = Keva.getRepo("firebase_repo");
        boolean z2 = false;
        boolean z3 = repo.getBoolean("has_report_collection_status", false);
        if (repo.getBoolean("is_collection_enabled", false) != z) {
            z2 = true;
        }
        if (!z3 || z2) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("region", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
            c2344009Gk.LIZJ(z ? 1 : 0, "is_collection_enable");
            c2344009Gk.LIZJ(this.LIZIZ ? 1 : 0, "is_delay_mode");
            c2344009Gk.LIZJ(!this.LIZ ? 1 : 0, "is_preinstall");
            c2344009Gk.LIZJ(C1913870zu5.LIZ() ? 1 : 0, "has_consent");
            c2344009Gk.LIZJ(!z3 ? 1 : 0, "is_first_time");
            c2344009Gk.LIZJ(C10EU.LJIILIIL() ? 1 : 0, "is_child_mode");
            C20684815ws.LJIILLIIL("google_collection_update", c2344009Gk.LIZ);
            if (!z3) {
                repo.storeBoolean("has_report_collection_status", true);
            }
            if (z2) {
                repo.storeBoolean("is_collection_enabled", z);
            }
        }
    }

    public C0WG2(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
