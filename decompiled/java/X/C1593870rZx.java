package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService;

/* JADX INFO: renamed from: X.0rZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593870rZx implements IMiniDramaCardService {
    public static final C1593870rZx LIZIZ = new C1593870rZx();
    public final /* synthetic */ IMiniDramaCardService LIZ;

    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final C0TRR LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaCardService
    public final void LIZJ(long j, long j2) {
        this.LIZ.LIZJ(j, j2);
    }

    public C1593870rZx() {
        IMiniDramaCardService iMiniDramaCardService = (IMiniDramaCardService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaCardService.class, false, false, false, 14, null);
        if (iMiniDramaCardService != null) {
            this.LIZ = iMiniDramaCardService;
        } else {
            "must be provided".toString();
            throw new IllegalStateException("must be provided");
        }
    }
}
