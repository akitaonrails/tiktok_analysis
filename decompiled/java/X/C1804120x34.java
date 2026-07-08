package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0x34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804120x34 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z) {
        String str2;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        iWalletService.reportWebappProfileBannerCheck(str2, str);
    }
}
