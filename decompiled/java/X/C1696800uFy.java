package X;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: renamed from: X.0uFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696800uFy {
    public static final Bitmap LIZ(InterfaceC1680820tqC interfaceC1680820tqC) {
        if (interfaceC1680820tqC instanceof C1696790uFx) {
            return ((C1696790uFx) interfaceC1680820tqC).LIZIZ;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config LIZIZ(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i == 3) {
                return Bitmap.Config.RGBA_F16;
            }
            if (i == 4) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }
}
