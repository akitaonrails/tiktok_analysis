package Y;

import X.C09JN;
import X.C0IR5;
import X.C0IXL;
import X.C1134410fct;
import X.C1144050fsR;
import X.C1148310fzJ;
import X.C1151360g4E;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C1C7U;
import X.C467770IVz;
import X.C495520Jby;
import X.C748880TZe;
import X.InterfaceC1094160eZy;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class AfS5S1210000_17 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS5S1210000_17 afS5S1210000_17, Object obj) {
        FragmentManager fragmentManager;
        LiveSheetFragment liveSheetFragmentZQ2;
        C1C7U.LIZ("FansClubViewModel@394b.showSuperFanPurchaseDialog$2");
        DataChannel dataChannel = (DataChannel) afS5S1210000_17.l1;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            FansClubViewModel fansClubViewModel = (FansClubViewModel) afS5S1210000_17.l2;
            DataChannel dataChannel2 = (DataChannel) afS5S1210000_17.l1;
            String str = afS5S1210000_17.s0;
            boolean z = afS5S1210000_17.z3;
            JoinDialogProxyViewModel joinDialogProxyViewModel = fansClubViewModel.LLJJIJIIJIL;
            if (joinDialogProxyViewModel != null) {
                liveSheetFragmentZQ2 = joinDialogProxyViewModel.zQ2(dataChannel2, str, z);
            } else {
                liveSheetFragmentZQ2 = null;
            }
            C19322110iZ.LJFF(fragmentManager, liveSheetFragmentZQ2, "fans_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
        C1C7U.LIZIZ("FansClubViewModel@394b.showSuperFanPurchaseDialog$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS5S1210000_17 afS5S1210000_17, Object obj) {
        String str;
        int i;
        RechargePanelExchangeParams rechargePanelExchangeParams;
        boolean z;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        int iIntValue2;
        long jLongValue5;
        Integer numValueOf;
        String string;
        String str5;
        String str6;
        String str7;
        String strLIZIZ;
        String string2;
        TaskInfo taskInfo;
        Integer num;
        Long l;
        Integer num2;
        Long l2;
        Integer num3;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Integer num4;
        Integer num5;
        C1C7U.LIZ("ExchangeUtilKt@6570.openExchangePanel$1");
        if (((BaseResponse) obj).statusCode == 0) {
            C495520Jby c495520Jby = new C495520Jby(afS5S1210000_17.s0);
            boolean z2 = afS5S1210000_17.z3;
            RechargePanelInputParams rechargePanelInputParams = (RechargePanelInputParams) afS5S1210000_17.l2;
            if (z2) {
                str = "wallet_first_recharge_entrance";
            } else {
                str = "room_first_recharge_entrance";
            }
            c495520Jby.LIZJ("exchange_scenario", str);
            if (z2) {
                i = 906;
            } else {
                i = 115;
            }
            c495520Jby.LIZ(i, "sub_source");
            c495520Jby.LIZ(C1151360g4E.LJFF(), "is_first_recharge");
            c495520Jby.LIZJ("first_recharge_exchange_entrance_page", "intro");
            c495520Jby.LIZJ("first_recharge_exchange_source", "entrance");
            String str8 = null;
            if (rechargePanelInputParams != null) {
                rechargePanelExchangeParams = rechargePanelInputParams.exchangeParams;
            } else {
                rechargePanelExchangeParams = null;
            }
            int iIntValue3 = 1;
            int iIntValue4 = 0;
            if (rechargePanelExchangeParams != null && (num5 = rechargePanelExchangeParams.exchangeTypeForFirst) != null && num5.intValue() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c495520Jby.LIZJ("exchange_type", "ug_exchange");
            } else {
                c495520Jby.LIZJ("exchange_type", "anchor_income");
            }
            if (rechargePanelExchangeParams == null || (str2 = rechargePanelExchangeParams.balance) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c495520Jby.LIZJ("balance", str2);
            if (rechargePanelExchangeParams != null) {
                str3 = rechargePanelExchangeParams.currencyCode;
            } else {
                str3 = null;
            }
            String str9 = "";
            if (str3 == null) {
                str3 = "";
            }
            c495520Jby.LIZJ("currency_code", str3);
            if (rechargePanelExchangeParams == null || (str4 = rechargePanelExchangeParams.symbol) == null) {
                str4 = "";
            }
            c495520Jby.LIZJ("symbol", str4);
            if (rechargePanelExchangeParams != null && (num4 = rechargePanelExchangeParams.keepDot) != null) {
                iIntValue = num4.intValue();
            } else {
                iIntValue = 0;
            }
            c495520Jby.LIZ(iIntValue, "keep_dot");
            long jLongValue6 = 0;
            if (rechargePanelExchangeParams != null && (l6 = rechargePanelExchangeParams.basePackageId) != null) {
                jLongValue = l6.longValue();
            } else {
                jLongValue = 0;
            }
            c495520Jby.LIZIZ(jLongValue, "base_package_id");
            if (rechargePanelExchangeParams != null && (l5 = rechargePanelExchangeParams.basePackagePrice) != null) {
                jLongValue2 = l5.longValue();
            } else {
                jLongValue2 = 0;
            }
            c495520Jby.LIZIZ(jLongValue2, "base_package_price");
            if (rechargePanelExchangeParams != null && (l4 = rechargePanelExchangeParams.realDot) != null) {
                jLongValue3 = l4.longValue();
            } else {
                jLongValue3 = 0;
            }
            c495520Jby.LIZIZ(jLongValue3, "real_dot");
            if (rechargePanelExchangeParams != null && (l3 = rechargePanelExchangeParams.maxCoins) != null) {
                jLongValue4 = l3.longValue();
            } else {
                jLongValue4 = 0;
            }
            c495520Jby.LIZIZ(jLongValue4, "max_coins");
            if (rechargePanelExchangeParams != null && (num3 = rechargePanelExchangeParams.way) != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            c495520Jby.LIZ(iIntValue2, "way");
            if (rechargePanelExchangeParams != null && (l2 = rechargePanelExchangeParams.localPriceRealDot) != null) {
                jLongValue5 = l2.longValue();
            } else {
                jLongValue5 = 0;
            }
            c495520Jby.LIZIZ(jLongValue5, "local_price_real_dot");
            if (rechargePanelExchangeParams != null && (num2 = rechargePanelExchangeParams.localKeepDot) != null) {
                iIntValue4 = num2.intValue();
            }
            c495520Jby.LIZ(iIntValue4, "local_keep_dot");
            if (rechargePanelExchangeParams != null && (l = rechargePanelExchangeParams.localPrice) != null) {
                jLongValue6 = l.longValue();
            }
            c495520Jby.LIZIZ(jLongValue6, "local_price");
            c495520Jby.LIZ(Intrinsics.LJFF(InterfaceC1094160eZy.G1.LIZ(), Boolean.TRUE) ? 1 : 0, "is_first_enter");
            c495520Jby.LIZJ("experimental_group_num", "4");
            if (rechargePanelExchangeParams != null && (num = rechargePanelExchangeParams.exchangeTypeForFirst) != null) {
                iIntValue3 = num.intValue();
            }
            c495520Jby.LIZ(iIntValue3, "exchange_type_for_first");
            c495520Jby.LIZJ("live_scene", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2());
            C1134410fct c1134410fctLJ = TaskManagerV2.LIZ.LJ();
            if (c1134410fctLJ != null && (taskInfo = (TaskInfo) c1134410fctLJ.LIZ) != null) {
                numValueOf = Integer.valueOf(taskInfo.taskType);
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            c495520Jby.LIZJ("strategy_task_type", strValueOf);
            c495520Jby.LIZJ("campaign_type", strValueOf);
            C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
            if (c0ir5 != null) {
                Long l7 = c0ir5.LIZLLL;
                if (l7 == null || (string = l7.toString()) == null) {
                    string = "";
                }
                c495520Jby.LIZJ("anchor_id", string);
                Long l8 = c0ir5.LIZJ;
                if (l8 != null && (string2 = l8.toString()) != null) {
                    str9 = string2;
                }
                c495520Jby.LIZJ("room_id", str9);
                C0IXL c0ixl = c0ir5.LJFF;
                if (c0ixl != null) {
                    if (rechargePanelInputParams == null || (str5 = rechargePanelInputParams.enterMethod) == null) {
                        str5 = c0ixl.LIZ;
                    }
                    c495520Jby.LIZJ("enter_method", str5);
                    if (rechargePanelInputParams == null || (str6 = rechargePanelInputParams.enterFromMerge) == null) {
                        str6 = c0ixl.LIZIZ;
                    }
                    c495520Jby.LIZJ("enter_from_merge", str6);
                    c495520Jby.LIZJ("action_type", c0ixl.LJFF);
                    w.LIZ.getClass();
                    c495520Jby.LIZJ("request_id", w.LJIJI());
                    if (rechargePanelInputParams != null) {
                        str7 = rechargePanelInputParams.requestPage;
                    } else {
                        str7 = null;
                    }
                    c495520Jby.LIZJ("request_page", str7);
                    if (rechargePanelInputParams != null) {
                        str8 = rechargePanelInputParams.giftEnterFrom;
                    }
                    c495520Jby.LIZJ("gift_enter_from", str8);
                    if (rechargePanelInputParams == null || (strLIZIZ = rechargePanelInputParams.chargeReason) == null) {
                        strLIZIZ = C1144050fsR.LIZIZ();
                    }
                    c495520Jby.LIZJ("charge_reason", strLIZIZ);
                }
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) afS5S1210000_17.l1, UriProtector.parse(c495520Jby.LIZLLL()));
        }
        C1C7U.LIZIZ("ExchangeUtilKt@6570.openExchangePanel$1");
    }

    public AfS5S1210000_17(Object obj, Object obj2, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.z3 = z;
    }
}
