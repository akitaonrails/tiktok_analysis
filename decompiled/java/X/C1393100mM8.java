package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393100mM8 {
    public static final int LIZ(User user) {
        if (user == null) {
            return 2131848329;
        }
        if (LIZIZ(user)) {
            C1610870s1N.LIZ.getClass();
            if (C1610870s1N.LIZIZ()) {
                return 2131848330;
            }
            return 2131837841;
        }
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZIZ()) {
            return 2131848329;
        }
        return 2131837840;
    }

    public static final boolean LIZIZ(User user) {
        if (user == null) {
            return false;
        }
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZLLL()) {
            if (!user.isMutedLives() && !user.isMutedStory() && !user.isMutedNonStoryPost()) {
                return false;
            }
            return true;
        }
        return user.isMuted();
    }

    public static final void LJFF(User user) {
        if (user == null) {
            return;
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        Boolean boolB2 = c1589640rT8.b2(uid, EnumC1392960mLu.STORIES);
        if (boolB2 != null) {
            user.setIsMuteStory(boolB2.booleanValue());
        }
        String uid2 = user.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        Boolean boolB22 = c1589640rT8.b2(uid2, EnumC1392960mLu.POSTS);
        if (boolB22 != null) {
            user.setIsMuteNonStoryPost(boolB22.booleanValue());
        }
        String uid3 = user.getUid();
        if (uid3 == null) {
            uid3 = "";
        }
        Boolean boolB23 = c1589640rT8.b2(uid3, EnumC1392960mLu.LIVES);
        if (boolB23 != null) {
            user.setIsMuteLives(boolB23.booleanValue());
        }
        String uid4 = user.getUid();
        if (uid4 != null) {
            str = uid4;
        }
        Boolean boolB24 = c1589640rT8.b2(str, EnumC1392960mLu.ALL);
        if (boolB24 != null) {
            user.setIsMute(boolB24.booleanValue());
        }
    }

    public static final void LIZJ(User user, EnumC1392960mLu enumC1392960mLu, boolean z) {
        if (user == null) {
            return;
        }
        int i = C1393090mM7.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        user.setIsMuteNonStoryPost(z);
                        return;
                    }
                    throw new C1954807lC();
                }
                user.setIsMuteLives(z);
                return;
            }
            user.setIsMuteStory(z);
            return;
        }
        user.setIsMute(z);
    }

    public static final boolean LIZLLL(Aweme aweme, String str, EnumC1392960mLu enumC1392960mLu) {
        if (aweme == null || str == null || enumC1392960mLu == null || !Intrinsics.LJFF(str, AwemeExtKt.getAuthorUid(aweme))) {
            return false;
        }
        C1610870s1N.LIZ.getClass();
        boolean zLIZIZ = C1610870s1N.LIZIZ();
        int i = C1393090mM7.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (aweme.getIsTikTokStory() || aweme.getAwemeType() == 40 || AwemeSaaSExtKt.isLive(aweme)) {
                            return false;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    return AwemeSaaSExtKt.isLive(aweme);
                }
            } else if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
                return false;
            }
        } else if (!zLIZIZ && AwemeSaaSExtKt.isLive(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme, String str, Set<? extends EnumC1392960mLu> set) {
        if (!set.isEmpty()) {
            Iterator<? extends EnumC1392960mLu> it2 = set.iterator();
            while (it2.hasNext()) {
                if (LIZLLL(aweme, str, it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
