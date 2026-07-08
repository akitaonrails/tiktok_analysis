package X;

import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateConversationCoreInfoEntity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y26, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y26 implements InterfaceC868830Y6n, C0Y29 {
    public final C0YEM LIZ;

    public C0Y26(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.C0Y29
    public final C0Y7K LIZ(MessageBody messageBody, CommandMessage commandMessage) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvCoreInfoUpdater", "update conversation core info", 4);
        return LIZJ(commandMessage.conversationId, commandMessage.groupVersion, commandMessage.inboxType, messageBody);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ConvCoreInfoUpdater", "update conversation core info from StatusMessage", 4);
        try {
            String str = UpdateConversationCoreInfoEntity.ADAPTER.decode(statusMessage.entity).conversation_id;
            if (str == null) {
                str = "";
            }
            return LIZJ(str, statusMessage.version.longValue(), i, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("ConvCoreInfoUpdater", "decode updateConvCoreInfo StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C0Y7K LIZJ(String str, long j, int i, MessageBody messageBody) throws Throwable {
        boolean z;
        long version;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C868780Y6i.LJIILLIIL(this.LIZ.LIZLLL(), "ConvCoreInfoUpdater", "updateConvCoreInfo with empty conversationId", 4);
            return new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "conversationId is empty", (Integer) null, 12);
        }
        C0Y8Y c0y8yLJ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIIIZZ().LJ(str);
        if (c0y8yLJ != null) {
            version = c0y8yLJ.getVersion();
        } else {
            version = 0;
        }
        if (j > version) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateConvCoreInfo, convId: ");
            sbLIZ.append(str);
            sbLIZ.append(", new version: ");
            sbLIZ.append(j);
            sbLIZ.append(", local version: ");
            sbLIZ.append(version);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "ConvCoreInfoUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
            this.LIZ.LJIIZILJ().getDomain().LIZIZ.LIZIZ(i, messageBody);
        } else {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateConvCoreInfo skipped, convId: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", new version: ");
            sbLIZ2.append(j);
            sbLIZ2.append(", local version: ");
            sbLIZ2.append(version);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "ConvCoreInfoUpdater", C2188811AlT.LIZIZ(sbLIZ2), 4);
        }
        return new C867580Y1s(null);
    }
}
