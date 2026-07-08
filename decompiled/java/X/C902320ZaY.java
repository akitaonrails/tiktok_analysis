package X;

import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.social.sticker.model.base.RelationshipCelebrationInfo;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.List;

/* JADX INFO: renamed from: X.0ZaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902320ZaY {
    public static final boolean LIZ(int i, String str) {
        C902380Zae c902380ZaeLIZ;
        RelationshipCelebrationTarget relationshipCelebrationTargetLIZJ;
        List<RelationshipCelebrationInfo> list;
        C902380Zae c902380ZaeLIZ2;
        if (!C1717906o5.LIZ()) {
            return false;
        }
        StoryFriendAnniversaryService.LIZ.getClass();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
        if (storyFriendAnniversaryServiceLIZ != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) != null && (relationshipCelebrationTargetLIZJ = c902380ZaeLIZ.LIZJ(str)) != null) {
            C902390Zaf.LIZ.getClass();
            if (C902390Zaf.LIZ("card_shown_", str, relationshipCelebrationTargetLIZJ)) {
                return false;
            }
            if (i == 1 && C902390Zaf.LIZ("inline_msg_prefix_", str, relationshipCelebrationTargetLIZJ)) {
                return false;
            }
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(relationshipCelebrationTargetLIZJ.celebratingUserId), "", "im_local_db");
            if (iMUserLJIIL != null && iMUserLJIIL.getFollowStatus() != 2) {
                StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ2 = C902340Zaa.LIZ();
                if (storyFriendAnniversaryServiceLIZ2 != null && (c902380ZaeLIZ2 = storyFriendAnniversaryServiceLIZ2.LIZ(C461720I8s.LIZIZ())) != null) {
                    c902380ZaeLIZ2.LJIIIZ(str);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iMUserLJIIL.getFollowStatus());
                sbLIZ.append(" show failed: relation check");
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            String.valueOf(C0YNP.LJII(str));
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId != null && (list = C902390Zaf.LIZIZ.get(curUserId)) != null) {
                for (RelationshipCelebrationInfo relationshipCelebrationInfo : list) {
                    Integer num = relationshipCelebrationInfo.celebrationType;
                    if (num != null && num.intValue() == 8) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        Long l = relationshipCelebrationInfo.celebrationStartTime;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            Long l2 = relationshipCelebrationInfo.celebrationEndTime;
                            if (l2 != null) {
                                long jLongValue2 = l2.longValue();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(jLongValue);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(jCurrentTimeMillis);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(jLongValue2);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (jLongValue <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue2) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final void LIZIZ(String str, RelationshipCelebrationTarget relationshipCelebrationTarget) {
        C902390Zaf.LIZ.getClass();
        C902390Zaf.LJFF("inline_msg_prefix_", str, relationshipCelebrationTarget);
    }

    public static final void LIZJ(String str, RelationshipCelebrationTarget relationshipCelebrationTarget) {
        if (relationshipCelebrationTarget == null) {
            return;
        }
        C902390Zaf.LIZ.getClass();
        C902390Zaf.LJFF("card_shown_", str, relationshipCelebrationTarget);
    }
}
