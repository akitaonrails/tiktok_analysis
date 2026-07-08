package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589040rSA extends C09AY implements Function0<IAccountService> {
    public C1589040rSA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IAccountService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAccountService invoke() {
        return ServiceManager.get().getService(IAccountService.class);
    }
}
