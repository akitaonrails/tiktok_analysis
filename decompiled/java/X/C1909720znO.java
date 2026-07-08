package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0znO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909720znO extends C09AY implements Function0<IAccountUserService> {
    public C1909720znO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAccountUserService invoke() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
    }
}
