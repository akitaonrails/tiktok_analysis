package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigData;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ygs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867240ygs extends AbstractC1869220yk4 {
    public static final C1867240ygs LIZIZ = new C1867240ygs();
    public static final EcomImageAdaptSizeConfigData LIZJ = new EcomImageAdaptSizeConfigData(null, null, 3, null);
    public static final List<AbstractC1869220yk4> LIZLLL = C1697810uHb.LJIIJJI(new AbstractC1869220yk4() { // from class: X.0ygr
        public static final EcomImageAdaptSizeConfigData LIZJ;

        static {
            EcomImageAdaptSizeConfigData ecomImageAdaptSizeConfigData = new EcomImageAdaptSizeConfigData(null, null, 3, null);
            EcomImageAdaptSizeConfigData ecomImageAdaptSizeConfigData2 = (EcomImageAdaptSizeConfigData) C0C64.LJIILLIIL().LJJII(EcomImageAdaptSizeConfigData.class, ecomImageAdaptSizeConfigData, "ecom_image_adapt_size_config_ext", true);
            if (ecomImageAdaptSizeConfigData2 != null) {
                ecomImageAdaptSizeConfigData = ecomImageAdaptSizeConfigData2;
            }
            LIZJ = ecomImageAdaptSizeConfigData;
        }

        @Override // X.AbstractC1869220yk4
        public final EcomImageAdaptSizeConfigData LIZ() {
            return LIZJ;
        }
    }, new AbstractC1869220yk4() { // from class: X.0ygq
        public static final EcomImageAdaptSizeConfigData LIZJ;

        static {
            EcomImageAdaptSizeConfigData ecomImageAdaptSizeConfigData = new EcomImageAdaptSizeConfigData(null, null, 3, null);
            EcomImageAdaptSizeConfigData ecomImageAdaptSizeConfigData2 = (EcomImageAdaptSizeConfigData) C0C64.LJIILLIIL().LJJII(EcomImageAdaptSizeConfigData.class, ecomImageAdaptSizeConfigData, "ecom_image_adapt_size_config_ext1", true);
            if (ecomImageAdaptSizeConfigData2 != null) {
                ecomImageAdaptSizeConfigData = ecomImageAdaptSizeConfigData2;
            }
            LIZJ = ecomImageAdaptSizeConfigData;
        }

        @Override // X.AbstractC1869220yk4
        public final EcomImageAdaptSizeConfigData LIZ() {
            return LIZJ;
        }
    });
    public static final LruCache<String, Boolean> LJ = new LruCache<>(50);
    public static final LruCache<String, EcomImageAdaptSizeConfigModel> LJFF = new LruCache<>(50);

    @Override // X.AbstractC1869220yk4
    public final EcomImageAdaptSizeConfigData LIZ() {
        return LIZJ;
    }
}
