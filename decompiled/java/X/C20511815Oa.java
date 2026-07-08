package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20511815Oa extends C09AY implements Function0<IUnKnownOwnershipBusinessOuterService> {
    public C20511815Oa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IUnKnownOwnershipBusinessOuterService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
    }
}
