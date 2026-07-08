package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840430xzd {
    public static volatile boolean LIZIZ;
    public static int LIZLLL;
    public static final C1840430xzd LIZ = new C1840430xzd();
    public static String LIZJ = "";
    public static String LJ = "";
    public static String LJFF = "";

    public static void LIZ(Context context, String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshWidget [");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        C1840380xzY.LIZ.getClass();
        C01GW c01gw = C1840380xzY.LJ;
        long j = ((Keva) c01gw.getValue()).getLong("widgetVersionKey", 0L);
        C844470XAv.LIZ.getClass();
        if (j == C844470XAv.LJ() && Intrinsics.LJFF(((Keva) c01gw.getValue()).getString("widgetUserKey", ""), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId())) {
            z = false;
        } else {
            z = true;
        }
        long jLJ = C844470XAv.LJ();
        if (jLJ != 0) {
            ((Keva) c01gw.getValue()).storeLong("widgetVersionKey", jLJ);
        }
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        if (!Intrinsics.LJFF(curUserId, C1840380xzY.LJFF)) {
            ((Keva) c01gw.getValue()).storeString("widgetUserKey", curUserId);
        }
        if (z) {
            C1840380xzY.LIZJ(context, C13LQ.LJJZZIII(C1840380xzY.LIZ(context)));
        } else {
            C1840380xzY.LIZJ(context, new ArrayList());
        }
    }
}
