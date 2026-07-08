package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMFeatureCapability;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMSelfBizInfoResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.06Mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1594306Mb {
    public static volatile Map<String, Integer> LIZ;

    public static void LIZ(IMSelfBizInfoResponse iMSelfBizInfoResponse) {
        IMFeatureCapability iMFeatureCapability;
        if (iMSelfBizInfoResponse != null && (iMFeatureCapability = iMSelfBizInfoResponse.imFeatureCapability) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = iMFeatureCapability.messageLongPressAndReactStatus;
            if (num != null) {
                linkedHashMap.put("dm_message_interaction_status", Integer.valueOf(num.intValue()));
            }
            Integer num2 = iMFeatureCapability.messageRequestBannerStatus;
            if (num2 != null) {
                linkedHashMap.put("message_request_banner_status", Integer.valueOf(num2.intValue()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decodeResponse: updating with ");
            sbLIZ.append(linkedHashMap.size());
            sbLIZ.append(" entries, values=");
            sbLIZ.append(linkedHashMap);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ = linkedHashMap;
            try {
                C12925053z.LIZ().storeString("key_feature_capability", C13LP.LJJLIIIJ(linkedHashMap.entrySet(), ",", null, null, 0, null, AnonymousClass0207.get$arr$(55), 30));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("storeFeatureCapabilityMap error: ");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }
}
