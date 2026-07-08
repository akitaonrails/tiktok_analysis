package X;

import Y.AgS196S0200000_5;
import Y.AgS286S0100000_5;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel$initAllTasksFromFlow$1", f = "AsyncTasksPanelViewModel.kt", l = {435, 436}, m = "invokeSuspend")
public final class C0E0Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AsyncTasksPanelViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0Q(String str, AsyncTasksPanelViewModel asyncTasksPanelViewModel, InterfaceC1364105Vn<? super C0E0Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = asyncTasksPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E0Q(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.initAllTasksFromFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.initAllTasksFromFlow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                List listSingletonList = Collections.singletonList(this.LLILLJJLI);
                this.LL = 1;
                if (iCreationAsyncTaskManagerLIZ.LJIJJLI("AsyncTaskViewModel", listSingletonList, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.initAllTasksFromFlow$1");
                    return objLJFF;
                }
            }
        }
        final AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLILLL;
        String str = this.LLILLJJLI;
        asyncTasksPanelViewModel.getClass();
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ2 != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ2.LJJJJLI(str)) != null) {
            InterfaceC346201Wa<List<? extends C377380Equ>> interfaceC346201Wa = new InterfaceC346201Wa<List<? extends C377380Equ>>() { // from class: X.0E0P
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super List<? extends C377380Equ>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC346201WaLJJJJLI.collect(new AgS196S0200000_5(interfaceC346701Wf, asyncTasksPanelViewModel, 10), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLL, 28);
            this.LL = 2;
            if (interfaceC346201Wa.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.initAllTasksFromFlow$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.initAllTasksFromFlow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
