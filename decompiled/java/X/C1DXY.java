package X;

import Y.ARunnableS135S0100000_35;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS23S1100100_35;

/* JADX INFO: renamed from: X.1DXY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DXY extends AbstractC2257361DXa {
    public final SparkContext LIZLLL;
    public final ViewGroup LJ;
    public final Float LJFF;
    public long LJI;
    public boolean LJII;
    public final BPEAHandler LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public static final C0N1H LJFF() {
        return C0N1H.PROGRESS_BAR;
    }

    @Override // X.InterfaceC1038430d85
    public final void LIZ(AbstractC1039890dAR abstractC1039890dAR) {
        boolean z;
        ViewGroup viewGroup;
        int i;
        View viewFindViewById;
        boolean z2 = abstractC1039890dAR instanceof C1036510d4z;
        if (z2 && (viewFindViewById = this.LJ.findViewById(R.id.s8u)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (z2) {
            if (this.LIZLLL.LJFF(InterfaceC1038540d8G.class) != null) {
                z = true;
                viewGroup = (ViewGroup) this.LJ.findViewById(R.id.ydk);
            } else {
                z = false;
                viewGroup = (ViewGroup) this.LJ.findViewById(R.id.vsv);
            }
            if (viewGroup != null && viewGroup.findViewById(R.id.ju9) == null) {
                C427480GpW c427480GpW = new C427480GpW(viewGroup.getContext(), null, 6);
                c427480GpW.setId(R.id.ju9);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                if (z) {
                    i = 80;
                } else {
                    i = 48;
                }
                layoutParams.gravity = i;
                Float f = this.LJFF;
                if (f != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(f));
                }
                viewGroup.addView(c427480GpW, layoutParams);
            }
            if (!this.LJIIIZ) {
                this.LJIIIZ = true;
                C786410Ut5.LJLIIL(600L, this.LJIIIIZZ, new ARunnableS135S0100000_35(this, 39));
            }
        }
        if (((abstractC1039890dAR instanceof C1040010dAd) || (abstractC1039890dAR instanceof C1036490d4x) || (abstractC1039890dAR instanceof C1036500d4y)) && this.LJIIIZ && !this.LJIIJ) {
            this.LJIIIIZZ.removeCallbacksAndMessages(null);
            this.LJIIJ = true;
        }
        C2257371DXb c2257371DXb = this.LIZIZ;
        c2257371DXb.LIZLLL = this;
        c2257371DXb.LIZ(abstractC1039890dAR);
        if (abstractC1039890dAR instanceof C1036500d4y) {
            ((ArrayList) this.LIZJ).clear();
        }
    }

    @Override // X.InterfaceC2257521DXq
    public final void LIZIZ(EnumC1781620wSm enumC1781620wSm) {
        if (enumC1781620wSm == EnumC1781620wSm.LOADING) {
            this.LJI = System.currentTimeMillis();
            this.LJII = false;
        }
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1036450d4t) it2.next()).LIZIZ(LJFF());
        }
    }

    @Override // X.AbstractC2257361DXa, X.InterfaceC2257521DXq
    public final void LIZLLL(EnumC1781620wSm enumC1781620wSm) {
        if (enumC1781620wSm == EnumC1781620wSm.LOADING) {
            this.LJII = true;
        }
    }

    @Override // X.InterfaceC2257521DXq
    public final void LIZJ(String str, EnumC1781620wSm enumC1781620wSm) {
        if (enumC1781620wSm == EnumC1781620wSm.COMPLETE) {
            new AdWebEventLogger(this.LIZ).logAd(C2257471DXl.LIZ, this.LIZ.getAwemeRawAd(), new AwS23S1100100_35(System.currentTimeMillis() - this.LJI, this, str, 1));
            Iterator it2 = ((ArrayList) this.LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1036450d4t) it2.next()).LIZ(LJFF());
            }
        }
    }

    public C1DXY(SparkContext sparkContext, ViewGroup viewGroup, Float f, C1035880d3y c1035880d3y, C2257371DXb c2257371DXb) {
        super(c1035880d3y, c2257371DXb);
        this.LIZLLL = sparkContext;
        this.LJ = viewGroup;
        this.LJFF = f;
        this.LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    }
}
