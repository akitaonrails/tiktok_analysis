package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService;
import com.ss.android.ugc.aweme.service.ProgressRecord;

/* JADX INFO: renamed from: X.0rlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600830rlB implements IDramaInnerFeedSyncupService {
    public static final C1600830rlB LIZJ = new C1600830rlB();
    public final /* synthetic */ IDramaInnerFeedSyncupService LIZIZ;

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final ProgressRecord LIZ(Long l) {
        return this.LIZIZ.LIZ(l);
    }

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final boolean LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final void LIZJ(Long l, Aweme aweme, float f) {
        this.LIZIZ.LIZJ(l, aweme, f);
    }

    @Override // com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService
    public final void LIZLLL(Long l) {
        this.LIZIZ.LIZLLL(l);
    }

    public C1600830rlB() {
        IDramaInnerFeedSyncupService iDramaInnerFeedSyncupService = (IDramaInnerFeedSyncupService) PluggableExtentionKt.pluggableSpi$default(IDramaInnerFeedSyncupService.class, false, false, false, 14, null);
        if (iDramaInnerFeedSyncupService != null) {
            this.LIZIZ = iDramaInnerFeedSyncupService;
        } else {
            "no implement IDramaInnerFeedSyncupService".toString();
            throw new IllegalStateException("no implement IDramaInnerFeedSyncupService");
        }
    }
}
