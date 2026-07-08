package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantEntity;
import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y2B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2B implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;

    public C0Y2B(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "GroupMemberUpdater", "update group member", 4);
        return LIZJ(commandMessage.conversationId, commandMessage.removedMembers, commandMessage.addedMembers, commandMessage.inboxType, messageBody);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "GroupMemberUpdater", "update group member from StatusMessage", 4);
        try {
            String str = UpdateConversationParticipantEntity.ADAPTER.decode(statusMessage.entity).conversation_id;
            if (str == null) {
                str = "";
            }
            UpdateConversationParticipantValue updateConversationParticipantValueDecode = UpdateConversationParticipantValue.ADAPTER.decode(statusMessage.value);
            return LIZJ(str, updateConversationParticipantValueDecode.removed_participant, updateConversationParticipantValueDecode.added_participant, i, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("GroupMemberUpdater", "decode updateConvParticipant StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0205, code lost:
    
        if (r0 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7K LIZJ(java.lang.String r11, java.util.List<java.lang.Long> r12, java.util.List<java.lang.Long> r13, int r14, com.bytedance.im.core.proto.MessageBody r15) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y2B.LIZJ(java.lang.String, java.util.List, java.util.List, int, com.bytedance.im.core.proto.MessageBody):X.0Y7K");
    }
}
