package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.100Z, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100Z {
    public static final C100Z LIZ = new C100Z();
    public static final Keva LIZIZ = KevaImpl.getRepo("compliance_frequency_control", 1);

    public static String LIZJ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }

    public static final int LIZ(String str) {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_cnt_");
        sbLIZ.append(LIZJ());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static final long LIZIZ(String str) {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_ts_");
        sbLIZ.append(LIZJ());
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static final void LJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_ts_");
        sbLIZ.append(LIZJ());
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }

    public final void LIZLLL(String str) {
        int iLIZ = LIZ(str);
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_cnt_");
        sbLIZ.append(LIZJ());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLIZ + 1);
    }
}
