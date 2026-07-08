package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547760qNa {
    public static boolean LIZ;

    public static final void LIZJ() {
        if (LIZ) {
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AbstractC1538890q9H abstractC1538890q9H = new AbstractC1538890q9H() { // from class: X.0qNb
            @Override // X.AbstractC1538680q8w
            public final void LIZ(SparkContext sparkContext) {
                ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).GJ0(sparkContext);
            }

            @Override // X.AbstractC1538680q8w
            public final boolean LIZLLL(String str) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                if (str == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "__live_platform__")) == null) {
                    return false;
                }
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.equals("webcast");
            }
        };
        c1537900q7g.getClass();
        C1541950qED.LJ.add(abstractC1538890q9H);
        C1537900q7g.LJIIIIZZ(new AbstractC1538690q8x() { // from class: X.0qNc
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "webcast";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext, String str) {
                super.LJ(sparkContext, str);
                ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).GJ0(sparkContext);
            }

            @Override // X.AbstractC1538690q8x
            public final void LJFF(SparkContext sparkContext, String str) {
                super.LJFF(sparkContext, str);
                ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).Cw(sparkContext);
            }
        });
        C1537900q7g.LJIIIIZZ(new AbstractC1538690q8x() { // from class: X.0qNd
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "Live_PCS";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext, String str) {
                super.LJ(sparkContext, str);
                ((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).mc0(sparkContext);
            }
        });
        LIZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(android.net.Uri r10) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1547760qNa.LIZ(android.net.Uri):java.lang.String");
    }

    public static final String LIZIZ(String str) {
        String strZF0;
        boolean z;
        try {
            if (((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).ki(str)) {
                strZF0 = ((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).zF0(str);
            } else {
                strZF0 = str;
            }
            Uri uri = UriProtector.parse(strZF0);
            boolean z2 = false;
            if (TextUtils.equals(uri.getHost(), "webcast_lynxview") || TextUtils.equals(uri.getHost(), "webcast_webview") || TextUtils.equals(uri.getHost(), "webcast_lynxview_popup") || TextUtils.equals(uri.getHost(), "webcast_webview_popup")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (TextUtils.equals(uri.getHost(), "webcast_lynxview_card") || TextUtils.equals(uri.getHost(), "webcast_webview_card")) {
                    z2 = true;
                }
                if (!z2) {
                    return strZF0;
                }
            }
            String strLIZ = LIZ(uri);
            if (strLIZ != null) {
                return strLIZ;
            }
            return strZF0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
