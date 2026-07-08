package X;

import Y.ARunnableS101S0200000_32;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.19JU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JU implements InterfaceC1015950cXp {
    public final /* synthetic */ C19JH LIZ;

    public C19JU(C19JH c19jh) {
        this.LIZ = c19jh;
    }

    @Override // X.InterfaceC1015950cXp
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            C19JH c19jh = this.LIZ;
            C1015690cXP c1015690cXP = c19jh.LLLLLJIL;
            if (c1015690cXP != null) {
                c1015690cXP.LIZ(c19jh);
                return;
            }
            return;
        }
        C19JH c19jh2 = this.LIZ;
        C1015690cXP c1015690cXP2 = c19jh2.LLLLLJIL;
        if (c1015690cXP2 != null) {
            c1015690cXP2.LIZJ(c19jh2);
        }
        C19JH c19jh3 = this.LIZ;
        if (c19jh3.LLJJLIIIJLLLLLLLZ) {
            Bitmap bitmapLIZJ = C1100060ejU.LIZJ((int) c19jh3.LLJJL, c19jh3.LL, bitmap);
            if (bitmapLIZJ != null) {
                C1100060ejU.LJFF(new ARunnableS101S0200000_32(bitmapLIZJ, this, 33));
                return;
            }
            return;
        }
        C1100060ejU.LJFF(new ARunnableS101S0200000_32(bitmap, this, 34));
    }
}
