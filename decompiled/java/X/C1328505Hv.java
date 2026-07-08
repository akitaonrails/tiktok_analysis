package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1328505Hv extends C09AY implements Function0<IAccountService> {
    public C1328505Hv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IAccountService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAccountService invoke() {
        return ServiceManager.get().getService(IAccountService.class);
    }
}
