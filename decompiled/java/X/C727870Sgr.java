package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727870Sgr {
    public static final void LIZ(String str) {
        Aweme next;
        List<Aweme> stories;
        new MineUserStoryFetcher();
        Aweme awemeLIZ = MineUserStoryFetcher.LIZ();
        UserStory userStory = awemeLIZ.getUserStory();
        Aweme aweme = null;
        if (userStory != null && (stories = userStory.getStories()) != null) {
            Iterator<Aweme> it2 = stories.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getAid(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        if (next != null) {
            UserStory userStory2 = awemeLIZ.getUserStory();
            if (userStory2 != null) {
                userStory2.getStories().remove(next);
                userStory2.setTotalCount(userStory2.getTotalCount() - 1);
                LIZIZ(new AwS590S0100000_11(userStory2, 558));
                return;
            }
            return;
        }
        Iterator<Aweme> it3 = C1618440sDa.LIZIZ.LJJIFFI().LJIIIZ().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Aweme next2 = it3.next();
            if (Intrinsics.LJFF(next2.getAid(), str)) {
                aweme = next2;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            C1618440sDa.LIZIZ.LJJIFFI().LJI(AwemeBizExtKt.getScheduleId(aweme2), true);
            UserStory userStory3 = awemeLIZ.getUserStory();
            if (userStory3 != null) {
                userStory3.setTotalCount(userStory3.getTotalCount() - 1);
                LIZIZ(new AwS590S0100000_11(userStory3, 559));
            }
        }
    }

    public static final void LIZIZ(Function1<? super UserStory, UserStory> function1) {
        UserStory userStory;
        User author;
        UserAllStoryMetadata allStoryMetadata;
        C1615006Ua.LIZ.getClass();
        if (C1615006Ua.LIZIZ == null) {
            C1615006Ua.LIZIZ = C1615006Ua.LIZIZ();
        }
        Aweme awemeM199clone = C1615006Ua.LIZIZ.m199clone();
        UserStory userStoryInvoke = function1.invoke(awemeM199clone.getUserStory());
        if (userStoryInvoke == awemeM199clone.getUserStory()) {
            C2344809Gs.LIZ(new IllegalArgumentException("Must copy"));
        }
        if (!userStoryInvoke.getFakeAwemeShell()) {
            if (C1615006Ua.LJI(userStoryInvoke)) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("MineStoryDiskCache", "updateMineUserStory: skip empty overwrite (cold-start protection)");
                return;
            }
            Aweme aweme = C1615006Ua.LIZIZ;
            if (aweme != null) {
                userStory = aweme.getUserStory();
            } else {
                userStory = null;
            }
            Aweme aweme2 = C1615006Ua.LIZIZ;
            if (aweme2 != null) {
                aweme2.setUserStory(userStoryInvoke);
            }
            Aweme aweme3 = C1615006Ua.LIZIZ;
            if (aweme3 != null && (author = aweme3.getAuthor()) != null && (allStoryMetadata = author.getAllStoryMetadata()) != null) {
                allStoryMetadata.updateByUserStory(userStoryInvoke);
            }
            C1615006Ua.LIZLLL(userStoryInvoke);
            C1615006Ua.LIZJ();
            C727150Sfh c727150Sfh = C727150Sfh.LIZLLL;
            Aweme awemeLIZIZ = C1615006Ua.LIZIZ;
            if (awemeLIZIZ == null) {
                awemeLIZIZ = C1615006Ua.LIZIZ();
                awemeLIZIZ.setUserStory(userStoryInvoke);
            }
            c727150Sfh.LIZIZ(userStory, userStoryInvoke, awemeLIZIZ);
        }
    }
}
