package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0khT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329450khT {
    public int LIZ;
    public long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C1329480khW LJ;

    public final synchronized int LIZIZ() {
        return this.LIZ;
    }

    public final synchronized int LIZJ() {
        return this.LIZJ;
    }

    public final synchronized int LIZLLL() {
        return this.LIZLLL;
    }

    public final synchronized long LJ() {
        return this.LIZIZ;
    }

    public final synchronized void LIZ(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int iLIZJ = C1327320ke2.LIZJ(bitmap);
        if (this.LIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("No bitmaps registered.", z);
        long j = iLIZJ;
        if (j <= this.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(iLIZJ), Long.valueOf(this.LIZIZ)};
        if (z2) {
            this.LIZIZ -= j;
            this.LIZ--;
        } else {
            throw new IllegalArgumentException(C1322350kW1.LJI("Bitmap size bigger than the total registered size: %d, %d", objArr));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0khW] */
    public C1329450khT(int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        C1322350kW1.LIZIZ(i2 > 0);
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = new InterfaceC1290810jh9<Bitmap>() { // from class: X.0khW
            @Override // X.InterfaceC1290810jh9
            public final void LIZ(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                try {
                    this.LL.LIZ(bitmap2);
                    bitmap2.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    bitmap2.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    throw th;
                }
            }
        };
    }
}
