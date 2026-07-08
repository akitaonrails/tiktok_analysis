package X;

import android.app.Activity;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$handleDailyTaskStatusChange$1", f = "IncentivePreRewardUtils.kt", l = {287}, m = "invokeSuspend")
public final class C1134230fcb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1134410fct LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134230fcb(Activity activity, C1134410fct c1134410fct, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1134410fct;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134230fcb(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleDailyTaskStatusChange$1");
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
            C1134410fct c1134410fct = this.LLILLJJLI;
            TaskInfo taskInfo = (TaskInfo) c1134410fct.LIZ;
            if (taskInfo.taskFlowType == 2) {
                j = taskInfo.rewardAmount - ((TaskInfo) C1144230fsj.LIZJ(c1134410fct).LIZ).preRewardAmount;
            } else {
                j = taskInfo.rewardAmount;
            }
            Activity activity = this.LLILLL;
            int i2 = ((TaskInfo) this.LLILLJJLI.LIZ).taskType;
            this.LL = 1;
            if (C1144230fsj.LJI(activity, i2, j, "", 0, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleDailyTaskStatusChange$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleDailyTaskStatusChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
