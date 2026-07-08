package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.nearby.api.INearbyMobService;
import com.ss.android.ugc.nearby.service.NearbyMobServiceImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205250hT9 implements INearbyMobService {
    public static final C1205250hT9 LIZIZ = new C1205250hT9();
    public final /* synthetic */ INearbyMobService LIZ;

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LIZJ(String str, HashMap<String, String> map, Aweme aweme, boolean z) {
        this.LIZ.LIZJ(str, map, aweme, z);
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Map<String, String> LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final int LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LJIIJ(String str, Map<String, String> map) {
        this.LIZ.LJIIJ(str, map);
    }

    public C1205250hT9() {
        INearbyMobService iNearbyMobService;
        Object objLIZ = C04TD.LIZ(INearbyMobService.class, false);
        if (objLIZ != null) {
            iNearbyMobService = (INearbyMobService) objLIZ;
        } else {
            if (C04TD.C6 == null) {
                synchronized (INearbyMobService.class) {
                    if (C04TD.C6 == null) {
                        C04TD.C6 = new NearbyMobServiceImpl();
                    }
                }
            }
            iNearbyMobService = C04TD.C6;
        }
        this.LIZ = iNearbyMobService;
    }
}
