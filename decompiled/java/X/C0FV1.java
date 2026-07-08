package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0FV1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV1 implements C0EO4 {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final InterfaceC388760FMc LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C390420FSm LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 989));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 775));
    public boolean LJII;
    public final boolean LJIIIIZZ;

    public final C19648611u8 LIZ() {
        return (C19648611u8) this.LJI.getValue();
    }

    public final C1664680tQA<C19647711tz> LIZIZ() {
        return (C1664680tQA) this.LJFF.getValue();
    }

    public final void LIZLLL(boolean z) {
        LIZ();
        LIZIZ().LIZLLL(new AwS93S0110000_5(z, this, 16), true);
    }

    public final void LJ(boolean z) {
        if (C426750GoL.LIZLLL(this.LIZ)) {
            LIZ();
            LIZIZ().LIZLLL(new AwS20S0010000_5(z, 53), true);
        }
    }

    public final void LJFF(boolean z) {
        LIZ();
        LIZIZ().LIZLLL(new AwS93S0110000_5(z, this, 17), true);
    }

    public final void LJI(boolean z) {
        LIZ();
        LIZIZ().LIZLLL(new AwS93S0110000_5(z, this, 18), true);
    }

    public static final void LIZJ(C0FV1 c0fv1, C19648611u8 c19648611u8) {
        int i;
        C390630FTh c390630FTh = (C390630FTh) c0fv1.LJ.LIZJ(C13LE.LIZ(C390630FTh.class));
        if (c390630FTh != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (c390630FTh.LLJI) {
                int iLIZJ = C497820Jfg.LIZJ(c390630FTh.LL) + C1919207fS.LJIIJ();
                ViewGroup.LayoutParams layoutParams = c0fv1.LIZIZ.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                int iMax = Math.max(iLIZJ - i, 0);
                View viewFindViewById = c19648611u8.findViewById(R.id.ya5);
                if (viewFindViewById != null) {
                    C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iMax), null, null, false, 29);
                }
            }
        }
    }

    public C0FV1(Context context, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        this.LIZ = context;
        this.LIZIZ = frameLayout;
        this.LIZJ = interfaceC388760FMc;
        this.LIZLLL = lifecycleOwner;
        this.LJ = c390420FSm;
        this.LJII = C390410FSl.LIZIZ(c390420FSm).LJII;
        this.LJIIIIZZ = C390410FSl.LIZIZ(c390420FSm).LJI;
    }
}
