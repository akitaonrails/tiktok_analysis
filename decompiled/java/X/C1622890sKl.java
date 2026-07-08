package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0sKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622890sKl implements InterfaceC1622080sJS {
    public final InterfaceC1628620sU0 LL;

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public C1622890sKl(InterfaceC1628620sU0 interfaceC1628620sU0) {
        this.LL = interfaceC1628620sU0;
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        C1627370sRz c1627370sRz;
        Bundle bundle;
        C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        if (!(abstractC1627380sS0 instanceof C1627370sRz) || ((bundle = (c1627370sRz = (C1627370sRz) abstractC1627380sS0).LJ) != null && bundle.getBoolean("share_from_green_screen_kit"))) {
            return c1623370sLXLIZ;
        }
        this.LL.s(c1627370sRz.LIZ);
        return c1623370sLXLIZ;
    }
}
