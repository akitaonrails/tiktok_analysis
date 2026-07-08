package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.services.IMusicExService;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryMusicCoverFeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryMusicCoverFeedViewModel$load$1", f = "StoryMusicCoverFeedViewModel.kt", l = {74, 81}, m = "invokeSuspend")
public final class C630630OoP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMusicExService LLILLJJLI;
    public final /* synthetic */ MusicEntranceResult LLILLL;
    public final /* synthetic */ StoryMusicCoverFeedViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ UserStory LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630630OoP(IMusicExService iMusicExService, MusicEntranceResult musicEntranceResult, StoryMusicCoverFeedViewModel storyMusicCoverFeedViewModel, String str, UserStory userStory, String str2, InterfaceC1364105Vn<? super C630630OoP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMusicExService;
        this.LLILLL = musicEntranceResult;
        this.LLILZ = storyMusicCoverFeedViewModel;
        this.LLILZIL = str;
        this.LLILZLL = userStory;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C630630OoP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object musicDetailPageStoryEntrance = obj;
        C1C7U.LIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.LLJJJ = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(musicDetailPageStoryEntrance);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(musicDetailPageStoryEntrance);
        } else {
            C155000ia.LIZIZ(musicDetailPageStoryEntrance);
            IMusicExService iMusicExService = this.LLILLJJLI;
            MusicEntranceResult musicEntranceResult = this.LLILLL;
            String str = musicEntranceResult.musicId;
            String str2 = musicEntranceResult.fromGroupId;
            String str3 = musicEntranceResult.pageToken;
            int iIntValue = ((Number) C036Y.LIZ.getValue()).intValue();
            this.LL = 1;
            musicDetailPageStoryEntrance = iMusicExService.getMusicDetailPageStoryEntrance(str, str2, str3, iIntValue, 1, this);
            if (musicDetailPageStoryEntrance == objLJFF) {
                C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
                return objLJFF;
            }
        }
        MusicEntranceResult musicEntranceResult2 = (MusicEntranceResult) musicDetailPageStoryEntrance;
        if (musicEntranceResult2 == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C630640OoQ c630640OoQ = new C630640OoQ(musicEntranceResult2, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c630640OoQ) == objLJFF) {
            C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryMusicCoverFeedViewModel@4a7c.load$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
