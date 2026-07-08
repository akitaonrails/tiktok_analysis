package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.DeleteMessageEntity;
import com.bytedance.im.core.proto.status_message.DeleteMessageValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y23, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y23 implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;
    public final String LIZIZ;

    public C0Y23(C0YEM c0yem, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = str;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DeleteMessageUpdater", "delete message", 4);
        return LIZJ(commandMessage.readBadgeCountV2, commandMessage.msgId);
    }

    public final C0Y7K LIZJ(int i, long j) throws Throwable {
        String uuid;
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(j);
        if (c869590Y9lLJJJ == null) {
            this.LIZ.LIZLLL().LJIIIIZZ("DeleteMessageUpdater", "local message not found", null);
            return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "local message not found", (Integer) null, 12);
        }
        String conversationId = c869590Y9lLJJJ.getConversationId();
        C0Y8T c0y8tLIZ = this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(conversationId);
        if ((c0y8tLIZ != null || (c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(conversationId, true)) != null) && c0y8tLIZ.getLastShowMessage() != null) {
            C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
            c869590Y9lLJJJ.setDeleted(1);
            boolean zLJIIZILJ = c0y9jLIZIZ.LJI().LJIIZILJ(c869590Y9lLJJJ.getUuid());
            boolean z = false;
            if (c869590Y9lLJJJ.getIndex() >= c0y8tLIZ.getReadIndex()) {
                if (i > 0) {
                    c0y8tLIZ.setReadBadgeCount(i);
                }
                long jLIZ = C0Y2U.LIZ(c0y8tLIZ, this.LIZ, "delete_msg_cmd", this.LIZIZ, true, null);
                if (jLIZ != c0y8tLIZ.getUnreadCount()) {
                    z = true;
                }
                c0y8tLIZ.setUnreadCount(jLIZ);
            }
            if (zLJIIZILJ) {
                if (lastShowMessage != null) {
                    uuid = lastShowMessage.getUuid();
                } else {
                    uuid = null;
                }
                if (Intrinsics.LJFF(uuid, c869590Y9lLJJJ.getUuid())) {
                    c0y8tLIZ.clearLastShowMessage();
                    c0y8tLIZ.setLastShowMessage(c0y9jLIZIZ.LJI().LJJIIJZLJL(conversationId));
                } else if (c0y8tLIZ.removeMentionMessage(c869590Y9lLJJJ.getUuid())) {
                }
                z = true;
            }
            C0YEM c0yem = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ref_");
            sbLIZ.append(j);
            C867650Y1z.LIZIZ(c0yem, C2188811AlT.LIZIZ(sbLIZ), C0YUT.DELETED);
            if (z) {
                c0y9jLIZIZ.LJIIJJI().LJJJJJ(c0y8tLIZ);
            }
            if (zLJIIZILJ) {
                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DeleteMessageUpdater", "delete msg successful", 4);
                this.LIZ.LJIIZILJ().getDomain().LIZ.LJIJI(c869590Y9lLJJJ);
                if (z) {
                    this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8tLIZ);
                }
                return new C867580Y1s(null);
            }
            this.LIZ.LIZLLL().LJIIIIZZ("DeleteMessageUpdater", "delete msg failed", null);
            return new C0Y3A(EnumC868890Y6t.DB_ERROR, "delete msg failed", (Integer) null, 12);
        }
        this.LIZ.LIZLLL().LJIIIIZZ("DeleteMessageUpdater", "local conversation not found", null);
        return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "local conversation not found", (Integer) null, 12);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        int iIntValue;
        Integer num;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DeleteMessageUpdater", "delete message from StatusMessage", 4);
        try {
            Long l = DeleteMessageEntity.ADAPTER.decode(statusMessage.entity).message_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            ByteString byteString = statusMessage.value;
            if (byteString != null && (num = DeleteMessageValue.ADAPTER.decode(byteString).read_badge_count) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return LIZJ(iIntValue, jLongValue);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("DeleteMessageUpdater", "decode deleteMsg StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}
