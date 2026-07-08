package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.1Cyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247921Cyc {
    public final int LJIJ;
    public final int LJIJI;
    public View LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public C11HK LJJIIJZLJL;
    public C11HH LJJIIZ;
    public boolean LJJIJ;
    public LifecycleOwner LJJIJIL;
    public boolean LJJJJ;
    public final int LJJJJI;
    public boolean LJJJJIZL;
    public final boolean LJJJJJ;
    public final boolean LJJJJJL;
    public int LIZ = Integer.MIN_VALUE;
    public final int LIZIZ = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
    public int LIZJ = Integer.MIN_VALUE;
    public final boolean LIZLLL = true;
    public final int LJ = Integer.MIN_VALUE;
    public int LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
    public float LJI = 0.5f;
    public EnumC1152950g6n LJII = EnumC1152950g6n.ALIGN_BALLOON;
    public final EnumC1152940g6m LJIIIIZZ = EnumC1152940g6m.ALIGN_ANCHOR;
    public EnumC2248001Cyk LJIIIZ = EnumC2248001Cyk.BOTTOM;
    public final float LJIIJ = 2.5f;
    public int LJIIJJI = -16777216;
    public final float LJIIL = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
    public final CharSequence LJIILIIL = "";
    public final int LJIILJJIL = -1;
    public float LJIILL = 12.0f;
    public final int LJIILLIIL = 17;
    public final EnumC2248091Cyt LJIIZILJ = EnumC2248091Cyt.START;
    public final int LJIJJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
    public final int LJIJJLI = Integer.MIN_VALUE;
    public final float LJIL = 1.0f;
    public final float LJJ = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
    public C0HJE LJJIII = C0HJC.LIZ;
    public final int LJJIIJ = 17;
    public boolean LJJIIZI = true;
    public final boolean LJJIJIIJI = true;
    public final long LJJIJIIJIL = -1;
    public int LJJIJL = Integer.MIN_VALUE;
    public final int LJJIJLIJ = Integer.MIN_VALUE;
    public final EnumC2248031Cyn LJJIL = EnumC2248031Cyn.FADE;
    public final EnumC19364910pT LJJIZ = EnumC19364910pT.FADE;
    public final long LJJJ = 500;
    public final EnumC2248041Cyo LJJJI = EnumC2248041Cyo.NONE;
    public final int LJJJIL = Integer.MIN_VALUE;

    public C2247921Cyc(Context context) {
        boolean z;
        float f = 28;
        this.LJIJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        this.LJIJI = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJJ = z;
        this.LJJJJI = z ? -1 : 1;
        this.LJJJJIZL = true;
        this.LJJJJJ = true;
        this.LJJJJJL = true;
    }

    public final void LIZ(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            "The height of the balloon must bigger than zero.".toString();
            throw new IllegalArgumentException("The height of the balloon must bigger than zero.");
        }
        this.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
    }

    public final void LIZIZ(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            "The width of the balloon must bigger than zero.".toString();
            throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
        }
        this.LIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
    }
}
