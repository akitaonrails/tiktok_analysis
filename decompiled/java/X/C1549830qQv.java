package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.ECommerceThirdPartyHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;

/* JADX INFO: renamed from: X.0qQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549830qQv {
    public static final C1549830qQv LIZ = new C1549830qQv();

    public static void LIZ(SparkContext sparkContext) {
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        IECommerceThirdPartyHybridService iECommerceThirdPartyHybridService;
        boolean z;
        String name;
        String strLJIJI = sparkContext.LJIJI();
        sparkContext.LJJLIIJ(C1943307jL.LIZ(UriProtector.parse(strLJIJI), "aweme").toString());
        EnumC992703uP enumC992703uP = EnumC992703uP.ECOMMERCE_THIRD_PARTY;
        sparkContext.bizCert = new ThirdPartyBizCert(CastIntegerProtector.parseInt(enumC992703uP.getValue()));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IComplianceDependencyService.class.getName();
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
        }
        sparkContext.LJJJJL(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(sparkContext.bundle, enumC992703uP));
        Object objLIZ = C04TD.LIZ(IECommerceThirdPartyHybridService.class, false);
        if (objLIZ != null) {
            iECommerceThirdPartyHybridService = (IECommerceThirdPartyHybridService) objLIZ;
        } else {
            if (C04TD.LLLZL == null) {
                synchronized (IECommerceThirdPartyHybridService.class) {
                    if (C04TD.LLLZL == null) {
                        C04TD.LLLZL = new ECommerceThirdPartyHybridServiceImpl();
                    }
                }
            }
            iECommerceThirdPartyHybridService = C04TD.LLLZL;
        }
        for (IThirdPartySparkRouterInterceptor iThirdPartySparkRouterInterceptor : iECommerceThirdPartyHybridService.LIZ(strLJIJI)) {
            if (iThirdPartySparkRouterInterceptor.matchInterceptRules(strLJIJI)) {
                iThirdPartySparkRouterInterceptor.handleSparkContext(sparkContext, strLJIJI);
            }
        }
    }
}
