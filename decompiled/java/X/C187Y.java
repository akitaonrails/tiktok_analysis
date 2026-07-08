package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS65S0001000_32;

/* JADX INFO: renamed from: X.187Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187Y {
    public static final C187Y LIZ = new C187Y();
    public static final Gson LIZIZ = new Gson();
    public static final Map<Integer, FlashSaleAtmosphereResource> LIZJ = new LinkedHashMap();

    public static String LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flash_sale_resource_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static FlashSaleAtmosphereResource LIZIZ(int i) {
        try {
            Map<Integer, FlashSaleAtmosphereResource> map = LIZJ;
            FlashSaleAtmosphereResource flashSaleAtmosphereResource = (FlashSaleAtmosphereResource) ((LinkedHashMap) map).get(Integer.valueOf(i));
            if (flashSaleAtmosphereResource != null) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                AwS65S0001000_32 awS65S0001000_32 = new AwS65S0001000_32(i, 3);
                c2341109Fh.getClass();
                C2341109Fh.LJFF(awS65S0001000_32);
                return flashSaleAtmosphereResource;
            }
            String string = Keva.getRepo("flash_sale_resource_cache").getString(LIZ(i), null);
            if (string != null && string.length() != 0) {
                FlashSaleAtmosphereResource flashSaleAtmosphereResource2 = (FlashSaleAtmosphereResource) LIZIZ.LJII(string, FlashSaleAtmosphereResource.class);
                map.put(Integer.valueOf(i), flashSaleAtmosphereResource2);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                AwS65S0001000_32 awS65S0001000_322 = new AwS65S0001000_32(i, 5);
                c2341109Fh2.getClass();
                C2341109Fh.LJFF(awS65S0001000_322);
                return flashSaleAtmosphereResource2;
            }
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            AwS65S0001000_32 awS65S0001000_323 = new AwS65S0001000_32(i, 4);
            c2341109Fh3.getClass();
            C2341109Fh.LIZIZ(awS65S0001000_323);
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh4 = C2341109Fh.LIZ;
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(e, 740);
            c2341109Fh4.getClass();
            C2341109Fh.LIZLLL(awS576S0100000_32);
            return null;
        }
    }

    public static void LIZJ(FlashSaleAtmosphereResource flashSaleAtmosphereResource) {
        List<String> list;
        if (flashSaleAtmosphereResource != null && flashSaleAtmosphereResource.tagImage != null && (list = flashSaleAtmosphereResource.backgroundGradientColors) != null && !list.isEmpty()) {
            try {
                Keva.getRepo("flash_sale_resource_cache").storeString(LIZ(5), LIZIZ.LJIILL(flashSaleAtmosphereResource));
                LIZJ.put(5, flashSaleAtmosphereResource);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                C020B c020b = new C020B(14);
                c2341109Fh.getClass();
                C2341109Fh.LJFF(c020b);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                C5182020e c5182020e = new C5182020e(e, 497);
                c2341109Fh2.getClass();
                C2341109Fh.LIZLLL(c5182020e);
                return;
            }
        }
        try {
            Keva.getRepo("flash_sale_resource_cache").erase(LIZ(5));
            LIZJ.remove(5);
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            C020B c020b2 = new C020B(13);
            c2341109Fh3.getClass();
            C2341109Fh.LJFF(c020b2);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2341109Fh c2341109Fh4 = C2341109Fh.LIZ;
            C5182020e c5182020e2 = new C5182020e(e2, 496);
            c2341109Fh4.getClass();
            C2341109Fh.LIZLLL(c5182020e2);
        }
    }
}
