package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09X7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$removeLoadMoreStatus$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09X7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09X7(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C09X7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09X7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.removeLoadMoreStatus$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftViewModel draftViewModel = this.LL;
        draftViewModel.LLJLIL.LJIIJ(draftViewModel.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.removeLoadMoreStatus$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
