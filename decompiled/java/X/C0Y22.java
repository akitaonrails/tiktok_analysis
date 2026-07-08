package X;

import Y.ARunnableS83S0200000_14;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.DissolveConversationEntity;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y22, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y22 implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C0Y22(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DisbandConvUpdater", "disband conversation", 4);
        return LIZJ(this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(messageBody.conversation_id, true));
    }

    public final C0Y7K LIZJ(C0Y8T c0y8t) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteConversation ");
        sbLIZ.append(c0y8t);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DisbandConvUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        if (c0y8t != null) {
            this.LIZ.LJIIIZ().getClass();
            if (c0y9jLIZIZ.LJIIJJI().LJJJJL(c0y8t.getConversationId())) {
                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DisbandConvUpdater", "dissolveConversation success, notify", 4);
                c0y8t.setStatus(1);
                this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS83S0200000_14(this, c0y8t, 22));
            }
            C868140Y3w c868140Y3w = this.LIZ.LJIIZILJ().getDomain().LIZIZ;
            int inboxType = c0y8t.getInboxType();
            String conversationId = c0y8t.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            c868140Y3w.LJIIJJI(inboxType, conversationId);
            return new C867580Y1s(null);
        }
        return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "DisbandConvUpdater", "disband conversation from statusMessage", 4);
        try {
            Long l = DissolveConversationEntity.ADAPTER.decode(statusMessage.entity).conversation_short_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shortId ");
            sbLIZ.append(jLongValue);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DisbandConvUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
            return LIZJ(this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJIJ(jLongValue, true));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("DisbandConvUpdater", "decode deleteConversation StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}
