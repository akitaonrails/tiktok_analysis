package X;

import com.ttnet.org.chromium.net.n0;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1497260p48 extends AbstractC1498040p5O {
    public final /* synthetic */ C1497230p45 LL;

    @Override // X.AbstractC1498040p5O
    public final long LIZ() {
        return this.LL.LLILZLL;
    }

    public C1497260p48(C1497230p45 c1497230p45) {
        this.LL = c1497230p45;
    }

    @Override // X.AbstractC1498040p5O
    public final void LIZLLL(n0 n0Var) {
        C1497230p45 c1497230p45 = this.LL;
        if (c1497230p45.LLJI) {
            c1497230p45.LLJIJIL = true;
            c1497230p45.LLIZ.rewind();
            n0Var.LIZJ();
            return;
        }
        n0Var.LIZIZ(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    @Override // X.AbstractC1498040p5O
    public final void LIZIZ(n0 n0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.LL.LLIZ.remaining()) {
            byteBuffer.put(this.LL.LLIZ);
            this.LL.LLIZ.clear();
            n0Var.LIZ(false);
            C1497230p45 c1497230p45 = this.LL;
            if (!c1497230p45.LLJIJIL) {
                c1497230p45.LLILZIL.LLILLJJLI = false;
                return;
            }
            return;
        }
        int iLimit = this.LL.LLIZ.limit();
        ByteBuffer byteBuffer2 = this.LL.LLIZ;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.LL.LLIZ);
        this.LL.LLIZ.limit(iLimit);
        n0Var.LIZ(false);
    }
}
