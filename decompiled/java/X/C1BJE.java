package X;

import Y.ARunnableS103S0200000_34;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.1BJE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJE extends FilterOutputStream implements C1BKL {
    public final C1BJ9 LL;
    public final Map<GraphRequest, C1BJF> LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public C1BJF LLIZ;

    public final void LIZLLL() {
        BPEAHandler bPEAHandler;
        if (this.LLILZIL > this.LLILZLL) {
            for (C1BK9 c1bk9 : (ArrayList) this.LL.LLILLL) {
                if ((c1bk9 instanceof InterfaceC2202991BJx) && ((bPEAHandler = this.LL.LL) == null || Boolean.valueOf(C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS103S0200000_34(c1bk9, this, 50))) == null)) {
                    ((InterfaceC2202991BJx) c1bk9).LIZ();
                }
            }
            this.LLILZLL = this.LLILZIL;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator<C1BJF> it2 = this.LLILLJJLI.values().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        LIZLLL();
    }

    @Override // X.C1BKL
    public final void LIZ(GraphRequest graphRequest) {
        C1BJF c1bjf;
        if (graphRequest != null) {
            c1bjf = this.LLILLJJLI.get(graphRequest);
        } else {
            c1bjf = null;
        }
        this.LLIZ = c1bjf;
    }

    public final void LIZIZ(long j) {
        C1BJF c1bjf = this.LLIZ;
        if (c1bjf != null) {
            long j2 = c1bjf.LIZLLL + j;
            c1bjf.LIZLLL = j2;
            if (j2 >= c1bjf.LJ + c1bjf.LIZJ || j2 >= c1bjf.LJFF) {
                c1bjf.LIZ();
            }
        }
        long j3 = this.LLILZIL + j;
        this.LLILZIL = j3;
        if (j3 >= this.LLILZLL + this.LLILZ || j3 >= this.LLILLL) {
            LIZLLL();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        LIZIZ(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        LIZIZ(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        LIZIZ(i2);
    }

    public C1BJE(OutputStream outputStream, C1BJ9 c1bj9, Map<GraphRequest, C1BJF> map, long j) {
        super(outputStream);
        this.LL = c1bj9;
        this.LLILLJJLI = map;
        this.LLILLL = j;
        C0W7K.LJFF();
        this.LLILZ = FacebookSdk.LJI.get();
    }
}
