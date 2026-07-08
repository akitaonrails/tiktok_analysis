package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS96S1000000_11;

/* JADX INFO: renamed from: X.0Rx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712440Rx4 {
    public static String LIZ(Aweme aweme) {
        Aweme awemeLIZJ = LIZJ(aweme);
        if (awemeLIZJ != null) {
            return awemeLIZJ.getAid();
        }
        return null;
    }

    public static Aweme LIZJ(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        if (C729510SjV.LJJIIZ(aweme)) {
            if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null) {
                return (Aweme) C13LP.LJJJLL(stories);
            }
            return null;
        }
        return aweme;
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C729510SjV.LJJII((Aweme) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C712450Rx5((Aweme) it2.next()));
        }
        return new ArrayList(arrayList2);
    }

    public static StoryGuideCardShareViewModel LIZIZ(String str, Fragment fragment) {
        if (str.length() != 0 && fragment != null) {
            return (StoryGuideCardShareViewModel) new C736950SvV(C13LE.LIZ(StoryGuideCardShareViewModel.class), new AwS96S1000000_11(str, 1), new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS243S0000000_11.get$arr$(784), null, null, null).getValue();
        }
        return null;
    }
}
