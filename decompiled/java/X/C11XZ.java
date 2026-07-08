package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagCommonBubbleConfig;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XZ {
    public static final n LIZ = new n();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(475));

    public static EcShopBagCommonBubbleConfig LIZ(int i) {
        Type type;
        try {
            n nVarLJJIJ = ((n) LIZIZ.getValue()).LJJIJ(String.valueOf(i));
            if (nVarLJJIJ != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(EcShopBagCommonBubbleConfig.class));
                    } else {
                        type = new TypeToken<EcShopBagCommonBubbleConfig>() { // from class: X.11Xa
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVarLJJIJ, type);
                    if (!(objFromJson instanceof EcShopBagCommonBubbleConfig)) {
                        objFromJson = null;
                    }
                    return (EcShopBagCommonBubbleConfig) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return null;
    }
}
