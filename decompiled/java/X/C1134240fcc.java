package X;

import android.app.Activity;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$handleLiveIncomeFirstConsumptionTaskStatusChange$2", f = "IncentivePreRewardUtils.kt", l = {181}, m = "invokeSuspend")
public final class C1134240fcc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1134410fct LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134240fcc(Activity activity, C1134410fct c1134410fct, String str, boolean z, int i, int i2, InterfaceC1364105Vn<? super C1134240fcc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = c1134410fct;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134240fcc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleLiveIncomeFirstConsumptionTaskStatusChange$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Activity activity = this.LLILLJJLI;
            int i3 = ((TaskInfo) this.LLILLL.LIZ).taskType;
            String str = this.LLILZ;
            if (this.LLILZIL) {
                i = this.LLILZLL - this.LLIZ;
            } else {
                i = this.LLILZLL;
            }
            this.LL = 1;
            if (C1144230fsj.LJI(activity, i3, 0L, str, i, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleLiveIncomeFirstConsumptionTaskStatusChange$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleLiveIncomeFirstConsumptionTaskStatusChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
