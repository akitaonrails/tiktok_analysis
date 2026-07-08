package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672306gj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        C0I0B.LJFF.LIZIZ();
        if (sessionInfo != null && sessionInfo.isChatroomAnalyticsBlocked()) {
            return;
        }
        C20684815ws.LJIILLIIL("inline_message_show", LIZIZ(sessionInfo, c869590Y9l, null, null, 28));
    }

    public static Map LIZ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, String str, String str2, Map map) {
        String enterFromForMob;
        String enterMethod;
        String conversationId;
        String singleChatFromUserId;
        Integer numValueOf;
        String extrasInfoMobParams;
        Map<String, String> mapLIZ;
        String extrasInfoMobParams2;
        IMUser singleChatFromUser;
        Pair[] pairArr = new Pair[7];
        String strLJ = null;
        if (sessionInfo != null) {
            enterFromForMob = sessionInfo.getEnterFromForMob();
        } else {
            enterFromForMob = null;
        }
        pairArr[0] = new Pair("enter_from", enterFromForMob);
        if (sessionInfo != null) {
            enterMethod = sessionInfo.getEnterMethod();
        } else {
            enterMethod = null;
        }
        pairArr[1] = new Pair("enter_method", enterMethod);
        pairArr[2] = new Pair("inline_message_type", str);
        if (sessionInfo != null) {
            conversationId = sessionInfo.getConversationId();
        } else {
            conversationId = null;
        }
        pairArr[3] = new Pair("conversation_id", conversationId);
        if (sessionInfo != null) {
            singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
        } else {
            singleChatFromUserId = null;
        }
        pairArr[4] = new Pair("to_user_id", singleChatFromUserId);
        if (sessionInfo != null && (singleChatFromUser = sessionInfo.getSingleChatFromUser()) != null) {
            numValueOf = Integer.valueOf(singleChatFromUser.getFollowStatus());
        } else {
            numValueOf = null;
        }
        pairArr[5] = new Pair("relation_tag", String.valueOf(numValueOf));
        pairArr[6] = new Pair("set_by", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        if (sessionInfo != null) {
            String trafficTypeForMob = sessionInfo.getTrafficTypeForMob();
            if (trafficTypeForMob != null) {
                mapLJIIJ.put("traffic_type", trafficTypeForMob);
            }
            extrasInfoMobParams = sessionInfo.getExtrasInfoMobParams();
        } else {
            extrasInfoMobParams = null;
        }
        if (C123100dR.LIZ(extrasInfoMobParams)) {
            if (sessionInfo != null) {
                extrasInfoMobParams2 = sessionInfo.getExtrasInfoMobParams();
            } else {
                extrasInfoMobParams2 = null;
            }
            mapLJIIJ.put("extra_info", extrasInfoMobParams2);
        }
        if (sessionInfo != null) {
            if (sessionInfo.isGroupChat()) {
                mapLJIIJ.put("group_type", C1229100i5c.LJI(sessionInfo.getConversationId()));
                C1461005nk c1461005nk = C1461005nk.LIZ;
                mapLJIIJ.put("group_role", String.valueOf(C1461005nk.LJIIIIZZ(sessionInfo.getConversationId())));
            }
            IIMAnalyticsUtil.LIZ.getClass();
            IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
            if (iIMAnalyticsUtilLIZ != null) {
                strLJ = iIMAnalyticsUtilLIZ.LJ(sessionInfo);
            }
            mapLJIIJ.put("chat_type", strLJ);
        }
        if (c869590Y9l != null) {
            Long lValueOf = Long.valueOf(c869590Y9l.getMsgId());
            if (lValueOf.longValue() > 0) {
                mapLJIIJ.put("server_message_id", String.valueOf(lValueOf.longValue()));
            }
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ != null && (mapLIZ = iMessageAnalyticsUtilsLIZ.LIZ(c869590Y9l)) != null) {
                mapLJIIJ.putAll(mapLIZ);
            }
        }
        return mapLJIIJ;
    }

    public static Map LIZIZ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, String str, Map map, int i) {
        String strLJIILIIL;
        SystemContent systemContent;
        if ((i & 2) != 0) {
            c869590Y9l = null;
        }
        if ((i & 4) != 0) {
            if (c869590Y9l != null) {
                str = C0ZDX.LJII(c869590Y9l);
            } else {
                str = null;
            }
        }
        if ((i & 8) != 0 && c869590Y9l != null) {
            strLJIILIIL = C0ZDX.LJIILIIL(c869590Y9l);
        } else {
            strLJIILIIL = null;
        }
        if ((i & 16) != 0) {
            if (c869590Y9l != null) {
                int i2 = C0ZDX.LIZJ;
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, SystemContent.class);
                if (!(orParseJsonContent instanceof SystemContent) || (systemContent = (SystemContent) orParseJsonContent) == null || (map = systemContent.getEventExtra()) == null) {
                    map = C2097608Jq.LJ();
                }
            } else {
                map = null;
            }
        }
        return LIZ(sessionInfo, c869590Y9l, str, strLJIILIIL, map);
    }

    public static void LIZJ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, String str, Map map, int i) {
        String strLJIILIIL;
        SystemContent systemContent;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 2) != 0) {
            c869590Y9l = null;
        }
        if ((i & 4) != 0) {
            if (c869590Y9l != null) {
                str = C0ZDX.LJII(c869590Y9l);
            } else {
                str = null;
            }
        }
        if ((i & 8) != 0 && c869590Y9l != null) {
            strLJIILIIL = C0ZDX.LJIILIIL(c869590Y9l);
        } else {
            strLJIILIIL = null;
        }
        if ((i & 16) != 0) {
            if (c869590Y9l != null) {
                int i2 = C0ZDX.LIZJ;
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, SystemContent.class);
                if (!(orParseJsonContent instanceof SystemContent) || (systemContent = (SystemContent) orParseJsonContent) == null || (map = systemContent.getEventExtra()) == null) {
                    map = C2097608Jq.LJ();
                }
            } else {
                map = null;
            }
        }
        if ((i & 32) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        Map mapLIZ = LIZ(sessionInfo, c869590Y9l, str, strLJIILIIL, map);
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_dm_inline_message", mapLIZ);
    }
}
