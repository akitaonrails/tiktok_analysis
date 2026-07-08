package X;

import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0ktt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337150ktt implements InterfaceC1015950cXp {
    public final /* synthetic */ C1337210ktz LIZ;

    public C1337150ktt(C1337210ktz c1337210ktz) {
        this.LIZ = c1337210ktz;
    }

    @Override // X.InterfaceC1015950cXp
    public final void LIZ(Bitmap bitmap) {
        int i;
        if (bitmap == null) {
            return;
        }
        C1337210ktz c1337210ktz = this.LIZ;
        Context context = c1337210ktz.LL;
        float f = c1337210ktz.LLLZLZ;
        if (f > 0.0f) {
            i = (int) f;
        } else {
            i = 10;
        }
        C1100060ejU.LJFF(new ARunnableS89S0200000_20(this, C1100060ejU.LIZJ(i, context, bitmap), 197));
    }
}
