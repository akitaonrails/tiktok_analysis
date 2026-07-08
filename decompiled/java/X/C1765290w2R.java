package X;

import Y.ARunnableS0S0210100_26;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.0w2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765290w2R {
    public final PdpViewModel LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public ARunnableS0S0210100_26 LJIIIIZZ;

    public C1765290w2R(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZIZ(Image image) {
        if (this.LJ) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C1765280w2Q(image, this.LIZ.LLLF, this, SystemClock.elapsedRealtime(), null), 2);
    }

    public final void LIZ(Image image, boolean z, boolean z2) {
        if (!this.LJ && !this.LIZ.LLLF && !z2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.LJ = true;
            ARunnableS0S0210100_26 aRunnableS0S0210100_26 = new ARunnableS0S0210100_26(this, z, image, jElapsedRealtime, 0);
            if (this.LJII > 0) {
                aRunnableS0S0210100_26.run();
            } else {
                this.LJIIIIZZ = aRunnableS0S0210100_26;
            }
        }
    }
}
