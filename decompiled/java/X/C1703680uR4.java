package X;

import com.bytedance.touchpoint.api.model.TaskEventContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS394S0200000_28;
import njp.a;

/* JADX INFO: renamed from: X.0uR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.WatchVideoTimeTaskTrigger$reportTaskEvent$2$reportJob$1", f = "WatchVideoTimeTaskTrigger.kt", l = {465}, m = "invokeSuspend")
public final class C1703680uR4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1898920zVy>, Object> {
    public int LL;
    public final /* synthetic */ C1898820zVo LLILLJJLI;
    public final /* synthetic */ TaskEventContent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703680uR4(C1898820zVo c1898820zVo, TaskEventContent taskEventContent, InterfaceC1364105Vn<? super C1703680uR4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1898820zVo;
        this.LLILLL = taskEventContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703680uR4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$reportJob$1");
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
            C1898820zVo c1898820zVo = this.LLILLJJLI;
            TaskEventContent taskEventContent = this.LLILLL;
            this.LL = 1;
            c1898820zVo.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1899080zWE c1899080zWE = c1898820zVo.LLILLL;
            if (c1899080zWE != null) {
                c1899080zWE.LJIIJJI(taskEventContent, true, new AwS394S0200000_28(c1898820zVo, c2252611DEt, 9));
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$reportJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$reportJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1898920zVy> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
