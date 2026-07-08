package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0f0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110560f0Q extends AbstractC498530Jgp<C1110620f0W> {
    public final Context LIZIZ;
    public final Bitmap LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public InterfaceC1110610f0V LJIIIZ;

    @Override // X.AbstractC498530Jgp
    public final int LIZLLL() {
        return 0;
    }

    @Override // X.AbstractC498530Jgp
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public C1110620f0W LJ() {
        Context context = this.LIZIZ;
        Bitmap bitmap = this.LIZJ;
        int i = this.LJI;
        String str = this.LIZLLL;
        boolean zLJJ = C497740JfY.LJJ();
        boolean z = this.LIZJ != null;
        int i2 = this.LJFF;
        C1110620f0W c1110620f0W = new C1110620f0W(context, bitmap, i, str, new C521100Kc8(z, true, false, true, false, false, zLJJ, 0, 0, i2, i2, this.LJII, 0, 0, 0, this.LJIIIIZZ, 0, this.LJ, null, false, false, false, 255783348));
        c1110620f0W.LJJLI = LJFF();
        return c1110620f0W;
    }

    public void LJII() {
        LIZJ().LJJL = 255;
    }

    public final void LJIIIZ() {
        ((ValueAnimator) LIZJ().LJJLIIIJILLIZJL.getValue()).start();
    }

    public InterfaceC1110610f0V LJFF() {
        return this.LJIIIZ;
    }

    public void LJIIIIZZ(InterfaceC1110610f0V interfaceC1110610f0V) {
        this.LJIIIZ = interfaceC1110610f0V;
    }

    public C1110560f0Q(Context context, Bitmap bitmap, String str, int i, int i2, int i3) {
        int iLIZ = C439101nJ.LIZ(2);
        int iLIZ2 = C439101nJ.LIZ(2);
        this.LIZIZ = context;
        this.LIZJ = bitmap;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = iLIZ;
        this.LJIIIIZZ = iLIZ2;
    }
}
