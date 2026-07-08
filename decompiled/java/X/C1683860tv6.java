package X;

import android.os.Build;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0tv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683860tv6 {
    public static final WeakHashMap<View, C1683860tv6> LJIJJ;
    public final C1683830tv3 LIZ = C1683850tv5.LIZ(4, "captionBar");
    public final C1683830tv3 LIZIZ;
    public final C1683830tv3 LIZJ;
    public final C1683830tv3 LIZLLL;
    public final C1683830tv3 LJ;
    public final C1683830tv3 LJFF;
    public final C1683830tv3 LJI;
    public final C1683830tv3 LJII;
    public final C1683830tv3 LJIIIIZZ;
    public final C1683870tv7 LJIIIZ;
    public final C1683870tv7 LJIIJ;
    public final C1683870tv7 LJIIJJI;
    public final C1683870tv7 LJIIL;
    public final C1683870tv7 LJIILIIL;
    public final C1683870tv7 LJIILJJIL;
    public final C1683870tv7 LJIILL;
    public final C1683870tv7 LJIILLIIL;
    public final boolean LJIIZILJ;
    public int LJIJ;
    public final RunnableC1683910tvB LJIJI;

    static {
        new C1683850tv5();
        LJIJJ = new WeakHashMap<>();
    }

    public C1683860tv6(View view) {
        Boolean bool;
        View view2;
        C1683830tv3 c1683830tv3LIZ = C1683850tv5.LIZ(128, "displayCutout");
        this.LIZIZ = c1683830tv3LIZ;
        C1683830tv3 c1683830tv3LIZ2 = C1683850tv5.LIZ(8, "ime");
        this.LIZJ = c1683830tv3LIZ2;
        C1683830tv3 c1683830tv3LIZ3 = C1683850tv5.LIZ(32, "mandatorySystemGestures");
        this.LIZLLL = c1683830tv3LIZ3;
        this.LJ = C1683850tv5.LIZ(2, "navigationBars");
        boolean zBooleanValue = true;
        this.LJFF = C1683850tv5.LIZ(1, "statusBars");
        C1683830tv3 c1683830tv3LIZ4 = C1683850tv5.LIZ(7, "systemBars");
        this.LJI = c1683830tv3LIZ4;
        C1683830tv3 c1683830tv3LIZ5 = C1683850tv5.LIZ(16, "systemGestures");
        this.LJII = c1683830tv3LIZ5;
        C1683830tv3 c1683830tv3LIZ6 = C1683850tv5.LIZ(64, "tappableElement");
        this.LJIIIIZZ = c1683830tv3LIZ6;
        C1683870tv7 c1683870tv7 = new C1683870tv7(C1683840tv4.LIZJ(C20244914Jj.LJ), "waterfall");
        this.LJIIIZ = c1683870tv7;
        new C1672840tdK(new C1672840tdK(c1683830tv3LIZ4, c1683830tv3LIZ2), c1683830tv3LIZ);
        new C1672840tdK(new C1672840tdK(new C1672840tdK(c1683830tv3LIZ6, c1683830tv3LIZ3), c1683830tv3LIZ5), c1683870tv7);
        this.LJIIJ = C1683850tv5.LIZIZ(4, "captionBarIgnoringVisibility");
        this.LJIIJJI = C1683850tv5.LIZIZ(2, "navigationBarsIgnoringVisibility");
        this.LJIIL = C1683850tv5.LIZIZ(1, "statusBarsIgnoringVisibility");
        this.LJIILIIL = C1683850tv5.LIZIZ(7, "systemBarsIgnoringVisibility");
        this.LJIILJJIL = C1683850tv5.LIZIZ(64, "tappableElementIgnoringVisibility");
        this.LJIILL = C1683850tv5.LIZIZ(8, "imeAnimationTarget");
        this.LJIILLIIL = C1683850tv5.LIZIZ(8, "imeAnimationSource");
        Object parent = view.getParent();
        Object tag = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            tag = view2.getTag(R.id.eq8);
        }
        if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LJIIZILJ = zBooleanValue;
        this.LJIJI = new RunnableC1683910tvB(this);
    }

    public static void LIZ(C1683860tv6 c1683860tv6, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZJ;
        c1683860tv6.LIZ.LJFF(c20246014Ju, 0);
        c1683860tv6.LIZJ.LJFF(c20246014Ju, 0);
        c1683860tv6.LIZIZ.LJFF(c20246014Ju, 0);
        c1683860tv6.LJ.LJFF(c20246014Ju, 0);
        c1683860tv6.LJFF.LJFF(c20246014Ju, 0);
        c1683860tv6.LJI.LJFF(c20246014Ju, 0);
        c1683860tv6.LJII.LJFF(c20246014Ju, 0);
        c1683860tv6.LJIIIIZZ.LJFF(c20246014Ju, 0);
        c1683860tv6.LIZLLL.LJFF(c20246014Ju, 0);
        c1683860tv6.LJIIJ.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZIZ(4)));
        c1683860tv6.LJIIJJI.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZIZ(2)));
        c1683860tv6.LJIIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZIZ(1)));
        c1683860tv6.LJIILIIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZIZ(7)));
        c1683860tv6.LJIILJJIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZIZ(64)));
        C1683900tvA c1683900tvALJFF = c20246014Ju.LIZ.LJFF();
        if (c1683900tvALJFF != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                c20244914JjLIZJ = C20244914Jj.LIZJ(C1683890tv9.LIZIZ(c1683900tvALJFF.LIZ));
            } else {
                c20244914JjLIZJ = C20244914Jj.LJ;
            }
            c1683860tv6.LJIIIZ.LJFF(C1683840tv4.LIZJ(c20244914JjLIZJ));
        }
        C13YI.LJFF();
    }
}
