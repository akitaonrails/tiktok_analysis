package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeCacheService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366750lfd extends C09AY implements Function0<IVibeCacheService> {
    public C1366750lfd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.vibefeed.service.IVibeCacheService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IVibeCacheService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IVibeCacheService.class, false, false, false, 14, null);
    }
}
