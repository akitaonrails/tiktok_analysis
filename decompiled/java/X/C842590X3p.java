package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0X3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842590X3p extends AbstractC842510X3h {
    public final AbstractC842510X3h LL;
    public final C1496670p3B LLILLJJLI;
    public IOException LLILLL;

    @Override // X.AbstractC842510X3h, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    @Override // X.AbstractC842510X3h
    public final long contentLength() {
        return this.LL.contentLength();
    }

    @Override // X.AbstractC842510X3h
    public final C0X0P contentType() {
        return this.LL.contentType();
    }

    @Override // X.AbstractC842510X3h
    public final InterfaceC1496620p36 source() {
        return this.LLILLJJLI;
    }

    public C842590X3p(AbstractC842510X3h abstractC842510X3h) {
        this.LL = abstractC842510X3h;
        final InterfaceC1496620p36 interfaceC1496620p36Source = abstractC842510X3h.source();
        this.LLILLJJLI = new C1496670p3B(new AbstractC842560X3m(interfaceC1496620p36Source) { // from class: X.0X3o
            @Override // X.AbstractC842560X3m, X.InterfaceC842570X3n
            public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
                try {
                    return super.read(c1496690p3D, j);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LLILLL = e;
                    throw e;
                }
            }
        });
    }
}
