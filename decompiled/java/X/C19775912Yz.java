package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.common.util.concurrent.ListenableFuture;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.aweme.wiki.AddWikiRouterSwitchBack;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationResultResponse;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.12Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775912Yz extends AbstractC1539010q9T {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C19775912Yz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJLL$0(C19775912Yz c19775912Yz, InterfaceC1531560pxS interfaceC1531560pxS) {
        int i = C1324220kZ2.LIZ[interfaceC1531560pxS.getType().ordinal()];
        if (i != 1) {
            if (i != 2 || !(interfaceC1531560pxS instanceof C1537910q7h)) {
                return;
            }
            final AnchorGeneralHybridActivity anchorGeneralHybridActivity = (AnchorGeneralHybridActivity) c19775912Yz.l0;
            anchorGeneralHybridActivity.getClass();
            ((C1537910q7h) interfaceC1531560pxS).LJIIIIZZ(new LynxViewClient() { // from class: X.11WT
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILJJIL() {
                    C11WF c11wf = anchorGeneralHybridActivity.LLIZLLLIL;
                    if (c11wf != null) {
                        c11wf.LJI = true;
                    }
                }
            });
            return;
        }
        if (!(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        ((C1541480qDS) interfaceC1531560pxS).LJII(C1524080plO.class, AFwS273S0000000_29.get$arr$(7));
    }

    public static final void LJJJLL$1(C19775912Yz c19775912Yz, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            final AddWikiActivity addWikiActivity = (AddWikiActivity) c19775912Yz.l0;
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.11WB
                public boolean LL;

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                }

                public static String LIZ(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageFinished(WebView webView, String str) {
                    boolean zLJIJI;
                    String str2;
                    View viewE1;
                    InterfaceC1541990qEH kitView;
                    View viewE12;
                    WebView webView2;
                    InterfaceC1541990qEH kitView2;
                    View viewE13;
                    WebView webView3;
                    InterfaceC1541990qEH kitView3;
                    String str3;
                    String strLIZ;
                    ListenableFuture<CheckAnchorModerationResultResponse> listenableFutureLIZ;
                    AddWikiActivity addWikiActivity2 = addWikiActivity;
                    addWikiActivity2.getClass();
                    FrameLayout frameLayout = addWikiActivity2.LLILLL;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    C786410Ut5.LJZ(8, frameLayout);
                    if (this.LL) {
                        addWikiActivity.LLZLI("close", true);
                        addWikiActivity.LLZLI("back", true);
                        addWikiActivity.LLZLI("more", false);
                        AddWikiActivity addWikiActivity3 = addWikiActivity;
                        addWikiActivity3.LLJJI = false;
                        String strLIZ2 = LIZ(addWikiActivity3.getIntent(), "enter_from");
                        if (strLIZ2 != null && strLIZ2.length() != 0) {
                            if (u.LJIJI(addWikiActivity.LLJ, "Yelp", true)) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from", LIZ(addWikiActivity.getIntent(), "enter_from"));
                                c2344009Gk.LJIIIIZZ("anchor_type", "Yelp");
                                c2344009Gk.LJIIIIZZ("anchor_entry", LIZ(addWikiActivity.getIntent(), "anchor_entry"));
                                c2344009Gk.LJIIIIZZ("author_id", LIZ(addWikiActivity.getIntent(), "author_id"));
                                c2344009Gk.LJIIIIZZ("group_id", LIZ(addWikiActivity.getIntent(), "group_id"));
                                c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                c2344009Gk.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                                C20684815ws.LJIILLIIL("request_anchor_detail", c2344009Gk.LIZ);
                                return;
                            }
                            if (u.LJIJI(addWikiActivity.LLJ, "TripAdvisor", true)) {
                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                c2344009Gk2.LJIIIIZZ("enter_from", LIZ(addWikiActivity.getIntent(), "enter_from"));
                                c2344009Gk2.LJIIIIZZ("anchor_type", "TripAdvisor");
                                c2344009Gk2.LJIIIIZZ("anchor_entry", LIZ(addWikiActivity.getIntent(), "anchor_entry"));
                                c2344009Gk2.LJIIIIZZ("author_id", LIZ(addWikiActivity.getIntent(), "author_id"));
                                c2344009Gk2.LJIIIIZZ("group_id", LIZ(addWikiActivity.getIntent(), "group_id"));
                                c2344009Gk2.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                c2344009Gk2.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                                C20684815ws.LJIILLIIL("request_anchor_detail", c2344009Gk2.LIZ);
                                return;
                            }
                            AddWikiActivity addWikiActivity4 = addWikiActivity;
                            C2344009Gk c2344009Gk3 = new C2344009Gk();
                            addWikiActivity4.LLLLZLL(c2344009Gk3);
                            c2344009Gk3.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c2344009Gk3.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                            C20684815ws.LJIILLIIL("request_wiki_detail", c2344009Gk3.LIZ);
                            return;
                        }
                        return;
                    }
                    Uri uri = UriProtector.parse(str);
                    String strLLLZIL = addWikiActivity.LLLZIL(uri, "title");
                    if ((((strLLLZIL == null || strLLLZIL.length() == 0) && (strLLLZIL = addWikiActivity.LLJJIJIIJIL) == null) || strLLLZIL.length() == 0) && (webView == null || (strLLLZIL = webView.getTitle()) == null)) {
                        strLLLZIL = "";
                    }
                    if (!u.LJIJI(addWikiActivity.LLJ, "Yelp", true) && !u.LJIJI(addWikiActivity.LLJ, "TripAdvisor", true) && !u.LJIJI(addWikiActivity.LLJ, "Quizlet", true)) {
                        zLJIJI = u.LJIJI(addWikiActivity.LLLZIL(uri, "addButton"), "true", true);
                    } else {
                        zLJIJI = true;
                    }
                    ISettingService iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);
                    AddWikiActivity addWikiActivity5 = addWikiActivity;
                    String strLLLZIL2 = addWikiActivity5.LLLZIL(uri, "lang");
                    if (strLLLZIL2 == null) {
                        strLLLZIL2 = iSettingService.getAppLanguage();
                    }
                    addWikiActivity5.LLJI = strLLLZIL2;
                    if (u.LJIJI(addWikiActivity.LLJ, "TripAdvisor", true)) {
                        str2 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(strLLLZIL, new String[]{" - "}, 0, 6), 0);
                    } else {
                        str2 = strLLLZIL;
                    }
                    if (!u.LJIJI(addWikiActivity.LLJ, "TripAdvisor", true)) {
                        u.LJIJI(addWikiActivity.LLJ, "Yelp", true);
                    }
                    if (Intrinsics.LJFF(addWikiActivity.LLJ, "Wiki")) {
                        AddWikiActivity addWikiActivity6 = addWikiActivity;
                        if ((zLJIJI || addWikiActivity6.LLJJJJ) && str2.length() > 0) {
                            C11WD c11wd = C11WC.LIZ;
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = addWikiActivity.LL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                strLIZ = C1066080dqg.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                            } else {
                                strLIZ = null;
                            }
                            String str4 = addWikiActivity.LLJI;
                            if (str4 == null) {
                                str4 = null;
                            }
                            c11wd.getClass();
                            listenableFutureLIZ = C11WD.LIZIZ.LIZ(0, strLIZ, str2, str4, null);
                        } else {
                            listenableFutureLIZ = null;
                        }
                        addWikiActivity6.LLJIJIL = listenableFutureLIZ;
                    }
                    String strLIZ3 = LIZ(addWikiActivity.getIntent(), "enter_from");
                    if (strLLLZIL != null && strLLLZIL.length() != 0 && (strLIZ3 == null || strLIZ3.length() == 0 || (str3 = addWikiActivity.LLJJIII) == null || str3.length() == 0)) {
                        AddWikiActivity addWikiActivity7 = addWikiActivity;
                        addWikiActivity7.LLJJIII = strLLLZIL;
                        TuxNavBar tuxNavBar = addWikiActivity7.LLILZLL;
                        if (tuxNavBar != null) {
                            C1250250idj c1250250idj = new C1250250idj();
                            c1250250idj.LIZJ = strLLLZIL;
                            c1250250idj.LIZLLL = u.LJJIFFI(addWikiActivity.getString(2131826563), "%@", addWikiActivity.LLLZZIL(str), false);
                            tuxNavBar.LJIJJ(c1250250idj);
                        }
                    }
                    AddWikiActivity addWikiActivity8 = addWikiActivity;
                    addWikiActivity8.LLIZLLLIL = addWikiActivity8.LLLZIL(uri, "keyword");
                    AddWikiActivity addWikiActivity9 = addWikiActivity;
                    addWikiActivity9.LLIZ = u.LJIJI(addWikiActivity9.LLLZIL(uri, "noRedirect"), "true", true);
                    if (!addWikiActivity.LLJJJIL) {
                        addWikiActivity.LLLZLZ(uri);
                    }
                    addWikiActivity.getClass();
                    AddWikiActivity addWikiActivity10 = addWikiActivity;
                    addWikiActivity10.getClass();
                    AddWikiRouterSwitchBack.AddWikiRouterSwitchBackModel addWikiRouterSwitchBackModel = (AddWikiRouterSwitchBack.AddWikiRouterSwitchBackModel) AddWikiRouterSwitchBack.LIZIZ.getValue();
                    if (addWikiRouterSwitchBackModel != null && addWikiRouterSwitchBackModel.enableLoadJsCode) {
                        if (u.LJIJI(addWikiActivity10.LLJ, "Yelp", true)) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = addWikiActivity10.LL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                                viewE13 = kitView3.e1();
                            } else {
                                viewE13 = null;
                            }
                            if ((viewE13 instanceof WebView) && (webView3 = (WebView) viewE13) != null) {
                                C786410Ut5.ue(webView3, "javascript:(function extra(){[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');document.getElementById('smart-banner').style.display = 'none';document.getElementById('fullscreen-pitch').style.display = 'none';[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());})();");
                            }
                        } else if (u.LJIJI(addWikiActivity10.LLJ, "TripAdvisor", true)) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = addWikiActivity10.LL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView()) != null) {
                                viewE12 = kitView2.e1();
                            } else {
                                viewE12 = null;
                            }
                            if ((viewE12 instanceof WebView) && (webView2 = (WebView) viewE12) != null) {
                                C786410Ut5.ue(webView2, "javascript:(function extra(){[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');})();");
                            }
                        }
                    }
                    addWikiActivity.LLJJI = false;
                    if (strLIZ3 != null && strLIZ3.length() != 0) {
                        if (u.LJIJI(addWikiActivity.LLJ, "Yelp", true)) {
                            C2344009Gk c2344009Gk4 = new C2344009Gk();
                            c2344009Gk4.LJIIIIZZ("enter_from", LIZ(addWikiActivity.getIntent(), "enter_from"));
                            c2344009Gk4.LJIIIIZZ("anchor_type", "Yelp");
                            c2344009Gk4.LJIIIIZZ("anchor_entry", LIZ(addWikiActivity.getIntent(), "anchor_entry"));
                            c2344009Gk4.LJIIIIZZ("author_id", LIZ(addWikiActivity.getIntent(), "author_id"));
                            c2344009Gk4.LJIIIIZZ("group_id", LIZ(addWikiActivity.getIntent(), "group_id"));
                            c2344009Gk4.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c2344009Gk4.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                            C20684815ws.LJIILLIIL("request_anchor_detail", c2344009Gk4.LIZ);
                        } else if (u.LJIJI(addWikiActivity.LLJ, "TripAdvisor", true)) {
                            C2344009Gk c2344009Gk5 = new C2344009Gk();
                            c2344009Gk5.LJIIIIZZ("enter_from", LIZ(addWikiActivity.getIntent(), "enter_from"));
                            c2344009Gk5.LJIIIIZZ("anchor_type", "TripAdvisor");
                            c2344009Gk5.LJIIIIZZ("anchor_entry", LIZ(addWikiActivity.getIntent(), "anchor_entry"));
                            c2344009Gk5.LJIIIIZZ("author_id", LIZ(addWikiActivity.getIntent(), "author_id"));
                            c2344009Gk5.LJIIIIZZ("group_id", LIZ(addWikiActivity.getIntent(), "group_id"));
                            c2344009Gk5.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c2344009Gk5.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                            C20684815ws.LJIILLIIL("request_anchor_detail", c2344009Gk5.LIZ);
                        } else if (u.LJIJI(addWikiActivity.LLJ, "Quizlet", true)) {
                            C2344009Gk c2344009Gk6 = new C2344009Gk();
                            c2344009Gk6.LJIIIIZZ("enter_from", LIZ(addWikiActivity.getIntent(), "enter_from"));
                            c2344009Gk6.LJIIIIZZ("anchor_type", "Quizlet");
                            c2344009Gk6.LJIIIIZZ("anchor_entry", LIZ(addWikiActivity.getIntent(), "anchor_entry"));
                            c2344009Gk6.LJIIIIZZ("author_id", LIZ(addWikiActivity.getIntent(), "author_id"));
                            c2344009Gk6.LJIIIIZZ("group_id", LIZ(addWikiActivity.getIntent(), "group_id"));
                            c2344009Gk6.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c2344009Gk6.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                            C20684815ws.LJIILLIIL("request_anchor_detail", c2344009Gk6.LIZ);
                        } else {
                            AddWikiActivity addWikiActivity11 = addWikiActivity;
                            C2344009Gk c2344009Gk7 = new C2344009Gk();
                            addWikiActivity11.LLLLZLL(c2344009Gk7);
                            c2344009Gk7.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c2344009Gk7.LIZLLL(System.currentTimeMillis() - addWikiActivity.LLJILJILJ, "duration");
                            C20684815ws.LJIILLIIL("request_wiki_detail", c2344009Gk7.LIZ);
                        }
                    }
                    AddWikiActivity addWikiActivity12 = addWikiActivity;
                    if (addWikiActivity12.LLJILJIL) {
                        addWikiActivity12.LLJILJIL = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.Q2(addWikiActivity12, "input_method");
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = addWikiActivity.LL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getKitView()) != null) {
                            viewE1 = kitView.e1();
                        } else {
                            viewE1 = null;
                        }
                        inputMethodManager.showSoftInput(viewE1, 1);
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    AddWikiActivity addWikiActivity2 = addWikiActivity;
                    addWikiActivity2.getClass();
                    new AwS630S0100000_16(addWikiActivity2, 77).invoke(webView, str);
                    return super.shouldOverrideUrlLoading(webView, str);
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    this.LL = false;
                    if (Intrinsics.LJFF(LIZ(addWikiActivity.getIntent(), "anchor_type"), "News")) {
                        String title = addWikiActivity.LLJJIJIIJIL;
                        if (title.length() == 0 && (webView == null || (title = webView.getTitle()) == null)) {
                            title = "";
                        }
                        AddWikiActivity addWikiActivity2 = addWikiActivity;
                        addWikiActivity2.LLJJIII = title;
                        TuxNavBar tuxNavBar = addWikiActivity2.LLILZLL;
                        if (tuxNavBar != null) {
                            C1250250idj c1250250idj = new C1250250idj();
                            c1250250idj.LIZJ = title;
                            c1250250idj.LIZLLL = u.LJJIFFI(addWikiActivity.getString(2131826563), "%@", addWikiActivity.LLLZZIL(str), false);
                            tuxNavBar.LJIJJ(c1250250idj);
                        }
                        addWikiActivity.LLLZLZ(UriProtector.parse(str));
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        this.LL = true;
                    }
                }
            };
        }
    }
}
