package X;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;

/* JADX INFO: renamed from: X.0p5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497990p5J implements InterfaceC1497890p59 {
    public final /* synthetic */ AbstractC1497970p5H LIZ;

    @Override // X.InterfaceC1497890p59
    public final void run() throws IOException {
        C1498000p5K c1498000p5K = (C1498000p5K) this.LIZ;
        if (c1498000p5K.LJIIIZ == null) {
            c1498000p5K.LJIIJJI.getClass();
            c1498000p5K.LJII.setDoOutput(true);
            c1498000p5K.LJII.connect();
            c1498000p5K.LJIIJJI.getClass();
            OutputStream outputStream = c1498000p5K.LJII.getOutputStream();
            c1498000p5K.LJIIJ = outputStream;
            c1498000p5K.LJIIIZ = Channels.newChannel(outputStream);
        }
        this.LIZ.LIZ.set(0);
        this.LIZ.LIZLLL(new InterfaceC1497890p59() { // from class: X.0p5N
            @Override // X.InterfaceC1497890p59
            public final void run() {
                AbstractC1497970p5H abstractC1497970p5H = this.LIZ.LIZ;
                abstractC1497970p5H.LIZLLL.LIZIZ(abstractC1497970p5H, abstractC1497970p5H.LJ);
            }
        });
    }

    public C1497990p5J(AbstractC1497970p5H abstractC1497970p5H) {
        this.LIZ = abstractC1497970p5H;
    }
}
