package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;

/* JADX INFO: renamed from: X.05qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1476605qG {
    public static final C1476605qG LIZ = new C1476605qG();

    public static boolean LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return !(KevaImpl.getRepo(C786410Ut5.j4("inbox_land_%s", Arrays.copyOf(new Object[]{uid}, 1)), 1).getStringArray("land_inbox_time_array", new String[0]).length == 0);
    }
}
