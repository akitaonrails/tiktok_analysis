package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0ORe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619400ORe {
    public static final /* synthetic */ int LIZ = 0;

    public static User LIZ(String str) {
        boolean z;
        C619420ORg c619420ORg;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c619420ORg = (C619420ORg) C2240408qA.LIZ(str, new TypeToken<C619420ORg>() { // from class: X.0ORf
        }.getType())) == null) {
            return null;
        }
        User user = new User();
        user.setUid(c619420ORg.LIZ);
        user.setNickname(c619420ORg.LIZIZ);
        user.setAvatarThumb(c619420ORg.LIZJ);
        return user;
    }

    public static C619390ORd LIZIZ(User user) {
        try {
            String uid = user.getUid();
            if (uid != null) {
                return new C619390ORd(uid, LIZJ(user));
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convertToBulletinExtraDB Error. ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static String LIZJ(User user) {
        if (user == null) {
            return null;
        }
        C619420ORg c619420ORg = new C619420ORg(user.getUid(), user.getNickname(), user.getAvatarThumb());
        C1227904rF.LIZ.getClass();
        return C1227904rF.LJI(c619420ORg);
    }
}
