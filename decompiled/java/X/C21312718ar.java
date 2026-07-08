package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.consume.playnum.UserPlayData;

/* JADX INFO: renamed from: X.18ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21312718ar {
    public static final C21312718ar LIZ = new C21312718ar();
    public static final C21312618aq LIZIZ;
    public static final IAccountService LIZJ;
    public static UserPlayData LIZLLL;

    static {
        C21312618aq c21312618aq = new C21312618aq();
        LIZIZ = c21312618aq;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        LIZJ = iAccountService;
        LIZLLL = c21312618aq.LIZ(iAccountService.LJIIJ().getCurUserId());
    }
}
