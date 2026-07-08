package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0O2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612910O2f {
    public static final C612910O2f LIZ;
    public static final Keva LIZIZ;

    static {
        C612910O2f c612910O2f = new C612910O2f();
        LIZ = c612910O2f;
        LIZIZ = Keva.getRepo("pro_eu_stem");
        EventBus.LIZLLL().LJIJJ(c612910O2f);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onStemFeedUpdateEvent$spec_act_release(C612920O2g c612920O2g) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        boolean z = true;
        if (c612920O2g == null || (c612920O2g.LIZ != 1 && c612920O2g.LIZ != 2)) {
            z = false;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = null;
        }
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_stem_status");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
