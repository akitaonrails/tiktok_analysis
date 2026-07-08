package X;

import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740330T2h extends C09AY implements Function0<IFeedAdService> {
    public C740330T2h() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.feed.IFeedAdService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedAdService invoke() {
        return ServiceManager.get().getService(IFeedAdService.class);
    }
}
