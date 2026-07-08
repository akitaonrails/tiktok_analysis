package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Kro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530820Kro implements InterfaceC1290810jh9<Bitmap> {
    public static C530820Kro LL;

    public static C530820Kro LIZIZ() {
        if (LL == null) {
            LL = new C530820Kro();
        }
        return LL;
    }

    @Override // X.InterfaceC1290810jh9
    public final void LIZ(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
    }
}
