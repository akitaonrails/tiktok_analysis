package X;

import com.bytedance.android.live.wallet.IWalletService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0wqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796590wqv {
    public static void LIZ(String str, HashMap<String, Object> map) {
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).monitor(str, map);
    }

    public static void LIZIZ(int i, String str, String str2) {
        LIZJ(str, i, -1, str2, new HashMap());
    }

    public static void LIZJ(String str, int i, int i2, String str2, HashMap<String, Object> map) {
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).monitorException(str, i, i2, str2, map);
    }
}
