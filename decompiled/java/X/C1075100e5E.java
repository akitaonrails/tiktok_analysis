package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.privacy.ICommerceLandingPagePrivacyService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075100e5E {
    public static InterfaceC1370310llN LIZ(final C1075210e5P c1075210e5P, String str) {
        final String strLIZ;
        C1038780d8e.LIZ.getClass();
        if (Intrinsics.LJFF(str, "ad_history")) {
            return new InterfaceC1370310llN() { // from class: X.0Qvw
                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_watch_history;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_watch_history;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return 2131832845;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "ad_history";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                public static Uri LIZ(Uri uri, String str2) {
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj : queryParameterNames) {
                        if (!Intrinsics.LJFF(obj, str2)) {
                            arrayList.add(obj);
                        }
                    }
                    for (String str3 : arrayList) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                        while (it2.hasNext()) {
                            builderClearQuery.appendQueryParameter(str3, it2.next());
                        }
                    }
                    return builderClearQuery.build();
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
                @Override // X.InterfaceC1370310llN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIILIIL(android.content.Context r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7) {
                    /*
                        r5 = this;
                        com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L48
                        java.lang.String r1 = "ActivityCenterTabSchema"
                        java.lang.String r0 = ""
                        r2.getClass()     // Catch: java.lang.Throwable -> L48
                        java.lang.String r4 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Throwable -> L48
                        if (r4 == 0) goto L4f
                        boolean r0 = kotlin.text.a0.LJJJIL(r4)     // Catch: java.lang.Throwable -> L48
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L4f
                        boolean r0 = kotlin.text.a0.LJJJIL(r4)
                        if (r0 != 0) goto L4f
                        java.lang.String r3 = "source"
                        java.lang.String r2 = "default_tab"
                        android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Throwable -> L52
                        android.net.Uri r0 = LIZ(r0, r2)     // Catch: java.lang.Throwable -> L52
                        android.net.Uri r0 = LIZ(r0, r3)     // Catch: java.lang.Throwable -> L52
                        android.net.Uri$Builder r1 = r0.buildUpon()     // Catch: java.lang.Throwable -> L52
                        java.lang.String r0 = "link_history"
                        android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r0)     // Catch: java.lang.Throwable -> L52
                        java.lang.String r0 = "iab_more_sheet"
                        android.net.Uri$Builder r0 = r1.appendQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> L52
                        android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L52
                        java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L52
                        goto L56
                    L48:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        X.C1AF0.LJ(r0)
                    L4f:
                        java.lang.String r4 = "aweme://ad_history"
                        goto L56
                    L52:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L56:
                        com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r6, r4)
                        r0.open()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C686260Qvw.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }
            };
        }
        if (Intrinsics.LJFF(str, "ad_web_refresh")) {
            return new C1075290e5X(c1075210e5P);
        }
        if (Intrinsics.LJFF(str, "ad_share_link")) {
            return new InterfaceC1370310llN(c1075210e5P) { // from class: X.0e5a
                public final C1075210e5P LL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_arrow_turn_up_right_fill;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_arrow_turn_up_right;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return R.string.t_b;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "ad_im";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                {
                    this.LL = c1075210e5P;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    InterfaceC1541990qEH interfaceC1541990qEH;
                    IAdWebShareService iAdWebShareService;
                    ViewParent viewParent = this.LL.LIZ;
                    if ((viewParent instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) viewParent) != null && (iAdWebShareService = (IAdWebShareService) PluggableExtentionKt.pluggableSpi$default(IAdWebShareService.class, false, false, false, 14, null)) != null) {
                        iAdWebShareService.LIZJ(this.LL.LIZIZ, interfaceC1541990qEH);
                    }
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }
            };
        }
        if (Intrinsics.LJFF(str, "ad_copy_link")) {
            return new C1075110e5F(c1075210e5P);
        }
        if (Intrinsics.LJFF(str, "ad_open_in_browser")) {
            return new C1075250e5T(c1075210e5P);
        }
        if (Intrinsics.LJFF(str, "browser_setting")) {
            return new C1075280e5W(c1075210e5P);
        }
        if (Intrinsics.LJFF(str, "ad_iab_privacy_policy")) {
            ICommerceLandingPagePrivacyService iCommerceLandingPagePrivacyService = (ICommerceLandingPagePrivacyService) PluggableExtentionKt.pluggableSpi$default(ICommerceLandingPagePrivacyService.class, false, false, false, 14, null);
            if (iCommerceLandingPagePrivacyService == null || (strLIZ = iCommerceLandingPagePrivacyService.LIZ()) == null) {
                return null;
            }
            return new InterfaceC1370310llN(c1075210e5P, strLIZ) { // from class: X.0e5b
                public final C1075210e5P LL;
                public final String LLILLJJLI;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_info_circle_fill;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_info_circle;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return R.string.raj;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "ad_privacy_policy";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                {
                    this.LL = c1075210e5P;
                    this.LLILLJJLI = strLIZ;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    WebView webView = this.LL.LIZ;
                    if (webView != null) {
                        C786410Ut5.ue(webView, this.LLILLJJLI);
                    }
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }
            };
        }
        if (Intrinsics.LJFF(str, "ad_report")) {
            if (c1075210e5P.LIZIZ.LJFF(C1035880d3y.class) == null) {
                return null;
            }
            return new C1075240e5S(c1075210e5P);
        }
        return new C1075290e5X(c1075210e5P);
    }
}
