package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentIMConversation;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.IMInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0RVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697060RVw {
    public static final C697060RVw LIZ = new C697060RVw();

    public static boolean LIZ(Fragment fragment, Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        IMInfo imInfo;
        Integer numValueOf;
        ContentIMConversation contentIMConversation;
        String str;
        ContentIMConversation contentIMConversation2;
        String str2;
        ContentIMConversation contentIMConversation3;
        String str3;
        C0RJN c0rjnLIZIZ;
        if (aweme == null || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (imInfo = standardBusinessModel.getImInfo()) == null || !imInfo.displayQuickReplyBox || imInfo.recType != 1) {
            return false;
        }
        ContentIMConversation contentIMConversation4 = imInfo.contentIMConversation;
        if (contentIMConversation4 == null) {
            if (imInfo.user == null) {
                return false;
            }
        } else {
            String str4 = null;
            if (contentIMConversation4 != null && (numValueOf = Integer.valueOf(contentIMConversation4.conversationType)) != null) {
                if (numValueOf.intValue() == 1) {
                    User user = imInfo.user;
                    if (user == null || user.getFollowStatus() != 2) {
                        return false;
                    }
                } else if (numValueOf.intValue() == 2 && (contentIMConversation = imInfo.contentIMConversation) != null && (str = contentIMConversation.conversationId) != null && str.length() != 0 && (contentIMConversation2 = imInfo.contentIMConversation) != null && (str2 = contentIMConversation2.groupName) != null && str2.length() != 0 && (contentIMConversation3 = imInfo.contentIMConversation) != null && (str3 = contentIMConversation3.groupAvatarUrl) != null && str3.length() != 0) {
                    InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
                    ContentIMConversation contentIMConversation5 = imInfo.contentIMConversation;
                    if (contentIMConversation5 != null) {
                        str4 = contentIMConversation5.conversationId;
                    }
                    if (interfaceC876950YajLIZIZ.LIZ(str4) == null) {
                        return false;
                    }
                }
                if (C729510SjV.LJJIJIL(aweme)) {
                    return false;
                }
                if ((fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && !C1389300mG0.LJIL(c0rjnLIZIZ)) || C1336205Ku.LIZJ().LIZJ() || C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
