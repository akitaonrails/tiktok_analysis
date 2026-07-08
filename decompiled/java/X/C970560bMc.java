package X;

import Y.ARunnableS48S0300000_15;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970560bMc {
    public static C970590bMf LIZIZ(CompetitionInfo competitionInfo) {
        boolean z;
        CompetitionCommon competitionCommon = competitionInfo.bizCommon;
        if (competitionCommon == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("validateCompetitionInfo");
            sbLIZ.append(": bizCommon is empty");
            C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ));
            return new C970590bMf(false, EnumC970570bMd.FAIL_BIZ_COMMON_NULL);
        }
        Integer numValueOf = Integer.valueOf(competitionCommon.type);
        int type = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType();
        if (numValueOf != null && numValueOf.intValue() == type) {
            if (competitionInfo.beansInfo == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("validateCompetitionInfo");
                sbLIZ2.append(": beanInfo is empty");
                C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ2));
                return new C970590bMf(false, EnumC970570bMd.FAIL_TAKE_STAGE_INFO_NULL);
            }
        } else {
            int type2 = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.getType();
            if (numValueOf != null && numValueOf.intValue() == type2 && competitionInfo.takeTheStageInfo == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("validateCompetitionInfo");
                sbLIZ3.append(": takeTheStageInfo is empty");
                C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ3));
                return new C970590bMf(false, EnumC970570bMd.FAIL_TAKE_STAGE_INFO_NULL);
            }
        }
        if (competitionCommon.channelId != C915980Zwa.LJI().LJIIJ().getChannelId()) {
            C20441214yg.LJ("CompetitionInfoIdentifier", "validateCompetitionInfo: channelId has changed");
            return new C970590bMf(false, EnumC970570bMd.FAIL_CHANNEL_ID_MISMATCH);
        }
        long j = competitionCommon.competitionId;
        if (j == 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("validateCompetitionInfo");
            sbLIZ4.append(": competitionId is empty ");
            C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ4));
            return new C970590bMf(false, EnumC970570bMd.FAIL_COMPETITION_ID_0);
        }
        if (C973910bS1.LIZIZ(C950220apo.LIZLLL(), j)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("validateCompetitionInfo");
            sbLIZ5.append(": competitionId is expired: ");
            sbLIZ5.append(j);
            C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ5));
            return new C970590bMf(false, EnumC970570bMd.FAIL_COMPETITION_ID_FINISHED);
        }
        C982460bfo c982460bfoLIZLLL = C982440bfm.LIZLLL(competitionInfo);
        int i = C970580bMe.LIZ[c982460bfoLIZLLL.LJ.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("checkCompetitionStatus");
        sbLIZ6.append(", source=");
        sbLIZ6.append("validateCompetitionInfo");
        sbLIZ6.append(", checkResult=");
        sbLIZ6.append(z);
        sbLIZ6.append(", infoResult.bizStatus=");
        sbLIZ6.append(c982460bfoLIZLLL.LJ);
        C20441214yg.LIZIZ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ6));
        if (!z) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("validateCompetitionInfo");
            sbLIZ7.append(": checkCompetitionStatus failed");
            C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ7));
            return new C970590bMf(false, EnumC970570bMd.FAIL_COMPETITION_STATUS_FINISHED);
        }
        return new C970590bMf(true, EnumC970570bMd.SUCCESS);
    }

    public final void LIZ(LiveWidget liveWidget, CompetitionInfo competitionInfo, Function2<? super CompetitionInfo, ? super Integer, Unit> function2) {
        C970590bMf c970590bMfLIZIZ = LIZIZ(competitionInfo);
        if (c970590bMfLIZIZ.LIZ) {
            C20441214yg.LIZIZ("CompetitionInfoIdentifier", "Competition info identify success");
            function2.invoke(competitionInfo, 0);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Competition info identify failed, isNeedRetryApi=");
        sbLIZ.append(c970590bMfLIZIZ.LIZIZ.isNeedRetryApi());
        sbLIZ.append(", result_type=");
        sbLIZ.append(c970590bMfLIZIZ);
        C20441214yg.LIZIZ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        if (!c970590bMfLIZIZ.LIZIZ.isNeedRetryApi()) {
            return;
        }
        C473410IhP.LIZJ(new ARunnableS48S0300000_15(this, liveWidget, function2, 5), ((long) LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryDuration()) * 2000);
    }
}
