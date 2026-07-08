package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartPreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.DiffCartParams;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0vR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742130vR5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(864));

    public static String LIZ() {
        try {
            CartPreloadConfig cartPreloadConfigLIZIZ = LIZIZ();
            Map<String, Object> map = cartPreloadConfigLIZIZ != null ? cartPreloadConfigLIZIZ.extraRequestParams : null;
            return String.valueOf(map != null ? map.get("biz_id") : null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "getBizId get Failed!");
            return null;
        }
    }

    public static CartPreloadConfig LIZIZ() {
        try {
            String string = ((Map) LIZ.getValue()).toString();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<CartPreloadConfig>() { // from class: X.0vR6
                }.getType() : C2371409Qy.LIZJ(C13LE.LJII(CartPreloadConfig.class)));
                if (!(objLJIIIIZZ instanceof CartPreloadConfig)) {
                    objLJIIIIZZ = null;
                }
                return (CartPreloadConfig) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "getCartPreloadConfig get Failed!");
            return null;
        }
    }

    public static DiffCartParams LIZJ() {
        try {
            String string = ((Map) LIZ.getValue()).toString();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<CartPreloadConfig>() { // from class: X.0vR7
                }.getType() : C2371409Qy.LIZJ(C13LE.LJII(CartPreloadConfig.class)));
                if (!(objLJIIIIZZ instanceof CartPreloadConfig)) {
                    objLJIIIIZZ = null;
                }
                CartPreloadConfig cartPreloadConfig = (CartPreloadConfig) objLJIIIIZZ;
                if (cartPreloadConfig != null) {
                    return cartPreloadConfig.diffCartParams;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "getDiffCartParams get Failed!");
            return null;
        }
    }
}
