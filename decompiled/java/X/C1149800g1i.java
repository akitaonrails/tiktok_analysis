package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletExchangeUseNewStarlingSetting;

/* JADX INFO: renamed from: X.0g1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149800g1i {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable()) {
            return C497740JfY.LJIJJ(2131852252, str);
        }
        return C497740JfY.LJIJJ(2131841631, str);
    }

    public static String LIZJ(String str, String str2) {
        return C497740JfY.LJIJJ(2131852265, str, str2);
    }

    public static String LIZIZ(long j, String str, String str2) {
        if (LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable()) {
            int i = (int) j;
            return C497740JfY.LJIIL(2131755834, i, Integer.valueOf(i), str, str2);
        }
        return C497740JfY.LJIJJ(2131841630, Long.valueOf(j), str, str2);
    }
}
