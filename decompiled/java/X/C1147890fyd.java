package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.RevenueTaskInfoMethod$handle$1", f = "RevenueTaskInfoMethod.kt", l = {32}, m = "invokeSuspend")
public final class C1147890fyd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1147910fyf LLILLJJLI;
    public final /* synthetic */ C1147900fye LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC1147930fyh> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147890fyd(InterfaceC1147910fyf interfaceC1147910fyf, C1147900fye c1147900fye, CompletionBlock<InterfaceC1147930fyh> completionBlock, InterfaceC1364105Vn<? super C1147890fyd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1147910fyf;
        this.LLILLL = c1147900fye;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147890fyd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        C1C7U.LIZ("RevenueTaskInfoMethod@f992.handle$1");
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
            TaskManagerV2 taskManagerV2KE0 = C1126800fQc.LIZ.KE0();
            EnumC1134590fdB enumC1134590fdB = EnumC1134590fdB.JSB;
            Number sceneType = this.LLILLJJLI.getSceneType();
            if (sceneType != null) {
                iIntValue = sceneType.intValue();
            } else {
                iIntValue = 7;
            }
            Number taskType = this.LLILLJJLI.getTaskType();
            if (taskType != null) {
                iIntValue2 = taskType.intValue();
            } else {
                iIntValue2 = 0;
            }
            String enterFrom = this.LLILLJJLI.getEnterFrom();
            String requestPage = this.LLILLJJLI.getRequestPage();
            this.LL = 1;
            if (taskManagerV2KE0.LIZ(enumC1134590fdB, iIntValue, iIntValue2, enterFrom, requestPage, false, this) == objLJFF) {
                C1C7U.LIZIZ("RevenueTaskInfoMethod@f992.handle$1");
                return objLJFF;
            }
        }
        this.LLILLL.LIZJ(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RevenueTaskInfoMethod@f992.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
