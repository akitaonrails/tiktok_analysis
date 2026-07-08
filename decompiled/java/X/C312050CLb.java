package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0CLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312050CLb {
    public static final C312050CLb LIZ = new C312050CLb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0BVR());

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        User curUser;
        if (C1902710zc5.LIZJ() || (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) == null) {
            return false;
        }
        return ((LIZ() == 2 || LIZ() == 3) && curUser.getFriendCount() > 5) || (LIZ() == 4 && curUser.historyMaxFollowerCount >= 10000);
    }
}
