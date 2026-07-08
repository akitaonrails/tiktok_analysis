package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0997, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2$onDateSwitch$1$4", f = "TaskManagerV2.kt", l = {527, 528}, m = "invokeSuspend")
public final class AnonymousClass0997 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0997(long j, InterfaceC1364105Vn<? super AnonymousClass0997> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0997(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskManagerV2@3e9c.onDateSwitch$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TaskManagerV2@3e9c.onDateSwitch$1$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TaskManagerV2@3e9c.onDateSwitch$1$4");
                return objLJFF;
            }
        }
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        EnumC1134590fdB enumC1134590fdB = EnumC1134590fdB.NEW_DAY_NO_CACHE;
        this.LL = 2;
        if (taskManagerV2.LIZ(enumC1134590fdB, 7, 0, null, null, false, this) == objLJFF) {
            C1C7U.LIZIZ("TaskManagerV2@3e9c.onDateSwitch$1$4");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TaskManagerV2@3e9c.onDateSwitch$1$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
