package X;

import com.bytedance.android.livesdk.api.revenue.strategy.channel.CloseCampaignPanelEvent;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskExpirationPostProcessKt$handleTaskExpiration$1", f = "TaskExpirationPostProcess.kt", l = {23}, m = "invokeSuspend")
public final class C1134400fcs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1134410fct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134400fcs(C1134410fct c1134410fct, InterfaceC1364105Vn<? super C1134400fcs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1134410fct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134400fcs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExpirationPostProcessKt@2e00.handleTaskExpiration$1");
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
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            EnumC1134590fdB enumC1134590fdB = EnumC1134590fdB.GIFT_EXPIRED;
            this.LL = 1;
            if (taskManagerV2.LIZ(enumC1134590fdB, 7, 0, null, null, false, this) == objLJFF) {
                C1C7U.LIZIZ("TaskExpirationPostProcessKt@2e00.handleTaskExpiration$1");
                return objLJFF;
            }
        }
        if (((TaskInfo) this.LLILLJJLI.LIZ).targetType == 5) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            c784440UpuLIZ.LIZIZ(new CloseCampaignPanelEvent());
            c784440UpuLIZ.LIZIZ(new C1134160fcU());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskExpirationPostProcessKt@2e00.handleTaskExpiration$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
