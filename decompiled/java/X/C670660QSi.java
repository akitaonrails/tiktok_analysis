package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670660QSi extends C09AY implements Function0<IAccountUserService> {
    public C670660QSi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAccountUserService invoke() {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            return iAccountService.LJIIJ();
        }
        return null;
    }
}
