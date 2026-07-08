package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService;

/* JADX INFO: renamed from: X.0rlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600850rlD implements IMiniDramaFeedAwemeSyncService {
    public static final C1600850rlD LIZIZ = new C1600850rlD();
    public final /* synthetic */ IMiniDramaFeedAwemeSyncService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService
    public final Aweme LIZIZ(Aweme aweme, Aweme aweme2) {
        return this.LIZ.LIZIZ(aweme, aweme2);
    }

    public C1600850rlD() {
        IMiniDramaFeedAwemeSyncService iMiniDramaFeedAwemeSyncService = (IMiniDramaFeedAwemeSyncService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaFeedAwemeSyncService.class, false, false, false, 14, null);
        if (iMiniDramaFeedAwemeSyncService != null) {
            this.LIZ = iMiniDramaFeedAwemeSyncService;
        } else {
            "no implement IMiniDramaFeedAwemeSyncService".toString();
            throw new IllegalStateException("no implement IMiniDramaFeedAwemeSyncService");
        }
    }
}
