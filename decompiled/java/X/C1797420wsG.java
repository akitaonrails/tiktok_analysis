package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797420wsG {
    public static String LIZIZ(C1797250wrz c1797250wrz) {
        if (c1797250wrz.LJI != 11) {
            return null;
        }
        int value = LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE.getValue();
        if (value != 1) {
            if (value != 2) {
                return null;
            }
            return "new_order";
        }
        return "retry_original";
    }

    public static String LIZ(Context context, C1797250wrz c1797250wrz) {
        if (c1797250wrz.LJI == 1) {
            return null;
        }
        try {
            if (new C815520Vyw(context).LIZ()) {
                if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Aj1()) {
                    return null;
                }
                return "transaction_notification";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "push_notification";
    }
}
