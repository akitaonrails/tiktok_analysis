package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.14hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20337514hx {
    public static final C20337514hx LIZ = new C20337514hx();
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS221S0000000_31.get$arr$(554));

    public static int LIZIZ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_num_without_click");
        sbLIZ.append("uid:");
        sbLIZ.append(currentUserID);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static long LIZ(String str) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("uid:");
        sbLIZ.append(currentUserID);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static void LIZJ(long j) {
        LIZLLL(j, "departure_time");
    }

    public static void LJ(int i) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_num_without_click");
        sbLIZ.append("uid:");
        sbLIZ.append(currentUserID);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static void LIZLLL(long j, String str) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("uid:");
        sbLIZ.append(currentUserID);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
