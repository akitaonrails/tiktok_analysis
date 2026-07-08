package X;

import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel$tryStartRechargeTaskCountDown$1", f = "CampaignRechargePanel.kt", l = {}, m = "invokeSuspend")
public final class C1144040fsQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CampaignRechargePanel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144040fsQ(CampaignRechargePanel campaignRechargePanel, InterfaceC1364105Vn<? super C1144040fsQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = campaignRechargePanel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1144040fsQ(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TaskInfo taskInfo;
        String str;
        C1C7U.LIZ("CampaignRechargePanel@da20.tryStartRechargeTaskCountDown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        C1134410fct c1134410fctLJ = taskManagerV2.LJ();
        if (c1134410fctLJ != null && (taskInfo = (TaskInfo) c1134410fctLJ.LIZ) != null) {
            int i = taskInfo.taskType;
            RechargePanelInputParams rechargePanelInputParams = this.LL.LLJZ;
            String str2 = null;
            if (rechargePanelInputParams != null) {
                str = rechargePanelInputParams.giftEnterFrom;
                str2 = rechargePanelInputParams.requestPage;
            } else {
                str = null;
            }
            taskManagerV2.LJIJI(i, 16, str, str2);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CampaignRechargePanel@da20.tryStartRechargeTaskCountDown$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CampaignRechargePanel@da20.tryStartRechargeTaskCountDown$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
