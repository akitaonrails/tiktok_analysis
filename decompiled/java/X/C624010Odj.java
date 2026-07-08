package X;

import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Odj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel$init$1", f = "WorkBenchViewModel.kt", l = {76}, m = "invokeSuspend")
public final class C624010Odj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ WorkBenchViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624010Odj(WorkBenchViewModel workBenchViewModel, InterfaceC1364105Vn<? super C624010Odj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = workBenchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624010Odj(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C259800zU c259800zU2;
        T t;
        C1C7U.LIZ("WorkBenchViewModel@f1c.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LLILLJJLI;
                c259800zU2 = this.LL;
                C155000ia.LIZIZ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            InterfaceC624050Odn interfaceC624050Odn = (InterfaceC624050Odn) this.LLILZ.LL.getValue().getOperator();
            this.LL = c259800zU;
            this.LLILLJJLI = c259800zU;
            this.LLILLL = 1;
            Object objLLJI = interfaceC624050Odn.LLJI(this);
            if (objLLJI == objLJFF) {
                C1C7U.LIZIZ("WorkBenchViewModel@f1c.init$1");
                return objLJFF;
            }
            c259800zU2 = c259800zU;
            t = objLLJI;
        }
        c259800zU.element = t;
        WorkBenchViewModel workBenchViewModel = this.LLILZ;
        workBenchViewModel.withState(new AwS375S0200000_9(c259800zU2, (C259800zU<C624120Odu>) workBenchViewModel, (WorkBenchViewModel) 58));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchViewModel@f1c.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
