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
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549850qQx implements InterfaceC2217701Bqy, InterfaceC1164530gPT {
    public WeakReference<SparkActivity> LL;
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

    @Override // X.InterfaceC2217701Bqy
    public final void LJIL(Activity activity, Context context) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIJIIJI(SparkActivity sparkActivity) {
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

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJZI(SparkActivity sparkActivity) {
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

    @Override // X.InterfaceC2217701Bqy
    public final void LJIILLIIL(boolean z) {
        String str;
        WeakReference<SparkActivity> weakReference;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        WebKitView webKitView;
        String url;
        Uri uri;
        if (!this.LLILZLL && (str = this.LLILLJJLI) != null && str.length() > 0 && (weakReference = this.LL) != null && weakReference.get() != null) {
            SettingsManager.LIZLLL().getClass();
            WeakReference<SparkActivity> weakReference2 = null;
            if (SettingsManager.LIZ("ecom_preload_fix", true)) {
                try {
                    WeakReference<WebKitView> weakReference3 = this.LLIZ;
                    if (weakReference3 != null && (webKitView = weakReference3.get()) != null && (url = webKitView.getUrl()) != null && (uri = UriProtector.parse(url)) != null) {
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
            if (Intrinsics.LJFF(str, "aweme://ec/pay_result")) {
                if (z) {
                    WeakReference<SparkActivity> weakReference4 = this.LL;
                    if (weakReference4 != null) {
                        weakReference2 = weakReference4;
                    }
                    SmartRouter.buildRoute(weakReference2.get(), str).open();
                    return;
                }
                return;
            }
            WeakReference<SparkActivity> weakReference5 = this.LL;
            if (weakReference5 != null) {
                weakReference2 = weakReference5;
            }
            SmartRouter.buildRoute(weakReference2.get(), str).open();
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_hybrid_container_intercept_back", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_hybrid_intercept_open_url", this);
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
        View viewE1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tiktokec_payment_blank_detect", false)) {
            SparkFragment sparkFragment = sparkActivity.LLJILJIL;
            if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
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
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0qQz
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
                        C1549850qQx c1549850qQx = this.LIZIZ;
                        C03WD.LIZIZ(Boolean.valueOf(z), c1549850qQx.LLILLL, c1549850qQx.LLILZ, this.LIZ);
                    }
                };
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        String strLJIJI;
        this.LL = new WeakReference<>(sparkActivity);
        SparkContext sparkContext = sparkActivity.LL;
        String host = null;
        if (sparkContext != null) {
            interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (!(interfaceC1541990qEHLJIJJ instanceof WebKitView)) {
            interfaceC1541990qEHLJIJJ = null;
        }
        this.LLIZ = new WeakReference<>(interfaceC1541990qEHLJIJJ);
        this.LLILZLL = false;
        SparkContext sparkContext2 = sparkActivity.LL;
        if (sparkContext2 != null && (strLJIJI = sparkContext2.LJIJI()) != null) {
            this.LLILLL = strLJIJI;
            Uri uri = UriProtector.parse(strLJIJI);
            if (uri != null) {
                host = uri.getHost();
            }
            this.LLILZ = host;
            this.LLILLJJLI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "back_open_url");
        }
        SparkContext sparkContext3 = sparkActivity.LL;
        if (sparkContext3 != null) {
            sparkContext3.LJJJJZI(new C1554520qYU(this, 0));
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_hybrid_container_intercept_back", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_hybrid_intercept_open_url", this);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext originalSparkContext;
        try {
            WeakReference<SparkActivity> weakReference = this.LL;
            if (weakReference != null && weakReference.get() != null) {
                if (Intrinsics.LJFF(str, "ec_hybrid_container_intercept_back")) {
                    if (str2.length() > 0) {
                        String strOptString = new JSONObject(str2).optString("react_id");
                        WeakReference<SparkActivity> weakReference2 = this.LL;
                        String str4 = null;
                        if (weakReference2 == null) {
                            weakReference2 = null;
                        }
                        SparkContext sparkContext = weakReference2.get().LL;
                        if (sparkContext != null) {
                            str3 = sparkContext.containerId;
                        } else {
                            str3 = null;
                        }
                        if (!Intrinsics.LJFF(str3, strOptString)) {
                            SettingsManager.LIZLLL().getClass();
                            if (SettingsManager.LIZ("ecom_preload_fix", true)) {
                                WeakReference<SparkActivity> weakReference3 = this.LL;
                                if (weakReference3 == null) {
                                    weakReference3 = null;
                                }
                                SparkFragment sparkFragment = weakReference3.get().LLJILJIL;
                                if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && (originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOriginalSparkContext()) != null) {
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
