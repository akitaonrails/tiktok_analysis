package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryMusicCoverFeedViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryMusicCoverFeedViewModel$load$1$1", f = "StoryMusicCoverFeedViewModel.kt", l = {}, m = "invokeSuspend")
public final class C630640OoQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataCenter>, Object> {
    public final /* synthetic */ MusicEntranceResult LL;
    public final /* synthetic */ StoryMusicCoverFeedViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ UserStory LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630640OoQ(MusicEntranceResult musicEntranceResult, StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel, String str, UserStory userStory, String str2, InterfaceC1364105Vn<? super C630640OoQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicEntranceResult;
        this.LLILLJJLI = storyMusicCoverFeedViewModel;
        this.LLILLL = str;
        this.LLILZ = userStory;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C630640OoQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StoryMusicCoverFeedViewModel@4a7c.load$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> list = this.LL.awemeList;
        int iIntValue = -1;
        boolean z2 = false;
        if (list != null) {
            for (Aweme aweme : this.LLILZ.getStories()) {
                for (int size = list.size() - 1; -1 < size; size--) {
                    Aweme aweme2 = (Aweme) ListProtector.get(list, size);
                    String aid = aweme.getAid();
                    if (aid != null && aid.equals(aweme2.getAid())) {
                        ListProtector.remove(list, size);
                    }
                }
            }
        }
        StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel = this.LLILLJJLI;
        MusicEntranceResult musicEntranceResult = this.LL;
        storyMusicCoverFeedViewModel.getClass();
        List<Aweme> list2 = musicEntranceResult.awemeList;
        int i = 0;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (list2 != null && iAwemeService != null) {
            for (Aweme aweme3 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme awemeLLILLL = iAwemeService.LLILLL(aweme3);
                    if (awemeLLILLL != null) {
                        String str = musicEntranceResult.requestId;
                        if (str == null) {
                            str = "";
                        }
                        awemeLLILLL.setRequestId(str);
                        ListProtector.set(list2, i, awemeLLILLL);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel2 = this.LLILLJJLI;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LLILLL);
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        }
        MusicEntranceResult musicEntranceResult2 = this.LL;
        storyMusicCoverFeedViewModel2.getClass();
        IMusicDetailStoryService iMusicDetailStoryService = (IMusicDetailStoryService) PluggableExtentionKt.pluggableSpi$default(IMusicDetailStoryService.class, false, false, false, 14, null);
        if (iMusicDetailStoryService != null) {
            iMusicDetailStoryService.LIZJ(iIntValue, musicEntranceResult2);
        }
        UserStory userStory = this.LLILZ;
        StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel3 = this.LLILLJJLI;
        MusicEntranceResult musicEntranceResult3 = this.LL;
        if (userStory.getAllViewed()) {
            List arrayList = musicEntranceResult3.awemeList;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            storyMusicCoverFeedViewModel3.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Story story = ((Aweme) it2.next()).getStory();
                    if (story == null || !story.viewed) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
        } else {
            z = false;
            break;
        }
        userStory.setAllViewed(z);
        if (musicEntranceResult3.hasMore == 1) {
            z2 = true;
        }
        userStory.setHasMoreAfter(z2);
        userStory.setOriginTotalCount(userStory.getTotalCount());
        List<Aweme> stories = userStory.getStories();
        Collection<? extends Aweme> arrayList2 = musicEntranceResult3.awemeList;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        stories.addAll(arrayList2);
        this.LLILLJJLI.PQ2(this.LLILLL, this.LLILZIL);
        StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel4 = this.LLILLJJLI;
        storyMusicCoverFeedViewModel4.zQ2(this.LLILZ, "LOAD_USER_STORY_SUCCESS");
        C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1$1");
        return storyMusicCoverFeedViewModel4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataCenter> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
