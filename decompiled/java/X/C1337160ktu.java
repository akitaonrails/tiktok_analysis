package X;

import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: X.0ktu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337160ktu implements InterfaceC1015950cXp {
    public final /* synthetic */ C1337210ktz LIZ;

    public C1337160ktu(C1337210ktz c1337210ktz) {
        this.LIZ = c1337210ktz;
    }

    @Override // X.InterfaceC1015950cXp
    public final void LIZ(Bitmap bitmap) {
        int i;
        if (bitmap == null) {
            C1337210ktz c1337210ktz = this.LIZ;
            C1015690cXP c1015690cXP = c1337210ktz.LLLLLJIL;
            if (c1015690cXP != null) {
                c1015690cXP.LIZ(c1337210ktz);
                return;
            }
            return;
        }
        C1337210ktz c1337210ktz2 = this.LIZ;
        C1015690cXP c1015690cXP2 = c1337210ktz2.LLLLLJIL;
        if (c1015690cXP2 != null) {
            c1015690cXP2.LIZJ(c1337210ktz2);
        }
        C1337210ktz c1337210ktz3 = this.LIZ;
        Bitmap bitmapLIZJ = C1100060ejU.LIZJ((int) c1337210ktz3.LLLZLL, c1337210ktz3.LL, bitmap);
        if (bitmapLIZJ != null) {
            C1100060ejU.LJFF(new ARunnableS89S0200000_20(this, bitmapLIZJ, 195));
        }
        C1337210ktz c1337210ktz4 = this.LIZ;
        if (c1337210ktz4.LLLZIL || c1337210ktz4.LLLZLZ > 0.0f) {
            Context context = c1337210ktz4.LL;
            float f = c1337210ktz4.LLLZLZ;
            if (f > 0.0f) {
                i = (int) f;
            } else {
                i = 10;
            }
            Bitmap bitmapLIZJ2 = C1100060ejU.LIZJ(i, context, bitmap);
            if (bitmapLIZJ2 != null) {
                C1100060ejU.LJFF(new ARunnableS89S0200000_20(this, new BitmapDrawable(this.LIZ.LL.getResources(), bitmapLIZJ2), 196));
            }
        }
    }
}
