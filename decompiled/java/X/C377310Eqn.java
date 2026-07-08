package X;

import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksManagerComponent$taskIconClicked$1$2", f = "AsyncTasksManagerComponent.kt", l = {370}, m = "invokeSuspend")
public final class C377310Eqn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C377280Eqk LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377310Eqn(C377280Eqk c377280Eqk, C19EG c19eg, InterfaceC1364105Vn<? super C377310Eqn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c377280Eqk;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377310Eqn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksManagerComponent@215e.taskIconClicked$1$2");
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
            AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = this.LLILLJJLI.k5();
            if (asyncTasksPanelViewModelK5 != null) {
                C19EG c19eg = this.LLILLL;
                C362580EJk c362580EJk = this.LLILLJJLI.LLJJJIL;
                this.LL = 1;
                if (asyncTasksPanelViewModelK5.xQ2(c19eg, c362580EJk, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksManagerComponent@215e.taskIconClicked$1$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTasksManagerComponent@215e.taskIconClicked$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
