package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;

/* JADX INFO: renamed from: X.10Z7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z7 implements InterfaceC19271510aP {
    @Override // X.InterfaceC19271510aP
    public final String LIZ() {
        return "web";
    }

    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "schema_parse_handler";
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        QrCodeScanService qrCodeScanService = (QrCodeScanService) ServiceManager.get().getService(QrCodeScanService.class);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://reactnative/"))) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
                C0WOD.LIZ.getClass();
                if (C0WOD.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    C0WOD.LIZIZ(str);
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, str);
            smartRouteBuildRoute.withParam("sec_link_scene", "qrcode");
            smartRouteBuildRoute.withParam(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402669568"));
            smartRouteBuildRoute.withParam("need_sec_link", true);
            smartRouteBuildRoute.open();
            return true;
        }
        if ((TextUtils.isEmpty(str) || (!str.startsWith("snssdk1180") && !str.startsWith("snssdk1233") && !str.startsWith("snssdk473824") && !str.startsWith("snssdk567753"))) && !str.startsWith("snssdk259")) {
            return false;
        }
        qrCodeScanService.LJII(contextLIZ, str);
        return true;
    }
}
