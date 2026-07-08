package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Calendar;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0ML6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ML6 {
    public static final C0ML6 LIZ = new C0ML6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(38));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(651));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LIZJ() {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_last_publish_time_");
        sbLIZ.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        long j = kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long time = calendar.getTime().getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 999);
        return j > time && j < calendar2.getTime().getTime();
    }

    public static boolean LIZIZ(int i) {
        if (System.currentTimeMillis() - LIZ().getLong("recall_local_auth_dialog_click_not_allow_time", 0L) > ((long) i) * ((long) 86400000)) {
            return true;
        }
        return false;
    }
}
