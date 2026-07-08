package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NudgeData;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907150zjF {
    public static final C1907150zjF LIZ = new C1907150zjF();

    public static boolean LIZ(Context context, MusNotice musNotice, InterfaceC1907020zj2 interfaceC1907020zj2) {
        NoticeUITemplate noticeUITemplate;
        List<NoticeUITemplateButton> list;
        EnumC1906270zhp scenario;
        User user;
        NoticeUITemplate noticeUITemplate2;
        C896130ZDn c896130ZDnLIZ;
        NoticeExtraData noticeExtraData;
        TitleTemplate titleTemplate;
        List<User> list2;
        CommentService.LIZ.getClass();
        if (!C523420Kfs.LIZ().LJLIIL()) {
            return false;
        }
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        NudgeData nudgeData = null;
        if (generalTemplateNotice != null) {
            noticeUITemplate = generalTemplateNotice.uiTemplate;
        } else {
            noticeUITemplate = null;
        }
        if (noticeUITemplate != null && (list = noticeUITemplate.middleBottomButtons) != null) {
            Iterator<NoticeUITemplateButton> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num = it2.next().type;
                if (num != null && num.intValue() == 4) {
                    if (interfaceC1907020zj2 != null) {
                        scenario = interfaceC1907020zj2.getScenario();
                    } else {
                        scenario = null;
                    }
                    if (scenario != EnumC1906270zhp.NEW_ACTIVITY) {
                        return true;
                    }
                    C1907400zje c1907400zje = C1907400zje.LIZ;
                    if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list2 = titleTemplate.fromUsers) != null) {
                        user = (User) C13LP.LJJJLL(list2);
                    } else {
                        user = null;
                    }
                    GeneralTemplateNotice generalTemplateNotice2 = musNotice.templateNotice;
                    if (generalTemplateNotice2 != null && (noticeExtraData = generalTemplateNotice2.extraData) != null) {
                        nudgeData = noticeExtraData.nudgeData;
                    }
                    InterfaceC1907310zjV interfaceC1907310zjVU0 = interfaceC1907020zj2.u0();
                    c1907400zje.getClass();
                    GeneralTemplateNotice generalTemplateNotice3 = musNotice.templateNotice;
                    if (generalTemplateNotice3 != null && (noticeUITemplate2 = generalTemplateNotice3.uiTemplate) != null && noticeUITemplate2.rightSecondaryType == 1 && (c896130ZDnLIZ = C1907400zje.LIZ(musNotice, user, nudgeData, context, interfaceC1907310zjVU0)) != null && interfaceC1907310zjVU0 != null && interfaceC1907310zjVU0.LIZ(c896130ZDnLIZ)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
