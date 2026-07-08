package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Np8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler$waitForActivation$result$1", f = "TaskScheduler.kt", l = {218}, m = "invokeSuspend")
public final class C605600Np8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC605390Non LLILLJJLI;
    public final /* synthetic */ C605550Np3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605600Np8(AbstractC605390Non abstractC605390Non, C605550Np3 c605550Np3, InterfaceC1364105Vn<? super C605600Np8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC605390Non;
        this.LLILLL = c605550Np3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605600Np8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@5940.waitForActivation$result$1");
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
            this.LLILLJJLI.getClass();
            C638950P4j c638950P4j = new C638950P4j(new C516501zn(Boolean.TRUE, 1), 2);
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c638950P4j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskScheduler@5940.waitForActivation$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskScheduler@5940.waitForActivation$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
