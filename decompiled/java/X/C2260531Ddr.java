package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: renamed from: X.1Ddr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260531Ddr {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Voucher voucher) {
        InstanceInfo instanceInfo;
        String instanceKey;
        n nVar = new n();
        nVar.LJJIIJ("voucher_type_id", voucher.getVoucherTypeID());
        List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null && (instanceKey = instanceInfo.getInstanceKey()) != null) {
            nVar.LJJIIJ("instance_key", instanceKey);
        }
        return nVar.toString();
    }

    public static final String LIZIZ(C11XN c11xn) {
        int i = C11XM.LIZ[c11xn.ordinal()];
        if (i == 1 || i == 2) {
            return "1";
        }
        if (i != 3) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "2";
    }

    public static final C11XN LIZJ(Voucher voucher) {
        Integer voucherDisplayType;
        if (voucher.getVoucherDisplayType() != null && (voucherDisplayType = voucher.getVoucherDisplayType()) != null && voucherDisplayType.intValue() == 3) {
            return C11XN.FOLLOW;
        }
        String voucherID = voucher.getVoucherID();
        if (voucherID != null && voucherID.length() != 0) {
            String vapSchema = voucher.getVapSchema();
            if (vapSchema != null && vapSchema.length() != 0) {
                return C11XN.USE;
            }
            return C11XN.CLAIMED;
        }
        return C11XN.CLAIM;
    }
}
