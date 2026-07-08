package X;

import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TX2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TX2 implements ILSFeedGPSCardService {
    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService
    public final void clearExploreNearbyBtnData() {
        C0TX1.LIZ = false;
        C0TX1.LIZIZ = 0;
        C0TX1.LIZLLL = new Pair<>("", Boolean.FALSE);
        C0TX1.LIZJ = null;
    }
}
