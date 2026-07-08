package X;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: renamed from: X.0uFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696790uFx implements InterfaceC1680820tqC {
    public final Bitmap LIZIZ;

    @Override // X.InterfaceC1680820tqC
    public final void LIZ() {
        this.LIZIZ.prepareToDraw();
    }

    @Override // X.InterfaceC1680820tqC
    public final int LIZIZ() {
        Bitmap.Config config = this.LIZIZ.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444 || Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    @Override // X.InterfaceC1680820tqC
    public final int getHeight() {
        return this.LIZIZ.getHeight();
    }

    @Override // X.InterfaceC1680820tqC
    public final int getWidth() {
        return this.LIZIZ.getWidth();
    }

    public C1696790uFx(Bitmap bitmap) {
        this.LIZIZ = bitmap;
    }
}
