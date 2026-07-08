package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.16Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20737416Cu extends Exception {
    public final transient InterfaceC204578153g LL;
    public final IOException LLILLJJLI;

    public InterfaceC204578153g getConnection() {
        return this.LL;
    }

    public IOException getIOException() {
        return this.LLILLJJLI;
    }

    public C20737416Cu(InterfaceC204578153g interfaceC204578153g, IOException iOException) {
        this.LL = interfaceC204578153g;
        this.LLILLJJLI = iOException;
    }
}
