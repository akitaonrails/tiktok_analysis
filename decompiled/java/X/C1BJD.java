package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BJD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJD extends OutputStream implements C1BKL {
    public final Handler LL;
    public final Map<GraphRequest, C1BJF> LLILLJJLI = new HashMap();
    public GraphRequest LLILLL;
    public C1BJF LLILZ;
    public int LLILZIL;

    public C1BJD(BPEAHandler bPEAHandler) {
        this.LL = bPEAHandler;
    }

    @Override // X.C1BKL
    public final void LIZ(GraphRequest graphRequest) {
        C1BJF c1bjf;
        this.LLILLL = graphRequest;
        if (graphRequest != null) {
            c1bjf = (C1BJF) ((HashMap) this.LLILLJJLI).get(graphRequest);
        } else {
            c1bjf = null;
        }
        this.LLILZ = c1bjf;
    }

    public final void LIZIZ(long j) {
        GraphRequest graphRequest = this.LLILLL;
        if (graphRequest == null) {
            return;
        }
        if (this.LLILZ == null) {
            C1BJF c1bjf = new C1BJF(this.LL, graphRequest);
            this.LLILZ = c1bjf;
            ((HashMap) this.LLILLJJLI).put(graphRequest, c1bjf);
        }
        C1BJF c1bjf2 = this.LLILZ;
        if (c1bjf2 != null) {
            c1bjf2.LJFF += j;
        }
        this.LLILZIL += (int) j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZIZ(1L);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        LIZIZ(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        LIZIZ(i2);
    }
}
