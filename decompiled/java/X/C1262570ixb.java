package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ixb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262570ixb {
    public static final C1262570ixb LIZ = new C1262570ixb();
    public static final Keva LIZIZ = Keva.getRepo("rec_user_impression_cache");

    public static void LIZIZ() {
        String uid;
        User userLIZJ = LIZJ();
        if (userLIZJ == null || (uid = userLIZJ.getUid()) == null) {
            return;
        }
        Keva keva = LIZIZ;
        if (keva.getString(LJ(uid), "").length() > 0) {
            keva.erase(LJ(uid));
        }
    }

    public static User LIZJ() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            return ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser();
        }
        return null;
    }

    public static String LIZLLL() {
        String uid;
        User userLIZJ = LIZJ();
        return (userLIZJ == null || (uid = userLIZJ.getUid()) == null) ? "" : a0.LJJJLL(",", LIZIZ.getString(LJ(uid), ""));
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_REC_USER_IMPRESSION");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZ(String str, String str2) {
        String uid;
        LIZ.getClass();
        User userLIZJ = LIZJ();
        if (userLIZJ != null && (uid = userLIZJ.getUid()) != null) {
            Keva keva = LIZIZ;
            String strLJ = LJ(uid);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(keva.getString(LJ(uid), ""));
            sbLIZ.append(str);
            sbLIZ.append(':');
            sbLIZ.append(str2);
            sbLIZ.append(',');
            keva.storeString(strLJ, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
