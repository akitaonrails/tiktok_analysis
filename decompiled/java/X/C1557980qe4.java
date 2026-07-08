package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qe4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557980qe4 extends C09AY implements Function0<IVibeEntranceService> {
    public C1557980qe4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IVibeEntranceService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IVibeEntranceService.class, false, false, false, 14, null);
    }
}
