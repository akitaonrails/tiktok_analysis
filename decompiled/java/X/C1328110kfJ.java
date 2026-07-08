package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

/* JADX INFO: renamed from: X.0kfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328110kfJ extends AbstractC1328490kfv {
    public C1328110kfJ(InterfaceC1330420kj2 interfaceC1330420kj2, int i, C1085640eME c1085640eME) {
        super(interfaceC1330420kj2, i, c1085640eME);
    }

    @Override // X.AbstractC1328490kfv
    public int LIZJ(int i, int i2, BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null && colorSpace.isWideGamut() && options.inPreferredConfig != Bitmap.Config.RGBA_F16) {
            return i * i2 * 8;
        }
        return i * i2 * C1327320ke2.LIZIZ(options.inPreferredConfig);
    }
}
