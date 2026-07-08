package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0x0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1802540x0W implements InterfaceC1797320ws6 {
    public abstract C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz);

    @Override // X.InterfaceC1797320ws6
    public final InterfaceC1797280ws2 LIZ(Context context, InterfaceC1151090g3n interfaceC1151090g3n, String str) {
        if (interfaceC1151090g3n instanceof C1797250wrz) {
            return LIZIZ(context, (C1797250wrz) interfaceC1151090g3n);
        }
        return C1802640x0g.LIZ();
    }
}
