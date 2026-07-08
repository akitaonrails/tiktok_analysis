package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.MarkConversationReadEntity;
import com.bytedance.im.core.proto.status_message.MarkConversationReadValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y24, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y24 implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;
    public final String LIZIZ;

    public C0Y24(C0YEM c0yem, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = str;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MarkConvReadUpdater", "mark convo read", 4);
        C0Y8T c0y8tLIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(commandMessage.conversationId, false);
        if (c0y8tLIZ == null) {
            return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
        }
        return LIZJ(c0y8tLIZ, commandMessage.readIndex, commandMessage.readBadgeCountV2);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) throws Throwable {
        long jLongValue;
        int iIntValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MarkConvReadUpdater", "mark convo read from StatusMessage", 4);
        try {
            ByteString byteString = statusMessage.entity;
            if (byteString == null) {
                C868780Y6i.LJIILLIIL(this.LIZ.LIZLLL(), "MarkConvReadUpdater", "markConvRead StatusMessage with null entity", 4);
                return new C0Y3A(EnumC868890Y6t.MISSING_ENTITY_OR_VALUE, "statusMessage.entity is null", (Integer) null, 12);
            }
            ByteString byteString2 = statusMessage.value;
            if (byteString2 == null) {
                C868780Y6i.LJIILLIIL(this.LIZ.LIZLLL(), "MarkConvReadUpdater", "markConvRead StatusMessage with null value", 4);
                return new C0Y3A(EnumC868890Y6t.MISSING_ENTITY_OR_VALUE, "statusMessage.value is null", (Integer) null, 12);
            }
            Long l = MarkConversationReadEntity.ADAPTER.decode(byteString).conversation_short_id;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            MarkConversationReadValue markConversationReadValueDecode = MarkConversationReadValue.ADAPTER.decode(byteString2);
            Long l2 = statusMessage.version;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            Integer num = markConversationReadValueDecode.read_badge_count_v2;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C0Y8T c0y8tLJIJ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJIJ(jLongValue, true);
            if (c0y8tLJIJ == null) {
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
            }
            return LIZJ(c0y8tLJIJ, jLongValue2, iIntValue);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("MarkConvReadUpdater", "decode markConvRead StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C0Y7K LIZJ(C0Y8T c0y8t, long j, int i) {
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        if (j <= c0y8t.getReadIndex() && c0y8t.getFakeUnreadCount() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markConversationRead readIndex invalid, local:");
            sbLIZ.append(c0y8t.getReadIndex());
            sbLIZ.append(", server:");
            sbLIZ.append(j);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MarkConvReadUpdater");
            sbLIZ2.append(strLIZIZ);
            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL, C2188811AlT.LIZIZ(sbLIZ2));
            return new C867580Y1s(null);
        }
        if (i > 0) {
            c0y8t.setReadBadgeCount(i);
        }
        c0y8t.setReadIndex(j);
        c0y8t.setFakeUnreadCount(0);
        long jLIZ = C0Y2U.LIZ(c0y8t, this.LIZ, "mark_read_cmd", this.LIZIZ, true, null);
        if (jLIZ < 0) {
            jLIZ = 0;
        }
        c0y8t.setUnreadCount(jLIZ);
        if (jLIZ <= 0) {
            c0y9jLIZIZ.LIZIZ().LIZJ(c0y8t.getConversationId());
            c0y8t.setUnreadSelfMentionedMessages(null);
        } else {
            c0y8t.setUnreadSelfMentionedMessages(c0y9jLIZIZ.LIZIZ().LJ(j, c0y8t.getConversationId()));
        }
        if (c0y9jLIZIZ.LJIIJJI().LJJJJLI(c0y8t)) {
            c0y9jLIZIZ.LJI().LJJLI(j, c0y8t.getConversationId());
            C0Y8T c0y8tLIZ = this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(c0y8t.getConversationId());
            if (c0y8tLIZ != null) {
                c0y8tLIZ.setReadIndex(c0y8t.getReadIndex());
                c0y8tLIZ.setReadIndexV2(c0y8t.getReadIndexV2());
                c0y8tLIZ.setReadBadgeCount(c0y8t.getReadBadgeCount());
                c0y8tLIZ.updateBadgeCount(c0y8t.getBadgeCount(), c0y8t.getBadgeVersion());
                c0y8tLIZ.setFakeUnreadCount(c0y8t.getFakeUnreadCount());
                c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, this.LIZ, "mark_read_cmd", this.LIZIZ, true, null));
                c0y8tLIZ.setUnreadSelfMentionedMessages(c0y8t.getUnreadSelfMentionedMessages());
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(3, c0y8tLIZ);
            }
            return new C867580Y1s(null);
        }
        return new C0Y3A(EnumC868890Y6t.DB_ERROR, "updateConversationRead failed", (Integer) null, 12);
    }
}
