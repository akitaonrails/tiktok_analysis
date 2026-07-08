package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2$startTaskCountDown$1", f = "TaskManagerV2.kt", l = {234}, m = "invokeSuspend")
public final class C1134540fd6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1134410fct LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134540fd6(C1134410fct c1134410fct, int i, int i2, String str, String str2, InterfaceC1364105Vn<? super C1134540fd6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1134410fct;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1134540fd6 c1134540fd6 = new C1134540fd6(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1134540fd6.LLILLJJLI = obj;
        return c1134540fd6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskManagerV2@3e9c.startTaskCountDown$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1134410fct c1134410fct = this.LLILLL;
                int i2 = this.LLILZ;
                int i3 = this.LLILZIL;
                String str = this.LLILZLL;
                String str2 = this.LLIZ;
                if (c1134410fct.LIZJ() == EnumC1134460fcy.TASK_ENTER) {
                    TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
                    EnumC1134590fdB enumC1134590fdB = EnumC1134590fdB.TASK_START;
                    this.LL = 1;
                    if (taskManagerV2.LIZ(enumC1134590fdB, i2, i3, str, str2, false, this) == objLJFF) {
                        C1C7U.LIZIZ("TaskManagerV2@3e9c.startTaskCountDown$1");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskManagerV2@3e9c.startTaskCountDown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
