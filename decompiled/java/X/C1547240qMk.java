package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547240qMk extends AbstractC1538890q9H {
    @Override // X.AbstractC1538680q8w
    public final void LIZ(SparkContext sparkContext) {
        C1547250qMl.LIZ.getClass();
        C1547250qMl.LIZ(sparkContext);
    }

    @Override // X.AbstractC1538680q8w
    public final void LIZIZ(SparkContext sparkContext) {
        C1549830qQv.LIZ.getClass();
        C1549830qQv.LIZ(sparkContext);
    }

    @Override // X.AbstractC1538680q8w
    public final boolean LIZJ(Uri uri) {
        return LIZLLL(String.valueOf(uri));
    }

    @Override // X.AbstractC1538680q8w
    public final boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "target_handler");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "ecom", false)) {
            return false;
        }
        Iterator it2 = ((ArrayList) C13LP.LJLIL(((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LIZJ(str), Collections.singletonList(C1769860w9o.LL))).iterator();
        while (it2.hasNext()) {
            if (((ISparkRouterInterceptor) it2.next()).matchInterceptRules(str)) {
                return true;
            }
        }
        return false;
    }
}
