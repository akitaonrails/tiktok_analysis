package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A7N, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1A7N {
    public String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = 2;
    public boolean LJ;
    public boolean LJFF;
    public Pair<Integer, Integer> LJI;
    public Integer LJII;

    public abstract void LIZ(int i, int i2, ViewGroup viewGroup);

    public abstract Pair<Integer, Integer> LIZIZ();

    public abstract Integer LIZJ();

    public abstract Integer LIZLLL();

    public abstract void LJ(ViewGroup.LayoutParams layoutParams);

    public abstract void LJFF(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, int i, int i2);

    public abstract boolean LJIIIIZZ();

    public void LJII(int i, int i2) {
        this.LJI = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJI(Function0<Boolean> function0, ViewGroup viewGroup, int i, int i2, Function0<Unit> function02) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (i == 9 && i2 == 16) {
            return;
        }
        if (!function0.invoke().booleanValue() && !this.LIZJ && !this.LIZIZ) {
            if (viewGroup == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                if (i2 > 0 && i > 0 && width > 0 && height > 0 && i <= i2) {
                    float f = i2 / i;
                    float f2 = height;
                    float f3 = width;
                    if (f < f2 / f3) {
                        layoutParams2.height = (int) (f3 * f);
                        Integer numLIZJ = LIZJ();
                        if (numLIZJ != null) {
                            layoutParams2.gravity = numLIZJ.intValue();
                        }
                        C786410Ut5.X5(layoutParams2, viewGroup);
                        this.LJI = new Pair<>(Integer.valueOf(width), Integer.valueOf(layoutParams2.height));
                        function02.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }
}
