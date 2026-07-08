package com.bytedance;

import X.C0IJT;
import X.C11IR;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2348809Ig;
import X.C474500IjA;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletReferrerReportSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class GPExternalServiceProvider implements WalletRechargeService {
    public String LIZ;

    @Override // com.bytedance.WalletRechargeService
    public final void LIZIZ() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LIZJ() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LIZLLL() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJ() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJFF() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJI() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJII() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJIIIZ() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJIIJ() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void LJIIJJI() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void canRedirectRechargeV3() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void getStoreDescription() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final void isValidForRechargeV3() {
    }

    @Override // com.bytedance.WalletRechargeService
    public final C11IR LIZ() {
        return C11IR.LL;
    }

    @Override // com.bytedance.WalletRechargeService
    public final C11IR LJIIIIZZ() {
        return C11IR.LL;
    }

    public static void LJIIL(C474500IjA c474500IjA) {
        try {
            C1CC2.LIZJ(c474500IjA.LJIJ(), C2348809Ig.LIZLLL(c474500IjA.LJIJI()), new JSONObject(), new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.WalletRechargeService
    public final void trackingAppResumeFromBackground(String str) {
        if (LiveWalletReferrerReportSetting.INSTANCE.getValue()) {
            this.LIZ = str;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_app_resume_from_background");
            c474500IjALIZ.LJIL();
            if (str == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "top_activity");
            c474500IjALIZ.LIZ();
            LJIIL(c474500IjALIZ);
        }
    }

    @Override // com.bytedance.WalletRechargeService
    public final void updateReferrerHostFromKeva(Context context) {
        if (!LiveWalletReferrerReportSetting.INSTANCE.getValue() || context == null) {
            return;
        }
        String str = "";
        String string = Keva.getRepo("referrer_host").getString("host", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setReferrerHost ");
        sbLIZ.append(string);
        C20441214yg.LIZIZ("GPExternalServiceProvider", C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_update_referrer_host");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(string, "referrer_host");
        String str2 = this.LIZ;
        if (str2 != null) {
            str = str2;
        }
        c474500IjALIZ.LJJII(str, "top_activity");
        c474500IjALIZ.LIZ();
        LJIIL(c474500IjALIZ);
    }
}
