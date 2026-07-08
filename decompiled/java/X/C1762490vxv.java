package X;

import Y.ARunnableS126S0100000_26;
import android.animation.ObjectAnimator;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0vxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762490vxv {
    public DynamicSellingPointsBase LIZ;
    public C1762730vyJ LIZIZ;
    public int LJFF;
    public PdpViewModel LJII;
    public long LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public long LIZLLL = 6000;
    public long LJ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final Set<DynamicSellingPoint> LJI = new LinkedHashSet();
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS126S0100000_26 LJIIIZ = new ARunnableS126S0100000_26(this, 113);

    public final void LIZ() {
        BPEAHandler bPEAHandler = this.LJIIIIZZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LJIIIZ);
        }
        C1762730vyJ c1762730vyJ = this.LIZIZ;
        if (c1762730vyJ != null) {
            ObjectAnimator objectAnimator = c1762730vyJ.LLILLL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = c1762730vyJ.LLILZ;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        C1762730vyJ c1762730vyJ2 = this.LIZIZ;
        if (c1762730vyJ2 != null) {
            c1762730vyJ2.LLILZ = null;
            c1762730vyJ2.LLILLL = null;
            C03DZ.LIZ(c1762730vyJ2);
        }
        this.LIZIZ = null;
        this.LIZ = null;
        this.LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LIZLLL = 6000L;
        this.LJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LJFF = 0;
        this.LJI.clear();
        this.LJII = null;
    }
}
