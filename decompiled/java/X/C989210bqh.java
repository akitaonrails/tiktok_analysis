package X;

import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989210bqh extends C09AY implements Function0<InterfaceC1000280c8Y> {
    public C989210bqh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0bpY, X.0c8Y] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1000280c8Y invoke() {
        ?? Q = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if (Q instanceof InterfaceC1000280c8Y) {
            return Q;
        }
        return null;
    }
}
