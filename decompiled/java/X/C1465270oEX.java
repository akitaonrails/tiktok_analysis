package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0oEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1465270oEX implements InterfaceC1631430sYX {
    public static final int LIZ() {
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null) {
            return 0;
        }
        return curUser.getFollowerCount();
    }
}
