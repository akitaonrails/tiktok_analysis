package X;

import com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggService;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: renamed from: X.0cZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016730cZ5 implements IShakeEggService {
    public static final C1016730cZ5 LIZIZ = new C1016730cZ5();
    public final /* synthetic */ IShakeEggService LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final boolean LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final ShakeModel LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final InterfaceC1008660cM4 LIZJ(C19GS c19gs) {
        return this.LIZ.LIZJ(c19gs);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final String LIZLLL(ShakeModel shakeModel, C19EG c19eg) {
        return this.LIZ.LIZLLL(shakeModel, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final void LJ(AwemeRawAd awemeRawAd, List<String> list) {
        this.LIZ.LJ(awemeRawAd, list);
    }

    public C1016730cZ5() {
        IShakeEggService iShakeEggService;
        Object objLIZ = C04TD.LIZ(IShakeEggService.class, false);
        if (objLIZ != null) {
            iShakeEggService = (IShakeEggService) objLIZ;
        } else {
            if (C04TD.LJLLLL == null) {
                synchronized (IShakeEggService.class) {
                    if (C04TD.LJLLLL == null) {
                        C04TD.LJLLLL = new ShakeEggService();
                    }
                }
            }
            iShakeEggService = C04TD.LJLLLL;
        }
        this.LIZ = iShakeEggService;
    }
}
