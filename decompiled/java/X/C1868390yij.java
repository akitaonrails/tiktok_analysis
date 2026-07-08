package X;

import com.ss.android.ugc.aweme.comment.experiment.ReverseExposedEmojiConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0yij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868390yij {
    public static final ReverseExposedEmojiConfig LIZ = new ReverseExposedEmojiConfig(0, new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(773));

    public static final boolean LIZ(User user) {
        if (((ReverseExposedEmojiConfig) LIZIZ.getValue()).reverseAll == 1) {
            if (user == null) {
                return true;
            }
            return !((ReverseExposedEmojiConfig) r2.getValue()).relationWhiteList.contains(Integer.valueOf(C736450Suh.LIZ(user)));
        }
        return false;
    }
}
