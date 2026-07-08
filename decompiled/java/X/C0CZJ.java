package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$ensureGeneratingPoll$1", f = "AIPortraitTabViewModel.kt", l = {623}, m = "invokeSuspend")
public final class C0CZJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZJ(AIPortraitTabViewModel aIPortraitTabViewModel, InterfaceC1364105Vn<? super C0CZJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabViewModel@fa0d.ensureGeneratingPoll$1");
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
            AIPortraitTabViewModel aIPortraitTabViewModel = this.LLILLJJLI;
            C1687000u0A c1687000u0A = aIPortraitTabViewModel.LL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(aIPortraitTabViewModel);
            this.LL = 1;
            if (c1687000u0A.LJ(viewModelScope, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.ensureGeneratingPoll$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.ensureGeneratingPoll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
