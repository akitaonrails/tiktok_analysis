package X;

import com.bytedance.touchpoint.api.model.TaskEventContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.WatchVideoTimeTaskTrigger$onTimeTick$1$1", f = "WatchVideoTimeTaskTrigger.kt", l = {228}, m = "invokeSuspend")
public final class C1703090uQ7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1898820zVo LLILLJJLI;
    public final /* synthetic */ TaskEventContent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703090uQ7(C1898820zVo c1898820zVo, TaskEventContent taskEventContent, InterfaceC1364105Vn<? super C1703090uQ7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1898820zVo;
        this.LLILLL = taskEventContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703090uQ7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchVideoTimeTaskTrigger@a6ab.onTimeTick$1$1");
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
            Object objLJ = C2296808zG.LJ(new C1703080uQ6(c1898820zVo, taskEventContent, null), this);
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.onTimeTick$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.onTimeTick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
