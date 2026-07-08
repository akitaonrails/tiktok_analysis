package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0kgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328780kgO extends AbstractC1330070kiT<Bitmap> implements InterfaceC1330420kj2 {
    @Override // X.AbstractC1330070kiT
    public final int LJIIIIZZ(int i) {
        return i;
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.AbstractC1330070kiT
    public final Bitmap LIZIZ(int i) {
        try {
            C20601085f.LIZIZ = i;
            C20601085f.LIZ = C786410Ut5.u3().getName();
            return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    @Override // X.AbstractC1330070kiT
    public final void LJFF(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIIZ(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // X.AbstractC1330070kiT
    public final Bitmap LJIIJJI(C1330080kiU<Bitmap> c1330080kiU) {
        Bitmap bitmap = (Bitmap) super.LJIIJJI(c1330080kiU);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // X.AbstractC1330070kiT
    public final boolean LJIILIIL(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        if (!bitmap2.isRecycled() && bitmap2.isMutable()) {
            return true;
        }
        return false;
    }

    public C1328780kgO(InterfaceC1328250kfX interfaceC1328250kfX, C1329300khE c1329300khE, C1330500kjA c1330500kjA) {
        super(interfaceC1328250kfX, c1329300khE, c1330500kjA);
        interfaceC1328250kfX.LIZ(this);
        c1330500kjA.LIZJ();
    }
}
