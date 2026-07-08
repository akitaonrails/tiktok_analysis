package X;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10j9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19325710j9 {
    public static SparkContext LIZJ;
    public static boolean LJ;
    public static SparkActivity LJFF;
    public static C19327010jM LJI;
    public static MusicLandingPageViewModel LJII;
    public static final C19325710j9 LIZ = new C19325710j9();
    public static String LIZIZ = "safe";
    public static String LIZLLL = "";

    public static void LIZ(final WebView webView, final Function1 function1) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        C19327010jM c19327010jM = LJI;
        if (c19327010jM != null) {
            c19327010jM.setCurrentStatus$anchor_business_release(LIZIZ);
            c19327010jM.setCurrentStatusView$anchor_business_release(new InterfaceC19326810jK() { // from class: X.10j8
                @Override // X.InterfaceC19326810jK
                public final void LIZ() throws JSONException {
                    SparkContext sparkContext;
                    WebKitView webKitView;
                    C19325710j9 c19325710j9 = C19325710j9.LIZ;
                    C19327010jM c19327010jM2 = C19325710j9.LJI;
                    c19325710j9.getClass();
                    if (c19327010jM2 != null && c19327010jM2.getParent() != null && (c19327010jM2.getParent() instanceof ViewGroup)) {
                        C786410Ut5.LJJJLZIJ(c19327010jM2, (ViewGroup) c19327010jM2.getParent());
                    }
                    String str = C19325710j9.LIZIZ;
                    if (Intrinsics.LJFF(str, "protection")) {
                        function1.invoke(C19325710j9.LIZLLL);
                        WebView webView2 = webView;
                        if (Intrinsics.LJFF(webView2 != null ? webView2.getUrl() : null, C19325710j9.LIZLLL)) {
                            webView2.reload();
                        } else if (webView2 != null) {
                            C786410Ut5.ue(webView2, C19325710j9.LIZLLL);
                        }
                        C19325710j9.LIZIZ = "safe";
                        MusicLandingPageViewModel musicLandingPageViewModel = C19325710j9.LJII;
                        (musicLandingPageViewModel != null ? musicLandingPageViewModel : null).vQ2("loading");
                        return;
                    }
                    if (!Intrinsics.LJFF(str, "not_secure") || (sparkContext = C19325710j9.LIZJ) == null) {
                        return;
                    }
                    C1529870puj c1529870puj = C1529870puj.LIZ;
                    String str2 = sparkContext.containerId;
                    c1529870puj.getClass();
                    InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str2);
                    if (interfaceC1541990qEHLJFF != null && (interfaceC1541990qEHLJFF instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEHLJFF) != null && webKitView.canGoBack()) {
                        webKitView.goBack();
                        return;
                    }
                    InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
                    if (interfaceC1059280dfiLJJIJLIJ == null || !(interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity)) {
                        return;
                    }
                    ((SparkActivity) interfaceC1059280dfiLJJIJLIJ).finish();
                }
            });
        }
        SparkContext sparkContext = LIZJ;
        MusicLandingPageViewModel musicLandingPageViewModel = null;
        if (sparkContext != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C19326610jI.LIZ(sparkContext);
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = null;
        }
        C19327010jM c19327010jM2 = LJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ != null) {
            try {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.addView(c19327010jM2);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        MusicLandingPageViewModel musicLandingPageViewModel2 = LJII;
        if (musicLandingPageViewModel2 == null) {
            musicLandingPageViewModel2 = null;
        }
        musicLandingPageViewModel2.vQ2(LIZIZ);
        MusicLandingPageViewModel musicLandingPageViewModel3 = LJII;
        if (musicLandingPageViewModel3 != null) {
            musicLandingPageViewModel = musicLandingPageViewModel3;
        }
        musicLandingPageViewModel.LL.setValue(LIZLLL);
    }
}
