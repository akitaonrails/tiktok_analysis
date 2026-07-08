package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151360g4E {
    public static final Integer LIZLLL() {
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        if (taskManagerV2.LJIIJJI(106)) {
            return 3;
        }
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        if (C1133940fc8.LJIIJJI() || c1133940fc8.kb()) {
            return Integer.valueOf(C1133940fc8.LJII());
        }
        C1134410fct c1134410fctLJ = taskManagerV2.LJ();
        if (c1134410fctLJ != null) {
            return Integer.valueOf(C1134900fdg.LIZ(c1134410fctLJ, 5));
        }
        return null;
    }

    public static final int LJFF() {
        if (C1148670fzt.LIZ().walletCenter().JE1()) {
            return C500260Jjc.LJJJI(Boolean.valueOf(C1148670fzt.LIZ().walletCenter().isFirstRecharge())) ? 1 : 0;
        }
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        return C500260Jjc.LJJJI(Boolean.valueOf(C1133940fc8.LJIIJJI())) ? 1 : 0;
    }

    public static final int LIZJ(RechargePanelInputParams rechargePanelInputParams) {
        Boolean boolValueOf;
        if (rechargePanelInputParams != null) {
            boolValueOf = Boolean.valueOf(C1149560g1K.LIZLLL(rechargePanelInputParams));
        } else {
            boolValueOf = null;
        }
        return C176600m4.LIZIZ(boolValueOf) ? 1 : 0;
    }

    public static final RechargeRequestParams LIZ(RechargePanelInputParams rechargePanelInputParams, Diamond diamond) {
        boolean z;
        String str;
        RechargeRequestParams rechargeRequestParams = new RechargeRequestParams();
        rechargeRequestParams.chargeSource = LIZJ(rechargePanelInputParams);
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        if (!C1133940fc8.LJIIJJI() && !c1133940fc8.kb()) {
            z = false;
        } else {
            z = true;
        }
        rechargeRequestParams.firstRecharge = Boolean.valueOf(z);
        if (rechargePanelInputParams == null || (str = rechargePanelInputParams.requestPage) == null) {
            str = "live_detail";
        }
        rechargeRequestParams.requestPage = str;
        rechargeRequestParams.chargeReason = "first_recharge";
        rechargeRequestParams.campaignType = C1134860fdc.LIZ.LIZ();
        rechargeRequestParams.penaltyWarningSkip = "";
        rechargeRequestParams.LIZ(diamond);
        return rechargeRequestParams;
    }

    public static final String LJ(String str, C1804840x4E c1804840x4E) {
        if (c1804840x4E != null && !C500260Jjc.LJJIFFI(Boolean.valueOf(c1804840x4E.LJIJJ()))) {
            if (Intrinsics.LJFF(str, c1804840x4E.LJIIIIZZ())) {
                return "default";
            }
            return "non_default";
        }
        return "no_switch_option";
    }

    public static final Object LJI(EnumC1803160x1W enumC1803160x1W, RechargePanelInputParams rechargePanelInputParams, Map<String, String> map, InterfaceC1364105Vn<? super C1804840x4E> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1151370g4F(enumC1803160x1W, rechargePanelInputParams, map, null));
    }

    public static final void LIZIZ(Context context, Diamond diamond, Long l, RechargeRequestParams rechargeRequestParams, RechargePanelInputParams rechargePanelInputParams, HashMap<String, Object> map, Function0<Unit> function0, Function0<Unit> function02, Function1<? super C1797200wru, Unit> function1, Function2<? super Diamond, ? super C1796560wqs, Unit> function2, Function1<? super Long, Unit> function12, boolean z, Map<String, String> map2, String str) {
        C1803070x1N c1803070x1N = new C1803070x1N(context, rechargePanelInputParams, diamond, z, map2, map, function0, function02, function1, function2, function12);
        C1148670fzt.LIZ().getPayManager().LIZJ(context, diamond, c1803070x1N, l, rechargeRequestParams, new C1776960wLG(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(LIZJ(rechargePanelInputParams), true), C158B.LIZ()), null, str, C1148670fzt.LIZ().getRechargeService().LJIIIIZZ(), null);
    }
}
