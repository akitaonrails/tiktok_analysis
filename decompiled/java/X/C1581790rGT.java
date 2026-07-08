package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581790rGT extends C09AY implements Function0<IMainService> {
    public C1581790rGT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IMainService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMainService invoke() {
        ?? PluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (PluggableSpi$default != 0) {
            return PluggableSpi$default;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
