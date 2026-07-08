package X;

import com.bytedance.touchpoint.api.model.TaskEventContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.WatchVideoTimeTaskTrigger$reportTaskEvent$2", f = "WatchVideoTimeTaskTrigger.kt", l = {475}, m = "invokeSuspend")
public final class C1703080uQ6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1898820zVo LLILLL;
    public final /* synthetic */ TaskEventContent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703080uQ6(C1898820zVo c1898820zVo, TaskEventContent taskEventContent, InterfaceC1364105Vn<? super C1703080uQ6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1898820zVo;
        this.LLILZ = taskEventContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1703080uQ6 c1703080uQ6 = new C1703080uQ6(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1703080uQ6.LLILLJJLI = obj;
        return c1703080uQ6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1DFB c1dfb = C0PEM.LIZJ;
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, c1dfb, null, new C1703070uQ5(C23250099c.LIZIZ(interfaceC497601wk, c1dfb, null, new C1703680uR4(this.LLILLL, this.LLILZ, null), 2), this.LLILLL, null), 2);
            this.LL = 1;
            if (anonymousClass0956LIZLLL.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
