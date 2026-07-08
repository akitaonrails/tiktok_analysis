package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19391710tn extends C09AY implements Function0<FeedCommonService> {
    public C19391710tn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.FeedCommonService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedCommonService invoke() {
        return ServiceManager.get().getService(FeedCommonService.class);
    }
}
