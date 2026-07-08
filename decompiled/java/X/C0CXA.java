package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CXA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Function1 function1) {
        Long lValueOf;
        UserStory userStory;
        List<? extends Aweme> listLJJJJLI;
        IStoryPreloaderV2 iStoryPreloaderV2LJJLI;
        UserStory userStory2;
        List<Aweme> stories;
        UserStory userStory3;
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        Aweme awemeLJIIIZ = c1618440sDa.LJJLIIIJLJLI().LJIIIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadStory： ");
        Integer numValueOf = null;
        if (awemeLJIIIZ != null && (userStory3 = awemeLJIIIZ.getUserStory()) != null) {
            lValueOf = Long.valueOf(userStory3.getCurrentPosition());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" size=");
        if (awemeLJIIIZ != null && (userStory2 = awemeLJIIIZ.getUserStory()) != null && (stories = userStory2.getStories()) != null) {
            numValueOf = Integer.valueOf(stories.size());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (awemeLJIIIZ != null && (userStory = awemeLJIIIZ.getUserStory()) != null && userStory.getStories() != null) {
            List listLJJLIIIJ = c1618440sDa.LJJLIIIJ(((Number) C0BNY.LIZ.getValue()).intValue(), awemeLJIIIZ);
            if (listLJJLIIIJ == null || (listLJJJJLI = C13LP.LJJJJLI(listLJJLIIIJ)) == null) {
                listLJJJJLI = C13BV.INSTANCE;
            }
            if (!listLJJJJLI.isEmpty() && (iStoryPreloaderV2LJJLI = c1618440sDa.LJJLI()) != null) {
                iStoryPreloaderV2LJJLI.LIZ(listLJJJJLI, new C325780Cps(0, EnumC325770Cpr.TOP_CELL, 63), function1);
            }
        }
    }
}
