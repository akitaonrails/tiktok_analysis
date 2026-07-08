package X;

import com.bytedance.touchpoint.api.ISafeGuardReporter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01U8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01U8 extends C09AY implements Function0<ISafeGuardReporter> {
    public C01U8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.touchpoint.api.ISafeGuardReporter, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISafeGuardReporter invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ISafeGuardReporter.class, false, false, false, 14, null);
    }
}
