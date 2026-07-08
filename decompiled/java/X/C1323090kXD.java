package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0kXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323090kXD implements InterfaceC1290810jh9<Bitmap> {
    public static C1323090kXD LL;

    public static C1323090kXD LIZIZ() {
        if (LL == null) {
            synchronized (C1323090kXD.class) {
                try {
                    if (LL == null) {
                        LL = new C1323090kXD();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LL;
    }

    @Override // X.InterfaceC1290810jh9
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final void LIZ(Bitmap bitmap) {
        try {
            if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                synchronized (this) {
                    try {
                        bitmap.getAllocationByteCount();
                    } catch (NullPointerException e) {
                        TryCatchGuardChecker.doCheck(e);
                        bitmap.getByteCount();
                    }
                }
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HWClosableReleaser, release: t = ");
            sbLIZ.append(th);
            C1328570kg3.LIZIZ("debug_hw", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
