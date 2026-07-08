package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.UserStreakInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566206Bg {
    public static final String LIZ(StreakData streakData) {
        String str = streakData.convId;
        if (str != null && C123100dR.LIZ(str)) {
            return str;
        }
        return C0YNP.LJ(LIZIZ(streakData));
    }

    public static final String LIZIZ(StreakData streakData) {
        UserStreakInfo next;
        String string;
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        List<UserStreakInfo> list = streakData.userStreak;
        if (list != null) {
            Iterator<UserStreakInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!Intrinsics.LJFF(String.valueOf(next.uid), curUserId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            UserStreakInfo userStreakInfo = next;
            if (userStreakInfo != null && (string = Long.valueOf(userStreakInfo.uid).toString()) != null) {
                return string;
            }
        }
        return "";
    }
}
