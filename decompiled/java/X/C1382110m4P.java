package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMGroupChatPermissionInfo;

/* JADX INFO: renamed from: X.0m4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382110m4P {
    public static final boolean LIZ(IMGroupChatPermissionInfo iMGroupChatPermissionInfo) {
        FeatureResult featureResult;
        boolean z = false;
        if (iMGroupChatPermissionInfo != null && (featureResult = iMGroupChatPermissionInfo.featureResult) != null) {
            Integer num = featureResult.featureStatus;
            int iOrdinal = C0ZVN.IM_FEATURE_STATUS_DISALLOWED.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                z = true;
            }
        }
        return !z;
    }
}
