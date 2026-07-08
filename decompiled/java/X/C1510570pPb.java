package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510570pPb {
    public static final C1510570pPb LIZ = new C1510570pPb();
    public static volatile String LIZIZ;

    static {
        String uid;
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        LIZIZ = uid;
        C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0pPd
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid2;
                C1510570pPb c1510570pPb = C1510570pPb.LIZ;
                if (user2 == null || (uid2 = user2.getUid()) == null) {
                    uid2 = "";
                }
                C1510570pPb.LIZIZ = uid2;
            }
        });
    }

    public static JSONObject LIZ() {
        String strLIZIZ = C0R1F.LIZIZ(LIZIZ("idle_detection_phone_weekday_hour_pairs"));
        if (strLIZIZ.length() == 0) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONObject();
        }
    }

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
