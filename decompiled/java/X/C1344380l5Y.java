package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0l5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344380l5Y {
    public static final C1344380l5Y LIZ = new C1344380l5Y();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(603));

    public static List LIZ() {
        Keva keva = (Keva) LIZIZ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("author_side_first_comment_aid");
        sbLIZ.append(curUserId);
        return new ArrayList(a0.LJJLIIIJILLIZJL(keva.getString(C2188811AlT.LIZIZ(sbLIZ), ""), new String[]{","}, 0, 6));
    }

    public static boolean LIZIZ(Aweme aweme, String str, String str2) {
        String uid;
        User author;
        if (str == null) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "personal_homepage");
        if ((Intrinsics.LJFF(str, "notification_page") && C1533610q0l.LIZIZ(str2)) || zLJFF) {
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                return true;
            }
        }
        return false;
    }
}
