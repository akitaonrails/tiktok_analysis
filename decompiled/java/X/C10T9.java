package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10T9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10T9 extends C09AY implements Function0<IRegistrationAgeGateService> {
    public C10T9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IRegistrationAgeGateService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IRegistrationAgeGateService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IRegistrationAgeGateService.class, false, false, false, 14, null);
    }
}
