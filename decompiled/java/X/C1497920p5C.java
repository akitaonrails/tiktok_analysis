package X;

import Y.ARunnableS92S0200000_23;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0p5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497920p5C implements InterfaceC1497890p59 {
    public final /* synthetic */ C1497900p5A LIZ;

    @Override // X.InterfaceC1497890p59
    public final void run() throws IOException {
        if (this.LIZ.LIZJ.get() == 8) {
            return;
        }
        URL url = new URL(this.LIZ.LJII);
        HttpURLConnection httpURLConnection = this.LIZ.LJIIJJI;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.LIZ.LJIIJJI = null;
        }
        this.LIZ.LJIIJJI = (HttpURLConnection) C2204961BRm.e0(url, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjtIdC17Sx2D4MxwphcudxJcH/dA==", null));
        this.LIZ.LJIIJJI.setInstanceFollowRedirects(false);
        if (!((TreeMap) this.LIZ.LIZ).containsKey("User-Agent")) {
            C1497900p5A c1497900p5A = this.LIZ;
            Map<String, String> map = c1497900p5A.LIZ;
            c1497900p5A.getClass();
            ((TreeMap) map).put("User-Agent", null);
        }
        for (Map.Entry entry : ((TreeMap) this.LIZ.LIZ).entrySet()) {
            this.LIZ.LJIIJJI.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        C1497900p5A c1497900p5A2 = this.LIZ;
        if (c1497900p5A2.LJ == null) {
            c1497900p5A2.LJ = "GET";
        }
        c1497900p5A2.LJIIJJI.setRequestMethod(c1497900p5A2.LJ);
        C1497900p5A c1497900p5A3 = this.LIZ;
        C1497950p5F c1497950p5F = c1497900p5A3.LJFF;
        if (c1497950p5F == null) {
            c1497900p5A3.LJIIJJI.connect();
            C1497900p5A c1497900p5A4 = this.LIZ;
            c1497900p5A4.getClass();
            new ARunnableS92S0200000_23(new C1497910p5B(c1497900p5A4), c1497900p5A4, 35);
            throw null;
        }
        Executor executor = c1497900p5A3.LJI;
        c1497900p5A3.getClass();
        c1497900p5A3.LJIIL = new C1498000p5K(c1497900p5A3, executor, null, c1497900p5A3.LJIIJJI, c1497950p5F);
        C1497900p5A c1497900p5A5 = this.LIZ;
        final C1498000p5K c1498000p5K = c1497900p5A5.LJIIL;
        final boolean z = ((ArrayList) c1497900p5A5.LIZIZ).size() == 1;
        c1498000p5K.getClass();
        c1498000p5K.LIZLLL(new InterfaceC1497890p59() { // from class: X.0p5G
            @Override // X.InterfaceC1497890p59
            public final void run() {
                AbstractC1497970p5H abstractC1497970p5H = c1498000p5K;
                abstractC1497970p5H.LJFF = abstractC1497970p5H.LIZLLL.LIZ();
                AbstractC1497970p5H abstractC1497970p5H2 = c1498000p5K;
                long j = abstractC1497970p5H2.LJFF;
                if (j == 0) {
                    C1498000p5K c1498000p5K2 = (C1498000p5K) abstractC1497970p5H2;
                    if (c1498000p5K2.LJIIIZ != null && c1498000p5K2.LJIIIIZZ.compareAndSet(false, true)) {
                        c1498000p5K2.LJIIIZ.close();
                    }
                    C1497900p5A c1497900p5A6 = c1498000p5K2.LJIIJJI;
                    c1497900p5A6.getClass();
                    new ARunnableS92S0200000_23(new C1497910p5B(c1497900p5A6), c1497900p5A6, 35);
                    throw null;
                }
                if (j <= 0 || j >= 8192) {
                    abstractC1497970p5H2.LJ = ByteBuffer.allocateDirect(8192);
                } else {
                    abstractC1497970p5H2.LJ = ByteBuffer.allocateDirect(((int) j) + 1);
                }
                AbstractC1497970p5H abstractC1497970p5H3 = c1498000p5K;
                long j2 = abstractC1497970p5H3.LJFF;
                C1498000p5K c1498000p5K3 = (C1498000p5K) abstractC1497970p5H3;
                if (j2 > 0) {
                    c1498000p5K3.LJII.setFixedLengthStreamingMode(j2);
                } else {
                    c1498000p5K3.LJII.setChunkedStreamingMode(8192);
                }
                if (!z) {
                    c1498000p5K.LIZ.set(1);
                    AbstractC1497970p5H abstractC1497970p5H4 = c1498000p5K;
                    abstractC1497970p5H4.LIZLLL.LIZLLL(abstractC1497970p5H4);
                } else {
                    AbstractC1497970p5H abstractC1497970p5H5 = c1498000p5K;
                    Executor executor2 = abstractC1497970p5H5.LIZJ;
                    C1497990p5J c1497990p5J = new C1497990p5J(abstractC1497970p5H5);
                    C1497900p5A c1497900p5A7 = ((C1498000p5K) abstractC1497970p5H5).LJIIJJI;
                    c1497900p5A7.getClass();
                    executor2.execute(new ARunnableS92S0200000_23(c1497990p5J, c1497900p5A7, 35));
                }
            }
        });
    }

    public C1497920p5C(C1497900p5A c1497900p5A) {
        this.LIZ = c1497900p5A;
    }
}
