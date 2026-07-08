package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452109jD {
    public static final C2452109jD LIZ = new C2452109jD();
    public static final IAccountService LIZIZ;
    public static final String LIZJ;
    public static final Keva LIZLLL;
    public static final C01GW LJ;

    static {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        LIZIZ = iAccountService;
        String curUserId = iAccountService.LJIIJ().getCurUserId();
        LIZJ = curUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("email_auth_dialog");
        sbLIZ.append(curUserId);
        LIZLLL = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }
}
