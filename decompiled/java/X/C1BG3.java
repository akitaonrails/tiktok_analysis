package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMGroupChatPermissionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserCameraInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserChatBotInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserVoiceCallInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BG3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BG3 {
    public static C1BGM LIZ(IMUserBizInfo iMUserBizInfo) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLJ;
        long userId = iMUserBizInfo.getUserId();
        Integer shareFilterType = iMUserBizInfo.getShareFilterType();
        Double affinityScore = iMUserBizInfo.getAffinityScore();
        Long updateTime = iMUserBizInfo.getUpdateTime();
        IMUserB2CAccountInfo userB2CAccountInfo = iMUserBizInfo.getUserB2CAccountInfo();
        String strLIZJ5 = null;
        if (userB2CAccountInfo != null) {
            strLIZJ = LIZJ(userB2CAccountInfo);
        } else {
            strLIZJ = null;
        }
        IMUserChatBotInfo chatBotInfo = iMUserBizInfo.getChatBotInfo();
        if (chatBotInfo != null) {
            strLIZJ2 = LIZJ(chatBotInfo);
        } else {
            strLIZJ2 = null;
        }
        IMUserCameraInfo cameraInfo = iMUserBizInfo.getCameraInfo();
        if (cameraInfo != null) {
            strLIZJ3 = LIZJ(cameraInfo);
        } else {
            strLIZJ3 = null;
        }
        Integer numValueOf = Integer.valueOf(!Intrinsics.LJFF(iMUserBizInfo.getAllowSingleChatScreenshot(), Boolean.FALSE) ? 1 : 0);
        IMGroupChatPermissionInfo groupChatPermissionInfo = iMUserBizInfo.getGroupChatPermissionInfo();
        if (groupChatPermissionInfo != null) {
            strLIZJ4 = LIZJ(groupChatPermissionInfo);
        } else {
            strLIZJ4 = null;
        }
        Integer activityStatusSetting = iMUserBizInfo.getActivityStatusSetting();
        Long chatBubbleId = iMUserBizInfo.getChatBubbleId();
        List<String> unlockedBubbleIds = iMUserBizInfo.getUnlockedBubbleIds();
        if (unlockedBubbleIds != null) {
            strLJ = C051M.LJ(unlockedBubbleIds, false);
        } else {
            strLJ = null;
        }
        IMUserVoiceCallInfo voiceCallInfo = iMUserBizInfo.getVoiceCallInfo();
        if (voiceCallInfo != null) {
            strLIZJ5 = LIZJ(voiceCallInfo);
        }
        return new C1BGM(userId, shareFilterType, affinityScore, updateTime, strLIZJ, strLIZJ2, strLIZJ3, numValueOf, strLIZJ4, activityStatusSetting, chatBubbleId, strLJ, strLIZJ5);
    }

    public static IMUserBizInfo LIZIZ(C1BGM c1bgm) {
        IMUserB2CAccountInfo iMUserB2CAccountInfo;
        IMUserChatBotInfo iMUserChatBotInfo;
        IMUserCameraInfo iMUserCameraInfo;
        boolean z;
        IMGroupChatPermissionInfo iMGroupChatPermissionInfo;
        IMUserVoiceCallInfo iMUserVoiceCallInfo;
        IMUserBizInfo iMUserBizInfo = new IMUserBizInfo();
        iMUserBizInfo.setUserId(c1bgm.LIZ);
        iMUserBizInfo.setShareFilterType(c1bgm.LIZIZ);
        String str = c1bgm.LJ;
        List<String> listLJJLL = null;
        if (str != null) {
            iMUserB2CAccountInfo = (IMUserB2CAccountInfo) LIZLLL(IMUserB2CAccountInfo.class, str);
        } else {
            iMUserB2CAccountInfo = null;
        }
        iMUserBizInfo.setUserB2CAccountInfo(iMUserB2CAccountInfo);
        String str2 = c1bgm.LJFF;
        if (str2 != null) {
            iMUserChatBotInfo = (IMUserChatBotInfo) LIZLLL(IMUserChatBotInfo.class, str2);
        } else {
            iMUserChatBotInfo = null;
        }
        iMUserBizInfo.setChatBotInfo(iMUserChatBotInfo);
        iMUserBizInfo.setUpdateTime(c1bgm.LIZLLL);
        iMUserBizInfo.setAffinityScore(c1bgm.LIZJ);
        String str3 = c1bgm.LJI;
        if (str3 != null) {
            iMUserCameraInfo = (IMUserCameraInfo) LIZLLL(IMUserCameraInfo.class, str3);
        } else {
            iMUserCameraInfo = null;
        }
        iMUserBizInfo.setCameraInfo(iMUserCameraInfo);
        Integer num = c1bgm.LJII;
        if (num != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        iMUserBizInfo.setAllowSingleChatScreenshot(Boolean.valueOf(z));
        String str4 = c1bgm.LJIIIIZZ;
        if (str4 != null) {
            iMGroupChatPermissionInfo = (IMGroupChatPermissionInfo) LIZLLL(IMGroupChatPermissionInfo.class, str4);
        } else {
            iMGroupChatPermissionInfo = null;
        }
        iMUserBizInfo.setGroupChatPermissionInfo(iMGroupChatPermissionInfo);
        iMUserBizInfo.setActivityStatusSetting(c1bgm.LJIIIZ);
        iMUserBizInfo.setChatBubbleId(c1bgm.LJIIJ);
        String str5 = c1bgm.LJIIL;
        if (str5 != null) {
            iMUserVoiceCallInfo = (IMUserVoiceCallInfo) LIZLLL(IMUserVoiceCallInfo.class, str5);
        } else {
            iMUserVoiceCallInfo = null;
        }
        iMUserBizInfo.setVoiceCallInfo(iMUserVoiceCallInfo);
        String str6 = c1bgm.LJIIJJI;
        if (str6 != null && str6.length() != 0) {
            try {
                String[] strArr = (String[]) C051M.LIZ(String[].class, str6);
                if (strArr != null) {
                    listLJJLL = C13LQ.LJJLL(strArr);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unlockedBubbleIdsFromJson err: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        iMUserBizInfo.setUnlockedBubbleIds(listLJJLL);
        return iMUserBizInfo;
    }

    public static String LIZJ(Object obj) {
        try {
            return C051M.LJ(obj, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err: ");
            sbLIZ.append(Log.getStackTraceString(e));
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public static Object LIZLLL(Class cls, String str) {
        try {
            return C051M.LIZ(cls, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err: ");
            sbLIZ.append(Log.getStackTraceString(e));
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }
}
