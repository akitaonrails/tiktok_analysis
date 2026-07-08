package X;

import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849690XUx {
    public static void LIZ(String str, String str2) {
        String uid;
        String uid2;
        String string;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        C849700XUy.LIZ.getClass();
        User user = C10EU.LIZ;
        if (user == null) {
            C0XQ7.LJFF();
            uid = AbstractC848400XPy.LJJIIZ();
        } else {
            uid = user.getUid();
        }
        c0xgr.LIZ(!Intrinsics.LJFF(uid, "") ? 1 : 0, "prev_logged");
        User user2 = C10EU.LIZ;
        if (user2 == null) {
            C0XQ7.LJFF();
            uid2 = AbstractC848400XPy.LJJIIZ();
        } else {
            uid2 = user2.getUid();
        }
        if (!Intrinsics.LJFF(uid2, "")) {
            BaseLoginMethod baseLoginMethodLJFF = C0XUE.LIZ.LJFF();
            if (baseLoginMethodLJFF instanceof TPLoginMethod) {
                string = ((TPLoginMethod) baseLoginMethodLJFF).getPlatform();
            } else {
                string = baseLoginMethodLJFF.getLoginMethodName().toString();
            }
        } else {
            string = "none";
        }
        c0xgr.LIZJ("prev_login_method", string);
        C20684815ws.LJIILLIIL("show_google_onetap", c0xgr.LIZ);
    }
}
