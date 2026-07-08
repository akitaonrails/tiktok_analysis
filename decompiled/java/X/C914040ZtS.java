package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914040ZtS implements InterfaceC872410YKh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC872410YKh
    public final Object LIZ() {
        switch (this.$t) {
            case 0:
                return LIZ$0(this);
            case 1:
                return LIZ$1(this);
            case 2:
                return LIZ$2(this);
            case 3:
                return LIZ$3(this);
            case 4:
                return LIZ$4(this);
            case 5:
                return LIZ$5(this);
            case 6:
                return LIZ$6(this);
            case 7:
                return LIZ$7(this);
            case 8:
                return LIZ$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZ$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZ$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZ$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZ$13(this);
            case 14:
                return LIZ$14(this);
            case 15:
                return LIZ$15(this);
            case 16:
                return LIZ$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZ$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZ$18(this);
            case 19:
                return LIZ$19(this);
            default:
                return null;
        }
    }

    public static final Object LIZ$0(C914040ZtS c914040ZtS) {
        C872420YKi c872420YKi = (C872420YKi) c914040ZtS.l1;
        if (c872420YKi.LLILLJJLI.isEmpty()) {
            return null;
        }
        C869590Y9l c869590Y9l = c872420YKi.LLILLJJLI.get(r1.size() - 1);
        if (c869590Y9l == null) {
            return null;
        }
        long minIndex = 0;
        if (((C0Y8T) c914040ZtS.l0).getMinIndex() > 0) {
            minIndex = 1000 * ((C0Y8T) c914040ZtS.l0).getMinIndex();
        }
        C868780Y6i c868780Y6iLIZLLL = ((C872420YKi) c914040ZtS.l1).LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel loadOlderMessageList onRun using orderIndex ");
        sbLIZ.append(c869590Y9l.getOrderIndex());
        sbLIZ.append(", minOrderIndex ");
        sbLIZ.append(minIndex);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return ((C872420YKi) c914040ZtS.l1).LLJJIJIL.LJI().LJJZ(((C872420YKi) c914040ZtS.l1).LLILLL, c869590Y9l.getOrderIndex(), minIndex, ((C872420YKi) c914040ZtS.l1).LL);
    }

    public static final Object LIZ$1(C914040ZtS c914040ZtS) {
        return new Pair(Boolean.valueOf(((C872420YKi) c914040ZtS.l1).LIZIZ((List) c914040ZtS.l0)), Boolean.valueOf(((C872420YKi) c914040ZtS.l1).LJIIJ((List) c914040ZtS.l0)));
    }

    public static final Object LIZ$10(C914040ZtS c914040ZtS) {
        return ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJI().LJFF((List) c914040ZtS.l0);
    }

    public static final Object LIZ$11(C914040ZtS c914040ZtS) throws Throwable {
        boolean zLIZLLL;
        int i;
        Boolean boolLJJJJZ = ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJI().LJJJJZ(((C869590Y9l) c914040ZtS.l0).getUuid());
        if (boolLJJJJZ != null && boolLJJJJZ.booleanValue()) {
            return null;
        }
        boolean z = ((C0Y9I) c914040ZtS.l1).LL.LJIIIZ().LJJLIIIIJ.LJJJJ;
        boolean z2 = false;
        if (z) {
            zLIZLLL = C868510Y5h.LIZLLL(((C0Y9I) c914040ZtS.l1).LL, (C869590Y9l) c914040ZtS.l0, Boolean.TRUE);
            ((C869590Y9l) c914040ZtS.l0).setReadStatus(!zLIZLLL ? 1 : 0);
        } else {
            zLIZLLL = false;
        }
        boolean zLJLIIL = ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJI().LJLIIL((C869590Y9l) c914040ZtS.l0, true, true);
        int i2 = -3001;
        if (((C0Y9I) c914040ZtS.l1).LL.LJIIIZ().LJJLIIIIJ.LJFF) {
            C868200Y4c c868200Y4c = ((C0Y9I) c914040ZtS.l1).LL.LJIIZILJ().getDomain().LIZ;
            if (zLJLIIL) {
                i = C0YIF.LIZ;
            } else {
                i = -3001;
            }
            c868200Y4c.LJIJ((C869590Y9l) c914040ZtS.l0, i);
        }
        if (zLJLIIL) {
            C0Y9I c0y9i = (C0Y9I) c914040ZtS.l1;
            C869590Y9l c869590Y9l = (C869590Y9l) c914040ZtS.l0;
            c0y9i.getClass();
            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
            if (referenceInfo != null) {
                try {
                    String strLJIILL = C09EF.LIZ.LJIILL(referenceInfo);
                    C869620Y9o c869620Y9oLIZJ = c0y9i.LLILLJJLI.LIZJ();
                    String uuid = c869590Y9l.getUuid();
                    String conversationId = c869590Y9l.getConversationId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ref_");
                    sbLIZ.append(referenceInfo.referenced_message_id);
                    c869620Y9oLIZJ.LLII(uuid, conversationId, C2188811AlT.LIZIZ(sbLIZ), strLJIILL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0y9i.LL.LIZLLL().LJI("MessageOperatorModelJava reference info error");
                }
            }
        }
        C0Y8T c0y8tLIZ = ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJIIJJI().LIZ(((C869590Y9l) c914040ZtS.l0).getConversationId(), true);
        if (c0y8tLIZ != null) {
            if (z) {
                if ((!"true".equals(((C869590Y9l) c914040ZtS.l0).getExtValue("s:do_not_increase_unread"))) && ((C869590Y9l) c914040ZtS.l0).getIndex() <= c0y8tLIZ.getReadIndex()) {
                    z2 = true;
                }
                if (z2) {
                    c0y8tLIZ.setFakeUnreadCount(Math.max(c0y8tLIZ.getFakeUnreadCount(), 1));
                }
                if (zLIZLLL || z2) {
                    HashMap map = new HashMap();
                    map.put("msg_type", String.valueOf(((C869590Y9l) c914040ZtS.l0).getMsgType()));
                    map.put("msg_id", String.valueOf(((C869590Y9l) c914040ZtS.l0).getMsgId()));
                    c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, ((C0Y9I) c914040ZtS.l1).LL, "add_msg_operator", "local", true, map));
                }
                long jLIZ = C868510Y5h.LIZ((C869590Y9l) c914040ZtS.l0);
                if (jLIZ > 0) {
                    c0y8tLIZ.setUpdatedTime(Math.max(c0y8tLIZ.getUpdatedTime(), jLIZ));
                }
                c0y8tLIZ.setLastMessageIndex(Math.max(c0y8tLIZ.getLastMessageIndex(), ((C869590Y9l) c914040ZtS.l0).getIndex()));
                if (C868510Y5h.LJFF(((C0Y9I) c914040ZtS.l1).LL, (C869590Y9l) c914040ZtS.l0)) {
                    c0y8tLIZ.setLastShowMessage((C869590Y9l) c914040ZtS.l0);
                }
            } else {
                HashMap map2 = new HashMap();
                map2.put("msg_type", String.valueOf(((C869590Y9l) c914040ZtS.l0).getMsgType()));
                map2.put("msg_id", String.valueOf(((C869590Y9l) c914040ZtS.l0).getMsgId()));
                c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, ((C0Y9I) c914040ZtS.l1).LL, "add_msg_operator", "local", true, map2));
                c0y8tLIZ.setUpdatedTime(Math.max(c0y8tLIZ.getUpdatedTime(), ((C869590Y9l) c914040ZtS.l0).getCreatedAt()));
                c0y8tLIZ.setLastMessageIndex(Math.max(c0y8tLIZ.getLastMessageIndex(), ((C869590Y9l) c914040ZtS.l0).getIndex()));
                c0y8tLIZ.setLastShowMessage((C869590Y9l) c914040ZtS.l0);
            }
            ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJIIJJI().LJJJJJ(c0y8tLIZ);
        }
        if (!((C0Y9I) c914040ZtS.l1).LL.LJIIIZ().LJJLIIIIJ.LJFF) {
            C868200Y4c c868200Y4c2 = ((C0Y9I) c914040ZtS.l1).LL.LJIIZILJ().getDomain().LIZ;
            if (zLJLIIL) {
                i2 = C0YIF.LIZ;
            }
            c868200Y4c2.LJIJ((C869590Y9l) c914040ZtS.l0, i2);
        }
        if (!zLJLIIL) {
            return null;
        }
        return new Pair(c0y8tLIZ, (C869590Y9l) c914040ZtS.l0);
    }

    public static final Object LIZ$12(C914040ZtS c914040ZtS) {
        return ((C0Y9I) c914040ZtS.l1).LJ((C869590Y9l) c914040ZtS.l0, false);
    }

    public static final Object LIZ$13(C914040ZtS c914040ZtS) {
        C0YIL c0yil = (C0YIL) c914040ZtS.l1;
        c0yil.LIZJ.LJIIIZ(c0yil.LIZ, (C0YIX) c914040ZtS.l0);
        return null;
    }

    public static final Object LIZ$14(C914040ZtS c914040ZtS) {
        int iIntValue;
        List list = (List) c914040ZtS.l0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationInfoV2 conversationInfoV2 : (List) c914040ZtS.l0) {
            C0Y8T c0y8tLIZ = ((C0Y18) c914040ZtS.l1).LIZLLL.LJIIJJI().LIZ(conversationInfoV2.conversation_id, true);
            if (c0y8tLIZ == null) {
                C0Y1X c0y1xLJIILIIL = ((C0Y18) c914040ZtS.l1).LIZLLL.LJIILIIL();
                String str = conversationInfoV2.conversation_id;
                Integer num = conversationInfoV2.conversation_type;
                if (num == null) {
                    iIntValue = -1;
                } else {
                    iIntValue = num.intValue();
                }
                c0y1xLJIILIIL.LJII(iIntValue, str, C0Y8V.LIZJ(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                C0Y18 c0y18 = (C0Y18) c914040ZtS.l1;
                c0y8tLIZ = C0Y8V.LIZLLL(c0y18.LIZJ, c0y18.LJ, null, conversationInfoV2, 0L, null, null, true, null, true, false);
                ((C0Y18) c914040ZtS.l1).LIZLLL.LJIIJJI().LJJIJIIJI(c0y8tLIZ);
                Boolean bool = conversationInfoV2.first_page_participants.has_more;
                if (bool != null && bool.booleanValue()) {
                    new C0Y1J(((C0Y18) c914040ZtS.l1).LIZJ, null, false).LJIIL(conversationInfoV2.conversation_id);
                }
            }
            arrayList.add(c0y8tLIZ);
        }
        return arrayList;
    }

    public static final Object LIZ$15(C914040ZtS c914040ZtS) {
        C0Y2D c0y2d = (C0Y2D) c914040ZtS.l1;
        C0Y8T c0y8t = (C0Y8T) c914040ZtS.l0;
        boolean z = true;
        if (c0y2d.LIZJ.LJIIIZ().LJJJJLI.isConversationMarkDelete() && !c0y2d.LJ && !c0y8t.isTemp()) {
            long lastMessageIndex = ((C0Y8T) c914040ZtS.l0).getLastMessageIndex();
            C0Y8T c0y8t2 = (C0Y8T) c914040ZtS.l0;
            c0y8t2.setReadBadgeCount(c0y8t2.getBadgeCount());
            C0Y8T c0y8t3 = (C0Y8T) c914040ZtS.l0;
            c0y8t3.setReadIndex(c0y8t3.getLastMessageIndex());
            ((C0Y8T) c914040ZtS.l0).setFakeUnreadCount(0);
            ((C0Y8T) c914040ZtS.l0).setUnreadCount(0L);
            ((C0Y2D) c914040ZtS.l1).LIZLLL.LJIIJJI().LJJJJLI((C0Y8T) c914040ZtS.l0);
            ((C0Y2D) c914040ZtS.l1).LIZLLL.LJIIJJI().LJJIJLIJ(lastMessageIndex, 0L, ((C0Y8T) c914040ZtS.l0).getConversationId());
            C0Y8T c0y8tLIZ = ((C0Y2D) c914040ZtS.l1).LIZLLL.LJIIJJI().LIZ(((C0Y8T) c914040ZtS.l0).getConversationId(), false);
            if (c0y8tLIZ != null && c0y8tLIZ.getLastMessageIndex() > 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        ((C0Y2D) c914040ZtS.l1).LIZLLL.LJIIJJI().LJIIIZ(((C0Y8T) c914040ZtS.l0).getConversationId());
        return Boolean.valueOf(!((C0Y2D) c914040ZtS.l1).LIZLLL.LJIIJJI().LJJIIZI(((C0Y8T) c914040ZtS.l0).getConversationId()));
    }

    public static final Object LIZ$16(C914040ZtS c914040ZtS) {
        return Boolean.valueOf(((C865050Xwd) c914040ZtS.l1).LJII.LIZIZ().LJIIJJI().LIZIZ((List) c914040ZtS.l0));
    }

    public static final Object LIZ$17(C914040ZtS c914040ZtS) {
        C870470YCv c870470YCv = (C870470YCv) c914040ZtS.l1;
        C0YIN c0yin = (C0YIN) c914040ZtS.l0;
        c870470YCv.getClass();
        List<C869590Y9l> list = (List) c0yin.LLILZIL[0];
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipantReadIndex conversationParticipantReadIndex : c0yin.LLIZ.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex) {
            map.put(conversationParticipantReadIndex.conversation_id, conversationParticipantReadIndex);
        }
        c870470YCv.LIZJ.LJIIZILJ().LIZ().LIZIZ().LLIIIJ(c0yin.LLIZ.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex);
        if (list == null) {
            return null;
        }
        for (C869590Y9l c869590Y9l : list) {
            ConversationParticipantReadIndex conversationParticipantReadIndex2 = (ConversationParticipantReadIndex) map.get(c869590Y9l.getConversationId());
            if (conversationParticipantReadIndex2 != null && conversationParticipantReadIndex2.participantReadIndex != null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C0Y8T c0y8tLIZ = c870470YCv.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(conversationParticipantReadIndex2.conversation_id);
                if (c0y8tLIZ != null && c0y8tLIZ.getMemberIds() != null && !c0y8tLIZ.getMemberIds().isEmpty()) {
                    arrayList3.addAll(c0y8tLIZ.getMemberIds());
                } else {
                    arrayList3.addAll(c870470YCv.LIZLLL.LJIILIIL().LJI(conversationParticipantReadIndex2.conversation_id));
                }
                arrayList3.remove(Long.valueOf(c870470YCv.LIZJ.getUid()));
                for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex2.participantReadIndex) {
                    if (participantReadIndex.user_id.longValue() != c870470YCv.LIZJ.getUid() && !"1".equals(c869590Y9l.getLocalExt().get("s:message_index_is_local")) && participantReadIndex.index.longValue() >= c869590Y9l.getIndex()) {
                        arrayList2.add(participantReadIndex.user_id);
                    }
                }
                String str = conversationParticipantReadIndex2.conversation_id;
                c869590Y9l.getMsgId();
                c869590Y9l.getSender();
                arrayList.add(new Object(str, arrayList2, arrayList3) { // from class: X.0033
                    public final List<Long> LIZ;
                    public final List<Long> LIZIZ;
                    public final String LIZJ;

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MessageReadStatusModel{readUidList=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", allUidList=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(", conId='");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append('\'');
                        sbLIZ.append('}');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = new ArrayList();
                        this.LIZIZ = new ArrayList();
                        this.LIZJ = "";
                        this.LIZ = arrayList2;
                        this.LIZIZ = arrayList3;
                        this.LIZJ = str;
                        ((ArrayList) arrayList2).size();
                        ((ArrayList) arrayList3).size();
                    }
                });
            }
        }
        return new C1885607a2(arrayList, c870470YCv.LJ);
    }

    public static final Object LIZ$18(C914040ZtS c914040ZtS) throws Throwable {
        C0Y8Y c0y8yLJ = ((C0Y1F) c914040ZtS.l1).LIZLLL.LJIIIIZZ().LJ(((ConversationCoreInfo) c914040ZtS.l0).conversation_id);
        ConversationCoreInfo conversationCoreInfo = (ConversationCoreInfo) c914040ZtS.l0;
        if (((C0Y1F) c914040ZtS.l1).LIZLLL.LJIIIIZZ().LJI(C0Y8V.LJ(conversationCoreInfo.conversation_id, c0y8yLJ, conversationCoreInfo))) {
            return ((C0Y1F) c914040ZtS.l1).LIZLLL.LJIIJJI().LIZ(((ConversationCoreInfo) c914040ZtS.l0).conversation_id, true);
        }
        return null;
    }

    public static final Object LIZ$19(C914040ZtS c914040ZtS) {
        C869660Y9s c869660Y9sLJIIJ = ((C0YA4) c914040ZtS.l1).LIZLLL.LJIIJ();
        c869660Y9sLJIIJ.LIZ.LIZLLL().LJFF("IMMsgPropertyDao collectResendProperties");
        Collection<C0YA6> collectionLIZLLL = c869660Y9sLJIIJ.LIZLLL(C869660Y9s.LJ());
        if (collectionLIZLLL != null && !collectionLIZLLL.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = ((C0YA4) c914040ZtS.l1).LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerResend size ");
            sbLIZ.append(collectionLIZLLL.size());
            sbLIZ.append(", ");
            sbLIZ.append(collectionLIZLLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJ(c868780Y6iLIZLLL, "ModifyMsgPropertyHandler", strLIZIZ, 4);
            for (C0YA6 c0ya6 : collectionLIZLLL) {
                c0ya6.setMute(true);
                c0ya6.setResend(true);
                C0YA4 c0ya4 = (C0YA4) c914040ZtS.l1;
                C0Y3I c0y3i = (C0Y3I) c914040ZtS.l0;
                c0y3i.getClass();
                c0ya4.LJIILJJIL(c0y3i, c0ya6);
            }
            ((C0YA4) c914040ZtS.l1).LJIILIIL(collectionLIZLLL, false);
            return Boolean.TRUE;
        }
        C868780Y6i c868780Y6iLIZLLL2 = ((C0YA4) c914040ZtS.l1).LIZJ.LIZLLL();
        c868780Y6iLIZLLL2.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL2, "ModifyMsgPropertyHandler", "triggerResend no record", 4);
        return Boolean.FALSE;
    }

    public static final Object LIZ$2(C914040ZtS c914040ZtS) {
        boolean z;
        if (((C872420YKi) c914040ZtS.l1).LLJJIJIL.LJI().LJJJI(((C869590Y9l) c914040ZtS.l0).getUuid()) == null) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJLIIL = ((C872420YKi) c914040ZtS.l1).LLJJIJIL.LJI().LJLIIL((C869590Y9l) c914040ZtS.l0, true, true);
        C0Y8T c0y8tLIZ = ((C872420YKi) c914040ZtS.l1).LLJJIJIL.LJIIJJI().LIZ(((C869590Y9l) c914040ZtS.l0).getConversationId(), true);
        if (c0y8tLIZ != null) {
            c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, ((C872420YKi) c914040ZtS.l1).LLJJIJIIJIL, "add_update_msg", "local", true, null));
            c0y8tLIZ.setUpdatedTime(Math.max(c0y8tLIZ.getUpdatedTime(), ((C869590Y9l) c914040ZtS.l0).getCreatedAt()));
            c0y8tLIZ.setLastMessageIndex(Math.max(c0y8tLIZ.getLastMessageIndex(), ((C869590Y9l) c914040ZtS.l0).getIndex()));
            c0y8tLIZ.setLastShowMessage((C869590Y9l) c914040ZtS.l0);
            ((C872420YKi) c914040ZtS.l1).LLJJIJIL.LJIIJJI().LJJJJJ(c0y8tLIZ);
        }
        if (zLJLIIL) {
            return new Pair(c0y8tLIZ, Boolean.valueOf(z));
        }
        return new Pair(null, Boolean.valueOf(z));
    }

    public static final Object LIZ$3(C914040ZtS c914040ZtS) {
        ((C872420YKi) c914040ZtS.l1).LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageListToEnd onRun");
        return ((C872420YKi) c914040ZtS.l1).LJIIL(0);
    }

    public static final Object LIZ$4(C914040ZtS c914040ZtS) {
        ((C0Y60) c914040ZtS.l1).LJIILJJIL.LJIIJJI().LJJIJIIJIL((C0Y8T) c914040ZtS.l0);
        return null;
    }

    public static final Object LIZ$5(C914040ZtS c914040ZtS) {
        boolean zLIZJ = ((C0Y60) c914040ZtS.l1).LJIILJJIL.LJIIJJI().LIZJ((Map) c914040ZtS.l0);
        if (zLIZJ) {
            for (Map.Entry entry : ((Map) c914040ZtS.l0).entrySet()) {
                C0Y8T c0y8tLIZ = ((C0Y60) c914040ZtS.l1).LJIILIIL.LJIIZILJ().LIZLLL().LIZ().LIZ((String) entry.getKey());
                if (c0y8tLIZ != null) {
                    c0y8tLIZ.setLocalExt((Map) entry.getValue());
                    ((C0Y60) c914040ZtS.l1).LJIILIIL.LJIIZILJ().LIZLLL().LIZLLL().LJJL(10, c0y8tLIZ);
                }
            }
        }
        return Boolean.valueOf(zLIZJ);
    }

    public static final Object LIZ$6(C914040ZtS c914040ZtS) {
        return Boolean.valueOf(((C0Y60) c914040ZtS.l1).LJIILJJIL.LJIIJJI().LJJJJZ(((C0Y8T) c914040ZtS.l0).getSortOrder(), ((C0Y8T) c914040ZtS.l0).getConversationId()));
    }

    public static final Object LIZ$7(C914040ZtS c914040ZtS) {
        return ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJI().LJI((Map) c914040ZtS.l0);
    }

    public static final Object LIZ$8(C914040ZtS c914040ZtS) {
        return ((C0Y60) c914040ZtS.l1).LJIILJJIL.LJIIJJI().LJJI((List) c914040ZtS.l0);
    }

    public static final Object LIZ$9(C914040ZtS c914040ZtS) {
        return ((C0Y9I) c914040ZtS.l1).LLILLJJLI.LJI().LJI((Map) c914040ZtS.l0);
    }

    public C914040ZtS(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
