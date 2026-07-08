package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;

/* JADX INFO: renamed from: X.0Y5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868550Y5l implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C868550Y5l(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ResetAllDataUpdater", "reset all data", 4);
        return this.LIZ.LJIJ().LIZIZ(messageBody);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "ResetAllDataUpdater", "reset all data from StatusMessage", 4);
        return this.LIZ.LJIJ().LJ(messageBody, statusMessage);
    }
}
