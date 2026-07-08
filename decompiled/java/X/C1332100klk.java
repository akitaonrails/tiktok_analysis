package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Map;

/* JADX INFO: renamed from: X.0klk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332100klk implements InterfaceC1331800klG {
    public int LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "MixEditingIconCropTransform";
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        this.LIZ = bitmap.getWidth();
        this.LIZIZ = bitmap.getHeight();
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int i = (int) (iMin / 1.2f);
        int i2 = (iMin - i) / 2;
        return ((C1331760klC) c0i7n).LIZIZ(Bitmap.createBitmap(bitmap, i2, i2, i, i, (Matrix) null, false));
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
        return LIZIZ(bitmap, c0i7n);
    }
}
