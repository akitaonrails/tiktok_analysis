package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Noi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler$runTask$2", f = "TaskScheduler.kt", l = {161}, m = "invokeSuspend")
public final class C605340Noi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC605390Non LLILLJJLI;
    public final /* synthetic */ C605550Np3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605340Noi(AbstractC605390Non abstractC605390Non, C605550Np3 c605550Np3, InterfaceC1364105Vn<? super C605340Noi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC605390Non;
        this.LLILLL = c605550Np3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605340Noi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@5940.runTask$2");
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
            AbstractC605390Non abstractC605390Non = this.LLILLJJLI;
            C605550Np3 c605550Np3 = this.LLILLL;
            this.LL = 1;
            if (abstractC605390Non.LIZIZ(c605550Np3, this) == objLJFF) {
                C1C7U.LIZIZ("TaskScheduler@5940.runTask$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskScheduler@5940.runTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
