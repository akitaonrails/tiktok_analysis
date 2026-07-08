package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$onBannerCloseClick$1", f = "StoryHighlightsMyProfileVM.kt", l = {69}, m = "invokeSuspend")
public final class C420501kJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C420501kJ(InterfaceC1364105Vn<? super C420501kJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C420501kJ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.onBannerCloseClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            if (iStoryHighlightsMyDataManager != null) {
                this.LL = 1;
                if (iStoryHighlightsMyDataManager.LJJIIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onBannerCloseClick$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onBannerCloseClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C420501kJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
