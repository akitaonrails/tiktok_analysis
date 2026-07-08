package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A1C, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1C extends C09AY implements Function0<IEarlyFeedbackService> {
    public C1A1C() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IEarlyFeedbackService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IEarlyFeedbackService.class, false, false, false, 14, null);
    }
}
