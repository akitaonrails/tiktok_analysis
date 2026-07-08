package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.08mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2220408mw implements InterfaceC2221208n4 {
    public final C2221108n3 LL;
    public final InputStream LLILLJJLI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LLILLJJLI.close();
    }

    public C2220408mw(C2221108n3 c2221108n3, InputStream inputStream) {
        this.LL = c2221108n3;
        this.LLILLJJLI = inputStream;
    }
}
