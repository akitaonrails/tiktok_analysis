package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0rdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595950rdJ {
    public static String LIZ(InterfaceC1595240rcA interfaceC1595240rcA) {
        User user;
        if (interfaceC1595240rcA.getUser() == null || (user = interfaceC1595240rcA.getUser()) == null) {
            return null;
        }
        return user.getUid();
    }

    public static boolean LIZIZ(InterfaceC1595240rcA interfaceC1595240rcA) {
        if (interfaceC1595240rcA.getUser() == null) {
            return true;
        }
        User user = interfaceC1595240rcA.getUser();
        if (user != null && user.getFollowStatus() == 0) {
            return true;
        }
        return false;
    }
}
