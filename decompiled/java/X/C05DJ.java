package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05DJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel$deleteSelectedStory$1", f = "StoryGalleryCoverListViewModel.kt", l = {149}, m = "invokeSuspend")
public final class C05DJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StoryGalleryListViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DJ(String str, StoryGalleryListViewModel storyGalleryListViewModel, String str2, Function0<Unit> function0, InterfaceC1364105Vn<? super C05DJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = storyGalleryListViewModel;
        this.LLILZIL = str2;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05DJ c05dj = new C05DJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05dj.LLILLJJLI = obj;
        return c05dj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryGalleryListViewModel@2caf.deleteSelectedStory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                StoryGalleryListViewModel storyGalleryListViewModel = this.LLILZ;
                String str2 = this.LLILZIL;
                Function0<Unit> function0 = this.LLILZLL;
                FeedActionApi.LIZ(str);
                StoryFeedViewModel storyFeedViewModel = storyGalleryListViewModel.LLILLL;
                if (storyFeedViewModel != null) {
                    C2286608xc.LJ(StoryFeedViewModel.FQ2(storyFeedViewModel, str2, str));
                }
                storyGalleryListViewModel.setState(new AwS581S0100000_2(storyGalleryListViewModel, 495));
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C13072059q c13072059q = new C13072059q(function0, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c13072059q) == objLJFF) {
                    C1C7U.LIZIZ("StoryGalleryListViewModel@2caf.deleteSelectedStory$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C727890Sgt.LIZ.getClass();
            C727890Sgt.LIZJ("StoryGalleryCoverListVM", "delete " + str3 + " fail", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryGalleryListViewModel@2caf.deleteSelectedStory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
