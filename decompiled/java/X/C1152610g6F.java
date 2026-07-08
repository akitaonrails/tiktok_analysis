package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletIapMoneyPlatformHost;
import com.bytedance.globalpayment.payment.common.lib.model.setting.IAPSettingConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0g6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152610g6F {
    public final InterfaceC1152450g5z LIZ;
    public String LIZIZ;
    public IAPSettingConfiguration LIZJ;

    public C1152610g6F() {
        C1152440g5y c1152440g5y = new InterfaceC1152450g5z() { // from class: X.0g5y
            @Override // X.InterfaceC1152450g5z
            public final String LIZ() {
                return LiveWalletIapMoneyPlatformHost.INSTANCE.getValue();
            }
        };
        this.LIZIZ = "";
        this.LIZJ = new IAPSettingConfiguration();
        this.LIZ = c1152440g5y;
        LIZ();
    }

    public final void LIZ() {
        String strLIZ = this.LIZ.LIZ();
        if (!this.LIZIZ.equals(strLIZ) || this.LIZJ == null) {
            this.LIZIZ = strLIZ;
            try {
                this.LIZJ = (IAPSettingConfiguration) new Gson().LJII(this.LIZIZ, IAPSettingConfiguration.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZJ = new IAPSettingConfiguration();
            }
        }
    }
}
