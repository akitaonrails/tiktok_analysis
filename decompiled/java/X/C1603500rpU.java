package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.IDiscoveryService;
import com.ss.android.ugc.aweme.discover.impl.DiscoveryServiceImpl;

/* JADX INFO: renamed from: X.0rpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603500rpU implements IDiscoveryService {
    public static final C1603500rpU LIZIZ = new C1603500rpU();
    public final /* synthetic */ IDiscoveryService LIZ;

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LIZ.LLJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final InterfaceC1603440rpO LLJILJIL() {
        return this.LIZ.LLJILJIL();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment LLJILJILJ() {
        return this.LIZ.LLJILJILJ();
    }

    public C1603500rpU() {
        IDiscoveryService iDiscoveryService;
        Object objLIZ = C04TD.LIZ(IDiscoveryService.class, false);
        if (objLIZ != null) {
            iDiscoveryService = (IDiscoveryService) objLIZ;
        } else {
            if (C04TD.LLLLZLLLI == null) {
                synchronized (IDiscoveryService.class) {
                    if (C04TD.LLLLZLLLI == null) {
                        C04TD.LLLLZLLLI = new DiscoveryServiceImpl();
                    }
                }
            }
            iDiscoveryService = C04TD.LLLLZLLLI;
        }
        this.LIZ = iDiscoveryService;
    }
}
