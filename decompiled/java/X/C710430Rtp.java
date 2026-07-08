package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710430Rtp extends C09AY implements Function0<ISeriesInnerFeedPreloadService> {
    public C710430Rtp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISeriesInnerFeedPreloadService invoke() {
        return ServiceManager.get().getService(ISeriesInnerFeedPreloadService.class);
    }
}
