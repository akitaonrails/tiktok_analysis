package X;

import android.os.Build;
import android.view.FrameMetrics;

/* JADX INFO: renamed from: X.0VVF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VVF extends AbstractC791320V2k implements InterfaceC2184031Adl {
    public boolean LLILLJJLI;
    public C0VVH LLILLL;

    @Override // X.InterfaceC2184031Adl
    public final int LIZ() {
        int i = C0VXC.LIZIZ;
        if (i == 0) {
            return 60;
        }
        return i;
    }

    @Override // X.InterfaceC2184031Adl
    public final void start() {
        if (this.LLILLJJLI) {
            return;
        }
        C791390V2r.LJJIII.LJ(this);
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC2184031Adl
    public final void stop() {
        if (this.LLILLJJLI) {
            C791390V2r.LJJIII.LJIILLIIL(this);
        }
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC2184031Adl
    public final float LJI() {
        return C0VXC.LIZ;
    }

    public C0VVF(int i) {
    }

    @Override // X.InterfaceC2184031Adl
    public final void LIZJ(C2184011Adj c2184011Adj) {
        this.LLILLL = c2184011Adj;
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILLIIL(long j, long j2, String str) {
        C0VVH c0vvh;
        if (Build.VERSION.SDK_INT < 24 && (c0vvh = this.LLILLL) != null) {
            c0vvh.LIZ((j2 - j) * 100, str);
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIIZILJ(String str, FrameMetrics frameMetrics, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.LLILLL.LIZ(((((((frameMetrics.getMetric(0) + frameMetrics.getMetric(1)) + frameMetrics.getMetric(2)) + frameMetrics.getMetric(3)) + frameMetrics.getMetric(4)) + frameMetrics.getMetric(5)) / 1000000) * 100, str);
        }
    }
}
