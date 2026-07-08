package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Sir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel$manualRequestRefreshData$2", f = "StoryViewerListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C729110Sir extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryViewerListViewModel LL;
    public final /* synthetic */ Function1<InterfaceC330550CxZ, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C729110Sir(StoryViewerListViewModel storyViewerListViewModel, Function1<? super InterfaceC330550CxZ, Unit> function1, InterfaceC1364105Vn<? super C729110Sir> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyViewerListViewModel;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C729110Sir(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryViewerListViewModel@bfb5.manualRequestRefreshData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.xQ2(0L, 0L, this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C727890Sgt.LIZ.getClass();
            C727890Sgt.LIZJ("ViewerListVM", "manualRequestRefreshData", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerListViewModel@bfb5.manualRequestRefreshData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
