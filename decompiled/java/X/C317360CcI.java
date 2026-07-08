package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel$ensureGeneratingPoll$1", f = "AIPortraitDetailViewModel.kt", l = {103}, m = "invokeSuspend")
public final class C317360CcI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC550750Lir LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIPortraitDetailViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317360CcI(InterfaceC550750Lir interfaceC550750Lir, String str, AIPortraitDetailViewModel aIPortraitDetailViewModel, InterfaceC1364105Vn<? super C317360CcI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC550750Lir;
        this.LLILLL = str;
        this.LLILZ = aIPortraitDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317360CcI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDetailViewModel@daa2.ensureGeneratingPoll$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC550750Lir interfaceC550750Lir = this.LLILLJJLI;
            String str = this.LLILLL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILZ);
            this.LL = 1;
            if (interfaceC550750Lir.LJIILIIL(str, true, viewModelScope, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.ensureGeneratingPoll$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitDetailViewModel@daa2.ensureGeneratingPoll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
