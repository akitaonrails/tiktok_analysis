package X;

import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987750boL extends C09AY implements Function0<IAdsPreviewService> {
    public C987750boL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAdsPreviewService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IAdsPreviewService.class, false, false, false, 14, null);
    }
}
