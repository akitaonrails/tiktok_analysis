package X;

import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridLegacyStorageService;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFirstRechargeExchangeRetentionPopupSchema;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel$onViewCreated$1", f = "CampaignRechargePanel.kt", l = {150}, m = "invokeSuspend")
public final class C1144100fsW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CampaignRechargePanel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144100fsW(CampaignRechargePanel campaignRechargePanel, InterfaceC1364105Vn<? super C1144100fsW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = campaignRechargePanel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1144100fsW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RechargePanelExchangeParams rechargePanelExchangeParams;
        RechargePanelExchangeParams rechargePanelExchangeParams2;
        C1C7U.LIZ("CampaignRechargePanel@da20.onViewCreated$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("CampaignRechargePanel@da20.onViewCreated$1");
                return objLJFF;
            }
        }
        CampaignRechargePanel campaignRechargePanel = this.LLILLJJLI;
        if (campaignRechargePanel.LLJZIJLIL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CampaignRechargePanel@da20.onViewCreated$1");
            return unit;
        }
        C19EG activity = campaignRechargePanel.getActivity();
        if (activity != null) {
            boolean zLJFF = Intrinsics.LJFF(((IHybridLegacyStorageService) C1161920gLG.LIZJ(IHybridLegacyStorageService.class)).M41(activity, "LIVE_FIRST_HAD_SHOW_RETENTION_DIALOG"), "1");
            if (!Intrinsics.LJFF(InterfaceC1094160eZy.G1.LIZ(), Boolean.TRUE) && !zLJFF) {
                RechargePanelInputParams rechargePanelInputParams = campaignRechargePanel.LLJZ;
                if (rechargePanelInputParams != null) {
                    rechargePanelExchangeParams = rechargePanelInputParams.exchangeParams;
                } else {
                    rechargePanelExchangeParams = null;
                }
                if (C1149560g1K.LIZJ(rechargePanelExchangeParams)) {
                    RechargePanelInputParams rechargePanelInputParams2 = campaignRechargePanel.LLJZ;
                    AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(campaignRechargePanel, 610);
                    String value = LiveFirstRechargeExchangeRetentionPopupSchema.INSTANCE.getValue();
                    if (value.length() != 0 && rechargePanelInputParams2 != null && (rechargePanelExchangeParams2 = rechargePanelInputParams2.exchangeParams) != null) {
                        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
                        String strLIZ = C1149560g1K.LIZ(1L, rechargePanelExchangeParams2);
                        String strLIZ2 = C1547760qNa.LIZ(UriProtector.parse(value));
                        if (strLIZ2 != null) {
                            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(activity, strLIZ2, new C1144090fsV(rechargePanelInputParams2, rechargePanelExchangeParams2, strLIZ, c0ir5, activity, awS561S0100000_17));
                        }
                    }
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CampaignRechargePanel@da20.onViewCreated$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
