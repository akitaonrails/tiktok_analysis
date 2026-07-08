package X;

import Y.AgS283S0100000_2;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent$initObserver$1$1$2", f = "HeaderStoryHighlightsMyCollectionComponent.kt", l = {308}, m = "invokeSuspend")
public final class C1412105fr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HeaderStoryHighlightsMyCollectionComponent LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412105fr(Fragment fragment, HeaderStoryHighlightsMyCollectionComponent headerStoryHighlightsMyCollectionComponent, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = headerStoryHighlightsMyCollectionComponent;
        this.LLILLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412105fr(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.yp().LLILLJJLI;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLL, 87);
            this.LL = 1;
            if (anonymousClass0950.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1$1$2");
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
