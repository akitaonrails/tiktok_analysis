package X;

import android.app.Activity;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$handleUGTaskFinishPopup$1", f = "IncentivePreRewardUtils.kt", l = {155}, m = "invokeSuspend")
public final class C1134250fcd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1134410fct LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134250fcd(Activity activity, C1134410fct c1134410fct, long j, InterfaceC1364105Vn<? super C1134250fcd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = c1134410fct;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134250fcd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleUGTaskFinishPopup$1");
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
            Activity activity = this.LLILLJJLI;
            int i2 = ((TaskInfo) this.LLILLL.LIZ).taskType;
            long j = this.LLILZ;
            this.LL = 1;
            if (C1144230fsj.LJI(activity, i2, j, "", 0, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleUGTaskFinishPopup$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleUGTaskFinishPopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
