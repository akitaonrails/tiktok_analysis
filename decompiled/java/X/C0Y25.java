package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.FirstMessageEntity;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y25, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y25 implements C0Y29, InterfaceC868830Y6n {
    public final C0YEM LIZ;

    public C0Y25(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZJ(C0Y8T c0y8t) {
        if (!c0y8t.hasMore()) {
            c0y8t.setHasMore(false);
            this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(17, c0y8t);
        }
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MarkConvNoMoreUpdater", "mark conversation no more", 4);
        String str = commandMessage.conversationId;
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        c0y9jLIZIZ.LJIIJJI().LJJJIL(str);
        C0Y8T c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(str, true);
        if (c0y8tLIZ != null) {
            LIZJ(c0y8tLIZ);
            return new C867580Y1s(null);
        }
        return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) throws Throwable {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MarkConvNoMoreUpdater", "mark conversation no more from StatusMessage", 4);
        try {
            C0Y8T c0y8tLJIJ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJIJ(FirstMessageEntity.ADAPTER.decode(statusMessage.entity).conversation_short_id.longValue(), true);
            if (c0y8tLJIJ == null) {
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
            }
            LIZJ(c0y8tLJIJ);
            return new C867580Y1s(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("MarkConvNoMoreUpdater", "decode markConvRead StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.PARSE_FAILURE, e.getMessage(), (Integer) null, 12);
        }
    }
}
