package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.C2PAInfo;
import com.ss.android.ugc.aweme.feed.model.ModerationAigcInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SD5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SD5 {
    public static final boolean LIZIZ(Aweme aweme) {
        if (LIZLLL(aweme)) {
            return true;
        }
        AIGCInfo aIGCInfo = aweme.aigcInfo;
        if ((aIGCInfo != null && aIGCInfo.getAIGCLabelType() == 1 && ComplianceServiceProvider.LJI().LJIJI()) || LIZJ(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        C2PAInfo c2paInfo;
        String str;
        String str2;
        List listLJJLIIIJ;
        AwemeTextLabelModel followerLabel;
        String labelName;
        User author;
        AIGCInfo aIGCInfo = aweme.aigcInfo;
        if (aIGCInfo != null && aIGCInfo.getAIGCLabelType() == 2 && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_auto_aigc_label_show", true) == 1 && C1017070cZd.LJIL(aweme).length() == 0 && (((awemeRawAd = aweme.getAwemeRawAd()) == null || (followerLabel = awemeRawAd.getFollowerLabel()) == null || !followerLabel.isEnableShow() || (labelName = followerLabel.getLabelName()) == null || labelName.length() == 0 || (author = aweme.getAuthor()) == null || author.getFollowerCount() < 5000) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getLabel() == null || C1911600zqQ.LIZIZ.LIZ(aweme)))) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_label_show_allow_c2pa", true) == 1 || (c2paInfo = aweme.getC2paInfo()) == null || (str = c2paInfo.aigcSrc) == null || !a0.LJJIIZI(str, "meta_contain_c2pa", false)) {
                return true;
            }
            C2PAInfo c2paInfo2 = aweme.getC2paInfo();
            if (c2paInfo2 != null && (str2 = c2paInfo2.aigcSrc) != null && (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{','}, false, 0, 6)) != null && listLJJLIIIJ.size() > 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        String uid;
        String curUserId;
        AIGCInfo aIGCInfo;
        User author = aweme.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            return false;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            curUserId = iAccountUserServiceLJFF.getCurUserId();
        } else {
            curUserId = null;
        }
        ModerationAigcInfo moderationAigcInfo = aweme.getModerationAigcInfo();
        if (moderationAigcInfo == null || moderationAigcInfo.moderationUserLabelStatus != 100 || (aIGCInfo = aweme.aigcInfo) == null || aIGCInfo.getAIGCLabelType() != 0 || !Intrinsics.LJFF(uid, curUserId)) {
            return false;
        }
        return true;
    }

    public static final String LIZ(Context context, Aweme aweme) {
        AIGCInfo aIGCInfo;
        boolean z;
        String string;
        String string2;
        String string3;
        String string4;
        if (aweme != null && (aIGCInfo = aweme.aigcInfo) != null) {
            int aIGCLabelType = aIGCInfo.getAIGCLabelType();
            if (LIZLLL(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (context == null || (string4 = context.getString(2131849490)) == null) {
                    return "";
                }
                return string4;
            }
            if (aIGCLabelType == 1) {
                if (context == null || (string3 = context.getString(2131849490)) == null) {
                    return "";
                }
                return string3;
            }
            if (C0SD6.LIZ()) {
                if (context == null || (string2 = context.getString(2131826256)) == null) {
                    return "";
                }
                return string2;
            }
            if (context != null && (string = context.getString(2131820574)) != null) {
                return string;
            }
        }
        return "";
    }
}
