package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C146900hH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Pair... pairArr) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        for (Pair pair : pairArr) {
            c474500IjALIZ.LJJII(pair.getSecond(), (String) pair.getFirst());
        }
        c474500IjALIZ.LIZ();
    }
}
