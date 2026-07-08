package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.service.IAdExternalGuideService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig;
import com.ss.android.ugc.aweme.feed.model.LeftSlideMiddlePageModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0d6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037380d6O {
    public static final C1037380d6O LIZ = new C1037380d6O();

    public static final String LIZ(Context context, C1017520caM c1017520caM) {
        int i;
        Integer num;
        if (context != null) {
            if (c1017520caM != null && (num = c1017520caM.LIZLLL) != null && num.intValue() == 0) {
                i = 2131824729;
            } else {
                i = 2131824728;
            }
            String string = context.getString(i);
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    public static boolean LIZIZ(AwemeRawAd awemeRawAd, boolean z) {
        InterfaceC1017210cZr interfaceC1017210cZr;
        String webUrl;
        boolean z2;
        if (!awemeRawAd.isOpenSystemBrowser()) {
            return false;
        }
        boolean z3 = awemeRawAd.getLeftSlideMiddlePageModel().bocUseRealMiddlePage;
        if (z && (interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class)) != null) {
            String creativeIdStr = awemeRawAd.getCreativeIdStr();
            if (z3) {
                webUrl = awemeRawAd.getWebUrl();
            } else {
                webUrl = null;
            }
            if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC1017210cZr.rL0(creativeIdStr, new C1017520caM(0, 2, webUrl, awemeRawAd.getWebUrl(), z2, z3));
        }
        return true;
    }

    public static final void LJIIIIZZ(TuxTextView tuxTextView, C1017520caM c1017520caM) {
        tuxTextView.setText(LIZ(tuxTextView.getContext(), c1017520caM));
    }

    public static void LJ(C1035880d3y c1035880d3y, String str, Context context) {
        String str2 = str;
        if (str2 == null) {
            return;
        }
        IAdExternalGuideService iAdExternalGuideService = (IAdExternalGuideService) PluggableExtentionKt.pluggableSpi$default(IAdExternalGuideService.class, false, false, false, 14, null);
        if (iAdExternalGuideService == null || iAdExternalGuideService.getStatus() == null || !C1038270d7p.LIZIZ) {
            C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(0, 1, null, null, c1035880d3y, 28));
            C1037680d6s.LIZ.getClass();
            c1041160dCU.logAd(C1037680d6s.LIZJ, c1035880d3y.getAwemeRawAd());
        }
        String strLIZ = C1037210d67.LIZ(str2, c1035880d3y, false, true, null);
        if (strLIZ != null) {
            str2 = strLIZ;
        }
        String strLIZ2 = C1037200d66.LIZ(str2, c1035880d3y, "boc", false, true);
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null) {
            iMainService.openSystemBrowser(context, strLIZ2);
        }
    }

    public static boolean LJI(Aweme aweme, AwemeRawAd awemeRawAd, boolean z) throws Throwable {
        InterfaceC1017210cZr interfaceC1017210cZr;
        boolean z2;
        InterfaceC1017210cZr interfaceC1017210cZr2;
        boolean z3;
        InterfaceC1017210cZr interfaceC1017210cZr3;
        boolean z4;
        InterfaceC1017210cZr interfaceC1017210cZr4;
        boolean z5;
        if (C1017070cZd.LLIIL(aweme) && !C1017180cZo.LIZJ(awemeRawAd) && !awemeRawAd.isPhotoModeSlideOptimizeEnable() && !((Boolean) C270570Aj1.LIZ.getValue()).booleanValue()) {
            return false;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (C123100dR.LIZ(openUrl)) {
            if (!u.LJJIIJZLJL(openUrl, "http://", false) && !u.LJJIIJZLJL(openUrl, "https://", false)) {
                if (C1022030chd.LJJ(openUrl)) {
                    if (!C1022030chd.LJJI(openUrl)) {
                        if (!LIZIZ(awemeRawAd, z)) {
                            return false;
                        }
                    } else if (C123100dR.LIZ(awemeRawAd.getWebUrl())) {
                        if (z && (interfaceC1017210cZr4 = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class)) != null) {
                            String creativeIdStr = awemeRawAd.getCreativeIdStr();
                            String webUrl = awemeRawAd.getWebUrl();
                            if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            interfaceC1017210cZr4.rL0(creativeIdStr, new C1017520caM(1, 1, webUrl, awemeRawAd.getOpenUrl(), z5, true));
                            return true;
                        }
                    } else if (z && (interfaceC1017210cZr3 = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class)) != null) {
                        String creativeIdStr2 = awemeRawAd.getCreativeIdStr();
                        if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        interfaceC1017210cZr3.rL0(creativeIdStr2, new C1017520caM(1, 1, null, awemeRawAd.getOpenUrl(), z4, false));
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                C844470XAv.LIZ.getClass();
                boolean zLJIILIIL = C1022030chd.LJIILIIL(C844470XAv.LIZ(), UriProtector.parse(openUrl));
                if (z && (interfaceC1017210cZr2 = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class)) != null) {
                    String creativeIdStr3 = awemeRawAd.getCreativeIdStr();
                    if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    interfaceC1017210cZr2.rL0(creativeIdStr3, new C1017520caM(Integer.valueOf(zLJIILIIL ? 1 : 0), 1, openUrl, awemeRawAd.getOpenUrl(), z3, true));
                    return true;
                }
            }
            return true;
        }
        if (C123100dR.LIZ(awemeRawAd.getWebUrl())) {
            if (!LIZIZ(awemeRawAd, z)) {
                C844470XAv.LIZ.getClass();
                if (C1017070cZd.LLLLII(C844470XAv.LIZ(), aweme)) {
                    if (z && (interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class)) != null) {
                        String creativeIdStr4 = awemeRawAd.getCreativeIdStr();
                        String webUrl2 = awemeRawAd.getWebUrl();
                        if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC1017210cZr.rL0(creativeIdStr4, new C1017520caM(1, 2, webUrl2, awemeRawAd.getWebUrl(), z2, true));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme, String str, String str2, boolean z) {
        AwemeRawAd awemeRawAd;
        FinalJumpTargetPageConfig finalJumpTargetPageConfigVu;
        AwemeRawAd awemeRawAd2;
        IAdWebUtils iAdWebUtils;
        FinalJumpTargetPageConfig finalJumpTargetPageConfigVu2;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null && awemeRawAd3.isOpenSystemBrowser() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && C1017180cZo.LJJIJIIJI(awemeRawAd2) && (iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) != null && (finalJumpTargetPageConfigVu2 = iAdWebUtils.Vu(aweme.getAwemeRawAd(), str, str2)) != null && finalJumpTargetPageConfigVu2.getMiddlePageType() == 3) {
            return true;
        }
        LeftSlideMiddlePageModel leftSlideMiddlePageModel = awemeRawAd.getLeftSlideMiddlePageModel();
        if (leftSlideMiddlePageModel == null || !leftSlideMiddlePageModel.shouldUseMiddlePage) {
            return false;
        }
        if (z) {
            return LJI(aweme, awemeRawAd, z);
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null && C1017180cZo.LJJIJIIJI(awemeRawAd4)) {
            IAdWebUtils iAdWebUtils2 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils2 == null || (finalJumpTargetPageConfigVu = iAdWebUtils2.Vu(aweme.getAwemeRawAd(), str, str2)) == null || finalJumpTargetPageConfigVu.getMiddlePageType() != 1) {
                return false;
            }
        } else if (!TextUtils.equals(str2, "slide")) {
            return false;
        }
        return LJI(aweme, awemeRawAd, z);
    }

    public static void LIZJ(Context context, final C1017520caM c1017520caM, boolean z, final C1035880d3y c1035880d3y, String str, Function0 function0) {
        final AwemeRawAd awemeRawAd;
        Integer num;
        String str2;
        if (c1017520caM != null && c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
            IAdExternalGuideService iAdExternalGuideService = (IAdExternalGuideService) PluggableExtentionKt.pluggableSpi$default(IAdExternalGuideService.class, false, false, false, 14, null);
            if (iAdExternalGuideService == null || iAdExternalGuideService.getStatus() == null || !C1038270d7p.LIZIZ) {
                C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(!c1017520caM.LIZJ ? 1 : 0, !z ? 1 : 0, null, null, c1035880d3y, 28));
                C1037680d6s.LIZ.getClass();
                c1041160dCU.logAd(C1037680d6s.LIZJ, awemeRawAd);
            }
            Integer num2 = c1017520caM.LJFF;
            if ((num2 == null || num2.intValue() != 1) && (num = c1017520caM.LIZLLL) != null && num.intValue() == 0) {
                String strLIZ = C1037210d67.LIZ(str, c1035880d3y, false, true, null);
                if (strLIZ == null) {
                    strLIZ = "";
                }
                ((IMainService) ServiceManager.get().getService(IMainService.class)).openSystemBrowser(context, C1037200d66.LIZ(strLIZ, c1035880d3y, "boc", false, true));
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            String strLJJIFFI = c1017520caM.LJ;
            if (strLJJIFFI == null) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(strLJJIFFI));
            if (a0.LJJIIZI(strLJJIFFI, "__back_url__", false)) {
                strLJJIFFI = u.LJJIFFI(strLJJIFFI, "__back_url__", Uri.encode(InterfaceC1029360ctS.LIZ), false);
                intent.setData(UriProtector.parse(strLJJIFFI));
            }
            intent.putExtra("open_url", strLJJIFFI);
            intent.addFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
            if (!((IMainService) ServiceManager.get().getService(IMainService.class)).startActivity(context, intent)) {
                return;
            }
            if (function0 != null) {
                function0.invoke();
            }
            Object[] objArr = new Object[1];
            if (c1017520caM.LIZJ) {
                str2 = "real_middle_page";
            } else {
                str2 = "fake_middle_page";
            }
            objArr[0] = new C1041170dCV(0, 0, str2, c1017520caM.LJ, c1035880d3y, 19);
            C1041160dCU c1041160dCU2 = new C1041160dCU(objArr);
            C1037680d6s.LIZ.getClass();
            c1041160dCU2.logAd(C1037680d6s.LIZLLL, awemeRawAd);
            C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
            InterfaceC1029340ctQ interfaceC1029340ctQ = new InterfaceC1029340ctQ() { // from class: X.0d6R
                @Override // X.InterfaceC1029340ctQ
                public final void LIZ(boolean z2) {
                    String str3;
                    C1023960ckk c1023960ckk;
                    Object[] objArr2 = new Object[1];
                    C1017520caM c1017520caM2 = c1017520caM;
                    if (c1017520caM2.LIZJ) {
                        str3 = "real_middle_page";
                    } else {
                        str3 = "fake_middle_page";
                    }
                    objArr2[0] = new C1041170dCV(0, 0, str3, c1017520caM2.LJ, c1035880d3y, 19);
                    C1041160dCU c1041160dCU3 = new C1041160dCU(objArr2);
                    if (z2) {
                        C1037680d6s.LIZ.getClass();
                        c1023960ckk = C1037680d6s.LJ;
                    } else {
                        C1037680d6s.LIZ.getClass();
                        c1023960ckk = C1037680d6s.LJFF;
                    }
                    c1041160dCU3.logAd(c1023960ckk, awemeRawAd);
                }
            };
            c1029270ctJ.getClass();
            C1029270ctJ.LJFF(interfaceC1029340ctQ);
            C1029270ctJ.LJI(new InterfaceC1029340ctQ() { // from class: X.0d6S
                @Override // X.InterfaceC1029340ctQ
                public final void LIZ(boolean z2) {
                    String str3;
                    if (z2) {
                        Object[] objArr2 = new Object[1];
                        C1017520caM c1017520caM2 = c1017520caM;
                        if (c1017520caM2.LIZJ) {
                            str3 = "real_middle_page";
                        } else {
                            str3 = "fake_middle_page";
                        }
                        objArr2[0] = new C1041170dCV(0, 0, str3, c1017520caM2.LJ, c1035880d3y, 19);
                        C1041160dCU c1041160dCU3 = new C1041160dCU(objArr2);
                        C1037680d6s.LIZ.getClass();
                        c1041160dCU3.logAd(C1037680d6s.LJI, awemeRawAd);
                    }
                }
            });
        }
    }

    public static final void LIZLLL(final C1017520caM c1017520caM, AwemeRawAd awemeRawAd, TuxIconView tuxIconView, final TuxTextView tuxTextView, final C197039127h c197039127h, final InterfaceC420801kM interfaceC420801kM, final C1035880d3y c1035880d3y, final WebView webView, final Function1<? super Long, Unit> function1) {
        int i;
        int i2;
        int i3;
        if (c1017520caM != null && awemeRawAd != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            Integer num = c1017520caM.LIZLLL;
            if (num != null && num.intValue() == 0) {
                i = 48;
            } else {
                i = 40;
            }
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
            Integer num2 = c1017520caM.LIZLLL;
            if (num2 != null && num2.intValue() == 0) {
                i2 = 48;
            } else {
                i2 = 40;
            }
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
            Integer num3 = c1017520caM.LIZLLL;
            if (num3 != null && num3.intValue() == 0) {
                i3 = R.raw.icon_globe_fill;
            } else {
                i3 = R.raw.icon_misc_fill;
            }
            c419910GdJ.LIZ = i3;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
            tuxTextView.setText(LIZ(tuxTextView.getContext(), c1017520caM));
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0d6P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String url;
                    InterfaceC420801kM interfaceC420801kM2 = interfaceC420801kM;
                    if (interfaceC420801kM2 != null) {
                        interfaceC420801kM2.dispose();
                    }
                    function1.invoke(0L);
                    C1037380d6O c1037380d6O = C1037380d6O.LIZ;
                    Context context = c197039127h.getContext();
                    C1017520caM c1017520caM2 = c1017520caM;
                    C1035880d3y c1035880d3y2 = c1035880d3y;
                    WebView webView2 = webView;
                    if (webView2 != null) {
                        url = webView2.getUrl();
                    } else {
                        url = null;
                    }
                    AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(tuxTextView, c1017520caM, 88);
                    c1037380d6O.getClass();
                    C1037380d6O.LIZJ(context, c1017520caM2, false, c1035880d3y2, url, awS417S0200000_16);
                }
            });
        }
    }

    public static final C11JF LJII(final Context context, final C1017520caM c1017520caM, AwemeRawAd awemeRawAd, final C1035880d3y c1035880d3y, final WebView webView, final TuxTextView tuxTextView, final String str, InterfaceC420801kM interfaceC420801kM, long j, final Function1 function1) {
        if (context == null || c1017520caM == null || awemeRawAd == null || !c1017520caM.LIZIZ) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(context.getString(2131824727, Long.valueOf(j)));
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        return (C11JF) C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJLIIL(j + 1).LJJJJZI(new C517101zt(j, 11)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C516601zo(function1, str, tuxTextView, 6), new C09JN() { // from class: X.00OV
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AdMiddlePageUtils@c2e1.startCountDown$3");
                C1C7U.LIZIZ("AdMiddlePageUtils@c2e1.startCountDown$3");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0d6Q
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                function1.invoke(0L);
                tuxTextView.setText(str);
                C1037380d6O c1037380d6O = C1037380d6O.LIZ;
                Context context2 = context;
                C1017520caM c1017520caM2 = c1017520caM;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                WebView webView2 = webView;
                String url = webView2 != null ? webView2.getUrl() : null;
                AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(tuxTextView, c1017520caM, 89);
                c1037380d6O.getClass();
                C1037380d6O.LIZJ(context2, c1017520caM2, true, c1035880d3y2, url, awS417S0200000_16);
            }
        });
    }
}
