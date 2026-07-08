package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366610lfP implements InterfaceC586170Myt {
    public static final C1366610lfP LL;
    public static final C01GW LLILLJJLI;
    public static String LLILLL;

    static {
        C1366610lfP c1366610lfP = new C1366610lfP();
        LL = c1366610lfP;
        LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(670));
        LLILLL = C461720I8s.LIZIZ();
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(c1366610lfP);
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        LLILLL = uid;
    }
}
