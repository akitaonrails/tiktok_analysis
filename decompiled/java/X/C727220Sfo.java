package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.feed.model.story.highlights.SkylightHighlightAwemeInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727220Sfo {
    public static SkylightHighlightsItem LIZ(HighlightSkylightUser highlightSkylightUser, int i) {
        List<SkylightHighlightAwemeInfo> list;
        boolean z;
        int size;
        boolean z2;
        boolean z3;
        String string;
        String string2;
        Long l = highlightSkylightUser.userId;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        List<Aweme> list2 = highlightSkylightUser.highlights;
        if (list2 == null || (list = highlightSkylightUser.userHighlights) == null || list2.isEmpty() || list.isEmpty()) {
            return null;
        }
        if (!list.isEmpty()) {
            Iterator<SkylightHighlightAwemeInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                Boolean boolIsViewed = it2.next().isViewed();
                if (boolIsViewed == null || !boolIsViewed.booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        String aid = ((Aweme) C13LP.LJJJJZI(list2)).getAid();
        String aid2 = ((Aweme) C13LP.LJJLIIIJJI(list2)).getAid();
        int size2 = list.size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size2; i4++) {
            Long l2 = ((SkylightHighlightAwemeInfo) ListProtector.get(list, i4)).awemeId;
            if (l2 != null) {
                string = l2.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(aid, string)) {
                i2 = i4;
            }
            Long l3 = ((SkylightHighlightAwemeInfo) ListProtector.get(list, i4)).awemeId;
            if (l3 != null) {
                string2 = l3.toString();
            } else {
                string2 = null;
            }
            if (Intrinsics.LJFF(aid2, string2)) {
                i3 = i4;
            }
        }
        Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        if (((Number) pair.getFirst()).intValue() != -1 && ((Number) pair.getSecond()).intValue() != -1) {
            size = list.size();
        } else {
            size = list2.size();
        }
        Aweme awemeM199clone = new Aweme().m199clone();
        if (awemeM199clone == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highlight");
        sbLIZ.append(jLongValue);
        awemeM199clone.setAid(C2188811AlT.LIZIZ(sbLIZ));
        awemeM199clone.setStory(null);
        ArrayList arrayList = new ArrayList(list2);
        long j = size;
        long jIntValue = ((Number) pair.getFirst()).intValue();
        if (((Number) pair.getFirst()).intValue() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Number) pair.getSecond()).intValue() != size - 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        User author = null;
        awemeM199clone.setUserStory(new UserStory(arrayList, j, jIntValue, z, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), z3, z2, 0L, false, null, null, false, highlightSkylightUser, 0L, new UserStoryCurrentInfo(null, null, 0), false, true, new UserStoryCurrentInfo(-1, null, 0), (int) jIntValue, false, 0L, null, false));
        awemeM199clone.setAwemeType(40);
        Aweme aweme = (Aweme) C13LP.LJJJLL(list2);
        if (aweme != null) {
            author = aweme.getAuthor();
        }
        awemeM199clone.setAuthor(author);
        awemeM199clone.setIsTikTokStory(true);
        return new SkylightHighlightsItem(awemeM199clone, list, i, 0);
    }
}
