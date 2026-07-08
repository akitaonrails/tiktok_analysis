package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0sTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628260sTQ extends AbstractC447090Hg3 {
    public final /* synthetic */ C1630020sWG LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        this.LIZ.LLLLIL().LJIIJ.LIZ(new C07WZ(this.LIZIZ));
    }

    @Override // X.AbstractC447090Hg3
    public final void LJI(Bitmap bitmap) {
        InterfaceC1875007Wa c1973007o8;
        if (((Boolean) this.LIZ.LLLFFI.getValue()).booleanValue() && bitmap == null) {
            c1973007o8 = new C07WZ(this.LIZIZ);
        } else {
            c1973007o8 = new C1973007o8(bitmap, this.LIZIZ);
        }
        this.LIZ.LLLLIL().LJIIJ.LIZ(c1973007o8);
    }

    public C1628260sTQ(C1630020sWG c1630020sWG, String str) {
        this.LIZ = c1630020sWG;
        this.LIZIZ = str;
    }
}
