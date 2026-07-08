package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.01WK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01WK {
    public static final C01WK LIZ = new C01WK();

    public static String LIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }
}
