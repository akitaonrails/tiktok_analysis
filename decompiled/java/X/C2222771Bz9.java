package X;

import Y.AObjectS81S0000000_34;
import Y.ARunnableS134S0100000_34;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.net3rd.api.I3rdNetworkIdentifier;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.facebook.net.IDownloadImage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.I3rdPriorityDownloadImage;
import com.ss.android.ugc.aweme.image.ImageDownloaderApi;
import com.ss.android.ugc.aweme.image.PriorityDownloadAdapter;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.NetworkTypeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222771Bz9 extends AbstractC1339120kx4 {
    public volatile C0X9S<TypedInput> LJ;
    public C1339030kwv LJFF;
    public final C01GW<Set<String>> LJI = C452501pT.LIZIZ(new AObjectS81S0000000_34(4));

    @Override // X.InterfaceC1334000koo
    public final void cancel() {
        if (this.LJ != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.LJ.cancel();
            } else {
                this.LIZ.execute(new ARunnableS134S0100000_34(this, 46));
            }
        }
    }

    public static Throwable LJ(Throwable th) {
        if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            return new C1494690ozz(new C1494430ozZ(c1494690ozz.getStatusCode(), C786410Ut5.j4("statusCode: %d  %s, traceCode: %s, url: %s, requestHeaders: %s, responseHeaders: %s, requestLog: %s, extraInfo: %s", new Object[]{Integer.valueOf(c1494690ozz.getStatusCode()), c1494690ozz.getMessage(), c1494690ozz.getTraceCode(), c1494690ozz.url, c1494690ozz.getRequestInfo().LJJIIZI, c1494690ozz.getRequestInfo().LJJIJ, c1494690ozz.getRequestInfo().LJJIIJ, C786410Ut5.J3(c1494690ozz.getRequestInfo().LJJIIJZLJL)})), c1494690ozz.getRequestInfo(), c1494690ozz.getCronetInternalErrorCode());
        }
        return th;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(X.C0X52 r6) {
        /*
            java.lang.String r0 = "max-age=\\d+"
            java.util.regex.Pattern r5 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            r4 = 0
            X.08fh r0 = r6.LIZ     // Catch: java.lang.Exception -> L43
            java.util.List<X.080U> r1 = r0.LIZLLL     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L30
            int r0 = r1.size()     // Catch: java.lang.Exception -> L43
            if (r0 <= 0) goto L30
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Exception -> L43
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L30
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> L43
            X.080U r2 = (X.C080U) r2     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = r2.LIZ     // Catch: java.lang.Exception -> L43
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L17
            java.lang.String r2 = r2.LIZIZ     // Catch: java.lang.Exception -> L43
            goto L31
        L30:
            r2 = r4
        L31:
            if (r2 != 0) goto L34
            return r4
        L34:
            java.util.regex.Matcher r1 = r5.matcher(r2)     // Catch: java.lang.Exception -> L45
            boolean r0 = r1.find()     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L4a
            java.lang.String r4 = r1.group()     // Catch: java.lang.Exception -> L45
            return r4
        L43:
            r0 = move-exception
            goto L47
        L45:
            r0 = move-exception
            r4 = r2
        L47:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222771Bz9.LJFF(X.0X52):java.lang.String");
    }

    public static String LJI(String str, List list) {
        String str2 = null;
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    str2 = c080u.LIZIZ;
                }
            }
        }
        return str2;
    }

    public static void LJIIIZ(C0X52 c0x52, C1333970kol c1333970kol) {
        String str;
        String[] strArrSplit;
        String strLJI = LJI("ImageX-Demotion", c0x52.LIZ.LIZLLL);
        if (strLJI == null) {
            strLJI = "undefined";
        }
        c1333970kol.LJIILJJIL = strLJI;
        String strLJI2 = LJI("ImageX-Fmt", c0x52.LIZ.LIZLLL);
        if (strLJI2 != null && (strArrSplit = strLJI2.split("2")) != null && strArrSplit.length > 0) {
            c1333970kol.LJIILL = strArrSplit[0];
            if (strArrSplit.length > 1) {
                c1333970kol.LJIILLIIL = strArrSplit[1];
            } else {
                c1333970kol.LJIILLIIL = "undefined";
            }
        } else {
            c1333970kol.LJIILL = "undefined";
            c1333970kol.LJIILLIIL = "undefined";
        }
        if (!"undefined".equals(c1333970kol.LJIILL) && !"undefined".equals(c1333970kol.LJIILLIIL)) {
            if (c1333970kol.LJIILL.equalsIgnoreCase(c1333970kol.LJIILLIIL)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1333970kol.LJIIZILJ = str;
        } else {
            c1333970kol.LJIIZILJ = "-1";
        }
        String strLJI3 = LJI("x-imagex-extra", c0x52.LIZ.LIZLLL);
        if (strLJI3 == null) {
            strLJI3 = "";
        }
        c1333970kol.LJIILIIL = strLJI3;
        String strLJI4 = LJI("x-imagex-blurhash", c0x52.LIZ.LIZLLL);
        if (!TextUtils.isEmpty(strLJI4)) {
            try {
                C1318160kPG c1318160kPG = ((C1333990kon) c1333970kol).LJIJI;
                WeakReference<InterfaceC1336190ksL> weakReferenceLIZ = C720190SMv.LIZ(c1333970kol.LJFF);
                if (weakReferenceLIZ != null && weakReferenceLIZ.get() != null) {
                    weakReferenceLIZ.get().LIZIZ(strLJI4, c1318160kPG);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAsyncResponse: blurhash exception is ");
                sbLIZ.append(e);
                C1328570kg3.LIZIZ("TTNetImageFetcher", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:28:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[Catch: JSONException -> 0x0047, TryCatch #0 {JSONException -> 0x0047, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0012, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x0030, B:19:0x0038, B:21:0x003e, B:23:0x0043, B:15:0x002d, B:8:0x0017), top: B:28:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(org.json.JSONObject r10, X.C1333970kol r11) {
        /*
            long r1 = r11.LIZIZ     // Catch: org.json.JSONException -> L47
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "queue_time"
            r3 = -1
            if (r0 == 0) goto L17
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L17
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L1a
        L17:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L1a:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "fetch_time"
            if (r0 == 0) goto L2d
            long r5 = r11.LIZIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            goto L30
        L2d:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
        L30:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L47
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r7 = "total_time"
            if (r0 == 0) goto L43
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L47
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L43
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L47
            return
        L43:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L47
            return
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222771Bz9.LJIIL(org.json.JSONObject, X.0kol):void");
    }

    public static void LJIILJJIL(Uri uri, List list) {
        String str;
        C1516280pYo c1516280pYo;
        Boolean boolLJI;
        int i;
        if (C278980Awa.LIZ() != 0) {
            int iLIZ = C278980Awa.LIZ();
            int i2 = 1;
            if (iLIZ == 1) {
                str = "prefer_ip";
            } else if (iLIZ == 2) {
                str = "backup_ip";
            } else {
                return;
            }
            C1516490pZ9 value = C1516490pZ9.LIZIZ.getValue();
            String host = uri.getHost();
            value.getClass();
            if (!TextUtils.isEmpty(host) && (c1516280pYo = value.LIZ.get(host)) != null) {
                try {
                    if (c1516280pYo.LIZ() || (((Boolean) C278990Awb.LIZ.getValue()).booleanValue() && !TextUtils.isEmpty(c1516280pYo.LIZ) && c1516280pYo.LIZIZ != null)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(str, c1516280pYo.LIZ);
                        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                        if ((c2213981Bky.isOffline() || C841760X0k.LIZ() || Intrinsics.LJFF(c2213981Bky.getChannel(), "live_inhouse") || c2213981Bky.isRegressionTest()) && (boolLJI = C2222891BzL.LIZ.LJI()) != null) {
                            if (boolLJI.booleanValue()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            jSONObject.put("dns_cache_failed", i);
                            jSONObject.put("local_dns_failed", i);
                            jSONObject.put("http_dns_failed", i);
                        }
                        ((LinkedList) list).add(new C080U("x-ttnet-dns-config", C786410Ut5.J3(jSONObject)));
                        int i3 = C2187451AjH.LIZ;
                        C1330590kjJ.LIZIZ("TTNetImageFetcher", "ipKey " + str + ", host: " + uri.getHost() + ", uri: " + uri + " ip list:" + c1516280pYo.LIZ + " extraHeaders: " + list);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("host", uri.getHost());
                    if (!c1516280pYo.LIZ()) {
                        i2 = 0;
                    }
                    jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
                    if (!TextUtils.isEmpty(c1516280pYo.LIZ)) {
                        jSONObject2.put("ipListLength", c1516280pYo.LIZ.split(",").length);
                    }
                    C793770VBv.LJII("m2_feed_image_dns_opt_valid", jSONObject2, null, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // X.InterfaceC1334000koo
    public final void LIZ(C1333990kon c1333990kon, C1335880krq c1335880krq) {
        ImageDownloaderApi imageDownloaderApi;
        boolean z;
        Map<String, String> map;
        InterfaceC2222831BzF interfaceC2222831BzF = this.LIZIZ;
        if (interfaceC2222831BzF != null) {
            interfaceC2222831BzF.LIZ();
        }
        c1333990kon.LIZ = System.currentTimeMillis();
        C1333910kof c1333910kof = c1333990kon.LJIIIIZZ;
        if (c1333910kof instanceof InterfaceC1339010kwt) {
            this.LIZJ = c1333910kof;
        }
        Uri uri = c1333990kon.LJFF;
        if (uri == null) {
            return;
        }
        String strLIZIZ = this.LIZLLL.LIZIZ(uri.toString());
        if (C2093608Ic.LJ(strLIZIZ)) {
            return;
        }
        Uri uri2 = c1333990kon.LJFF;
        int i = 0;
        if (uri2 != null && (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "x-expires") == null ? !(!C1E2X.LIZ() || !C1332270km1.LIZJ(c1333990kon.LJFF)) : C1332270km1.LIZIZ(c1333990kon.LJFF))) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1333990kon.LJFF, "refresh_token");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1333990kon.LJFF, "im-url-refresh");
            boolean zLIZ = C289130BUx.LIZ();
            boolean zBooleanValue = ((Boolean) C1E2X.LIZJ.getValue()).booleanValue();
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (zLIZ || (zBooleanValue && TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "public-video-cover")))) {
                this.LJI.getValue().add(c1333990kon.LIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://api-va.tiktokv.com/image/refresh/?target=");
                sbLIZ.append(URLEncoder.encode(strLIZIZ));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                boolean zBooleanValue2 = ((Boolean) C1E2X.LJ.getValue()).booleanValue();
                if ((C1E2X.LIZ() && (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "private-image") || TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "private-video-cover"))) || (zBooleanValue2 && TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "sticker"))) {
                    this.LJI.getValue().add(c1333990kon.LIZLLL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("https://api-va.tiktokv.com/tiktok/v1/im/image/refresh/?target=");
                    sbLIZ2.append(URLEncoder.encode(strLIZIZ));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.isOffline() || C841760X0k.LIZ() || Intrinsics.LJFF(c2213981Bky.getChannel(), "live_inhouse") || c2213981Bky.isRegressionTest()) {
            C2222891BzL c2222891BzL = C2222891BzL.LIZ;
            if (c2222891BzL.LJIIIIZZ()) {
                strLIZIZ = c2222891BzL.getTTMockFakeImgUrl();
            }
        }
        try {
            Map<String, String> map2 = c1333990kon.LJIIJJI;
            C1537890q7f.LIZ.getClass();
            if (map2 == C1537890q7f.LIZIZ && strLIZIZ != null && !strLIZIZ.trim().isEmpty()) {
                SecureRandom secureRandom = C828590Wev.LIZ;
                strLIZIZ = C828590Wev.LIZJ(strLIZIZ, C2222891BzL.LIZ.LJIILL(Boolean.FALSE, strLIZIZ, c1333990kon.LJIIJJI));
            }
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(strLIZIZ, linkedHashMap);
            String str = (String) pairLIZJ.first;
            String str2 = (String) pairLIZJ.second;
            synchronized (C1339000kws.LIZ()) {
            }
            INetworkApi iNetworkApi = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str);
            if (C839620Wwi.LIZ) {
                imageDownloaderApi = (ImageDownloaderApi) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).LIZ(str).create(ImageDownloaderApi.class);
            } else {
                imageDownloaderApi = null;
            }
            this.LJFF = new C1339030kwv(c1333990kon.LJIIJ);
            Map<String, String> map3 = c1333990kon.LJIIIZ;
            if (map3 != null && map3.remove("__NO_COOKIE") != null) {
                z = true;
            } else {
                z = false;
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("tt_image_remove_cookie_enable", false) && z) {
                this.LJFF.LJIJI = true;
            }
            LinkedList linkedList = new LinkedList();
            LJIILJJIL(uri, linkedList);
            if (((Boolean) C286590BLd.LIZ.getValue()).booleanValue() && (map = c1333990kon.LJIIIZ) != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    linkedList.add(new C080U(entry.getKey(), entry.getValue()));
                }
            }
            if (!C839620Wwi.LIZ) {
                linkedList.add(C2222891BzL.LIZ.LJIILLIIL());
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("request image url = ");
            sbLIZ3.append(strLIZIZ);
            C1330590kjJ.LIZJ("TTNetImageFetcher", "fetchData", C2188811AlT.LIZIZ(sbLIZ3));
            boolean zLIZ2 = ((I3rdNetworkIdentifier) ServiceManager.get().getService(I3rdNetworkIdentifier.class)).LIZ(strLIZIZ);
            if (imageDownloaderApi != null && zLIZ2) {
                if (((Boolean) C0DJU.LIZ.getValue()).booleanValue()) {
                    LIZLLL(c1333990kon.LJI, new PriorityDownloadAdapter((I3rdPriorityDownloadImage) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).LIZ(str).create(I3rdPriorityDownloadImage.class)), str2, linkedHashMap, linkedList);
                    return;
                } else {
                    this.LJ = imageDownloaderApi.download(str2, linkedHashMap, linkedList, this.LJFF);
                    return;
                }
            }
            Iterator<T> it2 = ((NetworkTypeConfig) C0X08.LIZIZ.getValue()).privateImageDomainPrefix.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                        break;
                    }
                } else if (C0X07.LIZ(str, str2)) {
                    if (((Boolean) C0AKD.LIZ.getValue()).booleanValue()) {
                        i = 3;
                    }
                } else if (((Boolean) C0AKE.LIZ.getValue()).booleanValue()) {
                    i = 3;
                }
            }
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi(IRetrofitFactory.class);
            if (((Boolean) C0DJU.LIZ.getValue()).booleanValue()) {
                if (iRetrofitFactory != null) {
                    C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str);
                    c1499850p8JCreateBuilder.LJIIIIZZ(i);
                    LIZLLL(c1333990kon.LJI, new PriorityDownloadAdapter((IDownloadImage) c1499850p8JCreateBuilder.build().retrofit.LIZ(IDownloadImage.class)), str2, linkedHashMap, linkedList);
                    return;
                } else {
                    C1339000kws.LIZ().LIZJ();
                    LIZLLL(c1333990kon.LJI, new PriorityDownloadAdapter((IDownloadImage) C1515120pWw.LJIIIZ(IDownloadImage.class, str)), str2, linkedHashMap, linkedList);
                    return;
                }
            }
            if (iRetrofitFactory != null) {
                C1499850p8J c1499850p8JCreateBuilder2 = iRetrofitFactory.createBuilder(str);
                c1499850p8JCreateBuilder2.LJIIIIZZ(i);
                this.LJ = ((INetworkApi) c1499850p8JCreateBuilder2.build().retrofit.LIZ(INetworkApi.class)).downloadFile(false, -1, str2, linkedHashMap, linkedList, this.LJFF);
            } else if (iNetworkApi != null) {
                this.LJ = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, this.LJFF);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!C2213981Bky.LIZIZ.isDebug()) {
                LJIIJ(null, c1333990kon, e, 0L, 0L);
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("request failed, @liujian.android ");
            sbLIZ4.append(e);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    @Override // X.InterfaceC1334000koo
    public final void LIZIZ(C1333990kon c1333990kon, C1335880krq c1335880krq) {
        if (this.LJ != null && c1333990kon != null) {
            this.LJ.enqueue(new C1339110kx3(this, c1333990kon, c1335880krq));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0004, B:10:0x001c, B:6:0x0010, B:8:0x0014, B:12:0x0022), top: B:17:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.InterfaceC1335890krr r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L34
            if (r4 == 0) goto L10
            java.lang.String r1 = "request canceled"
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L30
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L1c
        L10:
            X.0X9S<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.LJ     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L22
            X.0X9S<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.LJ     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.isCanceled()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L22
        L1c:
            X.0krq r3 = (X.C1335880krq) r3     // Catch: java.lang.Throwable -> L30
            r3.LIZ()     // Catch: java.lang.Throwable -> L30
            return
        L22:
            X.0krq r3 = (X.C1335880krq) r3     // Catch: java.lang.Throwable -> L30
            X.0kk2 r0 = r3.LIZ     // Catch: java.lang.Throwable -> L30
            X.0kfx r0 = (X.C1328510kfx) r0     // Catch: java.lang.Throwable -> L30
            X.0kfw r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L30
            X.0kgE r0 = r0.LIZ     // Catch: java.lang.Throwable -> L30
            r1.LJFF(r0, r4)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222771Bz9.LJIIIIZZ(X.0krr, java.lang.Throwable):void");
    }

    public final void LJIILIIL(C1333970kol c1333970kol, boolean z) {
        int i;
        if (c1333970kol != null && !TextUtils.isEmpty(c1333970kol.LIZLLL) && this.LJI.getValue().contains(c1333970kol.LIZLLL)) {
            this.LJI.getValue().remove(c1333970kol.LIZLLL);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
                if (z) {
                    jSONObject2.put("duration", c1333970kol.LIZJ - c1333970kol.LIZ);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C793770VBv.LJII("m2_expired_url_redirect", jSONObject, jSONObject2, null);
        }
    }

    public static void LJII(C1494850p0F c1494850p0F, List list, C1339030kwv c1339030kwv, Exception exc) {
        if (c1494850p0F == null) {
            return;
        }
        try {
            if (!C2093608Ic.LJ(c1494850p0F.LJIJ)) {
                return;
            }
            String strLIZJ = null;
            if (list != null && list.size() > 0) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C080U c080u = (C080U) it2.next();
                    if ("x-net-info.remoteaddr".equalsIgnoreCase(c080u.LIZ)) {
                        strLIZJ = c080u.LIZIZ;
                    }
                }
            }
            if (C2093608Ic.LJ(strLIZJ) && c1339030kwv != null) {
                strLIZJ = c1339030kwv.LIZ;
            }
            if (C2093608Ic.LJ(strLIZJ)) {
                strLIZJ = AbstractC1339120kx4.LIZJ(exc);
            }
            if (C2093608Ic.LJ(strLIZJ)) {
                return;
            }
            c1494850p0F.LJIJ = strLIZJ;
            T t = c1494850p0F.LIZJ;
            if (t != 0) {
                t.LIZ = strLIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(EnumC1334360kpO enumC1334360kpO, PriorityDownloadAdapter priorityDownloadAdapter, String str, Map<String, String> map, List<C080U> list) {
        if (enumC1334360kpO == EnumC1334360kpO.IMMEDIATE) {
            this.LJ = priorityDownloadAdapter.downloadFileForImmediate(false, -1, str, map, list, this.LJFF);
            return;
        }
        if (enumC1334360kpO == EnumC1334360kpO.HIGH) {
            this.LJ = priorityDownloadAdapter.downloadFileForHigh(false, -1, str, map, list, this.LJFF);
        } else if (enumC1334360kpO == EnumC1334360kpO.LOW) {
            this.LJ = priorityDownloadAdapter.downloadFileForLow(false, -1, str, map, list, this.LJFF);
        } else {
            this.LJ = priorityDownloadAdapter.downloadFileForNormal(false, -1, str, map, list, this.LJFF);
        }
    }

    public final void LJIIJ(C0X52 c0x52, C1333970kol c1333970kol, Throwable th, long j, long j2) {
        long j3;
        String string;
        C1494850p0F c1494850p0F;
        List<C080U> list;
        long j4 = j2;
        if (c1333970kol != null) {
            try {
                String[] strArr = new String[1];
                if (c0x52 != null && (list = c0x52.LIZ.LIZLLL) != null) {
                    try {
                        if (list.size() > 0) {
                            for (C080U c080u : list) {
                                if ("x-net-info.remoteaddr".equals(c080u.LIZ)) {
                                    strArr[0] = c080u.LIZIZ;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (C2093608Ic.LJ(strArr[0])) {
                    strArr[0] = AbstractC1339120kx4.LIZJ(th);
                }
                j3 = c1333970kol.LIZ;
                if (j > 0) {
                    j4 = j;
                }
                string = null;
                if (C2093608Ic.LJ(null)) {
                    if (c0x52 != null) {
                        string = c0x52.LIZ.LIZ;
                    } else {
                        string = c1333970kol.LJFF.toString();
                    }
                }
                if (th != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception for ttnet response url = ");
                    sbLIZ.append(string);
                    sbLIZ.append(" exception = ");
                    sbLIZ.append(th.toString());
                    sbLIZ.append(" stackTrace:: ");
                    sbLIZ.append(Arrays.toString(th.getStackTrace()));
                    C1330590kjJ.LJFF("TTNetImageFetcher", "handleException$0", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (th instanceof C1494690ozz) {
                    C1494600ozq requestInfo = ((C1494690ozz) th).getRequestInfo();
                    if (requestInfo instanceof C1494850p0F) {
                        c1494850p0F = (C1494850p0F) requestInfo;
                    } else {
                        c1494850p0F = new C1494850p0F();
                        c1494850p0F.LJJIFFI = 0;
                        c1494850p0F.LJJIIJ = ((C1494690ozz) th).getRequestLog();
                    }
                } else {
                    c1494850p0F = new C1494850p0F();
                }
                c1494850p0F.LJIJ = strArr[0];
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                InterfaceC2222831BzF interfaceC2222831BzF = this.LIZIZ;
                if (interfaceC2222831BzF != null) {
                    interfaceC2222831BzF.LIZIZ(j4, j3, string, c1494850p0F, LJ(th), null);
                }
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIJJI(C0X52 c0x52, C1333970kol c1333970kol, Throwable th, C1494850p0F c1494850p0F, int i, long j, long j2) {
        long j3 = j2;
        if (c1333970kol != null) {
            try {
                long j4 = c1333970kol.LIZ;
                if (j > 0) {
                    j3 = j;
                }
                String string = null;
                if (C2093608Ic.LJ(null)) {
                    if (c0x52 != null) {
                        string = c0x52.LIZ.LIZ;
                    } else {
                        string = c1333970kol.LJFF.toString();
                    }
                }
                if (th != null) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception for ttnet response url = ");
                    sbLIZ.append(string);
                    sbLIZ.append(" exception = ");
                    sbLIZ.append(th.toString());
                    sbLIZ.append(" stackTrace:: ");
                    sbLIZ.append(Arrays.toString(th.getStackTrace()));
                    C1330590kjJ.LJFF("TTNetImageFetcher", "handleException$1", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1334060kou c1334060kou = new C1334060kou();
                c1334060kou.LIZ = c0x52;
                if (this.LIZJ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c1333970kol.LIZLLL);
                    jSONObject.put("retryCount", i);
                    this.LIZJ.LIZ(j3, j4, c1334060kou, c1494850p0F, LJ(th), jSONObject);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
