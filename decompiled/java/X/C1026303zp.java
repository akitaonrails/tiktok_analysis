package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest;
import java.util.HashMap;

/* JADX INFO: renamed from: X.03zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026303zp {
    public static void LIZ(FragmentManager fragmentManager, String str, String str2, String str3, String str4, String str5, HashMap map) {
        boolean z;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = (int) C958103op.LIZIZ();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJIIJIL = true;
        AuctionAddressPayFragment auctionAddressPayFragment = new AuctionAddressPayFragment();
        String str10 = "";
        if (str9 == null) {
            str9 = "";
        }
        if (str8 == null) {
            str8 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (((Boolean) AnonymousClass0403.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (str5 != null) {
            str10 = str5;
        }
        auctionAddressPayFragment.LLJILJILJ = new GetAuctionInfoRequest(str9, str8, str7, str6, boolValueOf, str10);
        auctionAddressPayFragment.LLJILLL = map;
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJI = auctionAddressPayFragment;
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLJLLL = false;
        tuxSheet2.LLILZIL = true;
        tuxSheet2.show(fragmentManager, "live_auction_address_pay_fragment");
    }
}
