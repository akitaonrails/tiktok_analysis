package Y;

import X.C11NZ;
import X.C20441214yg;
import X.C2502409rK;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class AkS8S0010000_3 implements InterfaceC1487280oo2 {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS8S0010000_3(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final Object apply$0(AkS8S0010000_3 akS8S0010000_3, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load scaledBitmap");
        if (akS8S0010000_3.z0) {
            return C11NZ.LJIJJLI(new C2502409rK(bitmap, 3));
        }
        return C11NZ.LJJJJZ(bitmap);
    }

    public static final Object apply$1(AkS8S0010000_3 akS8S0010000_3, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load scaledBitmap");
        if (akS8S0010000_3.z0) {
            return C11NZ.LJIJJLI(new C2502409rK(bitmap, 7));
        }
        return C11NZ.LJJJJZ(bitmap);
    }
}
