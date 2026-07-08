package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDeepLinkApi;
import com.ss.android.ugc.aweme.api.LinkTransResult;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.10Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Y7 extends C10YC {
    public Uri LIZ;
    public String LIZIZ;
    public final boolean LIZJ = true;
    public final Context LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;

    public static void LJ(Uri uri, String str) {
        String lastPathSegment;
        Map<String, String> map = C19219410Gy.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        map.put(C2188811AlT.LIZIZ(sbLIZ), str);
        if (!((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJZ(str)) {
            C1400160mXW.LIZ.getClass();
            if (!PatternProtector.compile("(?:share/)?@.*/video/(\\w+)/?").matcher(str).find()) {
                return;
            }
        }
        C1400160mXW c1400160mXW = C1400160mXW.LIZ;
        Uri uri2 = UriProtector.parse(str);
        c1400160mXW.getClass();
        if (!C1400160mXW.LIZIZ(uri2, "video_detail", "1") && ((IStrategyCenterService) ServiceManager.get().getService(IStrategyCenterService.class)).LJII()) {
            IFeedModuleService iFeedModuleService = (IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class);
            try {
                lastPathSegment = UriProtector.parse(str).getLastPathSegment();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            iFeedModuleService.getInsertAwemeInfoAsync(lastPathSegment, "", true);
        }
    }

    @Override // X.C10YC
    public final Uri LIZ(Uri uri, C1950707kX c1950707kX) {
        C10YA c10ya = C10YA.LIZ;
        String string = uri.toString();
        c10ya.getClass();
        IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
        if (iKMPDeeplinkServiceLIZ != null) {
            iKMPDeeplinkServiceLIZ.LJ(string);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musically");
        sbLIZ.append("://");
        sbLIZ.append("shortlink");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c10ya.getClass();
        if (C10YA.LIZJ(uri)) {
            LJII(uri, c1950707kX);
        } else {
            LJI(uri, c1950707kX);
        }
        return UriProtector.parse(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.net.Uri r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10Y7.LIZLLL(android.net.Uri, java.lang.String):void");
    }

    public final void LJI(final Uri uri, final C1950707kX c1950707kX) {
        if (uri == null) {
            return;
        }
        Map<String, String> map = C19219410Gy.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        String str = (String) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            LJFF(uri, str, c1950707kX);
            LIZLLL(uri, str);
            return;
        }
        C10SW c10sw = C10SW.LIZ;
        boolean z = this.LJ;
        c10sw.getClass();
        C10SW.LJIILL(z, uri);
        C19263710Xz c19263710Xz = C19263710Xz.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c19263710Xz.getClass();
        C19263710Xz.LIZLLL = jCurrentTimeMillis;
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LJIILLIIL = false;
        c1493620oyG.LJIIIZ = true;
        C0X9S<TypedInput> c0x9sFetchLongUrl = ((IDeepLinkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(uri.toString()).create(IDeepLinkApi.class)).fetchLongUrl(uri.toString(), c1493620oyG);
        final InterfaceC19262510Xn interfaceC19262510XnLJ = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJ();
        c0x9sFetchLongUrl.enqueue(new InterfaceC594300NSq<TypedInput>() { // from class: X.10YD
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                C19263710Xz c19263710Xz2 = C19263710Xz.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c19263710Xz2.getClass();
                C19263710Xz.LJ = jCurrentTimeMillis2;
                interfaceC19262510XnLJ.LJFF();
                C10SW c10sw2 = C10SW.LIZ;
                Uri uri2 = uri;
                boolean z2 = this.LLILZ.LJ;
                c10sw2.getClass();
                C10SW.LJIILJJIL(z2, uri2);
                C19263710Xz.LIZLLL(2004, uri, "short_2_long");
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                String strLIZIZ;
                C19263710Xz c19263710Xz2 = C19263710Xz.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c19263710Xz2.getClass();
                C19263710Xz.LJ = jCurrentTimeMillis2;
                C2175508fh c2175508fh = c0x52.LIZ;
                int i = c2175508fh.LIZIZ;
                if (i >= 300 && i < 400) {
                    C10YA c10ya = C10YA.LIZ;
                    List<C080U> list = c2175508fh.LIZLLL;
                    c10ya.getClass();
                    strLIZIZ = C10YA.LIZIZ(list);
                    if (c0x9s != null) {
                        c0x9s.cancel();
                    }
                } else {
                    strLIZIZ = "";
                }
                if (TextUtils.isEmpty(strLIZIZ)) {
                    interfaceC19262510XnLJ.LJFF();
                    C10SW c10sw2 = C10SW.LIZ;
                    Uri uri2 = uri;
                    boolean z2 = this.LLILZ.LJ;
                    c10sw2.getClass();
                    C10SW.LJIILJJIL(z2, uri2);
                    C19263710Xz.LIZLLL(2004, uri, "short_2_long");
                    return;
                }
                C10Y7 c10y7 = this.LLILZ;
                if (c10y7.LJ) {
                    C10Y7.LJ(uri, strLIZIZ);
                } else {
                    c10y7.LJFF(uri, strLIZIZ, c1950707kX);
                }
                C10YA c10ya2 = C10YA.LIZ;
                Uri uri3 = uri;
                boolean z3 = this.LLILZ.LJFF;
                c10ya2.getClass();
                C10YA.LJFF(uri3, strLIZIZ, z3);
                boolean z4 = C2214201BlK.LJIIJJI;
                C19263710Xz.LJFF = z4;
                interfaceC19262510XnLJ.LIZLLL(z4);
                C10SW c10sw3 = C10SW.LIZ;
                Uri uri4 = uri;
                boolean z5 = this.LLILZ.LJ;
                c10sw3.getClass();
                C10SW.LJIILLIIL(uri4, strLIZIZ, z5);
                C10Y7 c10y72 = this.LLILZ;
                if (!c10y72.LJ) {
                    c10y72.LIZLLL(uri, strLIZIZ);
                }
            }
        });
    }

    public final void LJII(final Uri uri, final C1950707kX c1950707kX) {
        if (uri == null) {
            return;
        }
        Map<String, String> map = C19219410Gy.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        String str = (String) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            LJFF(uri, str, c1950707kX);
            LIZLLL(uri, str);
            return;
        }
        C10SW c10sw = C10SW.LIZ;
        boolean z = this.LJ;
        c10sw.getClass();
        C10SW.LJIILL(z, uri);
        final InterfaceC19262510Xn interfaceC19262510XnLJ = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C19263710Xz.LIZ.getClass();
        C19263710Xz.LIZLLL = jCurrentTimeMillis;
        C10YM c10ym = C10YM.LIZ;
        String string = uri.toString();
        c10ym.getClass();
        C10YM.LIZIZ.transUrl(string).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.10YF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C10Y7 c10y7 = this.LL;
                InterfaceC19262510Xn interfaceC19262510Xn = interfaceC19262510XnLJ;
                Uri uri2 = uri;
                C1950707kX c1950707kX2 = c1950707kX;
                long j = jCurrentTimeMillis;
                c10y7.getClass();
                C1C7U.LIZ("ShortLinkHandler@f1bd.startTransUrl$1L");
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C19263710Xz.LIZ.getClass();
                C19263710Xz.LJ = jCurrentTimeMillis2;
                String str2 = ((LinkTransResult) obj).longUrl;
                if (TextUtils.isEmpty(str2)) {
                    interfaceC19262510Xn.LJFF();
                    C10SW c10sw2 = C10SW.LIZ;
                    boolean z2 = c10y7.LJ;
                    c10sw2.getClass();
                    C10SW.LJIILJJIL(z2, uri2);
                    C19263710Xz.LIZLLL(2015, uri2, "short_2_long");
                    C1C7U.LIZIZ("ShortLinkHandler@f1bd.startTransUrl$1L");
                    return;
                }
                if (c10y7.LJ) {
                    C10Y7.LJ(uri2, str2);
                } else {
                    c10y7.LJFF(uri2, str2, c1950707kX2);
                }
                C10YA c10ya = C10YA.LIZ;
                boolean z3 = c10y7.LJFF;
                c10ya.getClass();
                C10YA.LJFF(uri2, str2, z3);
                boolean z4 = C2214201BlK.LJIIJJI;
                C19263710Xz.LJFF = z4;
                interfaceC19262510Xn.LIZLLL(z4);
                C10SW c10sw3 = C10SW.LIZ;
                boolean z5 = c10y7.LJ;
                c10sw3.getClass();
                C10SW.LJIILLIIL(uri2, str2, z5);
                if (!c10y7.LJ) {
                    c10y7.LIZLLL(uri2, str2);
                    String string2 = uri2.toString();
                    long j2 = jCurrentTimeMillis2 - j;
                    IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
                    if (iKMPDeeplinkServiceLIZ != null) {
                        iKMPDeeplinkServiceLIZ.LIZIZ(j2, string2, true);
                    }
                }
                C1C7U.LIZIZ("ShortLinkHandler@f1bd.startTransUrl$1L");
            }
        }, new C09JN() { // from class: X.10YK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C10Y7 c10y7 = this.LL;
                InterfaceC19262510Xn interfaceC19262510Xn = interfaceC19262510XnLJ;
                Uri uri2 = uri;
                long j = jCurrentTimeMillis;
                c10y7.getClass();
                C1C7U.LIZ("ShortLinkHandler@f1bd.startTransUrl$2L");
                C19263710Xz c19263710Xz = C19263710Xz.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c19263710Xz.getClass();
                C19263710Xz.LJ = jCurrentTimeMillis2;
                interfaceC19262510Xn.LJFF();
                C10SW c10sw2 = C10SW.LIZ;
                boolean z2 = c10y7.LJ;
                c10sw2.getClass();
                C10SW.LJIILJJIL(z2, uri2);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                C10YA c10ya = C10YA.LIZ;
                String string2 = uri2.toString();
                long j2 = jCurrentTimeMillis3 - j;
                c10ya.getClass();
                IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
                if (iKMPDeeplinkServiceLIZ != null) {
                    iKMPDeeplinkServiceLIZ.LIZIZ(j2, string2, false);
                }
                C19263710Xz.LIZLLL(2015, uri2, "short_2_long");
                C1C7U.LIZIZ("ShortLinkHandler@f1bd.startTransUrl$2L");
            }
        });
    }

    public final void LJFF(Uri uri, String str, C1950707kX c1950707kX) {
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "backurl");
            Uri uri2 = UriProtector.parse(str);
            this.LIZIZ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "user_id");
            Uri.Builder builderBuildUpon = UriProtector.parse(uri2.toString()).buildUpon();
            int i = 0;
            builderBuildUpon.appendQueryParameter("convert_url", str.split("\\?")[0]);
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                builderBuildUpon.appendQueryParameter("backurl", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            Uri uriBuild = builderBuildUpon.build();
            String[] strArrLIZ = C1E66.LIZ();
            while (true) {
                if (i >= strArrLIZ.length) {
                    break;
                }
                if (strArrLIZ[i].equals(uriBuild.getHost())) {
                    this.LIZ = new C10YB().LIZ(uriBuild, c1950707kX);
                    break;
                }
                i++;
            }
            if (this.LIZ == null) {
                this.LIZ = new C19266310Yz().LIZ(uriBuild, c1950707kX);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19263710Xz.LIZLLL(2004, uri, "short_2_long");
        }
    }

    public C10Y7(Context context, String str, boolean z, boolean z2) {
        this.LIZLLL = context;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = str;
    }
}
