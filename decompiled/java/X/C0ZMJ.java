package X;

import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMJ extends C09AY implements Function0<C908990ZlJ> {
    public C0ZMJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZlJ] */
    @Override // kotlin.jvm.functions.Function0
    public final C908990ZlJ invoke() {
        return new InterfaceC1707406mO() { // from class: X.0ZlJ
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(452));

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1707406mO
            public final Object LIZ(String str, InterfaceC898340ZMa interfaceC898340ZMa) {
                LightInteractionMetaData lightInteractionMetaData;
                Object objValueOf;
                LightInteractionExitBean lightInteractionExitBean;
                long j;
                int iCeil;
                long j2;
                long jLongValue;
                long j3;
                Long l;
                if ((interfaceC898340ZMa instanceof LightInteractionMetaData) && (lightInteractionMetaData = (LightInteractionMetaData) interfaceC898340ZMa) != null) {
                    switch (str.hashCode()) {
                        case -1838455465:
                            if (str.equals("latest_message_create_time_gap")) {
                                LightInteractionExitBean lightInteractionExitBean2 = lightInteractionMetaData.lightInteractionExitBean;
                                if (lightInteractionExitBean2 != null && (l = lightInteractionExitBean2.latestMessageCreateTime) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                if (C0ZMM.LL.LJIIJ()) {
                                    j3 = lightInteractionMetaData.currentLocaleTimeSecond;
                                } else {
                                    j3 = lightInteractionMetaData.currentServerTimeSecond;
                                }
                                objValueOf = Long.valueOf(j3 - jLongValue);
                            }
                            break;
                        case -1738095284:
                            if (str.equals("has_streak_reminder_inline_msg")) {
                                objValueOf = Boolean.valueOf(lightInteractionMetaData.hasStreakReminderInlineMsg);
                            }
                            break;
                        case -1571648937:
                            if (str.equals("current_user_dm_permission")) {
                                objValueOf = lightInteractionMetaData.currentUserDMPermission;
                            }
                            break;
                        case -1229667798:
                            if (str.equals("latest_message_type")) {
                                objValueOf = lightInteractionMetaData.latestMessageType;
                            }
                            break;
                        case -1063828701:
                            if (str.equals("peer_user_can_messaged")) {
                                objValueOf = lightInteractionMetaData.peerUserCanMessaged;
                            }
                            break;
                        case -768607937:
                            if (str.equals("push_type")) {
                                objValueOf = Integer.valueOf(lightInteractionMetaData.innerPushType);
                            }
                            break;
                        case -650386594:
                            if (str.equals("online_status")) {
                                objValueOf = lightInteractionMetaData.onlineStatus;
                            }
                            break;
                        case -639977744:
                            if (str.equals("im_bulletin_board_type")) {
                                objValueOf = Integer.valueOf(lightInteractionMetaData.imBulletinBoardType);
                            }
                            break;
                        case -442503373:
                            if (str.equals("follower_status")) {
                                objValueOf = lightInteractionMetaData.followerStatus;
                            }
                            break;
                        case -321901593:
                            if (str.equals("is_recommend")) {
                                objValueOf = lightInteractionMetaData.isRecommend;
                            }
                            break;
                        case -232086048:
                            if (str.equals("inbox_say_hi_expiration")) {
                                Long l2 = lightInteractionMetaData.firstShowSayHiTimeMs;
                                if (l2 != null && l2.longValue() != -1) {
                                    if (C0ZMM.LL.LJIIJ()) {
                                        j2 = lightInteractionMetaData.currentLocaleTimeSecond;
                                    } else {
                                        j2 = lightInteractionMetaData.currentServerTimeSecond;
                                    }
                                    iCeil = (int) Math.ceil(((j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - l2.longValue()) / ((double) 86400000));
                                } else {
                                    iCeil = 0;
                                }
                                objValueOf = Integer.valueOf(iCeil);
                            }
                            break;
                        case -155849731:
                            if (str.equals("peer_user_have_birthday")) {
                                objValueOf = lightInteractionMetaData.peerUserHaveBirthday;
                            }
                            break;
                        case 80437536:
                            if (str.equals("entered_chat")) {
                                objValueOf = Boolean.valueOf(lightInteractionMetaData.enteredChat);
                            }
                            break;
                        case 80560026:
                            if (str.equals("from_path")) {
                                objValueOf = lightInteractionMetaData.fromPath;
                            }
                            break;
                        case 92525830:
                            if (str.equals("a_src")) {
                                objValueOf = lightInteractionMetaData.lastShowMsgAsrc;
                            }
                            break;
                        case 108801336:
                            if (str.equals("is_block")) {
                                objValueOf = lightInteractionMetaData.isBlock;
                            }
                            break;
                        case 757581174:
                            if (str.equals("conversation_type")) {
                                objValueOf = lightInteractionMetaData.conversationType;
                            }
                            break;
                        case 885584774:
                            if (str.equals("latest_message_send_from_me")) {
                                objValueOf = lightInteractionMetaData.latestMessageSendFromMe;
                            }
                            break;
                        case 1028143168:
                            if (str.equals("follow_status")) {
                                objValueOf = lightInteractionMetaData.followStatus;
                            }
                            break;
                        case 1052591083:
                            if (str.equals("is_stranger")) {
                                objValueOf = lightInteractionMetaData.isStranger;
                            }
                            break;
                        case 1123804964:
                            if (str.equals("light_interaction_frequency_control") && (lightInteractionExitBean = ((LightInteractionMetaData) interfaceC898340ZMa).lightInteractionExitBean) != null) {
                                if (C0ZMM.LL.LJIIJ()) {
                                    j = lightInteractionMetaData.currentLocaleTimeSecond;
                                } else {
                                    j = lightInteractionMetaData.currentServerTimeSecond;
                                }
                                return new C346070DhV(lightInteractionExitBean, j);
                            }
                            break;
                        case 1478872023:
                            if (str.equals("is_blocked")) {
                                objValueOf = lightInteractionMetaData.isBlocked;
                            }
                            break;
                        case 1634049650:
                            if (str.equals("have_message_today")) {
                                objValueOf = lightInteractionMetaData.haveMessageToday;
                            }
                            break;
                        case 1807406258:
                            if (str.equals("affinity_score_ranking")) {
                                objValueOf = lightInteractionMetaData.affinityScoreRanking;
                            }
                            break;
                        case 1949198463:
                            if (str.equals("unread_count")) {
                                objValueOf = lightInteractionMetaData.unreadCount;
                            }
                            break;
                        case 1950151569:
                            if (str.equals("latest_message_light_interaction_name")) {
                                objValueOf = lightInteractionMetaData.latestMessageLightInteractionName;
                            }
                            break;
                        case 2082056206:
                            if (str.equals("is_mute")) {
                                objValueOf = lightInteractionMetaData.isMute;
                            }
                            break;
                    }
                    if (objValueOf != null) {
                        return objValueOf;
                    }
                }
                return ((InterfaceC1707406mO) this.LIZ.getValue()).LIZ(str, interfaceC898340ZMa);
            }
        };
    }
}
