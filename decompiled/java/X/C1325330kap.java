package X;

import Y.ARunnableS53S0300000_20;
import Y.ARunnableS85S0200000_16;
import android.graphics.Bitmap;
import android.view.View;

/* JADX INFO: renamed from: X.0kap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325330kap implements InterfaceC1338120kvS {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ C1325320kao LIZIZ;

    @Override // X.InterfaceC1338120kvS
    public final void onFailure() {
        C742060T8y.LIZ(new ARunnableS85S0200000_16(this.LIZIZ, this.LIZ, 76));
    }

    @Override // X.InterfaceC1338120kvS
    public final void LIZ(Bitmap bitmap) {
        C742060T8y.LIZ(new ARunnableS53S0300000_20(bitmap, this.LIZ, this.LIZIZ, 71));
    }

    public C1325330kap(View view, C1325320kao c1325320kao) {
        this.LIZ = view;
        this.LIZIZ = c1325320kao;
    }
}
