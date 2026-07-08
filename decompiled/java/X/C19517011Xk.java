package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagTooltipConfig;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19517011Xk {
    public static final n LIZ = new n();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(476));

    public static EcShopBagTooltipConfig LIZ(String str) {
        Type type;
        String strLIZLLL = C12869051v.LIZLLL((n) LIZIZ.getValue(), str);
        if (strLIZLLL != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(EcShopBagTooltipConfig.class));
                } else {
                    type = new TypeToken<EcShopBagTooltipConfig>() { // from class: X.11Xl
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZLLL, type);
                if (!(objFromJson instanceof EcShopBagTooltipConfig)) {
                    objFromJson = null;
                }
                return (EcShopBagTooltipConfig) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
