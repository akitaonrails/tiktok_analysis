package Y;

import X.C11NZ;
import X.C20441214yg;
import X.InterfaceC1478005qU;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class AkS0S0020001_3 implements InterfaceC1487280oo2 {
    public final int $t;
    public float f2;
    public boolean z0;
    public boolean z1;

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

    public static final Object apply$0(AkS0S0020001_3 akS0S0020001_3, Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load bitmapOrigin");
        if (Math.abs(akS0S0020001_3.f2) < 0.001f) {
            return C11NZ.LJJJJZ(bitmap);
        }
        final float width = akS0S0020001_3.f2 / bitmap.getWidth();
        final boolean z = akS0S0020001_3.z0;
        final boolean z2 = akS0S0020001_3.z1;
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.09mk
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Bitmap> c09aj) {
                float f;
                C1C7U.LIZ("LocalLottieBitmapAsset@1a0d.scale$1");
                try {
                    int width2 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    float f2 = width;
                    matrix.preScale(f2, f2);
                    float f3 = -1.0f;
                    if (z) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (!z2) {
                        f3 = 1.0f;
                    }
                    matrix.postScale(f, f3);
                    c09aj.onNext(Bitmap.createBitmap(bitmap, 0, 0, width2, height, matrix, false));
                    c09aj.onComplete();
                    C786410Ut5.LJJJJ(bitmap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onNext(bitmap);
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("LocalLottieBitmapAsset@1a0d.scale$1");
            }
        });
    }

    public static final Object apply$1(AkS0S0020001_3 akS0S0020001_3, Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "load bitmapOrigin");
        if (Math.abs(akS0S0020001_3.f2) < 0.001f) {
            return C11NZ.LJJJJZ(bitmap);
        }
        final float width = akS0S0020001_3.f2 / bitmap.getWidth();
        final boolean z = akS0S0020001_3.z0;
        final boolean z2 = akS0S0020001_3.z1;
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.09ml
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Bitmap> c09aj) {
                float f;
                C1C7U.LIZ("LocalLottieBitmapAsset@d70b.scale$1");
                try {
                    int width2 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    float f2 = width;
                    matrix.preScale(f2, f2);
                    float f3 = -1.0f;
                    if (z) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (!z2) {
                        f3 = 1.0f;
                    }
                    matrix.postScale(f, f3);
                    c09aj.onNext(Bitmap.createBitmap(bitmap, 0, 0, width2, height, matrix, false));
                    c09aj.onComplete();
                    C786410Ut5.LJJJJ(bitmap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onNext(bitmap);
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("LocalLottieBitmapAsset@d70b.scale$1");
            }
        });
    }

    public AkS0S0020001_3(float f, boolean z, boolean z2, int i) {
        this.$t = i;
        this.f2 = f;
        this.z0 = z;
        this.z1 = z2;
    }
}
