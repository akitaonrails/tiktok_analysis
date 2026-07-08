package X;

import com.bytedance.common.utility.Logger;

/* JADX INFO: renamed from: X.0WJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC821230WJl implements InterfaceC821250WJn {
    public final InterfaceC821190WJh LIZ;

    public AbstractC821230WJl(InterfaceC821190WJh interfaceC821190WJh) {
        this.LIZ = interfaceC821190WJh;
    }

    public final C0XE1 LIZIZ(int i, int i2, boolean z) {
        C0XE1 c0xe1 = C0XE1.CONNECTION_UNKNOWN;
        if (i2 != 0) {
            if (i2 == 1) {
                c0xe1 = C0XE1.CONNECTING;
            } else if (i2 == 2) {
                c0xe1 = C0XE1.CONNECT_FAILED;
            } else if (i2 == 3) {
                c0xe1 = C0XE1.CONNECT_CLOSED;
            } else if (i2 == 4) {
                c0xe1 = C0XE1.CONNECTED;
            }
        }
        Logger.debug();
        this.LIZ.syncState(i, c0xe1, z);
        return c0xe1;
    }
}
