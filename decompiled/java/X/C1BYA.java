package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.LockHelperApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BYA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYA extends C09AY implements Function0<LockHelperApi> {
    public C1BYA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.performanceopt.api.LockHelperApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LockHelperApi invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(LockHelperApi.class);
    }
}
