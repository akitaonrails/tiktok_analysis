package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.bean.OrderCenterGuideData;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0w4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766680w4g {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(OrderCenterGuideData orderCenterGuideData) {
        String str;
        if (orderCenterGuideData == null) {
            str = null;
        } else {
            try {
                str = orderCenterGuideData.buttonJumpSchema;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }
        if (C123100dR.LIZ(str)) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "mall_extra_info");
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return null;
    }

    public static Map LIZIZ(String str) {
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (C123100dR.LIZ(str)) {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0w4i
            }.getType();
            c1227904rF.getClass();
            return (Map) C1227904rF.LIZJ(str, type);
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return C2097608Jq.LJ();
    }
}
