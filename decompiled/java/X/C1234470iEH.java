package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234470iEH {
    public static final C1234470iEH LIZ = new C1234470iEH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3137));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(630));
    public static boolean LIZLLL = true;

    public static boolean LIZ() {
        User curUser;
        if (!((Boolean) LIZJ.getValue()).booleanValue()) {
            return false;
        }
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
        return abstractC848400XPy.isLogin() && (curUser = abstractC848400XPy.getCurUser()) != null && (curUser.isAccuratePrivateAccount() ^ true);
    }
}
