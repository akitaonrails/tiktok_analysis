package X;

import Y.AgS286S0100000_5;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicDataLogicComponent$observeTaskStatus$1", f = "MagicDataLogicComponent.kt", l = {204}, m = "invokeSuspend")
public final class C2330909Bj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C356720Dyg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330909Bj(C356720Dyg c356720Dyg, InterfaceC1364105Vn<? super C2330909Bj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c356720Dyg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2330909Bj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("MagicDataLogicComponent@f4bf.observeTaskStatus$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ.LJJJJLI(this.LLILLJJLI.getCreationId())) != null) {
                AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 3);
                this.LL = 1;
                if (interfaceC346201WaLJJJJLI.collect(agS286S0100000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("MagicDataLogicComponent@f4bf.observeTaskStatus$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MagicDataLogicComponent@f4bf.observeTaskStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
