package X;

import Y.AfS161S0200000_27;
import Y.AfS196S0100000_27;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFirstRechargeEventTrackingDelay;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFixFirstRechargeEventTracking;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807350x8H {
    public Boolean LIZ;
    public Boolean LIZIZ;
    public C19487011Lw LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static Boolean LIZIZ() {
        String strLIZ = InterfaceC1106030et7.ha.LIZ();
        if (strLIZ == null || strLIZ.length() == 0) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(strLIZ, "1"));
    }

    public static Boolean LIZJ() {
        String strLIZ = InterfaceC1106030et7.ga.LIZ();
        if (strLIZ == null || strLIZ.length() == 0) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(strLIZ, "1"));
    }

    public final void LIZ() {
        this.LIZ = LIZJ();
        this.LIZIZ = LIZIZ();
        if (C500260Jjc.LJJIJIL(this.LIZ) || C500260Jjc.LJJIJIL(this.LIZIZ)) {
            LJFF(false, null);
        }
    }

    public static String LJI(Boolean bool) {
        if (bool == null) {
            return "";
        }
        if (bool.booleanValue()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final void LJ(boolean z, EnumC1805570x5P enumC1805570x5P) {
        if ((!z && this.LIZ != null && this.LIZIZ != null) || this.LIZLLL.get()) {
            return;
        }
        Boolean boolLIZJ = LIZJ();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.LJFF(boolLIZJ, bool) && Intrinsics.LJFF(LIZIZ(), bool)) {
            return;
        }
        this.LIZLLL.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("First param sync started. entryPoint=");
        sbLIZ.append(enumC1805570x5P);
        C20441214yg.LJIIIZ("FirstRechargeParamSyncManager", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        ((IWalletApi) C480460Ism.LIZLLL(IWalletApi.class)).getFirstChargeResultV2().LJIILIIL(new C0UO0()).LJJLL(new AfS161S0200000_27(this, enumC1805570x5P, 4), new AfS161S0200000_27(this, enumC1805570x5P, 5));
    }

    public final void LJFF(boolean z, final EnumC1805570x5P enumC1805570x5P) {
        if (!LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue()) {
            return;
        }
        if (!z) {
            if (this.LIZJ != null) {
                return;
            }
            if (enumC1805570x5P == EnumC1805570x5P.LIVE_PAGE) {
                if (this.LIZJ == null) {
                    long value = LiveWalletFirstRechargeEventTrackingDelay.INSTANCE.getValue();
                    if (value < 0) {
                        value = 1000;
                    }
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    C11RO c11roLIZ = C11S5.LIZ();
                    C1701890uOB.LIZ(timeUnit, "unit is null");
                    C1701890uOB.LIZ(c11roLIZ, "scheduler is null");
                    this.LIZJ = new C19477411Ie(value, timeUnit, c11roLIZ).LJIJI(new AfS196S0100000_27(this, 13), new InterfaceC781210Ukh() { // from class: X.0x8I
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C1807350x8H c1807350x8H = this.LIZ;
                            c1807350x8H.LIZJ = null;
                            c1807350x8H.LJ(false, enumC1805570x5P);
                        }
                    });
                    return;
                }
                return;
            }
        }
        LJ(z, enumC1805570x5P);
    }

    public static void LIZLLL(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, EnumC1805570x5P enumC1805570x5P) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_first_recharge_params_sync");
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(LJI(bool), "is_first_recharge_old");
        c474500IjALIZ.LJJII(LJI(bool2), "is_first_cash_recharge_old");
        c474500IjALIZ.LJJII(LJI(bool3), "is_first_recharge");
        c474500IjALIZ.LJJII(LJI(bool4), "is_first_cash_recharge");
        if (enumC1805570x5P == null) {
            enumC1805570x5P = EnumC1805570x5P.UNKNOWN;
        }
        c474500IjALIZ.LJJII(enumC1805570x5P.entryPointName, "reason");
        c474500IjALIZ.LIZ();
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
    }
}
