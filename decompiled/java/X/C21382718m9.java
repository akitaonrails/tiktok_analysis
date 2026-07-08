package X;

import Y.ARunnableS101S0200000_32;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.18m9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21382718m9 implements InterfaceC1015950cXp {
    public final /* synthetic */ C21382818mA LIZ;

    public C21382718m9(C21382818mA c21382818mA) {
        this.LIZ = c21382818mA;
    }

    @Override // X.InterfaceC1015950cXp
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C1100060ejU.LJFF(new ARunnableS101S0200000_32(bitmap, this, 54));
    }
}
