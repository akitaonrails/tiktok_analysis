package X;

import Y.ARunnableS83S0200000_14;
import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.DeleteConversationEntity;
import com.bytedance.im.core.proto.status_message.DeleteConversationValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y2C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2C implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;
    public final String LIZIZ;

    public C0Y2C(C0YEM c0yem, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = str;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DeleteConvUpdater", "delete conversation", 4);
        String str = commandMessage.conversationId;
        return LIZJ(commandMessage.readBadgeCountV2, commandMessage.conversationMinIndex, str);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        int iIntValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DeleteConvUpdater", "delete conversation from StatusMessage", 4);
        try {
            DeleteConversationEntity deleteConversationEntityDecode = DeleteConversationEntity.ADAPTER.decode(statusMessage.entity);
            DeleteConversationValue deleteConversationValueDecode = DeleteConversationValue.ADAPTER.decode(statusMessage.value);
            String str = deleteConversationEntityDecode.conversation_id;
            if (str == null) {
                str = "";
            }
            Long l = deleteConversationValueDecode.conversation_min_index;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Integer num = deleteConversationValueDecode.read_badge_count;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return LIZJ(iIntValue, jLongValue, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("DeleteConvUpdater", "decode deleteConv StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C0Y7K LIZJ(int i, long j, String str) {
        boolean zLJIIIZ;
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        C0Y8T c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(str, true);
        if (c0y8tLIZ == null) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteConversation but null, cid:");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJIIIIZZ("DeleteConvUpdater", C2188811AlT.LIZIZ(sbLIZ), null);
            EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.ENTITY_MISSING;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deleteConversation but null, cid:");
            sbLIZ2.append(str);
            return new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ2), (Integer) null, 12);
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("deleteConversation cmd, cid:");
        sbLIZ3.append(str);
        sbLIZ3.append(", localMaxIndex:");
        sbLIZ3.append(c0y8tLIZ.getLastMessageIndex());
        sbLIZ3.append(", minIndex:");
        sbLIZ3.append(j);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "DeleteConvUpdater", C2188811AlT.LIZIZ(sbLIZ3), 4);
        if (j > 10000 && c0y8tLIZ.getLastMessageIndex() > j) {
            C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("deleteConversation but index illegal, cid:");
            sbLIZ4.append(str);
            sbLIZ4.append(", localMaxIndex:");
            sbLIZ4.append(c0y8tLIZ.getLastMessageIndex());
            sbLIZ4.append(", maxIndex:");
            sbLIZ4.append(j);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "DeleteConvUpdater", C2188811AlT.LIZIZ(sbLIZ4), 4);
            if (c0y9jLIZIZ.LJI().LJIL(j, str)) {
                c0y8tLIZ.setMinIndex(j);
                if (i > 0) {
                    c0y8tLIZ.setReadBadgeCount(i);
                }
                c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, this.LIZ, "delete_conv_cmd", this.LIZIZ, true, null));
                c0y8tLIZ.setHasMore(true);
                if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
                    this.LIZ.LJIIZILJ().LIZLLL().LJ().LIZ(str, "conv_history_cursor");
                } else {
                    c0y9jLIZIZ.LJIILJJIL().LIZ(str, "conv_history_cursor");
                }
                c0y9jLIZIZ.LJIIJJI().LJJJJJ(c0y8tLIZ);
                C0Y8T c0y8tLIZ2 = this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
                if (c0y8tLIZ2 != null) {
                    c0y8tLIZ2.setMinIndex(c0y8tLIZ.getMinIndex());
                    c0y8tLIZ2.setMinIndexV2(c0y8tLIZ.getMinIndexV2());
                    c0y8tLIZ2.updateBadgeCount(c0y8tLIZ.getBadgeCount(), c0y8tLIZ.getBadgeVersion());
                    c0y8tLIZ2.setReadBadgeCount(c0y8tLIZ.getReadBadgeCount());
                    c0y8tLIZ2.setUnreadCount(c0y8tLIZ.getUnreadCount());
                    c0y8tLIZ = c0y8tLIZ2;
                }
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8tLIZ);
            }
        } else {
            C868780Y6i c868780Y6iLIZLLL4 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("deleteConversation, cid:");
            sbLIZ5.append(str);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL4, "DeleteConvUpdater", C2188811AlT.LIZIZ(sbLIZ5), 4);
            if (!c0y8tLIZ.isStranger() && this.LIZ.LJIIIZ().LJJJJLI.isConversationMarkDelete()) {
                if (c0y8tLIZ.getLastMessageIndex() > 0) {
                    c0y8tLIZ.setReadBadgeCount(c0y8tLIZ.getBadgeCount());
                    c0y8tLIZ.setReadIndex(c0y8tLIZ.getLastMessageIndex());
                    c0y8tLIZ.setFakeUnreadCount(0);
                    c0y8tLIZ.setUnreadCount(0L);
                    c0y9jLIZIZ.LJIIJJI().LJJJJLI(c0y8tLIZ);
                    zLJIIIZ = c0y9jLIZIZ.LJIIJJI().LJJIJLIJ(c0y8tLIZ.getLastMessageIndex(), 0L, str);
                }
                this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS83S0200000_14(this, c0y8tLIZ, 21));
                this.LIZ.LJIIZILJ().getDomain().LIZIZ.LJIIJJI(c0y8tLIZ.getInboxType(), str);
            } else {
                zLJIIIZ = c0y9jLIZIZ.LJIIJJI().LJIIIZ(str);
            }
            if (!zLJIIIZ) {
                EnumC868890Y6t enumC868890Y6t2 = EnumC868890Y6t.DB_ERROR;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Unable to delete conversation from DB ");
                sbLIZ6.append(str);
                return new C0Y3A(enumC868890Y6t2, C2188811AlT.LIZIZ(sbLIZ6), (Integer) null, 12);
            }
            this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS83S0200000_14(this, c0y8tLIZ, 21));
            this.LIZ.LJIIZILJ().getDomain().LIZIZ.LJIIJJI(c0y8tLIZ.getInboxType(), str);
        }
        return new C867580Y1s(null);
    }
}
