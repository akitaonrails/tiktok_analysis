package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.List;

/* JADX INFO: renamed from: X.0Cxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330560Cxa extends BaseResponse implements InterfaceC330550CxZ {
    public long LL;
    public final boolean LLILLJJLI;
    public final long LLILLL;
    public List<StoryInteractionUser> LLILZ;
    public final StoryAnalytics LLILZIL;
    public final Boolean LLILZLL;
    public final int LLIZ;
    public final Long LLIZLLLIL;
    public final long LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;

    public C330560Cxa() {
        throw null;
    }

    @Override // X.InterfaceC330550CxZ
    public final int getExpiryPeriod() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC330550CxZ
    public final boolean getHasMore() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC330550CxZ
    public final List<StoryInteractionUser> getInteractionUserList() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC330550CxZ
    public final String getJavaClassName() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC330550CxZ
    public final long getNextCursor() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC330550CxZ
    public final long getOffset() {
        return this.LLJ;
    }

    @Override // X.InterfaceC330550CxZ
    public final StoryAnalytics getStoryAnalytics() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC330550CxZ
    public final long getTotal() {
        return this.LL;
    }

    @Override // X.InterfaceC330550CxZ
    public final Long getViewersCount() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC330550CxZ
    public final Boolean isFullViewer() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC330550CxZ
    public final boolean isShowLikeListLimit() {
        return this.LLJI;
    }

    @Override // X.InterfaceC330550CxZ
    public final void setInteractionUserList(List<StoryInteractionUser> list) {
        this.LLILZ = list;
    }

    @Override // X.InterfaceC330550CxZ
    public final void setTotal(long j) {
        this.LL = j;
    }

    public C330560Cxa(long j, boolean z, long j2, List list, StoryAnalytics storyAnalytics, Boolean bool, int i, Long l, long j3, boolean z2) {
        String name = C330560Cxa.class.getName();
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = j2;
        this.LLILZ = list;
        this.LLILZIL = storyAnalytics;
        this.LLILZLL = bool;
        this.LLIZ = i;
        this.LLIZLLLIL = l;
        this.LLJ = j3;
        this.LLJI = z2;
        this.LLJIJIL = name;
    }
}
