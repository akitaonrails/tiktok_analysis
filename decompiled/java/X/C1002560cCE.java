package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002560cCE extends C09AY implements Function0<InterfaceC1040510dBR> {
    public C1002560cCE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0d70, X.0dBR] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1040510dBR invoke() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
    }
}
