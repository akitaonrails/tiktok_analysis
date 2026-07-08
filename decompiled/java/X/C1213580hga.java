package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213580hga {
    public static final C1213580hga LIZ = new C1213580hga();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(778));
    public static boolean LIZJ;

    public static boolean LIZIZ() {
        boolean z = false;
        try {
            z = ((Keva) LIZIZ.getValue()).getBoolean(LIZ("smart_text_sticker_disabled_permanently"), false);
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static String LIZ(String str) {
        String uid;
        IAccountUserService iAccountUserServiceLJFF;
        User curUser;
        try {
            iAccountUserServiceLJFF = C0XQ7.LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            uid = curUser.getUid();
        } else {
            uid = null;
        }
        if (uid != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(uid);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return str;
    }
}
