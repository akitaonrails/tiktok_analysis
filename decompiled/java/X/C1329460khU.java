package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0khU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329460khU {
    public final InterfaceC1329600khi LIZ;
    public C1323050kX9<Bitmap> LIZIZ;
    public List<C1323050kX9<Bitmap>> LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public final C1329440khS LIZ() {
        try {
            C1329440khS c1329440khS = new C1329440khS(this);
            C1323050kX9.LJII(this.LIZIZ);
            this.LIZIZ = null;
            C1323050kX9.LJI(this.LIZJ);
            this.LIZJ = null;
            return c1329440khS;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(this.LIZIZ);
            this.LIZIZ = null;
            C1323050kX9.LJI(this.LIZJ);
            this.LIZJ = null;
            throw th;
        }
    }

    public C1329460khU(InterfaceC1329600khi interfaceC1329600khi) {
        this.LIZ = interfaceC1329600khi;
    }
}
