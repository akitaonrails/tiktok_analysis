package X;

import Y.ARunnableS81S0200000_12;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.1B3N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1B3N extends BaseActivity implements InterfaceC586170Myt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zio8LCEyPTEkJjHELIOS06MiBiCy4gLQx9cSESPTEkJj06MiAoByokCSY4IDk6PDw=";
    public String clientKey;
    public String defaultUriWithClientKey;
    public boolean isUserBanned;
    public String redirectUri;
    public static final C2198681B3i Companion = new Object() { // from class: X.1B3i
    };
    public static final int $stable = 8;

    private final C2344009Gk getBaseLoggingEventBuilder() {
        String string;
        C1B3Q c1b3q = C1B3Q.LIZ;
        String str = this.clientKey;
        if (str == null) {
            str = null;
        }
        String strLIZ = C2198601B3a.LIZ(INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent()));
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_aweme_params_caller_open_sdk_version")) == null) {
            string = "";
        }
        c1b3q.getClass();
        return C1B3Q.LIZ("", str, strLIZ, string, null, null, null, false);
    }

    private final void handleChildMode() {
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        c1397580mTM.LIZIZ(getResources().getString(2131826788));
        C985403tE.LIZ(c1397580mTM, new AwS613S0100000_34(this, 144));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    private final void openLoginPage() {
        String string;
        Bundle bundle = new Bundle();
        bundle.putBoolean("need_skip_restart", true);
        C786410Ut5.LJJJI("sdk_name", C2198601B3a.LIZ(INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent())), bundle);
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_aweme_params_caller_open_sdk_version")) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("sdk_version", string, bundle);
        C786410Ut5.LJLIIL(1500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(bundle, this, 147));
    }

    public final boolean isClientTTN() {
        String str = this.clientKey;
        if (str == null) {
            str = null;
        }
        return Intrinsics.LJFF(str, "awa59ufmg5y7ikht");
    }

    private final void handleLoginStatusCheck() {
        if (C0XQ7.LJFF() == null) {
            onLoginResult(-1);
            return;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
                handleChildMode();
                return;
            } else {
                onLoginResult(0);
                return;
            }
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        openLoginPage();
    }

    private final boolean isRequestComingFromWeb() {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        return Intrinsics.LJFF(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null ? bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_bytedance_params_source") : null, "web");
    }

    private final void navigateToNativeAuthorizedFragment() {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = new BaseI18nAuthorizedFragment();
            baseI18nAuthorizedFragment.setArguments(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            c19ehLJIIJ.LJIJ(R.id.iiv, baseI18nAuthorizedFragment, "native_authorize_fragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    private final void navigateToWebviewFragment() {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            SparkContext sparkContextCreateSparkContext = createSparkContext(composeWebviewAuthUrl(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
            SparkFragment sparkFragment = new SparkFragment();
            Bundle bundle = new Bundle();
            C905703gN.LIZ.getClass();
            C1041990dDp.LIZ.getClass();
            C1041990dDp.LIZJ(sparkContextCreateSparkContext);
            C786410Ut5.LJJJI("SparkContextContainerId", sparkContextCreateSparkContext.containerId, bundle);
            sparkFragment.setArguments(bundle);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, sparkFragment, null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    private final boolean shouldEnableWebviewAuth() {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getBoolean("key_qrcode_auth")) {
            return false;
        }
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        return !Intrinsics.LJFF(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 != null ? bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2.getString("_aweme_params_enter_from_flag") : null, "ENTER_FROM_INNER_WEB") && ((Boolean) AnonymousClass0770.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this);
        EventBus.LIZLLL().LJJI(this);
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void addIdentifierForChildMode(Intent intent) {
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier("third_party_app_identifier");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri.Builder composeWebviewAuthUrl(android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B3N.composeWebviewAuthUrl(android.os.Bundle):android.net.Uri$Builder");
    }

    private final SparkContext createSparkContext(Uri.Builder builder) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", builder.build().toString());
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(builderAppendQueryParameter.build().toString());
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.1B3t
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                if (interfaceC1531560pxS instanceof C1541480qDS) {
                    final C1B3N c1b3n = this.LLILLJJLI;
                    ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.1B3u
                        @Override // X.AbstractC2205961BVi
                        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                            String str = c1b3n.redirectUri;
                            String string = null;
                            if (str == null) {
                                str = null;
                            }
                            Uri url = webResourceRequest.getUrl();
                            if (url != null) {
                                string = url.toString();
                            }
                            if (string == null || !u.LJJIIJZLJL(string, str, false)) {
                                return false;
                            }
                            c1b3n.buildAndSendAuthResponseFromWebviewRedirect(string);
                            return true;
                        }
                    };
                }
            }
        });
        sparkContext.LJJJJZI(new C19336810kw(3));
        return sparkContext;
    }

    private final String hashPackageNameWithSha256(String str) {
        String strLIZIZ = "";
        for (byte b : MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    private final void onLoginResult(int i) {
        if (i != 0) {
            String str = this.clientKey;
            if (str == null) {
                str = null;
            }
            C1236610iHj.LIZIZ(str, "auth_client_page_login_fail", "10003", EnumC1236600iHi.AUTH_APP, EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
            sendFailureResponse(C1B3Y.LIZIZ(-30, EnumC2193681AtK.ACCESS_DENIED, null));
            return;
        }
        if (shouldEnableWebviewAuth()) {
            C20684815ws.LJIILLIIL("auth_open_webview", getBaseLoggingEventBuilder().LIZ);
            navigateToWebviewFragment();
        } else {
            navigateToNativeAuthorizedFragment();
        }
    }

    private final void sendFailureResponse(C1B3O c1b3o) {
        logAuthFailureResult(c1b3o.errorCode, c1b3o.errorMsg);
        sendResponse(c1b3o);
    }

    private final void sendResponseWithRedirectUrl(C1B3O c1b3o) throws Throwable {
        String string;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_bytedance_params_redirect_uri")) == null) {
            string = "";
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
        if (c1b3o.LIZ.length() > 0) {
            builderBuildUpon.appendQueryParameter("code", c1b3o.LIZ);
            builderBuildUpon.appendQueryParameter("scopes", c1b3o.LIZJ);
            String str = c1b3o.LIZIZ;
            if (str != null) {
                builderBuildUpon.appendQueryParameter("state", str);
            }
        } else {
            String str2 = c1b3o.LIZLLL;
            if (str2 != null) {
                builderBuildUpon.appendQueryParameter("error", str2);
            }
            builderBuildUpon.appendQueryParameter("errCode", String.valueOf(c1b3o.errorCode));
            String str3 = c1b3o.LJ;
            if (str3 != null) {
                builderBuildUpon.appendQueryParameter("error_description", str3);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(builderBuildUpon.build());
        C2429209fW.LIZ().appendDataFlowId(intent, 1207969290);
        addIdentifierForChildMode(intent);
        try {
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(this, intent);
            finish();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private final void sendResponseWithRequestPackageName(C1B3O c1b3o) throws Throwable {
        String string;
        String callingPackage = getCallingPackage();
        String strLJJIJIIJIL = null;
        if (callingPackage == null) {
            Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
            if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                callingPackage = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_bytedance_params_type_caller_package");
            } else {
                callingPackage = null;
            }
        }
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LIZ().getPackageName(), callingPackage)) {
            return;
        }
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 != null && (string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2.getString("_bytedance_params_from_entry")) != null) {
            strLJJIJIIJIL = string;
        } else {
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity != null) {
                strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(callingActivity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4ZpHPySYmE3cSt9He7GK+0DsJf3kxAMwe3chy/ujP7lm1ds7Be6FWqxA=", null));
            }
        }
        if (callingPackage != null && callingPackage.length() != 0 && strLJJIJIIJIL != null && strLJJIJIIJIL.length() != 0) {
            Bundle bundle = new Bundle();
            c1b3o.toBundle(bundle);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(callingPackage, strLJJIJIIJIL));
            intent.putExtras(bundle);
            addIdentifierForChildMode(intent);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207969289);
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(this, intent);
                finish();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void buildAndSendAuthResponseFromWebviewRedirect(String str) {
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "code");
        if (C703302op.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            sendResponse(new C1B3O(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "state"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "scopes"), null, null, null, 504));
        } else {
            C1B3O c1b3o = new C1B3O(null, null, null, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error_description"), null, 487);
            c1b3o.errorCode = -2;
            sendResponse(c1b3o);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        super.onConfigurationChanged(configuration);
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            i18nManagerServiceApiLIZ.LIZIZ(this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        boolean z;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        activityConfiguration(AFwS273S0000000_29.get$arr$(442));
        super.onCreate(bundle);
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("_bytedance_params_client_key")) == null) {
            string = "";
        }
        this.clientKey = string;
        C2344009Gk baseLoggingEventBuilder = getBaseLoggingEventBuilder();
        baseLoggingEventBuilder.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0, "is_login");
        baseLoggingEventBuilder.LJ(Boolean.valueOf(shouldEnableWebviewAuth()), "is_webview_auth");
        C20684815ws.LJIILLIIL("auth_init", baseLoggingEventBuilder.LIZ);
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 != null && bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2.getBoolean("key_qrcode_auth")) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            String str2 = this.clientKey;
            if (str2 == null) {
                str2 = null;
            }
            C1236610iHj.LIZIZ(str2, "auth_client_qrcode_start", "10000", EnumC1236600iHi.AUTH_APP, EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
        } else {
            String str3 = this.clientKey;
            if (str3 == null) {
                str3 = null;
            }
            C1236610iHj.LIZIZ(str3, "auth_client_deeplink_start", "10001", EnumC1236600iHi.AUTH_APP, EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
        }
        String str4 = this.clientKey;
        if (str4 == null) {
            str4 = null;
        }
        if (str4.length() == 0) {
            C1236610iHj.LIZIZ("", "auth_client_page_client_key_null", "10002", EnumC1236600iHi.AUTH_APP, EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
            finish();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str5 = this.clientKey;
        if (str5 != null) {
            str = str5;
        }
        sbLIZ.append(str);
        sbLIZ.append("://response.bridge.tiktok.com/oauth");
        this.defaultUriWithClientKey = C2188811AlT.LIZIZ(sbLIZ);
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            i18nManagerServiceApiLIZ.LIZIZ(this);
        }
        setContentView(R.layout.ic);
        handleLoginStatusCheck();
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    @C14EU
    public final void onUserBannedEvent(C0XKJ c0xkj) {
        this.isUserBanned = true;
    }

    public final void sendResponse(C1B3O c1b3o) {
        if (C2198601B3a.LIZ(INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent())).length() <= 0 && !isRequestComingFromWeb()) {
            sendResponseWithRequestPackageName(c1b3o);
        } else {
            sendResponseWithRedirectUrl(c1b3o);
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(C1B3N c1b3n, Intent intent) throws Throwable {
        C1701330uNH.LIZ(intent, c1b3n);
        C2204961BRm.e(c1b3n, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4ZpHPySYmE3cSt9He7GK+0DsJf3kxAMwe3chy/ujP7lm1ds7Be6FWqxA=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(C1B3N c1b3n, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c1b3n, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(c1b3n, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void logAuthFailureResult(int i, String str) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (!getIntent().hasExtra("pattern") || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "pattern")) == null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
        }
        C2344009Gk baseLoggingEventBuilder = getBaseLoggingEventBuilder();
        baseLoggingEventBuilder.getClass();
        baseLoggingEventBuilder.LJIIIIZZ("result", "fail");
        baseLoggingEventBuilder.LIZJ(0, "auto_auth");
        baseLoggingEventBuilder.LIZJ(i, "error_code");
        baseLoggingEventBuilder.LJIIIIZZ("error_message", str);
        if (C703302op.LIZ(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            baseLoggingEventBuilder.LJFF("pattern", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        }
        C20684815ws.LJIILLIIL("auth_result", baseLoggingEventBuilder.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && !shouldEnableWebviewAuth()) {
            Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("native_authorize_fragment");
            if (fragmentLJJJJZI != null && (fragmentLJJJJZI instanceof BaseI18nAuthorizedFragment)) {
                ((BaseI18nAuthorizedFragment) fragmentLJJJJZI).yS();
                return false;
            }
            finish();
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            if (i2 != -1 || this.isUserBanned) {
                onLoginResult(-1);
            }
        }
    }

    @Override // X.InterfaceC586170Myt
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (user == null) {
            return;
        }
        handleLoginStatusCheck();
    }
}
