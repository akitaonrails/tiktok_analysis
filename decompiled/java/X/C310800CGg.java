package X;

import Y.ARunnableS73S0200000_4;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0CGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C310800CGg implements InterfaceC303650BvH {
    public final boolean LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC303650BvH
    public final void LIZ() {
        this.LIZIZ.set(true);
    }

    public C310800CGg(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC303650BvH
    public final void LIZIZ(long j, String str) {
        if (this.LIZ && !this.LIZIZ.get()) {
            LIZJ(j, str);
        }
    }

    public void LIZJ(long j, String str) {
        C310810CGh c310810CGh = new C310810CGh(str, j);
        C0V19 c0v19LIZJ = C0V19.LIZJ();
        C786410Ut5.LJJZZIII(c0v19LIZJ.LIZLLL(), new ARunnableS73S0200000_4(this, c310810CGh, 21));
    }
}
