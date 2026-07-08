package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0iLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239130iLn {
    public static final C1239130iLn LIZ = new C1239130iLn();
    public static boolean LIZIZ;

    public static boolean LIZ() {
        return C13LQ.LJJIJIIJI(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase(), new String[]{"MY", "PK", "BD"}) >= 0;
    }
}
