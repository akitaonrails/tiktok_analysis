package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC447090Hg3 extends C0HWE<C1323050kX9<AbstractC1327750kej>> {
    public abstract void LJI(Bitmap bitmap);

    @Override // X.C0HWE
    public void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        Bitmap underlyingBitmap;
        if (!interfaceC1320200kSY.LIZ()) {
            return;
        }
        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
        if (result != null && (result.get() instanceof AbstractC1325130kaV)) {
            underlyingBitmap = ((AbstractC1325130kaV) result.get()).getUnderlyingBitmap();
        } else {
            underlyingBitmap = null;
        }
        try {
            LJI(underlyingBitmap);
            C1323050kX9.LJII(result);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(result);
            throw th;
        }
    }
}
