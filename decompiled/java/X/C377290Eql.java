package X;

import Y.AgS286S0100000_5;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksManagerComponent$initObserver$1$2", f = "AsyncTasksManagerComponent.kt", l = {153}, m = "invokeSuspend")
public final class C377290Eql extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C377280Eqk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377290Eql(C377280Eqk c377280Eqk, InterfaceC1364105Vn<? super C377290Eql> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c377280Eqk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377290Eql(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDq;
        C1C7U.LIZ("AsyncTasksManagerComponent@215e.initObserver$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = this.LLILLJJLI.k5();
            if (asyncTasksPanelViewModelK5 != null && (c2252321DDq = asyncTasksPanelViewModelK5.LLILZIL) != null) {
                AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 18);
                this.LL = 1;
                if (c2252321DDq.collect(agS286S0100000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksManagerComponent@215e.initObserver$1$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AsyncTasksManagerComponent@215e.initObserver$1$2");
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
