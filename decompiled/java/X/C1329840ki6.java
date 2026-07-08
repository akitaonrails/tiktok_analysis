package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0ki6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329840ki6 implements InterfaceC1329960kiI {
    public final C1329850ki7 LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final EnumC1329860ki8 LJFF;

    @Override // X.InterfaceC1329960kiI
    public final void dispose() {
    }

    @Override // X.InterfaceC1329960kiI
    public final int getXOffset() {
        return 0;
    }

    @Override // X.InterfaceC1329960kiI
    public final int getYOffset() {
        return 0;
    }

    @Override // X.InterfaceC1329960kiI
    public final int getHeight() {
        return this.LJ;
    }

    @Override // X.InterfaceC1329960kiI
    public final int getWidth() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1329960kiI
    public final void renderFrame(int i, int i2, Bitmap bitmap) {
        C1329850ki7 c1329850ki7 = this.LIZ;
        int i3 = this.LIZIZ;
        synchronized (c1329850ki7) {
            c1329850ki7.LIZ.setTime(i3);
            Bitmap bitmap2 = c1329850ki7.LIZLLL;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                c1329850ki7.LIZLLL = null;
            }
            if (c1329850ki7.LIZLLL != bitmap) {
                c1329850ki7.LIZLLL = bitmap;
                c1329850ki7.LIZJ.setBitmap(bitmap);
            }
            c1329850ki7.LIZIZ.LJ(i, i2);
            c1329850ki7.LIZJ.save();
            c1329850ki7.LIZJ.scale(c1329850ki7.LIZIZ.LIZJ(), c1329850ki7.LIZIZ.LIZJ());
            c1329850ki7.LIZ.draw(c1329850ki7.LIZJ, c1329850ki7.LIZIZ.LIZIZ(), c1329850ki7.LIZIZ.LIZLLL());
            c1329850ki7.LIZJ.restore();
        }
    }

    public C1329840ki6(C1329850ki7 c1329850ki7, int i, int i2, int i3, int i4, EnumC1329860ki8 enumC1329860ki8) {
        this.LIZ = c1329850ki7;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = enumC1329860ki8;
    }
}
