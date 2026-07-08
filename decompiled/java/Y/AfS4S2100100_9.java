package Y;

import X.C09JN;
import X.C1C7U;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class AfS4S2100100_9 implements C09JN {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S2100100_9 afS4S2100100_9, Object obj) {
        C1C7U.LIZ("StoryFeedViewModel@f54f.loadHighlightsFeed$2");
        Set<String> set = ((StoryFeedViewModel) afS4S2100100_9.l2).LLJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS4S2100100_9.s0);
        sbLIZ.append(afS4S2100100_9.j3);
        set.remove(C2188811AlT.LIZIZ(sbLIZ));
        ((StoryFeedViewModel) afS4S2100100_9.l2).PQ2(afS4S2100100_9.s0, afS4S2100100_9.s1);
        ((StoryFeedViewModel) afS4S2100100_9.l2).zQ2(null, "LOAD_USER_STORY_FAIL");
        C1C7U.LIZIZ("StoryFeedViewModel@f54f.loadHighlightsFeed$2");
    }

    public static final void accept$1(AfS4S2100100_9 afS4S2100100_9, Object obj) {
        C1C7U.LIZ("StoryFeedViewModel@f54f.load$2");
        Set<String> set = ((StoryFeedViewModel) afS4S2100100_9.l2).LLJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS4S2100100_9.s0);
        sbLIZ.append(afS4S2100100_9.j3);
        set.remove(C2188811AlT.LIZIZ(sbLIZ));
        ((StoryFeedViewModel) afS4S2100100_9.l2).PQ2(afS4S2100100_9.s0, afS4S2100100_9.s1);
        ((StoryFeedViewModel) afS4S2100100_9.l2).zQ2(null, "LOAD_USER_STORY_FAIL");
        C1C7U.LIZIZ("StoryFeedViewModel@f54f.load$2");
    }

    public AfS4S2100100_9(StoryFeedViewModel storyFeedViewModel, String str, long j, String str2, int i) {
        this.$t = i;
        this.l2 = storyFeedViewModel;
        this.s0 = str;
        this.j3 = j;
        this.s1 = str2;
    }
}
