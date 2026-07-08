package X;

import Y.ACallableS26S1000000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.service.ILandingPageInterceptService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS1S1120000_16;
import kotlin.jvm.internal.AwS20S1110000_16;
import kotlin.jvm.internal.AwS2S1220000_16;
import kotlin.jvm.internal.AwS38S2000000_16;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0crb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028210crb implements InterfaceC988110bov {
    public static final String LJ() {
        return String.valueOf(C816140Vzw.LIZ);
    }

    public static final void LJIILLIIL() {
        C0N7R c0n7r = C626450Ohf.LLILLL;
        if (c0n7r != null) {
            c0n7r.run();
        }
        C626450Ohf.LLILLL = null;
    }

    public static final void LJIIZILJ() {
        C1024380clQ.LIZ.getClass();
    }

    public static final void LJJIJIIJI() {
        C1440005kM.LIZ(new C484240Iys());
    }

    public static final int LJFF() {
        return C0XQ7.LJFF().getCurUser().getAccountType();
    }

    public static final void LIZJ(String str) {
        boolean z = C0X2N.LIZ;
        if (!TextUtils.isEmpty(str) && C0X2N.LIZIZ) {
            C15O7.LIZIZ(new ACallableS26S1000000_13(str, 0), C823050WQl.LIZIZ(), null);
        }
    }

    public static final void LIZLLL(WebKitView webKitView) {
        int i = C585970MyZ.LIZ;
        if (webKitView != null) {
            webKitView.setWebChromeClient(null);
            C786410Ut5.te(webKitView, null);
            ViewParent parent = webKitView.getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(webKitView, (ViewGroup) parent);
                try {
                    webKitView.destroy();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static final boolean LJIIJJI(Activity activity) {
        return ((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LIZLLL(activity);
    }

    public static final void LJIILL(final AwemeRawAd awemeRawAd) {
        C1028250crf c1028250crf = new C1028250crf();
        c1028250crf.LIZ = "landing_ad";
        final long jCurrentTimeMillis = System.currentTimeMillis() - Mp4ScreenVideoLoadTimeout.CONTROL;
        final String str = c1028250crf.LIZ;
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Serializable(str, jCurrentTimeMillis, awemeRawAd, defaultConstructorMarker) { // from class: X.0cre
            public final AwemeRawAd awemeRawAd;
            public long startTime;
            public final String tag;

            public final String toJson() {
                return GsonProtectorUtils.toJson(new Gson(), this);
            }

            public final void setStartTime(long j) {
                this.startTime = j;
            }

            {
                this.tag = str;
                this.startTime = jCurrentTimeMillis;
                this.awemeRawAd = awemeRawAd;
            }
        };
    }

    public static final List<InterfaceC1051730dTX> LJIL(C1051660dTQ c1051660dTQ) {
        ArrayList arrayList = new ArrayList();
        IESJsBridge iESJsBridge = (IESJsBridge) c1051660dTQ.LIZIZ(IESJsBridge.class);
        Object objLIZIZ = c1051660dTQ.LIZIZ(Context.class);
        if (iESJsBridge != null && objLIZIZ != null) {
            C1018610cc7 c1018610cc7 = new C1018610cc7(new WeakReference(objLIZIZ));
            iESJsBridge.LIZ.hashCode();
            arrayList.add(C1047190dMD.LIZ(c1051660dTQ, "download_click", c1018610cc7));
        }
        return arrayList;
    }

    public static final List<InterfaceC1051730dTX> LJJ(C1051660dTQ c1051660dTQ) {
        ArrayList arrayList = new ArrayList();
        c1051660dTQ.LIZIZ(IESJsBridge.class);
        return arrayList;
    }

    public static final void LJJI(Activity activity) {
        C996170c1v.LIZ(activity);
    }

    public static final void LJJIIZ(C1039050d95 c1039050d95) {
        if (c1039050d95 instanceof C1039050d95) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJI(c1039050d95.LL);
        }
    }

    public static final void LJJIJIL(InterfaceC1028280cri interfaceC1028280cri) {
        DownloadBusiness downloadBusiness;
        Activity activity;
        if ((interfaceC1028280cri instanceof C1039050d95) && (downloadBusiness = (DownloadBusiness) ((C1039050d95) interfaceC1028280cri).LL.LIZIZ(DownloadBusiness.class)) != null && (activity = downloadBusiness.LIZ.getActivity()) != null) {
            int i = downloadBusiness.LIZJ;
            if (i == 0) {
                i = R.id.a81;
            }
            activity.findViewById(i);
        }
    }

    public final String LJII(String str) {
        if (ServiceManager.get().getService(IAdLandPagePreloadService.class) == null) {
            return "";
        }
        return LJI(str, "global");
    }

    public static final void LIZIZ(InterfaceC1028280cri interfaceC1028280cri, WebKitView webKitView) {
        DownloadBusiness downloadBusiness;
        if ((interfaceC1028280cri instanceof C1039050d95) && (webKitView instanceof WebKitView) && (downloadBusiness = (DownloadBusiness) ((C1039050d95) interfaceC1028280cri).LL.LIZIZ(DownloadBusiness.class)) != null) {
            downloadBusiness.LIZ(webKitView);
        }
    }

    public static final String LJI(String str, String str2) {
        IAdLandPagePreloadService iAdLandPagePreloadService;
        if (TextUtils.isEmpty(str) || (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) == null) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return C1552050qUV.LJ(iAdLandPagePreloadService.K0(str2), str);
    }

    public static final void LJIIIIZZ(C1039050d95 c1039050d95, WebKitView webKitView) {
        if ((c1039050d95 instanceof C1039050d95) && (webKitView instanceof WebKitView)) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIILIIL(c1039050d95.LL, webKitView);
        }
    }

    public static final void LJIJ(Object obj, String str) {
        if (obj instanceof C1039050d95) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LIZLLL(((C1039050d95) obj).LL, str);
        }
    }

    public static final boolean LJIJI(Context context, String str) {
        return C1025140cme.LJ(context, UriProtector.parse(str));
    }

    public static final boolean LJIJJ(Activity activity, String str) {
        return ((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJIILJJIL(activity, str);
    }

    public static final void LJJIFFI(Activity activity, String str) {
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        ComplianceServiceProvider.LJJ().LJFF(C1048440dOE.LIZIZ(awemeEr));
        ComplianceServiceProvider.LJJ().LIZJ(activity, C1048440dOE.LIZJ(awemeEr, "landing_page"));
    }

    public static final void LJJII(InterfaceC1028280cri interfaceC1028280cri, WebKitView webKitView) {
        if ((interfaceC1028280cri instanceof C1039050d95) && (webKitView instanceof WebKitView)) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIJI(((C1039050d95) interfaceC1028280cri).LL, webKitView);
            C2429209fW.LIZ().appendDataFlowId(webKitView, "402657282");
        }
    }

    public static final void LJJIII(C1039050d95 c1039050d95, boolean z) {
        if (c1039050d95 instanceof C1039050d95) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJ(c1039050d95.LL, z);
        }
    }

    public static final String LJJIJ(String str, String str2) {
        if (Intrinsics.LJFF("sslocal", str) || Intrinsics.LJFF("localsdk", str)) {
            return C1039210d9L.LIZJ(str2);
        }
        return str2;
    }

    public static final void LJJIJIIJIL(Context context, WebKitView webKitView) {
        int i = C585970MyZ.LIZ;
        if (context != null && webKitView != null) {
            ((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJIIJ();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null && activityLIZ.isFinishing()) {
                try {
                    C848930XRz.LIZ(webKitView, "about:blank");
                    if (C585970MyZ.LIZ > 0) {
                        View rootView = webKitView.getRootView();
                        if (rootView instanceof ViewGroup) {
                            View childAt = ((ViewGroup) rootView).getChildAt(0);
                            childAt.setDrawingCacheEnabled(true);
                            Bitmap bitmapLIZLLL = C842150X1x.LIZLLL(childAt, CertProviderManagerKt.findCert("bpea-crossplatform_webview_thumbnail", 1476435984));
                            Objects.requireNonNull(bitmapLIZLLL);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZLLL);
                            childAt.setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activityLIZ);
                            imageView.setImageBitmap(bitmapCreateBitmap);
                            C786410Ut5.LJZI(0, imageView);
                            ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Logger.debug();
            }
        }
    }

    public static final void LJJIJL(InterfaceC1028280cri interfaceC1028280cri, String str) {
        if (interfaceC1028280cri instanceof C1039050d95) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LIZ(((C1039050d95) interfaceC1028280cri).LL, str);
        }
    }

    public static final void LIZ(String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download");
        if (z2) {
            jSONObjectPut.put("container_type", "bullet");
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("h5_block_app_url", 0, jSONObjectPut);
    }

    public static final boolean LJIILIIL(String str, String str2, List<String> list) {
        boolean zStartsWith;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        if (str2 == null) {
            str2 = UriProtector.parse(str).getScheme();
        }
        if (!TextUtils.equals(str2, "sslocal")) {
            if (!TextUtils.isEmpty(null)) {
                Iterator<String> it2 = list.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw null;
                }
            }
            for (String str3 : list) {
                if (str != null && str2 != null && str3 != null) {
                    if (!str3.contains(":")) {
                        zStartsWith = TextUtils.equals(str2, str3);
                    } else {
                        zStartsWith = str.startsWith(str3);
                    }
                    if (zStartsWith) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void LJIILJJIL(String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked");
        if (z2) {
            jSONObjectPut.put("container_type", "bullet");
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("h5_block_app_url", 0, jSONObjectPut);
    }

    public static final void LJIJJLI(String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("jump_url", str).put("jump_has_click", z);
        if (z2) {
            jSONObjectPut.put("container_type", "bullet");
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("h5_block_app_url", 1, jSONObjectPut);
    }

    public static final void LJJIIJZLJL(Context context, View view, C1365870leD c1365870leD) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJIL(context, view, c1365870leD);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIZ(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028210crb.LJIIIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public static boolean LJIIL(Context context, InterfaceC1036110d4L interfaceC1036110d4L, Aweme aweme, Uri uri, boolean z) {
        AwemeRawAd awemeRawAd;
        C1040740dBo c1040740dBo;
        if (C1073980e3Q.LLILZIL || interfaceC1036110d4L == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        C1054200dXW c1054200dXWLIZIZ = null;
        ICommerceGooglePlayService iCommerceGooglePlayService = (ICommerceGooglePlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceGooglePlayService.class, false, false, false, 14, null);
        C1035880d3y c1035880d3y = null;
        if (iCommerceGooglePlayService != null) {
            C0N1S c0n1s = C0N1S.LANDING_AD;
            new C1028260crg(c0n1s);
            if ((interfaceC1036110d4L instanceof C1040740dBo) && (c1040740dBo = (C1040740dBo) interfaceC1036110d4L) != null) {
                c1035880d3y = c1040740dBo.LL;
            }
            c1054200dXWLIZIZ = iCommerceGooglePlayService.LIZIZ(new C1028270crh(c0n1s, c1035880d3y, z));
        }
        ILandingPageInterceptService iLandingPageInterceptService = (ILandingPageInterceptService) PluggableExtentionKt.pluggableSpi$default(ILandingPageInterceptService.class, false, false, false, 14, null);
        if (iLandingPageInterceptService == null) {
            return false;
        }
        return iLandingPageInterceptService.LIZ(context, awemeRawAd, uri, z, c1054200dXWLIZIZ);
    }

    public static final void LJJIIZI(String str, Long l, String str2, String str3, List list, String str4) {
        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
        new AwS38S2000000_16(str4, str3, 0);
        c2201701BEy.getClass();
        C2201701BEy.LIZIZ(str, list, l, str2, null);
    }

    public final boolean LJIIJ(final Uri uri, String str, final Context context, String str2, final Aweme aweme, boolean z, final boolean z2, final C1040740dBo c1040740dBo, final Boolean bool, Boolean bool2) throws Throwable {
        boolean z3;
        final String str3 = str2;
        if (context == null) {
            return false;
        }
        String str4 = "";
        if (Intrinsics.LJFF(uri.getScheme(), "market")) {
            boolean zLJIIL = LJIIL(context, c1040740dBo, aweme, uri, z2);
            if (zLJIIL) {
                C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                boolean zLIZ = C1024900cmG.LIZ(context);
                c1029270ctJ.getClass();
                int iLIZ = C1029270ctJ.LIZ(true, zLIZ);
                Boolean bool3 = Boolean.FALSE;
                c1029270ctJ.getClass();
                C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ, bool3, zLJIIL);
                return true;
            }
            if (C1024900cmG.LIZ(context)) {
                if (!z2 && C0A1U.LIZ()) {
                    C1073990e3R.LIZ(context, new AwS1S1120000_16(c1040740dBo, str3, z2, zLJIIL, 1), new AwS165S1100000_16(context, str3, 2), new AwS165S1100000_16(c1040740dBo, str3, 3));
                    return true;
                }
                C1024900cmG.LJ(context, uri);
                C1029270ctJ c1029270ctJ2 = C1029270ctJ.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                c1029270ctJ2.getClass();
                int iLIZ2 = C1029270ctJ.LIZ(true, true);
                Boolean bool4 = Boolean.FALSE;
                c1029270ctJ2.getClass();
                C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ2, bool4, false);
                return true;
            }
            C1029270ctJ c1029270ctJ3 = C1029270ctJ.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            boolean zLIZ2 = C1024900cmG.LIZ(context);
            c1029270ctJ3.getClass();
            int iLIZ3 = C1029270ctJ.LIZ(true, zLIZ2);
            Boolean bool5 = Boolean.FALSE;
            c1029270ctJ3.getClass();
            C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ3, bool5, false);
            return false;
        }
        if (C1024900cmG.LIZIZ(uri)) {
            boolean zLJIIL2 = LJIIL(context, c1040740dBo, aweme, uri, z2);
            if (zLJIIL2) {
                C1029270ctJ c1029270ctJ4 = C1029270ctJ.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                boolean zLIZ3 = C1024900cmG.LIZ(context);
                c1029270ctJ4.getClass();
                int iLIZ4 = C1029270ctJ.LIZ(true, zLIZ3);
                Boolean bool6 = Boolean.FALSE;
                c1029270ctJ4.getClass();
                C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ4, bool6, zLJIIL2);
                return true;
            }
            if (C1024900cmG.LIZ(context)) {
                C1024900cmG.LJI(context, uri);
                return true;
            }
            if (C1024900cmG.LIZ(context)) {
                if (!z2 && C0A1T.LIZ()) {
                    C1073990e3R.LIZ(context, new AwS1S1120000_16(c1040740dBo, str3, z2, zLJIIL2, 2), new AwS165S1100000_16(context, str3, 4), new AwS165S1100000_16(c1040740dBo, str3, 5));
                    return true;
                }
                C1024900cmG.LJI(context, uri);
                C1029270ctJ c1029270ctJ5 = C1029270ctJ.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                c1029270ctJ5.getClass();
                int iLIZ5 = C1029270ctJ.LIZ(true, true);
                Boolean bool7 = Boolean.FALSE;
                c1029270ctJ5.getClass();
                C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ5, bool7, false);
                return true;
            }
            C1029270ctJ c1029270ctJ6 = C1029270ctJ.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            boolean zLIZ4 = C1024900cmG.LIZ(context);
            c1029270ctJ6.getClass();
            int iLIZ6 = C1029270ctJ.LIZ(true, zLIZ4);
            Boolean bool8 = Boolean.FALSE;
            c1029270ctJ6.getClass();
            C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ6, bool8, false);
            return false;
        }
        if (AbstractC1025070cmX.LJIIL(uri)) {
            System.currentTimeMillis();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ad_web_jump_app_config", true) == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            Boolean bool9 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool9) && z3 && !Intrinsics.LJFF(bool2, bool9)) {
                final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                final C013C c013c = new C013C();
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0crc
                    public final void LIZ() {
                        c013c.element = C1025140cme.LIZJ(context, uri);
                        Handler handler = bPEAHandler;
                        final C013C c013c2 = c013c;
                        final C1028210crb c1028210crb = this;
                        final Context context2 = context;
                        final InterfaceC1036110d4L interfaceC1036110d4L = c1040740dBo;
                        final Aweme aweme2 = aweme;
                        final Uri uri2 = uri;
                        final boolean z4 = z2;
                        final String str5 = str3;
                        final Boolean bool10 = bool;
                        C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0crd
                            public final void LIZ() {
                                if (!c013c2.element || C1906580ziK.LJI()) {
                                    return;
                                }
                                C1028210crb c1028210crb2 = c1028210crb;
                                Context context3 = context2;
                                InterfaceC1036110d4L interfaceC1036110d4L2 = interfaceC1036110d4L;
                                Aweme aweme3 = aweme2;
                                Uri uri3 = uri2;
                                boolean z5 = z4;
                                c1028210crb2.getClass();
                                boolean zLJIIL3 = C1028210crb.LJIIL(context3, interfaceC1036110d4L2, aweme3, uri3, z5);
                                if (!z4 && C0A1T.LIZ()) {
                                    C1073990e3R.LIZ(context2, new AwS2S1220000_16(interfaceC1036110d4L, str5, z4, bool10, zLJIIL3, 0), new AwS20S1110000_16(context2, str5, zLJIIL3, 1), new AwS165S1100000_16(interfaceC1036110d4L, str5, 6));
                                    return;
                                }
                                if (zLJIIL3 || C1906580ziK.LJI()) {
                                    return;
                                }
                                C1029270ctJ c1029270ctJ7 = C1029270ctJ.LIZ;
                                InterfaceC1036110d4L interfaceC1036110d4L3 = interfaceC1036110d4L;
                                String str6 = str5;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                boolean z6 = z4;
                                c1029270ctJ7.getClass();
                                C1029270ctJ.LIZIZ(interfaceC1036110d4L3, str6, z6, C1029270ctJ.LIZ(true, true), bool10, false);
                                C1025140cme.LJ(context2, uri2);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ5;
                                C1C7U.LIZ("AdLandPageDependImpl@535e.handleOpenVastApp$7$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ5) {
                                    }
                                }
                                C1C7U.LIZIZ("AdLandPageDependImpl@535e.handleOpenVastApp$7$1");
                            }
                        });
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ5;
                        C1C7U.LIZ("AdLandPageDependImpl@535e.handleOpenVastApp$7");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ5) {
                            }
                        }
                        C1C7U.LIZIZ("AdLandPageDependImpl@535e.handleOpenVastApp$7");
                    }
                });
            } else if (Intrinsics.LJFF(bool, bool9) && C1025140cme.LIZJ(context, uri)) {
                boolean zLJIIL3 = LJIIL(context, c1040740dBo, aweme, uri, z2);
                boolean z4 = !C1025140cme.LIZJ(context, uri);
                if (!z2 && !z4 && C0A1T.LIZ()) {
                    C1073990e3R.LIZ(context, new AwS2S1220000_16(c1040740dBo, str3, z2, bool, zLJIIL3, 1), new AwS20S1110000_16(context, str3, zLJIIL3, 2), new AwS165S1100000_16(c1040740dBo, str3, 0));
                    return true;
                }
                C1029270ctJ c1029270ctJ7 = C1029270ctJ.LIZ;
                if (str3 != null) {
                    str4 = str3;
                }
                c1029270ctJ7.getClass();
                C1029270ctJ.LIZIZ(c1040740dBo, str4, z2, C1029270ctJ.LIZ(true, true), bool, zLJIIL3);
                if (zLJIIL3) {
                    return true;
                }
                C1025140cme.LJ(context, uri);
                return true;
            }
            return false;
        }
        if (!C1045220dJ2.LJIIIZ(aweme) && !C1045220dJ2.LJIIIIZZ(aweme)) {
            return false;
        }
        if (!z) {
            C1029270ctJ c1029270ctJ8 = C1029270ctJ.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            c1029270ctJ8.getClass();
            int iLIZ7 = C1029270ctJ.LIZ(false, true);
            Boolean bool10 = Boolean.FALSE;
            c1029270ctJ8.getClass();
            C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ7, bool10, false);
            return false;
        }
        boolean zLJIIL4 = LJIIL(context, c1040740dBo, aweme, uri, z2);
        boolean zLIZLLL = C1025140cme.LIZLLL(context, uri);
        if (!z2 && zLIZLLL && C0A1U.LIZ()) {
            C1073990e3R.LIZ(context, new AwS1S1120000_16(c1040740dBo, str3, z2, zLJIIL4, 0), new AwS20S1110000_16(context, str3, zLJIIL4, 0), new AwS165S1100000_16(c1040740dBo, str3, 1));
            return true;
        }
        C1029270ctJ c1029270ctJ9 = C1029270ctJ.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1029270ctJ9.getClass();
        int iLIZ8 = C1029270ctJ.LIZ(true, zLIZLLL);
        Boolean bool11 = Boolean.FALSE;
        c1029270ctJ9.getClass();
        C1029270ctJ.LIZIZ(c1040740dBo, str3, z2, iLIZ8, bool11, zLJIIL4);
        if (zLJIIL4) {
            return true;
        }
        if (C1025140cme.LIZLLL(context, uri)) {
            C1025140cme.LJI(context, uri);
            return true;
        }
        if (!Intrinsics.LJFF("sslocal", str)) {
            Intrinsics.LJFF("localsdk", str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ(X.C19EG r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, int r26, java.lang.String r27, int r28, boolean r29, com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel r30, com.ss.android.ugc.aweme.feed.model.Aweme r31) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028210crb.LJJIIJ(X.19EG, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, int, boolean, com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
