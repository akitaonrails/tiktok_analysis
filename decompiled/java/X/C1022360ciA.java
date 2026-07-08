package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ciA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022360ciA extends C09AY implements Function0<InterfaceC1030370cv5> {
    public C1022360ciA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0cv5, X.0d70] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1030370cv5 invoke() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
    }
}
