package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;

/* JADX INFO: renamed from: X.0sDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618670sDx {
    public static boolean LIZIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !((AccountUserService) C0XQ7.LJFF()).LIZ() && Keva.getRepo("account_security_keva_name").getBoolean(LIZ("safe_info_need_show_"), false);
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
