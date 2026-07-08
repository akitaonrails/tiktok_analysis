package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusDebugToolService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NY5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NY5 extends C09AY implements Function0<ActivityStatusDebugToolService> {
    public C0NY5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusDebugToolService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusDebugToolService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(ActivityStatusDebugToolService.class);
    }
}
