package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qe6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558000qe6 extends C09AY implements Function0<IVibeFeedService> {
    public C1558000qe6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IVibeFeedService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IVibeFeedService.class, false, false, false, 14, null);
    }
}
