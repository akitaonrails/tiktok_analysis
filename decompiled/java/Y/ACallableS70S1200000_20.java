package Y;

import X.C1292000jj4;
import X.C1294250jmh;
import X.C1323050kX9;
import X.C1325120kaU;
import X.C1328060kfE;
import X.C1328130kfL;
import X.C1329340khI;
import X.C1C7U;
import X.C592490NLr;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS70S1200000_20 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS70S1200000_20 aCallableS70S1200000_20) {
        Context context = (Context) aCallableS70S1200000_20.l1;
        ZipInputStream zipInputStream = (ZipInputStream) aCallableS70S1200000_20.l2;
        String str = aCallableS70S1200000_20.s0;
        C1C7U.LIZ("LottieCompositionFactory@f22f.fromZipStream$1L");
        C1292000jj4 c1292000jj4LJIILJJIL = C1294250jmh.LJIILJJIL(context, zipInputStream, str);
        C1C7U.LIZIZ("LottieCompositionFactory@f22f.fromZipStream$1L");
        return c1292000jj4LJIILJJIL;
    }

    public static final Object call$1(ACallableS70S1200000_20 aCallableS70S1200000_20) {
        C1C7U.LIZ("BitmapCacheManager@cc63.addCache$2");
        if (((C1323050kX9) aCallableS70S1200000_20.l1).LJIILLIIL()) {
            C1323050kX9<Bitmap> c1323050kX9LIZJ = C1328130kfL.LJIILIIL().LJIILLIIL().LIZJ((Bitmap) ((C1323050kX9) aCallableS70S1200000_20.l1).get());
            C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(c1323050kX9LIZJ, C1328060kfE.LIZLLL, 0));
            C1323050kX9 c1323050kX9LJFF = ((C1329340khI) aCallableS70S1200000_20.l2).LIZ.LJFF(new C592490NLr(aCallableS70S1200000_20.s0), c1323050kX9LJIJJLI, null);
            C1323050kX9.LJII(c1323050kX9LIZJ);
            C1323050kX9.LJII(c1323050kX9LJFF);
            C1323050kX9.LJII(c1323050kX9LJIJJLI);
        }
        C1C7U.LIZIZ("BitmapCacheManager@cc63.addCache$2");
        return null;
    }

    public ACallableS70S1200000_20(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
