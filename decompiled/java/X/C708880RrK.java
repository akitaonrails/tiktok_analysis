package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0RrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708880RrK {
    public static final boolean LIZ(Aweme aweme) {
        Story story = aweme.getStory();
        if (story == null || !story.isFaked()) {
            return false;
        }
        return true;
    }

    public static final int LIZJ(UserStory userStory) {
        if (userStory.getShouldStartFromUnViewedStoryIdx()) {
            userStory.setShouldStartFromUnViewedStoryIdx(false);
            return userStory.getFirstUnViewedStoryIdx();
        }
        Integer numCurrentIndex = UserStoryKt.currentIndex(userStory);
        if (numCurrentIndex != null) {
            return numCurrentIndex.intValue();
        }
        return (int) userStory.getCurrentPosition();
    }

    public static final Pair<Integer, Aweme> LIZIZ(List<? extends Aweme> list, int i, UserStory userStory, InterfaceC1631620sYq<? super Integer, ? super List<? extends Aweme>, ? super UserStory, Integer> interfaceC1631620sYq) {
        Integer numInvoke;
        int iNextIndex = -1;
        if (list.isEmpty()) {
            return new Pair<>(-1, null);
        }
        Iterator<? extends Aweme> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (!AwemeBizExtKt.isStoryFakeAweme(it2.next())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        ListIterator<? extends Aweme> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (!AwemeBizExtKt.isStoryFakeAweme(listIterator.previous())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i < i2) {
            i = i2;
        } else if (i2 > i || i > iNextIndex) {
            i = iNextIndex;
        }
        if (interfaceC1631620sYq != null && (numInvoke = interfaceC1631620sYq.invoke(Integer.valueOf(i), list, userStory)) != null) {
            i = numInvoke.intValue();
        }
        int iMin = Math.min(list.size() - 1, Math.max(0, i));
        return new Pair<>(Integer.valueOf(iMin), ListProtector.get(list, iMin));
    }
}
