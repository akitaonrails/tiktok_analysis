package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0f0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110570f0R extends C1110560f0Q {
    public C1110620f0W LJIIJ;
    public C1110620f0W LJIIJJI;
    public InterfaceC1110610f0V LJIIL;

    @Override // X.C1110560f0Q
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final C1110580f0S LJ() {
        Context context = this.LIZIZ;
        Bitmap bitmap = this.LIZJ;
        int i = this.LJI;
        String str = this.LIZLLL;
        boolean zLJJ = C497740JfY.LJJ();
        boolean z = this.LIZJ != null;
        int i2 = this.LJFF;
        C1110580f0S c1110580f0S = new C1110580f0S(context, bitmap, i, str, new C521100Kc8(z, true, false, true, false, false, zLJJ, 0, 0, i2, i2, 0, 0, 0, 0, 0, 0, this.LJ, null, false, false, false, 255850932));
        C1110620f0W c1110620f0W = this.LJIIJ;
        C1110620f0W c1110620f0W2 = null;
        if (c1110620f0W != null) {
            c1110620f0W.LJJLI = this.LJIIL;
        } else {
            c1110620f0W = null;
        }
        c1110580f0S.LJJLIIIJL = c1110620f0W;
        C1110620f0W c1110620f0W3 = this.LJIIJJI;
        if (c1110620f0W3 != null) {
            c1110620f0W3.LJJLI = this.LJIIL;
            c1110620f0W2 = c1110620f0W3;
        }
        c1110580f0S.LJJLIIIJLJLI = c1110620f0W2;
        return c1110580f0S;
    }

    @Override // X.C1110560f0Q
    public final void LJII() {
        LIZJ().LIZIZ = -1;
        C1110620f0W c1110620f0W = this.LJIIJ;
        if (c1110620f0W != null) {
            c1110620f0W.LJJL = 255;
        }
        C1110620f0W c1110620f0W2 = this.LJIIJJI;
        if (c1110620f0W2 != null) {
            c1110620f0W2.LJJL = 0;
        }
    }

    @Override // X.C1110560f0Q
    public final InterfaceC1110610f0V LJFF() {
        return this.LJIIL;
    }

    public C1110570f0R(Context context) {
        super(context, null, "", 0, 0, 0);
    }

    @Override // X.C1110560f0Q
    public final void LJIIIIZZ(InterfaceC1110610f0V interfaceC1110610f0V) {
        this.LJIIL = interfaceC1110610f0V;
        C1110620f0W c1110620f0W = this.LJIIJ;
        if (c1110620f0W != null) {
            c1110620f0W.LJJLI = interfaceC1110610f0V;
        }
        C1110620f0W c1110620f0W2 = this.LJIIJJI;
        if (c1110620f0W2 != null) {
            c1110620f0W2.LJJLI = interfaceC1110610f0V;
        }
    }

    public final void LJIIJ(InterfaceC1110610f0V interfaceC1110610f0V) {
        C1110580f0S c1110580f0S = (C1110580f0S) LIZJ();
        C1110620f0W c1110620f0W = c1110580f0S.LJJLIIIJL;
        if (c1110620f0W != null) {
            ((ValueAnimator) c1110620f0W.LJJLIIIJJIZ.getValue()).start();
        }
        C1110620f0W c1110620f0W2 = c1110580f0S.LJJLIIIJL;
        if (c1110620f0W2 != null) {
            c1110620f0W2.LJJLIIIIJ = new C1110600f0U(c1110580f0S, interfaceC1110610f0V);
        }
    }
}
