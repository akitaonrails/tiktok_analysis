package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024200cl8 extends C09AY implements Function0<IAccountUserService> {
    public C1024200cl8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAccountUserService invoke() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
    }
}
