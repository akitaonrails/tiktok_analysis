package X;

import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.List;

/* JADX INFO: renamed from: X.0CxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC330550CxZ {
    int getExpiryPeriod();

    boolean getHasMore();

    List<StoryInteractionUser> getInteractionUserList();

    String getJavaClassName();

    long getNextCursor();

    long getOffset();

    StoryAnalytics getStoryAnalytics();

    long getTotal();

    Long getViewersCount();

    Boolean isFullViewer();

    boolean isShowLikeListLimit();

    void setInteractionUserList(List<StoryInteractionUser> list);

    void setTotal(long j);
}
