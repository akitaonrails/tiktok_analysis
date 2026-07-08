package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.ItemNoticeStruct;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeRightMultiTemplateStruct;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0zjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907180zjI {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.profile.model.User LIZLLL(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r4) {
        /*
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r3 = r4.templateNotice
            r1 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r3 == 0) goto L7c
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
        L8:
            r0 = 0
            if (r2 == r1) goto L67
            r1 = 21
            if (r2 == r1) goto L5a
            r1 = 23
            if (r2 == r1) goto L51
            r1 = 31
            if (r2 == r1) goto L42
            r1 = 33
            if (r2 == r1) goto L51
            r1 = 41
            if (r2 == r1) goto L31
            r1 = 45
            if (r2 == r1) goto L28
            r1 = 1003(0x3eb, float:1.406E-42)
            if (r2 == r1) goto L42
        L27:
            return r0
        L28:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r1 = r4.atMe
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            return r0
        L31:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r1 = r4.diggNotice
            if (r1 == 0) goto L27
            java.util.List r1 = r1.getUsers()
            if (r1 == 0) goto L27
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            return r0
        L42:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r4.commentNotice
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.getComment()
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            return r0
        L51:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice r1 = r4.followNotice
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            return r0
        L5a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r1 = r4.duetNotice
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.aweme
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getAuthor()
            return r0
        L67:
            if (r3 == 0) goto L27
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r1 = r3.uiTemplate
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate r1 = r1.titleTemplate
            if (r1 == 0) goto L27
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r1.fromUsers
            if (r1 == 0) goto L27
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            return r0
        L7c:
            int r2 = r4.type
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907180zjI.LIZLLL(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):com.ss.android.ugc.aweme.profile.model.User");
    }

    public static final boolean LJ(GeneralTemplateNotice generalTemplateNotice) {
        TitleTemplate titleTemplate;
        List<User> list;
        if (generalTemplateNotice == null) {
            return false;
        }
        Integer num = generalTemplateNotice.type;
        if (num == null || num.intValue() != 251) {
            Integer num2 = generalTemplateNotice.type;
            if (num2 == null || num2.intValue() != 252) {
                return false;
            }
            NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
            if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final UrlModel LIZ(NoticeUITemplate noticeUITemplate, Context context) {
        List<String> urlList;
        UrlModel urlModel = noticeUITemplate.darkModeQuoteImage;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty() && context != null && C960203pA.LIZIZ(context)) {
            return noticeUITemplate.darkModeQuoteImage;
        }
        return noticeUITemplate.quoteImage;
    }

    public static final UrlModel LIZIZ(NoticeUITemplate noticeUITemplate, Context context) {
        List<String> urlList;
        UrlModel urlModel = noticeUITemplate.darkModeRightImageUrl;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty() && context != null && C960203pA.LIZIZ(context)) {
            return noticeUITemplate.darkModeRightImageUrl;
        }
        return noticeUITemplate.rightImageUrl;
    }

    public static final UrlModel LIZJ(NoticeUITemplate noticeUITemplate, Context context, int i) {
        List<ItemNoticeStruct> list;
        ItemNoticeStruct itemNoticeStruct;
        List<ItemNoticeStruct> list2;
        ItemNoticeStruct itemNoticeStruct2;
        List<ItemNoticeStruct> list3;
        ItemNoticeStruct itemNoticeStruct3;
        NoticeRightMultiTemplateStruct noticeRightMultiTemplateStruct = noticeUITemplate.rightMulti;
        if (noticeRightMultiTemplateStruct != null && (list2 = noticeRightMultiTemplateStruct.items) != null && (itemNoticeStruct2 = (ItemNoticeStruct) C13LP.LJJJLZIJ(i, list2)) != null && itemNoticeStruct2.darkModeImageUrl != null && context != null && C960203pA.LIZIZ(context)) {
            NoticeRightMultiTemplateStruct noticeRightMultiTemplateStruct2 = noticeUITemplate.rightMulti;
            if (noticeRightMultiTemplateStruct2 != null && (list3 = noticeRightMultiTemplateStruct2.items) != null && (itemNoticeStruct3 = (ItemNoticeStruct) C13LP.LJJJLZIJ(i, list3)) != null) {
                return itemNoticeStruct3.darkModeImageUrl;
            }
            return null;
        }
        NoticeRightMultiTemplateStruct noticeRightMultiTemplateStruct3 = noticeUITemplate.rightMulti;
        if (noticeRightMultiTemplateStruct3 != null && (list = noticeRightMultiTemplateStruct3.items) != null && (itemNoticeStruct = (ItemNoticeStruct) C13LP.LJJJLZIJ(i, list)) != null) {
            return itemNoticeStruct.imageUrl;
        }
        return null;
    }
}
