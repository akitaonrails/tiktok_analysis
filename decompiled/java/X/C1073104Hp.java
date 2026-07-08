package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073104Hp {
    public static final Map<String, Object> LIZ(ClaimVoucherRequest claimVoucherRequest) {
        Map<String, String> trackParam;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("voucher_type_id", claimVoucherRequest.voucherTypeID);
        linkedHashMap.put("request_source", Integer.valueOf(claimVoucherRequest.requestSource));
        Integer num = claimVoucherRequest.trafficSource;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("source", claimVoucherRequest.trafficSource);
        }
        String str = claimVoucherRequest.btm;
        if (str != null) {
            linkedHashMap.put("btm", str);
        }
        Integer num2 = claimVoucherRequest.claimType;
        if (num2 != null) {
            num2.intValue();
            linkedHashMap.put("claim_type", claimVoucherRequest.claimType);
        }
        BCMStandardTrack bCMStandardTrack = claimVoucherRequest.LIZ;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            linkedHashMap.putAll(trackParam);
        }
        Map<String, String> map = claimVoucherRequest.transparentFields;
        if (map != null) {
            linkedHashMap.put("transparent_fields", map);
        }
        String str2 = claimVoucherRequest.instanceKey;
        if (str2 != null) {
            linkedHashMap.put("instance_key", str2);
        }
        return linkedHashMap;
    }
}
