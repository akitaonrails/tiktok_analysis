package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0z0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879390z0T extends AbstractC1893900zNs {
    @Override // X.AbstractC1893900zNs, X.InterfaceC19271510aP
    public final String LIZ() {
        return "";
    }

    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "incentive_redirect_handler";
    }

    public C1879390z0T(InterfaceC1879420z0W interfaceC1879420z0W) {
        super(interfaceC1879420z0W);
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        final Uri.Builder builderBuildUpon;
        Activity activityLIZIZ;
        Uri uriBuild;
        Uri uri;
        if (str != null && str.length() != 0 && a0.LJJIIZI(str, "ug/incentive/share", false)) {
            try {
                Uri uri2 = UriProtector.parse(str);
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "inc_target_url") == null) {
                    return true;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "inc_target_url");
                Uri uriBuild2 = null;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    builderBuildUpon = uri.buildUpon();
                } else {
                    builderBuildUpon = null;
                }
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri2);
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        if (builderBuildUpon != null) {
                            builderBuildUpon.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str2));
                        }
                    }
                }
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                    C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (builderBuildUpon != null) {
                        uriBuild2 = builderBuildUpon.build();
                    }
                    String strValueOf = String.valueOf(uriBuild2);
                    c1893790zNh.getClass();
                    C1893790zNh.LJIIJ("inc_activity_deep_link_start", strValueOf, linkedHashMap);
                    if (builderBuildUpon != null && (uriBuild = builderBuildUpon.build()) != null) {
                        C1878820yzY.LIZ.getClass();
                        if (C1878820yzY.LIZJ(uriBuild) && (activityLIZIZ instanceof C19EG)) {
                            C1878820yzY.LIZ(activityLIZIZ, uriBuild, false);
                            C1893790zNh.LJIIJ("inc_activity_deep_link_end", String.valueOf(builderBuildUpon.build()), C2097608Jq.LJIIJ(new Pair("is_success", "1")));
                            return true;
                        }
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZIZ, uriBuild.toString());
                        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0z0V
                            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                            public final void onSuccess(Intent intent) {
                                Uri uriBuild3;
                                C1893790zNh c1893790zNh2 = C1893790zNh.LIZ;
                                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_success", "1"));
                                Uri.Builder builder = builderBuildUpon;
                                if (builder != null) {
                                    uriBuild3 = builder.build();
                                } else {
                                    uriBuild3 = null;
                                }
                                String strValueOf2 = String.valueOf(uriBuild3);
                                c1893790zNh2.getClass();
                                C1893790zNh.LJIIJ("inc_activity_deep_link_end", strValueOf2, mapLJIIJ);
                            }

                            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                            public final void onFail(String str3, String str4) {
                                C1893790zNh c1893790zNh2 = C1893790zNh.LIZ;
                                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_success", CardStruct.IStatusCode.DEFAULT));
                                c1893790zNh2.getClass();
                                C1893790zNh.LJIIJ("inc_activity_deep_link_end", str3, mapLJIIJ);
                            }
                        });
                        smartRouteBuildRoute.open();
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService != null) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    iSpecActService.LJJIJIL(str, message);
                }
            }
        }
        return false;
    }
}
