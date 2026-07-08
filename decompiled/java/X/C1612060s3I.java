package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService;

/* JADX INFO: renamed from: X.0s3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612060s3I implements IMiniDramaAwemeCacheService {
    public static final C1612060s3I LIZIZ = new C1612060s3I();
    public final /* synthetic */ IMiniDramaAwemeCacheService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final String LIZ(long j, long j2, String str, String str2) {
        return this.LIZ.LIZ(j, j2, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final Aweme LIZIZ(Long l, String str, String str2) {
        return this.LIZ.LIZIZ(l, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final String LIZJ(long j, String str) {
        return this.LIZ.LIZJ(j, str);
    }

    public C1612060s3I() {
        IMiniDramaAwemeCacheService iMiniDramaAwemeCacheService = (IMiniDramaAwemeCacheService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaAwemeCacheService.class, false, false, false, 14, null);
        if (iMiniDramaAwemeCacheService != null) {
            this.LIZ = iMiniDramaAwemeCacheService;
        } else {
            "no implement IMiniDramaAwemeCacheService".toString();
            throw new IllegalStateException("no implement IMiniDramaAwemeCacheService");
        }
    }
}
