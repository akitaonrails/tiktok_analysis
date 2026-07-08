package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.UserAuctionInfoData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.03zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026403zq extends Response<UserAuctionInfoData> implements Serializable {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isValid() {
        T t;
        if (!isCodeOK() || (t = this.data) == 0) {
            return false;
        }
        UserAuctionInfoData userAuctionInfoData = (UserAuctionInfoData) t;
        return (userAuctionInfoData.addressInfo == null || userAuctionInfoData.paymentInfo == null) ? false : true;
    }

    public C1026403zq(int i, String str, UserAuctionInfoData userAuctionInfoData) {
        super(i, str, userAuctionInfoData, null, null);
    }
}
