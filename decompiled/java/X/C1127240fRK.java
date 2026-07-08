package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0fRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127240fRK implements InterfaceC1126860fQi {
    public static final C1127240fRK LIZ = new C1127240fRK();

    public static String LJ() {
        Long l;
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        if (map != null && (str = (String) map.get("anchor_id")) != null) {
            return str;
        }
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        return (c0ir5 == null || (l = c0ir5.LIZLLL) == null) ? "" : l.toString();
    }

    public static Integer LJFF() {
        InterfaceC1133710fbl.LIZ.getClass();
        if (!((C1133940fc8) C1120710fGn.LIZ()).LJIILL()) {
            return null;
        }
        C1120710fGn.LIZ();
        return Integer.valueOf((int) ((C1133940fc8.LJIIIIZZ() - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / ((long) 86400)));
    }

    public static void LIZ(C474500IjA c474500IjA) {
        String string;
        Room room;
        c474500IjA.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 == null || (room = c0ir5.LIZIZ) == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        c474500IjA.LJJII(string, "room_id");
        c474500IjA.LJJII(LJ(), "anchor_id");
    }

    public static final void LIZIZ(boolean z) {
        C474500IjA c474500IjALIZ;
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        if (C1133940fc8.LJIIJJI()) {
            c474500IjALIZ = C0IJT.LIZIZ("livesdk_first_recharge_welcome_entrance_preview", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        } else {
            c474500IjALIZ = C0IJT.LIZ("livesdk_first_recharge_gift_preview");
            c474500IjALIZ.LJJII(Long.valueOf(((C1133940fc8) C1120710fGn.LIZ()).LJI()), "gift_id");
        }
        LIZ(c474500IjALIZ);
        if (z) {
            c474500IjALIZ.LJJII("call", "preview_type");
        } else {
            c474500IjALIZ.LJJII("click", "preview_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static boolean LJI(long j) {
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        C1134410fct c1134410fctLJI = iRevenueStrategyService.KE0().LJI(13);
        if (c1134410fctLJI == null) {
            return false;
        }
        return iRevenueStrategyService.u21().LIZ(j, c1134410fctLJI, null, "");
    }

    public static final void LIZJ(int i, long j) {
        boolean z;
        String str;
        String str2;
        String str3;
        C1144350fsv c1144350fsv = new C1144350fsv(null, i, j, null, null, null, 248);
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && iWalletService.walletExchange() != null && C1150850g3P.LIZLLL(null, c1144350fsv, null)) {
            z = true;
        } else {
            z = false;
        }
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        if (iRevenueStrategyService.KE0().LJI(13) != null) {
            if (LJI(j)) {
                str = "special";
            } else {
                str = "normal";
            }
        } else {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_recharge_welcome_entrance_click");
        LIZ(c474500IjALIZ);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "if_has_anchor_income");
        iRevenueStrategyService.KE0().getClass();
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(TaskManagerV2.LIZIZ, ",", null, null, 0, null, AFwS254S0000000_17.get$arr$(145), 30), "strategy_task_types");
        c474500IjALIZ.LJJII(str, "ug_first_consume_task_type");
        InterfaceC1133710fbl.LIZ.getClass();
        if (((C1133940fc8) C1120710fGn.LIZ()).LJIILL()) {
            str3 = "unlock_frozen_coin";
        } else {
            str3 = "welcome_gift_pack";
        }
        c474500IjALIZ.LJJII(str3, "motivate_type");
        c474500IjALIZ.LJJII(LJFF(), "countdown_time");
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJI()), "is_first_recharge");
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJFF()), "is_first_cash_recharge");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(int i, long j) {
        boolean z;
        String str;
        String str2;
        String str3;
        C1144350fsv c1144350fsv = new C1144350fsv(null, i, j, null, null, null, 248);
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && iWalletService.walletExchange() != null && C1150850g3P.LIZLLL(null, c1144350fsv, null)) {
            z = true;
        } else {
            z = false;
        }
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        if (iRevenueStrategyService.KE0().LJI(13) != null) {
            if (LJI(j)) {
                str = "special";
            } else {
                str = "normal";
            }
        } else {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_recharge_welcome_entrance_show");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "if_has_anchor_income");
        iRevenueStrategyService.KE0().getClass();
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(TaskManagerV2.LIZIZ, ",", null, null, 0, null, AFwS254S0000000_17.get$arr$(145), 30), "strategy_task_types");
        c474500IjALIZ.LJJII(str, "ug_first_consume_task_type");
        InterfaceC1133710fbl.LIZ.getClass();
        if (((C1133940fc8) C1120710fGn.LIZ()).LJIILL()) {
            str3 = "unlock_frozen_coin";
        } else {
            str3 = "welcome_gift_pack";
        }
        c474500IjALIZ.LJJII(str3, "motivate_type");
        c474500IjALIZ.LJJII(LJFF(), "countdown_time");
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJI()), "is_first_recharge");
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJFF()), "is_first_cash_recharge");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static final void LJII(long j, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_gift_btn_click");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(C1151190g3x.LJI()), "is_first_recharge");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }
}
