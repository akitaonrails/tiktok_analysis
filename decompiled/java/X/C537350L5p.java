package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.magic.I2VMagicTaskLoadingComponent$onCreate$1", f = "I2VMagicTaskLoadingComponent.kt", l = {67, 68}, m = "invokeSuspend")
public final class C537350L5p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C538540LAe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537350L5p(String str, C538540LAe c538540LAe, InterfaceC1364105Vn<? super C537350L5p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c538540LAe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537350L5p(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("I2VMagicTaskLoadingComponent@99c0.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("I2VMagicTaskLoadingComponent@99c0.onCreate$1");
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
                if (iCreationAsyncTaskManagerLIZ.LJIJJLI(C538540LAe.LLJJJ, listSingletonList, this) == objLJFF) {
                    C1C7U.LIZIZ("I2VMagicTaskLoadingComponent@99c0.onCreate$1");
                    return objLJFF;
                }
            }
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ2 != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ2.LJJJJLI(this.LLILLJJLI)) != null) {
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLL, 48);
            this.LL = 2;
            if (interfaceC346201WaLJJJJLI.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("I2VMagicTaskLoadingComponent@99c0.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("I2VMagicTaskLoadingComponent@99c0.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
