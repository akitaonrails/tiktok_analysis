package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewViewModel$ensureGeneratingPoll$1", f = "AIPortraitStylePreviewViewModel.kt", l = {182}, m = "invokeSuspend")
public final class C0CZK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitStylePreviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZK(AIPortraitStylePreviewViewModel aIPortraitStylePreviewViewModel, InterfaceC1364105Vn<? super C0CZK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitStylePreviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitStylePreviewViewModel@ee01.ensureGeneratingPoll$1");
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
            AIPortraitStylePreviewViewModel aIPortraitStylePreviewViewModel = this.LLILLJJLI;
            C1687000u0A c1687000u0A = aIPortraitStylePreviewViewModel.LL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(aIPortraitStylePreviewViewModel);
            this.LL = 1;
            if (c1687000u0A.LJ(viewModelScope, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitStylePreviewViewModel@ee01.ensureGeneratingPoll$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitStylePreviewViewModel@ee01.ensureGeneratingPoll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
