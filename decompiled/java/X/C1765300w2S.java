package X;

import Y.ARunnableS0S0210100_26;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.0w2S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765300w2S {
    public final SeaPdpViewModel LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public ARunnableS0S0210100_26 LJIIIIZZ;

    public C1765300w2S(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final void LIZIZ(Image image) {
        if (this.LJ) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C1765270w2P(image, this.LIZ.LLLFF, this, SystemClock.elapsedRealtime(), null), 2);
    }

    public final void LIZ(Image image, boolean z, boolean z2) {
        if (!this.LJ && !this.LIZ.LLLFF && !z2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.LJ = true;
            ARunnableS0S0210100_26 aRunnableS0S0210100_26 = new ARunnableS0S0210100_26(this, z, image, jElapsedRealtime, 1);
            if (this.LJII > 0) {
                aRunnableS0S0210100_26.run();
            } else {
                this.LJIIIIZZ = aRunnableS0S0210100_26;
            }
        }
    }
}
