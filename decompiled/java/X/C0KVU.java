package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* JADX INFO: renamed from: X.0KVU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVU {
    public static String LIZ(User user) {
        if (user == null) {
            return "";
        }
        return LIZIZ(user.username, user.nickName);
    }

    public static String LIZJ(User user) {
        String strLIZ = LIZ(user);
        if (strLIZ.length() > 14) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ.substring(0, 11));
            sbLIZ.append("...");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZ;
    }

    public static String LIZLLL(User user) {
        if (user == null) {
            return "";
        }
        String str = user.nickName;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.toString();
        return str;
    }

    public static String LJ(User user) {
        if (user == null) {
            return "";
        }
        String str = user.username;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.toString();
        return str;
    }

    public static String LIZIZ(String str, String str2) {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if ((iHostAppContext != null && iHostAppContext.appId() == 1233) || str2 == null || str2.isEmpty()) {
            IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
            if (iHostUser != null && str != null && str2 != null) {
                str = iHostUser.getTTDisPlayName(str, str2);
            }
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        str2.toString();
        return str2;
    }
}
