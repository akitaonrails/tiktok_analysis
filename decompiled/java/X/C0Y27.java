package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateConversationSettingEntity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y27, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y27 implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;

    public C0Y27(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvInfoUpdater", "update conversation info", 4);
        return LIZJ(commandMessage.conversationId, commandMessage.conversationVersion, commandMessage.inboxType, messageBody);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvInfoUpdater", "update conversation info from StatusMessage", 4);
        try {
            String str = UpdateConversationSettingEntity.ADAPTER.decode(statusMessage.entity).conversation_id;
            if (str == null) {
                str = "";
            }
            return LIZJ(str, statusMessage.version.longValue(), i, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("ConvInfoUpdater", "decode updateConvSetting StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C0Y7K LIZJ(String str, long j, int i, MessageBody messageBody) throws Throwable {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConvSetting ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "ConvInfoUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "conversationId is empty", (Integer) null, 12);
        }
        C0Y8W c0y8wLJ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LIZ().LJ(str);
        if (j == 0 || (c0y8wLJ != null && j <= c0y8wLJ.getVersion())) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("local version is newer or version is 0, skip. local version: ");
            if (c0y8wLJ != null) {
                lValueOf = Long.valueOf(c0y8wLJ.getVersion());
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(", remote version: ");
            sbLIZ2.append(j);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "ConvInfoUpdater", C2188811AlT.LIZIZ(sbLIZ2), 4);
            return new C867580Y1s(null);
        }
        C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("addWaitConversation. local version: ");
        if (c0y8wLJ != null) {
            lValueOf2 = Long.valueOf(c0y8wLJ.getVersion());
        } else {
            lValueOf2 = null;
        }
        sbLIZ3.append(lValueOf2);
        sbLIZ3.append(", remote version: ");
        sbLIZ3.append(j);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "ConvInfoUpdater", C2188811AlT.LIZIZ(sbLIZ3), 4);
        this.LIZ.LJIIZILJ().getDomain().LIZIZ.LIZIZ(i, messageBody);
        return new C867580Y1s(null);
    }
}
