package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ecommerce.ug.datamerge.libra.EcPrefetchDataMergeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524200pla extends AbstractC1547260qMm {
    public final Map<String, EcPrefetchDataMergeConfig.EcPrefetchDataMergeModel> LL;

    public C1524200pla() {
        EcPrefetchDataMergeConfig.EcPrefetchDataMergeModel[] ecPrefetchDataMergeModelArr = EcPrefetchDataMergeConfig.LIZ;
        this.LL = EcPrefetchDataMergeConfig.LIZIZ;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (!C290090BYp.LIZ || str == null || a0.LJJJIL(str)) {
            return false;
        }
        for (String str2 : this.LL.keySet()) {
            if (str2 != null && !a0.LJJJIL(str2)) {
                Uri uriLJ = C1946007jm.LJ(str);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str;
                }
                if (a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(final SparkContext sparkContext, String str) {
        C1740060vNk.LIZ.getClass();
        PthreadTimer pthreadTimer = C1740060vNk.LIZJ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        C1740060vNk.LIZJ = new PthreadTimer("PrefetchDataMergeManager");
        final String str2 = sparkContext.containerId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ec_prefetch_data_merge_");
        sbLIZ.append(str2);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        sparkContext.LJJLIIIJ("1", "enable_prefetch_data_merge");
        sparkContext.LJJLIIIJ(strLIZIZ, "ec_prefetch_data_merge_event");
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0eca
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                if (C1095770ecZ.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    final SparkContext sparkContext2 = sparkContext;
                    final C1524200pla c1524200pla = this;
                    final String str3 = strLIZIZ;
                    final String str4 = str2;
                    c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0pun
                        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
                        @Override // com.lynx.tasm.LynxViewClient
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJIILJJIL() {
                            /*
                                Method dump skipped, instruction units count: 249
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1529910pun.LJIILJJIL():void");
                        }
                    });
                }
            }
        });
    }
}
