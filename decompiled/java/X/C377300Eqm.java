package X;

import Y.AgS286S0100000_5;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel$initObserver$1", f = "AsyncTasksPanelViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C377300Eqm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AsyncTasksPanelViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377300Eqm(AsyncTasksPanelViewModel asyncTasksPanelViewModel, InterfaceC1364105Vn<? super C377300Eqm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asyncTasksPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377300Eqm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.initObserver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = asyncTasksPanelViewModel.LLJILJIL;
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(asyncTasksPanelViewModel, 29);
            this.LL = 1;
            if (c2252321DDq.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.initObserver$1");
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
