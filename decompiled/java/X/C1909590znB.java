package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.AwS112S1000000_28;

/* JADX INFO: renamed from: X.0znB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909590znB {
    public final QrCodeScanService LIZ = (QrCodeScanService) ServiceManager.get().getService(QrCodeScanService.class);

    public final void LIZ(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String securityUrl = this.LIZ.getSecurityUrl(str);
        if (context != null) {
            ServiceManager.get().getService(QrCodeScanService.class);
            C1893470zNB.LIZIZ.getClass();
            boolean z = false;
            if (((Boolean) C274860Apw.LIZ.getValue()).booleanValue() && ((Boolean) C287500BOq.LIZ.getValue()).booleanValue()) {
                securityUrl = (String) C01U6.LJ(new AwS112S1000000_28(securityUrl, 19), securityUrl);
            }
            Uri uri = UriProtector.parse(securityUrl);
            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_spark"), "1")) {
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                HashMap map = new HashMap();
                c1893790zNh.getClass();
                C1893790zNh.LJIIJ("inc_activity_deep_link_start", securityUrl, map);
                if (securityUrl.startsWith("http")) {
                    try {
                        strConcat = "aweme://webview?url=" + URLEncoder.encode(securityUrl, "UTF-8");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strConcat = "aweme://webview?url=".concat(securityUrl);
                    }
                } else {
                    strConcat = securityUrl;
                }
                try {
                    if (Objects.equals(UriProtector.parse(strConcat).getHost(), "webview")) {
                        String host = uri.getHost();
                        if ((host != null && host.contains("lynxview")) || TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hybrid_sdk_version"), "bullet")) {
                            z = true;
                        }
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("need_sec_link", "1", bundle);
                        C786410Ut5.LJJJI("sec_link_scene", "qrcode", bundle);
                        C2429209fW.LIZ().appendDataFlowId(bundle, "402669568");
                        IHybridKitService iHybridKitService = (IHybridKitService) ServiceManager.get().getService(IHybridKitService.class);
                        if (z) {
                            str2 = null;
                        } else {
                            str2 = "crossPlatform";
                        }
                        iHybridKitService.LJIL(context, strConcat, str2, bundle, new ThirdPartyBizCert(402669568));
                        C1893790zNh c1893790zNh2 = C1893790zNh.LIZ;
                        HashMap map2 = new HashMap();
                        c1893790zNh2.getClass();
                        C1893790zNh.LJIIJ("inc_activity_deep_link_end", securityUrl, map2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            C1893790zNh c1893790zNh3 = C1893790zNh.LIZ;
            HashMap map3 = new HashMap();
            c1893790zNh3.getClass();
            C1893790zNh.LJIIJ("inc_activity_deep_link_start", securityUrl, map3);
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("show_load_dialog", true);
            bundle2.putBoolean("show_not_official_content_warning", false);
            bundle2.putBoolean("hide_nav_bar", false);
            bundle2.putBoolean("use_webview_title", true);
            bundle2.putBoolean("safeTemplate", true);
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "qr_code");
            intent.putExtra("need_sec_link", true);
            intent.putExtra("sec_link_scene", "qrcode");
            intent.putExtra("need_detect_2_jump", true);
            C2429209fW.LIZ().appendDataFlowId(bundle2, "402669568");
            intent.putExtras(bundle2);
            intent.setData(UriProtector.parse(securityUrl));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxwYXemD0rlH0bI4SvUoB07ACTarEAATvOZDwwdM6at3QcKtw==", null));
            C1893790zNh.LJIIJ("inc_activity_deep_link_end", securityUrl, new HashMap());
        }
    }
}
