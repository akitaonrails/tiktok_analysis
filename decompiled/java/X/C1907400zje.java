package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NudgeData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0zje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907400zje {
    public static final C1907400zje LIZ = new C1907400zje();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static long LIZJ = Long.MAX_VALUE;

    public static C896130ZDn LIZ(BaseNotice baseNotice, User user, NudgeData nudgeData, Context context, InterfaceC1907310zjV interfaceC1907310zjV) {
        boolean z;
        String string;
        long jLongValue;
        boolean z2;
        boolean z3;
        Long l;
        Long l2;
        if (nudgeData == null || user == null) {
            return null;
        }
        GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
        if (generalTemplateNotice != null) {
            z = generalTemplateNotice.hasRead;
        } else {
            z = baseNotice.hasRead;
        }
        if ((generalTemplateNotice == null || (l2 = generalTemplateNotice.nid) == null || (string = l2.toString()) == null) && (string = baseNotice.nid) == null) {
            string = "";
        }
        GeneralTemplateNotice generalTemplateNotice2 = baseNotice.templateNotice;
        if (generalTemplateNotice2 != null && (l = generalTemplateNotice2.createTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = baseNotice.createTime;
        }
        if (interfaceC1907310zjV != null && interfaceC1907310zjV.LIZLLL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Set<String> set = LIZIZ;
        if (!set.contains(string)) {
            if (z && jLongValue <= LIZJ) {
                z3 = false;
                if (!z2) {
                    int i = C2187451AjH.LIZ;
                    return null;
                }
            } else {
                set.add(string);
                if (LIZJ == Long.MAX_VALUE) {
                    LIZJ = jLongValue;
                }
                z3 = true;
            }
        } else {
            z3 = true;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notice support nudge, isInNewNotice: ");
        sbLIZ.append(z3);
        sbLIZ.append(", debugFlag: ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        int length = C0IB7.values().length;
        int i3 = nudgeData.nudgeType;
        if (i3 < 0 || i3 >= length) {
            C1720106oR.LIZ("NoticeNudgeManager", "nudge type wrong");
            i3 = 0;
        }
        BaseContent.ReferenceVideo referenceVideoLJJIJIIJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIJIIJIL(nudgeData.isStory(), Integer.valueOf(nudgeData.awemeType), nudgeData.coverUrl, nudgeData.authorId, nudgeData.awemeId, FallbackStatusComponent.UNKNOWN, 0L);
        AttachmentTypeComponent attachmentTypeComponentLJIIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIIL(C0IB7.values()[i3]);
        return new C896130ZDn(context, string, z, user, new C0ZD9(C0ZDI.NOTICE_FREQUENCY_CONTROL, EnumC896030ZDd.NEW_ACTIVITIES, true, C0IB7.values()[i3], referenceVideoLJJIJIIJIL, user.getUid(), C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIJ(nudgeData.coverUrl, Integer.valueOf(nudgeData.awemeType), nudgeData.authorId, nudgeData.awemeId, attachmentTypeComponentLJIIL, nudgeData.isStory(), null, null), null, 128), nudgeData.enterMethod, z2);
    }
}
