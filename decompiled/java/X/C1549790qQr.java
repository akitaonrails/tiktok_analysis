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
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549790qQr implements InterfaceC2217701Bqy, InterfaceC1164530gPT {
    public WeakReference<SparkActivity> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public View LLILZIL;

    @Override // X.InterfaceC2217701Bqy
    public final Context LIZJ(Context context) {
        return context;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJIILLIIL(boolean z) {
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
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1163130gND
    public final void release() {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void finish() {
        WeakReference<SparkActivity> weakReference;
        String str = this.LLILLJJLI;
        if (str == null || str.length() <= 0 || (weakReference = this.LL) == null) {
            return;
        }
        if (weakReference.get() != null) {
            WeakReference<SparkActivity> weakReference2 = this.LL;
            SmartRouter.buildRoute((weakReference2 != null ? weakReference2 : null).get(), str).open();
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_hybrid_container_intercept_back", this);
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
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0qQt
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
                        C1549790qQr c1549790qQr = this.LIZIZ;
                        C03WD.LIZIZ(Boolean.valueOf(z), c1549790qQr.LLILLL, c1549790qQr.LLILZ, this.LIZ);
                    }
                };
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        String strLJIJI;
        String host;
        this.LL = new WeakReference<>(sparkActivity);
        SparkContext sparkContext = sparkActivity.LL;
        if (sparkContext != null && (strLJIJI = sparkContext.LJIJI()) != null) {
            this.LLILLL = strLJIJI;
            Uri uri = UriProtector.parse(strLJIJI);
            if (uri != null) {
                host = uri.getHost();
            } else {
                host = null;
            }
            this.LLILZ = host;
            this.LLILLJJLI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "back_open_url");
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_hybrid_container_intercept_back", this);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF("ec_hybrid_container_intercept_back", str) && str2.length() > 0) {
            try {
                WeakReference<SparkActivity> weakReference = this.LL;
                if (weakReference != null) {
                    String str3 = null;
                    if (weakReference.get() != null) {
                        JSONObject jSONObject = new JSONObject(str2);
                        WeakReference<SparkActivity> weakReference2 = this.LL;
                        if (weakReference2 == null) {
                            weakReference2 = null;
                        }
                        SparkContext sparkContext = weakReference2.get().LL;
                        if (sparkContext != null) {
                            str3 = sparkContext.containerId;
                        }
                        if (Intrinsics.LJFF(str3, jSONObject.optString("react_id"))) {
                            this.LLILLJJLI = new JSONObject(str2).optString("back_open_url");
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
    }
}
