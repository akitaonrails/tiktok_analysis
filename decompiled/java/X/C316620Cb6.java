package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0Cb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316620Cb6 {
    public static final C316620Cb6 LIZ = new C316620Cb6();

    public static void LIZ(List list) {
        IStoryPreloaderV2 iStoryPreloaderV2LJJLI;
        List<Aweme> stories;
        Object objLJJJLL;
        if (list == null || list.isEmpty() || (iStoryPreloaderV2LJJLI = C1618440sDa.LIZIZ.LJJLI()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UserStory userStory = ((Aweme) it2.next()).getUserStory();
            if (userStory != null && (stories = userStory.getStories()) != null && (objLJJJLL = C13LP.LJJJLL(stories)) != null) {
                arrayList.add(objLJJJLL);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        iStoryPreloaderV2LJJLI.LIZ(arrayList, new C325780Cps(0, EnumC325770Cpr.HIGHLIGHTS, 63), AFwS232S0000000_4.get$arr$(188));
    }
}
