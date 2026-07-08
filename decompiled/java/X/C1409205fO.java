package X;

import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$tryRequestCache$2", f = "StoryHighlightsMyProfileVM.kt", l = {105, 106}, m = "invokeSuspend")
public final class C1409205fO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IStoryHighlightsMyDataManager LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ StoryHighlightsMyProfileVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409205fO(IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager, List<String> list, StoryHighlightsMyProfileVM storyHighlightsMyProfileVM, InterfaceC1364105Vn<? super C1409205fO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iStoryHighlightsMyDataManager;
        this.LLILLL = list;
        this.LLILZ = storyHighlightsMyProfileVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409205fO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            if (iStoryHighlightsMyDataManager.LJJIJ(list, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1409305fP c1409305fP = new C1409305fP(this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1409305fP) == objLJFF) {
            C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
