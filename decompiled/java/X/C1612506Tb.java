package X;

import Y.AgS193S0200000_2;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$observeStoryHighlightForceRefresh$1$1", f = "I18nMyProfileFragment.kt", l = {643}, m = "invokeSuspend")
public final class C1612506Tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IStoryHighlightsMyDataManager LLILLJJLI;
    public final /* synthetic */ I18nMyProfileFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612506Tb(IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager, I18nMyProfileFragment i18nMyProfileFragment, InterfaceC1364105Vn<? super C1612506Tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iStoryHighlightsMyDataManager;
        this.LLILLL = i18nMyProfileFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1612506Tb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nMyProfileFragment@e77a.observeStoryHighlightForceRefresh$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950LJJIJL = this.LLILLJJLI.LJJIJL();
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLL, this.LLILLJJLI, 17);
            this.LL = 1;
            if (anonymousClass0950LJJIJL.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("I18nMyProfileFragment@e77a.observeStoryHighlightForceRefresh$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
