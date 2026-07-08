package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import java.util.List;

/* JADX INFO: renamed from: X.051N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051N {
    public static final Keva LIZ = Keva.getRepo("business_quick_reply_repo");

    public static List LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C13BV.INSTANCE;
        }
        try {
            return C13LP.LLIIII(C051M.LIZLLL(IMQuickReply[].class, LIZ.getString(str, ""), false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load exception: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return C13BV.INSTANCE;
        }
    }

    public static void LIZIZ(String str, List list) {
        if (str.length() == 0) {
            return;
        }
        try {
            LIZ.storeString(str, C051M.LJ(list, false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store exception: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
