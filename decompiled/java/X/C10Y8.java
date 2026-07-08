package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDeepLinkApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Y8 extends C10YC {
    public final String LIZIZ;
    public Uri LIZJ;
    public String LIZLLL;
    public boolean LJFF;
    public final boolean LIZ = true;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1461));

    public C10Y8(String str) {
        this.LIZIZ = str;
    }

    @Override // X.C10YC
    public final Uri LIZ(final Uri uri, final C1950707kX c1950707kX) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IDeepLinkApi iDeepLinkApi;
        C0X9S<TypedInput> c0x9sFetchLongUrl;
        if (c1950707kX == null) {
            return null;
        }
        C10YA c10ya = C10YA.LIZ;
        String string = uri.toString();
        c10ya.getClass();
        IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
        if (iKMPDeeplinkServiceLIZ != null) {
            iKMPDeeplinkServiceLIZ.LJ(string);
        }
        C19263710Xz c19263710Xz = C19263710Xz.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c19263710Xz.getClass();
        C19263710Xz.LIZLLL = jCurrentTimeMillis;
        if (C10YA.LIZJ(uri)) {
            C10SW.LIZ.getClass();
            C10SW.LJIILL(false, uri);
            IKMPDeeplinkService iKMPDeeplinkService = (IKMPDeeplinkService) PluggableExtentionKt.pluggableSpi$default(IKMPDeeplinkService.class, false, false, false, 14, null);
            if (iKMPDeeplinkService != null) {
                iKMPDeeplinkService.LJFF(uri.toString(), C10Y9.LJFF(uri), new AwS237S0300000_28(this, uri, c1950707kX, 12));
            }
        } else {
            C10SW.LIZ.getClass();
            C10SW.LJIILL(false, uri);
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIILLIIL = false;
            c1493620oyG.LJIIIZ = true;
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(uri.toString())) != null && (iDeepLinkApi = (IDeepLinkApi) interfaceC2661011fLIZ.create(IDeepLinkApi.class)) != null && (c0x9sFetchLongUrl = iDeepLinkApi.fetchLongUrl(uri.toString(), c1493620oyG)) != null) {
                c0x9sFetchLongUrl.enqueue(new InterfaceC594300NSq<TypedInput>() { // from class: X.10YG
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                        C10Y8 c10y8 = this.LL;
                        Uri uri2 = uri;
                        c10y8.getClass();
                        C10Y8.LJFF(uri2, "", "ttNet redirectUrl trans fail", false);
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                        boolean z;
                        String strLIZIZ;
                        C2175508fh c2175508fh = c0x52.LIZ;
                        int i = c2175508fh.LIZIZ;
                        if (300 <= i && i < 400) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            strLIZIZ = "";
                        } else {
                            C10YA c10ya2 = C10YA.LIZ;
                            List<C080U> list = c2175508fh.LIZLLL;
                            c10ya2.getClass();
                            strLIZIZ = C10YA.LIZIZ(list);
                            c0x9s.cancel();
                            this.LL.getClass();
                        }
                        if (TextUtils.isEmpty(strLIZIZ)) {
                            C10Y8 c10y8 = this.LL;
                            Uri uri2 = uri;
                            c10y8.getClass();
                            C10Y8.LJFF(uri2, "", "ttNet redirectUrl is empty", false);
                            return;
                        }
                        C10Y8 c10y82 = this.LL;
                        Uri uri3 = uri;
                        c10y82.getClass();
                        C10Y8.LJFF(uri3, strLIZIZ, "ttNet redirectUrl", true);
                        this.LL.LJ(uri, strLIZIZ, c1950707kX);
                        C10YA c10ya3 = C10YA.LIZ;
                        Uri uri4 = uri;
                        boolean zLJFF = C10Y9.LJFF(uri4);
                        c10ya3.getClass();
                        C10YA.LJFF(uri4, strLIZIZ, zLJFF);
                        this.LL.LIZLLL(uri, strLIZIZ);
                    }
                });
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musically");
        sbLIZ.append("://shortlink");
        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.net.Uri r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10Y8.LIZLLL(android.net.Uri, java.lang.String):void");
    }

    public final void LJ(Uri uri, String str, C1950707kX c1950707kX) {
        try {
            Uri uri2 = UriProtector.parse(str);
            this.LIZLLL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "user_id");
            Uri.Builder builderBuildUpon = UriProtector.parse(uri2.toString()).buildUpon();
            int i = 0;
            builderBuildUpon.appendQueryParameter("convert_url", ((String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"?"}, 0, 6).toArray(new String[0]))[0]);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "backurl");
            if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                builderBuildUpon.appendQueryParameter("backurl", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            Uri uriBuild = builderBuildUpon.build();
            String[] strArrLIZ = C1E66.LIZ();
            int length = strArrLIZ.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Intrinsics.LJFF(strArrLIZ[i], uriBuild.getHost())) {
                    this.LIZJ = new C10YB().LIZ(uriBuild, c1950707kX);
                    break;
                }
                i++;
            }
            if (this.LIZJ == null) {
                this.LIZJ = new C19266310Yz().LIZ(uriBuild, c1950707kX);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19263710Xz.LIZLLL(2004, uri, "short_2_long");
        }
    }

    public static void LJFF(Uri uri, String str, String str2, boolean z) {
        C19263710Xz c19263710Xz = C19263710Xz.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c19263710Xz.getClass();
        C19263710Xz.LJ = jCurrentTimeMillis;
        if (!z) {
            C10SW.LIZ.getClass();
            C10SW.LJIILJJIL(false, uri);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("short2long ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C19263710Xz.LIZLLL(2015, uri, "short_2_long");
            return;
        }
        C10SW.LIZ.getClass();
        C10SW.LJIILLIIL(uri, str, false);
        C19263710Xz.LJFF = C1906580ziK.LJI();
    }
}
