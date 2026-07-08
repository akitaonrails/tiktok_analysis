package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1290140jg4 extends C0HWE<C1323050kX9<AbstractC1327750kej>> {
    public abstract void LJI(C1323050kX9<Bitmap> c1323050kX9);

    @Override // X.C0HWE
    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        C1323050kX9<Bitmap> c1323050kX9CloneUnderlyingBitmapReference;
        if (!interfaceC1320200kSY.LIZ()) {
            return;
        }
        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
        if (result != null && (result.get() instanceof C1325120kaU)) {
            c1323050kX9CloneUnderlyingBitmapReference = ((C1325120kaU) result.get()).cloneUnderlyingBitmapReference();
        } else {
            c1323050kX9CloneUnderlyingBitmapReference = null;
        }
        try {
            LJI(c1323050kX9CloneUnderlyingBitmapReference);
            C1323050kX9.LJII(c1323050kX9CloneUnderlyingBitmapReference);
            C1323050kX9.LJII(result);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9CloneUnderlyingBitmapReference);
            C1323050kX9.LJII(result);
            throw th;
        }
    }
}
