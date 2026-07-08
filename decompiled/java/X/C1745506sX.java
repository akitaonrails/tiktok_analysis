package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1745506sX {
    public final String LIZ;
    public final String LIZIZ;
    public final Set<String> LIZJ = new LinkedHashSet();

    public static Integer LIZ(C869590Y9l c869590Y9l) {
        try {
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if (orParseJsonContent != null) {
                return Integer.valueOf(orParseJsonContent.type);
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String content = c869590Y9l.getContent();
            Type type = new AbstractC1905540zge<Map<String, ? extends String>>() { // from class: X.06sb
            }.getType();
            c1227904rF.getClass();
            String str = (String) ((Map) C1227904rF.LIZJ(content, type)).get("aweType");
            if (str != null) {
                return C2095008Iq.LJIIJJI(str);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static EnumC1745406sW LIZJ(int i) {
        switch (i) {
            case 704:
            case 709:
                return EnumC1745406sW.WELCOME;
            case 705:
            case 706:
            case 710:
            default:
                return EnumC1745406sW.DEFAULT;
            case 707:
            case 711:
                return EnumC1745406sW.SUGGESTED_QN_ASK;
            case 708:
            case 712:
                return EnumC1745406sW.SUGGESTED_QN_ANS;
        }
    }

    public C1745506sX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public static int LIZIZ(C909290Zln c909290Zln, IMUser iMUser) {
        if (iMUser != null) {
            if (c909290Zln != null && c909290Zln.isTCM()) {
                return -1;
            }
            return iMUser.getFollowStatus();
        }
        return -1;
    }

    public final void LIZLLL(String str, String str2, List list) {
        int iIntValue;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
            Integer numLIZ = LIZ(c869590Y9l);
            if (numLIZ != null && (numLIZ.intValue() == 709 || numLIZ.intValue() == 712 || numLIZ.intValue() == 711)) {
                if (this.LIZJ.contains(c869590Y9l.getUuid())) {
                    return;
                }
                this.LIZJ.add(c869590Y9l.getUuid());
                boolean zLJFF = Intrinsics.LJFF(c869590Y9l.getScene(), "ad_collect_form_card");
                String str3 = this.LIZ;
                String str4 = this.LIZIZ;
                Integer numLIZ2 = LIZ(c869590Y9l);
                if (numLIZ2 != null) {
                    iIntValue = numLIZ2.intValue();
                } else {
                    iIntValue = -1;
                }
                C1745306sV.LIZ(str3, str4, LIZJ(iIntValue), C453750Hqn.LIZ(c869590Y9l), C0ZDX.LJIILIIL(c869590Y9l), str, zLJFF, str2);
            }
        }
    }

    public static void LJ(C909290Zln c909290Zln, String str, String str2, String str3, String str4) {
        String singleChatFromUserId;
        String enterFromForMob;
        String enterMethod;
        String str5;
        String str6;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        IMUserBizInfo imUserBizInfo2;
        IMUserB2CAccountInfo userB2CAccountInfo2;
        String conversationId = null;
        if (c909290Zln != null) {
            singleChatFromUserId = c909290Zln.getSingleChatFromUserId();
        } else {
            singleChatFromUserId = null;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(singleChatFromUserId, null, "im_local_db");
        if (c909290Zln != null) {
            enterFromForMob = c909290Zln.getEnterFromForMob();
            enterMethod = c909290Zln.getEnterMethod();
        } else {
            enterFromForMob = null;
            enterMethod = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int iLIZIZ = LIZIZ(c909290Zln, iMUserLJIIL);
        IMUser iMUserLJIIL2 = C069P.LIZ().LJ().LJIIL(C461720I8s.LIZIZ(), null, "im_local_db");
        if (iMUserLJIIL2 != null && (imUserBizInfo2 = iMUserLJIIL2.getImUserBizInfo()) != null && (userB2CAccountInfo2 = imUserBizInfo2.getUserB2CAccountInfo()) != null) {
            str5 = userB2CAccountInfo2.userTags;
        } else {
            str5 = null;
        }
        if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
            str6 = userB2CAccountInfo.userTags;
        } else {
            str6 = null;
        }
        if (c909290Zln != null) {
            conversationId = c909290Zln.getConversationId();
        }
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        if (enterFromForMob == null) {
            enterFromForMob = "";
        }
        c830490Whz.put("enter_from", enterFromForMob);
        if (enterMethod == null) {
            enterMethod = "";
        }
        c830490Whz.put("enter_method", enterMethod);
        c830490Whz.put("set_by", str);
        c830490Whz.put("traffic_type", str2);
        c830490Whz.put("rank", str4);
        c830490Whz.put("reason", str3);
        c830490Whz.put("relation_tag", String.valueOf(iLIZIZ));
        if (str5 != null) {
            c830490Whz.put("account_type", str5);
        }
        if (str6 != null) {
            c830490Whz.put("other_user_account_type", str6);
        }
        if (singleChatFromUserId != null) {
            c830490Whz.put("to_user_id", singleChatFromUserId);
        }
        if (conversationId != null) {
            c830490Whz.put("conversation_id", conversationId);
        }
        C20684815ws.LJIILLIIL("suggest_question_dismiss", c830490Whz);
    }
}
