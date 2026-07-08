package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;

/* JADX INFO: renamed from: X.07kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1952907kt {
    public static final C1952907kt LIZ = new C1952907kt();

    public static Keva LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return KevaImpl.getRepo(C786410Ut5.j4("inbox_creator_%s", Arrays.copyOf(new Object[]{uid}, 1)), 1);
    }
}
