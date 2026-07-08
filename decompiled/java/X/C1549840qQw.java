package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549840qQw implements InterfaceC2217701Bqy, InterfaceC2217711Bqz, InterfaceC1164530gPT {
    public WeakReference<InterfaceC1546650qLn> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public View LLILZIL;
    public boolean LLILZLL;
    public WeakReference<WebKitView> LLIZ;

    @Override // X.InterfaceC2217701Bqy
    public final Context LIZJ(Context context) {
        return context;
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJ() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJI() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJII() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIIL() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIJI() {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJIL(Activity activity, Context context) {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJ() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIJIIJI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJIJIL() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJJ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJLL(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJZI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJLIIIIJ() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
        return false;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLJLI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLL(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void finish() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1163130gND
    public final void release() {
    }

    public final void LJIJ() {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_hybrid_container_intercept_back", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_hybrid_intercept_open_url", this);
        }
    }

    public final void LIZ(InterfaceC1546650qLn interfaceC1546650qLn) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        String strLJIJI;
        this.LL = new WeakReference<>(interfaceC1546650qLn);
        SparkContext sparkContextLLIILZL = interfaceC1546650qLn.LLIILZL();
        InterfaceC1541990qEH interfaceC1541990qEH = null;
        if (sparkContextLLIILZL != null) {
            interfaceC1541990qEHLJIJJ = sparkContextLLIILZL.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (interfaceC1541990qEHLJIJJ instanceof WebKitView) {
            interfaceC1541990qEH = interfaceC1541990qEHLJIJJ;
        }
        this.LLIZ = new WeakReference<>(interfaceC1541990qEH);
        this.LLILZLL = false;
        SparkContext sparkContextLLIILZL2 = interfaceC1546650qLn.LLIILZL();
        if (sparkContextLLIILZL2 != null && (strLJIJI = sparkContextLLIILZL2.LJIJI()) != null) {
            this.LLILLL = strLJIJI;
            this.LLILZ = UriProtector.parse(strLJIJI).getHost();
            this.LLILLJJLI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "back_open_url");
        }
        SparkContext sparkContextLLIILZL3 = interfaceC1546650qLn.LLIILZL();
        if (sparkContextLLIILZL3 != null) {
            sparkContextLLIILZL3.LJJJJZI(new C1554520qYU(this, 1));
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_hybrid_container_intercept_back", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_hybrid_intercept_open_url", this);
        }
    }

    public final void LIZIZ(SparkFragment sparkFragment) {
        View viewE1;
        InterfaceC1541990qEH kitView;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tiktokec_payment_blank_detect", false)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                viewE1 = kitView.e1();
            } else {
                viewE1 = null;
            }
            this.LLILZIL = viewE1;
            if (viewE1 != null) {
                InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                C1521250pgp c1521250pgpBuildConfig = webViewMonitorHelper.buildConfig();
                c1521250pgpBuildConfig.LJFF = "ecom_payment";
                c1521250pgpBuildConfig.LIZIZ = new String[]{String.valueOf(viewE1.hashCode())};
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0qR0
                    public Long LIZ;

                    @Override // X.InterfaceC1521890phr
                    public final void LIZ(long j) {
                        this.LIZ = Long.valueOf(j);
                    }

                    @Override // X.InterfaceC1521890phr
                    public final void LIZIZ(int i, View view) {
                        boolean z = true;
                        if (i != 1) {
                            z = false;
                        }
                        C1549840qQw c1549840qQw = this.LIZIZ;
                        C03WD.LIZIZ(Boolean.valueOf(z), c1549840qQw.LLILLL, c1549840qQw.LLILZ, this.LIZ);
                    }
                };
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJIILLIIL(boolean z) {
        String str;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        WebKitView webKitView;
        String url;
        Uri uri;
        InterfaceC1546650qLn interfaceC1546650qLn;
        SparkFragment sparkFragment;
        if (!this.LLILZLL && (str = this.LLILLJJLI) != null && str.length() > 0) {
            WeakReference<InterfaceC1546650qLn> weakReference = this.LL;
            Context context = null;
            if (weakReference != null && weakReference.get() != null) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ecom_preload_fix", true)) {
                    try {
                        WeakReference<WebKitView> weakReference2 = this.LLIZ;
                        if (weakReference2 != null && (webKitView = weakReference2.get()) != null && (url = webKitView.getUrl()) != null && (uri = UriProtector.parse(url)) != null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "not_open_back_url");
                        } else {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        }
                        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                            return;
                        } else {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                WeakReference<InterfaceC1546650qLn> weakReference3 = this.LL;
                if (weakReference3 != null && (interfaceC1546650qLn = weakReference3.get()) != null && (sparkFragment = interfaceC1546650qLn.getSparkFragment()) != null) {
                    context = sparkFragment.getContext();
                }
                if (Intrinsics.LJFF(str, "aweme://ec/pay_result")) {
                    if (z) {
                        SmartRouter.buildRoute(context, str).open();
                        return;
                    }
                    return;
                }
                SmartRouter.buildRoute(context, str).open();
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        LJIJ();
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
        LJIJ();
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
        SparkFragment sparkFragment = interfaceC1546650qLn.getSparkFragment();
        if (sparkFragment == null) {
            return;
        }
        LIZIZ(sparkFragment);
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
        SparkFragment sparkFragment = sparkActivity.LLJILJIL;
        if (sparkFragment == null) {
            return;
        }
        LIZIZ(sparkFragment);
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJLIIIJLJLI(InterfaceC1546650qLn interfaceC1546650qLn) {
        LIZ(interfaceC1546650qLn);
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        LIZ(sparkActivity);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        InterfaceC1546650qLn interfaceC1546650qLn;
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext originalSparkContext;
        InterfaceC1546650qLn interfaceC1546650qLn2;
        SparkContext sparkContextLLIILZL;
        try {
            WeakReference<InterfaceC1546650qLn> weakReference = this.LL;
            String str4 = null;
            if (weakReference != null && weakReference.get() != null) {
                if (Intrinsics.LJFF(str, "ec_hybrid_container_intercept_back")) {
                    if (str2.length() > 0) {
                        String strOptString = new JSONObject(str2).optString("react_id");
                        WeakReference<InterfaceC1546650qLn> weakReference2 = this.LL;
                        if (weakReference2 != null && (interfaceC1546650qLn2 = weakReference2.get()) != null && (sparkContextLLIILZL = interfaceC1546650qLn2.LLIILZL()) != null) {
                            str3 = sparkContextLLIILZL.containerId;
                        } else {
                            str3 = null;
                        }
                        if (!Intrinsics.LJFF(str3, strOptString)) {
                            SettingsManager.LIZLLL().getClass();
                            if (SettingsManager.LIZ("ecom_preload_fix", true)) {
                                WeakReference<InterfaceC1546650qLn> weakReference3 = this.LL;
                                if (weakReference3 != null && (interfaceC1546650qLn = weakReference3.get()) != null && (sparkFragment = interfaceC1546650qLn.getSparkFragment()) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && (originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOriginalSparkContext()) != null) {
                                    str4 = originalSparkContext.containerId;
                                }
                                if (!Intrinsics.LJFF(str4, strOptString)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        this.LLILLJJLI = new JSONObject(str2).optString("back_open_url");
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(str, "ec_hybrid_intercept_open_url")) {
                    this.LLILZLL = true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
