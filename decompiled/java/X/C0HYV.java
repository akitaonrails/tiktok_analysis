package X;

import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYV extends C09AY implements Function0<IForceBindingAccountService> {
    public C0HYV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IForceBindingAccountService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IForceBindingAccountService invoke() {
        return ServiceManager.get().getService(IForceBindingAccountService.class);
    }
}
