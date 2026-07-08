package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Map;

/* JADX INFO: renamed from: X.0klD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331770klD implements InterfaceC1331800klG {
    public final int LIZ;

    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "ScaledMosaic-Transform";
    }

    public /* synthetic */ C1331770klD() {
        this(16);
    }

    public C1331770klD(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = this.LIZ;
        int i2 = width / i;
        int i3 = height / i;
        C1331760klC c1331760klC = (C1331760klC) c0i7n;
        C1331870klN c1331870klNLIZ = c1331760klC.LIZ(i, i, bitmap.getConfig());
        int i4 = this.LIZ;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.LIZ;
            for (int i7 = 0; i7 < i6; i7++) {
                c1331870klNLIZ.getBitmap().setPixel(i5, i7, bitmap.getPixel(i5 * i2, i7 * i3));
            }
        }
        Bitmap bitmap2 = c1331870klNLIZ.getBitmap();
        AbstractC1301670jyf abstractC1301670jyf = c1331760klC.LIZ;
        abstractC1301670jyf.getClass();
        AbstractC1301670jyf.LIZ(width, height);
        Matrix matrix = new Matrix();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        matrix.setScale(width / width2, height / height2);
        return new C1331870klN(abstractC1301670jyf.LJ(bitmap2, 0, 0, width2, height2, matrix, false));
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
        return LIZIZ(bitmap, c0i7n);
    }
}
