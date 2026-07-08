package X;

import com.ttnet.org.chromium.net.n0;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497950p5F extends AbstractC1498040p5O {
    public final AbstractC1498040p5O LL;

    @Override // X.AbstractC1498040p5O
    public final long LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.AbstractC1498040p5O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    public C1497950p5F(AbstractC1498040p5O abstractC1498040p5O) {
        this.LL = abstractC1498040p5O;
    }

    @Override // X.AbstractC1498040p5O
    public final void LIZLLL(n0 n0Var) {
        this.LL.LIZLLL(n0Var);
    }

    @Override // X.AbstractC1498040p5O
    public final void LIZIZ(n0 n0Var, ByteBuffer byteBuffer) {
        this.LL.LIZIZ(n0Var, byteBuffer);
    }
}
