package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HJ {
    public static final C10HJ LIZ = new C10HJ();
    public static final Keva LIZIZ = Keva.getRepo("comment_filter_setting");

    public static int LIZ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_filter_all_expired_");
        sbLIZ.append(LIZIZ());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), C06TC.NOT_ON.getValue());
    }

    public static String LIZIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }

    public static void LIZJ(int i) {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_filter_all_expired_");
        sbLIZ.append(LIZIZ());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }
}
