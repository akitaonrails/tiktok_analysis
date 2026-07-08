package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590250rU7 extends C09AY implements Function0<IUnKnownOwnershipBusinessOuterService> {
    public C1590250rU7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IUnKnownOwnershipBusinessOuterService invoke() {
        ?? PluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
        if (PluggableSpi$default != 0) {
            return PluggableSpi$default;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
