package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent$initObserver$1", f = "HeaderStoryHighlightsMyCollectionComponent.kt", l = {297}, m = "invokeSuspend")
public final class C1412505fv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ HeaderStoryHighlightsMyCollectionComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412505fv(Fragment fragment, HeaderStoryHighlightsMyCollectionComponent headerStoryHighlightsMyCollectionComponent, InterfaceC1364105Vn<? super C1412505fv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = headerStoryHighlightsMyCollectionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412505fv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1");
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
            LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1412305ft c1412305ft = new C1412305ft(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c1412305ft, this) == objLJFF) {
                C1C7U.LIZIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HeaderStoryHighlightsMyCollectionComponent@9b3a.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
