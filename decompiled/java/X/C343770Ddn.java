package X;

import com.ss.android.ugc.aweme.experiment.MainTabConfigServiceImpl;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.spi.ITabConfigService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0Ddn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343770Ddn implements ITabConfigService {
    public static final C343770Ddn LIZIZ = new C343770Ddn();
    public final /* synthetic */ ITabConfigService LIZ;

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final List<TopTabItem> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final Map LIZIZ(AFwS213S0000000_24 aFwS213S0000000_24) {
        return this.LIZ.LIZIZ(aFwS213S0000000_24);
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final TabConfig LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final List LJ(AFwS213S0000000_24 aFwS213S0000000_24) {
        return this.LIZ.LJ(aFwS213S0000000_24);
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final Map LJFF(AFwS213S0000000_24 aFwS213S0000000_24) {
        return this.LIZ.LJFF(aFwS213S0000000_24);
    }

    public C343770Ddn() {
        ITabConfigService iTabConfigService;
        Object objLIZ = C04TD.LIZ(ITabConfigService.class, false);
        if (objLIZ != null) {
            iTabConfigService = (ITabConfigService) objLIZ;
        } else {
            if (C04TD.m0 == null) {
                synchronized (ITabConfigService.class) {
                    if (C04TD.m0 == null) {
                        C04TD.m0 = new MainTabConfigServiceImpl();
                    }
                }
            }
            iTabConfigService = C04TD.m0;
        }
        this.LIZ = iTabConfigService;
    }
}
