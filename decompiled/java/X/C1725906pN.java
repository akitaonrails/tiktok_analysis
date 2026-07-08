package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.BusinessToolsItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.CommentToDmSetting;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMB2CBusinessInfoAvgResp;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureValueData;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.06pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1725906pN {
    public static IMUserFeatureValueData LIZ(EnumC1725606pK enumC1725606pK, Object obj) {
        IMRelationLabelInfo iMRelationLabelInfo;
        IMUserArchiveSettings iMUserArchiveSettings;
        Integer num;
        IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp;
        MessageRequestSetting messageRequestSetting;
        CommentToDmSetting commentToDmSetting;
        MessageAlert messageAlert;
        ArrayList arrayList = null;
        switch (C1726106pP.LIZ[enumC1725606pK.ordinal()]) {
            case 1:
                if (!(obj instanceof IMUserArchiveSettings) || (iMUserArchiveSettings = (IMUserArchiveSettings) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, null, iMUserArchiveSettings, null, null, null, null, null);
            case 2:
                if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(num.intValue(), null, null, null, null, null, null, null);
            case 3:
                if (!(obj instanceof IMB2CBusinessInfoAvgResp) || (iMB2CBusinessInfoAvgResp = (IMB2CBusinessInfoAvgResp) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, iMB2CBusinessInfoAvgResp, null, null, null, null, null, null);
            case 4:
                if (!(obj instanceof MessageRequestSetting) || (messageRequestSetting = (MessageRequestSetting) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, null, null, messageRequestSetting, null, null, null, null);
            case 5:
                if (!(obj instanceof CommentToDmSetting) || (commentToDmSetting = (CommentToDmSetting) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, null, null, null, commentToDmSetting, null, null, null);
            case 6:
                if (obj instanceof List) {
                    arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (obj2 instanceof BusinessToolsItem) {
                            arrayList.add(obj2);
                        }
                    }
                }
                return new IMUserFeatureValueData(0, null, null, null, null, arrayList, null, null);
            case 7:
                if (!(obj instanceof MessageAlert) || (messageAlert = (MessageAlert) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, null, null, null, null, null, messageAlert, null);
            case 8:
                if (!(obj instanceof IMRelationLabelInfo) || (iMRelationLabelInfo = (IMRelationLabelInfo) obj) == null) {
                    return null;
                }
                return new IMUserFeatureValueData(0, null, null, null, null, null, null, iMRelationLabelInfo);
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
