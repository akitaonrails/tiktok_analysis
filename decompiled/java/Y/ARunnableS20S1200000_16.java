package Y;

import X.AbstractC1041200dCY;
import X.C098200Yq;
import X.C0A6Y;
import X.C1001830cB3;
import X.C1007900cKq;
import X.C1007940cKu;
import X.C1024760cm2;
import X.C1035880d3y;
import X.C1037010d5n;
import X.C1039440d9i;
import X.C1042280dEI;
import X.C1042580dEm;
import X.C1042640dEs;
import X.C1042650dEt;
import X.C1042680dEw;
import X.C1042770dF5;
import X.C1042900dFI;
import X.C1274810jHL;
import X.C1276670jKL;
import X.C1322610kWR;
import X.C1324840ka2;
import X.C1490740otc;
import X.C1583630rJR;
import X.C189200o6;
import X.C1C7U;
import X.C21278918Pb;
import X.C2188811AlT;
import X.C2283708x9;
import X.C486860J7k;
import X.C823050WQl;
import X.C824310WVh;
import X.EnumC1042620dEq;
import X.EnumC1490770otf;
import X.EnumC992050bvH;
import X.InterfaceC1007930cKt;
import X.InterfaceC1032600cyg;
import X.InterfaceC1041500dD2;
import X.RunnableC1042780dF6;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingItemCell;
import com.ss.android.ugc.aweme.preload.services.PreloadServiceImpl;
import com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.MyListItemCell;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.SeriesCenterItemCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS20S1200000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strTv;
        WebView webView = ((C1042580dEm) this.l1).LJFF;
        Boolean boolValueOf = webView != null ? Boolean.valueOf(TTWebViewHelper.INSTANCE.isTTWebView(webView)) : null;
        C1042650dEt c1042650dEt = ((C1042580dEm) this.l1).LJ;
        if (c1042650dEt != null) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils == null || (strTv = iAdWebUtils.tv(((C1042580dEm) this.l1).LJFF)) == null) {
                strTv = "";
            }
            c1042650dEt.LJIILLIIL(strTv, EnumC1042620dEq.NORMAL, ((C1042580dEm) this.l1).LJII, (InterfaceC1041500dD2) this.l2, boolValueOf != null ? boolValueOf.booleanValue() : false, ((C1042580dEm) this.l1).LJIILL());
        }
        ((C1042580dEm) this.l1).LJ = null;
        C1042580dEm c1042580dEm = (C1042580dEm) this.l1;
        if (c1042580dEm.LJII.size() == 0) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, " doReportMeta size = 0", null, "CommerceLandPageSSPLifeCycle_", 2);
        } else {
            try {
                C1042770dF5[] c1042770dF5Arr = (C1042770dF5[]) c1042580dEm.LJII.toArray(new C1042770dF5[0]);
                c1042580dEm.LJII.clear();
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("doReportMeta ");
                sbLIZ.append(c1042770dF5Arr.length);
                C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPLifeCycle_", 2);
                C1042900dFI c1042900dFI = C1042900dFI.LIZ;
                C2283708x9.LIZ(new RunnableC1042780dF6(new C1042280dEI(c1042770dF5Arr)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("doReportMeta exception: ");
                sbLIZ2.append(Unit.LIZ);
                c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "CommerceLandPageSSPLifeCycle_");
            }
        }
        C1490740otc c1490740otc3 = C1490740otc.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onExitWebPage, cid: ");
        sbLIZ3.append(((C1042580dEm) this.l1).LIZ);
        sbLIZ3.append(" \n webUrl:");
        sbLIZ3.append(this.s0);
        C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ3), null, "CommerceLandPageSSPLifeCycle_", 2);
    }

    public final void LIZ$1() {
        C1042640dEs c1042640dEs = (C1042640dEs) this.l1;
        InterfaceC1041500dD2 interfaceC1041500dD2 = (InterfaceC1041500dD2) this.l2;
        c1042640dEs.getClass();
        C1042640dEs.LIZIZ(interfaceC1041500dD2);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try trigger preload gecko onUserEnterWebPage, ");
        sbLIZ.append(C1042640dEs.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.s0);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "CommerceLandPageTTWebModule_");
    }

    public final void LIZ$2() {
        if (!((WebView) this.l1).isShown()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestWebViewFocusIfNeeded[");
            sbLIZ.append(this.s0);
            sbLIZ.append("]: notShown currentUrl=");
            C1035880d3y c1035880d3y = ((C1039440d9i) this.l2).LIZ;
            sbLIZ.append(c1035880d3y != null ? c1035880d3y.getCurrentUrl() : null);
            sbLIZ.append(" refer=");
            C1035880d3y c1035880d3y2 = ((C1039440d9i) this.l2).LIZ;
            sbLIZ.append(c1035880d3y2 != null ? c1035880d3y2.getRefer() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (((WebView) this.l1).hasFocus()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestWebViewFocusIfNeeded[");
            sbLIZ2.append(this.s0);
            sbLIZ2.append("]: alreadyFocused currentUrl=");
            C1035880d3y c1035880d3y3 = ((C1039440d9i) this.l2).LIZ;
            sbLIZ2.append(c1035880d3y3 != null ? c1035880d3y3.getCurrentUrl() : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        ((WebView) this.l1).setFocusable(true);
        ((WebView) this.l1).setFocusableInTouchMode(true);
        boolean zRequestFocus = ((WebView) this.l1).requestFocus();
        boolean zRequestFocusFromTouch = !zRequestFocus ? ((WebView) this.l1).requestFocusFromTouch() : false;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("requestWebViewFocusIfNeeded[");
        sbLIZ3.append(this.s0);
        sbLIZ3.append("]: requestFocus=");
        sbLIZ3.append(zRequestFocus);
        sbLIZ3.append(" requestFocusFromTouch=");
        sbLIZ3.append(zRequestFocusFromTouch);
        sbLIZ3.append(" afterHasFocus=");
        sbLIZ3.append(((WebView) this.l1).hasFocus());
        sbLIZ3.append(" currentUrl=");
        C1035880d3y c1035880d3y4 = ((C1039440d9i) this.l2).LIZ;
        sbLIZ3.append(c1035880d3y4 != null ? c1035880d3y4.getCurrentUrl() : null);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final void LIZ$3() {
        WebView webView = (WebView) this.l1;
        String str = this.s0;
        InterfaceC1041500dD2 interfaceC1041500dD2 = ((AbstractC1041200dCY) this.l2).LJIIIIZZ;
        boolean zEnableWebGoogleLogin = interfaceC1041500dD2 != null ? interfaceC1041500dD2.enableWebGoogleLogin() : false;
        InterfaceC1041500dD2 interfaceC1041500dD22 = ((AbstractC1041200dCY) this.l2).LJIIIIZZ;
        boolean zPureMode = interfaceC1041500dD22 != null ? interfaceC1041500dD22.pureMode() : false;
        boolean zLJI = MethodIDManager.LJI(137969);
        if (!((Boolean) C0A6Y.LIZ.getValue()).booleanValue()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C823050WQl.LIZLLL().execute(new ARunnableS2S1110000_13(WebAdUserAgentServiceImpl.LIZIZ().LIZ(webView, str, zEnableWebGoogleLogin), str, zPureMode, 3));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public final void LIZ$4() {
        List<C1024760cm2> list = C1037010d5n.LJI;
        String str = this.s0;
        boolean zBooleanValue = ((Boolean) this.l1).booleanValue();
        C1037010d5n c1037010d5n = C1037010d5n.LIZ;
        FeatureCenterModel feature = ((AwemeRawAd) this.l2).getFeature();
        c1037010d5n.getClass();
        boolean zLJI = C1037010d5n.LJI(feature);
        FeatureCenterModel feature2 = ((AwemeRawAd) this.l2).getFeature();
        ((ArrayList) list).add(new C1024760cm2(feature2 != null ? feature2.externalAction : null, str, zBooleanValue, zLJI));
        C1037010d5n.LIZLLL.onNext(new Object());
    }

    public final void LIZ$5() {
        ICommerceLandPageRealtimeResourceModule iCommerceLandPageRealtimeResourceModule = (ICommerceLandPageRealtimeResourceModule) ((CommerceVideoDelegateKt) this.l1).LLLLLIL().VW0(ICommerceLandPageRealtimeResourceModule.class);
        if (iCommerceLandPageRealtimeResourceModule != null) {
            iCommerceLandPageRealtimeResourceModule.Zt0((AwemeRawAd) this.l2, this.s0);
            C824310WVh.LIZLLL(new ARunnableS8S2100000_16(this.s0, EnumC992050bvH.START, null, 1));
        } else {
            C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
            C1042680dEw.LIZ.getClass();
            c1001830cB3.log(C1042680dEw.LJIIJ, AFwS252S0000000_16.get$arr$(558));
        }
    }

    public final void LIZ$6() {
        Object c098200Yq;
        C1322610kWR c1322610kWR = (C1322610kWR) this.l1;
        String str = this.s0;
        InterfaceC1032600cyg interfaceC1032600cyg = (InterfaceC1032600cyg) this.l2;
        try {
            Uri uri = UriProtector.parse(str);
            c1322610kWR.getClass();
            boolean zLIZIZ = C1322610kWR.LIZIZ(uri);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIfInCache complete: ");
            sbLIZ.append(str);
            sbLIZ.append(", result: ");
            sbLIZ.append(zLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1322610kWR.LIZJ(new ARunnableS35S0110000_16(interfaceC1032600cyg, str, zLIZIZ, 5));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = this.s0;
        C1322610kWR c1322610kWR2 = (C1322610kWR) this.l1;
        InterfaceC1032600cyg interfaceC1032600cyg2 = (InterfaceC1032600cyg) this.l2;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkIfInCache exception: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", error: ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            C2188811AlT.LIZIZ(sbLIZ2);
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(interfaceC1032600cyg2, str2, 211);
            c1322610kWR2.getClass();
            C1322610kWR.LIZJ(aRunnableS116S0100000_16);
        }
    }

    public static final void run$0(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        DataCenter dataCenter = (DataCenter) aRunnableS20S1200000_16.l1;
        String str = aRunnableS20S1200000_16.s0;
        Object obj = aRunnableS20S1200000_16.l2;
        dataCenter.getClass();
        C1C7U.LIZ("DataCenter@6c12.put$1L");
        dataCenter.vQ2(obj, str);
        C1C7U.LIZIZ("DataCenter@6c12.put$1L");
    }

    public static final void run$1(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPLifeCycle@86e2.onExitWebPage$1");
        try {
            aRunnableS20S1200000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPLifeCycle@86e2.onExitWebPage$1");
    }

    public static final void run$10(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoPlayCompleted$lambda$30$$inlined$runOnWorkerThreadDelay$1");
        try {
            C21278918Pb c21278918Pb = C21278918Pb.LIZ;
            Context context = (Context) aRunnableS20S1200000_16.l1;
            Aweme aweme = (Aweme) aRunnableS20S1200000_16.l2;
            String str = aRunnableS20S1200000_16.s0;
            c21278918Pb.getClass();
            C21278918Pb.LIZIZ(context, aweme, str, true, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoPlayCompleted$lambda$30$$inlined$runOnWorkerThreadDelay$1");
    }

    public static final void run$11(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("DramaGuestLandingItemCell@fd17.onBindItemView$1$1");
        try {
            ((DramaGuestLandingItemCell) aRunnableS20S1200000_16.l1).LLILLL = ((RemoteImageView) aRunnableS20S1200000_16.l2).getWidth();
            ((DramaGuestLandingItemCell) aRunnableS20S1200000_16.l1).LLILZ = ((RemoteImageView) aRunnableS20S1200000_16.l2).getHeight();
            RemoteImageView remoteImageView = (RemoteImageView) aRunnableS20S1200000_16.l2;
            String str = aRunnableS20S1200000_16.s0;
            DramaGuestLandingItemCell dramaGuestLandingItemCell = (DramaGuestLandingItemCell) aRunnableS20S1200000_16.l1;
            C1324840ka2.LJIIJ(remoteImageView, str, dramaGuestLandingItemCell.LLILLL, dramaGuestLandingItemCell.LLILZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DramaGuestLandingItemCell@fd17.onBindItemView$1$1");
    }

    public static final void run$12(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("RootNode@4e6.switchNode$1");
        try {
            C1583630rJR c1583630rJR = (C1583630rJR) aRunnableS20S1200000_16.l1;
            String str = aRunnableS20S1200000_16.s0;
            Bundle bundle = (Bundle) aRunnableS20S1200000_16.l2;
            c1583630rJR.getClass();
            C486860J7k.LIZIZ(c1583630rJR.LLJI).kE0(str, bundle.getBoolean("isSmoothScroll", false));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RootNode@4e6.switchNode$1");
    }

    public static final void run$13(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("LandPagePreWarmHandler@d096.onAdAweme$1");
        try {
            aRunnableS20S1200000_16.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandPagePreWarmHandler@d096.onAdAweme$1");
    }

    public static final void run$14(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleManagerAppearExtKt@ee31.registerPlayDelayObserverForHide$2$1$runnable$1");
        try {
            if (C1007940cKu.LIZ((C1007900cKq) aRunnableS20S1200000_16.l1, aRunnableS20S1200000_16.s0, (AnoleComponentAppearModel) aRunnableS20S1200000_16.l2)) {
                C1007900cKq c1007900cKq = (C1007900cKq) aRunnableS20S1200000_16.l1;
                String str = aRunnableS20S1200000_16.s0;
                AnoleComponentAppearModel anoleComponentAppearModel = (AnoleComponentAppearModel) aRunnableS20S1200000_16.l2;
                InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
                if (interfaceC1007930cKt != null) {
                    interfaceC1007930cKt.Dk(anoleComponentAppearModel);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleManagerAppearExtKt@ee31.registerPlayDelayObserverForHide$2$1$runnable$1");
    }

    public static final void run$15(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleManagerAppearExtKt@ee31.registerPlayProgressObserverForHide$2$1$isSuccess$1");
        try {
            if (C1007940cKu.LIZ((C1007900cKq) aRunnableS20S1200000_16.l1, aRunnableS20S1200000_16.s0, (AnoleComponentAppearModel) aRunnableS20S1200000_16.l2)) {
                C1007900cKq c1007900cKq = (C1007900cKq) aRunnableS20S1200000_16.l1;
                String str = aRunnableS20S1200000_16.s0;
                AnoleComponentAppearModel anoleComponentAppearModel = (AnoleComponentAppearModel) aRunnableS20S1200000_16.l2;
                InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
                if (interfaceC1007930cKt != null) {
                    interfaceC1007930cKt.Dk(anoleComponentAppearModel);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleManagerAppearExtKt@ee31.registerPlayProgressObserverForHide$2$1$isSuccess$1");
    }

    public static final void run$16(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.composeAlternateImages$2");
        try {
            C1274810jHL c1274810jHL = (C1274810jHL) aRunnableS20S1200000_16.l2;
            if (c1274810jHL.LJJLIIIJ != null) {
                c1274810jHL.LLIIIZ(aRunnableS20S1200000_16.s0, true, false, true, (List) aRunnableS20S1200000_16.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.composeAlternateImages$2");
    }

    public static final void run$17(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.setAlternateImageWithId$1");
        try {
            Map<String, C1276670jKL> map = ((C1274810jHL) aRunnableS20S1200000_16.l2).LJJLIIIJ;
            if (map != null) {
                ((ConcurrentHashMap) map).put(aRunnableS20S1200000_16.s0, (C1276670jKL) aRunnableS20S1200000_16.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.setAlternateImageWithId$1");
    }

    public static final void run$18(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.initLandPagePrefetchHtmlTask$6");
        try {
            aRunnableS20S1200000_16.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.initLandPagePrefetchHtmlTask$6");
    }

    public static final void run$19(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoCacheDetector@f0a1.checkIfInCache$2");
        try {
            aRunnableS20S1200000_16.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoCacheDetector@f0a1.checkIfInCache$2");
    }

    public static final void run$2(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageTTWebModule@fad7.onUserEnterWebPage$2");
        try {
            aRunnableS20S1200000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageTTWebModule@fad7.onUserEnterWebPage$2");
    }

    public static final void run$20(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesCenterItemCell@21f6.onBindItemView$1$1");
        try {
            ((SeriesCenterItemCell) aRunnableS20S1200000_16.l1).LLJILJILJ = ((RemoteImageView) aRunnableS20S1200000_16.l2).getWidth();
            ((SeriesCenterItemCell) aRunnableS20S1200000_16.l1).LLJILLL = ((RemoteImageView) aRunnableS20S1200000_16.l2).getHeight();
            RemoteImageView remoteImageView = (RemoteImageView) aRunnableS20S1200000_16.l2;
            C1324840ka2.LJIIJ(remoteImageView, aRunnableS20S1200000_16.s0, remoteImageView.getWidth(), ((RemoteImageView) aRunnableS20S1200000_16.l2).getHeight());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesCenterItemCell@21f6.onBindItemView$1$1");
    }

    public static final void run$3(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS20S1200000_16.l1;
        Aweme aweme = (Aweme) aRunnableS20S1200000_16.l2;
        String str = aRunnableS20S1200000_16.s0;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.setUpInsightBottomView$5L");
        detailFragmentPanel.w0(aweme, str);
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.setUpInsightBottomView$5L");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0005, B:5:0x000e, B:7:0x0014, B:9:0x001c, B:10:0x0020, B:13:0x0029), top: B:20:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$4(Y.ARunnableS20S1200000_16 r5) {
        /*
            java.lang.String r4 = "AdWebSpecialManager@6e8e.queryThemeColor$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r0 = r5.l1     // Catch: java.lang.Throwable -> L3c
            X.0d9i r0 = (X.C1039440d9i) r0     // Catch: java.lang.Throwable -> L3c
            X.0d3y r0 = r0.LIZ     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.getCurrentUrl()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L29
            java.lang.Object r0 = r5.l1     // Catch: java.lang.Throwable -> L3c
            X.0d9i r0 = (X.C1039440d9i) r0     // Catch: java.lang.Throwable -> L3c
            X.0d3y r0 = r0.LIZ     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.getCurrentUrl()     // Catch: java.lang.Throwable -> L3c
        L20:
            java.lang.String r0 = r5.s0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L29
            goto L47
        L29:
            java.lang.Object r3 = r5.l2     // Catch: java.lang.Throwable -> L3c
            android.webkit.WebView r3 = (android.webkit.WebView) r3     // Catch: java.lang.Throwable -> L3c
            X.0dA7 r2 = new X.0dA7     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r1 = r5.l1     // Catch: java.lang.Throwable -> L3c
            X.0d9i r1 = (X.C1039440d9i) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r5.s0     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            X.C1544770qIl.LIZ(r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L47
        L3c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L47
            throw r1
        L47:
            X.C1C7U.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S1200000_16.run$4(Y.ARunnableS20S1200000_16):void");
    }

    public static final void run$5(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdWebViewExtension@5dea.requestWebViewFocusIfNeeded$1");
        try {
            aRunnableS20S1200000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdWebViewExtension@5dea.requestWebViewFocusIfNeeded$1");
    }

    public static final void run$6(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadServiceImpl@2dec.createPhotoPreloadClient$1");
        try {
            PreloadServiceImpl preloadServiceImpl = (PreloadServiceImpl) aRunnableS20S1200000_16.l1;
            Fragment fragment = (Fragment) aRunnableS20S1200000_16.l2;
            String str = aRunnableS20S1200000_16.s0;
            preloadServiceImpl.getClass();
            PreloadServiceImpl.LIZIZ(fragment, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadServiceImpl@2dec.createPhotoPreloadClient$1");
    }

    public static final void run$7(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("MyListItemCell@307c.onBindItemView$1$1");
        try {
            ((MyListItemCell) aRunnableS20S1200000_16.l1).LLIZ = ((RemoteImageView) aRunnableS20S1200000_16.l2).getWidth();
            ((MyListItemCell) aRunnableS20S1200000_16.l1).LLIZLLLIL = ((RemoteImageView) aRunnableS20S1200000_16.l2).getHeight();
            RemoteImageView remoteImageView = (RemoteImageView) aRunnableS20S1200000_16.l2;
            C1324840ka2.LJIIJ(remoteImageView, aRunnableS20S1200000_16.s0, remoteImageView.getWidth(), ((RemoteImageView) aRunnableS20S1200000_16.l2).getHeight());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MyListItemCell@307c.onBindItemView$1$1");
    }

    public static final void run$8(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdWebViewInterceptor@e3f6.handleResponseWithPreloadedHTML$1");
        try {
            aRunnableS20S1200000_16.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdWebViewInterceptor@e3f6.handleResponseWithPreloadedHTML$1");
    }

    public static final void run$9(ARunnableS20S1200000_16 aRunnableS20S1200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardCloseClick$$inlined$runOnWorkerThread$1");
        try {
            C21278918Pb c21278918Pb = C21278918Pb.LIZ;
            Context context = (Context) aRunnableS20S1200000_16.l1;
            Aweme aweme = (Aweme) aRunnableS20S1200000_16.l2;
            String str = aRunnableS20S1200000_16.s0;
            c21278918Pb.getClass();
            C21278918Pb.LIZIZ(context, aweme, str, true, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardCloseClick$$inlined$runOnWorkerThread$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS20S1200000_16(android.webkit.WebView r2, X.C1039440d9i r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l1 = r2
            r0.s0 = r4
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S1200000_16.<init>(android.webkit.WebView, X.0d9i, java.lang.String, int):void");
    }

    public ARunnableS20S1200000_16(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
