package X;

import com.bytedance.android.live.wallet.IWalletService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078150eA9 {
    public static final Map<Integer, String> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(4, "video_gifting");
        LIZ = linkedHashMap;
    }

    public static long LIZ(long j, long j2) {
        long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        if (j == 0 && j2 > 0) {
            return j2 - jNo0;
        }
        return j;
    }
}
