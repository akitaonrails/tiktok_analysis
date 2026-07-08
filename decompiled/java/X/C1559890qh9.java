package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559890qh9 extends C09AY implements Function0<ILiveOuterService> {
    public C1559890qh9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.live.ILiveOuterService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILiveOuterService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
    }
}
