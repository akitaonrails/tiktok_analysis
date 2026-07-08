package X;

import android.os.Looper;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0eQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088150eQH {
    public final FrameLayout LIZ;
    public final C1088160eQI LIZIZ;
    public final InterfaceC1088170eQJ LIZJ;
    public C1103880epe LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final int LJIIL;
    public boolean LJIILL;
    public final long LJIILIIL = ViewConfiguration.getLongPressTimeout();
    public final BPEAHandler LJIILJJIL = new BPEAHandler(Looper.getMainLooper());
    public final boolean LJIILLIIL = C497740JfY.LJJ();

    public final void LIZ() {
        if (this.LJIILL) {
            this.LJIILJJIL.removeCallbacksAndMessages(null);
            this.LJIILL = false;
        }
        C1103880epe c1103880epe = this.LIZLLL;
        if (c1103880epe != null && this.LJ) {
            this.LJ = false;
            C1088160eQI c1088160eQI = this.LIZIZ;
            C500260Jjc.LJIILIIL(c1088160eQI.LIZ);
            C500260Jjc.LJIILIIL(c1088160eQI.LIZIZ);
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(c1088160eQI.LIZJ);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
            tuxImmersionBarLIZLLL.LIZLLL();
            this.LIZJ.qm();
            c1103880epe.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (this.LJFF) {
                c1103880epe.animate().x(this.LJIIJ).y(this.LJIIJJI).setDuration(200L).start();
                this.LIZJ.LIZ();
                return;
            }
            FrameLayout frameLayout = this.LIZ;
            C1088160eQI c1088160eQI2 = this.LIZIZ;
            ViewGroup viewGroup = c1088160eQI2.LIZ;
            ViewGroup viewGroup2 = c1088160eQI2.LIZIZ;
            final float fLIZIZ = C418440Gaw.LIZIZ(12);
            final float width = (frameLayout.getWidth() - c1103880epe.getWidth()) - fLIZIZ;
            final float height = viewGroup.getHeight();
            float height2 = (frameLayout.getHeight() - viewGroup2.getHeight()) - c1103880epe.getHeight();
            if (height2 < height) {
                height2 = height;
            }
            float x = c1103880epe.getX();
            float y = c1103880epe.getY();
            if (x + (c1103880epe.getWidth() / 2.0f) <= frameLayout.getWidth() / 2.0f) {
                width = fLIZIZ;
            }
            final float fLIZLLL = C13LZ.LIZLLL(y, height, height2);
            c1103880epe.animate().x(width).y(fLIZLLL).setDuration(200L).withEndAction(new Runnable() { // from class: X.0eLg
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DragController@38d3.snapToEdgesWithZones$1");
                    try {
                        int i = 1;
                        if (width != fLIZIZ ? this.LJIILLIIL : !this.LJIILLIIL) {
                            i = 0;
                        }
                        this.LIZJ.LIZIZ(i, (int) C497740JfY.LJJI((int) (fLIZLLL - height)));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DragController@38d3.snapToEdgesWithZones$1");
                }
            }).start();
        }
    }

    public C1088150eQH(FrameLayout frameLayout, C1088160eQI c1088160eQI, InterfaceC1088170eQJ interfaceC1088170eQJ) {
        this.LIZ = frameLayout;
        this.LIZIZ = c1088160eQI;
        this.LIZJ = interfaceC1088170eQJ;
        this.LJIIL = ViewConfiguration.get(frameLayout.getContext()).getScaledTouchSlop();
    }
}
