package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent$initObserver$1$1$1", f = "HeaderStoryHighlightsMyCollectionComponent.kt", l = {299}, m = "invokeSuspend")
public final class C1412405fu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HeaderStoryHighlightsMyCollectionComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412405fu(HeaderStoryHighlightsMyCollectionComponent headerStoryHighlightsMyCollectionComponent, InterfaceC1364105Vn<? super C1412405fu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = headerStoryHighlightsMyCollectionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412405fu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqLJII;
        C1C7U.LIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            if (iStoryHighlightsMyDataManager != null && (c2252321DDqLJII = iStoryHighlightsMyDataManager.LJII()) != null) {
                AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 86);
                this.LL = 1;
                if (c2252321DDqLJII.collect(agS283S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1$1$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
