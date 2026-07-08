package X;

import Y.ARunnableS19S1100000_14;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;

/* JADX INFO: renamed from: X.0Yow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885760Yow {
    public final InterfaceC885770Yox LIZ;

    public final void LIZ() {
        boolean zLJIIIZ = this.LIZ.LJIIIZ() || (C885630Yoj.LIZIZ() && !this.LIZ.LJFF());
        if (this.LIZ.LJII()) {
            zLJIIIZ = this.LIZ.LJIIIZ();
        }
        LIZLLL(null, zLJIIIZ, true);
    }

    public final void LIZIZ() {
        boolean z = this.LIZ.LJIIIZ() || (C885630Yoj.LIZIZ() && !this.LIZ.LJFF());
        C878960Ydy c878960YdyLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (c878960YdyLJIIIIZZ == null) {
            return;
        }
        this.LIZ.LJ();
        this.LIZ.LJIIJ(c878960YdyLJIIIIZZ, new C885730Yot(this, z, null));
    }

    public final void LIZJ() {
        boolean z = this.LIZ.LJIIIZ() || (C885630Yoj.LIZIZ() && !this.LIZ.LJFF());
        C878960Ydy c878960YdyLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (c878960YdyLJIIIIZZ == null) {
            return;
        }
        this.LIZ.LJ();
        this.LIZ.LJIIJ(c878960YdyLJIIIIZZ, new C885720Yos(this, z, null));
    }

    public C885760Yow(InterfaceC885770Yox interfaceC885770Yox) {
        this.LIZ = interfaceC885770Yox;
    }

    public final void LJ(String str) {
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS19S1100000_14(this, str, 2));
    }

    public final void LIZLLL(List list, boolean z, boolean z2) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C878960Ydy c878960YdyLJIIIIZZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || (c878960YdyLJIIIIZZ = this.LIZ.LJIIIIZZ()) == null) {
            return;
        }
        this.LIZ.LJ();
        this.LIZ.LJIIJ(c878960YdyLJIIIIZZ, new C885710Yor(list, this, z2, z, activityLIZ, null));
    }
}
