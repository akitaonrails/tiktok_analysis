package Y;

import X.C20085613iQ;
import android.hardware.Camera;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public class AComparatorS0S0000001_20 implements Comparator {
    public final int $t;
    public float f0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS0S0000001_20(float f, int i) {
        this.$t = i;
        this.f0 = f;
    }

    public static final int compare$0(AComparatorS0S0000001_20 aComparatorS0S0000001_20, Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return C20085613iQ.LIZIZ(Float.valueOf(Math.abs((size.width / size.height) - aComparatorS0S0000001_20.f0)), Float.valueOf(Math.abs((size2.width / size2.height) - aComparatorS0S0000001_20.f0)));
    }

    public static final int compare$1(AComparatorS0S0000001_20 aComparatorS0S0000001_20, Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return C20085613iQ.LIZIZ(Float.valueOf(Math.abs((size.width / size.height) - aComparatorS0S0000001_20.f0)), Float.valueOf(Math.abs((size2.width / size2.height) - aComparatorS0S0000001_20.f0)));
    }

    public static final int compare$2(AComparatorS0S0000001_20 aComparatorS0S0000001_20, Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return C20085613iQ.LIZIZ(Float.valueOf(Math.abs((size.width / size.height) - aComparatorS0S0000001_20.f0)), Float.valueOf(Math.abs((size2.width / size2.height) - aComparatorS0S0000001_20.f0)));
    }

    public static final int compare$3(AComparatorS0S0000001_20 aComparatorS0S0000001_20, Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return C20085613iQ.LIZIZ(Float.valueOf(Math.abs((size.width / size.height) - aComparatorS0S0000001_20.f0)), Float.valueOf(Math.abs((size2.width / size2.height) - aComparatorS0S0000001_20.f0)));
    }
}
