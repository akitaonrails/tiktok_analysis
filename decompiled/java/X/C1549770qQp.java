package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
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
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549770qQp implements InterfaceC2217701Bqy, InterfaceC2217711Bqz, InterfaceC1164530gPT {
    public WeakReference<InterfaceC1546650qLn> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public View LLILZIL;

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

    @Override // X.InterfaceC2217701Bqy
    public final void LJIILLIIL(boolean z) {
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
        WeakReference<InterfaceC1546650qLn> weakReference;
        WeakReference<InterfaceC1546650qLn> weakReference2;
        InterfaceC1546650qLn interfaceC1546650qLn;
        SparkFragment sparkFragment;
        Context context;
        String str = this.LLILLJJLI;
        if (str == null || str.length() <= 0 || (weakReference = this.LL) == null || weakReference.get() == null || (weakReference2 = this.LL) == null || (interfaceC1546650qLn = weakReference2.get()) == null || (sparkFragment = interfaceC1546650qLn.getSparkFragment()) == null || (context = sparkFragment.getContext()) == null) {
            return;
        }
        SmartRouter.buildRoute(context, str).open();
    }

    public final void LIZ(InterfaceC1546650qLn interfaceC1546650qLn) {
        String strLJIJI;
        this.LL = new WeakReference<>(interfaceC1546650qLn);
        SparkContext sparkContextLLIILZL = interfaceC1546650qLn.LLIILZL();
        if (sparkContextLLIILZL != null && (strLJIJI = sparkContextLLIILZL.LJIJI()) != null) {
            this.LLILLL = strLJIJI;
            this.LLILZ = UriProtector.parse(strLJIJI).getHost();
            this.LLILLJJLI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "back_open_url");
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_hybrid_container_intercept_back", this);
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
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0qQq
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
                        C1549770qQp c1549770qQp = this.LIZIZ;
                        C03WD.LIZIZ(Boolean.valueOf(z), c1549770qQp.LLILLL, c1549770qQp.LLILZ, this.LIZ);
                    }
                };
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_hybrid_container_intercept_back", this);
        }
    }

    @Override // X.InterfaceC2217711Bqz
    public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_hybrid_container_intercept_back", this);
        }
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
        WeakReference<InterfaceC1546650qLn> weakReference;
        InterfaceC1546650qLn interfaceC1546650qLn;
        if (Intrinsics.LJFF("ec_hybrid_container_intercept_back", str) && str2.length() > 0) {
            try {
                WeakReference<InterfaceC1546650qLn> weakReference2 = this.LL;
                String str3 = null;
                if (weakReference2 != null && weakReference2.get() != null && (weakReference = this.LL) != null && (interfaceC1546650qLn = weakReference.get()) != null) {
                    JSONObject jSONObject = new JSONObject(str2);
                    SparkContext sparkContextLLIILZL = interfaceC1546650qLn.LLIILZL();
                    if (sparkContextLLIILZL != null) {
                        str3 = sparkContextLLIILZL.containerId;
                    }
                    if (Intrinsics.LJFF(str3, jSONObject.optString("react_id"))) {
                        this.LLILLJJLI = new JSONObject(str2).optString("back_open_url");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
    }
}
