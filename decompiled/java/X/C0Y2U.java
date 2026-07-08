package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y2U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2U {
    public static final long LIZLLL(C0Y8T c0y8t, C0YEM c0yem) {
        long jMax;
        C0Y2X c0y2xLIZJ = c0yem.LJ().LIZLLL().LIZJ();
        if (c0y2xLIZJ != null) {
            jMax = c0y2xLIZJ.LIZ(c0y8t);
        } else {
            jMax = Math.max(c0y8t.getUpdatedTime(), c0y8t.getDraftTime());
            if (c0y8t.isStickTop()) {
                jMax = (long) (Math.pow(10.0d, 13.0d) + jMax);
            }
        }
        if (jMax <= 0) {
            C868780Y6i.LJIILJJIL(c0yem.LIZLLL(), "IMConversationDao generateConversationSortOrder, sortOrder abnormal: ", String.valueOf(jMax), 4);
        }
        c0y8t.setSortOrder(jMax);
        return c0y8t.getSortOrder();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List LJI(X.C0YEM r20, java.util.List r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y2U.LJI(X.0YEM, java.util.List):java.util.List");
    }

    public static final boolean LIZJ(C0Y8T c0y8t, C0YEM c0yem, boolean z) {
        boolean zLJFF = Intrinsics.LJFF(C870740YDw.LIZLLL(c0yem).LJFF(c0y8t.getConversationId(), "has_mark_read_cmd"), "1");
        if (!zLJFF && z) {
            C870740YDw.LIZLLL(c0yem).LLFZ(c0y8t.getConversationId(), "has_mark_read_cmd", "1");
        }
        return zLJFF;
    }

    public static final void LJ(C0Y8T c0y8t, C0YEM c0yem, long j, C869590Y9l c869590Y9l) {
        EnumC869230Y8b enumC869230Y8bFromValue;
        long updatedTime = c0y8t.getUpdatedTime();
        Map<String, String> localExt = c0y8t.getLocalExt();
        boolean z = false;
        if (localExt == null || localExt.isEmpty()) {
            c0y8t.setLocalExt(new LinkedHashMap());
        }
        if (c869590Y9l != null && ((enumC869230Y8bFromValue = EnumC869230Y8b.fromValue(c869590Y9l.getConvRankUpdateRule())) == EnumC869230Y8b.IgnoreAllRankUpdate || ((enumC869230Y8bFromValue == EnumC869230Y8b.IgnoreSenderRankUpdate && c869590Y9l.isSelf(c0yem.getUid())) || (enumC869230Y8bFromValue == EnumC869230Y8b.IgnoreReceiverRankUpdate && !c869590Y9l.isSelf(c0yem.getUid()))))) {
            z = true;
        }
        if (!z) {
            c0y8t.getLocalExt().put("s:last_non_ignore_rank_update_message_creation_time", String.valueOf(j));
        } else {
            if (c0y8t.getLocalExt().containsKey("s:last_non_ignore_rank_update_message_creation_time")) {
                return;
            }
            c0y8t.getLocalExt().put("s:last_non_ignore_rank_update_message_creation_time", String.valueOf(updatedTime));
        }
    }

    public static final long LIZ(C0Y8T c0y8t, C0YEM c0yem, String str, String str2, boolean z, HashMap<String, String> map) {
        boolean z2;
        boolean z3;
        long firstMessageTimestamp;
        int i;
        Object obj;
        if (c0y8t.getConversationId().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long jLJIILL = 0;
        if (z2) {
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao computeUnreadCount cid invalid:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        } else if (c0yem.LJIIIZ().LJJJJZI.LIZLLL.contains(Integer.valueOf(c0y8t.getInboxType()))) {
            if (c0y8t.getBadgeCount() > 0 && c0y8t.getBadgeCount() >= c0y8t.getReadBadgeCount()) {
                long badgeCount = c0y8t.getBadgeCount() - c0y8t.getReadBadgeCount();
                if (badgeCount == 0 && c0y8t.getUnreadCount() > 0) {
                    C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("UnreadDebug serverUnread=0 for cid=");
                    sbLIZ2.append(c0y8t.getConversationId());
                    sbLIZ2.append(" badgeCount=");
                    sbLIZ2.append(c0y8t.getBadgeCount());
                    sbLIZ2.append(" readBadgeCount=");
                    sbLIZ2.append(c0y8t.getReadBadgeCount());
                    sbLIZ2.append(" prevUnread=");
                    sbLIZ2.append(c0y8t.getUnreadCount());
                    sbLIZ2.append(" updateReason=");
                    sbLIZ2.append(str);
                    c868780Y6iLIZLLL2.LIZ.LIZJ("imsdk", c868780Y6iLIZLLL2.LIZ(C2188811AlT.LIZIZ(sbLIZ2)), null);
                }
                jLJIILL = badgeCount;
            } else {
                jLJIILL = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJIILL(c0y8t.getReadIndex(), c0y8t.getConversationId());
            }
        } else {
            long unreadCount = c0y8t.getUnreadCount();
            long jLJIILL2 = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJIILL(c0y8t.getReadIndex(), c0y8t.getConversationId());
            C868780Y6i c868780Y6iLIZLLL3 = c0yem.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IMConversationDao computeUnreadCount cid: +");
            sbLIZ3.append(c0y8t.getConversationId());
            sbLIZ3.append(", count:");
            sbLIZ3.append(jLJIILL2);
            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL3, C2188811AlT.LIZIZ(sbLIZ3));
            if (jLJIILL2 == 0 && unreadCount > 0) {
                C868780Y6i c868780Y6iLIZLLL4 = c0yem.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("UnreadDebug computeRealUnreadCount returned 0 for cid=");
                sbLIZ4.append(c0y8t.getConversationId());
                sbLIZ4.append(" readIndex=");
                sbLIZ4.append(c0y8t.getReadIndex());
                sbLIZ4.append(" badgeCount=");
                sbLIZ4.append(c0y8t.getBadgeCount());
                sbLIZ4.append(" readBadgeCount=");
                sbLIZ4.append(c0y8t.getReadBadgeCount());
                sbLIZ4.append(" initialUnread=");
                sbLIZ4.append(unreadCount);
                sbLIZ4.append(" updateReason=");
                sbLIZ4.append(str);
                sbLIZ4.append(" logId=");
                sbLIZ4.append(str2);
                c868780Y6iLIZLLL4.LIZ.LIZJ("imsdk", c868780Y6iLIZLLL4.LIZ(C2188811AlT.LIZIZ(sbLIZ4)), null);
            }
            if (c0yem.LJIIIZ().LJJJJZI.LIZ && c0yem.LJIIIZ().LJJJJZI.LIZJ.contains(Integer.valueOf(c0y8t.getInboxType()))) {
                if (z && c0y8t.getReadBadgeCount() > 0 && c0y8t.getBadgeCount() >= c0y8t.getReadBadgeCount()) {
                    long badgeCount2 = c0y8t.getBadgeCount() - c0y8t.getReadBadgeCount();
                    if (c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJIJLIJ(c0y8t.getConversationId()) && !c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJJJI(c0y8t.getConversationId())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zLIZJ = LIZJ(c0y8t, c0yem, Intrinsics.LJFF(str, "mark_read_cmd"));
                    if (jLJIILL2 != unreadCount || jLJIILL2 != badgeCount2) {
                        int inboxType = c0y8t.getInboxType();
                        int badgeCount3 = c0y8t.getBadgeCount();
                        int readBadgeCount = c0y8t.getReadBadgeCount();
                        C0Y8Y coreInfo = c0y8t.getCoreInfo();
                        if (coreInfo != null) {
                            firstMessageTimestamp = coreInfo.getFirstMessageTimestamp();
                        } else {
                            firstMessageTimestamp = 0;
                        }
                        if (badgeCount2 == jLJIILL2) {
                            i = 0;
                        } else if (badgeCount2 > jLJIILL2) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        C870460YCu c870460YCuLIZ = c0yem.LJIIZILJ().LJFF().LIZ();
                        String conversationId = c0y8t.getConversationId();
                        long conversationShortId = c0y8t.getConversationShortId();
                        int conversationType = c0y8t.getConversationType();
                        C0YJ9 c0yj9 = new C0YJ9(c870460YCuLIZ.LIZJ);
                        c0yj9.LIZJ("imsdk_unread_verification");
                        c0yj9.LIZ(conversationId, "conversation_id");
                        c0yj9.LIZ(Long.valueOf(conversationShortId), "conversation_short_id");
                        c0yj9.LIZ(Integer.valueOf(conversationType), "conversation_type");
                        c0yj9.LIZ(Long.valueOf(badgeCount2), "server_unread_count");
                        c0yj9.LIZ(Long.valueOf(jLJIILL2), "client_unread_count");
                        c0yj9.LIZ(str2, "update_log_id");
                        c0yj9.LIZ(str, "update_reason");
                        c0yj9.LIZ(Integer.valueOf(inboxType), "inbox_type");
                        String str3 = "1";
                        if (z3) {
                            obj = "1";
                        } else {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        c0yj9.LIZ(obj, "is_conv_foreground");
                        c0yj9.LIZ(Integer.valueOf(i), "result_code");
                        if (!zLIZJ) {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c0yj9.LIZ(str3, "has_mark_read_cmd");
                        c0yj9.LIZ(Integer.valueOf(badgeCount3), "badge_count");
                        c0yj9.LIZ(Integer.valueOf(readBadgeCount), "read_badge_count");
                        c0yj9.LIZ(Long.valueOf(firstMessageTimestamp), "first_message_timestamp");
                        c0yj9.LIZ(map, "extra_info");
                        c0yj9.LIZLLL();
                    }
                    C868780Y6i.LJIILIIL(c0yem.LIZLLL(), "IMConversationDao computeUnreadCount cid: +" + c0y8t.getConversationId() + ", server count:" + badgeCount2);
                }
            } else {
                C868780Y6i c868780Y6iLIZLLL5 = c0yem.LIZLLL();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("IMConversationDao computeUnreadCount cid: +");
                sbLIZ5.append(c0y8t.getConversationId());
                sbLIZ5.append(", no recent messages, use readIndex, count:");
                sbLIZ5.append(jLJIILL2);
                C868780Y6i.LJIILIIL(c868780Y6iLIZLLL5, C2188811AlT.LIZIZ(sbLIZ5));
            }
            jLJIILL = jLJIILL2;
        }
        return Math.max(jLJIILL, c0y8t.getFakeUnreadCount());
    }

    public static final void LJFF(C0YEM c0yem, C0Y8T c0y8t, C869590Y9l c869590Y9l, Long l, Integer num, String str, String str2, boolean z, boolean z2) {
        if (c869590Y9l == null) {
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncUpdateConversation: convId=");
        sbLIZ.append(c0y8t.getConversationId());
        sbLIZ.append(", lastMsgId=");
        sbLIZ.append(c869590Y9l.getMsgId());
        sbLIZ.append(", badge version=");
        sbLIZ.append(l);
        sbLIZ.append(", badge count=");
        sbLIZ.append(num);
        C868780Y6i.LJIILIIL(c868780Y6iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
        long jLIZ = C868510Y5h.LIZ(c869590Y9l);
        if (jLIZ > c0y8t.getUpdatedTime()) {
            LJ(c0y8t, c0yem, jLIZ, c869590Y9l);
            c0y8t.setUpdatedTime(jLIZ);
            c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJJJJZI(c0y8t);
        }
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (C868510Y5h.LJFF(c0yem, c869590Y9l) && (lastShowMessage == null || c869590Y9l.getCreatedAt() >= lastShowMessage.getCreatedAt())) {
            c0y8t.setLastShowMessage(c869590Y9l);
        }
        if (c869590Y9l.getIndex() > c0y8t.getLastMessageIndex()) {
            c0y8t.setLastMessageIndex(c869590Y9l.getIndex());
        }
        C0Y9J c0y9jLIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        boolean zIsStranger = c0y8t.isStranger();
        C0Y9J c0y9jLIZIZ2 = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        C867610Y1v.LIZ(c0yem, c0y8t, c869590Y9l, true);
        if (zIsStranger && !c0y8t.isStranger()) {
            c0y9jLIZIZ2.LJIIJJI().LJJJJI(c0y8t.getConversationId(), false);
        }
        c0y8t.setMaxIndexV2(c869590Y9l.getIndexInConversationV2());
        if (l != null && l.longValue() > 0 && num != null) {
            c0y8t.updateBadgeCount(num.intValue(), l.longValue());
        }
        boolean zLJJIJLIJ = c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJIJLIJ(c0y8t.getConversationId());
        boolean zLJJJJI = c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJJJI(c0y8t.getConversationId());
        if (zLJJIJLIJ && !zLJJJJI) {
            c0y8t.setReadIndex(c0y8t.getLastMessageIndex());
            c0y8t.setReadIndexV2(c0y8t.getMaxIndexV2());
            c0y8t.setReadBadgeCount(c0y8t.getBadgeCount());
            c0y8t.setFakeUnreadCount(0);
            c0y8t.setUnreadCount(0L);
            c0y9jLIZIZ.LIZIZ().LIZJ(c0y8t.getConversationId());
            c0y8t.setUnreadSelfMentionedMessages(null);
        } else if (c0y8t.getReadBadgeCount() > 0) {
            c0y8t.setUnreadCount(LIZ(c0y8t, c0yem, str, str2, z, null));
            if (c869590Y9l.isMention(c0yem.getUid())) {
                c0y8t.setUnreadSelfMentionedMessages(c0y9jLIZIZ.LIZIZ().LJ(c0y8t.getReadIndex(), c0y8t.getConversationId()));
            }
        } else {
            c0y8t.setUnreadCount(LIZ(c0y8t, c0yem, str, str2, z, null));
            if (c869590Y9l.isMention(c0yem.getUid())) {
                c0y8t.setUnreadSelfMentionedMessages(c0y9jLIZIZ.LIZIZ().LJ(c0y8t.getReadIndex(), c0y8t.getConversationId()));
            }
        }
        boolean zLJJJLIIL = c0y9jLIZIZ.LJIIJJI().LJJJLIIL(c0y8t.getConversationId(), c0y8t.getUpdatedTime(), c0y8t.getLastMessageIndex(), c0y8t.getLastShowMessageUuid(), c0y8t.getMaxIndexV2(), c0y8t.getBadgeCount(), c0y8t.getUnreadCount(), c0y8t.getBadgeVersion(), c0y8t.getLocalExt());
        C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syncUpdateConversation, id: ");
        sbLIZ2.append(c0y8t.getConversationId());
        sbLIZ2.append(" + result: ");
        sbLIZ2.append(zLJJJLIIL);
        C868780Y6i.LJIILIIL(c868780Y6iLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
        if (zLJJJLIIL && z2) {
            C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(c0y8t.getConversationId());
            if (c0y8tLIZ != null) {
                c0y8t.setDraftContent(c0y8tLIZ.getDraftContent());
                c0y8t.setDraftTime(c0y8tLIZ.getDraftTime());
            }
            c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJL(c0y8t);
        }
    }
}
