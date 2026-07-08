package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DQ extends C06DS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C06DR c06dr = (C06DR) xBaseParamModel;
        final int iIntValue = c06dr.getSceneId().intValue();
        String sceneRequestBody = c06dr.getSceneRequestBody();
        final String conversationId = c06dr.getConversationId();
        int iIntValue2 = c06dr.getConversationType().intValue();
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive ");
        sbLIZ.append(getName());
        sbLIZ.append(" jsb: Param: conversationId: ");
        sbLIZ.append(conversationId);
        sbLIZ.append(", conversationType: ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", sceneId: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" , requestBody: ");
        sbLIZ.append(sceneRequestBody);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C06DT.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        final C06DT c06dt = (C06DT) C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        C1569106Cj.LJ.getClass();
        C1569106Cj c1569106Cj = C1569106Cj.LJI;
        C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06CB(iIntValue, sceneRequestBody, conversationId, iIntValue2, c1569106Cj, new C06CH() { // from class: X.06Db
            @Override // X.C06CH
            public final void LIZ(Integer num, String str) {
                boolean z2 = C1590806Ks.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZ.getName());
                sbLIZ2.append(" jsb on API Failure, conversationId: ");
                sbLIZ2.append(conversationId);
                sbLIZ2.append(", sceneId: ");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(" , statusCode: ");
                sbLIZ2.append(num);
                sbLIZ2.append(", msg: ");
                sbLIZ2.append(str);
                C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                CompletionBlock<C06DT> completionBlock2 = completionBlock;
                C06DT c06dt2 = c06dt;
                c06dt2.setStatusCode(num);
                c06dt2.setStatusMsg(str);
                c06dt2.setSceneResponseBody("");
                c06dt2.setPetValue(C2097608Jq.LJ());
                completionBlock2.onSuccess(c06dt2, "");
            }

            @Override // X.C06CH
            public final void LIZIZ(StreakPetData streakPetData, Integer num, String str, String str2) {
                boolean z2;
                C1569306Cl c1569306ClLIZJ;
                StreakCampaignInfo streakCampaignInfo;
                String str3;
                String str4;
                StreakPetData streakPetData2;
                StreakPetData streakPetData3;
                boolean z3 = C1590806Ks.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZ.getName());
                sbLIZ2.append(" jsb on API Success, conversationId: ");
                sbLIZ2.append(conversationId);
                sbLIZ2.append(", streakPetData: ");
                sbLIZ2.append(streakPetData);
                sbLIZ2.append(" , sceneResponseBody: ");
                sbLIZ2.append(str2);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                CompletionBlock<C06DT> completionBlock2 = completionBlock;
                C06DT c06dt2 = c06dt;
                c06dt2.setStatusCode(num);
                c06dt2.setStatusMsg(str);
                c06dt2.setSceneResponseBody(str2);
                StreakLynxDataUtils.LIZ.getClass();
                if (C1571306Df.LJI(streakPetData)) {
                    z2 = streakPetData.isEggHidden;
                } else {
                    z2 = streakPetData.isHidden;
                }
                C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
                String str5 = streakPetData.conversationId;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                c1575806Ey.getClass();
                StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str5);
                C06C6 c06c6 = C06C6.LIZIZ;
                String str7 = streakPetData.conversationId;
                if (str7 == null) {
                    str7 = "";
                }
                c06c6.getClass();
                C06C7<C1569306Cl> c06c7 = C06C6.LJFF;
                synchronized (c06c7) {
                    c1569306ClLIZJ = c06c7.LIZIZ.LIZJ(str7);
                }
                C1569306Cl c1569306Cl = c1569306ClLIZJ;
                StreakExtension streakExtensionLIZ = C06HT.LIZ(streakPetData.conversationId);
                if (streakExtensionLIZ != null) {
                    streakCampaignInfo = streakExtensionLIZ.campaign;
                } else {
                    streakCampaignInfo = null;
                }
                int iLIZ = C06DJ.LIZ(streakPetData.conversationId, streakPetData, null, streakDataLJIIIIZZ);
                Pair[] pairArr = new Pair[15];
                pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(streakPetData.status));
                pairArr[1] = new Pair("substatus", Integer.valueOf(streakPetData.subStatus));
                pairArr[2] = new Pair("hatching_timestamp", Long.valueOf(streakPetData.hatchingTimestampInSeconds));
                pairArr[3] = new Pair("inviter_uid", String.valueOf(streakPetData.inviterUid));
                pairArr[4] = new Pair("experience_points", Integer.valueOf(streakPetData.experiencePoints));
                pairArr[5] = new Pair("exp_for_level", streakPetData.expForLevel);
                pairArr[6] = new Pair("name", streakPetData.name);
                pairArr[7] = new Pair("tasks", StreakLynxDataUtils.LIZJ(streakPetData));
                pairArr[8] = new Pair("is_hidden", Boolean.valueOf(z2));
                pairArr[9] = new Pair("pet_animation_type", Integer.valueOf(iLIZ));
                if (c1569306Cl == null || (streakPetData3 = c1569306Cl.LIZ) == null || (str3 = streakPetData3.feCommonData) == null) {
                    str3 = "";
                }
                pairArr[10] = new Pair("fe_common_data", str3);
                if (c1569306Cl == null || (streakPetData2 = c1569306Cl.LIZ) == null || (str4 = streakPetData2.feExtraData) == null) {
                    str4 = "";
                }
                pairArr[11] = new Pair("fe_extra_data", str4);
                String str8 = streakPetData.serverDataVersion;
                if (str8 == null) {
                    str8 = "";
                }
                pairArr[12] = new Pair("server_data_version", str8);
                C1571106Dd.LJ.getClass();
                C1571106Dd c1571106Dd = C1571106Dd.LJI;
                String str9 = streakPetData.conversationId;
                if (str9 != null) {
                    str6 = str9;
                }
                pairArr[13] = new Pair("streak_pet_fe_data", c1571106Dd.LIZ.getString(str6, ""));
                Keva keva = c1571106Dd.LIZ;
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                pairArr[14] = new Pair("user_level_streak_pet_fe_data", keva.getString(curUserId, ""));
                Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (streakCampaignInfo != null) {
                    mapLJIIJ.put("campaign", new JSONObject(GsonProtectorUtils.toJson(C09EF.LIZ, streakCampaignInfo)));
                }
                c06dt2.setPetValue(mapLJIIJ);
                completionBlock2.onSuccess(c06dt2, "");
            }
        }, null), 3);
    }
}
