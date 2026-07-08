package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LV5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask$requestProgressMock$2", f = "AICreationServerProgressTask.kt", l = {342, 345}, m = "invokeSuspend")
public final class C0LV5 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TaskDetail LLILLJJLI;
    public final /* synthetic */ C0LV4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV5(TaskDetail taskDetail, C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LV5> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = taskDetail;
        this.LLILLL = c0lv4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LV5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
            return null;
        }
        C155000ia.LIZIZ(obj);
        TaskDetail taskDetail = this.LLILLJJLI;
        if (taskDetail == null) {
            C0LV4 c0lv4 = this.LLILLL;
            String value = C0LLZ.CLIENT_BUSINESS.getValue();
            this.LL = 1;
            if (C539400LDm.LIZ(c0lv4, -47367, "mock detail null", value, null, this, 8) == objLJFF) {
                C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
                return objLJFF;
            }
            C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
            return null;
        }
        C0LV4 c0lv42 = this.LLILLL;
        this.LL = 2;
        if (c0lv42.LJJL(taskDetail, this) == objLJFF) {
            C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.requestProgressMock$2");
        return unit2;
    }
}
