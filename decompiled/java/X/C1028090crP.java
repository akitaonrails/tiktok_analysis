package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0crP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028090crP {
    public static final /* synthetic */ int LIZ = 0;

    public static final AdlpExtraModel LIZ(Aweme aweme, NonAdWebModel nonAdWebModel, Integer num, String str, String str2, Boolean bool, Boolean bool2, String str3) {
        String requestId;
        String aid;
        User author;
        User author2 = null;
        Video video = null;
        AdlpExtraModel adlpExtraModel = new AdlpExtraModel(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
        UrlModel avatarLarger = null;
        if (aweme != null) {
            author2 = aweme.getAuthor();
        }
        adlpExtraModel.setAuthor(author2);
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        adlpExtraModel.setRequestId(requestId);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        adlpExtraModel.setAid(aid);
        if (aweme != null) {
            video = aweme.getVideo();
        }
        adlpExtraModel.setVideo(video);
        adlpExtraModel.setNonAdWebModel(nonAdWebModel);
        adlpExtraModel.setRefer(str);
        if (aweme != null && (author = aweme.getAuthor()) != null && (avatarLarger = author.getAvatarLarger()) == null && (avatarLarger = author.getAvatarMedium()) == null) {
            avatarLarger = author.getAvatarThumb();
        }
        adlpExtraModel.setAuthorAvatar(avatarLarger);
        adlpExtraModel.setContainerBgColor(str2);
        adlpExtraModel.setHideNavBar(bool);
        adlpExtraModel.setInitialData(str3);
        adlpExtraModel.setTransStatusBar(bool2);
        if (num != null) {
            num.intValue();
            adlpExtraModel.setLandingPageStyle(num);
        }
        return adlpExtraModel;
    }
}
