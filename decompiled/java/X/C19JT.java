package X;

import Y.ARunnableS101S0200000_32;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.19JT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JT implements InterfaceC1015950cXp {
    public final /* synthetic */ C19JK LIZ;

    public C19JT(C19JK c19jk) {
        this.LIZ = c19jk;
    }

    @Override // X.InterfaceC1015950cXp
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            C19JK c19jk = this.LIZ;
            C1015690cXP c1015690cXP = c19jk.LLLLLJIL;
            if (c1015690cXP != null) {
                c1015690cXP.LIZ(c19jk);
                return;
            }
            return;
        }
        C19JK c19jk2 = this.LIZ;
        C1015690cXP c1015690cXP2 = c19jk2.LLLLLJIL;
        if (c1015690cXP2 != null) {
            c1015690cXP2.LIZJ(c19jk2);
        }
        C19JK c19jk3 = this.LIZ;
        Bitmap bitmapLIZJ = C1100060ejU.LIZJ((int) c19jk3.LLJJL, c19jk3.LL, bitmap);
        if (bitmapLIZJ != null) {
            C1100060ejU.LJFF(new ARunnableS101S0200000_32(bitmapLIZJ, this, 56));
        }
    }
}
