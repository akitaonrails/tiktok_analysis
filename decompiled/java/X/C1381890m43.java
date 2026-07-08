package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserCameraInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0m43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1381890m43 extends AbstractC1382150m4T<IMContact> {
    public static final /* synthetic */ int LIZJ = 0;
    public final C1381950m49 LIZIZ;

    public C1381890m43(C1368260li4 c1368260li4) {
        super(c1368260li4);
        this.LIZIZ = new C1381950m49(c1368260li4);
    }

    public boolean LIZ(IMContact iMContact) {
        IMUserBizInfo imUserBizInfo;
        IMUserCameraInfo cameraInfo;
        FeatureResult featureResult;
        if (!this.LIZIZ.LIZ(iMContact)) {
            return false;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            int followStatus = iMUser.getFollowStatus();
            if (!this.LIZ.LJII || C10EU.LJIIZILJ(iMUser.getUid()) || followStatus == 2) {
                C1368260li4 c1368260li4 = this.LIZ;
                if (c1368260li4.LIZIZ && followStatus != 2) {
                    return false;
                }
                if (c1368260li4.LJFF && iMUser.isBlock()) {
                    return false;
                }
                List<String> list = this.LIZ.LJIIIZ;
                if (list != null && C13LP.LJJJJ(iMUser.getUid(), list)) {
                    return false;
                }
                if (this.LIZ.LJIL && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (cameraInfo = imUserBizInfo.getCameraInfo()) != null && (featureResult = cameraInfo.featureResult) != null) {
                    Integer num = featureResult.featureStatus;
                    int iOrdinal = C0ZVN.IM_FEATURE_STATUS_DISALLOWED.ordinal();
                    if (num != null && num.intValue() == iOrdinal) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
        } else if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            C1368260li4 c1368260li42 = this.LIZ;
            if (!c1368260li42.LIZIZ || c1368260li42.LIZ == 3) {
                if (c1368260li42.LJJ) {
                    C0ZNY c0zny = C0ZNY.LIZ;
                    String conversationId = iMConversation.getConversationId();
                    if (conversationId == null) {
                        conversationId = "";
                    }
                    if (!c0zny.LIZLLL(conversationId, true)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
