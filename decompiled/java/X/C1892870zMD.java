package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892870zMD implements InterfaceC2217701Bqy, InterfaceC1893040zMU {
    public final String LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public SparkContext LLILZLL;
    public String LLIZ = "";
    public boolean LLIZLLLIL;
    public PoiThirdPartyViewModel LLJ;

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
    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLJLI(SparkActivity sparkActivity) {
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

    @Override // X.InterfaceC1893040zMU
    public final SparkContext LLIILZL() {
        return this.LLILZLL;
    }

    public C1892870zMD(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        WebView webView;
        Integer numValueOf;
        boolean z;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Object kitView = null;
        if (C1549760qQo.LIZIZ()) {
            SparkFragment sparkFragment = sparkActivity.LLJILJIL;
            if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null) {
                numValueOf = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOptimization());
            } else {
                numValueOf = null;
            }
            if (!C1542210qEd.LIZ(numValueOf) && !C1542210qEd.LIZIZ(numValueOf)) {
                z = false;
            } else {
                z = true;
            }
            this.LLIZLLLIL = z;
        }
        if (this.LLIZLLLIL && C1549760qQo.LIZ() == 3) {
            SparkFragment sparkFragment2 = sparkActivity.LLJILJIL;
            if (sparkFragment2 != null) {
                kitView = sparkFragment2.getKitView();
            }
            if ((kitView instanceof WebView) && (webView = (WebView) kitView) != null) {
                C786410Ut5.ue(webView, "about:blank");
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJJ(SparkActivity sparkActivity) {
        if (!this.LLILZIL) {
            this.LLILZIL = true;
            this.LLILLL = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJLL(SparkActivity sparkActivity) {
        WebKitView webKitViewLIZ;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI;
        C1892770zM3 c1892770zM3 = C1892770zM3.LIZ;
        String str4 = this.LLIZ;
        String str5 = this.LL;
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null) {
            webKitViewLIZ = C1548420qOe.LIZ(sparkContext);
        } else {
            webKitViewLIZ = null;
        }
        PageFinder pageFinderVia = PageFinder.via((View) webKitViewLIZ);
        boolean z = this.LLIZLLLIL;
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLJ;
        if (poiThirdPartyViewModel != null) {
            str = poiThirdPartyViewModel.LLILZIL;
            num = poiThirdPartyViewModel.LLILZ;
            str2 = poiThirdPartyViewModel.LLIZ;
            num2 = poiThirdPartyViewModel.LLILZLL;
        } else {
            str = null;
            num = null;
            str2 = null;
            num2 = null;
        }
        c1892770zM3.getClass();
        Map mapLIZ = C308370C6x.LIZ(null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration");
        if (C1892770zM3.LIZIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("page_loaded", str3);
        c2344009Gk.LJII(mapLIZ);
        C1892770zM3.LIZIZ(c2344009Gk, str4);
        C1892770zM3.LIZ(c2344009Gk, C1892770zM3.LIZJ);
        c2344009Gk.LJIIIIZZ("hybrid_session_id", str5);
        c2344009Gk.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(z)), "is_preload_webview");
        if (str != null) {
            c2344009Gk.LJFF("error_reason", str);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "origin_code");
        }
        if (str2 != null) {
            c2344009Gk.LJFF("origin_reason", str2);
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_webview_stay_time", map, c1185050gwZ);
        C1892770zM3.LIZIZ = false;
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJZI(SparkActivity sparkActivity) {
        String str;
        if (C1906580ziK.LJI()) {
            this.LLILZ = SystemClock.elapsedRealtime();
            C1892770zM3 c1892770zM3 = C1892770zM3.LIZ;
            String str2 = this.LLIZ;
            String str3 = this.LL;
            c1892770zM3.getClass();
            Map mapLIZ = C308370C6x.LIZ(null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (C1892770zM3.LIZIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("page_loaded", str);
            c2344009Gk.LJII(mapLIZ);
            C1892770zM3.LIZIZ(c2344009Gk, str2);
            C1892770zM3.LIZ(c2344009Gk, C1892770zM3.LIZJ);
            c2344009Gk.LJIIIIZZ("hybrid_session_id", str3);
            C20684815ws.LJIILLIIL("hybrid_webview_enter_background", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            this.LLILLJJLI += SystemClock.elapsedRealtime() - this.LLILLL;
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
        if (a0.LJJIIZI(this.LLIZ, "google", false)) {
            return false;
        }
        C1893130zMd.LIZ.getClass();
        return C1893130zMd.LIZJ(sparkActivity, true);
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLL(SparkActivity sparkActivity) {
        String str;
        if (C1906580ziK.LJI()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZ;
            this.LLILZ = 0L;
            C1892770zM3 c1892770zM3 = C1892770zM3.LIZ;
            String str2 = this.LLIZ;
            String str3 = this.LL;
            c1892770zM3.getClass();
            Map mapLIZ = C308370C6x.LIZ(null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jElapsedRealtime, "duration");
            if (C1892770zM3.LIZIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("page_loaded", str);
            c2344009Gk.LJII(mapLIZ);
            C1892770zM3.LIZIZ(c2344009Gk, str2);
            C1892770zM3.LIZ(c2344009Gk, C1892770zM3.LIZJ);
            c2344009Gk.LJIIIIZZ("hybrid_session_id", str3);
            C20684815ws.LJIILLIIL("hybrid_webview_enter_foreground", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        String strLJIJI;
        SparkActivity sparkActivityLIZ;
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        SparkContext sparkContext = sparkActivity.LL;
        this.LLILZLL = sparkContext;
        PoiThirdPartyViewModel poiThirdPartyViewModel = null;
        if (sparkContext != null) {
            strLJIJI = sparkContext.LJIJI();
        } else {
            strLJIJI = null;
        }
        String str = "";
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        this.LLIZ = str;
        SparkContext sparkContext2 = this.LLILZLL;
        if (sparkContext2 != null) {
            sparkActivityLIZ = C1893200zMk.LIZ(sparkContext2);
        } else {
            sparkActivityLIZ = null;
        }
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LLJ = poiThirdPartyViewModel;
    }
}
