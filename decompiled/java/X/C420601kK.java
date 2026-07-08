package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$updateCollectionListData$1", f = "StoryHighlightsMyProfileVM.kt", l = {}, m = "invokeSuspend")
public final class C420601kK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<StoryHighlightCollection> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420601kK(List<StoryHighlightCollection> list, InterfaceC1364105Vn<? super C420601kK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C420601kK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.updateCollectionListData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
        if (iStoryHighlightsMyDataManager != null) {
            iStoryHighlightsMyDataManager.LIZ(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.updateCollectionListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
